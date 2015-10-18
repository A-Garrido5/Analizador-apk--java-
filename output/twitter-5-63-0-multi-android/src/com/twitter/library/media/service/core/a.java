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
import com.twitter.media.NativeCrashHandler$CrashType;

class a implements com.twitter.media.a
{
    final /* synthetic */ MediaService a;
    
    a(final MediaService a) {
        this.a = a;
    }
    
    @Override
    public void a(final NativeCrashHandler$CrashType nativeCrashHandler$CrashType, final String s) {
        if (nativeCrashHandler$CrashType == NativeCrashHandler$CrashType.a) {
            MediaService.a = "Assertion failed: " + s;
            return;
        }
        MediaService.a = "Fatal error: " + s;
    }
}
