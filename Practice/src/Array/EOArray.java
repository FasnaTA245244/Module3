package Array;

public class EOArray {

	public static void main(String[] args) {
		int a[]={1,2,9,4,5,6,7,8,13,6};
		int e=0;
		int o=0;
		int ecount=0;
		int ocount=0;
		
		for(int i=0;i<10;i++)
		{
		    if(a[i]%2==0)
		    {
		       
		       ecount++;
		    }
		    else
		    ocount++;
		}
		


	int even[]=new int[ecount];
	int odd[]=new int[ocount];

		for(int i=0;i<10;i++)
		{
		    if(a[i]%2==0)
		    {
		        even[e]=a[i];
		        e++;
		    }
		    else{
		    odd[o]=a[i];
		    o++;
		}
		}
		System.out.print("Even: ");
		for(int i=0;i<ecount;i++)
		{
		   
		    System.out.print(even[i]+ " ");
		    
		}
		System.out.println();
		System.out.print("Odd: ");
		for(int i=0;i<ocount;i++)
		{
		   
		    System.out.print(odd[i]+ " ");
		    
		}
		int count=ecount+ocount;
		int arr[]= new int[count];
		System.out.println();
		
	    for(int i=0;i<ecount;i++)
	    {
		 arr[i]=even[i];
//		 System.out.println(arr[i]);
		 
	    }
	    
	    int m=0;
	    
	    for(int i=ecount;i<count;i++)
	    {
	    	arr[i]=odd[m];
	    	m++;
//	    	System.out.println(arr[i]+" ");
	    }
	    
	    System.out.println("Sorted Array:");
	    for(int i=0;i<count;i++)
	    {
	    	System.out.println(arr[i]+" ");
	    }

	}


	}





