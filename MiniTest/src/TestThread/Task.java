package TestThread;

import Controller.SoundCON;

public class Task implements Runnable {

	@Override
	public void run() {
		SoundCON test = new SoundCON();
		while (true) {
			try {

				test.abc("../maple.wav");
				Thread.sleep(150000); // 148000초에 한번씩 재생하도록 설정
			} catch (Exception e) {

			}
		}

	}

}
