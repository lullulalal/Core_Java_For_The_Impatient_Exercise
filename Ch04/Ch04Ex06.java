package Ch04;

public class Ch04Ex06 {

	public static void main(String[] args) {
		Item i1 = new Item("test", 100);
		DiscountedItem di1 = new DiscountedItem("test", 100, 1);
		
		DiscountedItem di3 = new DiscountedItem("test", 100, 1);
		
		Item di2 = new DiscountedItem("test", 100, 1);
		
		System.out.println(di1.equals(i1));
	
		System.out.println(di1.equals(di2));
		
		System.out.println(di3.equals(i1));
		
		
		
	}

}
