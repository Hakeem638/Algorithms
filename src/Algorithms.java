public class Algorithms {

    public static int search(int[] array, int k) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static int max(int[] array) {
        int maxval = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxval) {
                maxval = array[i];
            }
        }
        return maxval;
    }

    public static boolean uniqueElement(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
           for  (int j = i + 1; j < array.length; j++) {
               if (array[i] == array[j]) {
                   return false;
               }

           }
        }
        return true;
    }

}

