import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = CustomScanner.scannerInt();
        int[] array = new int[size];
        Filler.fillIntArray(array);
        CustomWriter.writer(Arrays.toString(array));
        Calculate.changePosistionsOfNumbers(array);
        CustomWriter.writer(Arrays.toString(array));
    }
}


