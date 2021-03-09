package factory;

public abstract class GenricIndiaFactory {

	public abstract String getRegNo();
	public abstract void setRegNo(String regNo);
	
	public abstract String getFactoryType();
	
	public String fileTax() {
		return "GST";
	}


}
