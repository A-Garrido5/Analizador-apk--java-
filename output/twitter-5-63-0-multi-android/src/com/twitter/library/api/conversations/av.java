// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.library.provider.b;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.library.media.model.EditableMedia;

public class av extends bd
{
    private final EditableMedia e;
    private final String f;
    private final String g;
    private final long h;
    private final String i;
    private final QuotedTweetData n;
    private DMLocalMessageEntry r;
    
    public av(final Context context, final Session session, final String f, final String g, final String i, final EditableMedia e, final QuotedTweetData n) {
        super(context, av.class.getName(), session);
        this.f = f;
        this.g = g;
        this.h = session.g();
        this.i = i;
        this.e = e;
        this.n = n;
    }
    
    @Override
    protected void a(final aa aa) {
        BaseDMAttachment a;
        DMTweet dmTweet;
        if (this.e instanceof EditableImage) {
            a = DMPhoto.a((EditableImage)this.e);
            dmTweet = null;
        }
        else if (this.n != null) {
            dmTweet = (DMTweet)(a = new DMTweet(this.n.statusId, this.n));
        }
        else {
            dmTweet = null;
            a = null;
        }
        final b w = this.W();
        if (this.r == null) {
            this.r = this.V().a(this.f, this.g, this.h, this.i, a, w);
        }
        w.a();
        this.a(this.r, this.e, aa, dmTweet);
    }
    
    @Override
    public String an_() {
        return this.g;
    }
    
    @Override
    public boolean b() {
        return false;
    }
}
