package com.puzzle.sudoku.solver.sudokuSolver.service.impl;

import org.springframework.stereotype.Component;

import com.puzzle.sudoku.solver.sudokuSolver.model.Cell;
import com.puzzle.sudoku.solver.sudokuSolver.model.Sudoku;
import com.puzzle.sudoku.solver.sudokuSolver.service.InitSudokuService;

@Component
public class InitSudokuServiceImpl implements InitSudokuService {

	@Override
	public Sudoku initSudoku(String initialRows) {

		int idCellCounter = 0;
		int idLineCounter = 0;
		int idColumnCounter = 0;
		int idSquareCounter = 0;
		
		int auxSquare = 0;
		
		Sudoku sudoku = new Sudoku();

		String[] lines = initialRows.split(",");
		Cell cell = null;

		for (String line : lines) {
			idColumnCounter = 0;
			for (int i = 0; i < 9; i++) {
				cell = new Cell(idCellCounter, idLineCounter, idColumnCounter, idSquareCounter);
				if (0 != Character.getNumericValue(line.charAt(i))) {
					cell.fixNumber(Character.getNumericValue(line.charAt(i)));
				}
				sudoku.getCells().add(cell);
				idCellCounter++;
				idColumnCounter++;
				idSquareCounter = (idColumnCounter/3) + auxSquare;
			}
			idLineCounter++;
			auxSquare = idLineCounter / 3;
		}
		
		return sudoku;
	}
	
}
