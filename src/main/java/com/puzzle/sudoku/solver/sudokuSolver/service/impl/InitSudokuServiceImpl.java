package com.puzzle.sudoku.solver.sudokuSolver.service.impl;

import com.puzzle.sudoku.solver.sudokuSolver.model.Cell;
import com.puzzle.sudoku.solver.sudokuSolver.model.Sudoku;
import com.puzzle.sudoku.solver.sudokuSolver.service.InitSudokuService;

public class InitSudokuServiceImpl implements InitSudokuService {

	@Override
	public Sudoku initSudoku(String initialRows) {
		
		String[] lines = initialRows.split(",");
		
		for (String line : lines) {
			for (int i = 0; i<9; i++) {
				Integer.valueOf(line.charAt(i));
				
			}
		}
		
		Sudoku sudoku = new Sudoku();
		
		Cell celda = new Cell();
		
		sudoku.getCells().add(celda);
		
		return null;
	}

}
