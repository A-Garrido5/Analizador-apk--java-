// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

public abstract class zzkf
{
    public static boolean a;
    private static zzkf$zza zzYj;
    private static int zzYk;
    private static String zzYl;
    private static final Object zzoW;
    private Object zzLS;
    protected final String zztw;
    protected final Object zztx;
    
    static {
        zzoW = new Object();
        zzkf.zzYj = null;
        zzkf.zzYk = 0;
        zzkf.zzYl = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    }
    
    protected zzkf(final String zztw, final Object zztx) {
        this.zzLS = null;
        this.zztw = zztw;
        this.zztx = zztx;
    }
    
    public static boolean isInitialized() {
        return zzkf.zzYj != null;
    }
    
    public static zzkf zza(final String s, final Integer n) {
        return new zzkf$3(s, n);
    }
    
    public static zzkf zza(final String s, final Long n) {
        return new zzkf$2(s, n);
    }
    
    public static zzkf zzg(final String s, final boolean b) {
        return new zzkf$1(s, Boolean.valueOf(b));
    }
    
    public static int zzmY() {
        return zzkf.zzYk;
    }
    
    static zzkf$zza zzna() {
        return zzkf.zzYj;
    }
    
    public static zzkf zzs(final String s, final String s2) {
        return new zzkf$5(s, s2);
    }
    
    public final Object get() {
        if (this.zzLS != null) {
            return this.zzLS;
        }
        return this.zzbP(this.zztw);
    }
    
    protected abstract Object zzbP(final String p0);
}
