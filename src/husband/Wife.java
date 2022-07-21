package husband;

import husband.Husband;

public class Wife {
    String name;
    int age;
    Husband husband;
    public void getinto(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("丈夫姓名："+husband.name);
        System.out.println("丈夫年龄："+husband.age);
    }
}
