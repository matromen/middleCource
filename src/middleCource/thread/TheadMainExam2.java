package middleCource.thread;

public class TheadMainExam2 {
	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadExam2("첫 번째 스레드"));
		Thread thread2 = new Thread(new ThreadExam2("두 번째 스레드"));
		
		thread.start();
		thread2.start();
	}
}
