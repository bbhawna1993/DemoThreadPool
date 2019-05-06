import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExexutorDemo {

	/*Created 6 jobs*/
	public static void main(String[] args)
	{
		PrintJob[] jobs= {
				new PrintJob("job1"),
				new PrintJob("job2"),
				new PrintJob("job3"),
				new PrintJob("job4"),
				new PrintJob("job5"),
				new PrintJob("job6"),
		};
		/*Executorservice to create a thread pool of size 3*/
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(PrintJob job:jobs)
		{   //will start the job
			service.submit(job);
		}
		service.shutdown();
	}

}
