// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.view.MenuItem;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import java.util.Iterator;
import android.text.format.DateUtils;
import java.util.List;
import android.os.Parcelable;
import android.widget.ListAdapter;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.AbsListView$OnScrollListener;
import android.view.ViewGroup;
import android.os.Bundle;
import java.util.Collection;
import android.os.AsyncTask;
import android.graphics.Paint;
import com.whatsapp.util.cq;
import android.content.Context;
import android.widget.TextView;
import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.bi;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.ImageView;
import android.view.View;

public class CallLogActivity extends DialogToastActivity implements aws
{
    private static final String[] z;
    private View k;
    private ImageView l;
    private ArrayList m;
    private a_9 n;
    private sw o;
    private ge p;
    private ListView q;
    
    static {
        final String[] z2 = new String[12];
        String s = "e\u0003\u0004~6i\u0005Gq(c\u0003\u001cw";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Z';
                        break;
                    }
                    case 0: {
                        c2 = '\u0006';
                        break;
                    }
                    case 1: {
                        c2 = 'b';
                        break;
                    }
                    case 2: {
                        c2 = 'h';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "l\u000b\f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "e\u0003\u0004~)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "l\u000b\f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "e\u0003\u0004~6i\u0005Gv?u\u0016\u001a}#";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "l\u000b\f";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "l\u000b\f";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "l\u000b\f";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "l\u000b\f";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "e\u0003\u0004~6i\u0005Gg*b\u0003\u001cw";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "e\u0003\u0004~6i\u0005Gv?j\u0007\u001cw";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "e\u0003\u0004~6i\u0005G|?q=\u000b}4p\u0007\u001aa;r\u000b\u0007|";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static int a(final bi bi) {
        if (bi.a.b) {
            return 2131231438;
        }
        if (bi.D > 0) {
            return 2131231238;
        }
        return 2131230973;
    }
    
    static void a(final CallLogActivity callLogActivity) {
        callLogActivity.b();
    }
    
    public static int b(final bi bi) {
        if (bi.a.b) {
            return 2130837709;
        }
        if (bi.D > 0) {
            return 2130837707;
        }
        return 2130837708;
    }
    
    static a_9 b(final CallLogActivity callLogActivity) {
        return callLogActivity.n;
    }
    
    private void b() {
        final boolean i = App.I;
        final View child = this.q.getChildAt(0);
        if (child != null) {
            if (this.q.getWidth() > this.q.getHeight()) {
                int top = 0;
                Label_0064: {
                    if (this.q.getFirstVisiblePosition() == 0) {
                        top = child.getTop();
                        if (!i) {
                            break Label_0064;
                        }
                    }
                    top = 1 + -this.k.getHeight();
                }
                this.k.offsetTopAndBottom(top - this.k.getTop());
                if (!i) {
                    return;
                }
            }
            if (this.k.getTop() != 0) {
                this.k.offsetTopAndBottom(-this.k.getTop());
            }
        }
    }
    
    static ImageView c(final CallLogActivity callLogActivity) {
        return callLogActivity.l;
    }
    
    private void e() {
        Log.i(CallLogActivity.z[9]);
        this.n = z8.a(this.getIntent().getStringExtra(CallLogActivity.z[8]));
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361937);
        final Bitmap scaledBitmap = Bitmap.createScaledBitmap(this.n.x(), dimensionPixelSize, dimensionPixelSize, true);
        if (scaledBitmap != null) {
            this.l.setImageBitmap(scaledBitmap);
        }
        final TextView textView = (TextView)this.findViewById(2131755361);
        textView.setText(cq.b(this.n.a((Context)this), this.getBaseContext(), (Paint)textView.getPaint()));
        ((TextView)this.findViewById(2131755362)).setText((CharSequence)this.n.n());
        if (this.o != null) {
            this.o.cancel(true);
        }
        a8s.a(this.o = new sw(this), new Void[0]);
    }
    
    @Override
    public void a() {
        this.e();
    }
    
    @Override
    public void a(final String s) {
        if (s.equals(this.getIntent().getStringExtra(CallLogActivity.z[3]))) {
            ((TextView)this.findViewById(2131755362)).setText((CharSequence)this.n.n());
        }
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
        if (s.equals(this.getIntent().getStringExtra(CallLogActivity.z[5]))) {
            this.e();
        }
    }
    
    @Override
    public void c(final String s) {
        if (s.equals(this.getIntent().getStringExtra(CallLogActivity.z[7]))) {
            this.e();
        }
    }
    
    @Override
    public void d(final String s) {
        if (s.equals(this.getIntent().getStringExtra(CallLogActivity.z[6]))) {
            this.e();
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        Log.i(CallLogActivity.z[0]);
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903093);
        (this.q = (ListView)this.findViewById(16908298)).addHeaderView(alm.a(this.getLayoutInflater(), 2130903094, (ViewGroup)this.q, false), (Object)null, false);
        (this.k = this.findViewById(2131755280)).setClickable(true);
        this.q.setOnScrollListener((AbsListView$OnScrollListener)new sa(this));
        this.q.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new g3(this));
        (this.l = (ImageView)this.findViewById(2131755359)).setOnClickListener((View$OnClickListener)new a0e(this.getIntent().getStringExtra(CallLogActivity.z[1]), (Context)this));
        this.findViewById(2131755317).setOnClickListener((View$OnClickListener)new a0_(this));
        this.p = new ge(this, (Context)this);
        this.q.setAdapter((ListAdapter)this.p);
        final ArrayList parcelableArrayListExtra = this.getIntent().getParcelableArrayListExtra(CallLogActivity.z[2]);
        Label_0404: {
            if (parcelableArrayListExtra != null) {
                this.m = new ArrayList();
                final Iterator<Parcelable> iterator = parcelableArrayListExtra.iterator();
                while (iterator.hasNext()) {
                    final bi a = App.ak.a(((d6)iterator.next()).a);
                    if (a != null) {
                        this.m.add(a);
                    }
                    if (i) {
                        break;
                    }
                }
                this.p.a(this.m);
                if (!this.m.isEmpty()) {
                    final long j = App.i(this.m.get(0));
                    final TextView textView = (TextView)this.findViewById(2131755365);
                    if (DateUtils.isToday(j)) {
                        textView.setText(2131231855);
                        if (!i) {
                            break Label_0404;
                        }
                    }
                    if (DateUtils.isToday(86400000L + j)) {
                        textView.setText(2131231978);
                        if (!i) {
                            break Label_0404;
                        }
                    }
                    textView.setText((CharSequence)DateUtils.formatDateTime((Context)this, j, 16));
                }
                else {
                    this.finish();
                }
            }
        }
        this.e();
        App.b((aws)this);
    }
    
    public Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 0: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131230840, new Object[] { this.n.a((Context)this) })).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new ql(this)).setNegativeButton(2131230874, null).create();
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755031, 0, 2131231307).setIcon(2130838726).setAlphabeticShortcut('n'), 2);
        menu.add(0, 2131755014, 0, 2131230900).setIcon(2130838718);
        menu.add(0, 2131755040, 0, 2131231867);
        menu.add(0, 2131755013, 0, 2131230839);
        return true;
    }
    
    public void onDestroy() {
        Log.i(CallLogActivity.z[4]);
        super.onDestroy();
        if (this.o != null) {
            this.o.cancel(true);
        }
        App.a((aws)this);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        boolean b = true;
        switch (menuItem.getItemId()) {
            default: {
                b = false;
                break;
            }
            case 16908332: {
                this.finish();
                return b;
            }
            case 2131755014: {
                Log.i(CallLogActivity.z[10]);
                if (this.m != null) {
                    App.ak.a(this.m);
                    this.finish();
                    return b;
                }
                break;
            }
            case 2131755031: {
                Log.i(CallLogActivity.z[11]);
                this.startActivity(Conversation.a(this.n));
                this.finish();
                return b;
            }
            case 2131755040: {
                App.a(this, false, this.n.u);
                return b;
            }
            case 2131755013: {
                this.showDialog(0);
                return b;
            }
        }
        return b;
    }
    
    public boolean onPrepareOptionsMenu(final Menu menu) {
        final boolean p = App.p(this.n.u);
        final MenuItem item = menu.findItem(2131755040);
        if (item != null) {
            item.setVisible(p);
        }
        final MenuItem item2 = menu.findItem(2131755013);
        if (item2 != null) {
            item2.setVisible(!p);
        }
        return true;
    }
}
