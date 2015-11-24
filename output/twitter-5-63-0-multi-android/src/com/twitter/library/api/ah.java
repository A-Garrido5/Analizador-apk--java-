// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

public class ah extends t
{
    long c;
    String d;
    String e;
    
    public ah() {
    }
    
    public ah(final MentionEntity mentionEntity) {
        super(mentionEntity);
        this.c = mentionEntity.userId;
        this.d = mentionEntity.screenName;
        this.e = mentionEntity.name;
    }
    
    public ah a(final long c) {
        this.c = c;
        return this;
    }
    
    public ah a(final String d) {
        this.d = d;
        return this;
    }
    
    @Override
    protected void av_() {
        super.av_();
        if (this.a != -1 && this.b == -1 && this.d != null) {
            this.b = 1 + (this.a + this.d.length());
        }
    }
    
    public ah b(final String e) {
        this.e = e;
        return this;
    }
    
    protected MentionEntity c() {
        return new MentionEntity(this);
    }
}
