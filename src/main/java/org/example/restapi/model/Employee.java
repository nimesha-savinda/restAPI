package org.example.restapi.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "employee")
@Data
@Builder
public class Employee {
    @Id
    private String empId;
    private String name;
    private String location;
    private BigDecimal salary;
}
