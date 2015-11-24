// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.android.client.ca;
import com.twitter.library.provider.DraftTweet;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.client.Session;
import android.content.Context;

public class bp implements bb
{
    @Override
    public String a(final Context context, final Session session, final long n, final long n2, final PromotedContent promotedContent) {
        return as.a(context).a(new oq(context, session, n, n2, promotedContent), (z)null);
    }
    
    @Override
    public String a(final Context context, final Session session, final DraftTweet draftTweet) {
        return ca.a(context, session, draftTweet);
    }
}
