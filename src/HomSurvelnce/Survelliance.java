package HomSurvelnce;
public class Survelliance {
	String SystemName;
	protected String SystemType;
	double cost;
	String description;
	
	
	public String getSystemName() {
		return SystemName;
	}
	public void setSystemName(String systemName) {
		SystemName = systemName;
	}
	public String getSystemType() {
		return SystemType;
	}
	public void setSystemType(String systemType) {
		SystemType = systemType;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
