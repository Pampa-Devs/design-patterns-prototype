package com.pampa.devs.designpatternsprototype;

import java.util.Objects;

public class SpreadsheetCell extends Cell  {

  private String borderTop;
  private String borderBottom;
  private String foregroundColor;
  private String fontName;
  private String fontColor;

  public SpreadsheetCell() {}

  public SpreadsheetCell(String borderTop, String borderBottom, String foregroundColor, String fontName, String fontColor) {
    this.borderTop = borderTop;
    this.borderBottom = borderBottom;
    this.foregroundColor = foregroundColor;
    this.fontName = fontName;
    this.fontColor = fontColor;
  }

  @Override
  public Cell clone() {
    SpreadsheetCell spreadsheetCell = new SpreadsheetCell(this.getBorderBottom(), this.getBorderTop(), this.getForegroundColor(), this.getFontName(), this.getFontColor());
    return spreadsheetCell;
  }

  public String getBorderTop() {
    return borderTop;
  }

  public void setBorderTop(String borderTop) {
    this.borderTop = borderTop;
  }

  public String getBorderBottom() {
    return borderBottom;
  }

  public void setBorderBottom(String borderBottom) {
    this.borderBottom = borderBottom;
  }

  public String getForegroundColor() {
    return foregroundColor;
  }

  public void setForegroundColor(String foregroundColor) {
    this.foregroundColor = foregroundColor;
  }

  public String getFontName() {
    return fontName;
  }

  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  @Override
  public String toString() {
    return "SpreadsheetCell{" +
            "borderTop='" + borderTop + '\'' +
            ", borderBottom='" + borderBottom + '\'' +
            ", foregroundColor='" + foregroundColor + '\'' +
            ", fontName='" + fontName + '\'' +
            ", fontColor='" + fontColor + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SpreadsheetCell that = (SpreadsheetCell) o;
    return Objects.equals(borderTop, that.borderTop) &&
            Objects.equals(borderBottom, that.borderBottom) &&
            Objects.equals(foregroundColor, that.foregroundColor) &&
            Objects.equals(fontName, that.fontName) &&
            Objects.equals(fontColor, that.fontColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderTop, borderBottom, foregroundColor, fontName, fontColor);
  }
}
