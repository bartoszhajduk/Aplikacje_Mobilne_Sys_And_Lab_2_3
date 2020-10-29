class Zakup(val produkt: Produkt, val ilosc: Int, val rabat: Int)
{
    val uzyskanyRabat = ilosc*produkt.brutto*((rabat/100.0))
    val koszt: Double = ilosc*(produkt.brutto - produkt.brutto*((rabat/100.0)))

    override fun toString(): String {
        return produkt.nazwa + " ilość: " +ilosc+", "+"koszt: "+String.format("%.2f",koszt)+" złotych, "+"uzyskany rabat: "+String.format("%.2f",uzyskanyRabat)+"\n"
    }
}