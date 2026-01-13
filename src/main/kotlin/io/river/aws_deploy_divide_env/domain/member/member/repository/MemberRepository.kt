package io.river.aws_deploy_divide_env.domain.member.member.repository

import io.river.aws_deploy_divide_env.domain.member.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>