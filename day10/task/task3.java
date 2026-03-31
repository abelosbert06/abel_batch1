void main(){
	try{
		int[] x = new int[3];
		int y = x[4];
	} catch (ArrayIndexOutOfBoundsException e){
		IO.println(e.getMessage());
		IO.println("specific exception");
	} catch (Exception e){
		IO.println("generic exception");
	}
}
