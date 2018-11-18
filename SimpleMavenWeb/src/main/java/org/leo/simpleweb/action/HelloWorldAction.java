package org.leo.simpleweb.action;

import org.leo.simpleweb.domain.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	
	private static final long serialVersionUID = 11231231241241L;
	
	private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore() ;
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

}
