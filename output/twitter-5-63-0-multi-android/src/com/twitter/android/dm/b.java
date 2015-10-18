// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dm;

import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.TweetView;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.android.DMActivity;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.LinearLayout;
import com.twitter.library.api.QuotedTweetData;
import android.view.View;
import com.twitter.library.provider.Tweet;
import android.view.View$OnClickListener;

class b implements View$OnClickListener
{
    final /* synthetic */ Tweet a;
    final /* synthetic */ c b;
    final /* synthetic */ ShareViaDMView c;
    
    b(final ShareViaDMView c, final Tweet a, final c b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        this.c.a(new QuotedTweetData(this.a));
        this.b.b();
    }
}
