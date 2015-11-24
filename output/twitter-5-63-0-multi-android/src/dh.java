import android.text.TextUtils;

// 
// Decompiled by Procyon v0.5.30
// 

public class dh implements db
{
    private final dd a;
    
    public dh(final dd a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.b();
    }
    
    public void a(final String s, final dc dc) {
        if (this.a.a()) {
            this.b(s, dc);
            return;
        }
        final lq lq = new lq(this.a.a(s));
        if (lq.a() == 0 && TextUtils.isEmpty((CharSequence)s)) {
            lq.b();
            this.b(s, dc);
            return;
        }
        dc.a(s, lq);
    }
    
    void b(final String s, final dc dc) {
        this.a.a(new di(this, s, dc));
    }
}
