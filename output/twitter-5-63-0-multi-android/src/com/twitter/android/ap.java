// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.af;
import com.twitter.library.media.util.z;
import com.twitter.library.media.util.y;
import com.twitter.library.media.util.w;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$CompressFormat;
import java.io.File;
import android.graphics.Bitmap;
import android.content.Context;
import android.app.ProgressDialog;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

class ap extends AsyncTask
{
    final /* synthetic */ BackupCodeFragment a;
    private WeakReference b;
    private String c;
    private ProgressDialog d;
    
    ap(final BackupCodeFragment a, final Context context, final String c) {
        this.a = a;
        this.b = new WeakReference((T)context);
        this.c = c;
    }
    
    protected File a(final Bitmap... array) {
        final Bitmap bitmap = array[0];
        final Context context = (Context)this.b.get();
        if (bitmap != null && context != null) {
            final File a = m.a(context, bitmap, Bitmap$CompressFormat.JPEG, 95);
            try {
                return w.a(context).c(new y(a));
            }
            finally {
                af.b(a);
            }
        }
        return null;
    }
    
    protected void a(final File file) {
        if (this.d != null) {
            this.d.dismiss();
        }
        this.a.a(file);
    }
    
    protected void onPreExecute() {
        final Context context = (Context)this.b.get();
        if (context != null) {
            (this.d = new ProgressDialog(context)).setProgressStyle(0);
            this.d.setMessage((CharSequence)this.c);
            this.d.setIndeterminate(true);
            this.d.setCancelable(false);
            this.d.show();
        }
    }
}
