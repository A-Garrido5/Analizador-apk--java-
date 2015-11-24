// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound.ui;

import java.util.Iterator;
import java.util.Map;
import android.widget.FrameLayout$LayoutParams;
import android.view.View$OnTouchListener;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.TableLayout$LayoutParams;
import android.view.View;
import android.content.res.Resources;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.facebook.rebound.j;
import com.facebook.rebound.q;
import android.graphics.Color;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar;
import com.facebook.rebound.m;
import java.util.List;
import android.widget.TextView;
import android.widget.Spinner;
import com.facebook.rebound.o;
import java.text.DecimalFormat;
import android.widget.FrameLayout;

public class SpringConfiguratorView extends FrameLayout
{
    private static final DecimalFormat a;
    public static int d;
    private static final String z;
    private o b;
    private final int c;
    private Spinner e;
    private TextView f;
    private final a g;
    private final com.facebook.rebound.a h;
    private final List i;
    private TextView j;
    private final float k;
    private final float l;
    private final m m;
    private SeekBar n;
    private SeekBar o;
    
    static {
        final char[] charArray = "\u0018X6".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0007';
                    break;
                }
                case 0: {
                    c2 = ';';
                    break;
                }
                case 1: {
                    c2 = 'v';
                    break;
                }
                case 2: {
                    c2 = '\u0015';
                    break;
                }
                case 3: {
                    c2 = '%';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        a = new DecimalFormat(SpringConfiguratorView.z);
    }
    
    public SpringConfiguratorView(final Context context) {
        this(context, null);
    }
    
