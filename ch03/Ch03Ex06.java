package Ch03;

import java.util.Iterator;

class DigitSequence implements Iterator<Integer> {
    private int number;

    public DigitSequence(int n) {
        number = n;
    }

    public boolean hasNext() {
        return number != 0;
    }

    public Integer next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

	//public void remove() {
		
//	}
    
    public int rest() {
        return number;
    }
}

public class Ch03Ex06 {

	public static void main(String[] args) {
		Iterator<Integer> test = new DigitSequence(12345678);
		test.forEachRemaining( (in) -> System.out.println(in) );
		
		try {
			test.remove();
		} 
		catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
	}

}