package lab3;
import java.util.*;
public class ParaCon{
	
	ParaCon(){
		this(2);
		System.out.println("para");
	}
	ParaCon(int a){
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		ParaCon t=new ParaCon();
	}

}