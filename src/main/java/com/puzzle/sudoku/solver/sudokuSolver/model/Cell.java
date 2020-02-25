package com.puzzle.sudoku.solver.sudokuSolver.model;

public class Cell {
	
	private static int id;
	private static int row;
	private static int column;
	private static boolean[] values = {true,true,true,true,true,true,true,true,true};

	public Cell() {}

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

	public static boolean[] getValues() {
		return values;
	}

	public static void setValues(boolean[] values) {
		Cell.values = values;
	}
	
}
