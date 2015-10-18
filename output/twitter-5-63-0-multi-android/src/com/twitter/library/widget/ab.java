// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import com.twitter.library.provider.Tweet;
import com.twitter.library.view.TweetActionType;
import android.content.res.TypedArray;

class ab extends z
{
    final /* synthetic */ InlineActionsView a;
    private final int g;
    
    private ab(final InlineActionsView a, final TypedArray typedArray) {
        this.a = a;
        super(a, TweetActionType.d, null);
        this.g = typedArray.getResourceId(li.InlineActionsView_replyOffDrawable, 0);
        this.c.setImageResource(this.g);
    }
    
    @Override
    public final boolean a(final Tweet tweet) {
        return false;
    }
}
