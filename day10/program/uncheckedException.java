void main(){
	//unchecked exception
	try{
		int[] x = new int[3];
		int y = x[4];
	} catch (ArrayIndexOutOfBoundsException e){
		IO.println(e.getMessage());
	}

	try{
		int a = 10/0;
		IO.println(a);
	} catch (ArithmeticException e){
		IO.println(e.getMessage());
	} finally {
		IO.println("finally block");
	}
}
