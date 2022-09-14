package JavaDay14_9_14;

public class Test07 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
     green.show();
        //switch()z中放入枚举对象
        //在case后，直接写上在枚举中定义的枚举对象即可
        switch (green){
            case RED:
                System.out.println("红色");
            case BLUE:
                System.out.println("蓝色");
            case BLACK:
                System.out.println("黑色");
            case GREEN:
                System.out.println("绿色");
            case YELLOW:
                System.out.println("黄色");
        }
    }
}
interface MyInterface{
    public void show();


}
enum Color implements MyInterface {
   RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值"+redValue+","+greenValue+","+blueValue);
    }
}
