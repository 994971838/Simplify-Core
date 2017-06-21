package cn.xxywithpq.json.codec;

import cn.xxywithpq.common.Const;
import cn.xxywithpq.json.IJson;
import cn.xxywithpq.json.serializer.AbstractSerializer;

import java.util.Collection;
import java.util.StringJoiner;

/**
 * Collection 解析器
 * Created by panqian on 2017/6/6.
 */
public class CollectionCodec extends AbstractSerializer implements IJson {

    StringJoiner sj;

    @Override
    public Object writeJsonString(Object o) {
        sj = new StringJoiner(Const.COMMA, Const.PRE_BRACKET, Const.POST_BRACKET);
        Collection c = (Collection) o;
        collectionHandle(sj, c);
        return sj.toString();
    }

    @Override
    public Object parse(Object o) {
        return null;
    }
}
