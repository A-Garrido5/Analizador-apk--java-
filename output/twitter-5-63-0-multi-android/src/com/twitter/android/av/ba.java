// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.as;
import com.twitter.library.av.control.f;
import android.content.Context;
import com.twitter.library.av.k;

public class ba implements k
{
    @Override
    public f a(final Context context, final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("The VideoPlayerChrome type is not valid. Valid values are VideoPlayerChrome.INLINE, VideoPlayerChrome.FULLSCREEN, VideoPlayerChrome.APP_CARD, VideoPlayerChrome.VIEW_MORE_ITEM and VideoPlayerChrome.EMPTY");
            }
            case 0: {
                return f.t;
            }
            case 5: {
                return new AutoPlayVideoPlayerChromeView(context);
            }
            case 1: {
                return new VideoPlayerChromeView(context);
            }
            case 2: {
                if (as.a()) {
                    return new FullscreenViewMoreVideoPlayerChromeView(context);
                }
                return new FullscreenVideoPlayerChromeView(context);
            }
            case 4: {
                return new FullscreenVideoCardCanvasChromeView(context);
            }
            case 3: {
                return new ViewMoreThumbPlayerChromeView(context);
            }
        }
    }
}
