import com.guanyun.springboot.Controller.HelloWorldController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * HelloWorldControllerTest class
 *
 * @description: helloword junit测试
 * @author: hef
 * @date 2018/11/29 0029
 * @time 10:05
 */
public class HelloWorldControllerTest {

    @Test
    public void testSayHelloWorld(){
        //对比字符串符合就显示
        assertEquals("Hello World!",new HelloWorldController().sayHelloWorld());
    }
}
