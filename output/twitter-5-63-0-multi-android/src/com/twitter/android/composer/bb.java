// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.library.provider.DraftTweet;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.client.Session;
import android.content.Context;

public interface bb
{
    String a(final Context p0, final Session p1, final long p2, final long p3, final PromotedContent p4);
    
    String a(final Context p0, final Session p1, final DraftTweet p2);
}
