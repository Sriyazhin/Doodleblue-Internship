public class Exception extends Thread{

	public void run()
	{
		try
		{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
	public static void main(String[] args) {
		
		Exception e = new Exception();
		e.start();

  }
}

Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity. 
Occasionally a method may wish to test whether the current thread has been interrupted, and if so, to immediately throw this exception.
