// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.List;

public class TwitterTopic$SportsEvent extends TwitterTopic$Data
{
    private static final long serialVersionUID = 5416985447615888963L;
    public String channel;
    public String gameType;
    public List players;
    public List secondaryPlayers;
    public String sportsTitle;
    public String status;
    public String summary;
    
    public TwitterTopic$SportsEvent() {
    }
    
    TwitterTopic$SportsEvent(final String sportsTitle, final String gameType, final String summary, final String status, final String channel, final List players, final List secondaryPlayers) {
        this.sportsTitle = sportsTitle;
        this.gameType = gameType;
        this.summary = summary;
        this.status = status;
        this.channel = channel;
        this.players = players;
        this.secondaryPlayers = secondaryPlayers;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.sportsTitle = (String)objectInput.readObject();
        this.gameType = (String)objectInput.readObject();
        this.summary = (String)objectInput.readObject();
        this.status = (String)objectInput.readObject();
        this.channel = (String)objectInput.readObject();
        this.players = (List)objectInput.readObject();
        try {
            this.secondaryPlayers = (List)objectInput.readObject();
        }
        catch (Exception ex) {}
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.sportsTitle);
        objectOutput.writeObject(this.gameType);
        objectOutput.writeObject(this.summary);
        objectOutput.writeObject(this.status);
        objectOutput.writeObject(this.channel);
        objectOutput.writeObject(this.players);
        objectOutput.writeObject(this.secondaryPlayers);
    }
}
