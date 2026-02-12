import java.util.Arrays;

public class WarmUp {

    // Q1: Return the number of even values in the array.
    public static int countEvens(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Q2: Return a NEW array where each element is doubled.
    public static int[] doubled(int[] arr) {
        int[] doubledArray=new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            doubledArray[i]=arr[i]*2;

        }
        return doubledArray;
    }

    // Q3: Return true if the array is strictly increasing (1,2,3,4).
    public static boolean isStrictlyIncreasing(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]>=arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    // Q4: Given arr, return the index of the first occurrence of target, or -1.
    public static int firstIndexOf(int[] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 4, 4, 7, 8};
        System.out.println("countEvens expected 4 -> " + countEvens(a));

        System.out.println("doubled expected [6,4,8,8,14,16] -> " + Arrays.toString(doubled(a)));

        int[] b = {1, 2, 3, 4};
        int[] c = {1, 2, 2, 4};
        System.out.println("isStrictlyIncreasing b expected true -> " + isStrictlyIncreasing(b));
        System.out.println("isStrictlyIncreasing c expected false -> " + isStrictlyIncreasing(c));

        System.out.println("firstIndexOf target 4 expected 2 -> " + firstIndexOf(a, 4));
        System.out.println("firstIndexOf target 9 expected -1 -> " + firstIndexOf(a, 9));
    }
}
