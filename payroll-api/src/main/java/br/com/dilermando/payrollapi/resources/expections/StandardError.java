package br.com.dilermando.payrollapi.resources.expections;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class StandardError {

    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;
}