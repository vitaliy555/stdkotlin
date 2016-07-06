package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product> get() {
    // Return all products ordered by customer
//    return this.
//    todoCollectionTask()
    return orders.flatMap { it.products }.toSet()
}


val Shop.allOrderedProducts: Set<Product> get() {
    // Return all products that were ordered by at least one customer
//    todoCollectionTask()
    var result = mutableSetOf<Product>()
    for (customer in customers) {
        result.addAll(customer.orders.flatMap { it.products })
    }
    return result
}
