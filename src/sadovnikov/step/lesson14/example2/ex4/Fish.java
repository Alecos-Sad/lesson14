package sadovnikov.step.lesson14.example2.ex4;

public class Fish extends Creature{

    @Override
    public void breath() {
        System.out.println("Breath in water");
    }

    @Override
    public void move() {
        System.out.println("Двигаю хвостом и плыву");
    }
}
