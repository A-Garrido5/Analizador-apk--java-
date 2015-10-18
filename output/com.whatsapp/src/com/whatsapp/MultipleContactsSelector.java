// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.view.MenuItem;
import android.app.Activity;
import android.view.View;
import android.widget.ListAdapter;
import android.view.View$OnClickListener;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListView;
import java.util.Collection;
import android.text.TextUtils;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.text.TextWatcher;
import android.widget.TextView;
import java.util.ArrayList;

public abstract class MultipleContactsSelector extends DialogToastActivity implements aws
{
    private static final String[] z;
    private a9q k;
    protected ArrayList l;
    private ArrayList m;
    private ArrayList n;
    protected TextView o;
    private o4 p;
    private kj q;
    final TextWatcher r;
    private ImageButton s;
    protected AutoCompleteTextView t;
    AdapterView$OnItemClickListener u;
    
    static {
        final String[] z2 = new String[4];
        String s = "rII*woP@=qqHD=jlO@2{|HJ,1{YV*lpE";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001e';
                        break;
                    }
                    case 0: {
                        c2 = '\u001f';
                        break;
                    }
                    case 1: {
                        c2 = '<';
                        break;
                    }
                    case 2: {
                        c2 = '%';
                        break;
                    }
                    case 3: {
                        c2 = '^';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "uUA-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "rII*woP@=qqHD=jlO@2{|HJ,1|N@?jz";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "uUA-";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public MultipleContactsSelector() {
        this.m = new ArrayList();
        this.l = new ArrayList();
        this.q = new kj(this, null);
        this.k = new a9q();
        this.u = (AdapterView$OnItemClickListener)new bh(this);
        this.r = (TextWatcher)new a86(this);
    }
    
    static ArrayList a(final MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.m;
    }
    
    static ArrayList a(final MultipleContactsSelector multipleContactsSelector, final ArrayList n) {
        return multipleContactsSelector.n = n;
    }
    
    static boolean a(final MultipleContactsSelector multipleContactsSelector, final String s) {
        return multipleContactsSelector.f(s);
    }
    
    static kj b(final MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.q;
    }
    
    static a9q c(final MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.k;
    }
    
    static ArrayList d(final MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.n;
    }
    
    private boolean f(final String s) {
        final boolean i = App.I;
        final Iterator<a_9> iterator = this.l.iterator();
        while (iterator.hasNext()) {
            if (s.equals(iterator.next().u)) {
                return true;
            }
            if (i) {
                break;
            }
        }
        return false;
    }
    
    private ArrayList h() {
        final ArrayList<Object> list = new ArrayList<Object>();
        App.S.e(list);
        Collections.sort(list, new mg(this.getApplicationContext()));
        return list;
    }
    
    protected abstract String a();
    
    @Override
    public void a() {
        final boolean i = App.I;
        this.m = this.h();
        final ArrayList<a_9> list = new ArrayList<a_9>();
        for (final a_9 a_9 : this.l) {
            for (final a_9 a_10 : this.m) {
                if (TextUtils.equals((CharSequence)a_10.u, (CharSequence)a_9.u)) {
                    list.add(a_10);
                    if (!i) {
                        break;
                    }
                }
                if (i) {
                    break;
                }
            }
            if (i) {
                break;
            }
        }
        this.l.clear();
        this.l.addAll(list);
        this.p.notifyDataSetChanged();
        this.q.notifyDataSetChanged();
    }
    
    protected void a(final ListView listView) {
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    protected abstract String b();
    
    @Override
    public void b(final String s) {
        if (!adc.b(s)) {
            final a_9 e = App.S.e(s);
            if (e != null) {
                final rq rq = new rq(e);
                if (a_9.a(this.m, rq)) {
                    this.p.notifyDataSetChanged();
                }
                if (a_9.a(this.l, rq)) {
                    this.q.notifyDataSetChanged();
                }
            }
        }
    }
    
    protected abstract int c();
    
    @Override
    public void c(final String s) {
    }
    
    protected String d() {
        final boolean i = App.I;
        final StringBuilder sb = new StringBuilder();
        for (final a_9 a_9 : this.l) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(a_9.u);
            if (i) {
                break;
            }
        }
        return sb.toString();
    }
    
    @Override
    public void d(final String s) {
        final a_9 e = App.S.e(s);
        if (e != null) {
            final rw rw = new rw(e);
            if (a_9.a(this.m, rw)) {
                this.p.notifyDataSetChanged();
            }
            if (a_9.a(this.l, rw)) {
                this.q.notifyDataSetChanged();
            }
        }
    }
    
    protected abstract int e();
    
    protected void e(final String s) {
        final boolean i = App.I;
        this.l.clear();
        final String[] split = s.split(",");
        final int length = split.length;
        int j = 0;
        while (j < length) {
            this.l.add(App.S.e(split[j]));
            ++j;
            if (i) {
                break;
            }
        }
        this.t.setText((CharSequence)"");
        this.q.notifyDataSetChanged();
        this.i();
    }
    
    protected abstract int f();
    
    protected abstract int g();
    
    protected void i() {
        final boolean i = App.I;
        if (this.l.size() == 0) {
            this.o.setText((CharSequence)"");
            if (!i) {
                return;
            }
        }
        if (this.f() > 0) {
            this.o.setText((CharSequence)(Integer.toString(this.l.size()) + "/" + this.f()));
            if (!i) {
                return;
            }
        }
        this.o.setText((CharSequence)Integer.toString(this.l.size()));
    }
    
    protected abstract void j();
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            case 1: {
                if (n2 != -1) {
                    return;
                }
                final String stringExtra = intent.getStringExtra(MultipleContactsSelector.z[1]);
                if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
                    this.e(stringExtra);
                }
                if (App.I) {
                    break;
                }
                return;
            }
        }
        super.onActivityResult(n, n2, intent);
    }
    
    public void onCreate(final Bundle bundle) {
        Log.i(MultipleContactsSelector.z[2]);
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowCustomEnabled(true);
        this.getSupportActionBar().setTitle(this.a());
        this.setContentView(2130903195);
        ((TextView)this.findViewById(2131755683)).setText((CharSequence)this.b());
        this.o = (TextView)this.findViewById(2131755684);
        (this.s = (ImageButton)this.findViewById(2131755687)).setOnClickListener((View$OnClickListener)new mx(this));
        this.m = this.h();
        this.p = new o4(this);
        (this.t = (AutoCompleteTextView)this.findViewById(2131755685)).setAdapter((ListAdapter)this.p);
        this.t.setOnItemClickListener(this.u);
        this.t.setThreshold(1);
        alm.a((TextView)this.t);
        alm.a((View)this.t, 0, this.getResources().getDimensionPixelSize(2131361822));
        final ListView listView = (ListView)this.findViewById(16908298);
        this.a(listView);
        listView.setAdapter((ListAdapter)this.q);
        a81.a(this, this.getSupportActionBar(), this.getString(this.g()).toUpperCase(), (View$OnClickListener)new pt(this));
        this.i();
        this.t.addTextChangedListener(this.r);
        final String stringExtra = this.getIntent().getStringExtra(MultipleContactsSelector.z[3]);
        if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
            this.e(stringExtra);
        }
        App.b((aws)this);
    }
    
    public void onDestroy() {
        Log.i(MultipleContactsSelector.z[0]);
        super.onDestroy();
        this.k.a();
        App.a((aws)this);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return true;
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
}
