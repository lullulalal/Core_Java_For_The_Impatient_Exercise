
interface Sequence {
	default boolean hasNext(){ return true; }
	int nextInt();
}

class IntSequence  {
	
	public static Sequence of(int... inList)
	{
		return new Sequence() {
			int[] list = inList;
			int index ;
			
			public boolean hasNext() {
				boolean result = false;
				if ( index < list.length ) {
					result = true;
				}
				return result;
			}
			
			public int nextInt() {				
				return list[index++];
			}
		};
	}
	
	public static Sequence constant(int i)
	{
		return () -> i;
	}
}