package factory;

public class AppleFactory extends GenricIndiaFactory implements FactorySpecificationV1, FactorySpecificationV2{

	public String getRegNo(){
		return "APF1001";
	}

	@Override
	public void setRegNo(String regNo) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getFactoryType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSpecifiation() {
		
		return "AppleSpecV1";
	}

	@Override
	public String getRules() {
		// TODO Auto-generated method stub
		return "AppleSpecV2";
	}
	
}
