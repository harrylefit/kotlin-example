package vn.eazy.kotlin.example.model

/**
 * Created by harryle on 6/4/17.
 */
data class User(val name: String = "", val age: Int = 0) {
    operator fun plus(u: User) = User(name, age + u.age)
}
