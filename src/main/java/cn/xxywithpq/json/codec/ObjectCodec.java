package cn.xxywithpq.json.codec;

import cn.xxywithpq.common.Const;
import cn.xxywithpq.json.serializer.AbstractSerializer;
import cn.xxywithpq.json.serializer.ISerializer;
import cn.xxywithpq.json.serializer.JsonSerializer;
import cn.xxywithpq.utils.ReflectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.*;
import java.util.logging.Logger;

/**
 * Object 解析器
 * Created by panqian on 2017/6/8.
 */
public class ObjectCodec extends AbstractSerializer implements ISerializer {

    private static Logger logger = Logger.getLogger(JsonSerializer.class.getName());

    StringJoiner sj;

    private String serializerObject(Object o) {
        sj = new StringJoiner(Const.COMMA, Const.PRE_BRACE, Const.POST_BRACE);
        Class<?> cClass = o.getClass();

        //查找该类所有声明的方法（除Object）
        List<Method> allDeclaredMethods = ReflectionUtils.getAllDeclaredMethods(cClass);

        //筛选public get方法
        ArrayList<Method> publicGetMethods = new ArrayList<>();
        if (null != allDeclaredMethods && allDeclaredMethods.size() > 0) {
            for (Method m : allDeclaredMethods) {
                String modifier = ReflectionUtils.getModifier(m);
                if (modifier.contains(Const.PUBLIC) && m.getName().contains(Const.GET)) {
                    publicGetMethods.add(m);
                }
            }
        }

        if (null != publicGetMethods && publicGetMethods.size() > 0) {

            Collections.sort(publicGetMethods, (x, y) -> Collator.getInstance().compare(x.getName(), y.getName()));
            for (Method method : publicGetMethods) {
                String name = method.getName();
                String substring = name.substring(3, name.length());
                char c = substring.charAt(0);
                if (c >= 'A' && c <= 'Z') {
                    Character b = (char) (c + 32);
                    String key = b.toString().concat(substring.substring(1, substring.length()));
                    try {
                        Object invoke = method.invoke(o);
                        if (Objects.nonNull(invoke)) {
                            sj.add(Const.SINGLE_QUOTES + key + Const.SINGLE_QUOTES + Const.COLON + JsonSerializer.getInstance().convertToJsonString(invoke));
                        }
                    } catch (IllegalAccessException e) {
                        logger.severe(e.getMessage());
                    } catch (InvocationTargetException e) {
                        logger.severe(e.getMessage());
                    }
                }
            }
        }

        return sj.toString();
    }


    @Override
    public Object writeJsonString(Object o) {
        String result = serializerObject(o);
        return result;
    }
}
