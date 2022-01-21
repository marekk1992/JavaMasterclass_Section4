package exercises.decimalComparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        int castNumber1 = (int) number1 * 1000;
        int castNumber2 = (int) number2 * 1000;
        return (castNumber1 == castNumber2);
    }
}
