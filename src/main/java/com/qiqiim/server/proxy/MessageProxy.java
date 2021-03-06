/**
 ***************************************************************************************
 *  @Author     1044053532@qq.com   
 *  @License    http://www.apache.org/licenses/LICENSE-2.0
 ***************************************************************************************
 */
package com.qiqiim.server.proxy;

import com.qiqiim.server.model.MessageWrapper;
import com.qiqiim.server.model.proto.MessageProto;
import com.qiqiim.webserver.user.model.UserMessageEntity;

public interface MessageProxy {

    MessageWrapper  convertToMessageWrapper(String sessionId ,MessageProto.Model message);
    /**
     * 保存在线消息
     * @param message
     */
    void  saveOnlineMessageToDB(MessageWrapper message);
    /**
     * 保存离线消息
     * @param message
     */
    void  saveOfflineMessageToDB(MessageWrapper message);
}

