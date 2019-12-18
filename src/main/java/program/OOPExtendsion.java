package program;

public class OOPExtendsion {
    public static void main(String[] args) {
        Cat c = new Cat("kisa", 12, 12);
        c.sound();
        Tiger t = new Tiger("tigra", 12, 2121);
        t.sound();
        Cat ct = new Tiger("potomok", 12, 1000);
        ct.sound();
    }
}

class Cat {
    protected String name;
    protected int length;
    protected double weigth;

    public Cat() {
    }

    public Cat(String name, int length, double weigth) {
        this.name = name;
        this.length = length;
        this.weigth = weigth;
    }

    void sound() {
        System.out.println("myau");
    }

    protected double agressive() {
        return this.length * this.weigth / 100;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weigth=" + weigth +
                '}';
    }
}

class Tiger extends Cat {
    public Tiger(String name, int length, double weigth) {
        super(name, length, weigth);
    }

    void sound() {
        System.out.println("rrrr");
    }
    @Override
    protected double agressive() {
        return super.agressive();
    }
}
