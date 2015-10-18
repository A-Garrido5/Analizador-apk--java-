// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.io.File;
import java.io.FilenameFilter;

final class h implements FilenameFilter
{
    private /* synthetic */ String a;
    
    h(final bc bc, final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean accept(final File file, final String s) {
        return s.startsWith(this.a);
    }
}
