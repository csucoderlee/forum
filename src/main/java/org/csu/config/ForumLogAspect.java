package org.csu.config;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author by bixi.lx
 * @created on 2017 12 16 23:28
 */
@Aspect
@Component
public class ForumLogAspect {

    private Logger logger = Logger.getLogger(this.getClass());

    @Around("@annotation(forumLogTag)")
    public Object arround(ProceedingJoinPoint point, ForumLogTag forumLogTag) {
        ForumLog forumLog = new ForumLog();
        forumLog.setTitle(forumLogTag.value());
        forumLog.setError(false);
        forumLog.setErrMsg("");
        long start = System.currentTimeMillis();
        forumLog.setStart(new Date(start));

        Object result = null;

        logger.info(String.format("执行逻辑出错[%s]", forumLog.getTitle()));
        try {
            result = point.proceed();
        } catch (Throwable e) {
            forumLog.setErrMsg(StringUtils.trimToEmpty(ExceptionUtils.getStackTrace(e)));
            forumLog.setError(true);
            logger.error("报表计算失败！" + e.getMessage(), e);
        } finally {
            long end = System.currentTimeMillis();
            forumLog.setEnd(new Date(end));
            forumLog.setCost(end - start);

            logger.info(String.format("执行逻辑出错[%s]，计算结果：%s", forumLog.getTitle(), forumLog.toString()));
        }

        return result;
    }
}
