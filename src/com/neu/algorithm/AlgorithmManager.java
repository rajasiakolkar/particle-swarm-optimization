package com.neu.algorithm;

import java.util.ArrayList;

public interface AlgorithmManager {

	/*
	 * performs n-iteration
	 */
	void step(int n);

	/*
	 * current result after the nth iteration
	 */
	double getStepDistance();

	/*
	 * the best result for all iterations updated after each call
	 */
	
	double getBestDistance();

	/*
	 * 
		best order of cities, updated after each step call
	 */
	ArrayList<Integer> getBestCitiesOrder();

	/*
	 * in which iteration would be the best result
	 */
	public int getBestSolutionIteration();
}


// public static AlgorithmManager init(ArrayList<String> parametry, double[][]
// cities);

