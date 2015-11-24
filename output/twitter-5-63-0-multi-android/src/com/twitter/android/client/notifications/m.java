// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.android.util.aj;
import com.twitter.library.client.az;
import android.content.Intent;
import android.text.SpannableString;
import com.twitter.library.platform.c;
import com.twitter.library.platform.d;

public class m extends aa
{
    protected int a;
    
    public m(final d d, final String s, final long n) {
        super(d, s, n);
        this.a = 2131297322;
    }
    
    static aa a(final d d, final String s, final long n, final StatusBarNotif statusBarNotif, final n n2) {
        final int b = fl.b();
        final int a = fl.a();
        if (b == 1) {
            if (statusBarNotif instanceof MentionNotif) {
                n2.b = a;
                n2.a = 2131297319;
                return n2;
            }
            return new e(d, s, n, 2131297322, null, new int[] { 2 }, a);
        }
        else {
            if (b == 2) {
                final e e = new e(d, s, n, 2131297322, null, null, a);
                e.a(2);
                return e;
            }
            if (b != 3) {
                return new m(d, s, n);
            }
            if (statusBarNotif instanceof MentionNotif) {
                n2.b = a;
                n2.a = 2131297319;
                return n2;
            }
            if (statusBarNotif instanceof FollowNotif || statusBarNotif instanceof FollowRequestNotif) {
                return new e(d, s, n, 2131297326, new int[] { 5, 8 }, null, a);
            }
            return new e(d, s, n, 2131297322, null, new int[] { 2, 5, 8 }, a);
        }
    }
    
    static boolean b(final int n) {
        return n == 2 || n == 3 || n == 4 || n == 5 || n == 8 || n == 9 || n == 11 || n == 10 || n == 12;
    }
    
    @Override
    protected SpannableString b(final c c) {
        final String d = c.d;
        String s = null;
        switch (c.a) {
            default: {
                s = c.c;
                break;
            }
            case 4: {
                s = this.f.getString(2131297314, new Object[] { c.c });
                break;
            }
            case 3: {
                s = this.f.getString(2131297330, new Object[] { c.c });
                break;
            }
            case 5: {
                s = this.f.getString(2131297316);
                break;
            }
        }
        return this.a(d, s, c.h);
    }
    
    @Override
    public String d() {
        final int length = this.b().length;
        if (length > 1) {
            return this.f.getString(this.a, new Object[] { length });
        }
        return this.f.getString(this.a, new Object[] { this.c.b });
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
        return aj.a(this.f, az.a(this.f).b(this.e).f(), false, false);
    }
    
    @Override
    public String h() {
        return "interactions";
    }
}
