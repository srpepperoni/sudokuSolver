package com.puzzle.sudoku.solver.sudokuSolver.model;

public class Row {
	
	private static int id;
	private static int[] values;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Row.id = id;
	}

	public static int[] getValues() {
		return values;
	}

	public static void setValues(int[] values) {
		Row.values = values;
	}

}
