// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import com.twitter.util.c;
import android.content.Context;
import com.twitter.android.client.TwitterPreferenceActivity;

public class AboutActivity extends TwitterPreferenceActivity
{
    public static String a(final Context context) {
        return context.getString(2131296286, new Object[] { context.getString(2131298101, new Object[] { c.c(context) }) });
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131165184);
        this.setTitle((CharSequence)a((Context)this));
        this.findPreference((CharSequence)"support_link").setIntent(new Intent((Context)this, (Class)WebViewActivity.class).setData(Uri.parse(this.getString(2131298171))));
        this.findPreference((CharSequence)"legal").setIntent(new Intent((Context)this, (Class)WebViewActivity.class).setData(Uri.parse("file:///android_asset/legal.html")).putExtra("set_disable_javascript", true));
        this.findPreference((CharSequence)"tos").setIntent(new Intent((Context)this, (Class)WebViewActivity.class).setData(Uri.parse(this.getString(2131298276))));
        this.findPreference((CharSequence)"pp").setIntent(new Intent((Context)this, (Class)WebViewActivity.class).setData(Uri.parse(this.getString(2131298239))));
        this.findPreference((CharSequence)"cu").setIntent(new Intent((Context)this, (Class)WebViewActivity.class).setData(Uri.parse(this.getString(2131298187))));
    }
    
    public boolean onSearchRequested() {
        return false;
    }
}
