// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.util.Pair;
import android.util.Log;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

public class AbstractPendingResult$CallbackHandler extends Handler
{
    public AbstractPendingResult$CallbackHandler() {
        this(Looper.getMainLooper());
    }
    
    public AbstractPendingResult$CallbackHandler(final Looper looper) {
        super(looper);
    }
    
    protected void deliverResultCallback(final ResultCallback resultCallback, final Result result) {
        try {
            resultCallback.onResult(result);
        }
        catch (RuntimeException ex) {
            AbstractPendingResult.zzb(result);
            throw ex;
        }
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
            }
            case 1: {
                final Pair pair = (Pair)message.obj;
                this.deliverResultCallback((ResultCallback)pair.first, (Result)pair.second);
            }
            case 2: {
                ((AbstractPendingResult)message.obj).forceFailureUnlessReady(Status.zzXS);
            }
        }
    }
    
    public void removeTimeoutMessages() {
        this.removeMessages(2);
    }
    
    public void sendResultCallback(final ResultCallback resultCallback, final Result result) {
        this.sendMessage(this.obtainMessage(1, (Object)new Pair((Object)resultCallback, (Object)result)));
    }
}
