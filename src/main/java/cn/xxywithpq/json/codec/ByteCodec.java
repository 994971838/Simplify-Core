package cn.xxywithpq.json.codec;

import cn.xxywithpq.json.IJson;
import cn.xxywithpq.json.serializer.AbstractSerializer;

/**
 * Byte 解析器
 * Created by panqian on 2017/6/6.
 */
public class ByteCodec extends AbstractSerializer implements IJson {

    StringBuffer sb;

    @Override
    public Object writeJsonString(Object o) {
        Byte b = (Byte) o;
        sb = new StringBuffer(1);
        numberHandle(sb, b);
        return sb.toString();
    }

    @Override
    public Object parse(Object o) {
        return null;
    }
}
