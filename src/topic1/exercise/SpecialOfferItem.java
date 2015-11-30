package topic1.exercise;

import java.math.BigDecimal;

public class SpecialOfferItem extends Item {

	private BigDecimal price;
	private Item item;
	
	public BigDecimal getPrice(){
		price = item.setPrice() * 0.9;	// No sabria hacer la sintaxis para hacer esta cuenta.
		return price;
	}
	
	public SpecialOfferItem(){
		item = new Item();
	}
	
}