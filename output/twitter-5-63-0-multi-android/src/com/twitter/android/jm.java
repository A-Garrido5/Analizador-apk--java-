// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.ak;
import com.twitter.android.util.an;
import android.text.TextUtils;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import com.twitter.android.util.al;
import java.lang.ref.WeakReference;
import com.twitter.library.util.e;

class jm extends e
{
    private final WeakReference a;
    private final al b;
    private final int c;
    private final boolean d;
    
    jm(final BaseSignUpActivity baseSignUpActivity, final int c, final boolean d) {
        this.a = new WeakReference((T)baseSignUpActivity);
        this.b = baseSignUpActivity.i;
        this.c = c;
        this.d = d;
    }
    
    protected Phonenumber$PhoneNumber a(final String... array) {
        if (array.length == 1) {
            return this.b.a(array[0]);
        }
        return null;
    }
    
    protected void a(final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        final BaseSignUpActivity baseSignUpActivity = (BaseSignUpActivity)this.a.get();
        if (baseSignUpActivity == null) {
            return;
        }
        final String a = this.b.a(phonenumber$PhoneNumber);
        int n;
        if (!TextUtils.isEmpty((CharSequence)a)) {
            n = 1;
        }
        else {
            n = 0;
        }
        final jn jn = new jn(baseSignUpActivity, this.c, this.d, phonenumber$PhoneNumber);
        if (n != 0) {
            baseSignUpActivity.i.a(a, jn);
            return;
        }
        jn.a(null);
    }
}
