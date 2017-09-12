package Pizza;

public class Crab_Stick extends Topping {

	Pizza Pizza;
	
	public Crab_Stick(Pizza Pizza){
		 this.Pizza = Pizza;
	}
	
	@Override
	public String getDescription() {
	
		return  Pizza.getDescription()+", Crab_Stick";
	}
	public double cost(){
		return 49 + Pizza.cost();
	}
	 


}
