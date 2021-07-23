package day6.strategy2;

public class MainClass {
	
	public static void main(String[] args) {
		//������ɱ��� ���� ��ǰȭ�� �� ������...?��� �ǹ����� ��ٸ� strategy3��Ű���� ����.
		
		//���1 ������Ÿ���� �ڱ��ڽ����� ��ü�� �����Ѵ�.
		SuperRobot superR = new SuperRobot();
		superR.defaultFunction();
		superR.shape();
		superR.actionFly();
		superR.actionMisail();
		superR.knife();
		
		System.out.println("");
		
		StandardRobot standardR = new StandardRobot();
		standardR.defaultFunction();
		standardR.shape();
		standardR.actionFly();
		standardR.actionMisail();
		standardR.knife();
		
		System.out.println("");
		
		LowRobot lowR = new LowRobot();
		lowR.defaultFunction();
		lowR.shape();
		lowR.actionFly();
		lowR.actionMisail();
		lowR.knife();
		
		System.out.println("=============================");
		
		//���2 ������Ÿ���� RobotFrame���� �����Ѵ�.
		RobotFrame superR1 = new SuperRobot();
		RobotFrame standardR1 = new StandardRobot();
		RobotFrame lowR1 = new LowRobot();
		
		RobotFrame[] rf = {superR1,standardR1,lowR1};
		
		for(int i = 0; i<rf.length; i++) {
			rf[i].defaultFunction();
			rf[i].shape();
			rf[i].actionFly();
			rf[i].actionMisail();
			rf[i].knife();
		}
		
	}

}