package multiBathroom;

class Bathroom implements Runnable{
synchronized public void run()
{
	try
	{
		System.out.println(Thread.currentThread().getName() + "is entering the bathroom");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + "is using the bathroom");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + "is exiting the bathroom");
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