    public SpringConfiguratorView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SpringConfiguratorView(final Context context, final AttributeSet set, final int n) {
        final int d = SpringConfiguratorView.d;
        super(context, set, n);
        this.i = new ArrayList();
        this.c = Color.argb(255, 225, 225, 225);
        final q a = q.a();
        this.h = com.facebook.rebound.a.a();
        this.g = new a(this, context);
        final Resources resources = this.getResources();
        this.k = com.facebook.rebound.ui.g.a(40.0f, resources);
        this.l = com.facebook.rebound.ui.g.a(280.0f, resources);
        this.m = a.a();
        this.m.b(1.0).d(1.0).a(new b(this, null));
        this.addView(this.a(context));
        final c c = new c(this, null);
        this.n.setMax(100000);
        this.n.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)c);
        this.o.setMax(100000);
        this.o.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)c);
        this.e.setAdapter((SpinnerAdapter)this.g);
        this.e.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new f(this, null));
        this.c();
        this.setTranslationY(this.l);
        if (d != 0) {
            com.facebook.rebound.e.a = !com.facebook.rebound.e.a;
        }
    }
    
    private View a(final Context context) {
        final Resources resources = this.getResources();
        final int a = com.facebook.rebound.ui.g.a(5.0f, resources);
        final int a2 = com.facebook.rebound.ui.g.a(10.0f, resources);
        final int a3 = com.facebook.rebound.ui.g.a(20.0f, resources);
        final TableLayout$LayoutParams tableLayout$LayoutParams = new TableLayout$LayoutParams(0, -2, 1.0f);
        tableLayout$LayoutParams.setMargins(0, 0, a, 0);
        final FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams((ViewGroup$LayoutParams)com.facebook.rebound.ui.g.a(-1, com.facebook.rebound.ui.g.a(300.0f, resources)));
        final FrameLayout frameLayout2 = new FrameLayout(context);
        final FrameLayout$LayoutParams a4 = com.facebook.rebound.ui.g.a();
        a4.setMargins(0, a3, 0, 0);
        frameLayout2.setLayoutParams((ViewGroup$LayoutParams)a4);
        frameLayout2.setBackgroundColor(Color.argb(100, 0, 0, 0));
        frameLayout.addView((View)frameLayout2);
        this.e = new Spinner(context, 0);
        final FrameLayout$LayoutParams b = com.facebook.rebound.ui.g.b();
        b.gravity = 48;
        b.setMargins(a2, a2, a2, 0);
        this.e.setLayoutParams((ViewGroup$LayoutParams)b);
        frameLayout2.addView((View)this.e);
        final LinearLayout linearLayout = new LinearLayout(context);
        final FrameLayout$LayoutParams b2 = com.facebook.rebound.ui.g.b();
        b2.setMargins(0, 0, 0, com.facebook.rebound.ui.g.a(80.0f, resources));
        b2.gravity = 80;
        linearLayout.setLayoutParams((ViewGroup$LayoutParams)b2);
        linearLayout.setOrientation(1);
        frameLayout2.addView((View)linearLayout);
        final LinearLayout linearLayout2 = new LinearLayout(context);
        final FrameLayout$LayoutParams b3 = com.facebook.rebound.ui.g.b();
        b3.setMargins(a2, a2, a2, a3);
        linearLayout2.setPadding(a2, a2, a2, a2);
        linearLayout2.setLayoutParams((ViewGroup$LayoutParams)b3);
        linearLayout2.setOrientation(0);
        linearLayout.addView((View)linearLayout2);
        (this.n = new SeekBar(context)).setLayoutParams((ViewGroup$LayoutParams)tableLayout$LayoutParams);
        linearLayout2.addView((View)this.n);
        (this.j = new TextView(this.getContext())).setTextColor(this.c);
        final FrameLayout$LayoutParams a5 = com.facebook.rebound.ui.g.a(com.facebook.rebound.ui.g.a(50.0f, resources), -1);
        this.j.setGravity(19);
        this.j.setLayoutParams((ViewGroup$LayoutParams)a5);
        this.j.setMaxLines(1);
        linearLayout2.addView((View)this.j);
        final LinearLayout linearLayout3 = new LinearLayout(context);
        final FrameLayout$LayoutParams b4 = com.facebook.rebound.ui.g.b();
        b4.setMargins(a2, a2, a2, a3);
        linearLayout3.setPadding(a2, a2, a2, a2);
        linearLayout3.setLayoutParams((ViewGroup$LayoutParams)b4);
        linearLayout3.setOrientation(0);
        linearLayout.addView((View)linearLayout3);
        (this.o = new SeekBar(context)).setLayoutParams((ViewGroup$LayoutParams)tableLayout$LayoutParams);
        linearLayout3.addView((View)this.o);
        (this.f = new TextView(this.getContext())).setTextColor(this.c);
        final FrameLayout$LayoutParams a6 = com.facebook.rebound.ui.g.a(com.facebook.rebound.ui.g.a(50.0f, resources), -1);
        this.f.setGravity(19);
        this.f.setLayoutParams((ViewGroup$LayoutParams)a6);
        this.f.setMaxLines(1);
        linearLayout3.addView((View)this.f);
        final View view = new View(context);
        final FrameLayout$LayoutParams a7 = com.facebook.rebound.ui.g.a(com.facebook.rebound.ui.g.a(60.0f, resources), com.facebook.rebound.ui.g.a(40.0f, resources));
        a7.gravity = 49;
        view.setLayoutParams((ViewGroup$LayoutParams)a7);
        view.setOnTouchListener((View$OnTouchListener)new d(this, null));
        view.setBackgroundColor(Color.argb(255, 0, 164, 209));
        frameLayout.addView(view);
        return (View)frameLayout;
    }
    
    static SeekBar a(final SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.o;
    }
    
    static o a(final SpringConfiguratorView springConfiguratorView, final o b) {
        return springConfiguratorView.b = b;
    }
    
    static DecimalFormat a() {
        return SpringConfiguratorView.a;
    }
    
    private void a(final o o) {
        final int round = Math.round(100000.0f * ((float)com.facebook.rebound.b.d(o.c) - 0.0f) / 200.0f);
        final int round2 = Math.round(100000.0f * ((float)com.facebook.rebound.b.a(o.a) - 0.0f) / 50.0f);
        this.n.setProgress(round);
        this.o.setProgress(round2);
    }
    
    static int b(final SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.c;
    }
    
    private void b() {
        double n = 1.0;
        final double b = this.m.b();
        final m m = this.m;
        if (b == n) {
            n = 0.0;
        }
        m.d(n);
    }
    
    static void b(final SpringConfiguratorView springConfiguratorView, final o o) {
        springConfiguratorView.a(o);
    }
    
    static void c(final SpringConfiguratorView springConfiguratorView) {
        springConfiguratorView.b();
    }
    
    static TextView d(final SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.j;
    }
    
    static SeekBar e(final SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.n;
    }
    
    static float f(final SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.k;
    }
    
    static List g(final SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.i;
    }
    
    static float h(final SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.l;
    }
    
    static TextView i(final SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.f;
    }
    
    static o j(final SpringConfiguratorView springConfiguratorView) {
        return springConfiguratorView.b;
    }
    
    public void c() {
        final int d = SpringConfiguratorView.d;
        final Map b = this.h.b();
        this.g.a();
        this.i.clear();
        for (final Map.Entry<Object, V> entry : b.entrySet()) {
            if (entry.getKey() != com.facebook.rebound.o.b || d != 0) {
                this.i.add(entry.getKey());
                this.g.a((String)entry.getValue());
                if (d != 0) {
                    break;
                }
                continue;
            }
        }
        this.i.add(com.facebook.rebound.o.b);
        this.g.a((String)b.get(com.facebook.rebound.o.b));
        this.g.notifyDataSetChanged();
        if (this.i.size() > 0) {
            this.e.setSelection(0);
        }
        if (com.facebook.rebound.e.a) {
            SpringConfiguratorView.d = d + 1;
        }
    }
}
