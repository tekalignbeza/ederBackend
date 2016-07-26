package com.famsoft.eder.application;

import com.famsoft.eder.data.ExpenseDao;
import com.famsoft.eder.data.GenericDao;
import com.famsoft.eder.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */

@Service
@Transactional
public class ExpenseServiceImp extends GenericServiceImp<Expense> implements ExpenseService {

    @Autowired
    public ExpenseServiceImp(ExpenseDao expenseDao) {
        super(expenseDao);
    }
}
