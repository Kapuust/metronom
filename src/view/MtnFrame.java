package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.BSListener;

public class MtnFrame extends JFrame {
	
	
	DurSlider duration;
	BpmSlider bpm;
	JButton genBeats;
	final static int WIDTH = 400;
	final static int LENGTH = 500;
	
	MtnFrame(){
		
		super("Metronome app");
		
		genBeats = new JButton("generate beats");
		genBeats.setLocation(0,20);
		
		setPreferredSize(new Dimension(WIDTH, LENGTH));
		duration = new DurSlider();
		bpm = new BpmSlider();
		
		BSListener butLis = new BSListener();
		
		bpm.addChangeListener(butLis);
		duration.addChangeListener(butLis);
		genBeats.addActionListener(butLis);
		
		add(duration);
		add(bpm);
		add(genBeats);
		
		setLayout(new FlowLayout());
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
}
}
