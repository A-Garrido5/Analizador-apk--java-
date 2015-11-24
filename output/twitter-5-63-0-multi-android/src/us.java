import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class us extends vd implements uk
{
    private static us c;
    
    public static us a() {
        synchronized (us.class) {
            if (us.c == null) {
                us.c = new us();
            }
            return us.c;
        }
    }
    
    public uj a(final Context context) {
        return new uq(context, this);
    }
    
    @Override
    public void a(final long n, final vc vc) {
        this.c(n, vc);
    }
    
    protected void a(final ut ut, final long n, final vc vc) {
        ut.a(n, vc);
    }
}
