package JavaDay14_9_14;

import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
double res=cal(n1,n2);
            System.out.println("res="+res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("参数形式不对");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }
    }
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}
