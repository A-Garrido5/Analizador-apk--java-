// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.json.JSONException;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.cb;
import org.json.JSONObject;
import org.apache.http.Header;

class aqe implements a6i
{
    private static final String[] z;
    final w3 a;
    
    static {
        final String[] z2 = new String[6];
        String s = "B)\"\u0001UV0*";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '!';
                        break;
                    }
                    case 0: {
                        c2 = '/';
                        break;
                    }
                    case 1: {
                        c2 = '@';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = 'd';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "B%+\r@Z0#\u000b@Ko%\u0017NA%7\u0007D_4&\u000bO\u000f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Z2#";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\\)5\u0001";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "K5=\u0005UF/!";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "I)#\u0001IN3'";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    aqe(final w3 a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        a9.a(this.a.b, new Integer[] { n });
    }
    
    @Override
    public void a(final Header[] array, final String s) {
        try {
            final JSONObject jsonObject = new JSONObject(s);
            this.a.b.o = new cb();
            this.a.b.o.c = jsonObject.optString(aqe.z[0]);
            this.a.b.o.a = jsonObject.optString(aqe.z[2]);
            this.a.b.o.d = jsonObject.optLong(aqe.z[3]);
            this.a.b.o.e = jsonObject.optInt(aqe.z[4]);
            this.a.b.o.b = jsonObject.optString(aqe.z[5]);
            this.a.b.n = true;
        }
        catch (JSONException ex) {
            Log.e(aqe.z[1] + ex.toString());
        }
    }
}
