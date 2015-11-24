import com.twitter.library.featureswitch.d;
import com.twitter.library.av.model.a;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class ea
{
    static ea a;
    private final dz b;
    private final dz c;
    
    ea(final dy b, final dw c) {
        this.b = b;
        this.c = c;
    }
    
    public static ea a(final Context context) {
        if (ea.a == null) {
            ea.a = new ea(new dy(context), new dw());
        }
        return ea.a;
    }
    
    public dz a(final a a) {
        if (this.b(a)) {
            return this.b;
        }
        return this.c;
    }
    
    public void a() {
        this.b.a();
        this.c.a();
    }
    
    boolean b(final a a) {
        return "audio".equals(a.b()) && d.f("audio_configurations_macawnymizer_beaconing_enabled");
    }
}
