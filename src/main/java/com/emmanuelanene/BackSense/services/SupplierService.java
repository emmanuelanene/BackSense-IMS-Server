package com.emmanuelanene.BackSense.services;

import com.emmanuelanene.BackSense.dtos.Response;
import com.emmanuelanene.BackSense.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}
