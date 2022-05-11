package sadovnikov.step.lesson14.example2;

import sadovnikov.step.lesson14.example2.ex2.GrandMa;
import sadovnikov.step.lesson14.example2.ex2.Mom;

public class Doughter implements Mom, GrandMa {

    @Override
    public void cleanRoom() {
        System.out.println("запустила робота");
    }

    @Override
    public void cook() {

    }
}
