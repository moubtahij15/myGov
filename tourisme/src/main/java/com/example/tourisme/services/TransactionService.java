package com.example.tourisme.services;


import com.example.tourisme.entities.Departement;
import com.example.tourisme.entities.Transaction;
import com.example.tourisme.repository.DepartementRepo;
import com.example.tourisme.repository.TransactionRepo;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    FinanceRestService financeRestService;
    TransactionRepo transactionRepo;
    DepartementRepo departementRepo;


    public TransactionService(FinanceRestService financeRestService, TransactionRepo transactionRepo, DepartementRepo departementRepo) {
        this.financeRestService = financeRestService;
        this.transactionRepo = transactionRepo;
        this.departementRepo = departementRepo;
    }

    public Transaction save(Transaction transaction) {
        try {

            transactionRepo.save(transaction);
            financeRestService.save(transaction);


        } catch (Exception e) {
            throw e;
        }
        return transaction;

    }

}
