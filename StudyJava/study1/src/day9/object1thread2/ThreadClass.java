package day9.object1thread2;

public class ThreadClass implements Runnable {

	int threadNum = 0;
	
	@Override
	public void run() {
		
		for(int i = 0; i<10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				threadNum++;
			}
			System.out.println("���� thread : "+Thread.currentThread().getName()+" / threadNum : "+threadNum);
			System.out.println("====================");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
