package com.puzzle.sudoku.solver.sudokuSolver.model;

import java.util.ArrayList;

public class Square {

	private int id;
	private ArrayList<Integer> values;
	
	public Square(int id) {
		super();
		this.id = id;
		this.values = fillDefaultValues();
	}

	private ArrayList<Integer> fillDefaultValues() {
		ArrayList<Integer> defaultValues = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			defaultValues.add(i);
		}

		return defaultValues;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Integer> getValues() {
		return values;
	}

	public void setValues(ArrayList<Integer> values) {
		this.values = values;
	}

}
