// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.model.json.dms.JsonConversationEvent;
import com.twitter.model.common.a;

public abstract class h extends a
{
    long c;
    String d;
    long e;
    long f;
    
    public h() {
        this.c = -1L;
        this.e = -1L;
        this.f = -1L;
    }
    
    public h(final JsonConversationEvent jsonConversationEvent) {
        this.c = -1L;
        this.e = -1L;
        this.f = -1L;
        this.c = jsonConversationEvent.b;
        this.d = jsonConversationEvent.c;
        this.e = jsonConversationEvent.d;
        this.f = jsonConversationEvent.e;
    }
}
