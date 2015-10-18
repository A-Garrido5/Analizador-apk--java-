// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.model.common.a;
import com.twitter.model.common.BuilderSerializationProxy;

class TwitterSocialProof$SerializationProxy extends BuilderSerializationProxy
{
    private static final long serialVersionUID = 6253375306762431681L;
    
    public TwitterSocialProof$SerializationProxy() {
        super(new bo());
    }
    
    public TwitterSocialProof$SerializationProxy(final TwitterSocialProof twitterSocialProof) {
        super(twitterSocialProof);
    }
    
    protected void a(final ObjectInput objectInput, final bo bo) {
        bo.a(objectInput.readInt()).b(objectInput.readInt()).c(objectInput.readInt()).d(objectInput.readInt()).a((String)objectInput.readObject()).e(objectInput.readInt()).b((String)objectInput.readObject()).g(objectInput.readInt());
    }
    
    protected void a(final ObjectOutput objectOutput, final TwitterSocialProof twitterSocialProof) {
        objectOutput.writeInt(twitterSocialProof.type);
        objectOutput.writeInt(twitterSocialProof.favoriteCount);
        objectOutput.writeInt(twitterSocialProof.retweetCount);
        objectOutput.writeInt(twitterSocialProof.followCount);
        objectOutput.writeObject(twitterSocialProof.name);
        objectOutput.writeInt(twitterSocialProof.friendship);
        objectOutput.writeObject(twitterSocialProof.secondName);
        objectOutput.writeInt(twitterSocialProof.othersCount);
    }
}
