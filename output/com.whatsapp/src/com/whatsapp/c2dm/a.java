// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.c2dm;

import com.whatsapp.DialogToastActivity;
import android.content.pm.PackageManager$NameNotFoundException;
import com.whatsapp.util.Log;
import android.content.SharedPreferences;
import android.content.Context;

public class a
{
    private static final String[] z;
    private final Context a;
    
    static {
        final String[] z2 = new String[12];
        String s = "*\u001b3\u0012y(Y' P,[$";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '&';
                        break;
                    }
                    case 0: {
                        c2 = 'I';
                        break;
                    }
                    case 1: {
                        c2 = ')';
                        break;
                    }
                    case 2: {
                        c2 = 'W';
                        break;
                    }
                    case 3: {
                        c2 = '\u007f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "*\u001b3\u0012y(Y' P,[$";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "*\u001b3\u0012y;L0 O-";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "*\u001b3\u0012y;L0 O-";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "*\u001b3\u0012y;L0 O-";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "*\u001b3\u0012y;L0 O-";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = ".L#<S;[2\u0011R\bY'\u0013O*H#\u0016I'\u007f2\rU F9";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "*F:QQ!H#\fG9Y\b\u000fT,O2\rC'J2\f";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "*\u001b3\u0012y;L#\r_\u0016J8\nH=";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "*\u001b3\u0012y(Y' P,[$";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "*\u001b3\u0012y;L#\r_\u0016J8\nH=";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "*\u001b3\u0012y;L#\r_\u0016J8\nH=";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public a(final Context a) {
        this.a = a;
    }
    
    private SharedPreferences b() {
        return this.a.getSharedPreferences(com.whatsapp.c2dm.a.z[7], 0);
    }
    
    public int a() {
        try {
            return this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.b(com.whatsapp.c2dm.a.z[6], (Throwable)ex);
            return -1;
        }
    }
    
    public void a(final int n) {
        Log.b(this.b().edit().putInt(com.whatsapp.c2dm.a.z[9], n).commit());
    }
    
    public void a(final String s) {
        Log.b(this.b().edit().putString(com.whatsapp.c2dm.a.z[3], s).commit());
    }
    
    public void c() {
        Log.b(this.b().edit().remove(com.whatsapp.c2dm.a.z[0]).commit());
    }
    
    public void d() {
        final int c = C2DMRegistrar.c;
        int f = this.f();
        if (f < Integer.MAX_VALUE) {
            ++f;
        }
        Log.b(this.b().edit().putInt(com.whatsapp.c2dm.a.z[11], f).commit());
        if (DialogToastActivity.h) {
            C2DMRegistrar.c = c + 1;
        }
    }
    
    public void e() {
        Log.b(this.b().edit().remove(com.whatsapp.c2dm.a.z[4]).commit());
    }
    
    public int f() {
        return this.b().getInt(com.whatsapp.c2dm.a.z[8], 0);
    }
    
    public void g() {
        Log.b(this.b().edit().remove(com.whatsapp.c2dm.a.z[10]).commit());
    }
    
    public boolean h() {
        return this.b().contains(com.whatsapp.c2dm.a.z[5]);
    }
    
    public int i() {
        return this.b().getInt(com.whatsapp.c2dm.a.z[1], 0);
    }
    
    public String j() {
        return this.b().getString(com.whatsapp.c2dm.a.z[2], (String)null);
    }
}
