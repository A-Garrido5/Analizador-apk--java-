// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

public class Conversation
{
    public final Conversation$Metadata a;
    public final bp[] b;
    
    public Conversation(final Conversation$Metadata a, final bp[] b) {
        this.a = a;
        this.b = b;
    }
    
    public bp a() {
        return this.b[-1 + this.b.length];
    }
    
    public boolean b() {
        return this.a != null && this.a.targetCount > 0;
    }
}
