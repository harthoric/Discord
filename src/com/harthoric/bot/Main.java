package com.harthoric.bot;

import com.harthoric.bot.command.Info;
import com.harthoric.bot.connect.Bot;

public class Main {
	
	public static void main(String args[]) {
		Bot bot = new Bot();
		bot.loadCommand(new Info());
	}

}
