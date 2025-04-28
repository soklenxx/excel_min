package com.excel_min.excel_min.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
public record RequestExcelDto(
        @NotEmpty
        @Schema(description = "Абсолютный путь к локальному `.xlsx`-файлу", example = "\"/Users/soklen/Новая таблица.xlsx\"")
        String pathFileExcel,
        @NotNull
        @Schema(description = "Какое по счёту минимальное число вернуть", example = "4")
        int nNumber
) {
}
