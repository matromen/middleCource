package middleCource.thread;

public class TheadMainExam2 {
	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadExam2("ù��° ������"));
		Thread thread2 = new Thread(new ThreadExam2("�ι�° ������"));
		
		thread.start();
		thread2.start();
	}
}
