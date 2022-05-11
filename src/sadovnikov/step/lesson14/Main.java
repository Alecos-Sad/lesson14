package sadovnikov.step.lesson14;

import sadovnikov.step.lesson14.example1.Count;
import sadovnikov.step.lesson14.example2.Child;
import sadovnikov.step.lesson14.example2.Doughter;
import sadovnikov.step.lesson14.example2.Son;
import sadovnikov.step.lesson14.example2.ex2.GrandMa;
import sadovnikov.step.lesson14.example2.ex2.Mom;
import sadovnikov.step.lesson14.example2.ex4.Creature;
import sadovnikov.step.lesson14.example2.ex4.Dolphin;
import sadovnikov.step.lesson14.example2.ex4.Fish;
import sadovnikov.step.lesson14.example2.ex4.Racoon;

public class Main {

    public static void main(String[] args) {

        Count count = new Count();

        for (int i = 0; i < 3; i++) {
            count.setCount();
        }
        System.out.println(count.getCount());
        count.count = 50;

        for (int i = 0; i < 3; i++) {
            count.setCount();
        }
        System.out.println(count.getCount());

        Child child = new Child();
        child.setName("child");

        Son son = new Son();
        son.cleanRoom();
        son.doWork();
        GrandMa doughter = new Doughter();
        doughter.cleanRoom();
        doughter.cook();


        Creature fish = new Fish();
        Creature racoon = new Racoon();
        Creature dolphin = new Dolphin();


        Creature[] array = new Creature[3];
        array[0] = fish;
        array[1] = racoon;
        array[2] = dolphin;

        for (Creature creature : array){
            creature.move();
            creature.breath();
        }
    }
}
