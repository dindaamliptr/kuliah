abstract class LivingThing {
    public void breath() {
        System.out.println("Bernafas melalui hidung.");
    }

    public void eat() {
        System.out.println("Makan melalui mulut.");
    }

    public abstract void walk();
}

class Human extends LivingThing {
    public void walk() {
        System.out.println("Berjalan dengan 2 kaki.");
    }
}

public class Latihan1 {
    public static void main(String[] args) {
        Human manusia = new Human();

        manusia.breath();
        manusia.eat();
        manusia.walk();
    }
}