// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import com.twitter.android.util.al;

public class nh
{
    private ni a;
    private al b;
    
    nh(final ni a, final al b) {
        this.a = a;
        this.b = b;
    }
    
    public void a(final Bundle bundle) {
        boolean b = true;
        final boolean b2 = bundle != null && bundle.getBoolean("is_phone_signup", false) && b;
        if (bundle == null || !bundle.getBoolean("show_nux_copy")) {
            b = false;
        }
        if (b2) {
            this.a.a(2131297387);
            this.a.b(2131297386);
        }
        else if (this.b.a()) {
            final ni a = this.a;
            int n;
            if (b) {
                n = 2131298238;
            }
            else {
                n = 2131297384;
            }
            a.a(n);
        }
        else {
            final ni a2 = this.a;
            int n2;
            if (b) {
                n2 = 2131298237;
            }
            else {
                n2 = 2131297383;
            }
            a2.a(n2);
        }
        String s = null;
        if (bundle != null) {
            final boolean containsKey = bundle.containsKey("extra_flow_data");
            s = null;
            if (containsKey) {
                s = ((FlowData)bundle.getParcelable("extra_flow_data")).b();
            }
        }
        final ni a3 = this.a;
        if (s == null) {
            s = this.b.g();
        }
        a3.a(s);
        this.a.a(b2);
    }
}
