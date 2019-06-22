/**
 * 
 */
package com.jms.demo.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.jms.demo.dto.EmailDTO;

/**
 * @author Sumanth
 *
 */

@Component
public class Receiver {
	
	@JmsListener(destination = "receiver", containerFactory = "myFactory")
	public void receiveMessage(EmailDTO email)
	{
        System.out.println("Received <" + email + ">");
	}

}
