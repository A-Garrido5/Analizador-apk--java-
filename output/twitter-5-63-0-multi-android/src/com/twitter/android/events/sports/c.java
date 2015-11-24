// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports;

import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.text.TextUtils;
import android.widget.TextView;
import android.content.Intent;
import com.twitter.android.SearchActivity;
import com.twitter.library.client.az;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.HashMap;
import android.content.DialogInterface;
import com.twitter.android.events.TwitterEventActivity;
import android.content.Context;
import android.content.DialogInterface$OnCancelListener;

class c implements DialogInterface$OnCancelListener
{
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    final /* synthetic */ TwitterEventActivity c;
    final /* synthetic */ boolean d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ b g;
    
    c(final b g, final Context a, final int b, final TwitterEventActivity c, final boolean d, final String e, final String f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.g.a(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
