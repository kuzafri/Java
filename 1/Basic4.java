package jworkshop;
import java.util.Stack;


public class Basic4 {
	
	

	public static void main(String[] args){

    // Untuk stack ni yang mana dia push kemudian tu yang tu keluar dulu bila pop
		Stack s = new Stack();
		s.push("cat");
		s.push("meow");
		String thing = (String) s.pop();
		
		System.out.println(thing);
	}

}
