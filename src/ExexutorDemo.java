import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExexutorDemo {

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

		ExecutorService service=Executors.newFixedThreadPool(3);
		for(PrintJob job:jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}

}
