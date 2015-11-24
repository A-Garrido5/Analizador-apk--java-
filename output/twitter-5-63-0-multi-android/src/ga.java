import android.os.Build;
import com.twitter.errorreporter.a;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.error.b;
import com.twitter.library.util.bq;
import com.twitter.library.scribe.ScribeService;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

class ga implements UncaughtExceptionHandler
{
    private final Context a;
    private final boolean b;
    private final UncaughtExceptionHandler c;
    
    public ga(final Context context, final UncaughtExceptionHandler c, final boolean b) {
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = c;
    }
    
    private static boolean a(Throwable cause) {
        while (cause != null) {
            if (cause instanceof OutOfMemoryError || cause.getClass().getSimpleName().equals("CursorWindowAllocationException")) {
                return true;
            }
            cause = cause.getCause();
        }
        return false;
    }
    
    @Override
    public void uncaughtException(final Thread thread, final Throwable t) {
        if (this.b) {
            ScribeService.a(this.a, 0L, t);
        }
        while (true) {
            Label_0064: {
                if (!a(t)) {
                    break Label_0064;
                }
                try {
                    bq.b();
                    ErrorReporter.b(new b(t));
                    if (this.c != null) {
                        this.c.uncaughtException(thread, t);
                    }
                    return;
                }
                catch (Throwable t2) {
                    ErrorReporter.b(t);
                    continue;
                }
            }
            ErrorReporter.b(new a().a("Build.Manufacturer", Build.MANUFACTURER).a("Build.Model", Build.MODEL).a("Build.Brand", Build.BRAND).a("Build.Device", Build.DEVICE).a("Build.ID", Build.ID).a("Build.Product", Build.PRODUCT).a(t));
            continue;
        }
    }
}
