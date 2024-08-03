public class Triangle90 {
    private double tomonA;
    private double tomonB;
    private double tomonC;


    public double getTomonA() {
        return tomonA;
    }

    public void setTomonA(double tomonA) {
        this.tomonA = tomonA;
    }

    public double getTomonB() {
        return tomonB;
    }

    public double getTomonC() {
        return Math.sqrt(this.tomonA * this.tomonA + tomonB * tomonB);
    }

    public void setTomonB(double tomonB) {
        this.tomonB = tomonB;
    }

    public int getYuzasi(int a, int b) {
        return (a * b) / 2;
    }

    public long getYuzasi(long a, long b) {
        return (a * b) / 2;
    }

    public float getYuzasi(float a, float b) {
        return (a * b) / 2;
    }

    public double getYuzasi(double a, double b) {
        return (a * b) / 2;
    }

    public int getPerimeter(int a, int b, int c) {
        return a + b + c;
    }

    public long getPerimeter(long a, long b, long c) {
        return a + b + c;
    }

    public float getPerimeter(float a, float b, float c) {
        return a + b + c;
    }

    public double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }
}
