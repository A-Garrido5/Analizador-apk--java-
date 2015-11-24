// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.core;

import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bq;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import android.content.Context;

class j implements h
{
    final /* synthetic */ Context a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ MediaServiceTask c;
    
    j(final MediaServiceTask c, final Context a, final WeakReference b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final int n, final Bundle bundle) {
        this.c.a(bundle);
        if (!this.c.a()) {
            this.c.a(this.a, this.b, true);
        }
        else {
            final k k = (k)this.b.get();
            if (k != null) {
                k.a(this.c.a, this.c);
            }
        }
    }
}
