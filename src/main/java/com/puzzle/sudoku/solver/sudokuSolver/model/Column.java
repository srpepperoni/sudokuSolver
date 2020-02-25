package com.puzzle.sudoku.solver.sudokuSolver.model;

public class Column {
	
	private static int id;
	private static int[] values;
	private static Cell[] celdas;

	public Column() {}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Column.id = id;
	}

	public static int[] getValues() {
		return values;
	}

	public static void setValues(int[] values) {
		Column.values = values;
	}

	public static Cell[] getCeldas() {
		return celdas;
	}

	public static void setCeldas(Cell[] celdas) {
		Column.celdas = celdas;
	}
	
}
