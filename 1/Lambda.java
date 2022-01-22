// Takleh tak sure kenapa mungkin sebab takdak library

public class Lambda {
	
    public void printMin(MinString m, String[] array ){
		
		String min = array[0];
		
		for(int i=1; i<array.length; i++){
			
			if (! m.compare(min, array[i])){
				min = array[i];
			}
		}
		
		System.out.println(min);
	}
    
    public void printResult(MinString m){
    	
    }
	
	public static void main(String[] args){
		
		String[] list = {"abc", "xyze", "i", "re"};
		Lambda ld = new Lambda();

		ld.printMin( (String s1, String s2) -> s1.length() < s2.length(), 
				list);
		
	}

}
