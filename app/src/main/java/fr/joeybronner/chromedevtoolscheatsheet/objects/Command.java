package fr.joeybronner.chromedevtoolscheatsheet.objects;

public class Command {
    private String txtTitle;
    private String txtCommand;

    public Command(String title, String command) {
        this.txtTitle = title;
        this.txtCommand = command;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public String getTxtCommand() {
        return txtCommand;
    }
}
