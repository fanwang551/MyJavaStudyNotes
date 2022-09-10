package JavaDay10_9_10;

public class Main_learn {

    private static String name = "java study";
        private int age = 20;

        public static void hi() {
            System.out.println("main01的hi方法");
        }

        public void cry() {
            System.out.println("main01的cry方法");
        }

    public static void main(String[] args) {
        //可以直接使用name
        System.out.println("name=" + name);
        hi();
        //不能访问非静态方法
      //  System.out.println("age="+age);
       // cry();
        //3. 静态方法 main 要访问本类的非静态成员，需要先创建对象 , 再调用即可
        Main_learn main_learn = new Main_learn();
        System.out.println(main_learn.age);
        main_learn.cry();
    }

}