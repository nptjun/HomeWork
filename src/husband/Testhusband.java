package husband;

import husband.Husband;
import husband.Wife;

public class Testhusband {
    public static void main(String[] args) {
        Husband husband=new Husband();
        Wife wife=new Wife();

        husband.name="张三";
        husband.age=40;
        wife.name="李四";
        wife.age=38;
        husband.wife=wife;
        wife.husband=husband;

        husband.getinto();
        wife.getinto();
    }
}
