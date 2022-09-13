package JavaDay13_9_13;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

       /*Bell bell= new Bell(){
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        }*/
        iphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        });
        iphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });
    }
}
interface Bell{
    public void ring();
}
class Iphone {
    public void alarmClock(Bell bell){
        System.out.println(bell.getClass());
        //动态绑定
        bell.ring();
    }
}