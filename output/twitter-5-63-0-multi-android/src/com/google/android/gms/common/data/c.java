// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.ap;
import java.util.HashMap;
import java.util.ArrayList;

public class c
{
    private final String[] a;
    private final ArrayList b;
    private final String c;
    private final HashMap d;
    private boolean e;
    private String f;
    
    private c(final String[] array, final String c) {
        this.a = (String[])ap.a(array);
        this.b = new ArrayList();
        this.c = c;
        this.d = new HashMap();
        this.e = false;
        this.f = null;
    }
}
