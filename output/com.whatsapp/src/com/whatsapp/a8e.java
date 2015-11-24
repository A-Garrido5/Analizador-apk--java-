// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.format.DateUtils;
import android.os.CountDownTimer;

class a8e extends CountDownTimer
{
    final VerifySms a;
    
    a8e(final VerifySms a, final long n, final long n2) {
        this.a = a;
        super(n, n2);
    }
    
    public void onFinish() {
        VerifySms.u(this.a).setText((CharSequence)this.a.getString(2131231890));
        VerifySms.u(this.a).setEnabled(true);
    }
    
    public void onTick(final long n) {
        VerifySms.u(this.a).setText((CharSequence)this.a.getString(2131231891, new Object[] { DateUtils.getRelativeTimeSpanString(n + System.currentTimeMillis(), System.currentTimeMillis(), 0L) }));
    }
}
