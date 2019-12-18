package program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class OOPAbstract {
    public static void main(String[] args) {
        Human g = new Girl("lada", 23, "russian", false);
        System.out.println(g.colorOfEyes());

    }
}

abstract class Human{
    abstract int age();
    abstract String nationality();
    abstract boolean sex();
    String colorOfEyes(){
        return "brown";
    }
}

class Girl extends Human{
    private String name;
    private int age;
    private String nationality;
    private boolean sex;

    public Girl(String name, int age, String nationality, boolean sex) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.sex = sex;
    }

    @Override
    int age() {
       return this.age;
    }

    @Override
    String nationality() {
        return this.nationality;
    }

    @Override
    boolean sex() {
        return this.sex;
    }

    @Override
    String colorOfEyes() {
        return "blue";
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", sex=" + sex +
                '}';
    }
}

