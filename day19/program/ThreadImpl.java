import java.util.*;

void main(){
	var t1 = new Timer1();
	var t2 = new Timer2();

	t1.start();
	t2.start();

	try{
		t1.join();
	} catch (Exception e){
		IO.println(e);
	}

	IO.println(t1.j);
}

class Music extends Thread{
	public void run() {
		IO.println("play");
	}
}

class Timer1 extends Thread{
	int j;
	public void run(){
		for(int i = 0; i < 5; i++){
			try{
				Thread.sleep(50);
			} catch(Exception e){
				IO.println(e);
			}
			IO.println("Thread 1: " + i);
			j = i;
		}
	}
}

class Timer2 extends Thread{
	public void run(){

		for(int i = 0; i < 5; i++){
			try{
				Thread.sleep(50);
			} catch(Exception e){
				IO.println(e);
			}
			IO.println("Thread 2: " + i);
		}
	}
}



