import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class job_que {

	public static void main(String[] args) {
		

		Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		ArrayList<Character> array = new ArrayList<Character>();
		array.addAll(Arrays.asList(alphabet));
		Collections.shuffle(array);
		
//			if(array.get(1)=='a' ||array.get(1)=='e'||array.get(1)=='i'||array.get(1)=='o'||array.get(1)=='u')
//				System.out.println(array.get(1));
//		
//		
//		System.out.println(array.get(array.size()-1));
		
		display();
		
		 
	

	}
	
	public static ArrayList<Integer> display() {
		ArrayList<Integer> languages = new ArrayList<Integer>();
			Random r = new Random();
			int j=0;
			for (int i=0;i<10;i++)
				languages.add(55+(r.nextInt(45)));
			Collections.sort(languages);
		for(int k :languages) {
			j++;
			System.out.println(languages.get(j-1));
		}
		System.out.println("the min is "+languages.get(0));
		System.out.println("the max is "+languages.get(languages.size()-1));
			
			
	    return languages;
	  }


}
