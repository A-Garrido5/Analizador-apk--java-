// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.library.client.Session;
import android.content.SharedPreferences;
import android.util.Log;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import com.twitter.library.media.service.tasks.PixelFormatProbeMediaTask;
import android.content.Context;

final class ar extends Thread
{
    final /* synthetic */ Context a;
    
    ar(final Context a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!aq.c(this.a)) {
            final PixelFormatProbeMediaTask pixelFormatProbeMediaTask = new PixelFormatProbeMediaTask();
            final boolean d = pixelFormatProbeMediaTask.d(this.a);
            final SharedPreferences sharedPreferences = this.a.getSharedPreferences("VideoUtils", 0);
            final int n = 1 + sharedPreferences.getInt("pt", 0);
            boolean b;
            if (n == 8) {
                b = true;
            }
            else {
                b = false;
            }
            sharedPreferences.edit().putInt("pt", n).putBoolean("ps", pixelFormatProbeMediaTask.c()).putInt("ppf", pixelFormatProbeMediaTask.d()).putBoolean("pd2", b || d).apply();
            if (d && !pixelFormatProbeMediaTask.c()) {
                final Session b2 = az.a(this.a).b();
                long g;
                if (b2 != null) {
                    g = b2.g();
                }
                else {
                    g = 0L;
                }
                ScribeService.a(this.a, ((TwitterScribeLog)new TwitterScribeLog(g).b("", "composition", "gallery", "decoder_pixel_format", "unsupported")).a((long)pixelFormatProbeMediaTask.d()));
                ErrorReporter.a(pixelFormatProbeMediaTask.e());
                Log.i("VideoUtils", "Pixel format " + pixelFormatProbeMediaTask.d() + " tested and was found NOT to be supported");
                return;
            }
            if (!d && b) {
                final Exception e = pixelFormatProbeMediaTask.e();
                final String string = "JB video transcoder probe failed after " + n + " tries. Will not retry!";
                ErrorReporter.a(new Exception(string, e));
                Log.i("VideoUtils", string);
            }
        }
    }
}
