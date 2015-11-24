// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.os.AsyncTask;
import com.whatsapp.a8s;
import android.content.Context;
import com.whatsapp.util.br;
import com.whatsapp.util.Log;

class a implements y
{
    private static final String[] z;
    final CameraActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "3\u001b\u0006\u001b*";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'M';
                        break;
                    }
                    case 0: {
                        c2 = '\u001d';
                        break;
                    }
                    case 1: {
                        c2 = 'q';
                        break;
                    }
                    case 2: {
                        c2 = 'v';
                        break;
                    }
                    case 3: {
                        c2 = '~';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "~\u0010\u001b\u001b?|\u0010\u0015\n$k\u0018\u0002\u0007bm\u0018\u0015\n8o\u0014\u0002\u001f&x\u001f";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a(final CameraActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        CameraActivity.e(this.a).setOn();
    }
    
    @Override
    public void a(final byte[] array, final boolean b) {
        Log.i(com.whatsapp.camera.a.z[1]);
        this.a.findViewById(2131755343).setVisibility(0);
        a8s.a(new f(this, br.a((Context)this.a, com.whatsapp.camera.a.z[0], (byte)1, 0, false), array, b), new Void[0]);
    }
}
