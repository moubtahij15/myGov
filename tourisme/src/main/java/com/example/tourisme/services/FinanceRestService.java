package com.example.tourisme.services;


import com.example.tourisme.entities.Transaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

@FeignClient(name = "FINANCE-SERVICE-ELASTICSEARCH")
public interface FinanceRestService {
    @PostMapping(path = "/transactions")
    Transaction save(@RequestBody Transaction transaction);
}
