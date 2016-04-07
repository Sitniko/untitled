/**
 * Created by IIS on 07.04.2016.
 */
public class uravnenie {
    public static void main(String[] args) {
        double kor1, kor2;
        double a = 1;
        double b = 2;
        double c = 10;

        double D = b * b - 4 * a * c;
        if (D == 0) {
            kor1 = -b + 2 * a;
            System.out.println(kor1);
        }
        if (D > 0) {
            kor1 = (-b + Math.sqrt(D))/(2*a);
            kor2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("x1=" + kor1 + ", x2=" + kor2);
        }
        if (D < 0)
            System.out.println("корней нет");
    }
}
