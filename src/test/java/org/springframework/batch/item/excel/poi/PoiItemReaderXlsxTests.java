package org.springframework.batch.item.excel.poi;

import org.springframework.batch.item.excel.AbstractExcelItemReader;
import org.springframework.batch.item.excel.AbstractExcelItemReaderTests;

public class PoiItemReaderXlsxTests extends AbstractExcelItemReaderTests {

    @Override
    protected AbstractExcelItemReader<String[]> createExcelItemReader() {
        return new PoiItemReader<>();
    }
}
