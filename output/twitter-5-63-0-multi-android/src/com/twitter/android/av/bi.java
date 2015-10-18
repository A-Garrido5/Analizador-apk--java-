// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.client.as;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.util.q;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.internal.android.service.a;
import android.os.Bundle;
import com.twitter.library.api.search.g;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

class bi extends z
{
    final /* synthetic */ bg a;
    private final WeakReference b;
    
    private bi(final bg a, final bj bj) {
        this.a = a;
        this.b = new WeakReference((T)bj);
    }
    
    @Override
    public void a(final y y) {
        this.a.g.j(this.a.d);
        final bj bj = (bj)this.b.get();
        final aa aa = (aa)y.l().b();
        int t;
        if (aa != null && aa.a()) {
            t = ((g)y).t();
        }
        else {
            t = 0;
        }
        final Bundle h = this.a.e.h();
        h.putInt(bg.a, t);
        h.putLong(bg.b, this.a.d);
        if (bj != null) {
            bj.a(t, this.a.d);
        }
    }
}
