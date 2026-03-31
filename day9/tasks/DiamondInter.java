void main(){
	Class2 testObj = new Class2();
	testObj.access1();
	testObj.access2();
	testObj.access3();
	testObj.access4();
}

class Class1 {
	void access1(){
		IO.println("class1 is accessed");
	}
}

interface Interface1 {
	void access2();
}

interface Interface2 {
	void access3();
}

class Class2 extends Class1 implements Interface1, Interface2 {
	public void access2(){
		IO.println("interface 1 is accessed");
	}

	public void access3(){
		IO.println("interface 2 is accessed");
	}

	void access4(){
		IO.println("class 2 is accessed");
	}
}
