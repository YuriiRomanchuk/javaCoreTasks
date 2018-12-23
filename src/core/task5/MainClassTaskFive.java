package core.task5;

import java.util.Arrays;

public class MainClassTaskFive {

    public static void main(String[] args) {

        int[] arrayNumbers = {4, 5, 7, 1, 2, 10, 555, 66};
        ArrayExtremumCalсulator arrayExtremumCalсulator = new ArrayExtremumCalсulator();

        int maxValue = arrayExtremumCalсulator.getMaxValue(arrayNumbers);
        System.out.println(maxValue);

        int minValue = arrayExtremumCalсulator.getMinValue(arrayNumbers);
        System.out.println(minValue);

        ArraySortingCalculator arraySortingCalculator = new ArraySortingCalculator();
        System.out.println(Arrays.toString(arraySortingCalculator.bubbleSorting(arrayNumbers)));
        System.out.println(Arrays.toString(arraySortingCalculator.insertIntoSort(arrayNumbers)));

    }

}