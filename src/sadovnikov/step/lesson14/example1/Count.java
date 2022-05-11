package sadovnikov.step.lesson14.example1;

public class Count {

    public int count;

    public Count() {
        this.count = 0;
    }

    public void setCount() {
        this.count = ++count;
    }

    public int getCount() {
        return count;
    }
}
