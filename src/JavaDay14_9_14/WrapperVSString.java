package JavaDay14_9_14;
//Integer和String的转换
public class WrapperVSString {
    public static void main(String[] args) {
       //自动装箱
        Integer i=100;
        //方式一
        String str=i+"i";
        //方式二
        String str1=i.toString();
        //方式三
        String str2=String.valueOf(i);


        //String 转为包装类
        String str3="123";
        int i1 = Integer.parseInt(str3);
        Integer integer = new Integer(str3);
        System.out.println(str+" "+str1+" "+str2+" "+integer+" "+i1);
    }
}

