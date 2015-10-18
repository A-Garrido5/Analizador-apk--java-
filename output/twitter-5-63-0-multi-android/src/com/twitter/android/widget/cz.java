// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.util.bk;
import java.lang.ref.WeakReference;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import android.view.View;
import java.util.Iterator;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.widget.ListView;
import java.util.HashMap;
import java.util.ArrayList;

public class cz
{
    private final ArrayList a;
    private final HashMap b;
    private ListView c;
    private TwitterScribeAssociation d;
    private int e;
    private int f;
    
    public cz() {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.e = 200;
        this.f = 30000;
    }
    
    public ArrayList a(final long n) {
        final Iterator<Long> iterator = this.b.keySet().iterator();
        while (iterator.hasNext()) {
            ((da)this.b.get(iterator.next())).a(n);
        }
        return this.a;
    }
    
    public void a(final float n, final float n2) {
        this.e = (int)(n * 1000.0f);
        this.f = (int)(n2 * 1000.0f);
    }
    
    public void a(final View view, final Tweet tweet, final Context context) {
        final long z = tweet.Z;
        da da = this.b.get(z);
        if (da == null) {
            da = new da(this, view, tweet, context);
            this.b.put(z, da);
        }
        else {
            da.d = new WeakReference((T)view);
        }
        da.a(bk.a());
    }
    
    public void a(final ListView c) {
        this.c = c;
    }
    
    public void a(final TwitterScribeAssociation d) {
        this.d = d;
    }
}
