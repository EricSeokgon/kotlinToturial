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
}