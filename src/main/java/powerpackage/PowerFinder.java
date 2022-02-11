package powerpackage;

public class PowerFinder {
    public static int calculate(int num, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i++) result *= num;
        return result;
    }
}
