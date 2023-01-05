import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.task_3.ProxyImage;

public class Task3Test {
    @Test
    public void testProxyImage(){
        ProxyImage proxyImage = new ProxyImage("autumn.jpg");
        Assertions.assertNull(proxyImage.getRealImage());
        Assertions.assertEquals("autumn.jpg", proxyImage.getFilename());

        proxyImage.display();
        Assertions.assertNotNull(proxyImage.getRealImage());
        Assertions.assertEquals("autumn.jpg", proxyImage.getFilename());
    }
}
