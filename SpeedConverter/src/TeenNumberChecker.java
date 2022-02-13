public class TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 <= 19 && num1 >= 13) {
            return true;
        } else if (num2 <= 19 && num2 >= 13) {
            return true;
        } else return num3 <= 19 && num3 >= 13;
    }

    public static boolean isTeen(int num1) {
        return num1 <= 19 && num1 >= 13;
    }
}
