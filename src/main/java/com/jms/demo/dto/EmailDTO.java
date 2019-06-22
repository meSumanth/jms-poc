/**
 * 
 */
package com.jms.demo.dto;

/**
 * @author Sumanth
 *
 */
public class EmailDTO {
	
	private String to;
	
	private String body;
	
	public EmailDTO()
	{
		
	}

	public EmailDTO(String to, String body) 
	{
		this.to = to;
		this.body = body;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmailDTO [to=");
		builder.append(to);
		builder.append(", body=");
		builder.append(body);
		builder.append("]");
		return builder.toString();
	}
	
}
