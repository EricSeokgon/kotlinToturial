fun main(args: Array<String>) {
    // Traditional usage
    var max = a
    if (a < b) max = b

// With else
    var max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }

// As expression
    val max = if (a > b) a else b


    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }

    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }

    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }

    when (x) {
        parseInt(s) -> print("s encodes x")
        else -> print("s does not encode x")
    }

    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }

    when {
        x.isOdd() -> print("x is odd")
        x.isEven() -> print("x is even")
        else -> print("x is funny")
    }

    for (item in collection) print(item)

    for (item: Int in ints) {
        // ...
    }


}