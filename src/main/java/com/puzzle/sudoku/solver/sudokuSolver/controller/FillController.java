package com.puzzle.sudoku.solver.sudokuSolver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puzzle.sudoku.solver.sudokuSolver.service.InitSudokuService;

@RestController
public class FillController {
	
	@Autowired
	private InitSudokuService initSudokuService;
	
	@Value("${sudoku.test}")
	private String sudokuTest;
	
	@GetMapping(path = { "/test" })
	public void drawSudokuTest() {
		String[] lines = sudokuTest.split(",");
		
		for (String line : lines) {
			drawLine();
			for (int i=0; i<9; i++) {
				System.out.print("|" + (line.charAt(i)!='0'?line.charAt(i):' '));
			}
			System.out.println("|");
		}
		drawLine();
	}
	
	private void drawLine() {
		System.out.println("+-+-+-+-+-+-+-+-+-+");
	}
	
	@GetMapping(path = { "/resolve" })
	public void resolveSudokuTest() {
		initSudokuService.initSudoku(sudokuTest);
	}
	
}
