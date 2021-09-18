package ch.lifeguardz.app.discordmembercounter.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TextFile
{
    LAST_JOINED_CHANNEL_MEMBER_NAME("Last_Joined_Channel_Member_Name.txt"),
    TOTAL_CHANNEL_MEMBERS("Total_Channel_Members.txt");

    private final String fileName;
}
