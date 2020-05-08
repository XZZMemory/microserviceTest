import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.ExceptionUtils;
import org.junit.Test;

@Slf4j
public class LoggerTest {
    @Test
    public void test1() {
        try {
            int[] data = new int[1];
            System.out.println(data[2]);
        } catch (Exception e) {
            log.warn("code:{], message:{}", 500, "查询业务异常", "怎么回事？");
        }
    }

    @Test
    public void test2() {
        try {
            int[] data = new int[1];
            System.out.println(data[2]);
        } catch (Exception e) {
            log.warn("code:{}, message:{}, e:{}", 500, "查询业务异常", JSON.toJSONString(e));
        }
    }

    @Test
    public void test3() {
        try {
            int[] data = new int[1];
            System.out.println(data[2]);
        } catch (Exception e) {
            log.warn("code:{}, message:{}, e:{}", 500, "查询业务异常", e);
        }
    }
    /*
    https://blog.csdn.net/w605283073/article/details/93927159
    使用org.slf4j.Logger#warn(java.lang.String, java.lang.Object...)时，最后一个参数如果是异常可自动追加到日志中。*/
    @Test
    public void test4() {
        try {
            int[] data = new int[1];
            System.out.println(data[2]);
        } catch (Exception e) {
            log.warn("code:{}, message:{}", 500, "查询业务异常",e);
        }
    }
}
