package com.puzzle.sudoku.solver.sudokuSolver.model;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.Data;

@Data
public class Sudoku {
	
	private HashMap<Integer, ArrayList<Integer>> rows;
	private HashMap<Integer, ArrayList<Integer>> columns;
	private HashMap<Integer, ArrayList<Integer>> squares;
	private ArrayList<Cell> cells;
	
	public Sudoku() {
		super();
		rows = initComponent();
		columns = initComponent();
		squares = initComponent();
		cells = new ArrayList<Cell>();
	}

	public ArrayList<Integer> getRowValuesWithId(int id) {
		return rows.get(id);
	}
	
	public ArrayList<Integer> getColumnValuesWithId(int id) {
		return columns.get(id);
	}
	
	public ArrayList<Integer> getSquareValuesWithId(int id) {
		return squares.get(id);
	}
	
	private HashMap<Integer, ArrayList<Integer>> initComponent() {
		HashMap<Integer, ArrayList<Integer>> result = new HashMap<Integer, ArrayList<Integer>>();

		for (int i = 0; i < 9; i++) {
			result.put(i, fillDefaultValues());
		}
		
		return result;
	}
	
	private ArrayList<Integer> fillDefaultValues() {
		ArrayList<Integer> defaultValues = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			defaultValues.add(i);
		}

		return defaultValues;
	}
	
}
