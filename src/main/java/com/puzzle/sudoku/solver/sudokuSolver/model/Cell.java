package com.puzzle.sudoku.solver.sudokuSolver.model;

import java.util.ArrayList;

public class Cell {
	
	private int id;
	private int row;
	private int column;
	private int square;
	private ArrayList<Integer> values;

	public Cell() {
		super();
		values = fillDefaultValues();
	}
	
	public Cell(int id, int row, int column, int square) {
		super();
		this.id = id;
		this.row = row;
		this.square = square;
		this.values = fillDefaultValues();
	}
	
	private ArrayList<Integer> fillDefaultValues(){
		ArrayList<Integer> defaultValues = new ArrayList<Integer>();
		
		for (int i = 1 ; i < 10 ; i++) {
			defaultValues.add(i);
		}
		
		return defaultValues;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRow() {
		return this.row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return this.column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public ArrayList<Integer> getValues() {
		return this.values;
	}

	public void setValues(ArrayList<Integer> values) {
		this.values = values;
	}

	public int getSquare() {
		return this.square;
	}

	public void setSquare(int square) {
		this.square = square;
	}
	
}
