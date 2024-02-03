package array;
public class frequentlyNumber {
	public static void main(String args[]) {
		int [] arr= {2,2,3,4,3,4,2};
		System.out.println();
		System.out.println("/***Program to count the frequently of each element in array****/");
		System.out.println();
		System.out.print("Given Array is :=> { ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("}");
		System.out.println();
		frequentlyNumber obj=new frequentlyNumber();
		obj.frequent(arr);
	}
	void frequent(int [] arr) {
	   for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i>j)
				{
					break;
				}
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println("- frequently element "+arr[i]+" is :=> "+count);
			}
			
		}
	}
}
