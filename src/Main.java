//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car cobalt = new Car();
        cobalt.setModel("Cobalt");
        cobalt.setColor("Yashil");
        cobalt.setMechanic(false);
        cobalt.setPrice(140 * 1000 * 1000);
        System.out.println("Modeli: " + cobalt.getModel());
        System.out.println("Rangi: " + cobalt.getColor());
        System.out.println("Mexanikmi?: " + cobalt.isMechanic());
        System.out.println("Narxi: " + cobalt.getPrice());
        System.out.println();

        //Overloading

        //double
        Triangle90 uchburchak = new Triangle90();
        uchburchak.setTomonA(10);
        uchburchak.setTomonB(50);
        System.out.println("Tomon A: " + uchburchak.getTomonA());
        System.out.println("Tomon B: " + uchburchak.getTomonB());
        System.out.println("Tomon C: " + uchburchak.getTomonC());
        System.out.println("Yuzasi: " + uchburchak.getYuzasi(uchburchak.getTomonA(), uchburchak.getTomonB()));
        System.out.println("Perimetri: " + uchburchak.getPerimeter(uchburchak.getTomonA(), uchburchak.getTomonB(), uchburchak.getTomonC()));
        System.out.println();

        //float
        float af = (float) uchburchak.getTomonA();
        float bf = (float) uchburchak.getTomonB();
        float cf = (float) uchburchak.getTomonC();
        System.out.println("Tomon A: " + af);
        System.out.println("Tomon B: " + bf);
        System.out.println("Tomon C: " + cf);
        System.out.println("Yuzasi: " + uchburchak.getYuzasi(af, bf));
        System.out.println("Perimetri: " + uchburchak.getPerimeter(af, bf, cf));
        System.out.println();

        //int
        int a = (int) uchburchak.getTomonA();
        int b = (int) uchburchak.getTomonB();
        int c = (int) uchburchak.getTomonC();
        System.out.println("Tomon A: " + a);
        System.out.println("Tomon B: " + b);
        System.out.println("Tomon C: " + c);
        System.out.println("Yuzasi: " + uchburchak.getYuzasi(a, b));
        System.out.println("Perimetri: " + uchburchak.getPerimeter(a, b, c));
        System.out.println();

        //long
        long al = (long) uchburchak.getTomonA();
        long bl = (long) uchburchak.getTomonB();
        long cl = (long) uchburchak.getTomonC();
        System.out.println("Tomon A: " + al);
        System.out.println("Tomon B: " + bl);
        System.out.println("Tomon C: " + cl);
        System.out.println("Yuzasi: " + uchburchak.getYuzasi(al, bl));
        System.out.println("Perimetri: " + uchburchak.getPerimeter(al, bl, cl));
        System.out.println();

        Point nuqta=new Point(23,71,9);
        System.out.println("Kordinata X:"+nuqta.getX());
        System.out.println("Kordinata Y:"+nuqta.getY());
        System.out.println("Kordinata Z:"+nuqta.getZ());
        System.out.println();

        nuqta.setX(12);
        nuqta.setY(32);
        nuqta.setZ(16);
        nuqta.Print();
    }
}