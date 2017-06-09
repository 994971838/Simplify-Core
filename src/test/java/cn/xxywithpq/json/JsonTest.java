package cn.xxywithpq.json;

import cn.xxywithpq.json.Bean.User;
import com.alibaba.fastjson.JSON;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by panqian on 2017/4/8.
 */
public class JsonTest {

    private static Logger logger = Logger.getLogger(Json.class.getName());

    public static void main(String[] args) {

        //String型
        System.out.println("String型 test：");
        String test = "hello world";
        long l2 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(test));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l2));
        long l3 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(test));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l3));

        System.out.println("============================分割线=================================");

        //Boolean型
        System.out.println("Boolean型 test：");
        boolean test1 = true;
        long l4 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(test1));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l4));
        long l5 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(test1));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l5));

        System.out.println("============================分割线=================================");

        //Byte型
        System.out.println("Byte型 test：");
        byte test2 = 'a';
        long l6 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(test2));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l6));
        long l7 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(test2));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l7));

        System.out.println("============================分割线=================================");

        //Double型
        System.out.println("Double型 test：");
        double test3 = 52.325d;
        long l8 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(test3));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l8));
        long l9 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(test3));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l9));

        System.out.println("============================分割线=================================");

        //Float型
        System.out.println("Float型 test：");
        float test4 = 52.325f;
        long l10 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(test4));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l10));
        long l11 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(test4));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l11));

        System.out.println("============================分割线=================================");

        //Char型
        System.out.println("Char型 test：");
        char test5 = 'a';
        long l12 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(test5));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l12));
        long l13 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(test5));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l13));


        System.out.println("============================分割线=================================");

        //Short型
        System.out.println("Short型 test：");
        short test6 = '1';
        long l14 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(test6));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l14));
        long l15 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(test6));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l15));

        System.out.println("============================分割线=================================");

        //Integer型
        System.out.println("Integer型 test：");
        Integer test7 = 1;
        long l16 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(test7));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l16));
        long l17 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(test7));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l17));

        System.out.println("============================分割线=================================");

        //Long型
        System.out.println("Long型 test：");
        long test8 = 1000l;
        long l18 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(test8));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l18));
        long l19 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(test8));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l19));

        System.out.println("============================分割线=================================");

        //带基本类型的Bean
        System.out.println("带基本类型的Bean test：");
        User user = new User();
        user.id = 2l;
        user.setName("panqian");
        long l20 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(user));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l20));
        long l21 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(user));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l21));

        System.out.println("============================分割线=================================");

        //List
        System.out.println("List test：");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        long l22 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(strings));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l22));
        long l23 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(strings));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l23));

        System.out.println("============================分割线=================================");

        //空List
        System.out.println("空List test：");
        ArrayList<String> strings1 = new ArrayList<>();
        long l24 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(strings1));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l24));
        long l25 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(strings1));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l25));

        System.out.println("============================分割线=================================");

        //Set
        System.out.println("Set test：");
        Set<String> strings2 = new HashSet<>();
        strings2.add("a");
        strings2.add("b");
        strings2.add("c");
        long l26 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(strings2));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l26));
        long l27 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(strings2));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l27));

        System.out.println("============================分割线=================================");

        //空Set
        System.out.println("空Set test：");
        Set<String> strings3 = new HashSet<>();
        long l28 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(strings3));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l28));
        long l29 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(strings3));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l29));


        System.out.println("============================分割线=================================");

        //Map
        System.out.println("Map test：");
        Map<String, Object> maps = new HashMap<>();
        maps.put("name", "panqian");
        maps.put("age", 23);
        long l30 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(maps));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l30));
        long l31 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(maps));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l31));

        System.out.println("============================分割线=================================");

        //空Map
        System.out.println("空Map test：");
        Map<String, Object> maps1 = new HashMap<>();
        long l32 = System.currentTimeMillis();
        System.out.println("alibaba:" + JSON.toJSONString(maps1));
        System.out.println("alibaba ==============" + (System.currentTimeMillis() - l32));
        long l33 = System.currentTimeMillis();
        System.out.println("Simplify:" + cn.xxywithpq.json.Json.toJsonString(maps1));
        System.out.println("Simplify ==============" + (System.currentTimeMillis() - l33));

    }
}
