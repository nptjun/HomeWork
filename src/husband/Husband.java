package husband;

public class Husband {
    String name;
    int age;
    Wife wife;
    public void getinto(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("妻子姓名："+wife.name);
        System.out.println("妻子年龄："+wife.age);
        System.out.println();
    }
}
