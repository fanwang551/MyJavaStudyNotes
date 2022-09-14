package JavaDay14_9_14;

import java.util.Scanner;

public class TryCatchExercise {
    public static void main(String[] args) {
        /*
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数");
            int n1=scanner.nextInt();
        } catch (Exception e) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数");
            int n1=scanner.nextInt();
        }*/

        //如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止 //思路 //1. 创建 Scanner 对象
        // 2. 使用无限循环，去接收一个输入
        // 3. 然后将该输入的值，转成一个 int
        // 4. 如果在转换时，抛出异常，说明输入的内容不是一个可以转成 int 的内容
        // 5. 如果没有抛出异常，则 break 该循环
        Scanner scanner = new Scanner(System.in);
        int num=0;
        String inputStr="";
        while(true){
            System.out.println("输入一个数");
            inputStr=scanner.next();
            try{
                num=Integer.parseInt(inputStr);
                break;
            }catch (NumberFormatException e){
                System.out.println("输入不是整数");
            }
        }
        System.out.println("你输入的是"+num);
    }
}
