package entities;

public class OutsouceEmployee extends Employee {

	private Double additionalCharge;

	public OutsouceEmployee() {

	}

	public OutsouceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {

		return super.payment() + additionalCharge * 1.1;
	}

}
