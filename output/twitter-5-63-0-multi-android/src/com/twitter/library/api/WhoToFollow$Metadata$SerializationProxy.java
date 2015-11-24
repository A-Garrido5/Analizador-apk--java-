// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.util.Map;
import java.io.ObjectInput;
import com.twitter.model.common.a;
import com.twitter.model.common.BuilderSerializationProxy;

class WhoToFollow$Metadata$SerializationProxy extends BuilderSerializationProxy
{
    private static final long serialVersionUID = -8827928471572118079L;
    
    public WhoToFollow$Metadata$SerializationProxy() {
        super(new cf());
    }
    
    public WhoToFollow$Metadata$SerializationProxy(final WhoToFollow$Metadata whoToFollow$Metadata) {
        super(whoToFollow$Metadata);
    }
    
    protected void a(final ObjectInput objectInput, final cf cf) {
        cf.a(objectInput.readInt()).a((String)objectInput.readObject()).d((String)objectInput.readObject()).b((String)objectInput.readObject()).c((String)objectInput.readObject()).e((String)objectInput.readObject()).f((String)objectInput.readObject()).a((Map)objectInput.readObject()).a((EntityScribeContent)objectInput.readObject()).b((Map)objectInput.readObject());
    }
    
    protected void a(final ObjectOutput objectOutput, final WhoToFollow$Metadata whoToFollow$Metadata) {
        objectOutput.writeInt(whoToFollow$Metadata.type);
        objectOutput.writeObject(whoToFollow$Metadata.yes);
        objectOutput.writeObject(whoToFollow$Metadata.no);
        objectOutput.writeObject(whoToFollow$Metadata.dismiss);
        objectOutput.writeObject(whoToFollow$Metadata.feedback);
        objectOutput.writeObject(whoToFollow$Metadata.header);
        objectOutput.writeObject(whoToFollow$Metadata.showMore);
        objectOutput.writeObject(whoToFollow$Metadata.userIdToSocialProofMap);
        objectOutput.writeObject(whoToFollow$Metadata.moduleScribeContent);
        objectOutput.writeObject(whoToFollow$Metadata.userScribeContent);
    }
}
