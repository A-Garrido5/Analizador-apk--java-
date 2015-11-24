// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import java.util.Comparator;

final class b implements Comparator
{
    public int a(final DetectedActivity detectedActivity, final DetectedActivity detectedActivity2) {
        int n = Integer.valueOf(detectedActivity2.b()).compareTo(Integer.valueOf(detectedActivity.b()));
        if (n == 0) {
            n = Integer.valueOf(detectedActivity.a()).compareTo(Integer.valueOf(detectedActivity2.a()));
        }
        return n;
    }
}
