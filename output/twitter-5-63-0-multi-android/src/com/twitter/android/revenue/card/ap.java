// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.view.View$OnTouchListener;
import com.twitter.android.av.videoapp.VideoCardData;
import com.twitter.library.provider.Tweet;
import com.twitter.android.card.t;
import com.twitter.android.nativecards.j;
import android.view.View;
import com.twitter.internal.android.widget.RichImageView;
import com.twitter.library.media.widget.MediaImageView;

public class ap
{
    public static void a(final MediaImageView mediaImageView) {
        final RichImageView richImageView = (RichImageView)mediaImageView.findViewById(2131886127);
        if (richImageView != null) {
            richImageView.setOverlayDrawable(2130839478);
        }
    }
    
    public static void a(final String s, final View view, final j j, final t t, final MediaImageView mediaImageView, final Tweet tweet, final VideoCardData videoCardData) {
        mediaImageView.setOnTouchListener((View$OnTouchListener)new aq(view, t, j, s, mediaImageView, videoCardData, tweet));
    }
}
