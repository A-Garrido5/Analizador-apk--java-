// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.view.MenuItem;
import com.whatsapp.util.Log;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.Menu;
import android.app.Activity;
import com.whatsapp.fieldstats.bq;
import android.content.Intent;
import android.widget.ListView;
import android.view.View$OnClickListener;
import android.widget.ListAdapter;
import android.widget.AdapterView$OnItemClickListener;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.m;
import android.os.Bundle;
import android.os.AsyncTask;
import android.view.View;
import android.text.TextUtils;
import android.graphics.Paint;
import com.whatsapp.util.t;
import android.widget.TextView;
import com.whatsapp.util.co;
import java.util.ArrayList;
import android.support.v4.app.ListFragment;

public class CallsFragment extends ListFragment implements ga
{
    private static final String[] z;
    private ArrayList b;
    private CharSequence c;
    private ask d;
    private final Runnable e;
    co f;
    private asn g;
    private ArrayList h;
    private final p5 i;
    private ArrayList j;
    private a9q k;
    private final aws l;
    private final aa0 m;
    
    static {
        final String[] z2 = new String[4];
        String s = "$lG5\n?>Ma\u001f\"j\u001ez\u000b$yQ|\u00107>]t\u0012<>Xg\u0011=>_v\n9h[5\b?wN5\u001d1rR";
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
                        c2 = '~';
                        break;
                    }
                    case 0: {
                        c2 = 'P';
                        break;
                    }
                    case 1: {
                        c2 = '\u001e';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "3\u007fRy.9}Up\f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "3\u007fRy\r\u007fz[f\n\"qG";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "3qPa\u001f3j";
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
    
    public CallsFragment() {
        this.k = new a9q();
        this.b = new ArrayList();
        this.j = new ArrayList();
        this.l = new a83(this);
        this.i = new aay(this);
        this.m = new asv(this);
        this.e = new at2(this);
        this.f = new a0o(this);
    }
    
    static asn a(final CallsFragment callsFragment, final asn g) {
        return callsFragment.g = g;
    }
    
    static CharSequence a(final CallsFragment callsFragment, final CharSequence c) {
        return callsFragment.c = c;
    }
    
    static ArrayList a(final CallsFragment callsFragment) {
        return callsFragment.j;
    }
    
    static ArrayList a(final CallsFragment callsFragment, final ArrayList h) {
        return callsFragment.h = h;
    }
    
    private void a() {
        final boolean i = App.I;
        final View view = this.getView();
        if (view != null) {
            if (this.b.isEmpty()) {
                if (this.g != null) {
                    view.findViewById(2131755315).setVisibility(0);
                    view.findViewById(2131755312).setVisibility(8);
                    view.findViewById(2131755310).setVisibility(8);
                    view.findViewById(2131755314).setVisibility(8);
                    if (!i) {
                        return;
                    }
                }
                if (App.S.d() > 0) {
                    view.findViewById(2131755315).setVisibility(8);
                    view.findViewById(2131755312).setVisibility(8);
                    view.findViewById(2131755310).setVisibility(0);
                    view.findViewById(2131755314).setVisibility(8);
                    final TextView textView = (TextView)view.findViewById(2131755311);
                    textView.setText(t.a(this.getResources().getString(2131231968), this.getResources().getDrawable(2130838816), (Paint)textView.getPaint()));
                    if (!i) {
                        return;
                    }
                }
                view.findViewById(2131755315).setVisibility(8);
                view.findViewById(2131755312).setVisibility(8);
                view.findViewById(2131755310).setVisibility(8);
                view.findViewById(2131755314).setVisibility(0);
                if (!i) {
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.c)) {
                view.findViewById(2131755315).setVisibility(8);
                view.findViewById(2131755312).setVisibility(0);
                view.findViewById(2131755310).setVisibility(8);
                view.findViewById(2131755314).setVisibility(8);
            }
        }
    }
    
    static ArrayList b(final CallsFragment callsFragment) {
        return callsFragment.h;
    }
    
    static ArrayList b(final CallsFragment callsFragment, final ArrayList b) {
        return callsFragment.b = b;
    }
    
    private void b() {
        if (this.g != null) {
            this.g.cancel(true);
        }
        a8s.a(this.g = new asn(this, null), new Void[0]);
    }
    
    static ask c(final CallsFragment callsFragment) {
        return callsFragment.d;
    }
    
    static ArrayList c(final CallsFragment callsFragment, final ArrayList j) {
        return callsFragment.j = j;
    }
    
    private void c() {
        App.aq.a5().removeCallbacks(this.e);
        if (!this.b.isEmpty() && this.getActivity() != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            final long n = currentTimeMillis - this.b.get(0).a();
            if (n < 3600000L) {
                App.aq.a5().postDelayed(this.e, 1000L + (60000L + (this.b.get(0).a() + 60000L * (n / 60000L)) - currentTimeMillis));
                if (!App.I) {
                    return;
                }
            }
            if (n < 86400000L) {
                App.aq.a5().postDelayed(this.e, 1000L + (3600000L + (this.b.get(0).a() + 3600000L * (n / 3600000L)) - currentTimeMillis));
            }
        }
    }
    
    static void d(final CallsFragment callsFragment) {
        callsFragment.b();
    }
    
    static CharSequence e(final CallsFragment callsFragment) {
        return callsFragment.c;
    }
    
    static void f(final CallsFragment callsFragment) {
        callsFragment.c();
    }
    
    static void g(final CallsFragment callsFragment) {
        callsFragment.a();
    }
    
    static a9q h(final CallsFragment callsFragment) {
        return callsFragment.k;
    }
    
    static ArrayList i(final CallsFragment callsFragment) {
        return callsFragment.b;
    }
    
    @Override
    public void a(final CharSequence c) {
        this.c = c;
        this.d.getFilter().filter(c);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.setHasOptionsMenu(true);
        final ListView listView = this.getListView();
        listView.setDivider((Drawable)new m(this.getResources().getDrawable(2130837753)));
        listView.setFastScrollEnabled(Build$VERSION.SDK_INT < 11);
        if (Build$VERSION.SDK_INT < 11) {
            listView.setSelector(2130839068);
        }
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new a2o(this));
        this.getView().findViewById(2131755315).setVisibility(0);
        this.setListAdapter((ListAdapter)(this.d = new ask(this, null)));
        App.b(this.l);
        App.b(this.i);
        App.a(this.m);
        this.getView().findViewById(2131755568).setOnClickListener((View$OnClickListener)new a0l(this));
        this.b();
    }
    
    @Override
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            case 105: {
                if (n2 == -1) {
                    App.a(App.S.e(intent.getStringExtra(CallsFragment.z[3])), this.getActivity(), bq.SELECT_CONTACT);
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return HomeActivity.a(layoutInflater.inflate(2130903087, viewGroup, false), this);
    }
    
    @Override
    public void onDestroy() {
        Log.i(CallsFragment.z[2]);
        super.onDestroy();
        App.a(this.l);
        App.a(this.i);
        App.b(this.m);
        this.k.a();
        App.aq.a5().removeCallbacks(this.e);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        int onOptionsItemSelected = 1;
        switch (menuItem.getItemId()) {
            default: {
                onOptionsItemSelected = (super.onOptionsItemSelected(menuItem) ? 1 : 0);
                break;
            }
            case 2131755029: {
                if (Voip.d()) {
                    Log.w(CallsFragment.z[0]);
                    App.a((Context)this.getActivity(), 2131231069, 0);
                    if (!App.I) {
                        break;
                    }
                }
                final Intent intent = new Intent((Context)this.getActivity(), (Class)ContactPicker.class);
                intent.putExtra(CallsFragment.z[onOptionsItemSelected], (boolean)(onOptionsItemSelected != 0));
                this.startActivityForResult(intent, 105);
                return onOptionsItemSelected != 0;
            }
            case 2131755014: {
                if (this.isResumed()) {
                    new CallsFragment$ClearCallLogDialogFragment().show(this.getFragmentManager(), null);
                    return onOptionsItemSelected != 0;
                }
                break;
            }
        }
        return onOptionsItemSelected != 0;
    }
}
