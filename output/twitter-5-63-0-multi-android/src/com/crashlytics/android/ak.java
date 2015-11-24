// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.util.Arrays;
import java.util.Comparator;
import java.io.FilenameFilter;
import java.io.File;

class ak
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final ac j;
    
    public ak(final String a, final String b, final String c, final String d, final String e, final String f, final int g, final String h, final String i, final ac j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public static void a(final File file, final FilenameFilter filenameFilter, final int n, final Comparator comparator) {
        final File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles != null && listFiles.length > n) {
            Arrays.sort(listFiles, comparator);
            int length = listFiles.length;
            for (final File file2 : listFiles) {
                if (length <= n) {
                    break;
                }
                file2.delete();
                --length;
            }
        }
    }
}
