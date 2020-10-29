import java.util.*

class Rachunek(firma: Firma, zakupy: List<Zakup>, val sprzedawca: Sprzedawca, val osoba: String ): DowodPlatnosci(firma, zakupy)
{

    val suma: Double = zakupy.map { it.koszt }.sum()
    val numer: Int = Rabat.numerRachunku

    init
    {
        Rabat.zwiekszNumerRachunku()
    }
    override fun Drukuj()
    {
        println("----------------------------------"+Rachunek::class.qualifiedName+" "+numer+" "+firma+" "+data)
        for (i in zakupy) {
            print(i)
        }
        println("sprzedawca: "+ sprzedawca +"\n"+"kupujący: "+ osoba +"\n"+"suma wynosi: "+String.format("%.2f",suma)+" złotych"+"----------------------------------")
    }
}