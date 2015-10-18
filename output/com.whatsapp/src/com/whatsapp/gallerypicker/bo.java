// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.util.av;
import java.io.IOException;
import java.io.FileNotFoundException;
import com.whatsapp.util.br;
import com.whatsapp.ym;
import android.graphics.Bitmap;
import android.net.Uri;

class bo implements b8
{
    final ImagePreview a;
    final Uri b;
    final Uri c;
    final int d;
    
    bo(final ImagePreview a, final int d, final Uri b, final Uri c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String a() {
        return this.c.toString();
    }
    
    @Override
    public Bitmap b() {
        int j = 0;
        try {
            if (this.d == 0) {
                j = ym.j;
                final bo bo = this;
                final Uri uri = bo.b;
                final int n = j;
                final int n2 = j;
                return br.a(uri, n, n2);
            }
            goto Label_0038;
        }
        catch (FileNotFoundException ex) {
            try {
                throw ex;
            }
            catch (FileNotFoundException ex2) {
                ex2.printStackTrace();
            }
            catch (OutOfMemoryError outOfMemoryError) {
                outOfMemoryError.printStackTrace();
            }
            catch (IOException ex3) {
                ex3.printStackTrace();
            }
            catch (av av) {
                av.printStackTrace();
            }
        }
        catch (OutOfMemoryError outOfMemoryError2) {}
        catch (IOException ex4) {}
        catch (av av2) {}
        try {
            final bo bo = this;
            final Uri uri = bo.b;
            final int n = j;
            final int n2 = j;
            return br.a(uri, n, n2);
        }
        catch (FileNotFoundException ex5) {}
    }
}
