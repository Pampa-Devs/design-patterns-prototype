package com.pampa.devs.designpatternsprototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsPrototypeApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsPrototypeApplication.class, args);

		SpreadsheetCell spreadsheetCell = new SpreadsheetCell("1px", "2px", "BLACK", "ARIAL", "WHITE");
		System.out.println(spreadsheetCell.toString());

		SpreadsheetCell anotherSpreadsheetCell1 = new SpreadsheetCell("10px", spreadsheetCell.getBorderBottom(), spreadsheetCell.getForegroundColor(), spreadsheetCell.getFontName(), spreadsheetCell.getFontColor());
		System.out.println(anotherSpreadsheetCell1.toString());

		/*SpreadsheetCell anotherSpreadsheetCell1 = (SpreadsheetCell) spreadsheetCell.clone();
		anotherSpreadsheetCell1.setBorderBottom("1px");
		System.out.println(anotherSpreadsheetCell1.toString());*/
	}
}
