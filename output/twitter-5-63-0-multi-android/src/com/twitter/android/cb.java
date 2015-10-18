// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.twitter.library.client.r;
import com.twitter.library.network.ae;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.provider.ad;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.k;
import com.twitter.library.client.az;
import android.text.TextUtils;
import com.twitter.library.card.j;
import com.twitter.library.card.CardDebugLog;
import com.twitter.internal.network.l;
import android.widget.Toast;
import com.twitter.library.provider.Tweet;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.os.Handler;
import com.twitter.android.card.z;
import android.support.v4.app.Fragment;
import com.twitter.library.card.Card;
import com.twitter.android.card.w;
import com.twitter.android.card.y;
import com.twitter.library.widget.tweet.content.d;
import android.graphics.Rect;
import android.content.Context;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.card.a;

class cb extends a
{
    final /* synthetic */ CardPreviewerFragment a;
    
    public cb(final CardPreviewerFragment a, final TwitterFragmentActivity twitterFragmentActivity) {
        this.a = a;
        super(twitterFragmentActivity);
    }
    
    @Override
    public Rect a(final Context context, final int n, final int n2, final int n3, final int n4) {
        return new Rect(n, n2, n + n3, n2 + n4);
    }
    
    @Override
    public d a() {
        return null;
    }
    
    @Override
    public void a(final String s, final String s2) {
        super.a(s, s2);
        this.a.a(s, s2);
    }
    
    @Override
    public void a(final boolean b) {
        super.a(b);
        final y n = this.a.o.n();
        if (n != null) {
            n.a();
            this.a.o.a((y)null);
        }
        final Card o = this.o();
        if (o != null) {
            w.a().a(this.a.o, o);
            this.a((Card)null);
        }
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean e() {
        return true;
    }
    
    @Override
    public void f() {
        this.a.a(2131296393);
    }
    
    @Override
    public void g() {
        this.a.a(2131296398);
    }
    
    @Override
    public void h() {
        this.a.a(2131296399);
    }
    
    @Override
    public void i() {
        super.i();
    }
}
