package Array;

public class Median {
	public static void main(String[] args) {
		
		int arr[]= {3,5,8,1,5,9,10,4};
		int median=0;
		int median1=0;
		float m;
		if(arr.length%2 == 0 )
		{
			median=arr[(arr.length)/2];
			median1 = arr[(arr.length/2)-1];
			m= (median+ median1)/2;
		}
		else {
			median=(arr[arr.length/2]);
		}
		 
	System.out.println(median);
	}

}
