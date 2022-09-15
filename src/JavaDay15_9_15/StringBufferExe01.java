package JavaDay15_9_15;

public class StringBufferExe01 {
    public static void main(String[] args) {
        String price="12345567.0938";
        StringBuffer stringBuffer = new StringBuffer(price);
        for (int i = stringBuffer.lastIndexOf(".")-3;
             i >0 ; i-=3) {
            stringBuffer=stringBuffer.insert(i,",");
        }
        System.out.println(stringBuffer);
    }
}
