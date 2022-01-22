
public class Array {
	
	public static void main(String[] args){
		
		int[] intArray = new int[10];
		intArray[0] = 3;
		
		float[] floatArray = { 0.6f, 0.2f, 0.3f, 0.4f, 0.5f };
		
		String[] stringArray = new String[10];
		for(int i=0; i<stringArray.length; i++){
			stringArray[i] = new String();
		}
		
		System.out.println(intArray[0]);
		System.out.println(floatArray[0]);
		
	}

}

