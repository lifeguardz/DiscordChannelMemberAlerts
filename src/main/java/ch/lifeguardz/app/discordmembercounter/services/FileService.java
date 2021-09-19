package ch.lifeguardz.app.discordmembercounter.services;

import ch.lifeguardz.app.discordmembercounter.enums.TextFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class FileService
{
    public void createFiles()
    {
        Arrays.stream(TextFile.values()).forEach(textFile -> writeFile(textFile, ""));
    }

    public void writeFile(final TextFile textFile, final String text)
    {
        try {
            Files.writeString(
                Path.of(textFile.getFileName()),
                text,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            );
        }
        catch (IOException e) {
            // TODO log
        }
    }
}
