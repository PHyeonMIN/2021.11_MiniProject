package TestThread;

import Controller.SoundCON;

public class Task implements Runnable {

	@Override
	public void run() {
		SoundCON test = new SoundCON();
		while (true) {
			try {

				test.abc("../maple.wav");
				Thread.sleep(150000); // 148000�ʿ� �ѹ��� ����ϵ��� ����
			} catch (Exception e) {

			}
		}

	}

}
