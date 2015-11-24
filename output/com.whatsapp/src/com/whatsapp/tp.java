// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.format.DateUtils;
import android.os.CountDownTimer;

class tp extends CountDownTimer
{
    final CircularProgressBar a;
    final SpamWarningActivity b;
    
    tp(final SpamWarningActivity b, final long n, final long n2, final CircularProgressBar a) {
        this.b = b;
        this.a = a;
        super(n, n2);
    }
    
    public void onFinish() {
        this.b.finish();
    }
    
    public void onTick(final long n) {
        this.a.setCenterText(DateUtils.formatElapsedTime((long)((int)n / 1000)));
        this.a.setProgress((int)n);
    }
}
