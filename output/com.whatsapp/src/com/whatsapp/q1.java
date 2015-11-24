// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import java.util.Comparator;

final class q1 implements Comparator
{
    public int a(final File file, final File file2) {
        return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((File)o, (File)o2);
    }
}
