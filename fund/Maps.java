import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;
public class job_que {

	public static void main(String[] args) {
		
		HashMap<String ,String > tiket=new HashMap<String, String>();
		tiket.put("nightmare", "la la la");
		tiket.put("the war","swiitin for m the rush");
		tiket.put("old town", "i am gonna take my hourse to old town road");
		tiket.put("sorry","sorry for my unknon lover sorryy that i can't be");
		String name = tiket.get("old town");
		System.out.println(name);
		
		Set<String> keys = tiket.keySet();
        for(String key : keys) {
            System.out.println(tiket.get(key));    
        }


         
		 
	

	}
	


}
