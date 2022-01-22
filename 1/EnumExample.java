//Dari list of hari tu, dia akan pilih print Friday sebab dekat void main tu dia set "ee.printDay(Day.FRI);"

public class EnumExample {
	
	public enum Day {MON, TUE, WED, THU, FRI, SAT, SUN};
	
	public void printDay(Day today){
		
		if (today == Day.FRI){
			System.out.println("Today is Friday");
		} else if (today == Day.MON){
			System.out.println("Today is Monday");
		} else {
      System.out.println("Not today");
    }
	
	} 
	
	public static void main(String[] args){
    //scanner input = new scanner(system.in)
		  EnumExample ee = new EnumExample();

    //Dia akan print tarikh bawah ni punya output
		ee.printDay(Day.THU);
	}

}
