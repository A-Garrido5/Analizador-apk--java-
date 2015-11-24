// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.text.TextUtils;
import com.twitter.android.util.ap;
import android.content.Context;
import com.twitter.android.util.al;

public class er
{
    private String a;
    private al b;
    private Context c;
    
    private er(final String a, final Context c) {
        this.a = a;
        this.c = c;
        this.b = ap.a(this.c);
    }
    
    public static er a(final String s, final Context context) {
        return new er(s, context);
    }
    
    public void a() {
        this.a(this.b.g());
    }
    
    public void a(final String s) {
        this.a(s, true);
    }
    
    public void a(final String s, final boolean b) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        this.c.startService(new Intent(this.c, (Class)DeviceRegistrationService.class).putExtra("phone_number", s).putExtra("disable_sms_notifications", b).putExtra("scribe_page_term", this.a));
    }
}
