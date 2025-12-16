package exception;

public class exception1 {

	public static void main(String[] args)    {
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("abc ");
		}
	}

}
