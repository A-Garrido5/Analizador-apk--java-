// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View$OnClickListener;

class aos implements View$OnClickListener
{
    final VideoPreviewActivity a;
    
    aos(final VideoPreviewActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        if (VideoPreviewActivity.c(this.a).isPlaying()) {
            VideoPreviewActivity.c(this.a).pause();
            VideoPreviewActivity.b(this.a, true);
            if (!i) {
                return;
            }
        }
        if (view == VideoPreviewActivity.d(this.a)) {
            VideoPreviewActivity.b(this.a, false);
            VideoPreviewActivity.c(this.a, false);
            Label_0172: {
                if (VideoPreviewActivity.a(this.a) || VideoPreviewActivity.h(this.a).getProgress() == VideoPreviewActivity.g(this.a)) {
                    VideoPreviewActivity.c(this.a).seekTo((int)VideoPreviewActivity.k(this.a));
                    if (!i) {
                        break Label_0172;
                    }
                }
                VideoPreviewActivity.c(this.a).seekTo(VideoPreviewActivity.h(this.a).getProgress());
                if (VideoPreviewActivity.c(this.a).getCurrentPosition() >= VideoPreviewActivity.g(this.a)) {
                    VideoPreviewActivity.c(this.a, true);
                }
            }
            VideoPreviewActivity.a(this.a, false);
            VideoPreviewActivity.c(this.a).setBackgroundDrawable((Drawable)null);
            VideoPreviewActivity.c(this.a).start();
            VideoPreviewActivity.c(this.a).postDelayed((Runnable)new os(this), 0L);
        }
    }
}
