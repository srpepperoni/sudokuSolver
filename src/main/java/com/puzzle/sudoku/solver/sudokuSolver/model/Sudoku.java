package com.puzzle.sudoku.solver.sudokuSolver.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Sudoku {
	
	private ArrayList<Row> rows;
	private ArrayList<Column> columns;
	private ArrayList<Square> squares;
	private ArrayList<Cell> cells;
	
	public Sudoku() {
		super();
		rows = initRows();
		columns = initColumns();
		squares = initSquares();
		cells = new ArrayList<Cell>();
	}

	public Row getRowWithId(int id) {
		return null;
	}
	
	private ArrayList<Row> initRows() {
		ArrayList<Row> rows = new ArrayList<Row>();

		for (int i = 0; i < 9; i++) {
			rows.add(new Row(i));
		}
		
		return rows;
	}
	
	private ArrayList<Column> initColumns() {
		ArrayList<Column> columns = new ArrayList<Column>();

		for (int i = 0; i < 9; i++) {
			columns.add(new Column(i));
		}
		
		return columns;
	}
	
	private ArrayList<Square> initSquares() {
		ArrayList<Square> squares = new ArrayList<Square>();

		for (int i = 0; i < 9; i++) {
			squares.add(new Square(i));
		}
		
		return squares;
	}
	
}
