package com.famsoft.eder.data;

import com.famsoft.eder.model.Expense;
import com.famsoft.eder.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */

@Repository
public class UserDaoImp extends GenericDaoImp<User> implements UserDao {


    public UserDaoImp() {
        super(User.class);
    }
}
