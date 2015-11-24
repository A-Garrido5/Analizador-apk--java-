// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import java.util.Comparator;

final class zv implements Comparator
{
    public int a(final File file, final File file2) {
        return (int)(file2.lastModified() - file.lastModified());
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((File)o, (File)o2);
    }
}
