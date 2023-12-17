import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void dataTest() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime nuovaData = data.plusYears(1).minusMonths(1).plusDays(7);
        String risultato= nuovaData.format(DateTimeFormatter.ofPattern("dd/MM/yy", Locale.ITALY));

        assertEquals("08/02/24",risultato);

    }
}