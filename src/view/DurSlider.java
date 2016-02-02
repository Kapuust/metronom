package view;

import java.awt.Dimension;

import javax.swing.JSlider;
import javax.swing.border.TitledBorder;

public class DurSlider extends JSlider {
	
	DurSlider(){
		super(JSlider.VERTICAL, 5, 120, 5);
		setPaintLabels(true);
		setPaintTicks(true);
		setMajorTickSpacing(20);
		setMinorTickSpacing(10);
		setPreferredSize(new Dimension(150, 400));
		setBorder(new TitledBorder("Seconds"));
	}

}
