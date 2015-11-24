// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.metrics;

import com.twitter.android.MainActivity;
import android.net.Uri;
import android.content.Intent;

public class LaunchTracker
{
    private static LaunchTracker a;
    private LaunchTracker$LaunchType b;
    private boolean c;
    private boolean d;
    private Boolean e;
    
    private LaunchTracker() {
        this.b = LaunchTracker$LaunchType.a;
    }
    
    public static LaunchTracker a() {
        synchronized (LaunchTracker.class) {
            if (LaunchTracker.a == null) {
                LaunchTracker.a = new LaunchTracker();
            }
            return LaunchTracker.a;
        }
    }
    
    String a(final boolean b) {
        if (this.b == LaunchTracker$LaunchType.b) {
            if (b) {
                return "_firstui:full";
            }
            return "_cold";
        }
        else {
            if (this.b != LaunchTracker$LaunchType.c) {
                return "";
            }
            if (b) {
                return "_resume:full";
            }
            return "_warm";
        }
    }
    
    public void a(final Intent intent) {
        LaunchTracker$LaunchType b;
        if (this.b == LaunchTracker$LaunchType.a) {
            b = LaunchTracker$LaunchType.b;
        }
        else {
            b = LaunchTracker$LaunchType.c;
        }
        this.b = b;
        this.c = intent.getBooleanExtra("from_launcher", false);
        this.d = intent.getBooleanExtra("test_start", false);
    }
    
    public void a(final Uri uri) {
        if (this.e != null && uri != null) {
            return;
        }
        this.e = uri.equals((Object)MainActivity.c);
    }
    
    boolean b() {
        return this.b != LaunchTracker$LaunchType.a && (this.c || this.d) && this.e != null && this.e;
    }
    
    void c() {
        this.c = false;
        this.e = null;
    }
}
