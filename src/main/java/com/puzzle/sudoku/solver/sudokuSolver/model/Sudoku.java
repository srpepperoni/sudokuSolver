package com.puzzle.sudoku.solver.sudokuSolver.model;

import java.util.ArrayList;

public class Sudoku {
	
	private static ArrayList<Row> rows;
	private static ArrayList<Column> columns;
	private static ArrayList<Square> squares;
	private static ArrayList<Cell> cells;
	
	public Sudoku() {
		super();
		rows = new ArrayList<Row>();
		columns = new ArrayList<Column>();
		squares = new ArrayList<Square>();
		cells = new ArrayList<Cell>();
	}

	public static ArrayList<Row> getRows() {
		return rows;
	}

	public static void setRows(ArrayList<Row> rows) {
		Sudoku.rows = rows;
	}

	public static ArrayList<Column> getColumns() {
		return columns;
	}

	public static void setColumns(ArrayList<Column> columns) {
		Sudoku.columns = columns;
	}

	public static ArrayList<Cell> getCells() {
		return cells;
	}

	public static void setCells(ArrayList<Cell> cells) {
		Sudoku.cells = cells;
	}

	public static ArrayList<Square> getSquares() {
		return squares;
	}

	public static void setSquares(ArrayList<Square> squares) {
		Sudoku.squares = squares;
	}
	
}
