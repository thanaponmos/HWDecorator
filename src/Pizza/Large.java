package Pizza;

public class Large extends Size {
	
Pizza Pizza;
	
	public Large(Pizza Pizza){
		 this.Pizza = Pizza;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  Pizza.getDescription()+", Size Large ";
	}
	public double cost(){
		return 449 + Pizza.cost();
	}
}
