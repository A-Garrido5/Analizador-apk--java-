// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events;

import com.twitter.library.api.PromotedContent;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.library.api.TwitterTopic$Metadata;

public class c extends gz
{
    public final String a;
    public final String b;
    public final TwitterTopic$Metadata c;
    public final int d;
    public final TopicView$TopicData e;
    public final PromotedContent f;
    public final int g;
    
    public c(final long n, final long n2, final String a, final String b, final TwitterTopic$Metadata c, final int d, final TopicView$TopicData e, final PromotedContent f, final int g) {
        super(n, n2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
}
