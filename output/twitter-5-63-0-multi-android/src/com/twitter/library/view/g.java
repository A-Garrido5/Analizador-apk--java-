// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import com.twitter.library.media.manager.q;
import java.util.ArrayList;
import com.twitter.library.featureswitch.d;
import java.util.concurrent.Future;
import java.util.List;
import java.util.concurrent.ExecutionException;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.graphics.drawable.BitmapDrawable;
import com.twitter.library.media.manager.p;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import com.twitter.library.provider.Tweet;
import java.util.LinkedHashMap;
import com.twitter.library.featureswitch.n;
import android.content.Context;
import com.twitter.internal.android.util.Size;
import java.util.Map;
import com.twitter.library.media.manager.k;
import com.twitter.library.util.bk;
import java.util.Timer;
import com.twitter.library.media.manager.h;
import java.util.Iterator;
import java.util.TimerTask;

final class g extends TimerTask
{
    final /* synthetic */ Iterator a;
    final /* synthetic */ h b;
    final /* synthetic */ Timer c;
    
    g(final Iterator a, final h b, final Timer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        int n = 0;
        while (this.a.hasNext()) {
            final int n2 = n + 1;
            if (n >= 10) {
                break;
            }
            final com.twitter.library.view.h h = this.a.next();
            final long n3 = bk.a() / 1000L;
            if (n3 > h.c && n3 < h.d) {
                this.b.a(new k(h.b).a(e.f).a());
            }
            n = n2;
        }
        if (!this.a.hasNext() && this.c != null) {
            this.c.cancel();
        }
    }
}
