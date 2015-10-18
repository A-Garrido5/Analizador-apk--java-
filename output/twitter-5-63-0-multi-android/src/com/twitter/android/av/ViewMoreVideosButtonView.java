// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import java.util.Iterator;
import android.view.View;
import com.twitter.library.util.b;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Handler;
import com.twitter.android.widget.gi;
import java.util.TreeMap;
import com.twitter.android.widget.gj;
import android.widget.ImageView;

public class ViewMoreVideosButtonView extends ImageView implements gj
{
    private final TreeMap a;
    private final gi b;
    private boolean c;
    private final Handler d;
    
    public ViewMoreVideosButtonView(final Context context) {
        this(context, null);
    }
    
    public ViewMoreVideosButtonView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ViewMoreVideosButtonView(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, new gi());
    }
    
    public ViewMoreVideosButtonView(final Context context, final AttributeSet set, final int n, final gi b) {
        super(context, set, n);
        this.a = new TreeMap();
        this.d = new Handler(Looper.getMainLooper());
        this.setImageDrawable((Drawable)(this.b = b));
        this.b.a(this);
        this.a.put(75, true);
        this.a.put(90, true);
    }
    
    public void a() {
    }
    
    public void a(final int n) {
        if (this.a.containsKey(n) && this.a.get(n)) {
            com.twitter.library.util.b.b((View)this);
            this.c = (this.a.lastEntry().getKey() == n);
            this.d.postDelayed((Runnable)new bl(this), 500L);
            this.a.put(n, false);
        }
    }
    
    public void b() {
        final Iterator<Integer> iterator = this.a.keySet().iterator();
        while (iterator.hasNext()) {
            this.a.put((int)iterator.next(), true);
        }
    }
    
    public void onAnimationEnd() {
        if (this.c) {
            return;
        }
        this.postDelayed((Runnable)new bk(this), 500L);
    }
}
