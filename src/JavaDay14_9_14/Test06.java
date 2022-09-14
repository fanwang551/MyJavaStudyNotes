package JavaDay14_9_14;

public class Test06 {
    public static void main(String[] args) {
        Car car = new Car(25);
        car.getAir().flow();
        Car car1 = new Car(-4);
        car1.getAir().flow();
        Car car2 = new Car(45);
        car2.getAir().flow();
    }
}
class Car{
    private double temperature;
    class Air{
        public void flow(){
            if(Car.this.temperature>40){
                System.out.println("吹冷风");
            }
            else if(Car.this.temperature<0){
                System.out.println("吹暖风");
            }
            else {
                System.out.println("空调关闭");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
