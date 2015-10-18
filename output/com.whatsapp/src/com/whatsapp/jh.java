// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.protocol.b7;
import java.util.Comparator;

class jh implements Comparator
{
    mg a;
    final MessageDetailsActivity b;
    
    jh(final MessageDetailsActivity b) {
        this.b = b;
        this.a = new mg(this.b.getApplicationContext());
    }
    
    public int a(final dr dr, final dr dr2) {
        int n = 1;
        final int a = b7.a(dr2.a(), dr.a());
        if (a != 0) {
            n = a;
        }
        else if (dr.a != null) {
            if (dr2.a == null) {
                return -1;
            }
            final a_9 e = App.S.e(dr.a);
            final a_9 e2 = App.S.e(dr2.a);
            int n2;
            if (!TextUtils.isEmpty((CharSequence)e.t)) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            final boolean empty = TextUtils.isEmpty((CharSequence)e2.t);
            int n3 = 0;
            if (!empty) {
                n3 = n;
            }
            if (n2 == n3) {
                return this.a.a(e, e2);
            }
            if (n2 != 0) {
                return -1;
            }
        }
        return n;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((dr)o, (dr)o2);
    }
}
