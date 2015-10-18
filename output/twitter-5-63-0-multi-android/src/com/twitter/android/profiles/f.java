// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import android.support.v4.content.Loader;
import com.twitter.library.provider.be;
import android.net.Uri;
import android.widget.ListAdapter;
import com.twitter.android.mz;
import com.twitter.library.view.k;
import com.twitter.library.widget.c;
import com.twitter.android.pg;
import com.twitter.android.ou;
import android.database.Cursor;
import android.view.ViewGroup;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.az;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ListView;
import com.twitter.android.widget.ec;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;

class f implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ e b;
    
    f(final e b, final ViewTreeObserver a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        if (this.a == null || !this.a.isAlive()) {
            viewTreeObserver = this.b.g.getViewTreeObserver();
        }
        else {
            viewTreeObserver = this.a;
        }
        viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        this.b.a(true, false);
        return false;
    }
}
