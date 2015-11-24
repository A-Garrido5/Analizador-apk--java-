// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

public class aa extends t
{
    String c;
    int d;
    int e;
    
    public aa() {
    }
    
    public aa(final HashtagEntity hashtagEntity) {
        super(hashtagEntity);
        this.c = hashtagEntity.text;
        this.d = hashtagEntity.displayStart;
        this.e = hashtagEntity.displayEnd;
    }
    
    public aa a(final String c) {
        this.c = c;
        return this;
    }
    
    @Override
    protected void av_() {
        super.av_();
        if (this.a != -1 && this.b == -1 && this.c != null) {
            this.b = 1 + (this.a + this.c.length());
        }
        if (this.e == 0 && this.c != null) {
            this.e = 1 + (this.d + this.c.length());
        }
    }
    
    protected HashtagEntity c() {
        return new HashtagEntity(this);
    }
}
