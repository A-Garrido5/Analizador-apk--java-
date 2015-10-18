// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.view.View;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import com.whatsapp.util.Log;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import android.graphics.Bitmap;

public class ViewSharedContactActivity extends DialogToastActivity
{
    private static final String[] z;
    private Bitmap k;
    private boolean l;
    private String m;
    private String n;
    private o o;
    private boolean p;
    private String q;
    private LinearLayout r;
    
    static {
        final String[] z2 = new String[90];
        String s = "\u000e\"\u0000>\u000f\u0016\u001c\u0010?\u001c\u000e\"\r4\b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_2282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'z';
                        break;
                    }
                    case 0: {
                        c2 = 'b';
                        break;
                    }
                    case 1: {
                        c2 = 'C';
                        break;
                    }
                    case 2: {
                        c2 = 'y';
                        break;
                    }
                    case 3: {
                        c2 = 'Q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\f6\u0015=";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000e\"\u0000>\u000f\u0016\u001c\u0010?\u001c\u000e\"\r4\b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0007.\u00188\u0016";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u0012+\u0016?\u001fX";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0012,\n%\u001b\u000e";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0017-\u001a9\u001f\u0001(\u001c5@";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0014*\u001c&\t\n\"\u000b4\u001e\u0001,\u0017%\u001b\u00017V2\b\u0007\"\r4U\u0014 \u0018#\u001eB*\nq\u0014\u0017/\u0015p";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\b*\u001d";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "J+\r%\n\u001e+\r%\n\u0011jC~UJ\u0018%&W?h%\u007fSI\u0018%&W?hQ~!>4TqTM|\\w\u001b\u000f3Bl'HjF";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "7\u00115";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0014*\u001c&\u0012\u00031\u001c5\u0019\r-\r0\u0019\u0016l\u0015>\u001b\u0006\u001c\u001a>\u0014\u0016\"\u001a%%\u0012+\u0016%\u0015=%\u00188\u0016\u0007'Y";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0014 \u0018#\u001e";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0001,\u0017%\u001b\u00017&8\u001e";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0007'\u0010%%\u0001,\u0017%\u001b\u00017&8\u0014\u0004,";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0005&\r\u0005\u0003\u0012&50\u0018\u0007/+4\t\r6\u000b2\u001f";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0010\"\u000e\u000e\u0019\r-\r0\u0019\u0016\u001c\u00105";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0006\"\r0B";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0014*\u001c&\t\n\"\u000b4\u001e\u0001,\u0017%\u001b\u00017\u00182\u000e\u000b5\u0010%\u0003B";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u000f*\u00144\u000e\u001b3\u001c";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0006\"\r0N";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0014-\u001d\u007f\u001b\f'\u000b>\u0013\u0006m\u001a$\b\u0011,\u000b\u007f\u0013\u0016&\u0014~\n\n,\u00174%\u0014q";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0014*\u001c&%\u0011+\u0018#\u001f\u0006\u001c\u001a>\u0014\u0016\"\u001a%U\u0000\"\u001d\u000e\u0010\u000b'Cq";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0014-\u001d\u007f\u001b\f'\u000b>\u0013\u0006m\u001a$\b\u0011,\u000b\u007f\u0013\u0016&\u0014~\n\r0\r0\u0016O\"\u001d5\b\u00070\n\u000e\fP";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0010\"\u000e\u000e\u0019\r-\r0\u0019\u0016\u001c\u00105";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0003 \u001a>\u000f\f7&%\u0003\u0012&";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0006\"\r0M";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0006\"\r0KW";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0006\"\r0K";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u0014-\u001d\u007f\u001b\f'\u000b>\u0013\u0006m\u001a$\b\u0011,\u000b\u007f\u0013\u0016&\u0014~\u0014\u0003.\u001c";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u0006\"\r0I";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u0014-\u001d\u007f\u001b\f'\u000b>\u0013\u0006m\u001a$\b\u0011,\u000b\u007f\u0013\u0016&\u0014~\u0019\r-\r0\u0019\u0016\u001c\u001c'\u001f\f7";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u0006\"\r0H";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u000f*\u00144\u000e\u001b3\u001c";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u0014*\u001c&%\u0011+\u0018#\u001f\u0006\u001c\u001a>\u0014\u0016\"\u001a%U\u0004\"\u0015\"\u001f=.\u0018%\u0019\nyY";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u000f*\u00144\u000e\u001b3\u001c";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\u000f*\u00144\u000e\u001b3\u001c";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u0006\"\r0N";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u0006\"\r0M";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u000f*\u00144\u000e\u001b3\u001c";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u0010\"\u000e\u000e\u0019\r-\r0\u0019\u0016\u001c\u00105";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\u0006\"\r0I";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "\u0006\"\r0K";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "\u0006\"\r0N";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "\u0010\"\u000e\u000e\u0019\r-\r0\u0019\u0016\u001c\u00105";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = ",\n:\u001a4#\u000e<";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "\u0006\"\r0K";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "\u0006\"\r0L";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\u0006\"\r0C";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = " \u00078\b";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "\u0014*\u001c&%\u0011+\u0018#\u001f\u0006\u001c\u001a>\u0014\u0016\"\u001a%U\u00011\u001c0\u000e\u0007\u001c\u001a>\u0014\u0016\"\u001a%@B";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "\u0014-\u001d\u007f\u001b\f'\u000b>\u0013\u0006m\u001a$\b\u0011,\u000b\u007f\u0013\u0016&\u0014~\u0015\u0010$\u0018?\u0013\u0018\"\r8\u0015\f";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "B?Y";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "\u0006\"\r0I";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "\u0014*\u001c&\t\n\"\u000b4\u001e\u0001,\u0017%\u001b\u00017\u00182\u000e\u000b5\u0010%\u0003M7\u0000!\u001fM6\u0017:\u0014\r4\u0017q";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "\u0006\"\r0K";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "\u0006\"\r0O";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "\u000f*\u00144\u000e\u001b3\u001c";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "\u0006\"\r0I";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "\u0014-\u001d\u007f\u001b\f'\u000b>\u0013\u0006m\u001a$\b\u0011,\u000b\u007f\u0013\u0016&\u0014~\n\n,\r>";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "\u0001,\u0014\u007f\u001b\f'\u000b>\u0013\u0006m\u001a>\u0014\u0016\"\u001a%\t";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "\u0014*\u001c&%\u0011+\u0018#\u001f\u0006\u001c\u001a>\u0014\u0016\"\u001a%U\u0017-\u0012>\r\f\u001c\u001a>\u0014\u0016\"\u001a%%\u00173\u001d0\u000e\u0007y";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "\u0006\"\r0O";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "\u0010\"\u000e\u000e\u0019\r-\r0\u0019\u0016\u001c\u00105";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "\u0006\"\r0H";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "\u0006\"\r0H";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "\u0006\"\r0K";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    s = "\u0010\"\u000e\u000e\u0019\r-\r0\u0019\u0016\u001c\u00105";
                    n = 66;
                    n2 = 67;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    array = z2;
                    s = "\u0003 \u001a>\u000f\f7&?\u001b\u000f&";
                    n = 67;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "\u0014*\u001c&%\u0011+\u0018#\u001f\u0006\u001c\u001a>\u0014\u0016\"\u001a%U\f&\u000e\u000e\u0014\u0017.\u001b4\bM-\u001c4\u001e='\u001c=\u000e\u0003\u001c\n(\u0014\u0001";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "\u0006\"\r0K";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "\u0006\"\r0C";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "\u000f*\u00144\u000e\u001b3\u001c";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "\u000f*\u00144\u000e\u001b3\u001c";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "\u0006\"\r0H";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "\u0010\"\u000e\u000e\u0019\r-\r0\u0019\u0016\u001c\u00105";
                    n = 74;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "\u0014-\u001d\u007f\u001b\f'\u000b>\u0013\u0006m\u001a$\b\u0011,\u000b\u007f\u0013\u0016&\u0014~\u0013\u000f";
                    n = 75;
                    array = z2;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "\u0014-\u001d\u007f\u001b\f'\u000b>\u0013\u0006m\u001a$\b\u0011,\u000b\u007f\u0013\u0016&\u0014~\u0014\u000b \u0012?\u001b\u000f&";
                    n = 76;
                    array = z2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "\u000f*\u00144\u000e\u001b3\u001c";
                    n = 77;
                    array = z2;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "\u0010\"\u000e\u000e\u0019\r-\r0\u0019\u0016\u001c\u00105";
                    n = 78;
                    array = z2;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "\u0006\"\r0O";
                    n = 79;
                    array = z2;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    s = "\u0003'\u001d\u000e\t\n\"\u000b4\u001e= \u0016?\u000e\u0003 \r~";
                    n = 80;
                    n2 = 81;
                    array = z2;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    array = z2;
                    s = "\u0014-\u001d\u007f\u001b\f'\u000b>\u0013\u0006m\u001a$\b\u0011,\u000b\u007f\u0013\u0016&\u0014~\u001f\u000f\"\u0010=%\u0014q";
                    n = 81;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    n2 = 83;
                    s = "\u0006\"\r0H";
                    n = 82;
                    array = z2;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    s = "\u0006\"\r0H";
                    n = 83;
                    array = z2;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "\u0006\"\r0K";
                    n = 84;
                    array = z2;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    n2 = 86;
                    s = "\u0010\"\u000e\u000e\u0019\r-\r0\u0019\u0016\u001c\u00105";
                    n = 85;
                    array = z2;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    s = "\u0006\"\r0KR";
                    n = 86;
                    array = z2;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "\u000e\"\u0000>\u000f\u0016\u001c\u0010?\u001c\u000e\"\r4\b";
                    n = 87;
                    array = z2;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "7\u00115";
                    n = 88;
                    array = z2;
                    continue;
                }
                case 88: {
                    break Label_2282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ViewSharedContactActivity() {
        this.o = null;
        this.p = false;
        this.k = null;
        this.l = false;
    }
    
    private RelativeLayout a(final String p0, final String p1, final int p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //     4: iconst_0       
        //     5: aaload         
        //     6: invokevirtual   com/whatsapp/ViewSharedContactActivity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //     9: checkcast       Landroid/view/LayoutInflater;
        //    12: ldc             2130903233
        //    14: aconst_null    
        //    15: iconst_1       
        //    16: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    19: checkcast       Landroid/widget/RelativeLayout;
        //    22: astore          5
        //    24: aload           5
        //    26: aload           4
        //    28: invokevirtual   android/widget/RelativeLayout.setTag:(Ljava/lang/Object;)V
        //    31: aload           5
        //    33: iconst_1       
        //    34: invokevirtual   android/widget/RelativeLayout.setClickable:(Z)V
        //    37: aload           5
        //    39: iconst_1       
        //    40: invokevirtual   android/widget/RelativeLayout.setFocusable:(Z)V
        //    43: aload           5
        //    45: aload_0        
        //    46: invokevirtual   com/whatsapp/ViewSharedContactActivity.getResources:()Landroid/content/res/Resources;
        //    49: ldc             2130839068
        //    51: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    54: invokevirtual   android/widget/RelativeLayout.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    57: aload_0        
        //    58: getfield        com/whatsapp/ViewSharedContactActivity.l:Z
        //    61: ifeq            75
        //    64: aload           5
        //    66: ldc             2131755807
        //    68: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //    71: iconst_0       
        //    72: invokevirtual   android/view/View.setVisibility:(I)V
        //    75: aload           5
        //    77: ldc             2131755805
        //    79: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //    82: checkcast       Landroid/widget/TextView;
        //    85: astore          7
        //    87: aload           7
        //    89: iconst_2       
        //    90: invokevirtual   android/widget/TextView.setMaxLines:(I)V
        //    93: aload_2        
        //    94: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    97: iconst_1       
        //    98: aaload         
        //    99: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   102: ifne            111
        //   105: aload           7
        //   107: aload_2        
        //   108: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   111: aload           5
        //   113: ldc             2131755806
        //   115: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //   118: checkcast       Landroid/widget/TextView;
        //   121: aload_1        
        //   122: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   125: aload           5
        //   127: ldc             2131755804
        //   129: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //   132: checkcast       Landroid/widget/ImageView;
        //   135: iload_3        
        //   136: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   139: aload           5
        //   141: areturn        
        //   142: astore          6
        //   144: aload           6
        //   146: athrow         
        //   147: astore          8
        //   149: aload           8
        //   151: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  24     75     142    147    Ljava/lang/IllegalArgumentException;
        //  87     111    147    152    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0111:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private RelativeLayout a(final m p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //     4: iconst_2       
        //     5: aaload         
        //     6: invokevirtual   com/whatsapp/ViewSharedContactActivity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //     9: checkcast       Landroid/view/LayoutInflater;
        //    12: ldc             2130903233
        //    14: aconst_null    
        //    15: iconst_1       
        //    16: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    19: checkcast       Landroid/widget/RelativeLayout;
        //    22: astore_3       
        //    23: aload_3        
        //    24: aload_1        
        //    25: getfield        m.e:Ljava/lang/String;
        //    28: invokevirtual   android/widget/RelativeLayout.setTag:(Ljava/lang/Object;)V
        //    31: aload_3        
        //    32: iconst_1       
        //    33: invokevirtual   android/widget/RelativeLayout.setClickable:(Z)V
        //    36: aload_3        
        //    37: iconst_1       
        //    38: invokevirtual   android/widget/RelativeLayout.setFocusable:(Z)V
        //    41: aload_3        
        //    42: aload_0        
        //    43: invokevirtual   com/whatsapp/ViewSharedContactActivity.getResources:()Landroid/content/res/Resources;
        //    46: ldc             2130839068
        //    48: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    51: invokevirtual   android/widget/RelativeLayout.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    54: aload_0        
        //    55: getfield        com/whatsapp/ViewSharedContactActivity.l:Z
        //    58: ifeq            71
        //    61: aload_3        
        //    62: ldc             2131755807
        //    64: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //    67: iconst_0       
        //    68: invokevirtual   android/view/View.setVisibility:(I)V
        //    71: aload_3        
        //    72: ldc             2131755805
        //    74: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //    77: checkcast       Landroid/widget/TextView;
        //    80: astore          5
        //    82: aload           5
        //    84: iconst_3       
        //    85: invokevirtual   android/widget/TextView.setMaxLines:(I)V
        //    88: aload_1        
        //    89: getfield        m.a:Ll;
        //    92: ifnull          107
        //    95: aload           5
        //    97: aload_1        
        //    98: getfield        m.a:Ll;
        //   101: invokevirtual   l.a:()Ljava/lang/String;
        //   104: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   107: aload_3        
        //   108: ldc             2131755806
        //   110: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //   113: checkcast       Landroid/widget/TextView;
        //   116: astore          7
        //   118: aload_1        
        //   119: getfield        m.f:I
        //   122: ifne            168
        //   125: aload_1        
        //   126: getfield        m.c:Ljava/lang/String;
        //   129: astore          9
        //   131: aload           7
        //   133: aload           9
        //   135: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   138: aload_3        
        //   139: ldc             2131755804
        //   141: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //   144: checkcast       Landroid/widget/ImageView;
        //   147: iload_2        
        //   148: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   151: aload_3        
        //   152: areturn        
        //   153: astore          4
        //   155: aload           4
        //   157: athrow         
        //   158: astore          6
        //   160: aload           6
        //   162: athrow         
        //   163: astore          8
        //   165: aload           8
        //   167: athrow         
        //   168: aload_0        
        //   169: ldc             Landroid/provider/ContactsContract$CommonDataKinds$StructuredPostal;.class
        //   171: aload_1        
        //   172: getfield        m.f:I
        //   175: invokespecial   com/whatsapp/ViewSharedContactActivity.a:(Ljava/lang/Class;I)Ljava/lang/String;
        //   178: astore          9
        //   180: goto            131
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  23     71     153    158    Ljava/lang/IllegalArgumentException;
        //  82     107    158    163    Ljava/lang/IllegalArgumentException;
        //  118    131    163    168    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 90, Size: 90
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private RelativeLayout a(final q p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //     8: bipush          88
        //    10: aaload         
        //    11: invokevirtual   com/whatsapp/ViewSharedContactActivity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    14: checkcast       Landroid/view/LayoutInflater;
        //    17: ldc             2130903233
        //    19: aconst_null    
        //    20: iconst_1       
        //    21: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    24: checkcast       Landroid/widget/RelativeLayout;
        //    27: astore_3       
        //    28: aload_3        
        //    29: new             Lcom/whatsapp/bx;
        //    32: dup            
        //    33: aload_0        
        //    34: aload_1        
        //    35: invokespecial   com/whatsapp/bx.<init>:(Lcom/whatsapp/ViewSharedContactActivity;Lq;)V
        //    38: invokevirtual   android/widget/RelativeLayout.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    41: aload_3        
        //    42: aload_1        
        //    43: invokevirtual   android/widget/RelativeLayout.setTag:(Ljava/lang/Object;)V
        //    46: aload_3        
        //    47: iconst_1       
        //    48: invokevirtual   android/widget/RelativeLayout.setClickable:(Z)V
        //    51: aload_3        
        //    52: iconst_1       
        //    53: invokevirtual   android/widget/RelativeLayout.setFocusable:(Z)V
        //    56: aload_3        
        //    57: aload_0        
        //    58: invokevirtual   com/whatsapp/ViewSharedContactActivity.getResources:()Landroid/content/res/Resources;
        //    61: ldc             2130839068
        //    63: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    66: invokevirtual   android/widget/RelativeLayout.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    69: aload_0        
        //    70: getfield        com/whatsapp/ViewSharedContactActivity.l:Z
        //    73: ifeq            86
        //    76: aload_3        
        //    77: ldc             2131755807
        //    79: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //    82: iconst_0       
        //    83: invokevirtual   android/view/View.setVisibility:(I)V
        //    86: aload_3        
        //    87: ldc             2131755805
        //    89: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //    92: checkcast       Landroid/widget/TextView;
        //    95: astore          5
        //    97: aload           5
        //    99: iconst_2       
        //   100: invokevirtual   android/widget/TextView.setMaxLines:(I)V
        //   103: aload           5
        //   105: aload_1        
        //   106: getfield        q.f:Ljava/lang/String;
        //   109: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   112: aload_3        
        //   113: ldc             2131755806
        //   115: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //   118: checkcast       Landroid/widget/TextView;
        //   121: astore          6
        //   123: getstatic       o.a:Ljava/util/HashMap;
        //   126: aload_1        
        //   127: getfield        q.d:Ljava/lang/String;
        //   130: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   133: istore          9
        //   135: iload           9
        //   137: ifeq            162
        //   140: aload           6
        //   142: getstatic       o.c:Ljava/util/HashMap;
        //   145: aload_1        
        //   146: getfield        q.d:Ljava/lang/String;
        //   149: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   152: checkcast       Ljava/lang/CharSequence;
        //   155: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   158: iload_2        
        //   159: ifeq            268
        //   162: aload_1        
        //   163: getfield        q.d:Ljava/lang/String;
        //   166: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   169: bipush          89
        //   171: aaload         
        //   172: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   175: istore          10
        //   177: iload           10
        //   179: ifeq            250
        //   182: aload_1        
        //   183: getfield        q.b:Ljava/util/Set;
        //   186: invokeinterface java/util/Set.toArray:()[Ljava/lang/Object;
        //   191: astore          12
        //   193: aload           12
        //   195: ifnull          231
        //   198: aload           12
        //   200: arraylength    
        //   201: istore          15
        //   203: iload           15
        //   205: ifle            231
        //   208: aload           6
        //   210: aload_1        
        //   211: getfield        q.b:Ljava/util/Set;
        //   214: invokeinterface java/util/Set.toArray:()[Ljava/lang/Object;
        //   219: iconst_0       
        //   220: aaload         
        //   221: checkcast       Ljava/lang/String;
        //   224: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   227: iload_2        
        //   228: ifeq            246
        //   231: aload           6
        //   233: aload_0        
        //   234: invokevirtual   com/whatsapp/ViewSharedContactActivity.getResources:()Landroid/content/res/Resources;
        //   237: ldc_w           2131231916
        //   240: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //   243: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   246: iload_2        
        //   247: ifeq            268
        //   250: aload           6
        //   252: getstatic       o.c:Ljava/util/HashMap;
        //   255: aload_1        
        //   256: getfield        q.d:Ljava/lang/String;
        //   259: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   262: checkcast       Ljava/lang/CharSequence;
        //   265: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   268: aload_3        
        //   269: ldc             2131755804
        //   271: invokevirtual   android/widget/RelativeLayout.findViewById:(I)Landroid/view/View;
        //   274: iconst_4       
        //   275: invokevirtual   android/view/View.setVisibility:(I)V
        //   278: aload_3        
        //   279: areturn        
        //   280: astore          4
        //   282: aload           4
        //   284: athrow         
        //   285: astore          7
        //   287: aload           7
        //   289: athrow         
        //   290: astore          8
        //   292: aload           8
        //   294: athrow         
        //   295: astore          14
        //   297: aload           14
        //   299: athrow         
        //   300: astore          13
        //   302: aload           13
        //   304: athrow         
        //   305: astore          11
        //   307: aload           11
        //   309: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  28     86     280    285    Ljava/lang/IllegalArgumentException;
        //  123    135    285    290    Ljava/lang/IllegalArgumentException;
        //  140    158    290    295    Ljava/lang/IllegalArgumentException;
        //  162    177    290    295    Ljava/lang/IllegalArgumentException;
        //  198    203    295    300    Ljava/lang/IllegalArgumentException;
        //  208    227    300    305    Ljava/lang/IllegalArgumentException;
        //  231    246    300    305    Ljava/lang/IllegalArgumentException;
        //  250    268    305    310    Ljava/lang/IllegalArgumentException;
        //  287    290    290    295    Ljava/lang/IllegalArgumentException;
        //  297    300    300    305    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 147, Size: 147
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private String a(final Class clazz, final int n) {
        try {
            return App.aq.getString((int)clazz.getMethod(ViewSharedContactActivity.z[15], Integer.TYPE).invoke(null, n));
        }
        catch (Exception ex) {
            Log.b(ex);
            return null;
        }
    }
    
    private o a(final String s) {
        try {
            return o.h(s);
        }
        catch (UnsupportedEncodingException ex) {
            Log.c(ex);
        }
        catch (IOException ex2) {
            Log.b(ex2);
            goto Label_0016;
        }
        catch (a a) {
            Log.c(a);
            goto Label_0016;
        }
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: iconst_0       
        //     5: istore_2       
        //     6: iload_2        
        //     7: aload_0        
        //     8: getfield        com/whatsapp/ViewSharedContactActivity.r:Landroid/widget/LinearLayout;
        //    11: invokevirtual   android/widget/LinearLayout.getChildCount:()I
        //    14: if_icmpge       373
        //    17: aload_0        
        //    18: getfield        com/whatsapp/ViewSharedContactActivity.r:Landroid/widget/LinearLayout;
        //    21: iload_2        
        //    22: invokevirtual   android/widget/LinearLayout.getChildAt:(I)Landroid/view/View;
        //    25: astore          6
        //    27: aload           6
        //    29: ldc             2131755807
        //    31: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    34: checkcast       Landroid/widget/CheckBox;
        //    37: astore          7
        //    39: aload           7
        //    41: invokevirtual   android/widget/CheckBox.isChecked:()Z
        //    44: ifne            364
        //    47: new             Ljava/lang/StringBuilder;
        //    50: dup            
        //    51: invokespecial   java/lang/StringBuilder.<init>:()V
        //    54: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    57: bipush          6
        //    59: aaload         
        //    60: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    63: iload_2        
        //    64: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    67: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    70: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    73: aload           6
        //    75: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //    78: instanceof      Lq;
        //    81: istore          10
        //    83: iload           10
        //    85: ifeq            171
        //    88: aload           6
        //    90: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //    93: checkcast       Lq;
        //    96: astore          23
        //    98: aload_0        
        //    99: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   102: getfield        o.h:Ljava/util/Map;
        //   105: aload           23
        //   107: getfield        q.d:Ljava/lang/String;
        //   110: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   115: checkcast       Ljava/util/List;
        //   118: astore          24
        //   120: aload           24
        //   122: ifnull          167
        //   125: aload           24
        //   127: aload           23
        //   129: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   134: pop            
        //   135: aload           24
        //   137: invokeinterface java/util/List.isEmpty:()Z
        //   142: istore          28
        //   144: iload           28
        //   146: ifeq            167
        //   149: aload_0        
        //   150: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   153: getfield        o.h:Ljava/util/Map;
        //   156: aload           23
        //   158: getfield        q.d:Ljava/lang/String;
        //   161: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   166: pop            
        //   167: iload_1        
        //   168: ifeq            364
        //   171: aload           6
        //   173: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   176: instanceof      Lm;
        //   179: istore          12
        //   181: iload           12
        //   183: ifeq            302
        //   186: aload           6
        //   188: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   191: checkcast       Lm;
        //   194: astore          17
        //   196: aload_0        
        //   197: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   200: getfield        o.d:Ljava/util/List;
        //   203: aload           17
        //   205: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   210: pop            
        //   211: aload           17
        //   213: getfield        m.b:Ljava/lang/Class;
        //   216: ldc_w           Landroid/provider/ContactsContract$CommonDataKinds$Email;.class
        //   219: if_acmpne       255
        //   222: new             Ljava/lang/StringBuilder;
        //   225: dup            
        //   226: invokespecial   java/lang/StringBuilder.<init>:()V
        //   229: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   232: iconst_3       
        //   233: aaload         
        //   234: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   237: aload           6
        //   239: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   242: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   245: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   248: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   251: iload_1        
        //   252: ifeq            298
        //   255: aload           17
        //   257: getfield        m.b:Ljava/lang/Class;
        //   260: astore          22
        //   262: aload           22
        //   264: ldc             Landroid/provider/ContactsContract$CommonDataKinds$StructuredPostal;.class
        //   266: if_acmpne       298
        //   269: new             Ljava/lang/StringBuilder;
        //   272: dup            
        //   273: invokespecial   java/lang/StringBuilder.<init>:()V
        //   276: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   279: iconst_5       
        //   280: aaload         
        //   281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   284: aload           6
        //   286: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   289: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   292: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   295: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   298: iload_1        
        //   299: ifeq            364
        //   302: aload           6
        //   304: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   307: instanceof      Ld;
        //   310: istore          15
        //   312: iload           15
        //   314: ifeq            364
        //   317: aload_0        
        //   318: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   321: getfield        o.e:Ljava/util/List;
        //   324: aload           6
        //   326: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   329: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   334: pop            
        //   335: new             Ljava/lang/StringBuilder;
        //   338: dup            
        //   339: invokespecial   java/lang/StringBuilder.<init>:()V
        //   342: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   345: iconst_4       
        //   346: aaload         
        //   347: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   350: aload           6
        //   352: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   355: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   358: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   361: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   364: iload_2        
        //   365: iconst_1       
        //   366: iadd           
        //   367: istore          9
        //   369: iload_1        
        //   370: ifeq            482
        //   373: new             Li;
        //   376: dup            
        //   377: invokespecial   i.<init>:()V
        //   380: astore_3       
        //   381: aload_3        
        //   382: aload_0        
        //   383: aload_0        
        //   384: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   387: iconst_2       
        //   388: invokevirtual   i.a:(Landroid/content/Context;Lo;I)Ljava/lang/String;
        //   391: astore          5
        //   393: aload_0        
        //   394: getfield        com/whatsapp/ViewSharedContactActivity.m:Ljava/lang/String;
        //   397: aload_0        
        //   398: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   401: getfield        o.f:Lk;
        //   404: getfield        k.e:Ljava/lang/String;
        //   407: aload           5
        //   409: invokestatic    com/whatsapp/App.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   412: aload_0        
        //   413: iconst_m1      
        //   414: invokevirtual   com/whatsapp/ViewSharedContactActivity.setResult:(I)V
        //   417: aload_0        
        //   418: invokevirtual   com/whatsapp/ViewSharedContactActivity.finish:()V
        //   421: return         
        //   422: astore          8
        //   424: aload           8
        //   426: athrow         
        //   427: astore          25
        //   429: aload           25
        //   431: athrow         
        //   432: astore          26
        //   434: aload           26
        //   436: athrow         
        //   437: astore          11
        //   439: aload           11
        //   441: athrow         
        //   442: astore          18
        //   444: aload           18
        //   446: athrow         
        //   447: astore          19
        //   449: aload           19
        //   451: athrow         
        //   452: astore          20
        //   454: aload           20
        //   456: athrow         
        //   457: astore          13
        //   459: aload           13
        //   461: athrow         
        //   462: astore          14
        //   464: aload           14
        //   466: athrow         
        //   467: astore          4
        //   469: aload           4
        //   471: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   474: aload_0        
        //   475: ldc_w           2131231376
        //   478: invokevirtual   com/whatsapp/ViewSharedContactActivity.a:(I)V
        //   481: return         
        //   482: iload           9
        //   484: istore_2       
        //   485: goto            6
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  39     83     422    427    La;
        //  125    144    427    432    La;
        //  149    167    432    437    La;
        //  171    181    437    442    La;
        //  196    251    442    447    La;
        //  255    262    447    452    La;
        //  269    298    452    457    La;
        //  302    312    457    462    La;
        //  317    364    462    467    La;
        //  381    421    467    482    La;
        //  429    432    432    437    La;
        //  444    447    447    452    La;
        //  449    452    452    457    La;
        //  459    462    462    467    La;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 218, Size: 218
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void a(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ldc             2131755807
        //     3: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //     6: checkcast       Landroid/widget/CheckBox;
        //     9: astore_2       
        //    10: aload_2        
        //    11: invokevirtual   android/widget/CheckBox.isChecked:()Z
        //    14: istore          5
        //    16: iload           5
        //    18: ifeq            32
        //    21: aload_2        
        //    22: iconst_0       
        //    23: invokevirtual   android/widget/CheckBox.setChecked:(Z)V
        //    26: getstatic       com/whatsapp/App.I:Z
        //    29: ifeq            46
        //    32: aload_2        
        //    33: iconst_1       
        //    34: invokevirtual   android/widget/CheckBox.setChecked:(Z)V
        //    37: return         
        //    38: astore_3       
        //    39: aload_3        
        //    40: athrow         
        //    41: astore          4
        //    43: aload           4
        //    45: athrow         
        //    46: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  10     16     38     41     Ljava/lang/IllegalArgumentException;
        //  21     32     41     46     Ljava/lang/IllegalArgumentException;
        //  32     37     41     46     Ljava/lang/IllegalArgumentException;
        //  39     41     41     46     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static void a(final ViewSharedContactActivity viewSharedContactActivity) {
        viewSharedContactActivity.e();
    }
    
    static void a(final ViewSharedContactActivity viewSharedContactActivity, final View view) {
        viewSharedContactActivity.a(view);
    }
    
    private void a(final String p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: ldc_w           2131755405
        //     4: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //     7: checkcast       Landroid/widget/TextView;
        //    10: aload_1        
        //    11: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    14: aload_0        
        //    15: ldc_w           2131755471
        //    18: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //    21: checkcast       Landroid/widget/TextView;
        //    24: astore          4
        //    26: aload_2        
        //    27: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    30: istore          7
        //    32: iload           7
        //    34: ifeq            50
        //    37: aload           4
        //    39: bipush          8
        //    41: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    44: getstatic       com/whatsapp/App.I:Z
        //    47: ifeq            73
        //    50: aload           4
        //    52: aload_2        
        //    53: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    56: aload           4
        //    58: iconst_0       
        //    59: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    62: return         
        //    63: astore          5
        //    65: aload           5
        //    67: athrow         
        //    68: astore          6
        //    70: aload           6
        //    72: athrow         
        //    73: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  26     32     63     68     Ljava/lang/IllegalArgumentException;
        //  37     50     68     73     Ljava/lang/IllegalArgumentException;
        //  50     62     68     73     Ljava/lang/IllegalArgumentException;
        //  65     68     68     73     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static void b(final ViewSharedContactActivity viewSharedContactActivity) {
        viewSharedContactActivity.a();
    }
    
    static boolean c(final ViewSharedContactActivity viewSharedContactActivity) {
        return viewSharedContactActivity.l;
    }
    
    private void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ViewSharedContactActivity.p:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            45
        //     9: iconst_1       
        //    10: anewarray       Ljava/lang/Object;
        //    13: astore          4
        //    15: aload           4
        //    17: iconst_0       
        //    18: aload_0        
        //    19: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //    22: invokevirtual   o.a:()Ljava/lang/String;
        //    25: aastore        
        //    26: aload_0        
        //    27: aload_0        
        //    28: ldc_w           2131230926
        //    31: aload           4
        //    33: invokevirtual   com/whatsapp/ViewSharedContactActivity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    36: invokevirtual   com/whatsapp/ViewSharedContactActivity.f:(Ljava/lang/String;)V
        //    39: getstatic       com/whatsapp/App.I:Z
        //    42: ifeq            61
        //    45: aload_0        
        //    46: invokevirtual   com/whatsapp/ViewSharedContactActivity.b:()V
        //    49: aload_0        
        //    50: iconst_1       
        //    51: putfield        com/whatsapp/ViewSharedContactActivity.p:Z
        //    54: return         
        //    55: astore_1       
        //    56: aload_1        
        //    57: athrow         
        //    58: astore_2       
        //    59: aload_2        
        //    60: athrow         
        //    61: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      55     58     Ljava/lang/IllegalArgumentException;
        //  9      45     58     61     Ljava/lang/IllegalArgumentException;
        //  45     54     58     61     Ljava/lang/IllegalArgumentException;
        //  56     58     58     61     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: new             Ljava/util/ArrayList;
        //     7: dup            
        //     8: invokespecial   java/util/ArrayList.<init>:()V
        //    11: astore_2       
        //    12: getstatic       android/provider/ContactsContract$RawContacts.CONTENT_URI:Landroid/net/Uri;
        //    15: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //    18: astore_3       
        //    19: aload_3        
        //    20: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    23: bipush          68
        //    25: aaload         
        //    26: aconst_null    
        //    27: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //    30: pop            
        //    31: aload_3        
        //    32: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    35: bipush          25
        //    37: aaload         
        //    38: aconst_null    
        //    39: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //    42: pop            
        //    43: aload_2        
        //    44: aload_3        
        //    45: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //    48: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    51: pop            
        //    52: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //    55: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //    58: astore          7
        //    60: aload           7
        //    62: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    65: bipush          44
        //    67: aaload         
        //    68: iconst_0       
        //    69: invokevirtual   android/content/ContentProviderOperation$Builder.withValueBackReference:(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;
        //    72: pop            
        //    73: aload           7
        //    75: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    78: bipush          33
        //    80: aaload         
        //    81: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    84: bipush          29
        //    86: aaload         
        //    87: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //    90: pop            
        //    91: aload           7
        //    93: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    96: bipush          42
        //    98: aaload         
        //    99: aload_0        
        //   100: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   103: getfield        o.f:Lk;
        //   106: getfield        k.e:Ljava/lang/String;
        //   109: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   112: pop            
        //   113: aload           7
        //   115: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   118: bipush          58
        //   120: aaload         
        //   121: aload_0        
        //   122: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   125: getfield        o.f:Lk;
        //   128: getfield        k.h:Ljava/lang/String;
        //   131: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   134: pop            
        //   135: aload           7
        //   137: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   140: bipush          83
        //   142: aaload         
        //   143: aload_0        
        //   144: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   147: getfield        o.f:Lk;
        //   150: getfield        k.d:Ljava/lang/String;
        //   153: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   156: pop            
        //   157: aload           7
        //   159: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   162: bipush          62
        //   164: aaload         
        //   165: aload_0        
        //   166: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   169: getfield        o.f:Lk;
        //   172: getfield        k.b:Ljava/lang/String;
        //   175: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   178: pop            
        //   179: aload           7
        //   181: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   184: bipush          43
        //   186: aaload         
        //   187: aload_0        
        //   188: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   191: getfield        o.f:Lk;
        //   194: getfield        k.g:Ljava/lang/String;
        //   197: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   200: pop            
        //   201: aload           7
        //   203: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   206: bipush          47
        //   208: aaload         
        //   209: aload_0        
        //   210: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   213: getfield        o.f:Lk;
        //   216: getfield        k.c:Ljava/lang/String;
        //   219: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   222: pop            
        //   223: aload           7
        //   225: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   228: bipush          38
        //   230: aaload         
        //   231: aload_0        
        //   232: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   235: getfield        o.f:Lk;
        //   238: getfield        k.f:Ljava/lang/String;
        //   241: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   244: pop            
        //   245: aload           7
        //   247: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   250: bipush          71
        //   252: aaload         
        //   253: aload_0        
        //   254: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   257: getfield        o.f:Lk;
        //   260: getfield        k.a:Ljava/lang/String;
        //   263: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   266: pop            
        //   267: aload_2        
        //   268: aload           7
        //   270: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //   273: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   276: pop            
        //   277: aload_0        
        //   278: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   281: getfield        o.e:Ljava/util/List;
        //   284: ifnull          438
        //   287: aload_0        
        //   288: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   291: getfield        o.e:Ljava/util/List;
        //   294: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   299: astore          100
        //   301: aload           100
        //   303: invokeinterface java/util/Iterator.hasNext:()Z
        //   308: ifeq            438
        //   311: aload           100
        //   313: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   318: checkcast       Ld;
        //   321: astore          101
        //   323: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //   326: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //   329: astore          102
        //   331: aload           102
        //   333: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   336: bipush          40
        //   338: aaload         
        //   339: iconst_0       
        //   340: invokevirtual   android/content/ContentProviderOperation$Builder.withValueBackReference:(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;
        //   343: pop            
        //   344: aload           102
        //   346: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   349: bipush          78
        //   351: aaload         
        //   352: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   355: bipush          21
        //   357: aaload         
        //   358: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   361: pop            
        //   362: aload           102
        //   364: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   367: bipush          55
        //   369: aaload         
        //   370: aload           101
        //   372: getfield        d.d:Ljava/lang/String;
        //   375: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   378: pop            
        //   379: aload           102
        //   381: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   384: bipush          74
        //   386: aaload         
        //   387: aload           101
        //   389: getfield        d.b:I
        //   392: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   395: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   398: pop            
        //   399: aload           101
        //   401: getfield        d.b:I
        //   404: ifne            424
        //   407: aload           102
        //   409: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   412: bipush          30
        //   414: aaload         
        //   415: aload           101
        //   417: getfield        d.c:Ljava/lang/String;
        //   420: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   423: pop            
        //   424: aload_2        
        //   425: aload           102
        //   427: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //   430: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   433: pop            
        //   434: iload_1        
        //   435: ifeq            301
        //   438: aload_0        
        //   439: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   442: getfield        o.d:Ljava/util/List;
        //   445: ifnull          905
        //   448: aload_0        
        //   449: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   452: getfield        o.d:Ljava/util/List;
        //   455: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   460: astore          72
        //   462: aload           72
        //   464: invokeinterface java/util/Iterator.hasNext:()Z
        //   469: ifeq            905
        //   472: aload           72
        //   474: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   479: checkcast       Lm;
        //   482: astore          73
        //   484: aload           73
        //   486: getfield        m.b:Ljava/lang/Class;
        //   489: ldc_w           Landroid/provider/ContactsContract$CommonDataKinds$Email;.class
        //   492: if_acmpne       610
        //   495: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //   498: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //   501: astore          92
        //   503: aload           92
        //   505: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   508: bipush          86
        //   510: aaload         
        //   511: iconst_0       
        //   512: invokevirtual   android/content/ContentProviderOperation$Builder.withValueBackReference:(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;
        //   515: pop            
        //   516: aload           92
        //   518: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   521: bipush          73
        //   523: aaload         
        //   524: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   527: bipush          82
        //   529: aaload         
        //   530: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   533: pop            
        //   534: aload           92
        //   536: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   539: bipush          28
        //   541: aaload         
        //   542: aload           73
        //   544: getfield        m.e:Ljava/lang/String;
        //   547: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   550: pop            
        //   551: aload           92
        //   553: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   556: bipush          84
        //   558: aaload         
        //   559: aload           73
        //   561: getfield        m.f:I
        //   564: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   567: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   570: pop            
        //   571: aload           73
        //   573: getfield        m.f:I
        //   576: ifne            596
        //   579: aload           92
        //   581: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   584: bipush          53
        //   586: aaload         
        //   587: aload           73
        //   589: getfield        m.c:Ljava/lang/String;
        //   592: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   595: pop            
        //   596: aload_2        
        //   597: aload           92
        //   599: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //   602: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   605: pop            
        //   606: iload_1        
        //   607: ifeq            901
        //   610: aload           73
        //   612: getfield        m.b:Ljava/lang/Class;
        //   615: astore          75
        //   617: aload           75
        //   619: ldc             Landroid/provider/ContactsContract$CommonDataKinds$StructuredPostal;.class
        //   621: if_acmpne       822
        //   624: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //   627: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //   630: astore          80
        //   632: aload           80
        //   634: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   637: bipush          75
        //   639: aaload         
        //   640: iconst_0       
        //   641: invokevirtual   android/content/ContentProviderOperation$Builder.withValueBackReference:(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;
        //   644: pop            
        //   645: aload           80
        //   647: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   650: bipush          19
        //   652: aaload         
        //   653: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   656: bipush          23
        //   658: aaload         
        //   659: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   662: pop            
        //   663: aload           80
        //   665: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   668: bipush          37
        //   670: aaload         
        //   671: aload           73
        //   673: getfield        m.a:Ll;
        //   676: invokevirtual   l.c:()Ljava/lang/String;
        //   679: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   682: pop            
        //   683: aload           80
        //   685: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   688: bipush          26
        //   690: aaload         
        //   691: aload           73
        //   693: getfield        m.a:Ll;
        //   696: getfield        l.f:Ljava/lang/String;
        //   699: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   702: pop            
        //   703: aload           80
        //   705: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   708: bipush          17
        //   710: aaload         
        //   711: aload           73
        //   713: getfield        m.a:Ll;
        //   716: getfield        l.d:Ljava/lang/String;
        //   719: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   722: pop            
        //   723: aload           80
        //   725: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   728: bipush          48
        //   730: aaload         
        //   731: aload           73
        //   733: getfield        m.a:Ll;
        //   736: getfield        l.e:Ljava/lang/String;
        //   739: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   742: pop            
        //   743: aload           80
        //   745: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   748: bipush          87
        //   750: aaload         
        //   751: aload           73
        //   753: getfield        m.a:Ll;
        //   756: getfield        l.b:Ljava/lang/String;
        //   759: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   762: pop            
        //   763: aload           80
        //   765: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   768: bipush          65
        //   770: aaload         
        //   771: aload           73
        //   773: getfield        m.f:I
        //   776: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   779: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   782: pop            
        //   783: aload           73
        //   785: getfield        m.f:I
        //   788: ifne            808
        //   791: aload           80
        //   793: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   796: bipush          41
        //   798: aaload         
        //   799: aload           73
        //   801: getfield        m.c:Ljava/lang/String;
        //   804: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   807: pop            
        //   808: aload_2        
        //   809: aload           80
        //   811: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //   814: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   817: pop            
        //   818: iload_1        
        //   819: ifeq            901
        //   822: aload           73
        //   824: getfield        m.b:Ljava/lang/Class;
        //   827: astore          79
        //   829: aload           79
        //   831: ldc_w           Landroid/provider/ContactsContract$CommonDataKinds$Im;.class
        //   834: if_acmpne       871
        //   837: new             Ljava/lang/StringBuilder;
        //   840: dup            
        //   841: invokespecial   java/lang/StringBuilder.<init>:()V
        //   844: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   847: bipush          18
        //   849: aaload         
        //   850: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   853: aload           73
        //   855: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   858: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   861: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   864: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   867: iload_1        
        //   868: ifeq            901
        //   871: new             Ljava/lang/StringBuilder;
        //   874: dup            
        //   875: invokespecial   java/lang/StringBuilder.<init>:()V
        //   878: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   881: bipush          54
        //   883: aaload         
        //   884: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   887: aload           73
        //   889: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   892: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   895: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   898: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   901: iload_1        
        //   902: ifeq            462
        //   905: aload_0        
        //   906: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   909: getfield        o.j:Ljava/util/List;
        //   912: ifnull          1096
        //   915: aload_0        
        //   916: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   919: getfield        o.j:Ljava/util/List;
        //   922: invokeinterface java/util/List.size:()I
        //   927: istore          58
        //   929: iload           58
        //   931: ifle            1096
        //   934: aload_0        
        //   935: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   938: getfield        o.j:Ljava/util/List;
        //   941: iconst_0       
        //   942: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   947: checkcast       Ln;
        //   950: astore          59
        //   952: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //   955: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //   958: astore          60
        //   960: aload           60
        //   962: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   965: bipush          16
        //   967: aaload         
        //   968: iconst_0       
        //   969: invokevirtual   android/content/ContentProviderOperation$Builder.withValueBackReference:(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;
        //   972: pop            
        //   973: aload           60
        //   975: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   978: bipush          57
        //   980: aaload         
        //   981: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   984: bipush          51
        //   986: aaload         
        //   987: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //   990: pop            
        //   991: aload           59
        //   993: getfield        n.c:Ljava/lang/String;
        //   996: ldc_w           " "
        //   999: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //  1002: istore          63
        //  1004: iload           63
        //  1006: ifle            2133
        //  1009: aload           59
        //  1011: getfield        n.c:Ljava/lang/String;
        //  1014: iconst_0       
        //  1015: iload           63
        //  1017: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1020: astore          71
        //  1022: aload           71
        //  1024: astore          64
        //  1026: aload           60
        //  1028: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1031: bipush          70
        //  1033: aaload         
        //  1034: aload           64
        //  1036: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1039: pop            
        //  1040: iload           63
        //  1042: ifle            1069
        //  1045: aload           60
        //  1047: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1050: bipush          80
        //  1052: aaload         
        //  1053: aload           59
        //  1055: getfield        n.c:Ljava/lang/String;
        //  1058: iload           63
        //  1060: iconst_1       
        //  1061: iadd           
        //  1062: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1065: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1068: pop            
        //  1069: aload           60
        //  1071: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1074: bipush          20
        //  1076: aaload         
        //  1077: aload           59
        //  1079: getfield        n.d:Ljava/lang/String;
        //  1082: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1085: pop            
        //  1086: aload_2        
        //  1087: aload           60
        //  1089: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //  1092: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1095: pop            
        //  1096: aload_0        
        //  1097: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //  1100: getfield        o.h:Ljava/util/Map;
        //  1103: ifnull          1532
        //  1106: aload_0        
        //  1107: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //  1110: getfield        o.h:Ljava/util/Map;
        //  1113: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  1118: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  1123: astore          47
        //  1125: aload           47
        //  1127: invokeinterface java/util/Iterator.hasNext:()Z
        //  1132: ifeq            1532
        //  1135: aload           47
        //  1137: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1142: checkcast       Ljava/lang/String;
        //  1145: astore          48
        //  1147: aload           48
        //  1149: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1152: bipush          45
        //  1154: aaload         
        //  1155: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1158: ifeq            1238
        //  1161: aload_2        
        //  1162: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //  1165: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //  1168: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1171: bipush          63
        //  1173: aaload         
        //  1174: iconst_0       
        //  1175: invokevirtual   android/content/ContentProviderOperation$Builder.withValueBackReference:(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;
        //  1178: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1181: bipush          35
        //  1183: aaload         
        //  1184: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1187: bipush          77
        //  1189: aaload         
        //  1190: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1193: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1196: bipush          66
        //  1198: aaload         
        //  1199: aload_0        
        //  1200: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //  1203: getfield        o.h:Ljava/util/Map;
        //  1206: aload           48
        //  1208: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1213: checkcast       Ljava/util/List;
        //  1216: iconst_0       
        //  1217: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1222: checkcast       Lq;
        //  1225: getfield        q.f:Ljava/lang/String;
        //  1228: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1231: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //  1234: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1237: pop            
        //  1238: aload           48
        //  1240: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1243: bipush          49
        //  1245: aaload         
        //  1246: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1249: ifeq            1342
        //  1252: aload_2        
        //  1253: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //  1256: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //  1259: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1262: bipush          79
        //  1264: aaload         
        //  1265: iconst_0       
        //  1266: invokevirtual   android/content/ContentProviderOperation$Builder.withValueBackReference:(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;
        //  1269: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1272: bipush          36
        //  1274: aaload         
        //  1275: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1278: bipush          31
        //  1280: aaload         
        //  1281: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1284: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1287: bipush          32
        //  1289: aaload         
        //  1290: iconst_3       
        //  1291: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1294: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1297: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1300: bipush          85
        //  1302: aaload         
        //  1303: aload_0        
        //  1304: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //  1307: getfield        o.h:Ljava/util/Map;
        //  1310: aload           48
        //  1312: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1317: checkcast       Ljava/util/List;
        //  1320: iconst_0       
        //  1321: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1326: checkcast       Lq;
        //  1329: getfield        q.f:Ljava/lang/String;
        //  1332: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1335: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //  1338: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1341: pop            
        //  1342: getstatic       o.a:Ljava/util/HashMap;
        //  1345: aload           48
        //  1347: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //  1350: ifeq            1528
        //  1353: aload_0        
        //  1354: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //  1357: getfield        o.h:Ljava/util/Map;
        //  1360: aload           48
        //  1362: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1367: checkcast       Ljava/util/List;
        //  1370: iconst_0       
        //  1371: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1376: checkcast       Lq;
        //  1379: astore          49
        //  1381: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //  1384: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //  1387: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1390: bipush          24
        //  1392: aaload         
        //  1393: iconst_0       
        //  1394: invokevirtual   android/content/ContentProviderOperation$Builder.withValueBackReference:(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;
        //  1397: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1400: bipush          39
        //  1402: aaload         
        //  1403: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1406: bipush          76
        //  1408: aaload         
        //  1409: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1412: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1415: bipush          56
        //  1417: aaload         
        //  1418: getstatic       o.a:Ljava/util/HashMap;
        //  1421: aload           48
        //  1423: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1426: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1429: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1432: bipush          46
        //  1434: aaload         
        //  1435: aload_0        
        //  1436: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //  1439: getfield        o.h:Ljava/util/Map;
        //  1442: aload           48
        //  1444: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1449: checkcast       Ljava/util/List;
        //  1452: iconst_0       
        //  1453: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1458: checkcast       Lq;
        //  1461: getfield        q.f:Ljava/lang/String;
        //  1464: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1467: astore          50
        //  1469: aload           49
        //  1471: getfield        q.b:Ljava/util/Set;
        //  1474: ifnull          1518
        //  1477: aload           49
        //  1479: getfield        q.b:Ljava/util/Set;
        //  1482: invokeinterface java/util/Set.size:()I
        //  1487: istore          54
        //  1489: iload           54
        //  1491: ifle            1518
        //  1494: aload           50
        //  1496: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1499: bipush          64
        //  1501: aaload         
        //  1502: aload           49
        //  1504: getfield        q.b:Ljava/util/Set;
        //  1507: invokeinterface java/util/Set.toArray:()[Ljava/lang/Object;
        //  1512: iconst_0       
        //  1513: aaload         
        //  1514: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1517: pop            
        //  1518: aload_2        
        //  1519: aload           50
        //  1521: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //  1524: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1527: pop            
        //  1528: iload_1        
        //  1529: ifeq            1125
        //  1532: aload_0        
        //  1533: getfield        com/whatsapp/ViewSharedContactActivity.k:Landroid/graphics/Bitmap;
        //  1536: ifnull          1625
        //  1539: new             Ljava/io/ByteArrayOutputStream;
        //  1542: dup            
        //  1543: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //  1546: astore          20
        //  1548: aload_0        
        //  1549: getfield        com/whatsapp/ViewSharedContactActivity.k:Landroid/graphics/Bitmap;
        //  1552: getstatic       android/graphics/Bitmap$CompressFormat.PNG:Landroid/graphics/Bitmap$CompressFormat;
        //  1555: bipush          100
        //  1557: aload           20
        //  1559: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //  1562: pop            
        //  1563: aload           20
        //  1565: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //  1568: astore          22
        //  1570: aload_2        
        //  1571: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //  1574: invokestatic    android/content/ContentProviderOperation.newInsert:(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;
        //  1577: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1580: bipush          67
        //  1582: aaload         
        //  1583: iconst_0       
        //  1584: invokevirtual   android/content/ContentProviderOperation$Builder.withValueBackReference:(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;
        //  1587: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1590: bipush          72
        //  1592: aaload         
        //  1593: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1596: bipush          59
        //  1598: aaload         
        //  1599: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1602: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1605: bipush          27
        //  1607: aaload         
        //  1608: aload           22
        //  1610: invokevirtual   android/content/ContentProviderOperation$Builder.withValue:(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
        //  1613: invokevirtual   android/content/ContentProviderOperation$Builder.build:()Landroid/content/ContentProviderOperation;
        //  1616: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1619: pop            
        //  1620: aload           20
        //  1622: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //  1625: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //  1628: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1631: bipush          60
        //  1633: aaload         
        //  1634: aload_2        
        //  1635: invokevirtual   android/content/ContentResolver.applyBatch:(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
        //  1638: iconst_0       
        //  1639: aaload         
        //  1640: getfield        android/content/ContentProviderResult.uri:Landroid/net/Uri;
        //  1643: invokevirtual   android/net/Uri.getLastPathSegment:()Ljava/lang/String;
        //  1646: astore          27
        //  1648: new             Ljava/lang/StringBuilder;
        //  1651: dup            
        //  1652: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1655: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1658: bipush          50
        //  1660: aaload         
        //  1661: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1664: aload_0        
        //  1665: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //  1668: getfield        o.f:Lk;
        //  1671: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1674: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1677: bipush          52
        //  1679: aaload         
        //  1680: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1683: aload           27
        //  1685: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1688: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1691: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1694: aload_0        
        //  1695: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //  1698: getfield        o.e:Ljava/util/List;
        //  1701: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1706: astore          28
        //  1708: iconst_0       
        //  1709: istore          29
        //  1711: aload           28
        //  1713: invokeinterface java/util/Iterator.hasNext:()Z
        //  1718: ifeq            2250
        //  1721: aload           28
        //  1723: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1728: checkcast       Ld;
        //  1731: astore          32
        //  1733: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //  1736: aload           32
        //  1738: getfield        d.d:Ljava/lang/String;
        //  1741: invokevirtual   com/whatsapp/wc.i:(Ljava/lang/String;)Ljava/util/ArrayList;
        //  1744: astore          33
        //  1746: aload           33
        //  1748: invokevirtual   java/util/ArrayList.size:()I
        //  1751: ifle            2025
        //  1754: aload           33
        //  1756: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1759: astore          34
        //  1761: iconst_0       
        //  1762: istore          35
        //  1764: aload           34
        //  1766: invokeinterface java/util/Iterator.hasNext:()Z
        //  1771: ifeq            2243
        //  1774: aload           34
        //  1776: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1781: checkcast       Lcom/whatsapp/a_9;
        //  1784: astore          39
        //  1786: aload           39
        //  1788: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1791: astore          40
        //  1793: aload           40
        //  1795: ifnull          1764
        //  1798: aload           39
        //  1800: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //  1803: astore          42
        //  1805: aload           42
        //  1807: ifnull          1814
        //  1810: iload_1        
        //  1811: ifeq            1764
        //  1814: aload           39
        //  1816: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1819: bipush          64
        //  1821: invokevirtual   java/lang/String.indexOf:(I)I
        //  1824: istore          43
        //  1826: iload           43
        //  1828: iconst_m1      
        //  1829: if_icmpne       1866
        //  1832: new             Ljava/lang/StringBuilder;
        //  1835: dup            
        //  1836: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1839: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1842: bipush          22
        //  1844: aaload         
        //  1845: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1848: aload           39
        //  1850: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1853: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1856: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1859: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1862: iload_1        
        //  1863: ifeq            1764
        //  1866: aload           39
        //  1868: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1871: iconst_0       
        //  1872: iload           43
        //  1874: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1877: astore          44
        //  1879: aload           32
        //  1881: getfield        d.d:Ljava/lang/String;
        //  1884: aload           44
        //  1886: invokestatic    android/telephony/PhoneNumberUtils.compare:(Ljava/lang/String;Ljava/lang/String;)Z
        //  1889: ifne            1926
        //  1892: new             Ljava/lang/StringBuilder;
        //  1895: dup            
        //  1896: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1899: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1902: bipush          34
        //  1904: aaload         
        //  1905: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1908: aload           39
        //  1910: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1913: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1916: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1919: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1922: iload_1        
        //  1923: ifeq            1764
        //  1926: new             Ljava/lang/StringBuilder;
        //  1929: dup            
        //  1930: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1933: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1936: bipush          61
        //  1938: aaload         
        //  1939: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1942: aload           39
        //  1944: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1947: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1950: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1953: aload           39
        //  1955: new             Lcom/whatsapp/xg;
        //  1958: dup            
        //  1959: aload           27
        //  1961: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1964: aload           32
        //  1966: getfield        d.d:Ljava/lang/String;
        //  1969: invokespecial   com/whatsapp/xg.<init>:(JLjava/lang/String;)V
        //  1972: putfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //  1975: aload           39
        //  1977: aload_0        
        //  1978: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //  1981: invokevirtual   o.a:()Ljava/lang/String;
        //  1984: putfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //  1987: aload           39
        //  1989: iconst_1       
        //  1990: putfield        com/whatsapp/a_9.b:Z
        //  1993: iload_1        
        //  1994: ifeq            2237
        //  1997: iconst_1       
        //  1998: istore          36
        //  2000: iload           36
        //  2002: ifeq            2021
        //  2005: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //  2008: aload           33
        //  2010: invokevirtual   com/whatsapp/wc.b:(Ljava/util/Collection;)V
        //  2013: getstatic       com/whatsapp/App.av:Landroid/os/Handler;
        //  2016: iconst_1       
        //  2017: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //  2020: pop            
        //  2021: iload_1        
        //  2022: ifeq            2230
        //  2025: iconst_1       
        //  2026: istore          30
        //  2028: iload_1        
        //  2029: ifeq            2223
        //  2032: iload           30
        //  2034: ifeq            2057
        //  2037: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  2040: bipush          69
        //  2042: aaload         
        //  2043: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  2046: new             Lcom/whatsapp/_k;
        //  2049: dup            
        //  2050: aload_0        
        //  2051: invokespecial   com/whatsapp/_k.<init>:(Lcom/whatsapp/ViewSharedContactActivity;)V
        //  2054: invokestatic    com/whatsapp/util/bm.a:(Ljava/lang/Runnable;)V
        //  2057: iconst_1       
        //  2058: anewarray       Ljava/lang/Object;
        //  2061: astore          26
        //  2063: aload           26
        //  2065: iconst_0       
        //  2066: aload_0        
        //  2067: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //  2070: invokevirtual   o.a:()Ljava/lang/String;
        //  2073: aastore        
        //  2074: aload_0        
        //  2075: aload_0        
        //  2076: ldc_w           2131230925
        //  2079: aload           26
        //  2081: invokevirtual   com/whatsapp/ViewSharedContactActivity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  2084: invokevirtual   com/whatsapp/ViewSharedContactActivity.f:(Ljava/lang/String;)V
        //  2087: return         
        //  2088: astore          103
        //  2090: aload           103
        //  2092: athrow         
        //  2093: astore          93
        //  2095: aload           93
        //  2097: athrow         
        //  2098: astore          74
        //  2100: aload           74
        //  2102: athrow         
        //  2103: astore          81
        //  2105: aload           81
        //  2107: athrow         
        //  2108: astore          76
        //  2110: aload           76
        //  2112: athrow         
        //  2113: astore          77
        //  2115: aload           77
        //  2117: athrow         
        //  2118: astore          78
        //  2120: aload           78
        //  2122: athrow         
        //  2123: astore          19
        //  2125: aload           19
        //  2127: athrow         
        //  2128: astore          70
        //  2130: aload           70
        //  2132: athrow         
        //  2133: aload           59
        //  2135: getfield        n.c:Ljava/lang/String;
        //  2138: astore          64
        //  2140: goto            1026
        //  2143: astore          65
        //  2145: aload           65
        //  2147: athrow         
        //  2148: astore          51
        //  2150: aload           51
        //  2152: athrow         
        //  2153: astore          52
        //  2155: aload           52
        //  2157: athrow         
        //  2158: astore          41
        //  2160: aload           41
        //  2162: athrow         
        //  2163: astore          25
        //  2165: new             Ljava/lang/StringBuilder;
        //  2168: dup            
        //  2169: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2172: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  2175: bipush          81
        //  2177: aaload         
        //  2178: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2181: aload           25
        //  2183: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //  2186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2189: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2192: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2195: goto            2057
        //  2198: astore          46
        //  2200: aload           46
        //  2202: athrow         
        //  2203: astore          45
        //  2205: aload           45
        //  2207: athrow         
        //  2208: astore          37
        //  2210: aload           37
        //  2212: athrow         
        //  2213: astore          31
        //  2215: aload           31
        //  2217: athrow         
        //  2218: astore          24
        //  2220: goto            1625
        //  2223: iload           30
        //  2225: istore          29
        //  2227: goto            1711
        //  2230: iload           29
        //  2232: istore          30
        //  2234: goto            2028
        //  2237: iconst_1       
        //  2238: istore          35
        //  2240: goto            1764
        //  2243: iload           35
        //  2245: istore          36
        //  2247: goto            2000
        //  2250: iload           29
        //  2252: istore          30
        //  2254: goto            2032
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  331    424    2088   2093   Ljava/io/IOException;
        //  503    596    2093   2098   Ljava/io/IOException;
        //  596    606    2098   2103   Ljava/io/IOException;
        //  610    617    2098   2103   Ljava/io/IOException;
        //  632    808    2103   2108   Ljava/io/IOException;
        //  808    818    2108   2113   Ljava/io/IOException;
        //  822    829    2108   2113   Ljava/io/IOException;
        //  837    867    2113   2118   Ljava/io/IOException;
        //  871    901    2118   2123   Ljava/io/IOException;
        //  905    929    2123   2128   Ljava/io/IOException;
        //  1009   1022   2128   2133   Ljava/io/IOException;
        //  1026   1040   2143   2148   Ljava/io/IOException;
        //  1045   1069   2143   2148   Ljava/io/IOException;
        //  1469   1489   2148   2153   Ljava/io/IOException;
        //  1494   1518   2153   2158   Ljava/io/IOException;
        //  1620   1625   2218   2223   Ljava/io/IOException;
        //  1625   1708   2163   2198   Ljava/lang/Exception;
        //  1711   1761   2163   2198   Ljava/lang/Exception;
        //  1764   1793   2163   2198   Ljava/lang/Exception;
        //  1798   1805   2158   2163   Ljava/io/IOException;
        //  1798   1805   2163   2198   Ljava/lang/Exception;
        //  1814   1826   2163   2198   Ljava/lang/Exception;
        //  1832   1862   2198   2203   Ljava/io/IOException;
        //  1832   1862   2163   2198   Ljava/lang/Exception;
        //  1866   1879   2163   2198   Ljava/lang/Exception;
        //  1879   1922   2203   2208   Ljava/io/IOException;
        //  1879   1922   2163   2198   Ljava/lang/Exception;
        //  1926   1993   2163   2198   Ljava/lang/Exception;
        //  2005   2021   2208   2213   Ljava/io/IOException;
        //  2005   2021   2163   2198   Ljava/lang/Exception;
        //  2037   2057   2213   2218   Ljava/io/IOException;
        //  2037   2057   2163   2198   Ljava/lang/Exception;
        //  2110   2113   2113   2118   Ljava/io/IOException;
        //  2115   2118   2118   2123   Ljava/io/IOException;
        //  2150   2153   2153   2158   Ljava/io/IOException;
        //  2160   2163   2163   2198   Ljava/lang/Exception;
        //  2200   2203   2163   2198   Ljava/lang/Exception;
        //  2205   2208   2163   2198   Ljava/lang/Exception;
        //  2210   2213   2163   2198   Ljava/lang/Exception;
        //  2215   2218   2163   2198   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 994, Size: 994
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void b(final int n) {
        switch (n) {
            default: {}
            case 2131231083: {
                try {
                    this.finish();
                    return;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                break;
            }
        }
    }
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   com/whatsapp/DialogToastActivity.onCreate:(Landroid/os/Bundle;)V
        //     9: aload_0        
        //    10: invokevirtual   com/whatsapp/ViewSharedContactActivity.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    13: iconst_1       
        //    14: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    17: aload_0        
        //    18: ldc_w           2130903232
        //    21: invokevirtual   com/whatsapp/ViewSharedContactActivity.setContentView:(I)V
        //    24: aload_0        
        //    25: aload_0        
        //    26: invokevirtual   com/whatsapp/ViewSharedContactActivity.getIntent:()Landroid/content/Intent;
        //    29: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    32: bipush          14
        //    34: aaload         
        //    35: iconst_0       
        //    36: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //    39: putfield        com/whatsapp/ViewSharedContactActivity.l:Z
        //    42: aload_0        
        //    43: aload_0        
        //    44: invokevirtual   com/whatsapp/ViewSharedContactActivity.getIntent:()Landroid/content/Intent;
        //    47: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    50: bipush          12
        //    52: aaload         
        //    53: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    56: putfield        com/whatsapp/ViewSharedContactActivity.n:Ljava/lang/String;
        //    59: aload_0        
        //    60: aload_0        
        //    61: invokevirtual   com/whatsapp/ViewSharedContactActivity.getIntent:()Landroid/content/Intent;
        //    64: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    67: bipush          8
        //    69: aaload         
        //    70: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    73: putfield        com/whatsapp/ViewSharedContactActivity.m:Ljava/lang/String;
        //    76: aload_0        
        //    77: aload_0        
        //    78: invokevirtual   com/whatsapp/ViewSharedContactActivity.getIntent:()Landroid/content/Intent;
        //    81: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //    84: bipush          13
        //    86: aaload         
        //    87: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    90: putfield        com/whatsapp/ViewSharedContactActivity.q:Ljava/lang/String;
        //    93: aload_0        
        //    94: getfield        com/whatsapp/ViewSharedContactActivity.n:Ljava/lang/String;
        //    97: ifnonnull       121
        //   100: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   103: bipush          7
        //   105: aaload         
        //   106: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   109: aload_0        
        //   110: ldc_w           2131231862
        //   113: iconst_0       
        //   114: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   117: return         
        //   118: astore_3       
        //   119: aload_3        
        //   120: athrow         
        //   121: aload_0        
        //   122: aload_0        
        //   123: ldc_w           2131755801
        //   126: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //   129: checkcast       Landroid/widget/LinearLayout;
        //   132: putfield        com/whatsapp/ViewSharedContactActivity.r:Landroid/widget/LinearLayout;
        //   135: aload_0        
        //   136: aload_0        
        //   137: aload_0        
        //   138: getfield        com/whatsapp/ViewSharedContactActivity.n:Ljava/lang/String;
        //   141: invokespecial   com/whatsapp/ViewSharedContactActivity.a:(Ljava/lang/String;)Lo;
        //   144: putfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   147: aload_0        
        //   148: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   151: ifnonnull       161
        //   154: aload_0        
        //   155: ldc_w           2131231083
        //   158: invokevirtual   com/whatsapp/ViewSharedContactActivity.a:(I)V
        //   161: aload_0        
        //   162: getfield        com/whatsapp/ViewSharedContactActivity.l:Z
        //   165: ifeq            234
        //   168: aload_0        
        //   169: ldc_w           2131755802
        //   172: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //   175: bipush          8
        //   177: invokevirtual   android/view/View.setVisibility:(I)V
        //   180: aload_0        
        //   181: ldc_w           2131755803
        //   184: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //   187: iconst_0       
        //   188: invokevirtual   android/view/View.setVisibility:(I)V
        //   191: aload_0        
        //   192: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   195: astore          39
        //   197: aload           39
        //   199: ifnull          220
        //   202: aload_0        
        //   203: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   206: aload_0        
        //   207: invokevirtual   com/whatsapp/ViewSharedContactActivity.getBaseContext:()Landroid/content/Context;
        //   210: aload_0        
        //   211: getfield        com/whatsapp/ViewSharedContactActivity.q:Ljava/lang/String;
        //   214: invokestatic    o.a:(Landroid/content/Context;Ljava/lang/String;)[B
        //   217: putfield        o.i:[B
        //   220: aload_0        
        //   221: invokevirtual   com/whatsapp/ViewSharedContactActivity.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   224: ldc_w           2131231633
        //   227: invokevirtual   android/support/v7/app/ActionBar.setTitle:(I)V
        //   230: iload_2        
        //   231: ifeq            267
        //   234: aload_0        
        //   235: ldc_w           2131755802
        //   238: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //   241: iconst_0       
        //   242: invokevirtual   android/view/View.setVisibility:(I)V
        //   245: aload_0        
        //   246: ldc_w           2131755803
        //   249: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //   252: bipush          8
        //   254: invokevirtual   android/view/View.setVisibility:(I)V
        //   257: aload_0        
        //   258: invokevirtual   com/whatsapp/ViewSharedContactActivity.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   261: ldc_w           2131231908
        //   264: invokevirtual   android/support/v7/app/ActionBar.setTitle:(I)V
        //   267: aload_0        
        //   268: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   271: astore          10
        //   273: aload           10
        //   275: ifnull          973
        //   278: aload_0        
        //   279: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   282: getfield        o.i:[B
        //   285: astore          12
        //   287: aload           12
        //   289: ifnull          370
        //   292: aload_0        
        //   293: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   296: getfield        o.i:[B
        //   299: arraylength    
        //   300: ifle            370
        //   303: aload_0        
        //   304: getfield        com/whatsapp/ViewSharedContactActivity.l:Z
        //   307: istore          37
        //   309: iload           37
        //   311: ifne            331
        //   314: aload_0        
        //   315: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   318: getfield        o.i:[B
        //   321: iconst_0       
        //   322: invokestatic    android/backport/util/Base64.decode:([BI)[B
        //   325: astore          38
        //   327: iload_2        
        //   328: ifeq            340
        //   331: aload_0        
        //   332: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   335: getfield        o.i:[B
        //   338: astore          38
        //   340: aload_0        
        //   341: aload           38
        //   343: iconst_0       
        //   344: aload           38
        //   346: arraylength    
        //   347: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BII)Landroid/graphics/Bitmap;
        //   350: putfield        com/whatsapp/ViewSharedContactActivity.k:Landroid/graphics/Bitmap;
        //   353: aload_0        
        //   354: ldc_w           2131755082
        //   357: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //   360: checkcast       Landroid/widget/ImageView;
        //   363: aload_0        
        //   364: getfield        com/whatsapp/ViewSharedContactActivity.k:Landroid/graphics/Bitmap;
        //   367: invokevirtual   android/widget/ImageView.setImageBitmap:(Landroid/graphics/Bitmap;)V
        //   370: aload_0        
        //   371: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   374: getfield        o.j:Ljava/util/List;
        //   377: ifnull          1149
        //   380: aload_0        
        //   381: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   384: getfield        o.j:Ljava/util/List;
        //   387: invokeinterface java/util/List.size:()I
        //   392: istore          36
        //   394: iload           36
        //   396: ifle            1149
        //   399: aload_0        
        //   400: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   403: getfield        o.j:Ljava/util/List;
        //   406: iconst_0       
        //   407: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   412: checkcast       Ln;
        //   415: getfield        n.c:Ljava/lang/String;
        //   418: astore          15
        //   420: aload_0        
        //   421: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   424: getfield        o.j:Ljava/util/List;
        //   427: iconst_0       
        //   428: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   433: checkcast       Ln;
        //   436: getfield        n.d:Ljava/lang/String;
        //   439: astore          14
        //   441: aload_0        
        //   442: aload_0        
        //   443: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   446: getfield        o.f:Lk;
        //   449: getfield        k.e:Ljava/lang/String;
        //   452: aload           15
        //   454: aload           14
        //   456: invokespecial   com/whatsapp/ViewSharedContactActivity.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   459: aload_0        
        //   460: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   463: getfield        o.e:Ljava/util/List;
        //   466: ifnull          574
        //   469: aload_0        
        //   470: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   473: getfield        o.e:Ljava/util/List;
        //   476: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   481: astore          31
        //   483: aload           31
        //   485: invokeinterface java/util/Iterator.hasNext:()Z
        //   490: ifeq            574
        //   493: aload           31
        //   495: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   500: checkcast       Ld;
        //   503: astore          32
        //   505: aload           32
        //   507: getfield        d.b:I
        //   510: ifne            1100
        //   513: aload           32
        //   515: getfield        d.c:Ljava/lang/String;
        //   518: astore          34
        //   520: aload_0        
        //   521: aload           34
        //   523: aload           32
        //   525: getfield        d.d:Ljava/lang/String;
        //   528: ldc_w           2130837748
        //   531: aload           32
        //   533: getfield        d.d:Ljava/lang/String;
        //   536: invokespecial   com/whatsapp/ViewSharedContactActivity.a:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/widget/RelativeLayout;
        //   539: astore          35
        //   541: aload           35
        //   543: new             Lcom/whatsapp/p;
        //   546: dup            
        //   547: aload_0        
        //   548: invokespecial   com/whatsapp/p.<init>:(Lcom/whatsapp/ViewSharedContactActivity;)V
        //   551: invokevirtual   android/widget/RelativeLayout.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   554: aload           35
        //   556: aload           32
        //   558: invokevirtual   android/widget/RelativeLayout.setTag:(Ljava/lang/Object;)V
        //   561: aload_0        
        //   562: getfield        com/whatsapp/ViewSharedContactActivity.r:Landroid/widget/LinearLayout;
        //   565: aload           35
        //   567: invokevirtual   android/widget/LinearLayout.addView:(Landroid/view/View;)V
        //   570: iload_2        
        //   571: ifeq            483
        //   574: aload_0        
        //   575: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   578: getfield        o.d:Ljava/util/List;
        //   581: ifnull          762
        //   584: aload_0        
        //   585: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   588: getfield        o.d:Ljava/util/List;
        //   591: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   596: astore          21
        //   598: aload           21
        //   600: invokeinterface java/util/Iterator.hasNext:()Z
        //   605: ifeq            762
        //   608: aload           21
        //   610: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   615: checkcast       Lm;
        //   618: astore          22
        //   620: aload           22
        //   622: getfield        m.b:Ljava/lang/Class;
        //   625: astore          25
        //   627: aload           25
        //   629: ldc_w           Landroid/provider/ContactsContract$CommonDataKinds$Email;.class
        //   632: if_acmpne       704
        //   635: aload           22
        //   637: getfield        m.f:I
        //   640: ifne            1127
        //   643: aload           22
        //   645: getfield        m.c:Ljava/lang/String;
        //   648: astore          29
        //   650: aload_0        
        //   651: aload           29
        //   653: aload           22
        //   655: getfield        m.e:Ljava/lang/String;
        //   658: ldc_w           2130837747
        //   661: aload           22
        //   663: getfield        m.e:Ljava/lang/String;
        //   666: invokespecial   com/whatsapp/ViewSharedContactActivity.a:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/widget/RelativeLayout;
        //   669: astore          30
        //   671: aload           30
        //   673: new             Lcom/whatsapp/ato;
        //   676: dup            
        //   677: aload_0        
        //   678: invokespecial   com/whatsapp/ato.<init>:(Lcom/whatsapp/ViewSharedContactActivity;)V
        //   681: invokevirtual   android/widget/RelativeLayout.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   684: aload           30
        //   686: aload           22
        //   688: invokevirtual   android/widget/RelativeLayout.setTag:(Ljava/lang/Object;)V
        //   691: aload_0        
        //   692: getfield        com/whatsapp/ViewSharedContactActivity.r:Landroid/widget/LinearLayout;
        //   695: aload           30
        //   697: invokevirtual   android/widget/LinearLayout.addView:(Landroid/view/View;)V
        //   700: iload_2        
        //   701: ifeq            758
        //   704: aload           22
        //   706: getfield        m.b:Ljava/lang/Class;
        //   709: astore          27
        //   711: aload           27
        //   713: ldc             Landroid/provider/ContactsContract$CommonDataKinds$StructuredPostal;.class
        //   715: if_acmpne       758
        //   718: aload_0        
        //   719: aload           22
        //   721: ldc_w           2130837746
        //   724: invokespecial   com/whatsapp/ViewSharedContactActivity.a:(Lm;I)Landroid/widget/RelativeLayout;
        //   727: astore          28
        //   729: aload           28
        //   731: new             Lcom/whatsapp/iv;
        //   734: dup            
        //   735: aload_0        
        //   736: invokespecial   com/whatsapp/iv.<init>:(Lcom/whatsapp/ViewSharedContactActivity;)V
        //   739: invokevirtual   android/widget/RelativeLayout.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   742: aload           28
        //   744: aload           22
        //   746: invokevirtual   android/widget/RelativeLayout.setTag:(Ljava/lang/Object;)V
        //   749: aload_0        
        //   750: getfield        com/whatsapp/ViewSharedContactActivity.r:Landroid/widget/LinearLayout;
        //   753: aload           28
        //   755: invokevirtual   android/widget/LinearLayout.addView:(Landroid/view/View;)V
        //   758: iload_2        
        //   759: ifeq            598
        //   762: aload_0        
        //   763: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   766: getfield        o.h:Ljava/util/Map;
        //   769: ifnull          936
        //   772: aload_0        
        //   773: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   776: getfield        o.h:Ljava/util/Map;
        //   779: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   784: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   789: astore          16
        //   791: aload           16
        //   793: invokeinterface java/util/Iterator.hasNext:()Z
        //   798: ifeq            936
        //   801: aload           16
        //   803: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   808: checkcast       Ljava/lang/String;
        //   811: astore          17
        //   813: aload_0        
        //   814: getfield        com/whatsapp/ViewSharedContactActivity.o:Lo;
        //   817: getfield        o.h:Ljava/util/Map;
        //   820: aload           17
        //   822: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   827: checkcast       Ljava/util/List;
        //   830: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   835: astore          18
        //   837: aload           18
        //   839: invokeinterface java/util/Iterator.hasNext:()Z
        //   844: ifeq            932
        //   847: aload           18
        //   849: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   854: checkcast       Lq;
        //   857: astore          19
        //   859: aload           19
        //   861: invokevirtual   q.toString:()Ljava/lang/String;
        //   864: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   867: aload           19
        //   869: getfield        q.d:Ljava/lang/String;
        //   872: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   875: bipush          10
        //   877: aaload         
        //   878: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   881: ifeq            911
        //   884: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //   887: bipush          9
        //   889: aaload         
        //   890: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   893: aload           19
        //   895: getfield        q.f:Ljava/lang/String;
        //   898: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   901: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   904: ifne            911
        //   907: iload_2        
        //   908: ifeq            837
        //   911: aload_0        
        //   912: aload           19
        //   914: invokespecial   com/whatsapp/ViewSharedContactActivity.a:(Lq;)Landroid/widget/RelativeLayout;
        //   917: astore          20
        //   919: aload_0        
        //   920: getfield        com/whatsapp/ViewSharedContactActivity.r:Landroid/widget/LinearLayout;
        //   923: aload           20
        //   925: invokevirtual   android/widget/LinearLayout.addView:(Landroid/view/View;)V
        //   928: iload_2        
        //   929: ifeq            837
        //   932: iload_2        
        //   933: ifeq            791
        //   936: aload_0        
        //   937: getfield        com/whatsapp/ViewSharedContactActivity.r:Landroid/widget/LinearLayout;
        //   940: invokevirtual   android/widget/LinearLayout.getChildCount:()I
        //   943: ifle            973
        //   946: aload_0        
        //   947: getfield        com/whatsapp/ViewSharedContactActivity.r:Landroid/widget/LinearLayout;
        //   950: iconst_m1      
        //   951: aload_0        
        //   952: getfield        com/whatsapp/ViewSharedContactActivity.r:Landroid/widget/LinearLayout;
        //   955: invokevirtual   android/widget/LinearLayout.getChildCount:()I
        //   958: iadd           
        //   959: invokevirtual   android/widget/LinearLayout.getChildAt:(I)Landroid/view/View;
        //   962: ldc_w           2131755309
        //   965: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   968: bipush          8
        //   970: invokevirtual   android/view/View.setVisibility:(I)V
        //   973: aload_0        
        //   974: ldc_w           2131755687
        //   977: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //   980: new             Lcom/whatsapp/k8;
        //   983: dup            
        //   984: aload_0        
        //   985: invokespecial   com/whatsapp/k8.<init>:(Lcom/whatsapp/ViewSharedContactActivity;)V
        //   988: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   991: aload_0        
        //   992: ldc_w           2131755546
        //   995: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //   998: checkcast       Landroid/widget/Button;
        //  1001: astore          11
        //  1003: aload           11
        //  1005: ldc_w           2131231632
        //  1008: invokevirtual   android/widget/Button.setText:(I)V
        //  1011: aload           11
        //  1013: new             Lcom/whatsapp/aq_;
        //  1016: dup            
        //  1017: aload_0        
        //  1018: invokespecial   com/whatsapp/aq_.<init>:(Lcom/whatsapp/ViewSharedContactActivity;)V
        //  1021: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1024: aload_0        
        //  1025: ldc_w           2131755547
        //  1028: invokevirtual   com/whatsapp/ViewSharedContactActivity.findViewById:(I)Landroid/view/View;
        //  1031: checkcast       Landroid/widget/Button;
        //  1034: new             Lcom/whatsapp/lf;
        //  1037: dup            
        //  1038: aload_0        
        //  1039: invokespecial   com/whatsapp/lf.<init>:(Lcom/whatsapp/ViewSharedContactActivity;)V
        //  1042: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1045: return         
        //  1046: astore          4
        //  1048: aload           4
        //  1050: athrow         
        //  1051: astore          5
        //  1053: aload           5
        //  1055: athrow         
        //  1056: astore          40
        //  1058: getstatic       com/whatsapp/ViewSharedContactActivity.z:[Ljava/lang/String;
        //  1061: bipush          11
        //  1063: aaload         
        //  1064: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1067: goto            220
        //  1070: astore          6
        //  1072: aload           6
        //  1074: athrow         
        //  1075: astore          7
        //  1077: aload           7
        //  1079: athrow         
        //  1080: astore          8
        //  1082: aload           8
        //  1084: athrow         
        //  1085: astore          9
        //  1087: aload           9
        //  1089: athrow         
        //  1090: astore          13
        //  1092: aload           13
        //  1094: athrow         
        //  1095: astore          33
        //  1097: aload           33
        //  1099: athrow         
        //  1100: aload_0        
        //  1101: ldc_w           Landroid/provider/ContactsContract$CommonDataKinds$Phone;.class
        //  1104: aload           32
        //  1106: getfield        d.b:I
        //  1109: invokespecial   com/whatsapp/ViewSharedContactActivity.a:(Ljava/lang/Class;I)Ljava/lang/String;
        //  1112: astore          34
        //  1114: goto            520
        //  1117: astore          23
        //  1119: aload           23
        //  1121: athrow         
        //  1122: astore          24
        //  1124: aload           24
        //  1126: athrow         
        //  1127: aload_0        
        //  1128: ldc_w           Landroid/provider/ContactsContract$CommonDataKinds$Email;.class
        //  1131: aload           22
        //  1133: getfield        m.f:I
        //  1136: invokespecial   com/whatsapp/ViewSharedContactActivity.a:(Ljava/lang/Class;I)Ljava/lang/String;
        //  1139: astore          29
        //  1141: goto            650
        //  1144: astore          26
        //  1146: aload           26
        //  1148: athrow         
        //  1149: aconst_null    
        //  1150: astore          14
        //  1152: aconst_null    
        //  1153: astore          15
        //  1155: goto            441
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      117    118    121    Ljava/lang/IllegalArgumentException;
        //  121    161    1046   1051   Ljava/lang/IllegalArgumentException;
        //  161    197    1051   1056   Ljava/lang/IllegalArgumentException;
        //  202    220    1056   1070   Ljava/lang/IllegalArgumentException;
        //  220    230    1070   1075   Ljava/lang/IllegalArgumentException;
        //  234    267    1070   1075   Ljava/lang/IllegalArgumentException;
        //  267    273    1075   1080   Ljava/lang/IllegalArgumentException;
        //  278    287    1080   1085   Ljava/lang/IllegalArgumentException;
        //  292    309    1085   1090   Ljava/lang/IllegalArgumentException;
        //  370    394    1090   1095   Ljava/lang/IllegalArgumentException;
        //  505    520    1095   1100   Ljava/lang/IllegalArgumentException;
        //  620    627    1117   1122   Ljava/lang/IllegalArgumentException;
        //  635    650    1122   1127   Ljava/lang/IllegalArgumentException;
        //  671    700    1144   1149   Ljava/lang/IllegalArgumentException;
        //  704    711    1144   1149   Ljava/lang/IllegalArgumentException;
        //  1077   1080   1080   1085   Ljava/lang/IllegalArgumentException;
        //  1082   1085   1085   1090   Ljava/lang/IllegalArgumentException;
        //  1119   1122   1122   1127   Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 501, Size: 501
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        return false;
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                default: {
                    return super.onOptionsItemSelected(menuItem);
                }
                case 16908332: {
                    this.finish();
                    return true;
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
}
