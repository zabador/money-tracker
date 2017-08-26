package net.zabador.money

/**
 * Created by Skye Schneider. The mad king of Domino's
 * in the year of our Lord 8/25/17.
 */

class Transaction(var date: String, var place: String, var amount: String) {

    val saveString: String
        get() = "$date|$place|$amount"
}
