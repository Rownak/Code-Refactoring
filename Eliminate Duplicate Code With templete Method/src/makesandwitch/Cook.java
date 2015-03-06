package makesandwitch;

public class Cook {
	
	public static void main(String[] args){
		
		Sandwich custmr1 = new Hambarger();
		Sandwich custmr2 = new VegSandwich();
		
		custmr1.makeSandwich();
		custmr2.makeSandwich();
	}

}
