public class Point {
    private int x;
    private int y;
    private int z;
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setZ(int z) {
        this.z = z;
    }

    public void Print(){
        System.out.println("Kordinata X:"+this.x);
        System.out.println("Kordinata Y:"+this.y);
        System.out.println("Kordinata Z:"+this.z);
    }
}
