// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.util.concurrent.TimeoutException;
import android.support.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;

class t implements as, Future
{
    private static final String z;
    private boolean a;
    private final CountDownLatch b;
    private Object c;
    
    static {
        final char[] charArray = "aC\r/\"`T\u0018f2dO\r#0".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'T';
                    break;
                }
                case 0: {
                    c2 = '\u0005';
                    break;
                }
                case 1: {
                    c2 = '&';
                    break;
                }
                case 2: {
                    c2 = 'a';
                    break;
                }
                case 3: {
                    c2 = 'F';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public t() {
        this.b = new CountDownLatch(1);
    }
    
    private Object a() {
        if (!this.a) {
            throw new ExecutionException(new Exception(t.z));
        }
        return this.c;
    }
    
    @Override
    public void a() {
        this.c = null;
        this.a = false;
        this.b.countDown();
    }
    
    @Override
    public void b() {
        this.c = null;
        this.a = true;
        this.b.countDown();
    }
    
    @Override
    public boolean cancel(final boolean b) {
        return false;
    }
    
    @Override
    public Object get() {
        this.b.await();
        return this.a();
    }
    
    @Override
    public Object get(final long n, @NonNull final TimeUnit timeUnit) {
        if (!this.b.await(n, timeUnit)) {
            throw new TimeoutException();
        }
        return this.a();
    }
    
    @Override
    public boolean isCancelled() {
        return false;
    }
    
    @Override
    public boolean isDone() {
        return this.b.getCount() == 0L;
    }
}
