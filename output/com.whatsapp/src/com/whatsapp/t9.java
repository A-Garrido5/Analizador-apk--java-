// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.format.DateUtils;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;

class t9 implements z4
{
    private static final String z;
    final VideoPreviewActivity a;
    
    static {
        final char[] charArray = "\u001f6A".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0013';
                    break;
                }
                case 0: {
                    c2 = '?';
                    break;
                }
                case 1: {
                    c2 = '\u001b';
                    break;
                }
                case 2: {
                    c2 = 'a';
                    break;
                }
                case 3: {
                    c2 = 'i';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    t9(final VideoPreviewActivity a) {
        this.a = a;
    }
    
    public void a(final RangeSeekBar rangeSeekBar, final Long n, final Long n2, final boolean b) {
        if (VideoPreviewActivity.c(this.a).isPlaying()) {
            VideoPreviewActivity.c(this.a).pause();
            VideoPreviewActivity.b(this.a, true);
        }
        Label_0160: {
            if (VideoPreviewActivity.k(this.a) != n) {
                VideoPreviewActivity.b(this.a).a(n);
                VideoPreviewActivity.c(this.a).seekTo((int)(Object)n);
                VideoPreviewActivity.a(this.a, true);
                if (!App.I) {
                    break Label_0160;
                }
            }
            if (VideoPreviewActivity.g(this.a) != n2) {
                VideoPreviewActivity.b(this.a).a(n2);
                VideoPreviewActivity.c(this.a).seekTo((int)(Object)n2);
                if (n2 <= VideoPreviewActivity.h(this.a).getProgress()) {
                    VideoPreviewActivity.a(this.a, true);
                }
            }
        }
        VideoPreviewActivity.a(this.a, n);
        VideoPreviewActivity.b(this.a, n2);
        if (VideoPreviewActivity.p(this.a).getVisibility() != 0) {
            VideoPreviewActivity.p(this.a).setVisibility(0);
            final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ((Animation)alphaAnimation).setDuration(100L);
            VideoPreviewActivity.p(this.a).startAnimation((Animation)alphaAnimation);
        }
        VideoPreviewActivity.p(this.a).setText((CharSequence)(DateUtils.formatElapsedTime(VideoPreviewActivity.k(this.a) / 1000L) + t9.z + DateUtils.formatElapsedTime(VideoPreviewActivity.g(this.a) / 1000L)));
        VideoPreviewActivity.a(this.a, VideoPreviewActivity.k(this.a), VideoPreviewActivity.g(this.a));
        if (!b) {
            VideoPreviewActivity.j(this.a).postDelayed((Runnable)new gh(this), 1000L);
        }
    }
    
    @Override
    public void a(final RangeSeekBar rangeSeekBar, final Object o, final Object o2, final boolean b) {
        this.a(rangeSeekBar, (Long)o, (Long)o2, b);
    }
}
