public class Poly_Detail {
    public static void main(String[] args) {
        //向上转型：父类的引用指向子类对象
        //编译类型：animal  运行类型：cat
        Animal animal=new Cat();
        Object object=new Cat();
        //向上转型的规则
        //1.可以调用父类的所有成员（遵守访问权限）
        //2.不能调用子类的特有的成员
        //3.在编译阶段能调用那些成员由编译的类型决定
        //错误  animal.catchMouse();
        //调用子类重写方法,运行类型为cat
        animal.eat();//猫吃鱼

        animal.run();
        animal.sleep();
        animal.show();

        //错误  animal.catchMouse();
        //如果想要调用怎么办
        //多态的向下转型
        //语法：子类类型 引用名 =（子类类型）父类引用;
        Cat cat=(Cat) animal;
        cat.catchMouse();
       Cat cat1= new Cat();
       cat1.catchMouse();
       //要求父类的引用必须指向的是当前目标类型的对象
      //错误 Dog dog=(Dog) animal;

    }
}
