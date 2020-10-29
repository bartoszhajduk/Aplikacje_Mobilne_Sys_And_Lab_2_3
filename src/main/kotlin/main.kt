import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.AbstractCollection

fun main(args: Array<String>)
{
    val pomidory = Produkt("pomidory",11.0,17)
    val orzechy = Produkt("orzechy",5.0,17)
    val truskawki = Produkt("truskawki",7.5,17)

    val zakupy_1 = Zakup(pomidory, 3, Rabat.poziomRabat[0])
    val zakupy_2 = Zakup(orzechy, 6, Rabat.poziomRabat[1])
    val zakupy_3 = Zakup(truskawki, 9, Rabat.poziomRabat[2])


    val paragon_0 = Paragon(Firma.RTVAGD, listOf(zakupy_1,zakupy_2), Sprzedawca.kasjer_1)
    val paragon_1 = Paragon(Firma.morele, listOf(zakupy_1,zakupy_3), Sprzedawca.kasjer_2)

    val rachunek_0 = Rachunek(Firma.xkom, listOf(zakupy_1,zakupy_2, zakupy_3), Sprzedawca.kasjer_3, "Tomasz Kejsura")

    val faktura_0 = Faktura(Firma.RTVAGD, listOf(zakupy_1,zakupy_2, zakupy_3), Sprzedawca.kasjer_3, "Karol Karolski","1020340560")

    val lista = listOf(paragon_0, paragon_1, rachunek_0, faktura_0)

    for(dowod in lista)
    {
        dowod.Drukuj()
    }

}
