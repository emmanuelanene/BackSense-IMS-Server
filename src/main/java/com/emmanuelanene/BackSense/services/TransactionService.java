package com.emmanuelanene.BackSense.services;

import com.emmanuelanene.BackSense.dtos.Response;
import com.emmanuelanene.BackSense.dtos.TransactionRequest;
import com.emmanuelanene.BackSense.enums.TransactionStatus;

public interface TransactionService {
    Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);
}
