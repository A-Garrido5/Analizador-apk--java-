// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class os implements Runnable
{
    final aos a;
    
    os(final aos a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        if (VideoPreviewActivity.c(this.a.a).isPlaying()) {
            Label_0155: {
                if (VideoPreviewActivity.c(this.a.a).getCurrentPosition() > VideoPreviewActivity.g(this.a.a) && !VideoPreviewActivity.l(this.a.a)) {
                    VideoPreviewActivity.c(this.a.a).pause();
                    VideoPreviewActivity.c(this.a.a).seekTo((int)VideoPreviewActivity.g(this.a.a));
                    VideoPreviewActivity.h(this.a.a).setProgress((int)VideoPreviewActivity.g(this.a.a));
                    VideoPreviewActivity.b(this.a.a, true);
                    if (!i) {
                        break Label_0155;
                    }
                }
                VideoPreviewActivity.c(this.a.a).postDelayed((Runnable)this, 50L);
            }
            VideoPreviewActivity.h(this.a.a).setProgress(VideoPreviewActivity.c(this.a.a).getCurrentPosition());
            if (!i) {
                return;
            }
        }
        VideoPreviewActivity.b(this.a.a, true);
    }
}
