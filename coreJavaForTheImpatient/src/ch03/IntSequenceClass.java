package ch03;

/*interface IntSequence {
	default boolean hasNext(){ return true; }
	int nextInt();
}*/

public class IntSequenceClass  {
	
	public static IntSequence of(int... inList)
	{
		return new IntSequence() {
			int[] list = inList;
			int index ;
			
			public boolean hasNext() {
				boolean result = false;
				if ( index < list.length ) {
					result = true;
				}
				return result;
			}
			
			public int next() {				
				return list[index++];
			}
		};
	}
	
	public static IntSequence constant(int i)
	{
		return () -> i;
	}
}