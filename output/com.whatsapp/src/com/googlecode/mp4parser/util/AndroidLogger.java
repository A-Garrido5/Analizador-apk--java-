// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

import android.util.Log;

public class AndroidLogger extends Logger
{
    private static final String TAG = "isoparser";
    String name;
    
    public AndroidLogger(final String name) {
        this.name = name;
    }
    
    @Override
    public void logDebug(final String s) {
        Log.d("isoparser", String.valueOf(this.name) + ":" + s);
    }
    
    @Override
    public void logError(final String s) {
        Log.e("isoparser", String.valueOf(this.name) + ":" + s);
    }
    
    @Override
    public void logWarn(final String s) {
        Log.w("isoparser", String.valueOf(this.name) + ":" + s);
    }
}
