package JavaDay10_9_10;
//场景：如果多个构造器中都有重复语句，可以抽取到代码块中，调高代码的重复性
//三个构造器中都有相同的语句则帮相同的代码放在一个代码块中；代码块调用的顺序优先于构造器
public class codeBlock {
    public static void main(String[] args) {
        Movie movie = new Movie("THOR 4");
        Movie movie1 = new Movie("thor 4",30);
    }
}
class Movie{
    private String name;
    private double price;
    private String time;

    //代码块
    {
        System.out.println("电影打开");
        System.out.println("广告");
    }
    public Movie(String name) {
        System.out.println("一个参数的构造器被调用");
       // System.out.println("电影打开");
       // System.out.println("广告");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("两个参数的构造器被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }
}