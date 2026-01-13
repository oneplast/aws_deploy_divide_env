package io.river.aws_deploy_divide_env.global.jpa.entity

import io.river.aws_deploy_divide_env.standard.util.Ut
import jakarta.persistence.*

@MappedSuperclass
abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var _id: Long? = null

    val id: Long
        get() = _id ?: 0

    val modelName: String
        get() = Ut.str.lcfirst(this::class.simpleName!!)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is BaseEntity) return false

        if (modelName != other.modelName) return false

        return id == other.id
    }

    override fun hashCode(): Int {
        return _id?.hashCode() ?: 0
    }
}