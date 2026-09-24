package by.itstep.lesson3;

public class MinMaxArr {
    public double minMaxArr() {

        double arr[] = {1, -45.1, 23, 22, -1, 9.0};

        double min = arr[0];
        double max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return min + max;
    }
}
