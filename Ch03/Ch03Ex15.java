package Ch03;

import java.util.Random;

public class Ch03Ex15 {
    private static Random generator = new Random();

    static class RandomSequence implements IntSequence {
		int low;
		int high;
		public RandomSequence(int low, int high) { this.low = low; this.high = high; } 
		public int next() { return low + generator.nextInt(high - low + 1); }
		public boolean hasNext() { return true; }
	}

    public static IntSequence randomInts(int low, int high) {

        return new RandomSequence(low, high);
    }

    public static void main(String[] args) {
    	IntSequence dieTosses = randomInts(1, 6);
        for (int i = 0; i < 10; i++) 
			System.out.println(dieTosses.next());
    }
}