// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore$Images$Media;
import android.view.View;
import android.app.Activity;

class n
{
    private static final String[] z;
    public final String a;
    final GalleryPickerFragment b;
    public final String c;
    public final bj d;
    public final int e;
    public final int f;
    
    static {
        final String[] z2 = new String[16];
        String s = "+\u001fBbw2\u001bWN";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0432:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001e';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = '~';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "0\u001bH_";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "4\u001bYTn/\u001bTI";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "'\u0010^Oq/\u001a\u0014Tp2\u001bTI0'\u001dNTq(Plt[\u0011";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "$\u000bYV{27^";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "+\u001fBbh/\u001a_RA5\u0017@X";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "$\u000bYV{27^";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "+\u001fBbw2\u001bWN";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "/\u0010YQk\"\u001beP{\"\u0017[";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "+\u001fBbw2\u001bWN";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "0\u001bH_";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "+\u001fBbh/\u001a_RA5\u0017@X";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "1\u0017TYq1*SIr#";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "6\f_Kw#\t";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "6\f_Kw#\t";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "4\u001bYTn/\u001bTI";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    break Label_0432;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public n(final GalleryPickerFragment b, final int f, final int n, final String c, final String a, final bj d, final int e) {
        this.b = b;
        this.f = f;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    public String a() {
        return this.f + "-" + this.c + "-" + GalleryPickerFragment.b(this.b);
    }
    
    public void a(final Activity activity, final View view) {
        final int v = MediaGalleryBase.v;
        Uri uri = null;
        Label_0075: {
            if (this.f != 6) {
                uri = MediaStore$Images$Media.INTERNAL_CONTENT_URI;
                if (!this.d()) {
                    break Label_0075;
                }
                uri = uri.buildUpon().appendQueryParameter(n.z[6], this.c).build();
                if (v == 0) {
                    break Label_0075;
                }
            }
            uri = br.i.buildUpon().appendQueryParameter(n.z[4], this.c).build();
        }
        final Intent intent = this.b.getActivity().getIntent();
        final Intent intent2 = new Intent(n.z[3], uri);
        intent2.putExtra(n.z[12], this.a);
        intent2.putExtra(n.z[8], this.b() & GalleryPickerFragment.b(this.b));
        intent2.putExtra(n.z[14], intent.getStringExtra(n.z[13]));
        intent2.putExtra(n.z[10], intent.getStringExtra(n.z[1]));
        intent2.putExtra(n.z[15], intent.getStringExtra(n.z[2]));
        intent2.putExtra(n.z[5], intent.getLongExtra(n.z[11], Long.MAX_VALUE));
        Label_0292: {
            if ((this.b() & GalleryPickerFragment.b(this.b)) == 0x1) {
                intent2.putExtra(n.z[7], intent.getIntExtra(n.z[9], Integer.MAX_VALUE));
                if (v == 0) {
                    break Label_0292;
                }
            }
            intent2.putExtra(n.z[0], 1);
        }
        intent2.setClass((Context)activity, (Class)MediaPicker.class);
        ActivityCompat.startActivityForResult(activity, intent2, 0, ActivityOptionsCompat.makeSceneTransitionAnimation(this.b.getActivity(), new Pair[0]).toBundle());
    }
    
    public int b() {
        switch (this.f) {
            default: {
                return 5;
            }
            case 0:
            case 2: {
                return 1;
            }
            case 1:
            case 3: {
                return 4;
            }
        }
    }
    
    public int c() {
        switch (this.f) {
            default: {
                return 2130838692;
            }
            case 0:
            case 2: {
                return 2130838691;
            }
            case 1:
            case 3:
            case 4: {
                return 2130838693;
            }
            case 6: {
                return 2130838694;
            }
        }
    }
    
    public boolean d() {
        return this.f >= 2;
    }
}
