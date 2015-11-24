// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.io.File;
import java.io.FilenameFilter;

final class w implements FilenameFilter
{
    private final String a;
    
    public w(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean accept(final File file, final String s) {
        return !s.equals(this.a + ".cls") && s.contains(this.a) && !s.endsWith(".cls_temp");
    }
}
