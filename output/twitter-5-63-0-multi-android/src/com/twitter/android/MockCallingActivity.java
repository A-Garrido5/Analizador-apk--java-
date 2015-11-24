// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;

public class MockCallingActivity extends BaseActivity
{
    private CountDownLatch a;
    private int b;
    private int c;
    private Intent d;
    
    protected void onActivityResult(final int b, final int c, final Intent d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a.countDown();
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        if (this.a != null && this.a.getCount() > 0L) {
            throw new IllegalStateException("Activity already started.");
        }
        this.a = new CountDownLatch(1);
        super.startActivityForResult(intent, n);
    }
}
