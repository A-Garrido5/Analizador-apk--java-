import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public final class fj
{
    private static fi a;
    
    static {
        fj.a = null;
    }
    
    public static fi a(final Context context) {
        synchronized (fj.class) {
            fi a;
            if (fj.a == null) {
                a = new fk(context);
            }
            else {
                a = fj.a;
            }
            return a;
        }
    }
}
