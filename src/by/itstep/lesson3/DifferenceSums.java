package by.itstep.lesson3;

public class DifferenceSums {
    public double differeceSums() {

        double arr[] = {1.3, 4, 55, 23, 10, -33, -3.3, 8, 0.4};

        double evenNumb = 0;
        double oddNumb = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                oddNumb += arr[i];
            } else evenNumb += arr[i];
        }
        return Math.max(oddNumb, evenNumb) - Math.min(oddNumb, evenNumb);


    }
}
