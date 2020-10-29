class Produkt (val nazwa: String, val netto: Double, val vat: Int)
{
    var brutto: Double = (netto + (vat/100.0)*netto)
}