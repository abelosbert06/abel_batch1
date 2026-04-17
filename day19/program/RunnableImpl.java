class Timer implements Runnable {
	
	public void run(){
		for(int i = 0; i < 5; i++){
			try{
				Thread.sleep((long) 0.5);
			} catch(Exception e){
				IO.println(e);
			}

			IO.println("Thread "+Thread.currentThread().getName() + " : " + i);
		}
	}
}

void main() {
	var t1 = new Timer();
	var t2 = new Timer();

	t1.start();
	t2.start();
}
