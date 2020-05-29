package com.neu.controller;

import com.neu.swing.GuiManager;
import com.neu.swing.MainFrame;

public class AppManager extends Thread {

	@Override
	public void run() {
		new GuiManager().start();
	}
}
