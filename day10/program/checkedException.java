import java.io.FileReader;

void main(){
	//checked exception 
	try{
		FileReader fr = new FileReader("hope.txt");
		IO.println(fr);
	} catch (Exception e){
		IO.println(e.getMessage());
	}	
}
