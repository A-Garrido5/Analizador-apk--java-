import java.io.InputStream;
import android.content.Context;
import com.crashlytics.android.t;

// 
// Decompiled by Procyon v0.5.30
// 

class fz implements t
{
    private final Context a;
    
    public fz(final Context a) {
        this.a = a;
    }
    
    @Override
    public InputStream a() {
        return this.a.getResources().openRawResource(2131230720);
    }
    
    @Override
    public String b() {
        return "changeit";
    }
    
    @Override
    public String[] c() {
        return wj.b;
    }
}
