import android.annotation.TargetApi;
import android.os.Trace;

// 
// Decompiled by Procyon v0.5.30
// 

public class ah
{
    public static void a() {
        if (ai.a >= 18) {
            b();
        }
    }
    
    public static void a(final String s) {
        if (ai.a >= 18) {
            b(s);
        }
    }
    
    @TargetApi(18)
    private static void b() {
        Trace.endSection();
    }
    
    @TargetApi(18)
    private static void b(final String s) {
        Trace.beginSection(s);
    }
}
