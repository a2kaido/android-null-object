package io.github.a2kaido.nullobject

abstract class NullParent {
    val `null` = Null
}

object Null : NullParent()
