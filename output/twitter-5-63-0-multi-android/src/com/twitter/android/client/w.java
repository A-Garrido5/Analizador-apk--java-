// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.telephony.TelephonyUtil;
import android.preference.PreferenceManager;
import com.twitter.library.client.az;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

class w implements SharedPreferences$OnSharedPreferenceChangeListener
{
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ v b;
    
    w(final v b, final SharedPreferences a) {
        this.b = b;
        this.a = a;
    }
    
    public void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
        if ("media_forward".equals(s)) {
            this.b.a(this.a.getBoolean(s, true), true);
        }
    }
}
