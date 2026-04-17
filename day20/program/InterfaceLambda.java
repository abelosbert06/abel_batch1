void main(){
	test obj = (a) -> IO.println("hello lambda "+a);
	obj.show(10);
}

interface test {
	public void show(int x);
}
