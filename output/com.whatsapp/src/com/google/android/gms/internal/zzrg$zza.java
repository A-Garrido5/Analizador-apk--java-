// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.io.IOException;

public class zzrg$zza extends IOException
{
    zzrg$zza(final int n, final int n2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + n + " limit " + n2 + ").");
    }
}
