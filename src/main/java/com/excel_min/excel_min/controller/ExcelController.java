package com.excel_min.excel_min.controller;

import com.excel_min.excel_min.dto.request.RequestExcelDto;
import com.excel_min.excel_min.dto.response.ResponseExcelDto;
import com.excel_min.excel_min.service.ExcelService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/excel")
public class ExcelController {
    private final ExcelService excelService;

    @GetMapping("/min")
    public ResponseEntity<ResponseExcelDto> getExcelMinNumber(@RequestBody @Valid RequestExcelDto requestExcelDto) {
       int minNNumber = excelService.getMinNumberExcel(requestExcelDto.pathFileExcel(), requestExcelDto.nNumber());
       ResponseExcelDto responseExcelDto = new ResponseExcelDto(minNNumber);
       return new ResponseEntity<>(responseExcelDto, HttpStatus.OK);
    }
}
