package application;

public class Task implements Runnable {

	private int number;

	public Task(int num) {
		this.number = num;
	}
	int i;
	public void run() {
		for(i=3;i<number;i+=2){
			if(number%i == 0) break;
		}
		if(i == number){
			System.out.print(number + " ");
		}
	}
}