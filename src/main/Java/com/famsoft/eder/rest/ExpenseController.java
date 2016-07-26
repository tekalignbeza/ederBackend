package com.famsoft.eder.rest;

import com.famsoft.eder.application.ExpenseService;
import com.famsoft.eder.application.GenericService;
import com.famsoft.eder.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tekalign.bezawork on 4/22/16.
 */

@RestController
@RequestMapping(value = "/expense")
public class ExpenseController extends GenericController<Expense> {

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        super(expenseService);
    }
}
