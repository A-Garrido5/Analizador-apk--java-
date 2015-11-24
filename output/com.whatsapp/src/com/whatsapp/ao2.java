// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.Location;
import android.os.Build$VERSION;
import com.whatsapp.protocol.bt;
import android.widget.ListAdapter;
import java.util.List;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ListView;
import android.view.View;
import android.os.Handler;
import java.util.ArrayList;
import android.app.Activity;

public abstract class ao2
{
    private static final String z;
    private a9q a;
    private String b;
    private Activity c;
    private i4 d;
    private aak e;
    private final aws f;
    protected ArrayList g;
    private Runnable h;
    private final sj i;
    private long j;
    protected ArrayList k;
    private Handler l;
    private int m;
    private View n;
    private ListView o;
    
    static {
        final char[] charArray = "E=\u000f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001e';
                    break;
                }
                case 0: {
                    c2 = '/';
                    break;
                }
                case 1: {
                    c2 = 'T';
                    break;
                }
                case 2: {
                    c2 = 'k';
                    break;
                }
                case 3: {
                    c2 = '<';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ao2() {
        this.a = new a9q();
        this.k = new ArrayList();
        this.l = new Handler();
        this.j = 30000L;
        this.d = new adz(this);
        this.h = new ap(this);
        this.i = new s7(this);
        this.f = new at1(this);
    }
    
    static long a(final ao2 ao2, final long j) {
        return ao2.j = j;
    }
    
    static String a(final ao2 ao2) {
        return ao2.b;
    }
    
    static boolean b(final ao2 ao2) {
        return ao2.c();
    }
    
    static aak c(final ao2 ao2) {
        return ao2.e;
    }
    
    private boolean c() {
        final int m = (int)Math.min((this.c.getResources().getDimension(2131361919) + this.c.getResources().getDisplayMetrics().density) * this.g.size(), this.c.getResources().getDimension(2131361931));
        final int i = this.m;
        boolean b = false;
        if (m != i) {
            Label_0119: {
                if ((this.m = m) == 0) {
                    this.n.setVisibility(8);
                    if (!App.I) {
                        break Label_0119;
                    }
                }
                this.n.setVisibility(0);
                this.n.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, m));
            }
            b = true;
        }
        return b;
    }
    
    static Handler d(final ao2 ao2) {
        return ao2.l;
    }
    
    private void d() {
        this.c.runOnUiThread((Runnable)new b6(this));
    }
    
    static void e(final ao2 ao2) {
        ao2.d();
    }
    
    static Runnable f(final ao2 ao2) {
        return ao2.h;
    }
    
    static long g(final ao2 ao2) {
        return ao2.j;
    }
    
    static Activity h(final ao2 ao2) {
        return ao2.c;
    }
    
    static a9q i(final ao2 ao2) {
        return ao2.a;
    }
    
    public abstract void a();
    
    public void a(final Activity c) {
        this.c = c;
        this.b = c.getIntent().getStringExtra(ao2.z);
        this.g = dt.c.b(this.b);
        (this.o = (ListView)c.findViewById(16908298)).setOnItemClickListener((AdapterView$OnItemClickListener)new ahg(this));
        (this.n = c.findViewById(2131755607)).setVisibility(8);
        this.e = new aak(this, (Context)c, this.g);
        this.o.setAdapter((ListAdapter)this.e);
        this.c();
        dt.c.a(this.d);
        App.ak.a(this.i);
        App.b(this.f);
    }
    
    public abstract void a(final bt p0, final boolean p1);
    
    public void a(final ArrayList k) {
        this.k = k;
        this.e.notifyDataSetChanged();
        final int index = this.g.indexOf(this.k.get(0));
        if (Build$VERSION.SDK_INT >= 8) {
            this.o.smoothScrollToPosition(index);
            if (!App.I) {
                return;
            }
        }
        this.o.setSelection(index);
    }
    
    public void b() {
        this.l.removeCallbacks(this.h);
        App.a(new zp(this.b));
    }
    
    public abstract Location e();
    
    public void f() {
        this.k.clear();
        this.e.notifyDataSetChanged();
    }
    
    public void g() {
        this.a.a();
        dt.c.b(this.d);
        App.ak.b(this.i);
        App.a(this.f);
    }
    
    public void h() {
        final y6 y6 = new y6(this, this.b, true);
        this.l.removeCallbacks(this.h);
        this.l.postDelayed(this.h, this.j);
        App.a(y6);
        this.d();
    }
}
