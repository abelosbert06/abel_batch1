void main(){
	try {
		var file = new File("program/hope.txt");
		if(file.delete()){
			IO.println("file deleted");
		} 
		 
	} catch (Exception e){
		IO.println(e);
	}
}
