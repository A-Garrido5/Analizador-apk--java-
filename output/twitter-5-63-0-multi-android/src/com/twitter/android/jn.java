// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.library.api.ak;
import android.widget.EditText;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import java.lang.ref.WeakReference;
import com.twitter.android.util.an;

public class jn implements an
{
    private final WeakReference a;
    private final int b;
    private final boolean c;
    private Phonenumber$PhoneNumber d;
    
    public jn(final BaseSignUpActivity baseSignUpActivity, final int b, final boolean c, final Phonenumber$PhoneNumber d) {
        this.a = new WeakReference((T)baseSignUpActivity);
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private void a(final BaseSignUpActivity baseSignUpActivity, final EditText editText, final int n) {
        if (editText == baseSignUpActivity.c) {
            baseSignUpActivity.l = n;
        }
        else if (editText == baseSignUpActivity.f) {
            baseSignUpActivity.o = n;
        }
    }
    
    private void a(final BaseSignUpActivity baseSignUpActivity, final ak ak, final TwitterEditText twitterEditText) {
        if (ak == null || !ak.c()) {
            this.a(baseSignUpActivity, twitterEditText, 0);
            if (this.c || !twitterEditText.hasFocus()) {
                baseSignUpActivity.a(twitterEditText, false);
                baseSignUpActivity.a(twitterEditText, baseSignUpActivity.getString(2131297817));
            }
        }
        else if (ak.b()) {
            if (twitterEditText == baseSignUpActivity.c) {
                baseSignUpActivity.p = 2;
            }
            baseSignUpActivity.a(twitterEditText, true);
            this.a(baseSignUpActivity, twitterEditText, 1);
            baseSignUpActivity.a(twitterEditText, null);
            final String a = baseSignUpActivity.i.a(this.d);
            Phonenumber$PhoneNumber phonenumber$PhoneNumber;
            if (a != null && a.equals(ak.c)) {
                phonenumber$PhoneNumber = this.d;
            }
            else if (TextUtils.isEmpty((CharSequence)ak.c)) {
                phonenumber$PhoneNumber = this.d;
            }
            else {
                phonenumber$PhoneNumber = baseSignUpActivity.i.a(ak.c);
            }
            baseSignUpActivity.i.b(phonenumber$PhoneNumber);
        }
        else if (ak.a()) {
            baseSignUpActivity.a(twitterEditText, false);
            this.a(baseSignUpActivity, twitterEditText, 0);
            baseSignUpActivity.a(twitterEditText, baseSignUpActivity.getString(2131297821));
        }
        baseSignUpActivity.b();
    }
    
    @Override
    public void a(final ak ak) {
        final BaseSignUpActivity baseSignUpActivity = (BaseSignUpActivity)this.a.get();
        if (baseSignUpActivity != null) {
            if (this.b == 1) {
                this.a(baseSignUpActivity, ak, baseSignUpActivity.c);
            }
            else if (this.b == 2) {
                this.a(baseSignUpActivity, ak, baseSignUpActivity.f);
            }
        }
    }
}
