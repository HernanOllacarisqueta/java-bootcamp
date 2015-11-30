package topic1.exercise;

import java.math.BigDecimal;

public class CreditCard implements PaymentMethod{
	
	private String name;
	private int creditNumber;
	
	
	@Override
	public BigDecimal getTotal() {
		// No sabria hacer la sintaxis para hacer esta cuenta. Tengo el mismo problema que en SpecialOfferItem.java
		return null;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCreditNumber() {
		return creditNumber;
	}


	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

}
