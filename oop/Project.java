import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;
public class Project {
	String  name;
	String  description;
	
	public Project() {
		
	}
	public Project (String name) {
		this.name=name;
	}
	public Project (String name ,String description ) {
		this.name=name;
		this.description=description;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static void main(String[] args) {
		
		
		
		}
	public String ElevatorPitch() {
        return String.format("%s , %s", name,  description);
    }
	}
	



