// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.core;

import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bq;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.os.AsyncTask;

class i extends AsyncTask
{
    final /* synthetic */ boolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ MediaServiceTask d;
    
    i(final MediaServiceTask d, final boolean a, final Context b, final WeakReference c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected MediaServiceTask a(final MediaServiceTask... array) {
        final MediaServiceTask mediaServiceTask = array[0];
        if (this.a) {
            mediaServiceTask.e(this.b);
            return mediaServiceTask;
        }
        mediaServiceTask.a(this.b);
        return mediaServiceTask;
    }
    
    protected void a(final MediaServiceTask mediaServiceTask) {
        final k k = (k)this.c.get();
        if (k != null) {
            k.a(mediaServiceTask.b(), mediaServiceTask);
        }
    }
}
