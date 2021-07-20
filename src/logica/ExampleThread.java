package logica;

public class ExampleThread extends Thread{
	private String labelThread;

	public ExampleThread(String labelThread) {
		this.labelThread = labelThread;
	}
	@Override
	public void run(){
		for (int i = 0; i < 10; i++) {
		System.out.println(labelThread+"->"+i);
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	}
	

}
