package JavaDay15_9_15;

public class Test1 {
    public static void main(String[] args) {
        StringExe01 stringExe01 = new StringExe01();
        stringExe01.change(stringExe01.str, stringExe01.ch);
        System.out.println(stringExe01.str+"and");
        System.out.println(stringExe01.ch);
    }
}
class StringExe01{
    String str=new String("zhao");
    final char[] ch={'j','a','v','a'};
    public void change(String str,char ch[]){
        str="java";
        ch[0]='h';

    }
}