package com.famsoft.eder.data;

import com.famsoft.eder.model.Expense;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */

@Repository
public class ExpenseDaoImp extends GenericDaoImp<Expense> implements ExpenseDao {


    public ExpenseDaoImp() {
        super(Expense.class);
    }
}
