// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model.legacy;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;
import com.twitter.library.api.Entity;

@Deprecated
public class UrlEntity extends Entity implements Externalizable
{
    static final long serialVersionUID = 7946903601032197538L;
    public int displayEnd;
    public int displayStart;
    public String displayUrl;
    public String expandedUrl;
    public String insecureUrl;
    public String url;
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.url = (String)objectInput.readObject();
        this.insecureUrl = (String)objectInput.readObject();
        this.expandedUrl = (String)objectInput.readObject();
        this.displayUrl = (String)objectInput.readObject();
        this.displayStart = objectInput.readInt();
        this.displayEnd = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
    }
}
