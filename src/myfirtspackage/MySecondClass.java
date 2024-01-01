package myfirtspackage;

public class MySecondClass {
    private int i, j;

    public MySecondClass(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getJ() {
        return j;
    }
    public int mult() {
        return i + j;
    }
}