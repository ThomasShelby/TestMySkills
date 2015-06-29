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
/*import java.util.*;

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
}*/

/*import java.util.*;

public class DoIt{
	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<>();
		for(int i=0;i<10;i++)
			c.add(i);
		for(Integer i:c)
			System.out.print(i+", ");
	}
}*/

//====================================================================================================
//===================================___COLLECTION_VS_MAP___==========================================
/*import java.util.*;

public class DoIt{
	static Collection fill(Collection<String> collection){
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	static Map fill(Map<String,String> map){
		map.put("rat", "Fuzzy");
		map.put("cat","Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new HashMap<String,String>()));
		System.out.println(fill(new TreeMap<String,String>()));
		System.out.println(fill(new LinkedHashMap<String,String>()));
	}
}*/

//====================================================================================================
//======================================___Initial_Values___==========================================
public class DoIt {
private boolean t;
private char c;
private short sh;
byte b;
int i;
long l;
float f;
double d;
DoIt ssylka;

void printInitialValues(){
	System.out.println("Тип даних    Початкове значення");
	System.out.println("bolean      =       "+t);
	System.out.println("char        =       ["+c+"]");
	System.out.println("short       =       "+sh);
	System.out.println("byte        =       "+b);
	System.out.println("int         =       "+i);
	System.out.println("long        =       "+l);
	System.out.println("float       =       "+f);
	System.out.println("double      =       "+d);
	System.out.println("ssylka      =       "+ssylka);
}

public void setDouble(double dd){
	
	this.d=dd;
}
public double getDouble(){
	
	return d;
}

	public static void main(String[] args) {
		DoIt ob = new DoIt();
		ob.printInitialValues();
		ob.setDouble(2.5);
		System.out.println(ob.getDouble());
	}
}

















