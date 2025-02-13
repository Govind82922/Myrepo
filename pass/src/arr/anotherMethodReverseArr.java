package arr;

public class anotherMethodReverseArr {
	
	static void reverseswap(int arr[]) {
		int n = arr.length;
		int temp;
		int first =0;
		int end = n-1;
	
		while(first < end) {
			
			temp =arr [first];
			arr [first] = arr[end];
			arr[end] =temp;
	//MOVE THE POINTER TOWARD THE MIDDLE
			first++;
			end--;
		}
	}

	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println("original arr");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}	
// CALL THE REVERSESWAP METHOD TO REVERSE ARRAY
			reverseswap(arr);
			System.out.println("Reverse Array");
			for(int  i=0; i<arr.length; i++) {
				System.out.println(arr[i]+" ");
			}
		}
	}

