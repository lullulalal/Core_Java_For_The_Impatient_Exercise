package ch03;
public interface IntSequence {
	default boolean hasNext(){ return true; }
    int next();
}