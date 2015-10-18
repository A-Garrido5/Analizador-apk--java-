// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;
import java.util.ArrayList;

public class DataHolder$zza
{
    public static int a;
    private final ArrayList zzYF;
    private final String zzYG;
    private final HashMap zzYH;
    private boolean zzYI;
    private String zzYJ;
    private final String[] zzYw;
    
    private DataHolder$zza(final String[] array, final String zzYG) {
        this.zzYw = (String[])zzu.zzu(array);
        this.zzYF = new ArrayList();
        this.zzYG = zzYG;
        this.zzYH = new HashMap();
        this.zzYI = false;
        this.zzYJ = null;
    }
    
    DataHolder$zza(final String[] array, final String s, final DataHolder$1 dataHolder$1) {
        this(array, s);
    }
}
