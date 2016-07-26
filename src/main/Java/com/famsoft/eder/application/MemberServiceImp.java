package com.famsoft.eder.application;

import com.famsoft.eder.data.GenericDao;
import com.famsoft.eder.data.MemberDao;
import com.famsoft.eder.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tekalign.bezawork on 4/22/16.
 */

@Service
@Transactional
public class MemberServiceImp extends GenericServiceImp<Member> implements MemberService {

    MemberDao memberDao;

    @Autowired
    public MemberServiceImp(MemberDao memberDao) {
        super(memberDao);
        this.memberDao = memberDao;
    }

    @Override
    public Member get(long id) {
        return removeUser(memberDao.get(id));
    }

    @Override
    public List<Member> getAll() {
        List<Member> ret = new ArrayList<>();
        for (Member member : genericDao.getAll()) {
            ret.add(removeUser(member));
        }
        return ret;
    }

    public Member removeUser(Member member) {
        member.setUser(null);
        return member;
    }
}
