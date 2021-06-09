import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class job_que {

	public static void main(String[] args) {
		

		Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		ArrayList<Character> array = new ArrayList<Character>();
		array.addAll(Arrays.asList(alphabet));
		Collections.shuffle(array);
		
			if(array.get(1)=='a' ||array.get(1)=='e'||array.get(1)=='i'||array.get(1)=='o'||array.get(1)=='u')
				System.out.println(array.get(1));
		
		
		System.out.println(array.get(array.size()-1));
		
		
		
		 
	

	}


}
