
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void testCalculateRegistered() {
        BonusService bonusService = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = bonusService.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateRegisteredWithLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateNotRegistered() {
        BonusService bonusService = new BonusService();
        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = bonusService.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateNotRegisteredWithLimit() {
        BonusService bonusService = new BonusService();
        long amount = 100000;
        boolean registered = false;
        long expected = 500;
        long actual = bonusService.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}


