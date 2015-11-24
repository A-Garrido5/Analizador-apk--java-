// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.io.File;
import java.io.FilenameFilter;

final class ai implements FilenameFilter
{
    final /* synthetic */ long a;
    
    ai(final long a) {
        this.a = a;
    }
    
    @Override
    public boolean accept(final File file, final String s) {
        return s.startsWith("pic-" + this.a);
    }
}
