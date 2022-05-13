public class OverRiding{

		void display() {
			System.out.println("in OverRiding");
		}
	}


	class OverRidingChild extends OverRiding {
		void display() {
			System.out.println("in OverRidingChild");
		}


		public static void main(String[] args) {
		
			OverRiding r=new OverRidingChild();
			OverRiding r1=new OverRiding();
			
			r.display();
			r1.display();
		}

	}