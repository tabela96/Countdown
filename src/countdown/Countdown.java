package countdown;

public class Countdown {
	public static void main(String [] args){
		Thread t1=new Thread();
		Thread t2=new Thread();
		t1.start();
		int k;
		for(k=10;k>=0;k--){
			System.out.println(k);
		}
		try {
			t1.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		for(k=10;k>=0;k--){
			System.out.println(k);
		}
		try {
			t2.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.stop();
		t2.stop();
	}
	

}
