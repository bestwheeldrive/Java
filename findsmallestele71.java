package jonathan;
public class findsmallestele71 {
	public static void main(String[] args) 
	{
		int arr[]= {33,3,4,5,66,4};
		int min=arr[0];
		System.out.println("the array elements are");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		for(int i=0;i<arr.length;i++)
				if(min>arr[i])
					min=arr[i];
		System.out.println("the smallest element is"+min);
	}
}