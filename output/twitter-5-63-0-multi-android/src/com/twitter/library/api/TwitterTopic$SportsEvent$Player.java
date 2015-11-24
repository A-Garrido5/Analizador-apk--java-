// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TwitterTopic$SportsEvent$Player implements Externalizable
{
    private static final long serialVersionUID = 1316777191743441714L;
    public String abbreviation;
    public String location;
    public String logoUrl;
    public String name;
    public String playerType;
    public String score;
    public long userId;
    
    public TwitterTopic$SportsEvent$Player() {
    }
    
    TwitterTopic$SportsEvent$Player(final String location, final String name, final String score, final String logoUrl, final String abbreviation, final String playerType, final long userId) {
        this.location = location;
        this.name = name;
        this.score = score;
        this.logoUrl = logoUrl;
        this.abbreviation = abbreviation;
        this.playerType = playerType;
        this.userId = userId;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.location = (String)objectInput.readObject();
        this.name = (String)objectInput.readObject();
        this.score = (String)objectInput.readObject();
        this.logoUrl = (String)objectInput.readObject();
        this.abbreviation = (String)objectInput.readObject();
        this.playerType = (String)objectInput.readObject();
        this.userId = (long)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.location);
        objectOutput.writeObject(this.name);
        objectOutput.writeObject(this.score);
        objectOutput.writeObject(this.logoUrl);
        objectOutput.writeObject(this.abbreviation);
        objectOutput.writeObject(this.playerType);
        objectOutput.writeObject(this.userId);
    }
}
