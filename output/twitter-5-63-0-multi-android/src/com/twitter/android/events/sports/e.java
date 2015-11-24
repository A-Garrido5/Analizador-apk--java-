// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports;

import android.content.DialogInterface$OnCancelListener;
import android.app.AlertDialog$Builder;
import android.text.TextUtils;
import android.widget.TextView;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.HashMap;
import android.widget.Toast;
import android.os.Parcelable;
import android.content.Intent$ShortcutIconResource;
import android.content.Intent;
import com.twitter.android.SearchActivity;
import android.content.DialogInterface;
import com.twitter.android.events.TwitterEventActivity;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;

class e implements DialogInterface$OnClickListener
{
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ TwitterEventActivity e;
    final /* synthetic */ boolean f;
    final /* synthetic */ String g;
    final /* synthetic */ b h;
    
    e(final b h, final Context a, final String b, final int c, final int d, final TwitterEventActivity e, final boolean f, final String g) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final Intent intent = new Intent(this.a, (Class)SearchActivity.class);
        intent.putExtra("query", this.b);
        intent.putExtra("search_src_ref", "ref_src_shortcut");
        final Intent$ShortcutIconResource fromContext = Intent$ShortcutIconResource.fromContext(this.a.getApplicationContext(), this.c);
        final Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent2.putExtra("android.intent.extra.shortcut.NAME", this.b);
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", (Parcelable)fromContext);
        intent2.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)intent);
        intent2.putExtra("duplicate", false);
        this.a.sendBroadcast(intent2);
        this.a.getSharedPreferences(this.b, 0).edit().putBoolean("show_create_shortcut", false).apply();
        Toast.makeText(this.a, (CharSequence)this.a.getString(2131296952), 0).show();
        this.h.a(this.a, this.d, this.e, this.f, this.g, this.b);
    }
}
