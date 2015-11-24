// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.app.ProgressDialog;
import android.view.Menu;
import android.content.Context;
import android.widget.ListView;
import android.support.v7.app.ActionBar;
import android.os.Environment;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.SearchView$OnQueryTextListener;
import android.support.v7.widget.SearchView$OnCloseListener;
import android.widget.TextView;
import com.whatsapp.util.cq;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.content.res.Configuration;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import android.text.TextUtils;
import android.os.AsyncTask;
import android.view.Display;
import com.whatsapp.util.aw;
import java.io.File;
import android.view.View;
import android.net.Uri;
import android.view.View$OnClickListener;
import android.support.v7.widget.SearchView;
import com.whatsapp.util.b7;
import java.util.ArrayList;

public class WebImagePicker extends DialogToastListActivity
{
    private static final String[] E;
    private int A;
    private q7 B;
    private ArrayList C;
    private b7 D;
    private int q;
    private p1 r;
    private SearchView s;
    private View$OnClickListener t;
    private Uri u;
    private View v;
    private pn w;
    private final File x;
    private View y;
    private vc z;
    
    static {
        final String[] e = new String[13];
        String s = "\u0011URyU";
        int n = -1;
        String[] array = e;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ',';
                        break;
                    }
                    case 0: {
                        c2 = '`';
                        break;
                    }
                    case 1: {
                        c2 = ' ';
                        break;
                    }
                    case 2: {
                        c2 = '7';
                        break;
                    }
                    case 3: {
                        c2 = '\u000b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\tNG~X?MR\u007fD\u000fD";
                    n2 = 1;
                    array = e;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0013HX|\u007f\u000fFCBB\u0010UC^B\u0003HRhG\u0005D";
                    n2 = 2;
                    array = e;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\tNG~X?MR\u007fD\u000fD";
                    n2 = 3;
                    array = e;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = e;
                    s = "\u0017EUbA\u0001GRxI\u0001RTc\u0003\u0003AYhI\f\u007fSbM\fOP";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0017EUbA\u0001GRxI\u0001RTc\u0003\u0003AYhI\f\u007f^fM\u0007EhoC\u0017N[dM\u0004\u007fCj_\u000b";
                    n = 4;
                    array = e;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0017EUbA\u0001GRxI\u0001RTc\u0003\u0004ED\u007f^\u000fY";
                    n = 5;
                    array = e;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "4HBfN\u0013";
                    n = 6;
                    array = e;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\rOBeX\u0005D";
                    n = 7;
                    array = e;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000fUC{Y\u0014";
                    n = 8;
                    array = e;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\rOBeX\u0005DhyC";
                    n = 9;
                    array = e;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    s = "\u0011URyU";
                    n = 10;
                    n2 = 11;
                    array = e;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    array = e;
                    s = "\u0017EUbA\u0001GRxI\u0001RTc\u0003\u0003RRjX\u0005";
                    n = 11;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        E = e;
    }
    
    public WebImagePicker() {
        this.C = new ArrayList();
        this.B = new q7("");
        this.q = 4;
        this.x = new File(App.aq.getCacheDir(), WebImagePicker.E[7]);
    }
    
    static Uri a(final WebImagePicker webImagePicker) {
        return webImagePicker.u;
    }
    
    static pn a(final WebImagePicker webImagePicker, final pn w) {
        return webImagePicker.w = w;
    }
    
    static q7 a(final WebImagePicker webImagePicker, final q7 b) {
        return webImagePicker.B = b;
    }
    
    static b7 a(final WebImagePicker webImagePicker, final b7 d) {
        return webImagePicker.D = d;
    }
    
    private void a() {
        this.A = this.z.p + 2 * this.z.l + (int)this.z.j;
        final Display defaultDisplay = this.getWindowManager().getDefaultDisplay();
        this.q = defaultDisplay.getWidth() / this.A;
        this.A = defaultDisplay.getWidth() / this.q - (int)this.z.j;
        if (this.D != null) {
            this.D.b();
        }
        this.D = new aw(this.x).a(this.A).a(4194304L).b(this.getResources().getDrawable(2130838998)).a(this.getResources().getDrawable(2130838808)).a();
    }
    
    static void a(final WebImagePicker webImagePicker, final u0 u0) {
        webImagePicker.a(u0);
    }
    
    private void a(final u0 u0) {
        if (this.w != null) {
            this.w.cancel(true);
        }
        a8s.a(this.w = new pn(this, u0), new Void[0]);
    }
    
    static int b(final WebImagePicker webImagePicker) {
        return webImagePicker.q;
    }
    
    static File c(final WebImagePicker webImagePicker) {
        return webImagePicker.x;
    }
    
    static ArrayList d(final WebImagePicker webImagePicker) {
        return webImagePicker.C;
    }
    
    static View e(final WebImagePicker webImagePicker) {
        return webImagePicker.y;
    }
    
    private void e() {
        final String string = this.s.getQuery().toString();
        if (TextUtils.isEmpty((CharSequence)string)) {
            Toast.makeText(this.getApplicationContext(), (CharSequence)this.getString(2131231468), 0).show();
            if (!App.I) {
                return;
            }
        }
        ((InputMethodManager)App.aq.getSystemService(WebImagePicker.E[3])).hideSoftInputFromWindow(this.s.getWindowToken(), 0);
        p1.a(this.r, string);
    }
    
    static pn f(final WebImagePicker webImagePicker) {
        return webImagePicker.w;
    }
    
    private void f() {
        final InputMethodManager inputMethodManager = (InputMethodManager)this.getSystemService(WebImagePicker.E[1]);
        if (inputMethodManager == null) {
            return;
        }
        while (true) {
            try {
                final Method method = inputMethodManager.getClass().getMethod(WebImagePicker.E[2], Integer.TYPE, ResultReceiver.class);
                if (method == null) {
                    return;
                }
                try {
                    method.invoke(inputMethodManager, 0, null);
                }
                catch (NoSuchMethodException ex) {
                    throw ex;
                }
                catch (IllegalAccessException ex2) {}
                catch (InvocationTargetException ex3) {}
            }
            catch (NoSuchMethodException ex4) {
                final Method method = null;
                continue;
            }
            break;
        }
    }
    
    static b7 g(final WebImagePicker webImagePicker) {
        return webImagePicker.D;
    }
    
    static void h(final WebImagePicker webImagePicker) {
        webImagePicker.e();
    }
    
    static vc i(final WebImagePicker webImagePicker) {
        return webImagePicker.z;
    }
    
    static int j(final WebImagePicker webImagePicker) {
        return webImagePicker.A;
    }
    
    static void k(final WebImagePicker webImagePicker) {
        webImagePicker.f();
    }
    
    static View$OnClickListener l(final WebImagePicker webImagePicker) {
        return webImagePicker.t;
    }
    
    static View m(final WebImagePicker webImagePicker) {
        return webImagePicker.v;
    }
    
    static q7 n(final WebImagePicker webImagePicker) {
        return webImagePicker.B;
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a();
        this.r.notifyDataSetChanged();
    }
    
    public void onCreate(final Bundle bundle) {
        Log.i(WebImagePicker.E[12]);
        super.onCreate(bundle);
        final ActionBar supportActionBar = this.getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setDisplayShowTitleEnabled(false);
        supportActionBar.setDisplayShowCustomEnabled(true);
        this.z = vc.b();
        this.x.mkdirs();
        q7.a();
        this.setContentView(2130903238);
        final String stringExtra = this.getIntent().getStringExtra(WebImagePicker.E[11]);
        String b;
        if (stringExtra != null) {
            b = cq.b(stringExtra);
        }
        else {
            b = stringExtra;
        }
        final arc onSearchClickListener = new arc(this);
        this.s = new WebImagePicker$2(this, this.getSupportActionBar().getThemedContext());
        ((TextView)this.s.findViewById(2131755115)).setTextColor(this.getResources().getColor(2131624031));
        this.s.setQueryHint(this.getString(2131231617));
        this.s.setIconified(false);
        this.s.setOnCloseListener(new eq(this));
        this.s.setQuery(b, false);
        this.s.setOnSearchClickListener((View$OnClickListener)onSearchClickListener);
        this.s.setOnQueryTextListener(new a91(this));
        this.getSupportActionBar().setCustomView((View)this.s);
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            this.u = (Uri)extras.getParcelable(WebImagePicker.E[9]);
        }
        final ListView c = this.c();
        c.requestFocus();
        c.setClickable(false);
        c.setBackgroundDrawable((Drawable)null);
        c.setDividerHeight(0);
        final View inflate = this.getLayoutInflater().inflate(2130903239, (ViewGroup)null);
        c.addFooterView(inflate, (Object)null, false);
        c.setFooterDividersEnabled(false);
        this.v = inflate.findViewById(2131755832);
        this.y = inflate.findViewById(2131755833);
        this.a((ListAdapter)(this.r = new p1(this)));
        this.t = (View$OnClickListener)new ic(this);
        this.a();
        final String externalStorageState = Environment.getExternalStorageState();
        if (!externalStorageState.equals(WebImagePicker.E[8]) && !externalStorageState.equals(WebImagePicker.E[10])) {
            final Context applicationContext = this.getApplicationContext();
            int n;
            if (App.aw()) {
                n = 2131231383;
            }
            else {
                n = 2131231384;
            }
            Toast.makeText(applicationContext, n, 1).show();
            this.finish();
        }
        else if (!TextUtils.isEmpty((CharSequence)b)) {
            p1.a(this.r, b);
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        if (TextUtils.isEmpty((CharSequence)this.getIntent().getStringExtra(WebImagePicker.E[0]))) {
            this.s.requestFocus();
            this.s.post((Runnable)new ad9(this));
        }
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onDestroy() {
        super.onDestroy();
        Log.i(WebImagePicker.E[6]);
        this.C.clear();
        this.D.a(true);
        if (this.w != null) {
            this.w.cancel(true);
            Log.i(WebImagePicker.E[5]);
            if (pn.a(this.w) != null) {
                Log.i(WebImagePicker.E[4]);
                pn.a(this.w).dismiss();
                pn.a(this.w, null);
            }
            this.w = null;
        }
        p1.a(this.r);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
}
