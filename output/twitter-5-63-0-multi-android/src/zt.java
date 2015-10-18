import java.security.PrivilegedAction;

// 
// Decompiled by Procyon v0.5.30
// 

class zt implements PrivilegedAction
{
    final /* synthetic */ zs a;
    
    zt(final zs a) {
        this.a = a;
    }
    
    @Override
    public Object run() {
        return System.getProperty("org.spongycastle.pkcs1.strict");
    }
}
