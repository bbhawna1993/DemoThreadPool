
public class PrintJob implements Runnable{

	String name;

	PrintJob(String name)
	{this.name=name;}
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(name+"started by"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+"completed by"+Thread.currentThread().getName());
		}

	}



}
