// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import com.twitter.errorreporter.ErrorReporter;
import java.util.Map;
import android.os.IBinder;
import android.content.ComponentName;
import java.util.Collection;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.os.Process;
import android.app.ActivityManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import android.content.Context;
import android.content.ServiceConnection;

class w implements c
{
    final /* synthetic */ v a;
    
    w(final v a) {
        this.a = a;
    }
    
    @Override
    public void a(final Object o, final a a) {
    }
    
    @Override
    public void a_(final a a) {
        synchronized (this.a.f) {
            this.a.c.remove(a.b);
            this.a.d.remove(a.b);
        }
    }
    
    @Override
    public void b(final a a) {
    }
}
