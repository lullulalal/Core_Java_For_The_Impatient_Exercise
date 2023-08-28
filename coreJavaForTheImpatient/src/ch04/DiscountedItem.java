package ch04;

import java.util.Objects;

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        
        boolean superResult = super.equals(otherObject);
        
        if (otherObject.getClass() == Item.class) {
        	return superResult;
        }
        else if ( otherObject.getClass() == DiscountedItem.class ) {
        	DiscountedItem di = (DiscountedItem) otherObject;
        	if (discount == di.discount) return true;
        	else return false;
        }
        else	return false;
    }
    
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}