package factory;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stored in interface ref var
		FactorySpecificationV1 factorySpecificationV1=new AppleFactory();
		System.out.println(factorySpecificationV1.getSpecifiation());
		
		//Stored in interface ref var
		FactorySpecificationV2 appleFactoryV2=new AppleFactory();
		System.out.println(appleFactoryV2.getSpecifiation());
		System.out.println(appleFactoryV2.getRules());
	
		//Stored in parent class ref var
		GenricIndiaFactory genricIndiaFactory=new AppleFactory();
		System.out.println(genricIndiaFactory.getRegNo());
		System.out.println(genricIndiaFactory.getFactoryType());
		System.out.println(genricIndiaFactory.getFactoryType());
		
		//Stored in child class ref var
		AppleFactory applFactory = new AppleFactory();
		applFactory.getSpecifiation();
		applFactory.getRules();
		applFactory.getRegNo();
		applFactory.getFactoryType();
		
	}
	

}
