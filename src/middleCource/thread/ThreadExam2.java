package middleCource.thread;

public class ThreadExam2 implements Runnable{
	public String name;
	
	public ThreadExam2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(name + " " + i);

			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
