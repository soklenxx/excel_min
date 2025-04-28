package com.excel_min.excel_min.service;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderService {
    public static int[] getFirstCell(String pathFile) throws IOException {
        int[] sequenceNumber;
        try (FileInputStream fis = new FileInputStream(pathFile);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            sequenceNumber = new int[sheet.getPhysicalNumberOfRows()];
            for (int i = 0; i < sheet.getLastRowNum(); i++) {
                if (sheet.getRow(i) != null) {
                    Cell cell = sheet.getRow(i).getCell(0);
                    if (cell != null) {
                        sequenceNumber[i] = (int) cell.getNumericCellValue();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении Excel файла по пути: " + pathFile, e);
        }
        return sequenceNumber;
    }
}
