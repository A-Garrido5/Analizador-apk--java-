// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Build$VERSION;
import com.twitter.library.network.t;
import com.twitter.library.client.az;
import com.twitter.library.media.manager.k;
import com.twitter.android.DMActivity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.content.Intent;
import android.text.TextUtils;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import com.twitter.library.api.conversations.DMTweet;
import com.twitter.library.api.conversations.ak;
import com.twitter.util.f;
import android.text.SpannableString;
import com.twitter.library.platform.c;
import com.twitter.library.platform.d;
import java.util.HashSet;

class b extends aa
{
    final /* synthetic */ DMNotif a;
    private final HashSet b;
    
    public b(final DMNotif a, final d d, final String s, final long n) {
        this.a = a;
        super(d, s, n);
        this.b = new HashSet();
        final c[] t = d.t;
        for (int length = t.length, i = 0; i < length; ++i) {
            this.b.add(t[i].g);
        }
    }
    
    public SpannableString a(String a, String s, final byte[] array) {
        final Boolean value = this.a.n();
        final Boolean b = (Boolean)com.twitter.util.f.a(array);
        if (b != null && b) {
            a = ak.a(this.f.getResources(), this.c.g, a, "", false, value, true, 0, null, false);
            s = this.a.a(s, a, value);
        }
        else if (value) {
            s = this.f.getString(2131296884, new Object[] { a, s });
        }
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        if (value) {
            this.a(spannableString, a);
        }
        return spannableString;
    }
    
    @Override
    public boolean a() {
        return this.c.t.length > 1 && this.b.contains(this.c.i);
    }
    
    @Override
    protected c[] b() {
        final List<c> list = Arrays.asList(this.c.t);
        Collections.reverse(list);
        return list.toArray(new c[list.size()]);
    }
    
    @Override
    public String c() {
        String string;
        if (!TextUtils.isEmpty((CharSequence)this.c.v.a.c)) {
            string = this.c.v.a.c + '\u2007';
        }
        else {
            string = "";
        }
        return string + '@' + this.d;
    }
    
    @Override
    public String d() {
        return this.a.c();
    }
    
    @Override
    public String e() {
        return this.a.d();
    }
    
    @Override
    public int f() {
        return 2130839295;
    }
    
    @Override
    public Intent g() {
        return DMNotif.b(this.f, this.c.i);
    }
    
    @Override
    public String h() {
        return "message";
    }
}
