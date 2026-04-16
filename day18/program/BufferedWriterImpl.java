import java.io.*;

void main(){
	try {
		var bwriter = new BufferedWriter(new FileWriter("program/hope.txt", true));
		bwriter.write("\nhello world\n"); 
		bwriter.write("hello world2");
		bwriter.close();

	} catch (Exception e){
		IO.println(e);
	}
}
