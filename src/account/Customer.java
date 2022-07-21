package account;

import java.util.Scanner;

public class Customer {
    Scanner scan=new Scanner(System.in);
    String name;
    int idnumber;
    int tel;
    String address;
    public void say(){
        System.out.println("请输入姓名：");
        name=scan.next();
        System.out.println("请输入身份证号：");
        idnumber=scan.nextInt();
        System.out.println("请输入联系电话：");
        tel=scan.nextInt();
    }
}
