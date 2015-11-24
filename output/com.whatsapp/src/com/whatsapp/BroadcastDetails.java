// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.view.Menu;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import java.util.ArrayList;
import android.app.Dialog;
import android.content.Intent;
import com.whatsapp.util.b;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import com.whatsapp.wallpaper.h;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.content.Context;
import android.widget.ListView;
import com.whatsapp.protocol.c6;
import com.whatsapp.util.Log;
import android.os.Bundle;
import com.whatsapp.fieldstats.bq;
import android.app.Activity;
import com.whatsapp.protocol.bi;

public class BroadcastDetails extends DialogToastActivity
{
    private static final String[] z;
    private wf k;
    private final aws l;
    private bi m;
    private String[] n;
    private final sj o;
    private a_9 p;
    private final a9q q;
    
    static {
        final String[] z2 = new String[6];
        String s = "eI";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'I';
                        break;
                    }
                    case 0: {
                        c2 = '\f';
                        break;
                    }
                    case 1: {
                        c2 = '-';
                        break;
                    }
                    case 2: {
                        c2 = ')';
                        break;
                    }
                    case 3: {
                        c2 = '[';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "n_F:-oLZ/";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "n_F:-oLZ/-iYH2%\u007f\u0002J),mYL";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "n_F:-oLZ/";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "n_F:-oLZ/-iYH2%\u007f\u0002M>:x_F\"";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "n_F:-oLZ/";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public BroadcastDetails() {
        this.q = new a9q();
        this.o = new se(this);
        this.l = new gb(this);
    }
    
    static a9q a(final BroadcastDetails broadcastDetails) {
        return broadcastDetails.q;
    }
    
    static a_9 a(final BroadcastDetails broadcastDetails, final a_9 p2) {
        return broadcastDetails.p = p2;
    }
    
    static boolean a(final BroadcastDetails broadcastDetails, final a_9 a_9, final int n) {
        return broadcastDetails.a(a_9, n);
    }
    
    private boolean a(final a_9 a_9, final int n) {
        switch (n) {
            case 0: {
                if (a_9.e != null) {
                    ContactInfo.a(a_9, this);
                    return true;
                }
                break;
            }
            case 1: {
                this.startActivity(Conversation.a(a_9));
                return true;
            }
            case 4: {
                App.a(a_9, this, bq.ANDROID_BROADCAST_DETAILS);
                return true;
            }
        }
        return true;
    }
    
    static bi b(final BroadcastDetails broadcastDetails) {
        return broadcastDetails.m;
    }
    
    static wf c(final BroadcastDetails broadcastDetails) {
        return broadcastDetails.k;
    }
    
    static String[] d(final BroadcastDetails broadcastDetails) {
        return broadcastDetails.n;
    }
    
    static a_9 e(final BroadcastDetails broadcastDetails) {
        return broadcastDetails.p;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903082);
        Log.i(BroadcastDetails.z[2]);
        App.ak.a(this.o);
        App.b(this.l);
        final Intent intent = this.getIntent();
        if (intent == null) {
            this.finish();
            return;
        }
        this.m = App.ak.a(new c6(BroadcastDetails.z[1], true, intent.getStringExtra(BroadcastDetails.z[0])));
        if (this.m == null || this.m.t == null) {
            this.finish();
            return;
        }
        this.n = this.m.t.split(",");
        final ListView listView = (ListView)this.findViewById(16908298);
        listView.setAdapter((ListAdapter)(this.k = new wf(this, (Context)this)));
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new p_(this));
        this.getSupportActionBar().setTitle(String.format(App.C.a(2131296263, this.n.length), this.n.length));
        ((TextView)this.findViewById(2131755294)).setText((CharSequence)this.getString(2131230848, new Object[] { this.n.length }));
        final ConversationRow a = Conversation.a((Context)this, this.m);
        a.n();
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131755293);
        viewGroup.addView((View)a, -2, -2);
        ((RelativeLayout$LayoutParams)a.getChildAt(1).getLayoutParams()).rightMargin = 0;
        ((RelativeLayout$LayoutParams)a.getChildAt(1).getLayoutParams()).leftMargin = 0;
        ((RelativeLayout$LayoutParams)a.getChildAt(1).getLayoutParams()).addRule(11, 0);
        final Drawable f = com.whatsapp.wallpaper.h.f((Context)this);
        if (f != null) {
            final View viewById = this.findViewById(2131755292);
            viewById.setBackgroundDrawable((Drawable)new a20(this, f, viewById));
        }
        final View viewById2 = this.findViewById(2131755292);
        viewGroup.measure(View$MeasureSpec.makeMeasureSpec(-1, 0), View$MeasureSpec.makeMeasureSpec(-2, 0));
        final int n = this.getWindowManager().getDefaultDisplay().getHeight() / 2;
        if (viewGroup.getMeasuredHeight() > n) {
            viewById2.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, n));
        }
        com.whatsapp.util.b.a(BroadcastDetails.z[3]);
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 3: {
                if (this.p != null) {
                    final ArrayList<String> list = new ArrayList<String>();
                    final ArrayList<Integer> list2 = new ArrayList<Integer>();
                    list.add(this.getString(2131231318, new Object[] { this.p.l() }));
                    list2.add(1);
                    list.add(this.getString(2131230860, new Object[] { this.p.l() }));
                    list2.add(4);
                    if (this.p.e != null) {
                        list.add(this.getString(2131231910, new Object[] { this.p.l() }));
                        list2.add(0);
                    }
                    final String[] array = new String[list.size()];
                    list.toArray(array);
                    final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
                    alertDialog$Builder.setItems(array, (DialogInterface$OnClickListener)new ald(this, list2));
                    final AlertDialog create = alertDialog$Builder.create();
                    create.setOnCancelListener((DialogInterface$OnCancelListener)new _5(this));
                    create.requestWindowFeature(1);
                    return create;
                }
                return super.onCreateDialog(n);
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onDestroy() {
        Log.i(BroadcastDetails.z[4]);
        super.onDestroy();
        this.q.a();
        App.ak.b(this.o);
        App.a(this.l);
        com.whatsapp.util.b.c(BroadcastDetails.z[5]);
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
