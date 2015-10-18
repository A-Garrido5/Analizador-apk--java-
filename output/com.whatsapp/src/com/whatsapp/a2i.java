// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

public class a2i
{
    public static final Handler a;
    
    static {
        a = new Handler(Looper.getMainLooper(), (Handler$Callback)new hv());
    }
}
