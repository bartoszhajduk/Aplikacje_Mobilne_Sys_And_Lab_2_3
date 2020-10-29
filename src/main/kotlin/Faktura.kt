import java.util.*

class Faktura(firma: Firma, zakupy: List<Zakup>, val sprzedawca: Sprzedawca, val osoba: String, val nip: String): DowodPlatnosci(firma, zakupy)
{
    val suma: Double = zakupy.map { it.koszt }.sum()
    val numer: Int = Rabat.numerFaktury

    init
    {
        Rabat.zwiekszNumerFaktury()
    }
    override fun Drukuj()
    {
        println("----------------------------------"+Faktura::class.qualifiedName+" "+numer+" "+firma+" "+data)
        for (i in zakupy) {
            print(i)
        }
        println("sprzedawca: "+ sprzedawca +"\n"+"kupujący: "+ osoba +"\n"+"numer NIP: "+ nip +"\n"+"suma wynosi: "+String.format("%.2f",suma)+" złotych"+"----------------------------------")
    }
}