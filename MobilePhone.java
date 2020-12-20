package HybridInheritanceExcercise;

public class MobilePhone {
	String[]Brand={"Samsung","Micromax","Xiaomi"};
    String[]Colour= {"SpaceBlack","SparklingBlue","GlacialGreen"};
    int[]RAM= {4,6,12};
public void  mobilephone() {
	System.out.println("2.These are the Some mobile Brands ");
	
	for(int i=0;i<Brand.length;i++) {

		System.out.println(Brand[i]);
	}
	System.out.println("3.Some variety colours are ");
	for (int a=0;a<Colour.length;a++) {
		System.out.println(Colour[a]);
	}

	System.out.println("4.The No.1 Mobile Brand in World is" +Brand[0]);
	
	System.out.println("5.The No 1 selling SmartPhone  Brand in India is "+ Brand[2]);
	
}
}
