import com.twitter.util.l;
import com.twitter.library.featureswitch.d;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.5.30
// 

public class wr implements wu
{
    private static wr a;
    private String b;
    private int c;
    
    static {
        wr.a = new wr();
    }
    
    private int a(final String s) {
        if (!"unassigned".equalsIgnoreCase(s) && !"control".equalsIgnoreCase(s)) {
            final String[] split = s.split("_");
            if (split.length == 3) {
                return wq.a(this.c(split[1]), this.b(split[1]), this.d(split[0]), this.e(split[2]));
            }
        }
        return 0;
    }
    
    public static wr a() {
        return wr.a;
    }
    
    private int b(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return 0;
        }
        switch (s) {
            default: {
                return 0;
            }
            case "belowright":
            case "aboveright": {
                return 1;
            }
        }
    }
    
    private int c(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return 0;
        }
        switch (s) {
            default: {
                return 0;
            }
            case "belowright":
            case "belowleft": {
                return 1;
            }
            case "profile": {
                return 2;
            }
        }
    }
    
    private int d(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return 0;
        }
        switch (s) {
            default: {
                return 0;
            }
            case "hide": {
                return 1;
            }
            case "gray": {
                return 2;
            }
        }
    }
    
    private int e(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return 0;
        }
        switch (s) {
            default: {
                return 0;
            }
            case "true": {
                return 1;
            }
        }
    }
    
    @Override
    public int b() {
        final String a = d.a("promoted_badge_display_android_3177");
        if (!l.a(a, this.b)) {
            this.b = a;
            this.c = this.a(a);
        }
        return this.c;
    }
}
