package Pizza;

public class Sliced_Bacon extends Topping {
      Pizza Pizza;
	
	public Sliced_Bacon(Pizza Pizza){
		 this.Pizza = Pizza;
	}
	
	@Override
	public String getDescription() {

		return  Pizza.getDescription()+", Sliced_Bacon";
	}
	public double cost(){
		return 49 + Pizza.cost();
	}
	 
}
