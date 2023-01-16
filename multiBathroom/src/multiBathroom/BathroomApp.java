package multiBathroom;

public class BathroomApp {
public static void main(String[] args)throws Exception {
	Bathroom b = new Bathroom();
	Thread t1 = new Thread(b);
	Thread t2 = new Thread(b);
	Thread t3 = new Thread(b);
	t1.setName("Boy");
	t2.setName("Girl");
	t3.setName("Other");
	t1.start();
//	t1.join();
	t2.start();
//	t2.join();
	t3.start();
//	t3.join();
}
}
