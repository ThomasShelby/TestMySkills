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
/*public class DoIt {
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
}*/

//====================================================================================================
//======================================___Selection_Sort___==========================================
/*class DoIt{
	public static void main(String[] args) {
		int arr[]={3, 45, 2, 5, 22, 5,-5, 0, 10};
		for(int i=0;i<arr.length;i++){
			int min=arr[i];
			int imin=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					min=arr[j];
					imin=j;
				}
			}
			if(i!=imin){
				int temp=arr[i];
				arr[i]=arr[imin];
				arr[imin]=temp;
			}
		}
		for(int r=0;r<arr.length;r++){
		System.out.print(arr[r]+" ");
		}
	}
}*/


//====================================================================================================
//=========================================___Bubble_Sort___==========================================
/*class DoIt{
	public static void main(String[] args) {
		int arr[]={12,4,43,24,5,2,-4,-2,15,32};
		for(int i=arr.length-1;i>=2;i--){
			boolean sorted=true;
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sorted=false;
				}
			}
			if(sorted){
				break;
			}
		}
		for(int g=0;g<arr.length;g++){
			System.out.print(arr[g]+" ");
		}
	}
}*/

//====================================================================================================
//=========================================___Classes___==============================================
class DoItB{
	double width;
	double height;
	double depth;
}
class DoIt{
	public static void main(String[] args) {
		DoItB obj1=new DoItB();
		DoItB obj2=new DoItB();
		double vol;

		obj1.width=10;
		obj1.height=20;
		obj1.depth=15;

		obj2.width=1;
		obj2.height=2;
		obj2.depth=5;

		vol=obj1.width*obj1.height*obj1.depth;
		System.out.println("obj1: "+vol);

		vol=obj2.width*obj2.height*obj2.depth;
		System.out.println("obj2: "+vol);
	}
}












