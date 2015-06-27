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
class DoIt{
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
}