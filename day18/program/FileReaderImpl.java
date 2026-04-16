void main(){
	try{
		var reader = new FileReader("program/hope.txt");
		int character;

		while((character = reader.read()) != -1){
			IO.print((char)character);
		}

		reader.close();

	} catch (Exception e){
		IO.println(e);
	}
}
