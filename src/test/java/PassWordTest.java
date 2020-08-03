import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Jack_Dong@enable-ets.com
 * @Date: 2020/8/3 11:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PassWordTest.class)
public class PassWordTest {

    @Test
    public void passWordEncoding(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String passWord = bCryptPasswordEncoder.encode("123");
        System.out.println("password:"+passWord);
    }
}
