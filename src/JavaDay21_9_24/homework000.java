package JavaDay21_9_24;

import org.junit.jupiter.api.Test;

import java.util.*;

public class homework000 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1",new User(1,5,"zhao"));
        userDAO.save("2",new User(3,15,"zha"));
        userDAO.save("3",new User(2,25,"zh"));
        List<User> list = userDAO.list();
        System.out.println(list);
    }
}
class DAO<T>{
private Map<String,T> map=new HashMap<>();
public T get (String id){
    return map.get(id);
}
public void save(String id,T entity){
    map.put(id, entity);
}
public void update(String id,T entity){
    map.put(id, entity);
}
public List<T> list(){
    List<T> list = new ArrayList<>();
   // Set<String> keySet = map.keySet();
    /*
    for (String key  :keySet) {
        list.add(map.get(key));
    }
    return list;*/
    Collection<T> values = map.values();
    for (T value :values) {
        list.add(value);
    }
return list;

}
public void delete(String id){
    map.remove(id);
}
}
class User{
    private int id;
    private int age;
    private  String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}