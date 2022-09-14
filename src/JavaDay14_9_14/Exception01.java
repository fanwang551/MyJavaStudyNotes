package JavaDay14_9_14;
//程序不应该出现一个不算致命的问题，就导致整个系统崩溃
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //如果程序员，认为一段代码可能出现异常/问题，可以使用 try-catch 异常处理机制来解决
        // 从而保证华程序的健壮性
        // 将该代码块->选中->快捷键 ctrl + alt + t -> 选中 try-catch
        // 如果进行异常处理，那么即使出现了异常，程序可以继续执行
        try {
            int res = num1 / num2;
        } catch (Exception e) {
          //  e.printStackTrace();
            System.out.println("出现异常的原因"+e.getMessage());
        }
        System.out.println("程序继续");
    }
}
