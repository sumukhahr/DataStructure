
public class insertionsort {
	public static void sort(int arr[])
	{
		
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while((j>-1) && (arr[j]>key))
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;	
		}
	}

	public static void main(String[] args) {
		int arr1[]={5,2,9,1,22};
		sort(arr1);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Branch 1 changes");
		System.out.println(arr1[i]);
		}}}
