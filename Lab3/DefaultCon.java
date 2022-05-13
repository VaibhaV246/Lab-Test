package lab3;

public class DefaultCon {

	
		DefaultCon(){
			
			System.out.println("default");
		}
		DefaultCon(int a){
			
			System.out.println(a);
		}

		public static void main(String[] args) {
			
			DefaultCon t=new DefaultCon(2);
		}

	}
