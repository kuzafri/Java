package jworkshop;

public interface Max<A> {
	
	
	public void printMax();
	public boolean compare(A a, A b);
	
	/**
	 * Available since Java8
	 */
	public default void myprint(){
		System.out.println("yes!");
	}
}

public class IntegerMax implements Max<Integer>{

	public void printMax(){
		//do something...
    System.out.println("Output disini");
	}
	
	public boolean compare(Integer a, Integer b){
		
		return a.intValue() > b.intValue();
	}
	
	public static void main(String[] args){
		Integer[] list = {20, 6, 12, 40, 5};
		TellMax<Integer> tm = new TellMax<Integer>();
		tm.printMax(new IntegerMax(), list);
	}
}
