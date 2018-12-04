package com.harthoric.bot.connect;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import de.btobastian.sdcf4j.CommandExecutor;
import de.btobastian.sdcf4j.CommandHandler;
import de.btobastian.sdcf4j.handler.JavacordHandler;

public class Bot {

	private final String TOKEN = "";
	private DiscordApi discordAPI;

	public Bot() {
		discordAPI = new DiscordApiBuilder().setToken(TOKEN).login().join();
		discordAPI.addMessageCreateListener(new MessageCreateListener() {
			@Override
			public void onMessageCreate(MessageCreateEvent event) {
				event.getMessageAuthor().asUser().get().sendMessage(event.getMessageAuthor().getName());
			}
		});
	}

	public void loadCommand(CommandExecutor command) {
		CommandHandler handler = new JavacordHandler(discordAPI);
		handler.registerCommand(command);
	}

}
