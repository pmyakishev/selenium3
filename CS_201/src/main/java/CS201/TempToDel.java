package CS201;

public class TempToDel {
    public static void main(String[] args) {
double f= 1;

        double[] numbers = {1, 4.3, 5.55, 3.4};
        double[] x = new double[numbers.length];

        System.arraycopy(numbers, 1, x, 0, 3);


        for (int i = 0; i < x.length; i++)

            System.out.print(x[i] + " ");

    }


}
