// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.SharedPreferences$Editor;
import android.content.Intent;
import android.content.Context;
import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ads implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final RegisterPhone a;
    
    static {
        final String[] z2 = new String[8];
        String s = "?@";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = '\\';
                        break;
                    }
                    case 1: {
                        c2 = '#';
                        break;
                    }
                    case 2: {
                        c2 = 'L';
                        break;
                    }
                    case 3: {
                        c2 = '(';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ",K";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "?L!\u0006]4B8[K,Sb~O.J*Qy1Pb[O.U)ZY9M(";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "?L!\u0006]4B8[K,S\u0013XX9E)ZO2@)[";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ".F+AY(F>XB3M)\u0007Y9W/KZ4L\"MD)NcNK5O)L";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ".F+AY(F>XB3M)\u0007I3M*AX1\f:GC?F";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "?L!\u0006]4B8[K,Sb~O.J*Qy1PbZE=N%FM";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "?L!\u0006]4B8[K,Sb~O.J*Qy1PbZE=N%FM";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ads(final RegisterPhone a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final boolean i = App.I;
        this.a.removeDialog(21);
        final SharedPreferences$Editor edit = this.a.getSharedPreferences(ads.z[3], 0).edit();
        edit.putString(ads.z[0], EnterPhoneNumber.z);
        edit.putString(ads.z[1], EnterPhoneNumber.w);
        if (!edit.commit()) {
            Log.e(ads.z[4]);
        }
        Intent intent = null;
        Label_0248: {
            if (this.a.c()) {
                Label_0116: {
                    if (this.a.e()) {
                        EnterPhoneNumber.s = 14;
                        if (!i) {
                            break Label_0116;
                        }
                    }
                    EnterPhoneNumber.s = 0;
                }
                this.a.b();
                App.b((Context)this.a, 4);
                intent = new Intent((Context)this.a, (Class)VerifySms.class);
                intent.putExtra(ads.z[2], this.a.t);
                intent.putExtra(ads.z[7], this.a.k);
                if (!i) {
                    break Label_0248;
                }
            }
            EnterPhoneNumber.s = 0;
            this.a.b();
            Log.i(ads.z[5]);
            App.b((Context)this.a, 4);
            intent = new Intent((Context)this.a, (Class)VerifySms.class);
            intent.putExtra(ads.z[6], this.a.k);
        }
        this.a.startActivity(intent);
        this.a.finish();
    }
}
