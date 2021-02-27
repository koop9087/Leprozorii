public class Calculate {

    public static int findMaxValue(int[] array) {
        int maxValueOfArray = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValueOfArray) {
                maxValueOfArray = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int findMinValue(int[] array) {
        int minValueOfArray = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValueOfArray) {
                minValueOfArray = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void changePosistionsOfNumbers(int[] array) {
        int indexMin = findMinValue(array);
        int indexMax = findMaxValue(array);
        int tmp = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = tmp;
    }
}