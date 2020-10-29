import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

abstract class DowodPlatnosci (val firma: Firma, val zakupy: List<Zakup>)
{
    val data: String = (LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy:dd:MM")))
    abstract fun Drukuj()
}

