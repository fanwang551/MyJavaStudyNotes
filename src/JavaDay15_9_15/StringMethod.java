package JavaDay15_9_15;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        //1.toUpperCase转换大写
        String s="heLLo";
        System.out.println(s.toUpperCase());
        //2.toLowerCase转成小写
        System.out.println(s.toLowerCase());
        //3.concat拼接
        String s1="WORLD";
        s1=s.concat(" ").concat(s1);
        System.out.println(s1);
        //4.replace替换
        String s2="q w e r q w eeeeeeee";
        String s21=s2.replace("e","a");
        System.out.println(s21);
        // 5.split 分割字符串, 对于某些分割字符，我们需要 转义比如 |// \\等
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        // 1. 以 , 为标准对 poem 进行分割 , 返回一个数组
        // 2. 在对字符串进行分割时，如果有特殊字符，需要加入 转义符 \
        String[] split=poem.split(",");
        poem="E:\\aaa\\bbb";
        split=poem.split("\\\\");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
