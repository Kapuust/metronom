package view;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;

public class BpmSlider extends JSlider {
	
	@SuppressWarnings("rawtypes")
	private java.util.Hashtable labelSlider;
	
	public BpmSlider(){

		super(JSlider.VERTICAL, 20, 200, 120);
		
		labelSlider = new java.util.Hashtable();
		
		labelSlider.put(new Integer(200), new JLabel(" 200   Prestissimo"));
		labelSlider.put(new Integer(180), new JLabel(" 180   Presto"));
		labelSlider.put(new Integer(160), new JLabel(" 160"));
		labelSlider.put(new Integer(140), new JLabel(" 140"));
		labelSlider.put(new Integer(130), new JLabel(" 130   Allegro"));
		labelSlider.put(new Integer(120), new JLabel(" 120"));
		labelSlider.put(new Integer(100), new JLabel(" 100   Moderato"));
		labelSlider.put(new Integer(90), new JLabel("  90    Andante"));
		labelSlider.put(new Integer(80), new JLabel("  80"));
		labelSlider.put(new Integer(70), new JLabel("  70    Adagio"));
		labelSlider.put(new Integer(60), new JLabel("  60"));
		labelSlider.put(new Integer(50), new JLabel("  50    Lento"));
		labelSlider.put(new Integer(40), new JLabel("  40"));
		labelSlider.put(new Integer(20), new JLabel("  20"));
		
		setPaintLabels(true);
		setPaintTicks(true);
		setMajorTickSpacing(20);
		setMinorTickSpacing(10);
		setLabelTable(labelSlider);
		setPaintLabels(true);
		setPreferredSize(new Dimension(150, 400));
		setBorder(new TitledBorder("Beats per minute (BPM)"));
		
	}

	
	
}
