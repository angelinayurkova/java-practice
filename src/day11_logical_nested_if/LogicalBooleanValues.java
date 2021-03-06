package day11_logical_nested_if;

public class LogicalBooleanValues {
	public static void main(String[] args) {
		
		boolean b1 = 50 > 10 && 10 > 100;
		System.out.println("B1: "+b1);
		
		boolean b2 = 'a' == 'a' && 123 > 120;
		System.out.println("B2: "+b2);
		
		boolean b3 = true && 10>= 10 && 1000<=900;
		System.out.println("B3: " + b3); // false
		
		boolean b4 = false && false && 10 == 10;
		System.out.println("B4: "+b4);

		boolean b5 = false || true && 10 == 10;
		System.out.println("B5: "+b5);
	
		boolean b6 = false && true || 10 == 10;
		System.out.println("B6: "+b6);
	
		boolean b7 = false && true || 10 == 10;
		System.out.println("B7: "+b7);
		
		boolean b8 = false && (true || 10 == 10);
		System.out.println("B8: "+b8);
		
		boolean topicDone = true;
		boolean isMoreThan3pm = true;
		boolean everyThingIsClear = true || false; 
		
		boolean letsGoForABreak = topicDone && isMoreThan3pm &&  everyThingIsClear;
		System.out.println("letsGoForABreak: "+ letsGoForABreak); 
	
		
		
	}

}
