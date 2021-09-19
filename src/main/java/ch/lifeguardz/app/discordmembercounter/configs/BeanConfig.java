package ch.lifeguardz.app.discordmembercounter.configs;

import ch.lifeguardz.app.discordmembercounter.listeners.DiscordListener;
import ch.lifeguardz.app.discordmembercounter.services.FileService;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig
{
    private final DiscordConfig discordConfig;

    @Autowired
    public BeanConfig(
        final DiscordConfig discordConfig
    )
    {
        this.discordConfig = discordConfig;
    }

    @Bean
    public JDA jda() throws LoginException, InterruptedException
    {
        JDA jda = JDABuilder.createDefault(discordConfig.getBotToken())
            .addEventListeners(discordGuildMemberListener())
            .enableIntents(GatewayIntent.GUILD_MEMBERS)
            .build();

        jda.awaitReady();

        return jda;
    }

    @Bean
    public DiscordListener discordGuildMemberListener()
    {
        return new DiscordListener(fileService());
    }

    @Bean
    public FileService fileService()
    {
        return new FileService();
    }
}
