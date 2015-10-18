// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.playback.a;
import com.twitter.library.provider.Tweet;
import android.content.Context;
import com.twitter.library.av.playback.c;

final class av implements c
{
    @Override
    public a a(final Context context, final Tweet tweet) {
        return new au(context, tweet);
    }
}
