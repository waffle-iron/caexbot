package caexbot.commands;

import java.util.Arrays;
import java.util.List;

import net.dv8tion.jda.entities.TextChannel;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

public class ShutdownCommand extends CaexCommand {

	@Override
	public void process(String[] args, User author, TextChannel channel, MessageReceivedEvent event) {
		channel.sendMessage("if you insist boss.... *blerg*");
		System.exit(0);
	}

	@Override
	public String getUsage() {
		return getPrefix()+"sleep (requires permision)";
	}

	@Override
	public List<String> getAlias() {
		return Arrays.asList("sleep");
	}

	@Override
	public String getDescription() {
		return "kill Caex!";
	}
	
	@Override
	public List<String> getRoleRequirements() {
		return Arrays.asList("DMs");
	}
}
