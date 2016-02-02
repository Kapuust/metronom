package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import metronome.BeatsGenerator;

public class BSListener implements ActionListener, ChangeListener {
	
	double bpm = 120;
	int dur = 5;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		BeatsGenerator gen = new BeatsGenerator();
		gen.generateBeats(bpm, dur);				
	}


	@Override
	public void stateChanged(ChangeEvent e) {


			if (e.getSource().getClass().getName() == "view.BpmSlider"){
				bpm = ((JSlider) e.getSource()).getValue();
		}
		else if (e.getSource().getClass().getName() == "view.DurSlider"){
		
		dur = ((JSlider) e.getSource()).getValue();
		}
		
	}

	
}