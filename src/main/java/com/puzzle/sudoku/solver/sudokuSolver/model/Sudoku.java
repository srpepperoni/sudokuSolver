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
	private int cellsSolved;
	
	public Sudoku() {
		super();
		rows = initComponent();
		columns = initComponent();
		squares = initComponent();
		cells = new ArrayList<Cell>();
		cellsSolved = 0;
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
			result.put(i, new ArrayList<Integer>());
		}
		
		return result;
	}
	
	public void increseSolution() {
		cellsSolved++;
	}
	
	public boolean isComplete() {
		return cellsSolved > 80;
	}
}
