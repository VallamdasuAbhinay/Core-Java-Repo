package abhinay.builder.pattern;

public class Phone {
	
	private String phoneName;
	
	private String phoneModel;
	
	private Double phonePrice;
	
	private Integer phoneBatteryCapacity;
	
	private String phoneProcessor;
	
	private String phoneOS;

	public Phone(String phoneName, String phoneModel, Double phonePrice, Integer phoneBatteryCapacity,
			String phoneProcessor, String phoneOS) {
		super();
		this.phoneName = phoneName;
		this.phoneModel = phoneModel;
		this.phonePrice = phonePrice;
		this.phoneBatteryCapacity = phoneBatteryCapacity;
		this.phoneProcessor = phoneProcessor;
		this.phoneOS = phoneOS;
	}

	@Override
	public String toString() {
		return "Phone [phoneName=" + phoneName + ", phoneModel=" + phoneModel + ", phonePrice=" + phonePrice
				+ ", phoneBatteryCapacity=" + phoneBatteryCapacity + ", phoneProcessor=" + phoneProcessor + ", phoneOS="
				+ phoneOS + "]";
	}
	
	

}
