// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.core;

import android.os.Handler;
import android.os.IBinder;
import android.content.Intent;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.twitter.media.NativeCrashHandler;
import java.io.File;
import android.content.Context;
import com.twitter.library.util.af;
import android.os.Messenger;
import android.app.Service;

public class MediaService extends Service
{
    private static String a;
    private Messenger b;
    
    private void b() {
        final SharedPreferences sharedPreferences = this.getSharedPreferences("media_service_prefs", 0);
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        if (sharedPreferences.getBoolean("native_crash_handler_crashed", false)) {
            MediaService.a = "Native crash handler crashed while being installed.";
            edit.putBoolean("native_crash_handler_crashed", false);
            edit.apply();
        }
        if (sharedPreferences.getBoolean("native_crash_handler_disabled", false)) {
            return;
        }
        edit.putBoolean("native_crash_handler_disabled", true);
        edit.putBoolean("native_crash_handler_crashed", true);
        edit.apply();
        NativeCrashHandler.a(new File(af.b((Context)this), "native_service_crash.log"), true, new a(this));
        edit.putBoolean("native_crash_handler_disabled", false);
        edit.putBoolean("native_crash_handler_crashed", false);
        edit.apply();
    }
    
    public IBinder onBind(final Intent intent) {
        return this.b.getBinder();
    }
    
    public void onCreate() {
        this.b = new Messenger((Handler)new b(this.getApplicationContext()));
        this.b();
    }
}
