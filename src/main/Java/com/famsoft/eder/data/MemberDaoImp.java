package com.famsoft.eder.data;

import com.famsoft.eder.model.Member;
import org.springframework.stereotype.Repository;

/**
 * Created by tekalign.bezawork on 4/22/16.
 */

@Repository
public class MemberDaoImp extends GenericDaoImp<Member> implements MemberDao{

    public MemberDaoImp() {
        super(Member.class);
    }
}
