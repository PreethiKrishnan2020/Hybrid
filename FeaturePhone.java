package HybridInheritanceExcercise;

public interface FeaturePhone extends SmartPhone {
	
	public default  void models() {
		String[]Model= {"Samsung 1200","Samsung Guru","Nokia 3310 "};
		System.out.println("7.These are some models of FeaturePhones ");
		for(int i=0;i<Model.length;i++) {
		
			System.out.println(Model[i]);
		}
		
	}

}
