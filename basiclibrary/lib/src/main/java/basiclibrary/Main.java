
package basiclibrary;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;

public class Main {
    public static void main(String[] args){

        roll(4);

        int[] try1={3,3,5,1,2,5,4};
        int[] try2={4,5,6,7,8,9,10};
        int[] try3={2,4,6};

        System.out.println(containsDuplicates(try1));
        System.out.println(containsDuplicates(try2));

        System.out.println("the average is =" + calculatingAverages(try3));

        int[][] weeklyMonthTemperatures = { { 66, 64, 58, 65, 71, 57, 60 }, { 57, 65, 65, 70, 72, 65, 51 },
                { 55, 54, 60, 53, 59, 57, 61 }, { 65, 56, 55, 52, 55, 62, 57 } };

        calculatingAveragesOfMultipleArrays(weeklyMonthTemperatures);


    }





    public static void roll(int n) {

        int arr[] = new int[n];

        for (int i = 0;i <n; i++) {

            arr[i] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
        }
        System.out.println(Arrays.toString(arr));

    }


    public static boolean containsDuplicates(int x[]) {

        Set<Integer> array = new HashSet<Integer>();
        for (int i : x) {
            if (array.contains(i))
                return true;
            array.add(i);
        }
        return false;
    }


    public static double calculatingAverages ( int x[]){

        return Arrays.stream(x).average().orElse(Double.NaN);
    }


    public static void calculatingAveragesOfMultipleArrays ( int[][] a){

        int count = 0;
        double[] array = new double[5];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++)
                count = count + a[i][j];
            double average = count / a[i].length;
            array[i] = average;
            System.out.println("Average value is:" + average);
        }
        System.out.println(Arrays.toString(array));

        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Smallest items: " + min);

    }

    public BooleanSupplier someLibraryMethod () {
        return null;
    }
}



