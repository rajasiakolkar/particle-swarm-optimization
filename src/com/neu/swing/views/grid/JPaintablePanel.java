package com.neu.swing.views.grid;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.neu.controller.SimulationDataAggregator;

//import com.gui.views.tabs.AlgorithmForm;

public class JPaintablePanel extends JPanel {
	private SimulationDataAggregator data;

	public JPaintablePanel() {
		super(true);
	}

	public void setSimulationDataAggregator(SimulationDataAggregator data) {
		this.data = data;
	}

	public void plot(String name) {
		MAX = data.getGridRange();
		citiesPoints = data.getPositions();
		citiesOrder = data.getBestCitiesOrder(name);
		repaint();
	}

	int MAX = 0;
	int citiesPoints[][];
	ArrayList<Integer> citiesOrder;
	int width, height;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		this.setBackground(Color.white);

		width = getWidth();
		height = getHeight();

		int radius = Math.abs(Math.min(width, height)
				- (6 * Math.min(width, height) / 7)) / 10;
		int x, y;
		radius *= 2;
		width -= radius;
		height -= radius;
		g2d.setColor(Color.red);
		if (MAX > 0) {
			for (int i = 0; i < citiesOrder.size(); i++) {
				x = (citiesPoints[citiesOrder.get(i)][0] * width) / MAX;
				y = (citiesPoints[citiesOrder.get(i)][1] * height) / MAX;
				if (i == 0) {
					g2d.setColor(Color.blue);
				}
				g2d.fillOval(x, y, radius, radius);
				g2d.setColor(Color.red);
			}
			g2d.setColor(Color.gray);
			g2d.setFont(new Font("Arial", Font.BOLD, 12));

			int r[] = new int[2];
			int s[] = new int[2];
			if (citiesOrder.size() > 1) {
				for (int i = 0; i < citiesOrder.size() - 1; i++) {
					r[0] = (citiesPoints[citiesOrder.get(i)][0] * width) / MAX
							+ radius / 2;
					r[1] = (citiesPoints[citiesOrder.get(i)][1] * height) / MAX
							+ radius / 2;

					s[0] = (citiesPoints[citiesOrder.get(i + 1)][0] * width)
							/ MAX + radius / 2;
					s[1] = (citiesPoints[citiesOrder.get(i + 1)][1] * height)
							/ MAX + radius / 2;
					g2d.drawLine(r[0], r[1], s[0], s[1]);
					g2d.setColor(Color.black);
					fitPositions(r, s);
					g2d.drawString(new Integer(i).toString(), r[0], r[1]);
					g2d.drawString(new Integer(i + 1).toString(), s[0], s[1]);
					g2d.setColor(Color.gray);
				}
			}
		}
	}

	private void fitPositions(int r[], int s[]) {
		int down = 10;
		int up = 4;
		if (r[1] < 10) {
			r[1] += down;
		} else {
			r[1] -= up;
		}
		if (s[1] < 10) {
			s[1] += down;
		} else {
			s[1] -= up;
		}
		// int right = 10;
		int left = 10;
		if (r[0] > (width - 10)) {
			r[0] -= left;
		}
		if (s[0] > (width - 10)) {
			s[0] -= left;
		}
	}

	
	private static final long serialVersionUID = -5152661120759890069L;
}