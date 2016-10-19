package Ch04;

public class Ch04Ex06 {

	public static void main(String[] args) {
		Item i1 = new Item("test", 100);
		DiscountedItem di1 = new DiscountedItem("test", 100, 1);
		DiscountedItem di3 = new DiscountedItem("test", 100, 2);
		
		System.out.println(di1.equals(i1)); //true
		System.out.println(i1.equals(di3)); //true
		System.out.println(di1.equals(di3)); //false
	}

}
