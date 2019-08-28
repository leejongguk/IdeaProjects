package iBatis1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import iBatis1.model.Member;
import iBatis1.service.MemberService;

@Controller
public class MemberController {
    @Autowired
    private MemberService ms;

    @RequestMapping("joinForm.do")
    public String joinForm() {
        return "joinForm";
    }

    @RequestMapping("idChk.do")
    public String idChk(String id, Model model) {
        Member member = ms.select(id);
        if (member == null)
            model.addAttribute("msg", "사용 가능합니다.");
        else
            model.addAttribute("msg", "사용중 입니다.");
        return "idChk";
    }

    @RequestMapping("join.do")
    public String join(Member member, Model model) {
        int result = ms.insert(member);
        model.addAttribute("member", member);
        model.addAttribute("msg", "가입실패");
        return "main";
    }
}