package sadovnikov.step.lesson14.example2;

import sadovnikov.step.lesson14.example2.ex2.Mom;

public class Son extends Dad implements Mom {

    @Override
    public void cleanRoom() {
        System.out.println("подмел");
    }
}
