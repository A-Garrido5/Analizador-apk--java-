// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

import com.twitter.android.widget.bi;
import android.os.Parcelable;
import com.twitter.android.widget.m;
import com.twitter.android.widget.bg;
import android.content.Intent;
import android.content.Context;
import java.util.Map;
import java.util.HashMap;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.graphics.PointF;
import com.twitter.library.av.playback.au;
import com.twitter.android.client.TwitterFragmentActivity;

public class i
{
    private final TwitterFragmentActivity a;
    private long b;
    
    public i(final TwitterFragmentActivity a) {
        this.b = 0L;
        this.a = a;
    }
    
    private void b(final au au, final PointF pointF, final PointF pointF2, final TwitterScribeAssociation twitterScribeAssociation) {
        final Map d = au.d();
        HashMap hashMap;
        if (d instanceof HashMap) {
            hashMap = (HashMap<? extends K, ? extends V>)d;
        }
        else {
            hashMap = new HashMap(d);
        }
        new h().a(au.g()).a(hashMap).a(au.b()).a(au.c()).a(twitterScribeAssociation).a(pointF, pointF2).a(true).b((Context)this.a);
    }
    
    public void a(final Intent intent) {
        if (intent != null && intent.getComponent() != null && AudioCardViewerActivity.class.getName().equals(intent.getComponent().getClassName())) {
            Object a;
            Object o;
            if (bg.d()) {
                final bi b = new m((Context)this.a).b((Context)this.a);
                a = b.a(bg.a().h());
                o = new PointF((float)b.a.x, (float)b.a.y);
            }
            else {
                o = null;
                a = null;
            }
            if (a != null) {
                intent.putExtra("return_top_left_coords", (Parcelable)a);
            }
            if (o != null) {
                intent.putExtra("return_size", (Parcelable)o);
            }
        }
    }
    
    public void a(final au au, final PointF pointF, final PointF pointF2, final TwitterScribeAssociation twitterScribeAssociation) {
        this.a(au, pointF, pointF2, twitterScribeAssociation, 1000L);
    }
    
    public void a(final au au, final PointF pointF, final PointF pointF2, final TwitterScribeAssociation twitterScribeAssociation, final long n) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b < n) {
            return;
        }
        this.b = currentTimeMillis;
        this.b(au, pointF, pointF2, twitterScribeAssociation);
    }
}
