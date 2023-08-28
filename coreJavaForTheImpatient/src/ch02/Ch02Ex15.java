package ch02;
import java.util.ArrayList;

class Invoice {
	
	public static class Item
	{
		private String description;
		private int quantity;
		private double unitPrice;

		public Item( String description, int quantity, double unitPrice )
		{
			this.description = description;
			this.quantity = quantity;
			this.unitPrice = unitPrice;
		}

		public double price()
		{
			return quantity * unitPrice;
		}

		public String toString()
		{
			return String.format("description : %s, quantity : %d, unitPrice : %.3f, price : %.3f%n", 
				description, quantity, unitPrice, price());
		}
	}

	private ArrayList<Item> items = new ArrayList<>();

	public void add(Item item)
	{
		items.add(item);
	}

	public void print()
	{
		double sum = 0.0;
		for ( Item i : items )
		{
			System.out.print(i);
			sum += i.price();
		}
		System.out.printf("Total = %.3f%n", sum);
		
	}
}

public class Ch02Ex15
{
	public static void main(String[] args) 
	{
		Invoice test= new Invoice();
		Invoice.Item newItem = new Invoice.Item("test", 100, 13.12);
		test.add(newItem);
		newItem = new Invoice.Item("test2", 1000, 4.1);
		test.add(newItem);
		test.print();
	}
}
