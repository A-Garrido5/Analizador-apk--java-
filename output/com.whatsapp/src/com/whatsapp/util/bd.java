// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.File;
import java.util.Comparator;

final class bd implements Comparator
{
    private bd() {
    }
    
    bd(final a1 a1) {
        this();
    }
    
    public int a(final File file, final File file2) {
        if (file.lastModified() == file2.lastModified()) {
            return 0;
        }
        if (file.lastModified() < file2.lastModified()) {
            return -1;
        }
        return 1;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((File)o, (File)o2);
    }
}
