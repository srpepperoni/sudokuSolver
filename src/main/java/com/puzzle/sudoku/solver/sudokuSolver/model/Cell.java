package com.puzzle.sudoku.solver.sudokuSolver.model;

import java.util.ArrayList;

import lombok.Data;

@Data
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
		this.column = column;
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
	
	public boolean isComplete() {
		return values.size() == 1;
	}
	
	public void fixNumber(int value) {
		values.clear();
		values.add(value);
	}

}
