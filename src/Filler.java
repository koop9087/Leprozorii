import java.util.Random;

public class Filler {
    public static final int MAX_ARRAY_VALUE = 200;
    public static final int MIN_ARRAY_VALUE = -100;
    public static void fillIntArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_ARRAY_VALUE) + MIN_ARRAY_VALUE;
        }
    }
}
