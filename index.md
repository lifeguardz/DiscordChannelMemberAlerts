# Discord Channel Member Alerts

This program can be used to monitor who has joined a Discord channel and how many members the channel has. This information is written to text files, which can then be easily integrated into OBS / SLOBS. For example, you can create a Discord member target or display the newest member in the channel.
Additionally there is the possibility to show alerts. There is already a simple example in the project. Feel free to customize this for your needs as well.

## Requirements

Java 11

## Setup
### Create and configure a discord bot
1.	Before starting your server, there are a few steps you have to take. First, you must create a new Discord bot at [discord.com/developers/applications](https://discord.com/developers/applications).
2.	Once on that page, click on `New Application` button on the top right, give your bot a name, and then click `Create`. New Application -> Give Application a Name -> Create
3.	Once you create the application, you'll be directed to its overview. From this screen, you'll need to copy your `Client ID`/`Application ID` and save it for a later step. To copy your Client ID, click the upper-left most blue `Copy` button. Make sure to save it for a later step.
4.	The next step is actually creating a bot user for your application. From the overview screen, this is done by going to the `Bot` tab on the left, then clicking the `Add Bot` on the right, and finally then clicking `Yes, do it!`.
5.	Enable the `Server Members Intent` setting. This step is very important.
6.	Once on this screen, you'll need to uncheck the `Public Bot` setting and then click `Save Changes`, so other people can't add your bot to servers that are not your own.
7.	Finally, you'll need to copy your bot's token and save it for a later step. To copy your bot's token, click the blue `Copy` button right of your bot's icon. Make sure to save it for a later step.

### Invite bot to your Discord channel:
1.	Next up is adding your bot to your Discord server. First, go to [discordapi.com/permissions.html](https://discordapi.com/permissions.html) and paste your Client ID you copied from step 3 into the text field `Client ID`. Once you do that, click the `Link` below. This will redirect you to Discord's authorization website to chose which server to add the bot to.

### Download and configure the program
1.	Go to REPLACEME and download the latest version. Copy the JAR file into the folder where you want to have the generated text files.
2.	Create a text file named `settings.yaml` in the same directory as the jar file and copy the following content into it:
```YAML
TODO
```

### Run the program
1.	Run the programm with a double press or use a command line tool (`java -jar <program>.jar`)
2.	The program was successfully launched. Please note that the program must be restarted after each restart of the PC.


```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/lifeguardz/DiscordChannelMemberAlerts/settings/pages). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://docs.github.com/categories/github-pages-basics/) or [contact support](https://support.github.com/contact) and we’ll help you sort it out.
