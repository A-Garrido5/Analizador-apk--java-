// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewGroup$LayoutParams;
import com.twitter.android.MainActivity;
import com.twitter.android.client.TwitterFragmentActivity;
import android.os.Bundle;
import android.graphics.Rect;
import android.content.res.Configuration;
import android.app.Activity;
import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import android.os.Build$VERSION;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.ad;
import java.util.ArrayList;
import java.util.List;
import android.view.WindowManager;
import android.content.Context;
import com.twitter.library.client.r;
import com.twitter.library.client.af;

public class bg implements au, af, r
{
    static bg a;
    private final Context b;
    private final WindowManager c;
    private final List d;
    private boolean e;
    private bc f;
    
    private bg(final Context context) {
        this.d = new ArrayList();
        this.e = false;
        this.f = bc.a;
        this.b = context.getApplicationContext();
        this.c = (WindowManager)this.b.getSystemService("window");
        ad.a().a(this);
    }
    
    public static bg a() {
        if (bg.a == null) {
            throw new IllegalStateException("init(Context) MUST be called before any call to getInstance().");
        }
        return bg.a;
    }
    
    public static void a(final Context context) {
        bg.a = new bg(context);
    }
    
    public static boolean b() {
        return d.f("video_docking_enabled");
    }
    
    public static boolean c() {
        return b() && Build$VERSION.SDK_INT >= 16;
    }
    
    public static boolean d() {
        return b() && d.f("android_new_audio_dock_enabled");
    }
    
    public a a(final String s) {
        for (final a a : this.f()) {
            if (s.equals(a.a())) {
                return a;
            }
        }
        return null;
    }
    
    List a(final Class clazz) {
        final ArrayList<ap> list = new ArrayList<ap>();
        for (final ap ap : this.d) {
            if (clazz == null || clazz.isAssignableFrom(ap.getClass())) {
                list.add(ap);
            }
        }
        return list;
    }
    
    public void a(final int n) {
        final Iterator<ap> iterator = new ArrayList<ap>(this.d).iterator();
        while (iterator.hasNext()) {
            this.b(iterator.next(), n);
        }
    }
    
    @Override
    public void a(final int n, final int n2, final Intent intent) {
    }
    
    @Override
    public void a(final Activity activity) {
        if (!activity.isChangingConfigurations()) {
            this.a(0);
        }
    }
    
    @Override
    public void a(final Configuration configuration) {
        this.a(this.f.a());
    }
    
    public void a(final Rect rect) {
        final Iterator<ap> iterator = this.e().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(rect);
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
    }
    
    public void a(final TwitterFragmentActivity twitterFragmentActivity) {
        if (!this.d.isEmpty() && twitterFragmentActivity instanceof MainActivity) {
            this.a(1);
        }
    }
    
    @Override
    public void a(final ap ap) {
        this.b(ap, 0);
    }
    
    public void a(final ap ap, final int n) {
        this.d.add(ap);
        ap.a(this);
        ap.a(this.c, this.f.a(), n, null);
    }
    
    @Override
    public void a(final ap ap, final be be) {
        this.c.updateViewLayout(be.f(), (ViewGroup$LayoutParams)be.a());
    }
    
    public void a(final bc f) {
        this.f = f;
    }
    
    public void a(final String s, final int n) {
        for (final ap ap : new ArrayList<ap>(this.d)) {
            if (s.equals(ap.a())) {
                this.b(ap, n);
            }
        }
    }
    
    @Override
    public void a(final boolean b) {
    }
    
    @Override
    public void b(final Activity activity) {
    }
    
    @Override
    public void b(final ap ap) {
    }
    
    public void b(final ap ap, final int n) {
        if (this.d.contains(ap)) {
            this.d.remove(ap);
            ap.b(this.c, n, new bh(this, ap));
        }
    }
    
    public void b(final String s, final int n) {
        for (final ap ap : new ArrayList<ap>(this.d)) {
            if (!s.equals(ap.a())) {
                this.b(ap, n);
            }
        }
    }
    
    @Override
    public void b(final boolean b) {
    }
    
    public void c(final ap ap) {
        this.a(ap, 0);
    }
    
    public void c(final boolean e) {
        this.e = e;
    }
    
    public List e() {
        return this.d;
    }
    
    public List f() {
        return this.a(a.class);
    }
    
    public void g() {
        if (this.f != null) {
            bc.a.a(this.f.a());
        }
        this.f = bc.a;
    }
    
    public Rect h() {
        return new Rect(this.f.a());
    }
    
    public boolean i() {
        return this.e;
    }
    
    @Override
    public void j() {
    }
    
    @Override
    public void k() {
        this.a(this.f.a());
    }
}
