// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import com.twitter.library.service.aa;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import android.content.Context;
import java.util.regex.Matcher;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.featureswitch.d;
import android.app.Activity;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.List;
import java.lang.ref.WeakReference;
import com.twitter.library.client.au;

public class e implements c, au
{
    private static final boolean a;
    private final WeakReference b;
    private final WeakReference c;
    private ux d;
    private String e;
    private List f;
    private va g;
    private f h;
    private int i;
    
    static {
        a = (App.l() && Log.isLoggable("CardPreview", 3));
    }
    
    e(final Activity activity, final CardPreviewView cardPreviewView) {
        this.b = new WeakReference((T)activity);
        this.c = new WeakReference((T)cardPreviewView);
        this.i = com.twitter.library.featureswitch.d.a("card_compose_preview_fetch_delay", 250);
    }
    
    private void a(final CardInstanceData cardInstanceData) {
        this.e();
        final Activity activity = (Activity)this.b.get();
        if (activity != null) {
            this.e = cardInstanceData.url;
            this.d = ux.a(activity, cardInstanceData);
            if (this.d != null) {
                this.d.a();
                this.d.b();
                final CardPreviewView cardPreviewView = (CardPreviewView)this.c.get();
                if (cardPreviewView != null) {
                    cardPreviewView.a(this.d.d());
                }
            }
        }
    }
    
    private void a(final String s, final String s2, final List list) {
        final StringBuilder sb = new StringBuilder(s);
        sb.append(" : ").append(String.format("'%s'", s2));
        if (this.f != null) {
            sb.append(" | ");
            for (final String s3 : this.f) {
                sb.append(" ");
                sb.append(String.format("'%s'", s3));
            }
        }
        if (list != null) {
            sb.append(" | ");
            for (final String s4 : list) {
                sb.append(" ");
                sb.append(String.format("'%s'", s4));
            }
        }
        Log.d("CardPreview", sb.toString());
    }
    
    static boolean a(final List list, final List list2, final boolean b) {
        return !b && list2.size() > 0 && !list2.equals(list);
    }
    
    static List b(final String s) {
        final ArrayList<String> list = new ArrayList<String>();
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final Matcher matcher = ch.h.matcher(s);
            while (matcher.find()) {
                if (!TextUtils.isEmpty((CharSequence)matcher.group(4))) {
                    list.add(matcher.group(3));
                }
            }
        }
        return list;
    }
    
    private void c(final String s) {
        final CardPreviewView cardPreviewView = (CardPreviewView)this.c.get();
        if (cardPreviewView == null) {
            if (com.twitter.android.nativecards.e.a) {
                Log.d("CardPreview", "View went away");
            }
        }
        else {
            if (com.twitter.android.nativecards.e.a) {
                Log.d("CardPreview", "Requesting");
            }
            this.g();
            this.h = null;
            final Activity activity = (Activity)this.b.get();
            if (activity != null) {
                this.g = new va((Context)activity, com.twitter.android.client.c.a((Context)activity).a().b(), s);
                as.a((Context)activity).a(this.g, 0, 0, this);
                cardPreviewView.b();
            }
        }
    }
    
    private void e() {
        if (!this.f()) {
            this.e = null;
        }
        if (this.d != null) {
            this.d.c();
            this.d = null;
        }
        final CardPreviewView cardPreviewView = (CardPreviewView)this.c.get();
        if (cardPreviewView != null) {
            cardPreviewView.a();
        }
    }
    
    private boolean f() {
        return "tombstone://card".equals(this.e);
    }
    
    private void g() {
        if (this.g != null) {
            this.g.b();
        }
    }
    
    private void h() {
        if (this.h != null) {
            this.h.a = true;
            new Handler(Looper.getMainLooper()).removeCallbacks((Runnable)this.h);
            this.h = null;
        }
    }
    
    @Override
    public void a() {
        this.e();
        this.e = "tombstone://card";
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        switch (n) {
            case 0: {
                this.g = null;
                if (com.twitter.android.nativecards.e.a) {
                    Log.d("CardPreview", String.format("Request complete: %d %s", aa.c(), aa.d()));
                }
                final CardPreviewView cardPreviewView = (CardPreviewView)this.c.get();
                if (cardPreviewView != null) {
                    cardPreviewView.c();
                }
                if (aa.a()) {
                    final va va = (va)y;
                    final CardInstanceData g = va.g();
                    if (com.twitter.android.nativecards.e.a) {
                        if (va.e()) {
                            Log.d("CardPreview", "Canceled");
                        }
                        if (g == null) {
                            Log.d("CardPreview", "No card");
                        }
                    }
                    if (va.e() || g == null) {
                        this.e();
                        return;
                    }
                    if (g == null) {
                        break;
                    }
                    final String url = g.url;
                    if (com.twitter.android.nativecards.e.a) {
                        Log.d("CardPreview", String.format("Result: %s", url));
                    }
                    if (TextUtils.isEmpty((CharSequence)this.e) || !this.e.equals(url)) {
                        this.a(g);
                        return;
                    }
                    break;
                }
                else {
                    this.e();
                    if (com.twitter.android.nativecards.e.a) {
                        Log.d("CardPreview", String.format("Request failed: %d %s", aa.c(), aa.d()));
                        return;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    @Override
    public void a(final String e) {
        this.c();
        if ("tombstone://card".equals(e)) {
            this.e = e;
        }
    }
    
    @Override
    public void a(final String s, final boolean b) {
        if (this.d()) {
            final List b2 = b(s);
            this.a("Update", s, b2);
            if (a(this.f, b2, b)) {
                this.h();
                if (this.c.get() != null) {
                    this.f = b2;
                    this.h = new f(this, s);
                    new Handler(Looper.getMainLooper()).postDelayed((Runnable)this.h, (long)this.i);
                }
            }
            else if (com.twitter.android.nativecards.e.a) {
                Log.d("CardPreview", "No request necessary");
            }
        }
    }
    
    @Override
    public String b() {
        return this.e;
    }
    
    @Override
    public void b(final int n, final y y) {
    }
    
    @Override
    public void c() {
        this.g();
        this.h();
        this.f = null;
    }
    
    public boolean d() {
        return com.twitter.library.featureswitch.d.a("card_compose_preview_enabled", true);
    }
}
