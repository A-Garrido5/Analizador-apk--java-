// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class TwitterTopic$TrendsPlus$Disclosure implements Externalizable
{
    private static final long serialVersionUID = -150142096551098274L;
    public String disclosureText;
    public String disclosureType;
    
    public TwitterTopic$TrendsPlus$Disclosure() {
    }
    
    public TwitterTopic$TrendsPlus$Disclosure(final String disclosureText, final String disclosureType) {
        this.disclosureText = disclosureText;
        this.disclosureType = disclosureType;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.disclosureText = (String)objectInput.readObject();
        this.disclosureType = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.disclosureText);
        objectOutput.writeObject(this.disclosureType);
    }
}
