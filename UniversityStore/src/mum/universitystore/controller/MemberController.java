package mum.universitystore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import mum.universitystore.model.Member;
import mum.universitystore.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({ "/members" })
public class MemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping
	public String listMembers(Model model) {
		model.addAttribute("members", memberService.findAll());
		return "members";
	}

	@RequestMapping("/{memberNumber}")
	public String getMemberById(
			@PathVariable("memberNumber") Long memberNumber, Model model) {
		Member member = memberService.findByMemberNumber(memberNumber);
		model.addAttribute("member", member);
		return "member";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String getAddNewMemberForm(
			@ModelAttribute("newMember") Member newMember) {
		return "addMember";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewMemberForm(
			@ModelAttribute("newMember") @Valid Member memberToBeAdded,
			BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "addMember";
		}
		memberService.saveAll(memberToBeAdded);
		return "redirect:/members";
	}

}
