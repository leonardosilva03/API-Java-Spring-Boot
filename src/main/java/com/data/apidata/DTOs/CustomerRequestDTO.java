package com.data.apidata.DTOs;

import java.time.LocalDate;

public record CustomerRequestDTO (
    String name,
    String document,
    String socialName,
    String email,
    String image,
    String telephone,
    String gender,
    String lastPurchaseDate,
    String birthDate
){
    
}
