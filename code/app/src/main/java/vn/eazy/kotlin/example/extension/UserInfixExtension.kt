package vn.eazy.kotlin.example.extension

import vn.eazy.kotlin.example.model.User

/**
 * Created by harryle on 6/4/17.
 */
infix fun User.combine(u: User): User {
    val user = User(name + "/" + u.name, age = age + u.age)
    return user
}