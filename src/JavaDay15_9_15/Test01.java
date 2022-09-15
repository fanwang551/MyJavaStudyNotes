package JavaDay15_9_15;

public class Test01 {
    public static void main(String[] args) {
        String str="abcdef";
        str=reverse(str,1,4);
        System.out.println(str);
    }
    //字符串反转
    public static String reverse(String str,int start,int end){
        char[] chars=str.toCharArray();
        char temp=' ';
        for (int i=start,j=end;i<j;i++,j--){
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }
        return new String(chars);

    }
}
