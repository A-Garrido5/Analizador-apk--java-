// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.File;
import java.io.FileInputStream;

public abstract class ay extends FileInputStream
{
    private long a;
    
    public ay(final File file) {
        super(file);
    }
    
    public abstract boolean a();
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        final boolean l = Log.l;
        int read = 0;
        while (true) {
            Label_0070: {
                try {
                    while (true) {
                        if (this.getChannel().size() >= this.a + n2 || !this.a()) {
                            read = super.read(array, n, n2);
                            if (!l) {
                                break Label_0070;
                            }
                        }
                        try {
                            Thread.sleep(200L);
                            continue;
                        }
                        catch (InterruptedException ex3) {
                            read = 0;
                        }
                        break;
                    }
                    return read;
                }
                catch (InterruptedException ex) {
                    throw ex;
                }
            }
            if (read >= 0) {
                break;
            }
            return read;
        }
        try {
            this.a += read;
            return read;
        }
        catch (InterruptedException ex2) {
            throw ex2;
        }
    }
}
