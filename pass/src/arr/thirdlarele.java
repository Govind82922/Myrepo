package arr;

import java.util.Arrays;

public class thirdlarele {
// static int thirdlarele(int arr[]) {
//	 int n = arr.length;
//	 
//	 Arrays.sort(arr);
//	 
//	 for(int i=n-3; i>=0; i--) {
//		 if(arr[i] != arr[n-2]) {
//			 return arr[i];
//		 }
//	 }
//	 return-1;
// }
// public static void main(String args[]) {
//	 int arr[] = {3,5,6,7,12,24,1,2,4,8,9};
//	 System.out.println(thirdlarele(arr));
// }

//import java.util.Arrays;

//public class ReverseArrayWithForLoop {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        System.out.println("Reversed array: " + "Arrays.toString(array)");
    }

    public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }
}


