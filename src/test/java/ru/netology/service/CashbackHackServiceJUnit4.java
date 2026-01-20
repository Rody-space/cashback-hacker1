import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceJUnit4 {
    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(100, service.remain(900));
        assertEquals(1000, service.remain(0));  // Ошибочный кейс
    }
}
