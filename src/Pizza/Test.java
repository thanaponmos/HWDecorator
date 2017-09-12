package Pizza;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza p1 = new Hawaiian();
		p1 = new Large(p1);
		p1 = new Sliced_Bacon(p1);
		p1 = new Sliced_Ham(p1);
		p1 = new Crab_Stick(p1);
		System.out.println(p1.getDescription()+ " $ = "+ p1.cost() );
		
		Pizza p2 = new Hawaiian();
		p2 = new Large(p2);
		p2 = new Sliced_Bacon(p2);
		p2 = new Sliced_Ham(p2);
		p1 = new Crab_Stick(p1);
		System.out.println(p2.getDescription()+ " $ = "+ p2.cost() );
		
		
		
	}

}
