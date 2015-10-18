// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.List;
import java.io.Externalizable;

public class EntityList$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = -4314654173430142464L;
    protected List mList;
    
    public EntityList$SerializationProxy() {
    }
    
    public EntityList$SerializationProxy(final EntityList list) {
        this.mList = list.d();
    }
    
    private Object readResolve() {
        if (!CollectionUtils.a((Collection)this.mList)) {
            return new EntityList(this.mList);
        }
        return EntityList.a();
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mList = (List)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(CollectionUtils.b(this.mList));
    }
}
