void main(){
	try {
		FileWriter writer = new FileWriter("program/hope.txt");
		writer.write("welcome");
		writer.close();
	} catch (Exception e){
		IO.println(e);
	}
}
