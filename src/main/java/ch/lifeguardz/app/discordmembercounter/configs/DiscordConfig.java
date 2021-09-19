package ch.lifeguardz.app.discordmembercounter.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties("discord")
@Validated
@Data
public class DiscordConfig
{
    private String botToken;
    private String channelId;
}
