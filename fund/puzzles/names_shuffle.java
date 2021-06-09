import java.util.ArrayList;
import java.util.Collections;
public class job_que {

	public static void main(String[] args) {
		
		ArrayList<String> r = new ArrayList<String>() ;
		 r.add("nancy");
		 r.add("Fujibayashi");
		 r.add("Momochi");
		 r.add("Ishikawa");
		 Collections.shuffle(r);
		
		 
		display(r);

	}
//	 static int[] greater(int [] arr) {
//		 int counter=1;
//		 int newarr[]=new int[arr.length];
//		 
//		 for(int i=0 ;i<arr.length;i++) {
//			 if(arr[i]>10) {
//				 counter++;
//				 newarr[i]=arr[i];
//				 
//			 }
//			 if(newarr[i]!=0) {
//			 System.out.println(newarr[i]);
//			 }
//		 }
//		 return newarr;
//	 }
//	
//
//}

public static void display(ArrayList<String> r) {
	int i =0;
	char [] ch;
	for (String name : r) {
		ch=name.toCharArray();
		if(ch.length>5){
		System.out.println(name);
		}
    
  }
}
}


// 	static int 
