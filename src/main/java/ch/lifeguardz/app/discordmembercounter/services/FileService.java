package ch.lifeguardz.app.discordmembercounter.services;

import ch.lifeguardz.app.discordmembercounter.enums.TextFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FileService
{
    private static Logger logger = LoggerFactory.getLogger(FileService.class);

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
            logger.warn("Could not update File. FileName: " + textFile.getFileName() + " Text: " + text, e);
        }
    }
}
