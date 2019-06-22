/**
 * 
 */
package com.jms.demo.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jms.demo.dto.EmailDTO;

/**
 * @author Sumanth
 *
 */

@RestController
public class ClientController {
	
	@Autowired 
	private JmsTemplate jmsTemplate;
	
	
	@PostMapping("/send")
	public void send(@RequestBody EmailDTO emailDTO)
	{
		System.out.println("Sending a message.");
		jmsTemplate.convertAndSend("receiver", emailDTO);
	}

}
