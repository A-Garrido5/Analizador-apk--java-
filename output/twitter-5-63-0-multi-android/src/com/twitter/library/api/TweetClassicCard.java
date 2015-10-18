// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.internal.android.util.Size;
import java.util.HashMap;
import java.io.Externalizable;

@Deprecated
public class TweetClassicCard implements Externalizable
{
    private static final long serialVersionUID = 8958703653851471359L;
    public CardUser authorUser;
    public String description;
    public HashMap features;
    public Size imageSize;
    public String imageUrl;
    public String imageUrlLarge;
    public String playerStreamUrl;
    public int playerType;
    public String playerUrl;
    public CardUser siteUser;
    public String title;
    public int type;
    public String url;
    
    public TweetClassicCard() {
        this.imageSize = Size.a;
        this.features = new HashMap();
    }
    
    public TweetClassicCard(final int type, final String title, final String description, final String url, final String imageUrl, final String imageUrlLarge, final Size imageSize, final int playerType, final String playerUrl, final String playerStreamUrl, final TwitterUser twitterUser, final TwitterUser twitterUser2) {
        this.imageSize = Size.a;
        this.features = new HashMap();
        this.type = type;
        this.title = title;
        this.description = description;
        this.url = url;
        this.imageUrl = imageUrl;
        this.imageUrlLarge = imageUrlLarge;
        this.imageSize = imageSize;
        this.playerType = playerType;
        this.playerUrl = playerUrl;
        this.playerStreamUrl = playerStreamUrl;
        CardUser siteUser;
        if (twitterUser != null) {
            siteUser = new CardUser(twitterUser);
        }
        else {
            siteUser = null;
        }
        this.siteUser = siteUser;
        CardUser authorUser = null;
        if (twitterUser2 != null) {
            authorUser = new CardUser(twitterUser2);
        }
        this.authorUser = authorUser;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.type = objectInput.readInt();
        this.title = (String)objectInput.readObject();
        this.description = (String)objectInput.readObject();
        this.url = (String)objectInput.readObject();
        this.imageUrl = (String)objectInput.readObject();
        this.imageUrlLarge = (String)objectInput.readObject();
        this.imageSize = Size.a(objectInput.readInt(), objectInput.readInt());
        this.playerType = objectInput.readInt();
        this.playerUrl = (String)objectInput.readObject();
        this.playerStreamUrl = (String)objectInput.readObject();
        if (objectInput.readBoolean()) {
            (this.siteUser = new CardUser()).readExternal(objectInput);
        }
        if (objectInput.readBoolean()) {
            (this.authorUser = new CardUser()).readExternal(objectInput);
        }
        try {
            if (objectInput.readBoolean()) {
                this.features = (HashMap)objectInput.readObject();
            }
            objectInput.readObject();
        }
        catch (Exception ex) {}
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        boolean b = true;
        objectOutput.writeInt(this.type);
        objectOutput.writeObject(this.title);
        objectOutput.writeObject(this.description);
        objectOutput.writeObject(this.url);
        objectOutput.writeObject(this.imageUrl);
        objectOutput.writeObject(this.imageUrlLarge);
        objectOutput.writeInt(this.imageSize.a());
        objectOutput.writeInt(this.imageSize.b());
        objectOutput.writeInt(this.playerType);
        objectOutput.writeObject(this.playerUrl);
        objectOutput.writeObject(this.playerStreamUrl);
        final boolean b2 = this.siteUser != null && b;
        objectOutput.writeBoolean(b2);
        if (b2) {
            this.siteUser.writeExternal(objectOutput);
        }
        final boolean b3 = this.authorUser != null && b;
        objectOutput.writeBoolean(b3);
        if (b3) {
            this.authorUser.writeExternal(objectOutput);
        }
        if (this.features == null || this.features.size() <= 0) {
            b = false;
        }
        objectOutput.writeBoolean(b);
        if (b) {
            objectOutput.writeObject(this.features);
        }
        objectOutput.writeObject(null);
    }
}
