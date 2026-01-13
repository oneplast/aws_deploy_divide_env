package io.river.aws_deploy_divide_env

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class AwsDeployDivideEnvApplication

fun main(args: Array<String>) {
    runApplication<AwsDeployDivideEnvApplication>(*args)
}
