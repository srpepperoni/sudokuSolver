package com.puzzle.sudoku.solver.sudokuSolver.service;

import com.puzzle.sudoku.solver.sudokuSolver.model.Sudoku;

public interface SudokuService {
	
	public Sudoku initSudoku(String initialRows);
	
	public void resolveSudoku(Sudoku sudoku);
	
	public void drawSudoku(Sudoku sudoku);

}
