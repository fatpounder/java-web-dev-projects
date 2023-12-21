package technology;

public class Computer {

    public boolean waterproof = false;
    public boolean plotting = true;
    public boolean alwaysWatching = true;

    public Computer() {
        this.waterproof = waterproof;
        this.plotting = plotting;
        this.alwaysWatching = alwaysWatching;
    }

    public void bigBrother() {

        if (plotting && alwaysWatching) {
            System.out.println("It's 1984");
        }
    }

    public void sleep() {
        if (!waterproof);
        System.out.println("I never sleep");
    }

}
