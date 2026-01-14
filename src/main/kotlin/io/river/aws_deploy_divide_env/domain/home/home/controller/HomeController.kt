package io.river.aws_deploy_divide_env.domain.home.home.controller

import io.river.aws_deploy_divide_env.domain.member.member.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(
    private val memberService: MemberService
) {

    @GetMapping("/")
    fun main() = "회원 수 : ${memberService.count()}명"
}