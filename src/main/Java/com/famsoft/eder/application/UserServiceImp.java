package com.famsoft.eder.application;

import com.famsoft.eder.data.ExpenseDao;
import com.famsoft.eder.data.UserDao;
import com.famsoft.eder.model.Expense;
import com.famsoft.eder.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */

@Service
@Transactional
public class UserServiceImp extends GenericServiceImp<User> implements UserService {

    @Autowired
    public UserServiceImp(UserDao userDao) {
        super(userDao);
    }
}
