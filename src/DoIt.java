//====================================================================================================
//====================================UNHANDLED_EXCEPTION=============================================
class DoIt{
	DoIt(){
		divideByZero();
	}
	int divideByZero(){
		return 25/0;
	}
	public static void main(String[] args) {
		new DoIt(); 
	}
}