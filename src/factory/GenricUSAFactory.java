package factory;

public abstract class GenricUSAFactory {

	public abstract String getRegNo();
	public abstract void setRegNo(String regNo);
	
	public abstract String getFactoryType();
	
	public String fileTax() {
		return "GST";
	}


}
