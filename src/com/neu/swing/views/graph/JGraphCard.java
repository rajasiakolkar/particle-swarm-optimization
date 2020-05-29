package com.neu.swing.views.graph;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JGraphCard extends JPanel {
	private JPaintablePanel psoGraphPanel = new JPaintablePanel("PSO");
	private JPaintablePanel fireFlyGraphPanel = new JPaintablePanel("Firefly");

	public JGraphCard() {
		super(new CardLayout(0, 0));
		setBorder(BorderFactory.createLineBorder(Color.black));

		add(psoGraphPanel, "psoGraphPanel");
		add(fireFlyGraphPanel, "fireFlyGraphPanel");
	}

	public JPaintablePanel getPSO() {
		return psoGraphPanel;
	}

	public JPaintablePanel getFireFly() {
		return fireFlyGraphPanel;
	}

	public GridBagConstraints getGridBagConstraints() {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = 2;
		// gbc.gridheight = GridBagConstraints.REMAINDER;
		gbc.weightx = 3.0;
		gbc.weighty = 3.0;// 12.0;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 1;
		return gbc;
	}

	private static final long serialVersionUID = -8063389783824579826L;
}

