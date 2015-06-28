//====================================================================================================
//====================================UNHANDLED_EXCEPTION=============================================
/*class DoIt{
	DoIt(){
		divideByZero();
	}
	int divideByZero(){
		return 25/0;
	}
	public static void main(String[] args) {
		new DoIt(); 
	}
}*/

//====================================================================================================
//======================================CATCHED_EXCEPTION=============================================
/*class DoIt{
	DoIt(){
		try{
		divideByZero();
		}catch(ArithmeticException e){
			System.out.println("Dear friend, don`t divide by zero!!!");
		}
	}
	int divideByZero(){
		return 25/0;
	}
	public static void main(String[] args) {
		new DoIt();
	}
}*/

//====================================================================================================
//======================================____GENERICS____==============================================
import java.util.*;

class Apple{
	private static long counter;
	private final long id = counter++;
	public long id(){ 
		return id;
	}
}
class Orange{}

public class DoIt{
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i=0;i<3;i++)
			apples.add(new Apple());
		for(int i=0;i<apples.size();i++)
			System.out.println(apples.get(i).id());
		for(Apple c : apples)
			System.out.println(c.id());
	}
}

















