package com.neu.swing.views.menu;

import java.awt.Component;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
//import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.neu.controller.DataPersistenceWorker;
import com.neu.controller.SimulationDataAggregator;

public class JMenuBarCustom extends JMenuBar {
	private SimulationDataAggregator data = new SimulationDataAggregator();
	private JMenu fileMenu;
	private final Component component;

	public JMenuBarCustom(JFrame frame) {
		super();
		this.component = (Component) frame;

		fileMenu = new JMenu("File");
		//add(fileMenu);

	
		JMenuItem saveItem = new JMenuItem("Save");
		
		saveItem.addActionListener(new ActionListener() {

			@Override
			public synchronized void actionPerformed(ActionEvent e) {
				DataPersistenceWorker.writeData(null, data, component);
			}
		});
		//fileMenu.add(saveItem);
	add(saveItem);
	
		
  
			

		JMenuItem helpPanel = new JMenuItem("Help");
		helpPanel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				char[] data = DataPersistenceWorker.readHelpInformations();
				if (data == null) {
					JOptionPane.showMessageDialog(component,
							"Error reading information to Help",
							"Error", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(component, new JTextArea(
							new String(data)), "Help",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		add(helpPanel);
		DataPersistenceWorker.readDataAndConfiguration(null, data, component);
	}

	public SimulationDataAggregator getParametersData() {
		return data;
	}

	public void changeEnabledFileMenu(boolean b) {
		fileMenu.setEnabled(b);
	}

	private static final long serialVersionUID = -7318228789842055056L;
}
