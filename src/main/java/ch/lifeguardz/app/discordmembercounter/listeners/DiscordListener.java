package ch.lifeguardz.app.discordmembercounter.listeners;

import ch.lifeguardz.app.discordmembercounter.enums.TextFile;
import ch.lifeguardz.app.discordmembercounter.services.FileService;
import net.dv8tion.jda.api.events.guild.GenericGuildEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiscordListener extends ListenerAdapter
{
    private final FileService fileService;

    @Autowired
    public DiscordListener(final FileService fileService)
    {
        this.fileService = fileService;
    }

    @Override
    public void onGuildMemberRemove(GuildMemberRemoveEvent event)
    {
        updateTotalChannelMembersFile(event);
    }

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event)
    {
        updateTotalChannelMembersFile(event);
        updateLastJoinedChannelMemberFile(event);
    }

    private void updateTotalChannelMembersFile(GenericGuildEvent event)
    {
        fileService.writeFile(TextFile.TOTAL_CHANNEL_MEMBERS, String.valueOf(event.getGuild().getMemberCount()));
    }

    private void updateLastJoinedChannelMemberFile(GuildMemberJoinEvent event)
    {
        fileService.writeFile(TextFile.LAST_JOINED_CHANNEL_MEMBER_NAME, event.getMember().getEffectiveName());
    }
}
