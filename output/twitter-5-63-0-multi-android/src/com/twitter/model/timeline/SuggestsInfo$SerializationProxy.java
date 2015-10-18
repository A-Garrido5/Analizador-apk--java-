// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.timeline;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.model.common.a;
import com.twitter.model.common.BuilderSerializationProxy;

class SuggestsInfo$SerializationProxy extends BuilderSerializationProxy
{
    private static final long serialVersionUID = 7910282751290126419L;
    
    public SuggestsInfo$SerializationProxy() {
        super(new b());
    }
    
    public SuggestsInfo$SerializationProxy(final SuggestsInfo suggestsInfo) {
        super(suggestsInfo);
    }
    
    protected void a(final ObjectInput objectInput, final b b) {
        b.a((String)objectInput.readObject()).b((String)objectInput.readObject()).c((String)objectInput.readObject()).d((String)objectInput.readObject()).e((String)objectInput.readObject());
    }
    
    protected void a(final ObjectOutput objectOutput, final SuggestsInfo suggestsInfo) {
        objectOutput.writeObject(suggestsInfo.suggestionType);
        objectOutput.writeObject(suggestsInfo.controllerData);
        objectOutput.writeObject(suggestsInfo.scribeComponent);
        objectOutput.writeObject(suggestsInfo.sourceData);
        objectOutput.writeObject(suggestsInfo.typeId);
    }
}
