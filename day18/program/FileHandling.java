void main(){
	try {
		var file = new File("program/hope.txt");
		
		if(file.createNewFile()){
			IO.println("file created");
		} else {
			IO.println("already exists");
		}

	} catch (Exception e){
		IO.println(e);
	}
}
