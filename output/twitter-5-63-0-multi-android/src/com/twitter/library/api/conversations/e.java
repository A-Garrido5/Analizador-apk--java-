// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.model.json.dms.JsonConversationEvent;
import com.twitter.model.json.dms.JsonConversationEntry;

public abstract class e extends h
{
    boolean a;
    boolean b;
    
    public e() {
    }
    
    public e(final JsonConversationEntry jsonConversationEntry) {
        super(jsonConversationEntry);
        this.a = jsonConversationEntry.a;
    }
}
