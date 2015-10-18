// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.model.json.dms.JsonConversationEntry;
import com.twitter.model.json.dms.JsonUpdateConversationNameEntry;

public class bh extends e
{
    String g;
    
    public bh() {
    }
    
    public bh(final JsonUpdateConversationNameEntry jsonUpdateConversationNameEntry) {
        super(jsonUpdateConversationNameEntry);
        this.g = jsonUpdateConversationNameEntry.g;
        this.f = jsonUpdateConversationNameEntry.h;
    }
    
    @Override
    protected void av_() {
        this.b = this.a;
    }
    
    protected UpdateConversationNameEntry c() {
        return new UpdateConversationNameEntry(this);
    }
}
