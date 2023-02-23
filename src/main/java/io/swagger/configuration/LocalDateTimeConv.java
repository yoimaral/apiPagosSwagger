package io.swagger.configuration;

import org.springframework.core.convert.converter.Converter;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.format.DateTimeFormatter;

public class LocalDateTimeConv implements Converter<String, LocalDateTime> {
    private final DateTimeFormatter formatter;

    public LocalDateTimeConv(String dateFormat) {
        this.formatter = DateTimeFormatter.ofPattern(dateFormat);
    }

    @Override
    public LocalDateTime convert(String source) {
        if(source == null || source.isEmpty()) {
            return null;
        }
        return LocalDateTime.parse(source, this.formatter);
    }
}
