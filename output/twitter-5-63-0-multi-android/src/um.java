import android.text.TextUtils;

// 
// Decompiled by Procyon v0.5.30
// 

public class um implements wf
{
    private final String a;
    private final String b;
    private we c;
    private boolean d;
    
    private um(final String a, final String b) {
        this.d = false;
        this.a = a;
        this.b = b;
        if (!TextUtils.isEmpty((CharSequence)a)) {
            (this.c = wg.a().b()).a(this);
            this.c.a(a);
        }
    }
    
    public static um a(final String s, final String s2, final vc vc) {
        return new um(wb.a(s, vc), wb.a(s2, vc));
    }
    
    public String a() {
        return this.a;
    }
    
    @Override
    public void a(final String s, final boolean d) {
        synchronized (this) {
            this.c.b(this);
            this.c = null;
            this.d = d;
        }
    }
    
    public String b() {
        return this.b;
    }
    
    public boolean c() {
        synchronized (this) {
            return this.d;
        }
    }
}
