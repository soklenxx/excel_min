package com.excel_min.excel_min.service;

import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.excel_min.excel_min.service.ExcelReaderService.getFirstCell;
import static com.excel_min.excel_min.service.SortService.quickSort;

@Service
public class ExcelServiceImpl implements ExcelService {
    @Override
    public int getMinNumberExcel(String pathFile, int nNumber) {
        int[] sequenceNumber;
        try {
            sequenceNumber = getFirstCell(pathFile);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при получении числовой последовательности из Excel файла: " + pathFile, e);
        }
        quickSort(sequenceNumber, 0, sequenceNumber.length - 1);
        return sequenceNumber[nNumber - 1];
    }
}
