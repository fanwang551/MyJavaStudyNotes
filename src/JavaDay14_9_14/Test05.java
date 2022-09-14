package JavaDay14_9_14;

public class Test05 {
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Horse());
        person.common();
        person.passRiver();
    }
}
interface Vehicles{
     void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况下骑马");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("过河时，骑龟");
    }
}
class VehiclesCompany{
    public static  Horse getHorse(){
        return new Horse();
    }
        public static Boat getBoat(){
          return new Boat();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver() {
        //Boat boat = VehiclesCompany.getBoat();
        //boat.work();
        if(!(vehicles instanceof Boat)){
            vehicles=VehiclesCompany.getBoat();
        }
        vehicles.work();
    }
public void common(){
        //vehicles=null 时，获取horse
        if(!(vehicles instanceof Horse)) {
           vehicles = VehiclesCompany.getHorse();
        }
    vehicles.work();
}
}