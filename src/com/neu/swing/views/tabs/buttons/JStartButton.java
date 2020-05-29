package com.neu.swing.views.tabs.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import com.neu.swing.views.menu.JMenuBarCustom;
import com.neu.swing.views.tabs.AlgorithmForm;
import com.neu.swing.views.tabs.buttons.AbstractButton;

public class JStartButton extends AbstractButton implements ActionListener {
	AlgorithmForm form;

	public JStartButton(String name, JMenuBarCustom menu) {
		super(name, menu);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = form.updateDataFromForm();
		if (s != null) {
			JOptionPane.showMessageDialog(this, s, "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		long before = System.nanoTime();
		if (manager.start(this, second) == true) {// GraphPainterManager
			long after = System.nanoTime();
            System.out.println( "time elapsed = " +
			( after - before ) +
			" nsec" );
            
			this.setEnabled(false);
			second.setEnabled(true);
			menu.changeEnabledFileMenu(false);
		}
	}

	public void setAlgorithmForm(AlgorithmForm form) {
		this.form = form;
	}

	private static final long serialVersionUID = 7877702719672731779L;
}
