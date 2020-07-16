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
		int idLineCounter = 0;
		int idColumnCounter = 0;
		int idSquareCounter = 0;
		int auxSquare = 0;

		String[] lines = initialRows.split(",");
		Sudoku sudoku = new Sudoku();
		Cell cell = null;
		int value = 0;

		for (String line : lines) {
			idColumnCounter = 0;
			for (int i = 0; i < 9; i++) {
				cell = new Cell(idCellCounter, idLineCounter, idColumnCounter, idSquareCounter);
				value = Character.getNumericValue(line.charAt(i));

				if (0 != value) {
					cell.fixNumber(value);

					sudoku.getRowValuesWithId(idLineCounter).remove(Integer.valueOf(value));
					sudoku.getColumnValuesWithId(idColumnCounter).remove(Integer.valueOf(value));
					sudoku.getSquareValuesWithId(idSquareCounter).remove(Integer.valueOf(value));
				}
				sudoku.getCells().add(cell);
				idCellCounter++;
				idColumnCounter++;
				idSquareCounter = (idColumnCounter / 3) + auxSquare;
			}
			idLineCounter++;
			auxSquare = idLineCounter / 3;
		}

		return sudoku;
	}

	@Override
	public void resolveSudoku(Sudoku sudoku) {

		sudoku.getCells().stream().forEach(cell -> {
			System.out.println("CELDA: " + cell.getId());
			if (!cell.isComplete()) {
				cell.removeAlreadyFilledValues(sudoku.getRowValuesWithId(cell.getRow()));
				cell.removeAlreadyFilledValues(sudoku.getColumnValuesWithId(cell.getColumn()));
				cell.removeAlreadyFilledValues(sudoku.getSquareValuesWithId(cell.getSquare()));
			}
		});

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
