package ch.lifeguardz.app.discordmembercounter.listeners;

import ch.lifeguardz.app.discordmembercounter.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StartupListener implements ApplicationListener<ApplicationReadyEvent>
{
    private final FileService fileService;

    @Autowired
    public StartupListener(final FileService fileService)
    {
        this.fileService = fileService;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event)
    {
        fileService.createFiles();
    }
}
