public class Rectangle {
	
	private int l;
	private int b;
	
	
	public int getLe() {
		return l;
	}
	public void setLe(int l) {
		
		if(l<=10 || l>=50)
		{
			System.out.println("Length should be between 10 to 50");
		}
		
		this.l = l;
	}
	public int getBr() {
		return b;
	}
	public void setBr(int b) {
		
		if(b<=5 || b>=20)
		{
			System.out.println("Breadth should be between 5 to 20");
		}
		
		this.b = b;
	}
	
	
	
	public Rectangle(int l, int b) {
		setLe(l);
		setBr(b);
	}
	
	
	void getArea()
	{
		if(getBr()<=20 && getBr()>=5)
		{
			if(getLe()<=50 && getLe()>=10)
			{
				System.out.println(getBr()*getLe());
			}
			
			else
			{
				System.out.println("LE ERROR !");
			}
		}
		
		else
		{
			System.out.println("BR ERROR !");
		}
		
	}
	

}