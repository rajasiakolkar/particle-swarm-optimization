package com.neu.controller;

import java.util.ArrayList;

import com.neu.algorithm.AlgorithmManager;
import com.neu.algorithm.firefly.FireflyFactory;
import com.neu.algorithm.pso.PSO;

public class AlgorithmFactory {
	public static AlgorithmManager getAlgorithm(String option,
			ArrayList<String> params, double[][] cities) {

		if (option.equals("pso")) {
			return PSO.init(params, cities);
		} else if (option.equals("firefly")) {
			return FireflyFactory.init(params, cities);
		} else {
			System.err.print("no such algorithm!");
			return null;
		}
	}

	
}
