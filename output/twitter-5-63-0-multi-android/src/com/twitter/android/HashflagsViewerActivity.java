// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import java.util.ArrayList;
import android.widget.ListAdapter;
import com.twitter.internal.android.widget.TypefacesTextView;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.manager.k;
import com.twitter.library.view.h;
import android.content.Context;
import com.twitter.library.media.manager.q;
import com.twitter.library.view.e;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.ListView;
import com.twitter.android.client.TwitterFragmentActivity;

public class HashflagsViewerActivity extends TwitterFragmentActivity
{
    private ListView a;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968810);
        bn.d(false);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        int n = 0;
        super.a(bundle, d);
        final ArrayList b = com.twitter.library.view.e.b();
        final com.twitter.library.media.manager.h d2 = q.a((Context)this).d();
        final Iterator<h> iterator = b.iterator();
        while (iterator.hasNext()) {
            d2.a(new k(iterator.next().b).a(Size.a(200, 200)).a());
        }
        this.a = (ListView)this.findViewById(2131886798);
        if (b.isEmpty()) {
            final TypefacesTextView typefacesTextView = (TypefacesTextView)this.findViewById(2131886797);
            typefacesTextView.setText((CharSequence)"No hashflags enabled");
            typefacesTextView.setVisibility(0);
            this.a.setVisibility(8);
        }
        final iu[] array = new iu[b.size()];
        for (final h h : b) {
            final int n2 = n + 1;
            array[n] = new iu(h.a, h.b);
            n = n2;
        }
        this.a.setAdapter((ListAdapter)new iv((Context)this, array));
    }
}
