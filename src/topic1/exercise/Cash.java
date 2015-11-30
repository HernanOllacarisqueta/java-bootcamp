package topic1.exercise;

import java.math.BigDecimal;

public class Cash implements PaymentMethod {
	
	private Item item;

	@Override
	public BigDecimal getTotal() {
		 //No se me ocurrio como hacer una lista de compra. Array?
		return item.getPrice();
	}

}
