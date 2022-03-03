public class Multithreading extends Thread{
	public void run() {
		System.out.println("Example for Thread Creation");
	
	}
	
	
	public static void main(String[] args) {
		Multithreading Threads= new Multithreading();
		Threads.start();
		
	
	}
}