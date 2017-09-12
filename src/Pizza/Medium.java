package Pizza;

public class Medium extends  Size  {
     Pizza Pizza;
	
	public Medium(Pizza Pizza){
		 this.Pizza = Pizza;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  Pizza.getDescription()+", Medium ";
	}
	public double cost(){
		return 319 + Pizza.cost();
	}
}
