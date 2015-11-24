// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.support.v4.app.NotificationCompat$InboxStyle;
import android.content.Intent;
import android.text.TextUtils;
import com.twitter.library.platform.c;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.content.Context;
import com.twitter.library.platform.d;

public abstract class aa
{
    protected final d c;
    protected final String d;
    protected final long e;
    protected Context f;
    protected int g;
    
    public aa(final d c, final String d, final long e) {
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    protected SpannableString a(final String s, final String s2, final byte[] array) {
        final SpannableString spannableString = new SpannableString((CharSequence)(s + '\u2007' + s2));
        this.a(spannableString, s);
        return spannableString;
    }
    
    void a(final Context context) {
        this.f = context.getApplicationContext();
        this.g = context.getResources().getColor(17170437);
    }
    
    protected void a(final SpannableString spannableString, final String s) {
        spannableString.setSpan((Object)new ForegroundColorSpan(this.g), 0, s.length(), 33);
    }
    
    public boolean a() {
        return this.c.t.length > 1 || this.c.b > 1;
    }
    
    protected SpannableString b(final c c) {
        String s;
        if (TextUtils.isEmpty((CharSequence)c.d)) {
            s = '@' + c.e;
        }
        else {
            s = c.d;
        }
        return this.a(s, c.c, c.h);
    }
    
    protected c[] b() {
        return this.c.t;
    }
    
    public String c() {
        return this.e();
    }
    
    public abstract String d();
    
    public abstract String e();
    
    public abstract int f();
    
    public abstract Intent g();
    
    public abstract String h();
    
    public int i() {
        return this.c.q;
    }
    
    public int[] j() {
        final c[] b = this.b();
        final int length = b.length;
        final int[] array = new int[length];
        for (int i = 0; i < length; ++i) {
            array[i] = b[i].b;
        }
        return array;
    }
    
    public NotificationCompat$InboxStyle k() {
        final NotificationCompat$InboxStyle notificationCompat$InboxStyle = new NotificationCompat$InboxStyle();
        final c[] b = this.b();
        for (int length = b.length, i = 0; i < length; ++i) {
            final SpannableString b2 = this.b(b[i]);
            if (b2 != null) {
                notificationCompat$InboxStyle.addLine((CharSequence)b2);
            }
        }
        notificationCompat$InboxStyle.setSummaryText(this.c()).setBigContentTitle(this.d());
        return notificationCompat$InboxStyle;
    }
    
    public int l() {
        return this.b().length;
    }
    
    public int m() {
        return 67108864;
    }
    
    public String n() {
        return this.h();
    }
}
