package io.river.aws_deploy_divide_env.domain.member.member.service

import io.river.aws_deploy_divide_env.domain.member.member.entity.Member
import io.river.aws_deploy_divide_env.domain.member.member.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    fun count(): Long {
        return memberRepository.count()
    }

    fun save(username: String, password: String, name: String): Member {
        return memberRepository.save(Member(username, password, name))
    }
}