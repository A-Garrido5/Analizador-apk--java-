import com.twitter.errorreporter.c;
import com.twitter.errorreporter.ErrorReporter;
import com.crashlytics.android.t;
import com.twitter.library.util.error.CrashlyticsErrorLogger;
import com.twitter.config.a;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class fy extends ts
{
    protected void a(final Context context, final Void void1) {
        final a n = a.n();
        boolean b;
        if (!n.a()) {
            b = true;
        }
        else {
            b = false;
        }
        if (b) {
            ErrorReporter.a(new CrashlyticsErrorLogger(context, new fz(context)));
        }
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        boolean b2 = false;
        Label_0061: {
            if (!n.b()) {
                b2 = false;
                if (!b) {
                    break Label_0061;
                }
            }
            b2 = true;
        }
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new ga(context, defaultUncaughtExceptionHandler, b2));
    }
}
