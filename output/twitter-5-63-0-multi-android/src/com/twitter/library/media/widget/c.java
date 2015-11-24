// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.media.util.m;
import android.graphics.Bitmap$Config;
import com.twitter.errorreporter.ErrorReporter;
import android.graphics.Bitmap;
import android.graphics.Movie;
import com.twitter.library.media.model.AnimatedGifFile;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

class c extends AsyncTask
{
    private final WeakReference a;
    private final AnimatedGifFile b;
    private Movie c;
    private Bitmap d;
    
    c(final AnimatedGifView animatedGifView, final AnimatedGifFile b) {
        this.a = new WeakReference((T)animatedGifView);
        this.b = b;
    }
    
    protected Boolean a(final Void... array) {
        try {
            this.c = Movie.decodeFile(this.b.file.getAbsolutePath());
            if (this.c == null || this.c.duration() == 0) {
                return false;
            }
        }
        catch (Throwable t) {
            ErrorReporter.a(t);
            return false;
        }
        this.d = m.a(this.b.size, Bitmap$Config.ARGB_8888);
        final Bitmap d = this.d;
        boolean b = false;
        if (d != null) {
            b = true;
        }
        return b;
    }
    
    protected void a(final Boolean b) {
        final AnimatedGifView animatedGifView = (AnimatedGifView)this.a.get();
        if (animatedGifView != null) {
            if (!b) {
                animatedGifView.e();
                return;
            }
            animatedGifView.a(this.c, this.d);
        }
    }
}
