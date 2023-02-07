package com.example.tourisme.web;


import com.example.tourisme.entities.Transaction;
import com.example.tourisme.repository.TransactionRepo;
import com.example.tourisme.services.FinanceRestService;
import com.example.tourisme.services.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class TransactionsRest {
    TransactionService transactionService;

    public TransactionsRest(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/transaction")
    Transaction transactions(@RequestBody Transaction transaction) {

        return transactionService.save(transaction);
    }
}
