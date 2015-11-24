// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.io.File;
import java.io.FilenameFilter;

final class bd implements FilenameFilter
{
    @Override
    public final boolean accept(final File file, final String s) {
        return s.length() == 39 && s.endsWith(".cls");
    }
}
