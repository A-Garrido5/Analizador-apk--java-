// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.io.File;
import java.io.FilenameFilter;

final class ag implements FilenameFilter
{
    @Override
    public final boolean accept(final File file, final String s) {
        return s.endsWith(".cls") && !s.contains("Session");
    }
}
