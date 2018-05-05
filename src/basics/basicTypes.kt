fun main(args: Array<String>) {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    val a: Int = 10000
    print(a === a) // Prints 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print(boxedA === anotherBoxedA) // !!!Prints 'false'!!!

    val a: Int = 10000
    print(a == a) // Prints 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print(boxedA == anotherBoxedA) // Prints 'true'

    // Hypothetical code, does not actually compile:
    val a: Int? = 1 // A boxed Int (java.lang.Integer)
    val b: Long? = a // implicit conversion yields a boxed Long (java.lang.Long)
    print(a == b) // Surprise! This prints "false" as Int's equals() checks whether the other is Long as well
}