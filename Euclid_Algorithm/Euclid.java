public class Euclid{
    public static double euclid(double a, double b){
        if(a == 0)
            return b;

        return euclid(b%a, a);
    }

    // Driver Program
    public static void main(String[] args)
    {
        double a = 10123, b = 151, g;
        g = euclid(a, b);
        System.out.println("GCD(" + a + ", " + b+ ") = " + g);

        double x = 45434, y = 321, t;
        t = euclid(x, y);
        System.out.println("GCD(" + x + " , " + y+ ") = " + t);

        double j = 98767, k = 324, m;
        m = euclid(j, k);
        System.out.println("GCD(" + j + ", " + k+ ") = " + m);

        double h = 1701, q = 3768, d;
        d = euclid(h, q);
        System.out.println("GCD(" + q + ", " + h+ ") = " + d);
    }
}