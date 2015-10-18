import android.os.Build$VERSION;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.5.30
// 

public final class ai
{
    public static final int a;
    private static final Pattern b;
    private static final Pattern c;
    
    static {
        a = Build$VERSION.SDK_INT;
        b = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");
        c = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    }
    
    public static boolean a(final Object o, final Object o2) {
        if (o == null) {
            return o2 == null;
        }
        return o.equals(o2);
    }
}
