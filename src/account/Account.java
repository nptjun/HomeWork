package account;

import java.util.Scanner;

public class Account {
    int cid;
    double balance;
    String Customername;
    public void getinfo(){
        System.out.println("卡号："+cid+"\n"+"余额："+balance+"\n"+"所属用户："+Customername+"\n");
    }public void withdraw(){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入取钱金额");
        double getba=scan.nextDouble();
        if (getba<=balance){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
