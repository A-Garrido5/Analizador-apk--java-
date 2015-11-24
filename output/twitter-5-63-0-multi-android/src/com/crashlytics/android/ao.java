// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.io.IOException;
import java.io.File;
import java.io.FilenameFilter;
import java.io.FileOutputStream;

final class ao extends FileOutputStream
{
    public static final FilenameFilter a;
    private final String b;
    private File c;
    private boolean d;
    
    static {
        a = new ap();
    }
    
    public ao(final File file, final String s) {
        super(new File(file, s + ".cls_temp"));
        this.d = false;
        this.b = file + File.separator + s;
        this.c = new File(this.b + ".cls_temp");
    }
    
    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        super.flush();
        super.close();
    }
    
    @Override
    public final void close() {
        final File file;
        Label_0081: {
            synchronized (this) {
                if (!this.d) {
                    this.d = true;
                    super.flush();
                    super.close();
                    file = new File(this.b + ".cls");
                    if (!this.c.renameTo(file)) {
                        break Label_0081;
                    }
                    this.c = null;
                }
                return;
            }
        }
        String s = "";
        if (file.exists()) {
            s = " (target already exists)";
        }
        else if (!this.c.exists()) {
            s = " (source does not exist)";
        }
        throw new IOException("Could not rename temp file: " + this.c + " -> " + file + s);
    }
}
