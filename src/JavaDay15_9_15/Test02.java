package JavaDay15_9_15;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        String name="ww";
        String pwd="123456";
        String email="123@123.com";
        try {
            userRegister(name,pwd,email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void userRegister(String name,String pwd,String email){
        Scanner scanner = new Scanner(System.in);
        int userLength=name.length();
        if(!(userLength>=2&&userLength<=4)){
            throw new RuntimeException("用户名长度要为2或3或4");
        }
        int pwdLength=pwd.length();
        if(!(pwdLength==6&&isDigital(pwd))){
            throw new RuntimeException("密码长度要为6,全为数字");
        }
        int i=email.indexOf('@');
        int j=email.indexOf('.');
        if(i>0&&j<i){
            throw  new RuntimeException("邮箱中包含. @并且@在.的前面");
        }


    }
    public static boolean isDigital(String str){
        char[] chars=str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]<'0'||chars[i]>'9'){
                return  false;
            }
        }
        return true;
    }
}

