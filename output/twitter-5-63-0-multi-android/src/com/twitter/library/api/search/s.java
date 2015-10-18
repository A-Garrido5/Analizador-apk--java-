// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import java.util.Iterator;
import com.twitter.library.api.TwitterTopic$TrendsPlus;
import java.util.ArrayList;

public class s
{
    public final t a;
    public final ArrayList b;
    
    s(final t a, final ArrayList b) {
        this.a = a;
        final Iterator<r> iterator = b.iterator();
        while (iterator.hasNext()) {
            ((TwitterTopic$TrendsPlus)iterator.next().b.a(3)).isDegraded = a.c;
        }
        this.b = b;
    }
}
