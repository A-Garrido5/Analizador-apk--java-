// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports;

import android.content.DialogInterface$OnCancelListener;
import android.app.AlertDialog$Builder;
import android.text.TextUtils;
import android.widget.TextView;
import android.content.Intent;
import com.twitter.android.SearchActivity;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.HashMap;
import android.content.DialogInterface;
import com.twitter.android.events.TwitterEventActivity;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;

class d implements DialogInterface$OnClickListener
{
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ TwitterEventActivity d;
    final /* synthetic */ boolean e;
    final /* synthetic */ String f;
    final /* synthetic */ b g;
    
    d(final b g, final Context a, final String b, final int c, final TwitterEventActivity d, final boolean e, final String f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.getSharedPreferences(this.b, 0).edit().putBoolean("show_create_shortcut", false).apply();
        this.g.a(this.a, this.c, this.d, this.e, this.f, this.b);
    }
}
