package org.csu.session;

import org.csu.exception.SessionException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author by bixi.lx
 * @created on 2018 01 06 23:23
 */
public interface ISessionManager {

    /**
     * 根据sessionId获取相应的会话对象
     * @param sessionId
     * @return
     * @throws SessionException
     */
    ISession getSession(String sessionId, HttpServletRequest request, HttpServletResponse response) throws SessionException;

    /**
     * 为每个用户创建一个会话
     * @param staffId
     * @param request
     * @param response
     * @return
     * @throws SessionException
     */
    ISession createStaffSession(Long staffId, HttpServletRequest request, HttpServletResponse response) throws SessionException;

    /**
     * 这个是模拟会话，只适合开发模式
     * @param sessionId
     * @param request
     * @param response
     * @return
     * @throws SessionException
     */
    ISession simulateStaffSession(String sessionId, HttpServletRequest request, HttpServletResponse response) throws SessionException;
}
