package com.puzzle.sudoku.solver.sudokuSolver.service.impl;

import org.springframework.stereotype.Component;

import com.puzzle.sudoku.solver.sudokuSolver.model.Cell;
import com.puzzle.sudoku.solver.sudokuSolver.model.Sudoku;
import com.puzzle.sudoku.solver.sudokuSolver.service.SudokuService;

@Component
public class SudokuServiceImpl implements SudokuService {

	@Override
	public Sudoku initSudoku(String initialRows) {

		int idCellCounter = 0;
		int idRowCounter = 0;
		int idSquareCounter = 0;
		int auxSquare = 0;

		String[] lines = initialRows.split(",");
		Sudoku sudoku = new Sudoku();
		Cell cell = null;
		int value = 0;

		for (String line : lines) {
			for (int idColumnCounter = 0; idColumnCounter < 9; idColumnCounter++) {
				idSquareCounter = (idColumnCounter / 3) + auxSquare;
				cell = new Cell(idCellCounter, idRowCounter, idColumnCounter, idSquareCounter);
				value = Character.getNumericValue(line.charAt(idColumnCounter));

				if (0 != value) {
					cell.fixNumber(value);
					sudoku.increseSolution();

					if (!sudoku.getRowValuesWithId(idRowCounter).contains(Integer.valueOf(value))) {
						sudoku.getRowValuesWithId(idRowCounter).add(Integer.valueOf(value));
					}
					if (!sudoku.getColumnValuesWithId(idColumnCounter).contains(Integer.valueOf(value))) {
						sudoku.getColumnValuesWithId(idColumnCounter).add(Integer.valueOf(value));
					}
					if (!sudoku.getSquareValuesWithId(idSquareCounter).contains(Integer.valueOf(value))) {
						sudoku.getSquareValuesWithId(idSquareCounter).add(Integer.valueOf(value));
					}
				}
				sudoku.getCells().add(cell);
				idCellCounter++;
			}
			idRowCounter++;
			auxSquare = (idRowCounter / 3) * 3;
		}

		return sudoku;
	}

	@Override
	public void resolveSudoku(Sudoku sudoku) {
		
		
		for (Cell cell : sudoku.getCells()) {
			if(!cell.isComplete()) {
				cell.removeAlreadyFilledValues(sudoku.getRowValuesWithId(cell.getRow()));
				cell.removeAlreadyFilledValues(sudoku.getColumnValuesWithId(cell.getColumn()));
				cell.removeAlreadyFilledValues(sudoku.getSquareValuesWithId(cell.getSquare()));
				if (cell.isComplete()) {
					sudoku.getRowValuesWithId(cell.getRow()).add(cell.getValues().get(0));
					sudoku.getColumnValuesWithId(cell.getColumn()).add(cell.getValues().get(0));
					sudoku.getSquareValuesWithId(cell.getSquare()).add(cell.getValues().get(0));
					sudoku.increseSolution();
				}
			}
		}
		
		
		if (!sudoku.isComplete()) {
			resolveSudoku(sudoku);
		}

	}

	@Override
	public void drawSudoku(Sudoku sudoku) {
		drawLine();
		for (Cell cell : sudoku.getCells()) {
			System.out.print("|" + (cell.isComplete() ? cell.getValues().get(0) : " "));
			if (cell.getColumn() == 8) {
				System.out.println("|");
				drawLine();
			}
		}
	}

	private void drawLine() {
		System.out.println("+-+-+-+-+-+-+-+-+-+");
	}

}
