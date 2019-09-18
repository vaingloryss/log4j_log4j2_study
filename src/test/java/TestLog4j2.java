import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * log4j2简单使用
 * log4j2的类放在org.apache.logging.log4j包下
 * log4j2在整合commons-logging时需要引入log4j-jcl包
 */
public class TestLog4j2 {

    private static Log log;//日志门面
    private static Logger logger;

    @BeforeClass
    public static void testInit(){
        log = LogFactory.getLog(TestLog4j2.class);
        logger = LogManager.getLogger(TestLog4j2.class.getName());
    }

    /**
     * 不使用日志门面
     */
    @Test
    public void test01(){
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("基本信息");
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命错误");
    }

    /**
     * 使用门面commons.logging
     */
    @Test
    public void test02(){
        log.trace("跟踪信息");
        log.debug("调试信息");
        log.info("基本信息");
        log.warn("警告信息");
        log.error("错误信息");
        log.fatal("致命错误");
    }
}
