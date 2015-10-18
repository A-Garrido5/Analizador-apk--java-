// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.qrcode.QrCodeActivity;
import android.view.MenuItem;
import java.util.Iterator;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.os.CountDownTimer;
import java.util.HashMap;
import android.widget.ListView;
import android.view.View;

public class WebSessionsActivity extends DialogToastActivity
{
    private static final String[] z;
    private View k;
    private View l;
    private final Runnable m;
    private ListView n;
    private og o;
    private _4 p;
    private HashMap q;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0004\u0014\u0004;F\u0000\u0002\u000f'M\u0000^\u0002-P\u0007\u0003\t1";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = 's';
                        break;
                    }
                    case 1: {
                        c2 = 'q';
                        break;
                    }
                    case 2: {
                        c2 = 'f';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0004\u0014\u0004fT\u001b\u0010\u0012;B\u0003\u0001H+L\u001e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0004\u0014\u0004;F\u0000\u0002\u000f'M\u0000^\u0005:F\u0012\u0005\u0003";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public WebSessionsActivity() {
        this.o = new atp(this);
        this.m = new _v(this);
    }
    
    static View a(final WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.l;
    }
    
    static void a(final WebSessionsActivity webSessionsActivity, final String s) {
        webSessionsActivity.a(s);
    }
    
    static void a(final WebSessionsActivity webSessionsActivity, final String s, final long n) {
        webSessionsActivity.a(s, n);
    }
    
    private void a(final String s) {
        final CountDownTimer countDownTimer = this.q.get(s);
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.q.remove(s);
        }
    }
    
    private void a(final String s, final long n) {
        if (this.q.get(s) == null) {
            this.q.put(s, new ari(this, n - System.currentTimeMillis(), 60000L, s).start());
        }
    }
    
    static HashMap b(final WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.q;
    }
    
    static _4 c(final WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.p;
    }
    
    static View d(final WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.k;
    }
    
    static Runnable e(final WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.m;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        Log.i(WebSessionsActivity.z[2]);
        super.onCreate(bundle);
        this.q = new HashMap();
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903241);
        this.n = (ListView)this.findViewById(16908298);
        final View a = alm.a(this.getLayoutInflater(), 2130903243, null, false);
        this.k = a.findViewById(2131755280);
        vc.a((TextView)a.findViewById(2131755835));
        this.n.addHeaderView(a, (Object)null, false);
        final View a2 = alm.a(this.getLayoutInflater(), 2130903242, null, false);
        this.l = a2.findViewById(2131755421);
        a2.findViewById(2131755834).setOnClickListener((View$OnClickListener)new a0n(this));
        ((TextView)a2.findViewById(2131755731)).setText((CharSequence)this.getString(2131231503, new Object[] { WebSessionsActivity.z[1] }));
        this.n.addFooterView(a2, (Object)null, false);
        (this.p = new _4(this, null)).a(l7.z());
        final ListView n = this.n;
        int visibility;
        if (this.p.getCount() > 0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        n.setVisibility(visibility);
        this.n.setAdapter((ListAdapter)this.p);
        this.n.setOnItemClickListener((AdapterView$OnItemClickListener)new _u(this));
        App.aq.a5().postDelayed(this.m, 30000L);
        l7.b(this.o);
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755034, 0, 2131231311).setIcon(2130838707), 2);
        return true;
    }
    
    public void onDestroy() {
        final boolean i = App.I;
        Log.i(WebSessionsActivity.z[0]);
        super.onDestroy();
        l7.a(this.o);
        App.aq.a5().removeCallbacks(this.m);
        final Iterator<CountDownTimer> iterator = this.q.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().cancel();
            if (i) {
                break;
            }
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        boolean onOptionsItemSelected = true;
        switch (menuItem.getItemId()) {
            default: {
                onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                break;
            }
            case 16908332: {
                this.finish();
                return onOptionsItemSelected;
            }
            case 2131755034: {
                if (App.O()) {
                    this.startActivity(new Intent((Context)this, (Class)QrCodeActivity.class));
                    if (!App.I) {
                        break;
                    }
                }
                App.a(this.getBaseContext(), 2131231385, 0);
                return onOptionsItemSelected;
            }
        }
        return onOptionsItemSelected;
    }
}
