package com.puzzle.sudoku.solver.sudokuSolver.model;

public class Sudoku {
	
	private static int id;
	private static Row[] rows;
	private static Column[] columns;
	private static Cell[] cells;

	public Sudoku() {}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Sudoku.id = id;
	}

	public static Row[] getRows() {
		return rows;
	}

	public static void setRows(Row[] rows) {
		Sudoku.rows = rows;
	}

	public static Column[] getColumns() {
		return columns;
	}

	public static void setColumns(Column[] columns) {
		Sudoku.columns = columns;
	}

	public static Cell[] getCells() {
		return cells;
	}

	public static void setCells(Cell[] cells) {
		Sudoku.cells = cells;
	}
	
}
