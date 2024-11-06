package org.example.restapi.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmployeeDto {

    private String empId;
    private String name;
    private String location;
    private BigDecimal salary;
}
