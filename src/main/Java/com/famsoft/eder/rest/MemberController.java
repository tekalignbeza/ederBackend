package com.famsoft.eder.rest;

/**
 * Created by tekalign.bezawork on 4/22/16.
 */

import com.famsoft.eder.application.GenericService;
import com.famsoft.eder.application.MemberService;
import com.famsoft.eder.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/member")
public class MemberController extends GenericController<Member> {
    @Autowired
    public MemberController(MemberService memberService) {
        super(memberService);
    }

    //    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public @ResponseBody String create(@RequestParam String userName, @RequestParam String password){
//      //genericService.login
//    }

}
