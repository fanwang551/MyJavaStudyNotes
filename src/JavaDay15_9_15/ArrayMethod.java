package JavaDay15_9_15;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMethod {
    public static void main(String[] args) {
        Integer[] integers={1,2,59,15};
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer i1=(Integer) o1;
                Integer i2=(Integer) o2;
                return i2-i1;
            }
        });
        System.out.println(Arrays.toString(integers));
    }
}
