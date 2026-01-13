package io.river.aws_deploy_divide_env.standard.util

object Ut {
    object str {
        @JvmStatic
        fun lcfirst(str: String): String {
            return str[0].lowercaseChar() + str.substring(1)
        }
    }
}