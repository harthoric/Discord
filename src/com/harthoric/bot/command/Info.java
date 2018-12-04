package com.harthoric.bot.command;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class Info implements CommandExecutor {

	@Command(aliases = "?info", description = "Displays information about the bot.", usage = "?info [user]")
    public String onInfoCommand(String[] args) {
        return "This is a super duper bot";
    }

}
