import java.util.*

class Paragon(firma: Firma, zakupy: List<Zakup>, val sprzedawca: Sprzedawca ): DowodPlatnosci(firma, zakupy)
{
    val suma: Double = zakupy.map { it.koszt }.sum()
    val numer: Int = Rabat.numerParagonu

    init
    {
        Rabat.zwiekszNumerParagonu()
    }
    override fun Drukuj()
    {
        println("----------------------------------"+Paragon::class.qualifiedName+" "+numer+" "+firma+" "+data)
        for (i in zakupy) {
            print(i)
        }
        println("sprzedawca: "+ sprzedawca +"\n"+"suma wynosi: "+String.format("%.2f",suma)+" złotych"+"----------------------------------")
    }
}
