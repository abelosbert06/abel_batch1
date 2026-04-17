class bank implements Runnable {
	
}
void main(){
	var b = new Bank();
	Runnable task = () -> {
		b.withdraw(200);

	}

	var t1 = new Thread(task, "user 1");
	var t2 = new Thread(taskm "user 2");
	t1.start();
	t2.start();
}
