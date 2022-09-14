package JavaDay14_9_14;

public class Exception02 {
    public static void main(String[] args) {
        /*
        //1.NullPointerException 空指针异常 NullPointerException_.java
        // 当应用程序试图在需要对象的地方使用 null 时，抛出该异常
        String name=null;
        System.out.println(name.length());
        */


        //2.ArithmeticException 数学运算异常

        /*3.ArrayIndexOutOfBoundsException 数组下标越界异常 用非法索引访问数组时抛出的异常。
        // 如果索引为负或大于等于数组大小，则该索引为非法索引
        int[] arr={1,2,3};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //4.ClassCastException 类型转换异常 当试图将对象强制转换为不是实例的子类时，抛出该异常。
        //5) NumberFormatException 数字格式不正确异常 当应用程序试图将字符串转换成一种数值类型，
        // 但该字符串不能转换为适当格式时，抛出该异常 => 使用异常我们 可以确保输入是满足条件数字.
    }
}
