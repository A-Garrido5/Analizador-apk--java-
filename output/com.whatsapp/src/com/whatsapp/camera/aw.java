// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.graphics.Bitmap$CompressFormat;
import android.os.Parcelable;
import com.whatsapp.App;
import com.whatsapp.ym;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.wallpaper.CropImage;
import android.view.View;
import android.net.Uri;
import com.whatsapp.util.co;

class aw extends co
{
    private static final String[] z;
    final Uri b;
    final CameraActivity c;
    
    static {
        final String[] z2 = new String[11];
        String s = "5\u001bpWJ.";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '?';
                        break;
                    }
                    case 0: {
                        c2 = 'Z';
                        break;
                    }
                    case 1: {
                        c2 = 'n';
                        break;
                    }
                    case 2: {
                        c2 = '\u0004';
                        break;
                    }
                    case 3: {
                        c2 = '\'';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "9\u001ckW}#!qSO/\u001aWNE?";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "<\u0002mWw";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ")\reKZ\u000f\u001eMAq?\u000b`B[";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "9\u000fiBM;";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "<\u0002mW\u00122";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "<\u0002eSK?\u0000VHK;\u001amHQ";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "3\u0000mSV;\u0002VB\\.";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "(\u0001pFK3\u0001j";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "7\u000f|dM5\u001e";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "5\u001bpWJ.(kUR;\u001a";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    aw(final CameraActivity c, final Uri b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        final Intent intent = new Intent((Context)this.c, (Class)CropImage.class);
        intent.putExtra(aw.z[3], false);
        intent.putExtra(aw.z[1], false);
        intent.putExtra(aw.z[6], false);
        intent.putExtra(aw.z[9], ym.j);
        intent.putExtra(aw.z[0], (Parcelable)Uri.fromFile(App.D(aw.z[4])));
        intent.putExtra(aw.z[10], Bitmap$CompressFormat.JPEG.toString());
        intent.setData(this.b);
        if (CameraActivity.u(this.c) != null) {
            intent.putExtra(aw.z[7], (Parcelable)CameraActivity.u(this.c));
        }
        if (CameraActivity.w(this.c) != 0) {
            intent.putExtra(aw.z[8], CameraActivity.w(this.c));
        }
        if (this.b.getQueryParameter(aw.z[5]) != null) {
            intent.putExtra(aw.z[2], true);
        }
        this.c.startActivityForResult(intent, 1);
    }
}
