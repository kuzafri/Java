import java.util.Vector;
import java.util.ArrayList;

public class ExpandableArray {
	
	public static void main(String[] args){
		
		Vector<String> words = new Vector<String>();
		words.add("orange");
		words.add("boy");
		words.add("cat");
		String myFirstWord = words.get(0);
		System.out.println("Word Words: " + myFirstWord);

    //al tu variable untuk simpan data yang di add dibawah ni. Contohnya al.add which is add tu dimasukkan kedalam al bukan words ^
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("ciku");
		al.add("boy");
		al.add("cat");
		myFirstWord = al.get(2);
		System.out.println("Word AL: " + myFirstWord);
		
	}

}
