package makesandwitch;

public abstract class Sandwich {

	final void makeSandwich(){
		
		System.out.println("/------------New Order--------------");
		cutBun();
		
		if(customerWantsMeat()){
			
			addMeat();
		}
		
		addVegetables();
		
		if(customerWantsCondiments()){
			 
			addCondiments();
		}
		
		wrapSandwich();
	}
	
	abstract void addMeat();
	abstract void addCondiments();
	
	public void cutBun(){
		System.out.println("Bun was cut");
	}
	
	public void addVegetables(){
		System.out.println("Lettuce, Onions & Tomatoes");
	}
	
	public void wrapSandwich(){
		
		System.out.println("Sandwich was Wrapped");
	}
	
	boolean customerWantsMeat(){ return true; }
	boolean customerWantsCondiments(){ return true; }
}
