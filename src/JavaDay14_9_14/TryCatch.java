package JavaDay14_9_14;

public class TryCatch {
    public static void main(String[] args) {
        int a= 0;
        try {
            String str="wang";
            a = Integer.parseInt(str);
            System.out.println("数字"+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息"+e.getMessage());
        }finally {
            System.out.println("123执行");
        }
        System.out.println("程序继续");
    }
}
