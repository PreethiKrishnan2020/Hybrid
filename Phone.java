package HybridInheritanceExcercise;

public class Phone extends MobilePhone implements FeaturePhone{	
	String[]Types= {"Android OS","BlackBerry OS","Symbian OS"};
	public void types() {
		
	
		System.out.println("6.These are some types of SmartPhones Based on OS ");
		for(int i=0;i<Types.length;i++) {
			System.out.println(Types[i]);
			 
		}
		
	}
	

}
