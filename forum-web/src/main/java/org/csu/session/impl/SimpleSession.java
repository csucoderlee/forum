package org.csu.session.impl;

import org.csu.session.ISession;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author by bixi.lx
 * @created on 2018 01 07 21:56
 */
public class SimpleSession implements ISession{

    private final Map<String, Serializable> session;

    private String sessionId;

    public SimpleSession(String sessionId) {
        this.sessionId = sessionId;
        session = Collections.synchronizedMap( new HashMap<String, Serializable>());
    }
}
