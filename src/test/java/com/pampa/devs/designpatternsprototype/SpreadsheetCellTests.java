package com.pampa.devs.designpatternsprototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SpreadsheetCellTests {
    @Test
    public void shouldCreateEqualsSpreadsheetCellObjects() {
        // given
        String borderTop = "1px";
        String borderBottom = "2px";
        String foregroundColor = "BLACK";
        String fontName = "ARIAL";
        String fontColor = "WHITE";

        // when
        SpreadsheetCell spreadsheetCell = new SpreadsheetCell(borderTop, borderBottom, foregroundColor, fontName, fontColor);
        SpreadsheetCell anotherSpreadsheetCell = new SpreadsheetCell(spreadsheetCell.getBorderTop(), spreadsheetCell.getBorderBottom(), spreadsheetCell.getForegroundColor(), spreadsheetCell.getFontName(), spreadsheetCell.getFontColor());

        // then
        assertEquals(spreadsheetCell, anotherSpreadsheetCell);
    }

    @Test
    public void shouldCreateNotEqualsSpreadsheetCellObjects() {
        // given
        String borderTop = "1px";
        String borderBottom = "2px";
        String foregroundColor = "BLACK";
        String fontName = "ARIAL";
        String fontColor = "WHITE";

        // when
        SpreadsheetCell spreadsheetCell = new SpreadsheetCell(borderTop, borderBottom, foregroundColor, fontName, fontColor);
        SpreadsheetCell anotherSpreadsheetCell = new SpreadsheetCell("10px", spreadsheetCell.getBorderBottom(), spreadsheetCell.getForegroundColor(), spreadsheetCell.getFontName(), spreadsheetCell.getFontColor());

        // then
        assertNotEquals(spreadsheetCell, anotherSpreadsheetCell);
    }
}
