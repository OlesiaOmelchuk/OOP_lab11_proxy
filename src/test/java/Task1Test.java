import org.junit.Test;
import ua.edu.ucu.task_1.Gender;
import ua.edu.ucu.task_1.Human;
import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.task_1.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1Test {
    @Test
    public void testHuman() {
        Human girl = Human.builder().name("Alice").build();
        Assertions.assertEquals("Human(name=Alice)", girl.toString());
        Assertions.assertEquals("Alice", girl.getName());

        Human anonymous = Human.builder().build();
        Assertions.assertEquals(null, anonymous.getName());
    }

    @Test
    public void testUser() {
        User u1 = User.builder().name("Bob")
                .age(24)
                .height(191)
                .gender(Gender.MALE)
                .occupation("happy person")
                .build();
        Assertions.assertEquals("User(age=24, gender=MALE, weight=0.0, height=191.0, occupations=[happy person])", u1.toString());

        List<String> positions = Arrays.asList("programmer", "teacher", "student", "cook");
        User hardworker = User.builder().occupations(positions).build();
        Assertions.assertEquals(positions, hardworker.getOccupations());

        User smortworker = User.builder().occupation("java developer").build();
        Assertions.assertEquals("[java developer]", smortworker.getOccupations().toString());
    }
}
