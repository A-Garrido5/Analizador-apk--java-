// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.view.Menu;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import com.whatsapp.util.b;
import android.widget.AbsListView$OnScrollListener;
import com.whatsapp.wallpaper.h;
import android.widget.ListAdapter;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnLongClickListener;
import android.content.Context;
import com.whatsapp.protocol.c6;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.whatsapp.util.Log;
import android.os.Bundle;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.Iterator;
import com.whatsapp.util.b6;
import java.util.ArrayList;
import com.whatsapp.protocol.bi;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MessageDetailsActivity extends DialogToastActivity
{
    public static String l;
    public static String m;
    private static final String[] z;
    private final sj k;
    private ListView n;
    private BaseAdapter o;
    private long p;
    private final a9q q;
    private final Runnable r;
    private final aws s;
    private bi t;
    private ArrayList u;
    private ConversationRow v;
    
    static {
        int n = -1;
        final String[] z2 = new String[2];
        int n2 = 0;
        String[] array = z2;
        String s = "eo3Eroo$Sgic,E<lo3Bags";
        int n3 = n;
        String intern = null;
    Label_0095:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n4 = 0; i > n4; ++n4) {
                final char c = charArray[n4];
                char c2 = '\0';
                switch (n4 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = '\b';
                        break;
                    }
                    case 1: {
                        c2 = '\n';
                        break;
                    }
                    case 2: {
                        c2 = '@';
                        break;
                    }
                    case 3: {
                        c2 = '6';
                        break;
                    }
                }
                charArray[n4] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "eo3Eroo$Sgic,E<kx%Wgm";
                    n3 = 0;
                    continue;
                }
                case 0: {
                    break Label_0095;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        String s2 = "co9izl";
        String intern2 = null;
    Label_0361:
        while (true) {
            final char[] charArray2 = s2.toCharArray();
            for (int j = charArray2.length, n5 = 0; j > n5; ++n5) {
                final char c3 = charArray2[n5];
                char c4 = '\0';
                switch (n5 % 5) {
                    default: {
                        c4 = '\u0013';
                        break;
                    }
                    case 0: {
                        c4 = '\b';
                        break;
                    }
                    case 1: {
                        c4 = '\n';
                        break;
                    }
                    case 2: {
                        c4 = '@';
                        break;
                    }
                    case 3: {
                        c4 = '6';
                        break;
                    }
                }
                charArray2[n5] = (char)(c4 ^ c3);
            }
            intern2 = new String(charArray2).intern();
            switch (n) {
                default: {
                    MessageDetailsActivity.l = intern2;
                    s2 = "co9iamg/BvW`)R";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0361;
                }
            }
        }
        MessageDetailsActivity.m = intern2;
    }
    
    public MessageDetailsActivity() {
        this.q = new a9q();
        this.u = new ArrayList();
        this.k = new si(this);
        this.s = new kb(this);
        this.r = new bl(this);
    }
    
    private CharSequence a(final long n) {
        return b6.b(this.getBaseContext(), App.b(n));
    }
    
    static CharSequence a(final MessageDetailsActivity messageDetailsActivity, final long n) {
        return messageDetailsActivity.a(n);
    }
    
    static ArrayList a(final MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.u;
    }
    
    private void a() {
        App.aq.a5().removeCallbacks(this.r);
        if (this.p != Long.MAX_VALUE) {
            final long currentTimeMillis = System.currentTimeMillis();
            final long n = currentTimeMillis - this.p;
            if (n < 3600000L) {
                App.aq.a5().postDelayed(this.r, 1000L + (60000L + (this.p + 60000L * (n / 60000L)) - currentTimeMillis));
                if (!App.I) {
                    return;
                }
            }
            if (n < 86400000L) {
                App.aq.a5().postDelayed(this.r, 1000L + (3600000L + (this.p + 3600000L * (n / 3600000L)) - currentTimeMillis));
            }
        }
    }
    
    static boolean a(final MessageDetailsActivity messageDetailsActivity, final String s) {
        return messageDetailsActivity.a(s);
    }
    
    private boolean a(final String s) {
        final boolean i = App.I;
        final Iterator<dr> iterator = this.u.iterator();
        while (iterator.hasNext()) {
            if (s.equals(iterator.next().a)) {
                return true;
            }
            if (i) {
                break;
            }
        }
        return false;
    }
    
    static BaseAdapter b(final MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.o;
    }
    
    private void b() {
        final boolean i = App.I;
        this.u.clear();
        this.p = Long.MAX_VALUE;
        final Iterator<Map.Entry<K, wg>> iterator = App.ak.b(this.t.a).a.entrySet().iterator();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            while (iterator.hasNext()) {
                final Map.Entry<K, wg> entry = iterator.next();
                final wg wg = entry.getValue();
                this.u.add(new dr((String)entry.getKey(), wg));
                final long a = wg.a(5);
                final long a2 = wg.a(13);
                final long a3 = wg.a(8);
                int n4;
                if (a != 0L) {
                    this.p = Math.min(this.p, a);
                    n4 = n3 + 1;
                }
                else {
                    n4 = n3;
                }
                int n5;
                if (a2 != 0L) {
                    this.p = Math.min(this.p, a2);
                    n5 = n + 1;
                }
                else {
                    n5 = n;
                }
                int n6;
                if (a3 != 0L) {
                    this.p = Math.min(this.p, a3);
                    n6 = n2 + 1;
                }
                else {
                    n6 = n2;
                }
                if (i) {
                    if (adc.b(this.t.a.a) || a_9.f(this.t.a.a)) {
                        if (n6 < this.t.j && this.t.I == 2 && this.t.E == 1) {
                            this.u.add(new dc(this.t.j - n6, 8));
                        }
                        if (n5 < this.t.j) {
                            this.u.add(new dc(this.t.j - n5, 13));
                        }
                        if (n4 < this.t.j) {
                            this.u.add(new dc(this.t.j - n4, 5));
                        }
                    }
                    Collections.sort((List<Object>)this.u, new jh(this));
                    if (this.o != null) {
                        this.o.notifyDataSetChanged();
                    }
                    this.a();
                    return;
                }
                n = n5;
                n2 = n6;
                n3 = n4;
            }
            int n4 = n3;
            int n5 = n;
            int n6 = n2;
            continue;
        }
    }
    
    static a9q c(final MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.q;
    }
    
    static void d(final MessageDetailsActivity messageDetailsActivity) {
        messageDetailsActivity.b();
    }
    
    static bi e(final MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.t;
    }
    
    static ListView f(final MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.n;
    }
    
    static void g(final MessageDetailsActivity messageDetailsActivity) {
        messageDetailsActivity.a();
    }
    
    static ConversationRow h(final MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.v;
    }
    
    public void onCreate(final Bundle bundle) {
        int displayHomeAsUpEnabled = 1;
        final boolean i = App.I;
        Log.i(MessageDetailsActivity.z[displayHomeAsUpEnabled]);
        this.supportRequestWindowFeature(9);
        this.requestWindowFeature(9);
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(displayHomeAsUpEnabled != 0);
        this.setContentView(2130903186);
        final ActionBar supportActionBar = this.getSupportActionBar();
        final ColorDrawable backgroundDrawable = new ColorDrawable(this.getResources().getColor(2131624025));
        supportActionBar.setBackgroundDrawable((Drawable)backgroundDrawable);
        supportActionBar.setDisplayShowHomeEnabled(false);
        final Intent intent = this.getIntent();
        if (intent == null) {
            this.finish();
            return;
        }
        this.t = App.ak.a(new c6(intent.getStringExtra(MessageDetailsActivity.m), (boolean)(displayHomeAsUpEnabled != 0), intent.getStringExtra(MessageDetailsActivity.l)));
        if (this.t == null) {
            this.finish();
            return;
        }
        this.b();
        this.n = (ListView)this.findViewById(16908298);
        (this.v = Conversation.a((Context)this, this.t)).setOnLongClickListener((View$OnLongClickListener)null);
        final ViewGroup viewGroup = (ViewGroup)alm.a(this.getLayoutInflater(), 2130903187, null, false);
        final ViewGroup viewGroup2 = (ViewGroup)viewGroup.findViewById(2131755293);
        viewGroup2.addView((View)this.v, -1, -2);
        viewGroup2.measure(View$MeasureSpec.makeMeasureSpec(this.getWindowManager().getDefaultDisplay().getWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(-2, 0));
        final int n = this.getWindowManager().getDefaultDisplay().getHeight() / 2;
        if (viewGroup2.getMeasuredHeight() <= n) {
            displayHomeAsUpEnabled = 0;
        }
        if (displayHomeAsUpEnabled != 0) {
            this.n.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new aqs(this));
        }
        this.n.addHeaderView((View)viewGroup, (Object)null, false);
        final ImageView imageView = new ImageView((Context)this);
        imageView.setImageResource(2130838285);
        imageView.setScaleType(ImageView$ScaleType.FIT_XY);
        this.n.addHeaderView((View)imageView, (Object)null, false);
        final View view = new View((Context)this);
        view.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, this.getResources().getDimensionPixelSize(2131361875)));
        this.n.addFooterView(view, (Object)null, false);
        Label_0458: {
            if (adc.b(this.t.a.a) || a_9.f(this.t.a.a)) {
                this.o = new sf(this);
                if (!i) {
                    break Label_0458;
                }
            }
            this.o = new k9(this, null);
        }
        this.n.setAdapter((ListAdapter)this.o);
        final Drawable f = com.whatsapp.wallpaper.h.f((Context)this);
        Label_0509: {
            if (f != null) {
                viewGroup.setBackgroundDrawable((Drawable)new m6(this, f, viewGroup));
                if (!i) {
                    break Label_0509;
                }
            }
            viewGroup.setBackgroundResource(2131623981);
        }
        this.n.setOnScrollListener((AbsListView$OnScrollListener)new alt(this, (Drawable)backgroundDrawable, displayHomeAsUpEnabled != 0, viewGroup2, n));
        App.ak.a(this.k);
        App.b(this.s);
        com.whatsapp.util.b.a(this.t.a.a);
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onDestroy() {
        Log.i(MessageDetailsActivity.z[0]);
        super.onDestroy();
        this.q.a();
        App.aq.a5().removeCallbacks(this.r);
        App.ak.b(this.k);
        App.a(this.s);
        com.whatsapp.util.b.c(this.t.a.a);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return false;
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
}
