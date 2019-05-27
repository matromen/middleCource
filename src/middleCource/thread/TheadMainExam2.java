package middleCource.thread;

public class TheadMainExam2 {
	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadExam2("첫번째 first ""));
		Thread thread2 = new Thread(new ThreadExam2("두번째 second "));
		
		thread.start();
		thread2.start();
	}
}
