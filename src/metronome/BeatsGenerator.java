package metronome;

public class BeatsGenerator {

public void generateBeats(double bpm, int duration) {
		

		
		double per = 1/(bpm/60);
		int period = (int) Math.round(per*1000);
		int num = (int)((bpm/60)*duration);
		int licznik = num;
		SoundPlayer sp = new SoundPlayer();
		
		System.out.println("zadany czas to " + duration + " sekund");
		System.out.println("liczba uderzen w zadanym czasie to " + num);
		
			while (licznik != 0){
				try {
					Thread.sleep(period);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sp.playSound();
				//test jednostkowy - sprawdza liczb� klikniec i czas			
				System.out.println((num+1)-licznik +"th beat");
		licznik--;
		}

	}
}
