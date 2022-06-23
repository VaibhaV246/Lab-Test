package lab8;

import java.util.Comparator;
public class NameCom implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.Student_name.compareToIgnoreCase(o2.Student_name);
	}
	
	
	
  
	
}
