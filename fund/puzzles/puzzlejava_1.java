import java.util.ArrayList;

public class job_que {
//ArrayList<Integer> r = new ArrayList<Integer>() ;
	public static void main(String[] args) {
		System.out.println("hello");
		int arr []= {3,5,1,2,7,9,8,13,25,32};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println("the sum is "+sum);
		int x [];
		greater(arr);
//		System.out.println(x);

	}
	 static int[] greater(int [] arr) {
		 int counter=1;
		 int newarr[]=new int[arr.length];
		 
		 for(int i=0 ;i<arr.length;i++) {
			 if(arr[i]>10) {
				 counter++;
				 newarr[i]=arr[i];
				 
			 }
			 if(newarr[i]!=0) {
			 System.out.println(newarr[i]);
			 }
		 }
		 return newarr;
	 }
	
	

}
