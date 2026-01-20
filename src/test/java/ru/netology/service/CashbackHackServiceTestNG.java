import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTestNG {
    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(900), 100);
        Assert.assertEquals(service.remain(0), 1000);  // Ошибочный кейс
    }
}
