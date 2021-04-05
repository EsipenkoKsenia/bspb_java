package ru.bspb.files;

public class LogEntry{
    private String timestamp;
    private String level;
    private String message;

    public String getTimestamp () {return timestamp;}
    public void setTimestamp(String timestamp){this.timestamp = timestamp;}

    public String getLevel () {return level;}
    public void setLevel(String level){this.level = level;}

    public String getMessage () {return message;}
    public void setMessage(String message){this.message = message;}
}
