package JavaDay10_9_10;

public class static_learn {
    public static void main(String[] args) {
        int count=0;
        Monster monster = new Monster("wang");
        monster.join();
        monster.count++;
        Monster monster1 = new Monster("zhao");
        monster1.join();
        Monster monster2 = new Monster("qian");
        monster2.join();
        monster2.count++;
        System.out.println("共有"+monster.count+"加入游戏");

        System.out.println("monster1.count="+monster1.count);
        System.out.println("monster2.count="+monster2.count);
    }
}
