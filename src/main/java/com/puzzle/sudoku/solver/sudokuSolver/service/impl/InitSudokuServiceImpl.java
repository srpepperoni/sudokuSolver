package com.puzzle.sudoku.solver.sudokuSolver.service.impl;

import com.puzzle.sudoku.solver.sudokuSolver.model.Cell;
import com.puzzle.sudoku.solver.sudokuSolver.model.Sudoku;
import com.puzzle.sudoku.solver.sudokuSolver.service.InitSudokuService;

public class InitSudokuServiceImpl implements InitSudokuService {

	@Override
	public Sudoku initSudoku(String initialRows) {

		int idCellCounter = 0;
		Sudoku sudoku = new Sudoku();

		String[] lines = initialRows.split(",");
		Cell cell = null;

		for (String line : lines) {
			for (int i = 0; i < 9; i++) {
				Integer.valueOf(line.charAt(i));
				cell = new Cell();
				idCellCounter++;
			}
		}
		
		sudoku.getCells().add(cell);

		return null;
	}

}
