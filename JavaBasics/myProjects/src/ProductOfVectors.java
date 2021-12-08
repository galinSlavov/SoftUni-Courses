import java.util.Arrays;

public class ProductOfVectors {
    public static void main(String[] args) {
        //Massive for realization of vectors
        double[] a = {1, 2, -1};
        double[] b = {3, -1, 2};
        double[] c = new double[3];

        //Variable for a scalar product
        double s = 0;
        //Calculation of scalar and vector product
        for (int i = 0; i < 3; i++) {
            s += a[i] * b[i];
            c[i] = a[(i + 1) % 3] * b[(i + 2) % 3] - a[(i + 2) % 3] * b[(i + 1) % 3];
        }
        //Showing the result
        System.out.println("a=" + Arrays.toString(a));
        System.out.println("b=" + Arrays.toString(b));
        System.out.println("a.b=" + s);
        System.out.println("c=[a.b]=" + Arrays.toString(c));
    }
}
