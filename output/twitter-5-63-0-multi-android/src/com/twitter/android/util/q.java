// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.content.res.Resources;
import android.text.format.DateUtils;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Locale;

public class q
{
    private static q a;
    private final Locale b;
    private final TimeZone c;
    private final SimpleDateFormat d;
    private final SimpleDateFormat e;
    private final SimpleDateFormat f;
    private final SimpleDateFormat g;
    
    private q() {
        this.b = Locale.getDefault();
        this.c = TimeZone.getDefault();
        (this.d = new SimpleDateFormat("MMM dd", this.b)).setTimeZone(this.c);
        (this.e = new SimpleDateFormat("EE MMM dd", this.b)).setTimeZone(this.c);
        (this.f = new SimpleDateFormat("h:mm a", this.b)).setTimeZone(this.c);
        this.g = new SimpleDateFormat("MMM dd, h:mm a", this.b);
        this.f.setTimeZone(this.c);
    }
    
    public static q a() {
        if (q.a == null) {
            q.a = new q();
        }
        return q.a;
    }
    
    public void a(final TextView textView, final long n) {
        if (n == 0L) {
            textView.setText(88);
        }
        if (DateUtils.isToday(n)) {
            textView.setText((CharSequence)this.f.format(n));
            return;
        }
        textView.setText((CharSequence)this.g.format(n));
    }
    
    public void a(final TextView textView, final long n, final Resources resources, final boolean b, final boolean b2) {
        if (DateUtils.isToday(n)) {
            int n2;
            if (b) {
                n2 = 2131297942;
            }
            else {
                n2 = 2131297941;
            }
            textView.setText((CharSequence)resources.getString(n2, new Object[] { this.f.format(n) }));
            return;
        }
        if (DateUtils.isToday(n - 86400000L)) {
            int n3;
            if (b) {
                n3 = 2131297945;
            }
            else {
                n3 = 2131297944;
            }
            textView.setText((CharSequence)resources.getString(n3, new Object[] { this.f.format(n) }));
            return;
        }
        if (DateUtils.isToday(n + 86400000L)) {
            int n4;
            if (b) {
                n4 = 2131298160;
            }
            else {
                n4 = 2131298159;
            }
            textView.setText((CharSequence)resources.getString(n4, new Object[] { this.f.format(n) }));
            return;
        }
        final Object[] array = new Object[2];
        String s;
        if (b2) {
            s = this.e.format(n);
        }
        else {
            s = this.d.format(n);
        }
        array[0] = s;
        array[1] = this.f.format(n);
        textView.setText((CharSequence)resources.getString(2131296780, array));
    }
}
