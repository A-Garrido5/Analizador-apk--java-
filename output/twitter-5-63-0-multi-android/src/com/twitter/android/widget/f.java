// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.AlertDialog$Builder;
import android.content.Intent;
import android.net.Uri;
import com.twitter.android.util.AppRatingPromptHelper;
import com.twitter.android.client.c;
import com.twitter.android.util.AppRatingPromptHelper$AppRatingEvent;
import android.widget.LinearLayout;
import android.view.View;
import android.app.AlertDialog;
import android.widget.TextView;
import android.widget.Button;
import android.content.Context;
import android.view.View$OnClickListener;

public class f implements View$OnClickListener
{
    Context a;
    Button b;
    Button c;
    Button d;
    Button e;
    TextView f;
    TextView g;
    i h;
    private long i;
    private AlertDialog j;
    private final j k;
    
    public f(final Context a, final long i) {
        this.k = new g(this);
        this.a = a;
        this.i = i;
    }
    
    public void a() {
        if (this.j != null && this.j.isShowing()) {
            this.j.dismiss();
        }
        this.j = null;
    }
    
    protected void a(final View view) {
        this.f = (TextView)view.findViewById(2131886262);
        this.g = (TextView)view.findViewById(2131886263);
        this.b = (Button)view.findViewById(2131886264);
        this.c = (Button)view.findViewById(2131886265);
        this.e = (Button)view.findViewById(2131886266);
        this.d = (Button)view.findViewById(2131886267);
        this.h = new i(this.a, (LinearLayout)view.findViewById(2131886256), this.k);
        this.c.setOnClickListener((View$OnClickListener)this);
        this.b.setOnClickListener((View$OnClickListener)this);
        this.e.setOnClickListener((View$OnClickListener)this);
        this.d.setOnClickListener((View$OnClickListener)this);
    }
    
    protected void a(final AppRatingPromptHelper$AppRatingEvent appRatingPromptHelper$AppRatingEvent) {
        AppRatingPromptHelper.a(appRatingPromptHelper$AppRatingEvent, com.twitter.android.client.c.a(this.a), this.i);
    }
    
    protected void b() {
        this.a(AppRatingPromptHelper$AppRatingEvent.b);
        AppRatingPromptHelper.a(this.a);
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.twitter.android")));
    }
    
    protected void c() {
        this.a(AppRatingPromptHelper$AppRatingEvent.c);
        AppRatingPromptHelper.a(this.a);
    }
    
    protected void d() {
        this.a(AppRatingPromptHelper$AppRatingEvent.d);
        AppRatingPromptHelper.b(this.a);
    }
    
    protected AlertDialog$Builder e() {
        return new AlertDialog$Builder(this.a);
    }
    
    public void f() {
        this.a(AppRatingPromptHelper$AppRatingEvent.a);
        final View inflate = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(this.g(), (ViewGroup)null);
        this.a(inflate);
        (this.j = this.e().setView(inflate).create()).show();
    }
    
    protected int g() {
        return 2130968596;
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            case 2131886266: {
                this.b();
                break;
            }
            case 2131886265: {
                this.d();
                break;
            }
            case 2131886264: {
                this.c();
                break;
            }
            case 2131886267: {
                this.a(AppRatingPromptHelper$AppRatingEvent.e);
                AppRatingPromptHelper.a(this.a);
                final int a = this.h.a();
                final Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:" + this.a.getString(2131296329)));
                intent.putExtra("android.intent.extra.SUBJECT", String.format(this.a.getString(2131296331), a));
                intent.putExtra("android.intent.extra.TEXT", String.format(this.a.getString(2131296330), a));
                this.a.startActivity(intent);
                break;
            }
        }
        this.a();
    }
}
