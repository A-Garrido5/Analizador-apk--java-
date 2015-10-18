// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.featureswitch.d;
import java.io.Externalizable;

public class Partner implements Externalizable
{
    public static final Partner a;
    private String mName;
    
    static {
        a = new Partner();
    }
    
    public Partner() {
        this("");
    }
    
    public Partner(final String mName) {
        this.mName = mName;
    }
    
    public String a() {
        return this.mName.replace(" ", "").toLowerCase();
    }
    
    public String b() {
        return this.mName;
    }
    
    public String c() {
        return d.a("audio_configurations_audio_player_partner_logo_docked_%s", new Object[] { this.a() });
    }
    
    @Override
    public boolean equals(final Object o) {
        return this.mName != null && o != null && this.getClass() == o.getClass() && this.mName.equals(((Partner)o).mName);
    }
    
    @Override
    public int hashCode() {
        return this.mName.hashCode();
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mName = (String)objectInput.readObject();
    }
    
    @Override
    public String toString() {
        return this.mName;
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.mName);
    }
}
