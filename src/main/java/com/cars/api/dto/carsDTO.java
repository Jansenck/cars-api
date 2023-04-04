package com.cars.api.dto;

public record carsDTO(
    String model, 
    String manufacturer, 
    String manufacturingDate, 
    Double value, 
    Integer modelYear
) {
    
}
