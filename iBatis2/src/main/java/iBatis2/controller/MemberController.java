package iBatis2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import iBatis2.model.Member;
import iBatis2.service.MemberService;

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
		if (result > 0)
			return "redirect:main.do";
		model.addAttribute("member", member);
		model.addAttribute("msg", "똑바로 해");
		return "joinForm";
	}

	@RequestMapping("main.do")
	public String main() {
		return "main";
	}

	@RequestMapping("loginForm.do")
	public String loginForm() {
		return "loginForm";
	}

	@RequestMapping("login.do")
	public String login(String id, String password, Model model, HttpSession session) {
		int result = ms.loginChk(id, password);
		if (result > 0) {
			session.setAttribute("id", id);
			return "main";
		} else if (result == 0)
			model.addAttribute("msg", "암호 똑바로 입력해~!!");
		else
			model.addAttribute("msg", "넌 누구냐~!!");
		model.addAttribute("id", id);
		return "loginForm";
	}

	@RequestMapping("updateForm.do")
	public String updateForm(Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Member member = ms.select(id);
		model.addAttribute("member", member);
		return "updateForm";
	}

	@RequestMapping("update.do")
	public String update(Member member, Model model) {
		int result = ms.update(member);
		model.addAttribute("result", result);
		return "update";
	}

	@RequestMapping("delete.do")
	public String delete(HttpSession session, Model model) {
		String id = (String) session.getAttribute("id");
		int result = ms.delete(id);
		if (result > 0)
			session.invalidate();
		model.addAttribute("result", result);
		return "delete";
	}

	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logout";
	}
}