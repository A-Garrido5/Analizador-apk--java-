// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.network;

import android.text.TextUtils;
import com.twitter.library.client.az;
import android.os.Bundle;
import android.content.Context;
import com.twitter.library.client.Session;

public class c
{
    private Session a;
    
    public c(final Context context, final Bundle bundle) {
        this.a = az.a(context).b();
        if (bundle != null) {
            final String string = bundle.getString("commerce_session_id");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.a = az.a(context).b(string);
            }
        }
    }
    
    public static void a(final Bundle bundle, final String s) {
        bundle.putString("commerce_session_id", s);
    }
    
    public Session a() {
        return this.a;
    }
}
