/**
 ***************************************************************************************
 *  @Author     1044053532@qq.com   
 *  @License    http://www.apache.org/licenses/LICENSE-2.0
 ***************************************************************************************
 */
package com.qiqiim.server.session;

import io.netty.channel.ChannelHandlerContext;

import java.util.Set;

import com.qiqiim.server.model.MessageWrapper;
import com.qiqiim.server.model.Session;
 
public interface SessionManager {

    /**
     * 添加指定session
     *
     * @param session
     */
    void addSession(Session session);

    void updateSession(String sessionId);
 

    /**
     * 删除指定session
     *
     * @param session
     */
    void removeSession(Session session);

    /**
     * 删除指定session
     *
     * @param sessionId
     */
    void removeSession(String sessionId);

    /**
     * 根据指定sessionId获取session
     *
     * @param sessionId
     * @return
     */
    Session getSession(String sessionId);

    /**
     * 获取所有的session
     *
     * @return
     */
    Session[] getSessions();

    /**
     * 获取所有的session的id集合
     *
     * @return
     */
    Set<String> getSessionKeys();

    /**
     * 获取所有的session数目
     *
     * @return
     */
    int getSessionCount();
 
    Session createSession(MessageWrapper wrapper, ChannelHandlerContext ctx);
    
    boolean exist(String sessionId) ;
    

   
}
