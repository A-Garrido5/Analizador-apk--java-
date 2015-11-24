// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.Card;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import com.twitter.library.card.element.PlayerDelegateView;
import android.view.View;
import com.twitter.library.card.element.BasePlayer;
import android.content.Context;
import com.twitter.library.card.element.j;

public class ao extends j
{
    public ao(final Context context, final BasePlayer basePlayer) {
        super(context, basePlayer);
    }
    
    @Override
    public View a() {
        return (View)new PlayerDelegateView(this.a, this.b);
    }
    
    @Override
    public boolean b() {
        String streamUrl;
        String htmlUrl;
        if (!TextUtils.isEmpty((CharSequence)this.b.streamUrl) && !TextUtils.isEmpty((CharSequence)this.b.streamContentType) && bq.c(this.b.streamContentType)) {
            streamUrl = this.b.streamUrl;
            htmlUrl = null;
        }
        else {
            htmlUrl = this.b.htmlUrl;
            streamUrl = null;
        }
        final Card y = this.b.y();
        if (y != null) {
            y.a(htmlUrl, streamUrl, this.b.spec.url, true, true);
        }
        return true;
    }
}
