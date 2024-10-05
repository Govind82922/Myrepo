package pass;

public class revercsearr {
	
//	static int reverseArr(int [] arr) {
//		int n = arr.length;
//		int [] arr = new int[n];
//		int j=0;
//		for(int i=n-1; i<0; i++)
//		{
//		arr[j]=arr[i];
//		j++;
//		}
//		return n;
//	}
	
	static void printarr(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"  ");
		}
		System.out.println();
	}
	
//==========================================================================
	
	static int rotation(int [] arr, int k) {
		int n = arr.length;
	     k = k%n;
	    int [] ans = new int[n];
	    
	    int j=0;
	    for(int i=n-k; i<n; i++) 
	    {
	    	ans[j++]= ans[i];
	    }
	    
	    for(int i=0; i<n-k; i++)
	    {
	    	ans[j++]=ans[i];
	    }
	    
	    return n;
		
	}
	
	public static void main(String args[]) {
		int [] arr = {1,2,3,4,5,6};
		System.out.println(arr);
		
		int [] ans = rotaion(arr,k);
		System.out.println(arr);
		}

}
