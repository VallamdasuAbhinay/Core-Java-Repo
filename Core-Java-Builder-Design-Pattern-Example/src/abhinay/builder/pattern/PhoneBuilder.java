package abhinay.builder.pattern;

public class PhoneBuilder {

	private String phoneName;

	private String phoneModel;

	private Double phonePrice;

	private Integer phoneBatteryCapacity;

	private String phoneProcessor;

	private String phoneOS;

	public PhoneBuilder setPhoneName(String phoneName) {
		this.phoneName = phoneName;
		return this;
	}

	public PhoneBuilder setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
		return this;
	}

	public PhoneBuilder setPhonePrice(Double phonePrice) {
		this.phonePrice = phonePrice;
		return this;
	}

	public PhoneBuilder setPhoneBatteryCapacity(Integer phoneBatteryCapacity) {
		this.phoneBatteryCapacity = phoneBatteryCapacity;
		return this;
	}

	public PhoneBuilder setPhoneProcessor(String phoneProcessor) {
		this.phoneProcessor = phoneProcessor;
		return this;
	}

	public PhoneBuilder setPhoneOS(String phoneOS) {
		this.phoneOS = phoneOS;
		return this;
	}

	public Phone createPhone() {
		return new Phone(phoneName, phoneModel, phonePrice, phoneBatteryCapacity, phoneProcessor, phoneOS);
	}

}
