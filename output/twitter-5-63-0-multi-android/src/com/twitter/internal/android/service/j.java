// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

class j implements Runnable
{
    private final Exception a;
    
    public j(final Exception a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        throw new AsyncExecutionException(this.a);
    }
}
