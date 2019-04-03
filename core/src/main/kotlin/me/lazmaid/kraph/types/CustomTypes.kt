package me.lazmaid.kraph.types

/**
 * Support for enums that don't match Kotlin enum naming.
 */
data class KraphEnumLikeType(val value: String)

data class KraphVariableType(val value: String)

data class KraphVariable(val name: String, val type: KraphVariableType, val jsonValue: String) {
    val dollarName: String
        get() = "\$$name"
}