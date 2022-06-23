package lab8;

import java.util.Arrays;

public class Student_lab {

	public static void main(String[] args) {
		
		Student num1 = new Student(1,"pooja","English",80);
		Student num2 = new Student(2,"gajannan","Maths",70);
		Student num3 = new Student(3,"rama","Marathi",90);
		Student num4 = new Student(4,"pakkya","Hindi",85);
		Student num5 = new Student(5,"Gannya","Sci",95);
		
		Student[] a = {num1,num2,num3,num4,num5};
		
		Arrays.sort(a, new NameCom());  
		
		for(Student s: a)
		{
			System.out.println(s+"");
		}

	}

}
