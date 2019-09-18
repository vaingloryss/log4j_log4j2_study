import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * log4j1的简单使用
 * log4j1的类放在org.apache.log4j包下
 */
public class TestLog4j1 {

    private static Log log;
    private static Logger logger;

    @BeforeClass
    public static void testInit(){
        //不使用logging门面
        logger = Logger.getLogger(TestLog4j1.class.getName());
        //使用logging门面
        log = LogFactory.getLog(TestLog4j1.class.getName());
    }
    /**
     * 当前日志级别为info，只打印出info及以上级别的日志信息
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
