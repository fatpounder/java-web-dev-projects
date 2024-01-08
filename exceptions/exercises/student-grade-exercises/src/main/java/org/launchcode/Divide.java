package org.launchcode;

public class Divide {

    public double y;

    public double getY() {
        return y;
    }

    public void setY(double aY) {
        if (y == 0) {
            try {
                throw new DivideException("Cannot Divide by Zero");
            } catch (DivideException e) {
                e.printStackTrace();
            }
        }

        y = aY;
    }
}
