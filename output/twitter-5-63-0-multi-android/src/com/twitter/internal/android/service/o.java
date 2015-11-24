// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import android.os.Process;

class o extends q
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ n b;
    
    o(final n b, final int n, final Runnable a) {
        this.b = b;
        this.a = a;
        super(n);
    }
    
    @Override
    public void run() {
        final int myTid = Process.myTid();
        final int threadPriority = Process.getThreadPriority(myTid);
        Process.setThreadPriority(myTid, 19);
        try {
            this.a.run();
        }
        finally {
            Process.setThreadPriority(myTid, threadPriority);
            this.b.a();
        }
    }
}
