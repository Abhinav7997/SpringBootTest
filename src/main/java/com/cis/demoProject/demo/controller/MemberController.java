package com.cis.demoProject.demo.controller;



import com.cis.demoProject.demo.model.Member;
import com.cis.demoProject.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    // GET a member by ID
    @GetMapping("/{memberId}")
    public Member getMember(@PathVariable Long memberId) {
        return memberService.getMember(memberId);
    }

    // Create a member
    @PostMapping
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    // Update a member
    @PutMapping("/{memberId}")
    public Member updateMember(@PathVariable Long memberId, @RequestBody Member member) {
        return memberService.updateMember(memberId, member);
    }

    // Delete a member
    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Long memberId) {
        memberService.deleteMember(memberId);
    }
}
