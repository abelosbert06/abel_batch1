void main(){

	try {
		var breader = new BufferedReader(new FileReader("program/hope.txt"));
	
		while(breader.ready()){
			IO.println(breader.readLine());
		}
		breader.close();

	} catch (Exception e){
		IO.println(e);
	}
}
