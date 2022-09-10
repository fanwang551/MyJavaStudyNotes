package JavaDay10_9_10;

public class Monster {
    private String name;
    //定义一个静态变量（类变量），特点是 会被所有的Monster类的对象实例共享
    static int count=0;

    public Monster(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name+"加入游戏");
    }
}
