import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import ua.edu.ucu.task_2.BirthdayMail;
import ua.edu.ucu.task_2.Client;
import ua.edu.ucu.task_2.Gender;
import ua.edu.ucu.task_2.GiftMail;

public class Task2Test {
    private Client client = new Client("Bob", Gender.MALE, 34, "bob@mail.com");

    @Test
    public void testClient() {
        Assertions.assertEquals("Bob", client.getName());
        Assertions.assertEquals(Gender.MALE, client.getSex());
        Assertions.assertEquals(34, client.getAge());
        Assertions.assertEquals("bob@mail.com", client.getEmail());
    }

    @Test
    public void testGiftMail() {
        GiftMail giftMail = new GiftMail();
        Assertions.assertEquals("BLACK FRIDAY! Bob receive your discount right now!", giftMail.generate(client));
    }

    @Test
    public void testBirthdayMail() {
        BirthdayMail birthdayMail = new BirthdayMail();
        Assertions.assertEquals("Happy 34-th Birthday Bob!!!", birthdayMail.generate(client));
    }
}
