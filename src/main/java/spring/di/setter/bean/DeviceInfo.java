package spring.di.setter.bean;

public class DeviceInfo {
	
	private String model;
	private String version;
	private String serialNumber;
	private String imei;
	
	public DeviceInfo() {
		super();
	}
	
	public DeviceInfo(String model, String version, String serialNumber, String imei) {
		super();
		this.model = model;
		this.version = version;
		this.serialNumber = serialNumber;
		this.imei = imei;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getImei() {
		return imei;
	}
	
	public void setImei(String imei) {
		this.imei = imei;
	}

	@Override
	public String toString() {
		return "DeviceInfo [model=" + model + ", version=" + version + ", serialNumber=" + serialNumber + ", imei="
				+ imei + "]";
	}
	
}
