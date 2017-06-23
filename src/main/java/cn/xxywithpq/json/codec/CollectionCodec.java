package cn.xxywithpq.json.codec;

import cn.xxywithpq.common.Const;
import cn.xxywithpq.json.AbstractJson;
import cn.xxywithpq.json.IJson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;
import java.util.StringJoiner;

/**
 * Collection 解析器
 * Created by panqian on 2017/6/6.
 */
public class CollectionCodec extends AbstractJson implements IJson {

    StringJoiner sj;

    @Override
    public Object writeJsonString(Object o) {
        sj = new StringJoiner(Const.COMMA, Const.PRE_BRACKET, Const.POST_BRACKET);
        Collection c = (Collection) o;
        collectionHandle(sj, c);
        return sj.toString();
    }

    @Override
    public Object parse(Object o, Type[] trueType) {
        ArrayList<Object> al = (ArrayList) o;
        if (null != al && al.size() > 0) {
            ListIterator<Object> iterator = al.listIterator();
            while (iterator.hasNext()) {
                Object next = iterator.next();
                IJson suitableHandler = getSuitableParseHandler(next.getClass(), trueType);
                Object parse = suitableHandler.parse(next, trueType);
                iterator.set(parse);
            }
        }
        return al;
    }
}
