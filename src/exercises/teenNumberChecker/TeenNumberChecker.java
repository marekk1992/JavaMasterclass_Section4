package exercises.teenNumberChecker;

public class TeenNumberChecker {

    public static boolean hasTeen(int value1, int value2, int value3) {
        return (value1 <= 19 && value1 >= 13) || (value2 <= 19 && value2 >= 13)
                || (value3 <= 19 && value3 >= 13);
    }

    public static boolean isTeen(int value) {
        return (value <= 19 && value >= 13);
    }
}
