// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.android.ProfileActivity;
import java.util.HashMap;
import android.content.Intent;

class d extends aa
{
    final /* synthetic */ DeviceTweetNotif a;
    
    public d(final DeviceTweetNotif a, final com.twitter.library.platform.d d, final String s, final long n) {
        this.a = a;
        super(d, s, n);
    }
    
    @Override
    public boolean a() {
        return this.c.t.length > 1;
    }
    
    @Override
    public String d() {
        return this.f.getString(2131297329, new Object[] { this.b().length });
    }
    
    @Override
    public String e() {
        return "@" + this.d;
    }
    
    @Override
    public int f() {
        return 2130839309;
    }
    
    @Override
    public Intent g() {
        final long f = this.c.t[0].f;
        final HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        int intValue = 1;
        long longValue = f;
        for (int i = 1; i < this.c.t.length; ++i) {
            final Long value = this.c.t[i].f;
            final Integer n = hashMap.get(value);
            int n2;
            if (n != null) {
                n2 = 1 + n;
            }
            else {
                n2 = 1;
            }
            final Integer value2 = n2;
            hashMap.put(value, value2);
            if (value2 > intValue) {
                longValue = value;
                intValue = value2;
            }
        }
        return new Intent(this.f, (Class)ProfileActivity.class).putExtra("user_id", longValue).setAction("com.twitter.android.home.tw." + this.d);
    }
    
    @Override
    public String h() {
        return "tweet";
    }
}
