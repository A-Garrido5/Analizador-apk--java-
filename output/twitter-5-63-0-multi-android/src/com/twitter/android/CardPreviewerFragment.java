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
import com.twitter.android.client.TwitterFragmentActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.card.element.d;
import com.twitter.library.client.k;
import com.twitter.library.client.az;
import android.text.TextUtils;
import com.twitter.library.card.j;
import com.twitter.library.card.CardDebugLog;
import com.twitter.library.card.Card;
import com.twitter.android.card.a;
import com.twitter.android.card.y;
import com.twitter.android.card.w;
import com.twitter.internal.network.l;
import android.content.Context;
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

public class CardPreviewerFragment extends Fragment implements z
{
    private Handler a;
    private ViewGroup b;
    private View c;
    private TextView d;
    private Button e;
    private RelativeLayout f;
    private TextView g;
    private TextView h;
    private View i;
    private Tweet j;
    private String k;
    private String l;
    private String m;
    private String n;
    private cb o;
    private boolean p;
    
    private void a(final int n) {
        final Toast text = Toast.makeText((Context)this.getActivity(), n, 0);
        text.setGravity(48, 0, 0);
        text.show();
    }
    
    private void a(final int n, final int n2, final int n3, final int n4) {
        this.g.setText((CharSequence)String.format(this.m, n, n2));
        this.h.setText((CharSequence)String.format(this.n, n3, n4));
    }
    
    private void a(final View i) {
        this.f.addView(i);
        this.i = i;
    }
    
    private void a(final String s, final l l) {
        this.a(s, l.a + " - " + l.b);
    }
    
    private void a(final String s, final String s2) {
        this.b(s2 + " " + s);
    }
    
    private void a(final boolean enabled) {
        this.e.setEnabled(enabled);
    }
    
    private void b() {
        final w a = w.a();
        final y n = this.o.n();
        if (n != null) {
            n.a();
            this.o.a((y)null);
        }
        final Card o = this.o.o();
        if (o != null) {
            a.a(o.id);
            a.a(this.o, o);
            this.o.a((Card)null);
        }
        CardDebugLog.b("Load Card", null);
        new ca(this).execute((Object[])new Void[0]);
    }
    
    private void b(final String s) {
        CardDebugLog.d(s, null);
        this.d(s);
    }
    
    private void c() {
        this.d.setVisibility(8);
        this.d.setText((CharSequence)"");
    }
    
    private void c(final String s) {
        CardDebugLog.b(s, null);
    }
    
    private void d() {
        this.a(this.c);
    }
    
    private void d(final String s) {
        this.a.post((Runnable)new bu(this, s));
    }
    
    private void e() {
        if (this.i != null) {
            this.f.removeView(this.i);
            this.i = null;
        }
    }
    
    private void f() {
        this.o.a((y)null);
        this.e();
        this.a(true);
    }
    
    @Override
    public void a() {
        this.f();
    }
    
    @Override
    public void a(final Card card) {
        this.f();
        CardDebugLog.b("Card Loaded: " + card.name, null);
        this.o.a(card);
        card.a(this.o);
        card.j();
        this.o.s();
        this.a((View)card.aB_());
        final FragmentActivity activity = this.getActivity();
        final Context applicationContext = activity.getApplicationContext();
        if (TextUtils.isEmpty((CharSequence)this.k)) {
            final Session b = az.a(applicationContext).b();
            if (b != null) {
                new k((Context)activity, b.e(), "settings").a().a("developer_settings_enabled", true).apply();
            }
        }
        final bz bz = new bz(null);
        card.a(bz);
        this.a(bz.a, bz.b, bz.c, bz.d);
    }
    
    @Override
    public void a(final String s) {
        this.f();
        this.b("Card Get Error: " + s);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup b, final Bundle bundle) {
        super.onCreateView(layoutInflater, b, bundle);
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            this.k = arguments.getString("host");
        }
        final View inflate = layoutInflater.inflate(2130968632, b, false);
        final TwitterFragmentActivity twitterFragmentActivity = (TwitterFragmentActivity)this.getActivity();
        final Context applicationContext = twitterFragmentActivity.getApplicationContext();
        this.a = new Handler();
        this.b = b;
        this.c = layoutInflater.inflate(2130968629, this.b, false);
        this.d = (TextView)inflate.findViewById(2131886371);
        this.e = (Button)inflate.findViewById(2131886368);
        this.f = (RelativeLayout)inflate.findViewById(2131886372);
        this.g = (TextView)inflate.findViewById(2131886369);
        this.h = (TextView)inflate.findViewById(2131886370);
        final Resources resources = applicationContext.getResources();
        this.m = resources.getString(2131296791);
        this.n = resources.getString(2131296792);
        this.a(0, 0, 0, 0);
        this.j = new ad().a(new TwitterStatusCard()).a();
        final String a = ae.a(applicationContext).a();
        if (TextUtils.isEmpty((CharSequence)this.k)) {
            this.l = this.getString(2131298182, a);
            this.p = true;
        }
        else {
            this.l = this.getString(2131298181, this.k, a);
        }
        (this.o = new cb(this, twitterFragmentActivity)).a(this.j);
        twitterFragmentActivity.a(this.o);
        this.b();
        this.e.setOnClickListener((View$OnClickListener)new bt(this));
        return inflate;
    }
}
