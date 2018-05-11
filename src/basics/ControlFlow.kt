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
}