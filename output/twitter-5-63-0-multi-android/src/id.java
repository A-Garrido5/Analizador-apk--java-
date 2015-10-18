import android.content.Context;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.5.30
// 

public class id
{
    private static final Pattern d;
    public int a;
    public long b;
    public String c;
    
    static {
        d = Pattern.compile("[\\s]*processor[\\s]*:[\\s]([0-9]+)");
    }
    
    public id(final Context context) {
        this.b = Runtime.getRuntime().maxMemory();
        final int densityDpi = context.getResources().getDisplayMetrics().densityDpi;
        if (densityDpi < 160) {
            this.c = "ldpi";
        }
        else if (densityDpi == 160) {
            this.c = "mdpi";
        }
        else if (densityDpi <= 240) {
            this.c = "hdpi";
        }
        else if (densityDpi <= 320) {
            this.c = "xhdpi";
        }
        else if (densityDpi <= 480) {
            this.c = "xxhdpi";
        }
        else if (densityDpi <= 640) {
            this.c = "xxxhdpi";
        }
        else {
            this.c = "xxxhdpi+";
        }
        new if(this, null).execute((Object[])new Void[0]);
    }
}
