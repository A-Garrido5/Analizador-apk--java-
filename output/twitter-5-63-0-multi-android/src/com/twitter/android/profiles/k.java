// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import java.io.File;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.MediaFile;
import android.app.Activity;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

class k extends AsyncTask
{
    private final WeakReference a;
    private final long b;
    private final m c;
    
    public k(final Activity activity, final long b, final m c) {
        this.c = c;
        this.a = new WeakReference((T)activity);
        this.b = b;
    }
    
    protected MediaFile a(final Void... array) {
        final Activity activity = (Activity)this.a.get();
        if (activity != null) {
            final File a = com.twitter.library.media.util.m.a(activity.getApplicationContext(), this.b);
            if (a != null) {
                return MediaFile.a(a, MediaType.b);
            }
        }
        return null;
    }
    
    protected void a(final MediaFile mediaFile) {
        if (this.a.get() != null) {
            this.c.a(mediaFile);
        }
        else if (mediaFile != null) {
            mediaFile.c();
        }
    }
}
