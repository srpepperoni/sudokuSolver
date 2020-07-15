package com.puzzle.sudoku.solver.sudokuSolver.model;

import java.util.ArrayList;

public class Cell {
	
	private static int id;
	private static int row;
	private static int column;
	private static ArrayList<Integer> values;

	public Cell() {
		super();
		values = fillDefaultValues();
	}
	
	private ArrayList<Integer> fillDefaultValues(){
		ArrayList<Integer> defaultValues = new ArrayList<Integer>();
		
		for (int i = 1 ; i < 10 ; i++) {
			defaultValues.add(i);
		}
		
		return defaultValues;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Cell.id = id;
	}

	public static int getRow() {
		return row;
	}

	public static void setRow(int row) {
		Cell.row = row;
	}

	public static int getColumn() {
		return column;
	}

	public static void setColumn(int column) {
		Cell.column = column;
	}

	public static ArrayList<Integer> getValues() {
		return values;
	}

	public static void setValues(ArrayList<Integer> values) {
		Cell.values = values;
	}
	
}
