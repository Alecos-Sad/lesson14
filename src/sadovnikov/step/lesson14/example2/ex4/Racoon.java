package sadovnikov.step.lesson14.example2.ex4;

public class Racoon extends Creature {


    public void breath() {
        System.out.println("Breath atmosphere");
    }

    @Override
    public void move() {
        System.out.println("Шевелю лапами");
    }


}
