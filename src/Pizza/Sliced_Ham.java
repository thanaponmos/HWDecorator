package Pizza;

public class Sliced_Ham extends Topping {
	 Pizza Pizza;
		
		public Sliced_Ham(Pizza Pizza){
			 this.Pizza = Pizza;
		}
		
		@Override
		public String getDescription() {
		
			return  Pizza.getDescription()+", Sliced_Ham";
		}
		public double cost(){
			return 49 + Pizza.cost();
		}
		 

}
