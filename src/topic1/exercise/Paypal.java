package topic1.exercise;

import java.math.BigDecimal;

public class Paypal implements PaymentMethod {	
	
	private String email;
	private String password;
	
	@Override
	public BigDecimal getTotal() {
		//No se me ocurrio como hacer una lista de compra. Array?
		return null;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
