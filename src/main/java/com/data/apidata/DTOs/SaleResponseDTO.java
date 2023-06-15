package com.data.apidata.DTOs;

import com.data.apidata.model.Customer;
import com.data.apidata.model.Product;
import com.data.apidata.model.Sale;
import com.data.apidata.model.Supplier;

import java.time.LocalDate;
import java.util.List;

public record SaleResponseDTO(
    Long id,
    Supplier supplier,
    Customer customer,
    List<Product> products,
    Float value,
    Boolean payed,
    LocalDate createdAt,
    LocalDate updatedAt,
    LocalDate deletedAt
) {
    public SaleResponseDTO (Sale sale) {
        this(
            sale.getId(),
            sale.getSupplier(),
            sale.getCustomer(),
            sale.getProducts(),
            sale.getSaleValue(),
            sale.getPayed(),
            sale.getCreatedAt(),
            sale.getUpdatedAt(),
            sale.getDeletedAt()
        );
    }
}
