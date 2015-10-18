// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.IOException;
import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.File;

class jw implements Runnable
{
    final File a;
    final z6 b;
    
    jw(final z6 b, final File a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                oa.a(this.b.a, new uq(this.a));
                final FileOutputStream fileOutputStream = new FileOutputStream(this.b.a.a());
                oa.a(oa.b(this.b.a), fileOutputStream);
                oa.b(this.b.a).close();
                oa.a(this.b.a, null);
                fileOutputStream.close();
                this.a.delete();
            }
            catch (IOException ex) {
                Log.b(ex);
                continue;
            }
            break;
        }
    }
}
