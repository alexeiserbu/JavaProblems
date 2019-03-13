import java.util.Collections;
import java.util.Vector;

public class vector  {
    public static void main(String[] args) {

        Vector<Double> v = new Vector<>(3);
        v.add(1.0);
        v.add(20.0);
        v.add(-1.0);
       // v.remove(0);

         double sumP = 0;
         double prod = 1;
         double sumT = 0;
         int n = 2;
        // Display values.
        for (double value : v) {
            if (value>0)
            sumP+=value;
            if (value<0)
                prod*=value;
            System.out.println("## " +value);
        }
        System.out.println("Max value is: " + Collections.max(v));
        for (double value : v) {
            sumT=+value;
            value*=n;
            System.out.println("## *n " + value);
        }

        System.out.println("Size of vector " +v.size());
        System.out.println("Sum of positive values of vector " + sumP);
        System.out.println("Prod of negative values of vector " + prod);
    }

}