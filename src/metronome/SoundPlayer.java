package metronome;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.*;
import javax.swing.JOptionPane;

public class SoundPlayer {

	
	public void playSound() {
		InputStream in;
		try {
			in = new FileInputStream(new File("C:\\Users\\Euro\\Documents\\Studia\\semestr V\\Obiektowe Metody Projektowania Systemów\\Click1.wav"));
			AudioStream audios = new AudioStream(in);
			AudioPlayer.player.start(audios);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,e);
		}
			
		}

}
