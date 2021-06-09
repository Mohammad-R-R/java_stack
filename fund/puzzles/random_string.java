import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class job_que {

	public static void main(String[] args) {
		



         ArrayList<String> randoms=new ArrayList<String>();
         for (int i =0;i<10;i++){
             randoms.add(display());
         }
         System.out.println(randoms);
		 
	

	}
	
	public static String display() {
		 char [] x=new char[5]; 
		 String to_save="";
		 Random r= new Random();
		 for(int i=0;i<x.length;i++) {
			 char the_random = (char)(r.nextInt(26) + 'a');
			 to_save+=the_random;
		 }
		 return to_save;
	  }


}
