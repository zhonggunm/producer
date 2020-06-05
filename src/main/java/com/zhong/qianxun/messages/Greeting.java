package com.zhong.qianxun.messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {
	
	private String msg;
	private String name;

	
	@Override
	public String toString() {
		return "Name is: " + name + "Msg is: " + msg + ".\n";
	}
}
