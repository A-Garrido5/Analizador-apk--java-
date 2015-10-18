// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import com.whatsapp.vc;
import android.text.Editable;
import android.text.style.ImageSpan;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.Build;
import android.util.SparseIntArray;

public class cq
{
    private static final l a;
    private static boolean b;
    private static boolean c;
    private static final l d;
    private static final l e;
    private static SparseIntArray f;
    private static final String[] z;
    
    static {
        int c = 1;
        final String[] z2 = new String[60];
        String s = "H\u001c";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1650:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '6';
                        break;
                    }
                    case 0: {
                        c3 = '\u000f';
                        break;
                    }
                    case 1: {
                        c3 = 'N';
                        break;
                    }
                    case 2: {
                        c3 = 'F';
                        break;
                    }
                    case 3: {
                        c3 = 'e';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "L\u000f";
                    n2 = c;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "N\u001b";
                    n = c;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "]\u001b";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\\\t";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "M\u001c";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "C\f";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\\\u000f";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "M\u000b";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "F\u0002";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "H\u0006";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "B\u0016";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "D\u0014";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "[\u001c";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "L\u0007";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    s = "K\u000b";
                    n = 14;
                    n2 = 15;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    array = z2;
                    s = "F\u001c";
                    n = 15;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "M\u000f";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "E\u0001";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    s = "L\u0003";
                    n = 18;
                    n2 = 19;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    array = z2;
                    s = "F\u001a";
                    n = 19;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "Z\u0017";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "L\u0006";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "_\u001a";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "B\u0017";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "L\u0000";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "J\t";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "L\u001c";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "J\r";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "I\u001c";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "W\u000b";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "K\u0014";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "G\u001c";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "Z\u000f";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "E\u001e";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "D\u001c";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "_\u000b";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "A\u0002";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "N\u001c";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "F\n";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "G\u0000";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "Z\u001d";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "F\u0000";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "L\u0002";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "H\f";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "A\t";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "G\u0005";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "J\u001d";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "[\u0019";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "Y\u000b";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "[\u0006";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "U\u000f";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "\\\u0017";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "N\u000b";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    s = "N\u001a";
                    n = 53;
                    n2 = 54;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    array = z2;
                    s = "L\u0001";
                    n = 54;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "k<'\u0012Wm\"#";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "l!+KAg/2\u0016W\u007f>";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "j#)\u000f_z:/\t\u0019h+2\u0000[`$/\fU` $\u001cU`*#J";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "j#\u0019";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    break Label_1650;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        final String manufacturer = Build.MANUFACTURER;
        final char[] charArray2 = "\\!(\u001c".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c4 = charArray2[n4];
            char c5 = '\0';
            switch (n4 % 5) {
                default: {
                    c5 = '6';
                    break;
                }
                case 0: {
                    c5 = '\u000f';
                    break;
                }
                case 1: {
                    c5 = 'N';
                    break;
                }
                case 2: {
                    c5 = 'F';
                    break;
                }
                case 3: {
                    c5 = 'e';
                    break;
                }
            }
            charArray2[n4] = (char)(c5 ^ c4);
        }
        if (!manufacturer.startsWith(new String(charArray2).intern()) || Build$VERSION.SDK_INT >= 19) {
            c = 0;
        }
        cq.c = (c != 0);
        cq.f = new SparseIntArray(900);
        e = new aj();
        a = new e();
        d = new af();
    }
    
    public static int a(final int n) {
        if (cq.c) {
            return 1;
        }
        return Character.charCount(n);
    }
    
    private static int a(final int n, final int n2) {
        if (n >= 127462 && n <= 127487 && n2 >= 127462 && n2 <= 127487) {
            switch (65 + (n2 - 127462) | 65 + (n - 127462) << 8) {
                default: {
                    if (Log.l) {
                        break;
                    }
                    return 0;
                }
                case 17230: {
                    return 58643;
                }
                case 17477: {
                    return 58638;
                }
                case 17747: {
                    return 58641;
                }
                case 18002: {
                    return 58637;
                }
                case 18242: {
                    return 58640;
                }
                case 18772: {
                    return 58639;
                }
                case 19024: {
                    return 58635;
                }
                case 19282: {
                    return 58644;
                }
                case 21077: {
                    return 58642;
                }
                case 21843: {
                    return 58636;
                }
                case 18766: {
                    return 60417;
                }
                case 19800: {
                    return 60418;
                }
                case 16978: {
                    return 60419;
                }
                case 21313: {
                    return 60420;
                }
                case 23105: {
                    return 60421;
                }
                case 16722: {
                    return 60422;
                }
                case 20044: {
                    return 60423;
                }
                case 21586: {
                    return 60424;
                }
                case 19801: {
                    return 60425;
                }
                case 22085: {
                    return 60426;
                }
                case 17231: {
                    return 60427;
                }
                case 17228: {
                    return 60428;
                }
                case 18507: {
                    return 60429;
                }
                case 20039: {
                    return 60430;
                }
                case 17224: {
                    return 60431;
                }
                case 18764: {
                    return 60432;
                }
                case 21576: {
                    return 60433;
                }
                case 21319: {
                    return 60434;
                }
                case 16709: {
                    return 60435;
                }
                case 21591: {
                    return 60436;
                }
                case 17735: {
                    return 60437;
                }
                case 17217: {
                    return 60438;
                }
                case 18756: {
                    return 60439;
                }
                case 16724: {
                    return 60440;
                }
                case 16725: {
                    return 60441;
                }
                case 16961: {
                    return 60442;
                }
                case 16965: {
                    return 60443;
                }
                case 17225: {
                    return 60444;
                }
                case 17229: {
                    return 60445;
                }
                case 17234: {
                    return 60446;
                }
                case 17498: {
                    return 60447;
                }
                case 17731: {
                    return 60448;
                }
                case 18248: {
                    return 60449;
                }
                case 18258: {
                    return 60450;
                }
                case 18510: {
                    return 60451;
                }
                case 18514: {
                    return 60452;
                }
                case 18770: {
                    return 60453;
                }
                case 19023: {
                    return 60454;
                }
                case 19290: {
                    return 60455;
                }
                case 19522: {
                    return 60456;
                }
                case 20549: {
                    return 60457;
                }
                case 20564: {
                    return 60458;
                }
                case 21337: {
                    return 60459;
                }
                case 21825: {
                    return 60460;
                }
                case 21849: {
                    return 60461;
                }
                case 22597: {
                    return 60462;
                }
            }
        }
        if (n2 == 8419) {
            if (n == 35) {
                return 57872;
            }
            if (n == 49) {
                return 57884;
            }
            if (n == 50) {
                return 57885;
            }
            if (n == 51) {
                return 57886;
            }
            if (n == 52) {
                return 57887;
            }
            if (n == 53) {
                return 57888;
            }
            if (n == 54) {
                return 57889;
            }
            if (n == 55) {
                return 57890;
            }
            if (n == 56) {
                return 57891;
            }
            if (n == 57) {
                return 57892;
            }
            if (n == 48) {
                return 57893;
            }
        }
        return 0;
    }
    
    public static Drawable a(final Context context, final int n) {
        int n2 = cq.f.get(n);
        if (n2 == 0) {
            String s = null;
            Label_0063: {
                if ((0xFF000 & n) == 0xE000) {
                    s = Integer.toHexString(n);
                    if (!Log.l) {
                        break Label_0063;
                    }
                }
                s = cq.z[59] + Integer.toHexString(n);
            }
            n2 = context.getResources().getIdentifier(s, cq.z[56], cq.z[57]);
            cq.f.put(n, n2);
        }
        try {
            return context.getResources().getDrawable(n2);
        }
        catch (Exception ex) {
            Log.e(cq.z[58] + ex.toString());
            return null;
        }
    }
    
    public static SpannableStringBuilder a(final String s, final Context context) {
        return a(s, context, cq.e);
    }
    
    public static SpannableStringBuilder a(final String s, final Context context, final Paint paint) {
        return a(s, context, paint, 1.0f);
    }
    
    public static SpannableStringBuilder a(final String s, final Context context, final Paint paint, final float n) {
        l a;
        if (paint == null) {
            a = cq.a;
        }
        else {
            a = new ah(paint, n);
        }
        return a(s, context, a);
    }
    
    private static SpannableStringBuilder a(final String s, final Context context, final l l) {
        final boolean i = Log.l;
        if (s != null) {
            int n = 0;
            int n2 = 0;
            final int length = s.length();
            int j = 0;
            SpannableStringBuilder spannableStringBuilder = null;
            while (true) {
            Label_0157_Outer:
                while (j < length) {
                    final int codePoint = s.codePointAt(j);
                    int charCount = Character.charCount(codePoint);
                    final boolean h = h(codePoint);
                    int a = 0;
                    while (true) {
                        Label_0488: {
                            if (!h) {
                                break Label_0488;
                            }
                            final int n3 = j + charCount;
                            a = 0;
                            if (n3 >= length) {
                                break Label_0488;
                            }
                            final int codePoint2 = s.codePointAt(j + charCount);
                            a = a(codePoint, codePoint2);
                            if (a > 0) {
                                charCount += Character.charCount(codePoint2);
                                if (!i) {
                                    break Label_0488;
                                }
                            }
                            final String b = b(codePoint, codePoint2);
                            int n4;
                            String s2;
                            if (b != null) {
                                charCount += Character.charCount(codePoint2);
                                n4 = a;
                                s2 = b;
                            }
                            else {
                                n4 = a;
                                s2 = b;
                            }
                            Label_0207: {
                                if (n4 == 0 && s2 == null) {
                                    if (cq.c && (codePoint & 0xFFFFF000) == 0xF000) {
                                        n4 = g(0x10000 | codePoint);
                                        if (!i) {
                                            break Label_0207;
                                        }
                                    }
                                    n4 = g(codePoint);
                                }
                            }
                            int n6 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            int n7 = 0;
                            Label_0425: {
                                Label_0414: {
                                    if (i(n4) || s2 != null) {
                                        if (spannableStringBuilder == null) {
                                            spannableStringBuilder = new SpannableStringBuilder((CharSequence)s);
                                        }
                                        Drawable a2;
                                        if (s2 == null) {
                                            a2 = a(context, n4);
                                        }
                                        else {
                                            a2 = new i(s2);
                                        }
                                        if (a2 != null) {
                                            final ImageSpan imageSpan = new ImageSpan(l.a(a2, context), 0);
                                            while (true) {
                                                Label_0543: {
                                                    if (j + charCount >= length) {
                                                        break Label_0543;
                                                    }
                                                    final int codePoint3 = s.codePointAt(j + charCount);
                                                    if (!b(codePoint3)) {
                                                        break Label_0543;
                                                    }
                                                    final int n5 = charCount + Character.charCount(codePoint3);
                                                    Label_0386: {
                                                        if (cq.c) {
                                                            spannableStringBuilder.replace(n2, n2 + n5, (CharSequence)Character.toString((char)(0xFFFF & codePoint)), 0, 1);
                                                            spannableStringBuilder.setSpan((Object)imageSpan, n2, n2 + 1, 33);
                                                            n2 -= n5 - 1;
                                                            if (!i) {
                                                                break Label_0386;
                                                            }
                                                        }
                                                        spannableStringBuilder.setSpan((Object)imageSpan, n2, n2 + n5, 33);
                                                    }
                                                    if (i) {
                                                        return null;
                                                    }
                                                    if (i) {
                                                        charCount = n5;
                                                        break Label_0414;
                                                    }
                                                    charCount = n5;
                                                    n6 = n2;
                                                    spannableStringBuilder2 = spannableStringBuilder;
                                                    n7 = n;
                                                    break Label_0425;
                                                }
                                                final int n5 = charCount;
                                                continue;
                                            }
                                        }
                                        return null;
                                    }
                                }
                                n6 = n2;
                                spannableStringBuilder2 = spannableStringBuilder;
                                n7 = 1;
                            }
                            final int n8 = n6 + charCount;
                            final int n9 = charCount + j;
                            if (!i) {
                                j = n9;
                                n = n7;
                                spannableStringBuilder = spannableStringBuilder2;
                                n2 = n8;
                                continue Label_0157_Outer;
                            }
                            final int n10 = n7;
                            spannableStringBuilder = spannableStringBuilder2;
                            final int n11 = n10;
                            if (spannableStringBuilder != null && n11 == 0) {
                                spannableStringBuilder.append((CharSequence)" ");
                                return spannableStringBuilder;
                            }
                            return spannableStringBuilder;
                        }
                        int n4 = a;
                        String s2 = null;
                        continue;
                    }
                }
                final int n11 = n;
                continue;
            }
        }
        return null;
    }
    
    public static String a(final CharSequence charSequence) {
        final boolean l = Log.l;
        final StringBuilder sb = new StringBuilder();
        final int length = charSequence.length();
        int i = 0;
        while (i < length) {
            final int codePoint = Character.codePointAt(charSequence, i);
            final int charCount = Character.charCount(codePoint);
            Label_0130: {
                if (i(codePoint)) {
                    if (Build$VERSION.SDK_INT < 16) {
                        sb.append('\u25a1');
                        if (!l) {
                            break Label_0130;
                        }
                    }
                    final int e = e(codePoint);
                    Label_0116: {
                        if (d(e) || Build$VERSION.SDK_INT >= 19) {
                            sb.append(Character.toChars(e));
                            if (!l) {
                                break Label_0116;
                            }
                        }
                        sb.append('\u25a1');
                    }
                    if (!l) {
                        break Label_0130;
                    }
                }
                sb.append(Character.toChars(codePoint));
            }
            i += charCount;
            if (l) {
                break;
            }
        }
        return sb.toString();
    }
    
    public static String a(final String s) {
        final boolean l = Log.l;
        if (!cq.c) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            Label_0108: {
                if ((char1 & 0xFFFFF000) == 0xF000) {
                    final int n = 0x10000 | char1;
                    Label_0097: {
                        if (i(g(n)) || h(n)) {
                            sb.append(Character.toChars(n));
                            if (!l) {
                                break Label_0097;
                            }
                        }
                        sb.append(char1);
                    }
                    if (!l) {
                        break Label_0108;
                    }
                }
                sb.append(char1);
            }
            ++i;
            if (l) {
                break;
            }
        }
        return sb.toString();
    }
    
    public static void a(final Editable editable, final Context context) {
        final boolean l = Log.l;
        if (cq.b) {
            return;
        }
        cq.b = true;
        final String string = editable.toString();
        final ImageSpan[] array = (ImageSpan[])editable.getSpans(0, string.length(), (Class)ImageSpan.class);
        int i = 0;
        while (i < array.length) {
            editable.removeSpan((Object)array[i]);
            ++i;
            if (l) {
                break;
            }
        }
        int n = string.length();
        String string2;
        if (cq.c) {
            int j = 0;
            int n2 = 0;
            while (j < n) {
                final int codePoint = string.codePointAt(j);
                final int charCount = Character.charCount(codePoint);
                if (charCount > 1 && (h(codePoint) || i(g(codePoint)))) {
                    editable.replace(n2, n2 + charCount, (CharSequence)f(codePoint));
                    n2 -= charCount - 1;
                }
                j += charCount;
                n2 += charCount;
                if (l) {
                    break;
                }
            }
            string2 = editable.toString();
            n = string2.length();
        }
        else {
            string2 = string;
        }
        int n5;
        for (int k = 0; k < n; k = n5) {
            int codePoint2 = string2.codePointAt(k);
            int charCount2 = Character.charCount(codePoint2);
            if (cq.c && (codePoint2 & 0xFFFFF000) == 0xF000) {
                codePoint2 |= 0x10000;
            }
            int n3 = 0;
            String s = null;
            Label_0361: {
                if (h(codePoint2) && k + charCount2 < n) {
                    int codePoint3 = string2.codePointAt(k + charCount2);
                    final int charCount3 = Character.charCount(codePoint3);
                    if (cq.c && (codePoint3 & 0xFFFFF000) == 0xF000) {
                        codePoint3 |= 0x10000;
                    }
                    final int a = a(codePoint2, codePoint3);
                    if (a > 0) {
                        charCount2 += charCount3;
                        if (!l) {
                            n3 = a;
                            s = null;
                            break Label_0361;
                        }
                    }
                    final String b = b(codePoint2, codePoint3);
                    if (b != null) {
                        charCount2 += charCount3;
                        s = b;
                        n3 = a;
                    }
                    else {
                        s = b;
                        n3 = a;
                    }
                }
                else {
                    n3 = 0;
                    s = null;
                }
            }
            int g;
            if (n3 == 0 && s == null) {
                g = g(codePoint2);
            }
            else {
                g = n3;
            }
            Label_0515: {
                if (i(g) || s != null) {
                    Drawable a2;
                    if (s == null) {
                        a2 = a(context, g);
                    }
                    else {
                        a2 = new i(s);
                    }
                    if (a2 != null) {
                        a2.setBounds(0, 0, (int)vc.b().c(a2.getIntrinsicWidth()), (int)vc.b().c(a2.getIntrinsicWidth()));
                        final ImageSpan imageSpan = new ImageSpan(a2, 0);
                        while (true) {
                            Label_0552: {
                                if (k + charCount2 >= n) {
                                    break Label_0552;
                                }
                                final int codePoint4 = string2.codePointAt(k + charCount2);
                                if (!b(codePoint4)) {
                                    break Label_0552;
                                }
                                final int n4 = charCount2 + Character.charCount(codePoint4);
                                editable.setSpan((Object)imageSpan, k, k + n4, 33);
                                charCount2 = n4;
                                break Label_0515;
                            }
                            final int n4 = charCount2;
                            continue;
                        }
                    }
                }
            }
            n5 = k + charCount2;
            if (l) {
                break;
            }
        }
        cq.b = false;
    }
    
    public static CharSequence b(final String s, final Context context) {
        final SpannableStringBuilder d = d(s, context);
        if (d == null) {
            return s;
        }
        return (CharSequence)d;
    }
    
    public static CharSequence b(final String s, final Context context, final Paint paint) {
        final SpannableStringBuilder a = a(s, context, paint);
        if (a == null) {
            return s;
        }
        return (CharSequence)a;
    }
    
    public static CharSequence b(final String s, final Context context, final Paint paint, final float n) {
        final SpannableStringBuilder a = a(s, context, paint, n);
        if (a == null) {
            return s;
        }
        return (CharSequence)a;
    }
    
    private static String b(final int n, final int n2) {
        if (n >= 127462 && n <= 127487 && n2 >= 127462 && n2 <= 127487) {
            return Character.toString((char)(65 + (n - 127462))) + Character.toString((char)(65 + (n2 - 127462)));
        }
        return null;
    }
    
    public static String b(final CharSequence charSequence) {
        final boolean l = Log.l;
        final StringBuilder sb = new StringBuilder();
        int n2;
        for (int length = charSequence.length(), i = 0; i < length; i = n2) {
            final int codePoint = Character.codePointAt(charSequence, i);
            int charCount = Character.charCount(codePoint);
            String b = null;
            int n = 0;
            int g = 0;
            Label_0130: {
                if (h(codePoint) && i + charCount < length) {
                    final int codePoint2 = Character.codePointAt(charSequence, i + charCount);
                    final int a = a(codePoint, codePoint2);
                    Label_0221: {
                        if (a > 0) {
                            charCount += Character.charCount(codePoint2);
                            b = null;
                            if (!l) {
                                break Label_0221;
                            }
                        }
                        b = b(codePoint, codePoint2);
                        if (b != null) {
                            n = charCount + Character.charCount(codePoint2);
                            g = a;
                            break Label_0130;
                        }
                    }
                    n = charCount;
                    g = a;
                }
                else {
                    n = charCount;
                    g = 0;
                    b = null;
                }
            }
            if (g == 0 && b == null) {
                g = g(codePoint);
            }
            Label_0198: {
                if (i(g) || b != null) {
                    int j = 0;
                    while (j < n) {
                        sb.append(' ');
                        ++j;
                        if (l) {
                            break;
                        }
                    }
                    if (!l) {
                        break Label_0198;
                    }
                }
                sb.append(Character.toChars(codePoint));
            }
            n2 = i + n;
            if (l) {
                break;
            }
        }
        return sb.toString();
    }
    
    private static boolean b(final int n) {
        return (n >= 65024 && n <= 65039) || (n >= 127995 && n <= 127999);
    }
    
    public static CharSequence c(final String s, final Context context) {
        final SpannableStringBuilder a = a(s, context);
        if (a == null) {
            return s;
        }
        return (CharSequence)a;
    }
    
    public static int[] c(final int n) {
        if (n >= 60417 && n <= 60462) {
            String s = null;
            switch (n) {
                default: {
                    s = null;
                    break;
                }
                case 58643: {
                    s = cq.z[25];
                    break;
                }
                case 58638: {
                    s = cq.z[15];
                    break;
                }
                case 58641: {
                    s = cq.z[47];
                    break;
                }
                case 58637: {
                    s = cq.z[29];
                    break;
                }
                case 58640: {
                    s = cq.z[44];
                    break;
                }
                case 58639: {
                    s = cq.z[20];
                    break;
                }
                case 58635: {
                    s = cq.z[34];
                    break;
                }
                case 58644: {
                    s = cq.z[35];
                    break;
                }
                case 58642: {
                    s = cq.z[3];
                    break;
                }
                case 58636: {
                    s = cq.z[41];
                    break;
                }
                case 60417: {
                    s = cq.z[42];
                    break;
                }
                case 60418: {
                    s = cq.z[11];
                    break;
                }
                case 60419: {
                    s = cq.z[5];
                    break;
                }
                case 60420: {
                    s = cq.z[7];
                    break;
                }
                case 60421: {
                    s = cq.z[51];
                    break;
                }
                case 60422: {
                    s = cq.z[38];
                    break;
                }
                case 60423: {
                    s = cq.z[37];
                    break;
                }
                case 60424: {
                    s = cq.z[13];
                    break;
                }
                case 60425: {
                    s = cq.z[24];
                    break;
                }
                case 60426: {
                    s = cq.z[49];
                    break;
                }
                case 60427: {
                    s = cq.z[55];
                    break;
                }
                case 60428: {
                    s = cq.z[43];
                    break;
                }
                case 60429: {
                    s = cq.z[46];
                    break;
                }
                case 60430: {
                    s = cq.z[45];
                    break;
                }
                case 60431: {
                    s = cq.z[22];
                    break;
                }
                case 60432: {
                    s = cq.z[9];
                    break;
                }
                case 60433: {
                    s = cq.z[50];
                    break;
                }
                case 60434: {
                    s = cq.z[4];
                    break;
                }
                case 60435: {
                    s = cq.z[53];
                    break;
                }
                case 60436: {
                    s = cq.z[48];
                    break;
                }
                case 60437: {
                    s = cq.z[26];
                    break;
                }
                case 60438: {
                    s = cq.z[1];
                    break;
                }
                case 60439: {
                    s = cq.z[39];
                    break;
                }
                case 60440: {
                    s = cq.z[54];
                    break;
                }
                case 60441: {
                    s = cq.z[2];
                    break;
                }
                case 60442: {
                    s = cq.z[17];
                    break;
                }
                case 60443: {
                    s = cq.z[8];
                    break;
                }
                case 60444: {
                    s = cq.z[14];
                    break;
                }
                case 60445: {
                    s = cq.z[19];
                    break;
                }
                case 60446: {
                    s = cq.z[27];
                    break;
                }
                case 60447: {
                    s = cq.z[31];
                    break;
                }
                case 60448: {
                    s = cq.z[28];
                    break;
                }
                case 60449: {
                    s = cq.z[10];
                    break;
                }
                case 60450: {
                    s = cq.z[0];
                    break;
                }
                case 60451: {
                    s = cq.z[40];
                    break;
                }
                case 60452: {
                    s = cq.z[32];
                    break;
                }
                case 60453: {
                    s = cq.z[16];
                    break;
                }
                case 60454: {
                    s = cq.z[18];
                    break;
                }
                case 60455: {
                    s = cq.z[12];
                    break;
                }
                case 60456: {
                    s = cq.z[6];
                    break;
                }
                case 60457: {
                    s = cq.z[36];
                    break;
                }
                case 60458: {
                    s = cq.z[23];
                    break;
                }
                case 60459: {
                    s = cq.z[52];
                    break;
                }
                case 60460: {
                    s = cq.z[33];
                    break;
                }
                case 60461: {
                    s = cq.z[21];
                    break;
                }
                case 60462: {
                    s = cq.z[30];
                    break;
                }
            }
            int[] array = null;
            if (s != null) {
                array = new int[] { -65 + (127462 + s.charAt(0)), -65 + (127462 + s.charAt(1)) };
            }
            return array;
        }
        switch (n) {
            default: {
                return null;
            }
            case 57872: {
                return new int[] { 35, 8419 };
            }
            case 57884: {
                return new int[] { 49, 8419 };
            }
            case 57885: {
                return new int[] { 50, 8419 };
            }
            case 57886: {
                return new int[] { 51, 8419 };
            }
            case 57887: {
                return new int[] { 52, 8419 };
            }
            case 57888: {
                return new int[] { 53, 8419 };
            }
            case 57889: {
                return new int[] { 54, 8419 };
            }
            case 57890: {
                return new int[] { 55, 8419 };
            }
            case 57891: {
                return new int[] { 56, 8419 };
            }
            case 57892: {
                return new int[] { 57, 8419 };
            }
            case 57893: {
                return new int[] { 48, 8419 };
            }
        }
    }
    
    public static SpannableStringBuilder d(final String s, final Context context) {
        return a(s, context, cq.d);
    }
    
    private static boolean d(final int n) {
        switch (n) {
            default: {
                return true;
            }
            case 9745:
            case 9748:
            case 9749:
            case 9757:
            case 57872:
            case 57884:
            case 57885:
            case 57886:
            case 57887:
            case 57888:
            case 57889:
            case 57890:
            case 57891:
            case 57892:
            case 57893:
            case 58634:
            case 58635:
            case 58636:
            case 58637:
            case 58638:
            case 58639:
            case 58640:
            case 58641:
            case 58642:
            case 58643:
            case 58644:
            case 60417:
            case 60418:
            case 60419:
            case 60420:
            case 60421:
            case 60422:
            case 60423:
            case 60424:
            case 60425:
            case 60426:
            case 60427:
            case 60428:
            case 60429:
            case 60430:
            case 60431:
            case 60432:
            case 60433:
            case 60434:
            case 60435:
            case 60436:
            case 60437:
            case 60438:
            case 60439:
            case 127757:
            case 127758:
            case 127760:
            case 127762:
            case 127766:
            case 127767:
            case 127768:
            case 127770:
            case 127772:
            case 127773:
            case 127774:
            case 127794:
            case 127795:
            case 127819:
            case 127824:
            case 127868:
            case 127943:
            case 127945:
            case 127972:
            case 128000:
            case 128001:
            case 128002:
            case 128003:
            case 128004:
            case 128005:
            case 128006:
            case 128007:
            case 128008:
            case 128009:
            case 128010:
            case 128011:
            case 128015:
            case 128016:
            case 128019:
            case 128021:
            case 128022:
            case 128042:
            case 128101:
            case 128108:
            case 128109:
            case 128113:
            case 128114:
            case 128115:
            case 128173:
            case 128182:
            case 128183:
            case 128236:
            case 128237:
            case 128239:
            case 128245:
            case 128256:
            case 128257:
            case 128258:
            case 128260:
            case 128261:
            case 128262:
            case 128263:
            case 128264:
            case 128265:
            case 128277:
            case 128300:
            case 128301:
            case 128348:
            case 128349:
            case 128350:
            case 128351:
            case 128353:
            case 128354:
            case 128355:
            case 128356:
            case 128357:
            case 128358:
            case 128359:
            case 128512:
            case 128519:
            case 128520:
            case 128526:
            case 128528:
            case 128529:
            case 128533:
            case 128535:
            case 128537:
            case 128539:
            case 128543:
            case 128550:
            case 128551:
            case 128556:
            case 128558:
            case 128559:
            case 128564:
            case 128566:
            case 128641:
            case 128642:
            case 128646:
            case 128648:
            case 128650:
            case 128651:
            case 128653:
            case 128654:
            case 128656:
            case 128660:
            case 128662:
            case 128664:
            case 128667:
            case 128668:
            case 128669:
            case 128670:
            case 128671:
            case 128672:
            case 128673:
            case 128675:
            case 128678:
            case 128686:
            case 128687:
            case 128688:
            case 128689:
            case 128691:
            case 128692:
            case 128693:
            case 128695:
            case 128696:
            case 128703:
            case 128705:
            case 128706:
            case 128707:
            case 128708:
            case 128709: {
                return false;
            }
        }
    }
    
    public static int e(final int n) {
        switch (n) {
            default: {
                return n;
            }
            case 57418: {
                return 9728;
            }
            case 57417: {
                return 9729;
            }
            case 57419: {
                return 9748;
            }
            case 57416: {
                return 9924;
            }
            case 57661: {
                return 9889;
            }
            case 58435: {
                return 127744;
            }
            case 58428: {
                return 127746;
            }
            case 58443: {
                return 127747;
            }
            case 57421: {
                return 127748;
            }
            case 58441: {
                return 127749;
            }
            case 57670: {
                return 127750;
            }
            case 58442: {
                return 127751;
            }
            case 58444: {
                return 127752;
            }
            case 58430: {
                return 127754;
            }
            case 57420: {
                return 127769;
            }
            case 58165: {
                return 127775;
            }
            case 57380: {
                return 128336;
            }
            case 57381: {
                return 128337;
            }
            case 57382: {
                return 128338;
            }
            case 57383: {
                return 128339;
            }
            case 57384: {
                return 128340;
            }
            case 57385: {
                return 128341;
            }
            case 57386: {
                return 128342;
            }
            case 57387: {
                return 128343;
            }
            case 57388: {
                return 128344;
            }
            case 57389: {
                return 128345;
            }
            case 57390: {
                return 128346;
            }
            case 57391: {
                return 128347;
            }
            case 57919: {
                return 9800;
            }
            case 57920: {
                return 9801;
            }
            case 57921: {
                return 9802;
            }
            case 57922: {
                return 9803;
            }
            case 57923: {
                return 9804;
            }
            case 57924: {
                return 9805;
            }
            case 57925: {
                return 9806;
            }
            case 57926: {
                return 9807;
            }
            case 57927: {
                return 9808;
            }
            case 57928: {
                return 9809;
            }
            case 57929: {
                return 9810;
            }
            case 57930: {
                return 9811;
            }
            case 57931: {
                return 9934;
            }
            case 57616: {
                return 127808;
            }
            case 58116: {
                return 127799;
            }
            case 57624: {
                return 127809;
            }
            case 57392: {
                return 127800;
            }
            case 57394: {
                return 127801;
            }
            case 57625: {
                return 127810;
            }
            case 58439: {
                return 127811;
            }
            case 58115: {
                return 127802;
            }
            case 58117: {
                return 127803;
            }
            case 58119: {
                return 127796;
            }
            case 58120: {
                return 127797;
            }
            case 58436: {
                return 127806;
            }
            case 58181: {
                return 127822;
            }
            case 58182: {
                return 127818;
            }
            case 58183: {
                return 127827;
            }
            case 58184: {
                return 127817;
            }
            case 58185: {
                return 127813;
            }
            case 58186: {
                return 127814;
            }
            case 58393: {
                return 128064;
            }
            case 58395: {
                return 128066;
            }
            case 58394: {
                return 128067;
            }
            case 58396: {
                return 128068;
            }
            case 58140: {
                return 128132;
            }
            case 58141: {
                return 128133;
            }
            case 58142: {
                return 128134;
            }
            case 58143: {
                return 128135;
            }
            case 58144: {
                return 128136;
            }
            case 57345: {
                return 128102;
            }
            case 57346: {
                return 128103;
            }
            case 57348: {
                return 128104;
            }
            case 57349: {
                return 128105;
            }
            case 58408: {
                return 128107;
            }
            case 57682: {
                return 128110;
            }
            case 58409: {
                return 128111;
            }
            case 58645: {
                return 128113;
            }
            case 58646: {
                return 128114;
            }
            case 58647: {
                return 128115;
            }
            case 58648: {
                return 128116;
            }
            case 58649: {
                return 128117;
            }
            case 58650: {
                return 128118;
            }
            case 58651: {
                return 128119;
            }
            case 58652: {
                return 128120;
            }
            case 57627: {
                return 128123;
            }
            case 57422: {
                return 128124;
            }
            case 57612: {
                return 128125;
            }
            case 57643: {
                return 128126;
            }
            case 57626: {
                return 128127;
            }
            case 57628: {
                return 128128;
            }
            case 57939: {
                return 128129;
            }
            case 58654: {
                return 128130;
            }
            case 58655: {
                return 128131;
            }
            case 58669: {
                return 128013;
            }
            case 57652: {
                return 128014;
            }
            case 58670: {
                return 128020;
            }
            case 58671: {
                return 128023;
            }
            case 58672: {
                return 128043;
            }
            case 58662: {
                return 128024;
            }
            case 58663: {
                return 128040;
            }
            case 58664: {
                return 128018;
            }
            case 58665: {
                return 128017;
            }
            case 57610: {
                return 128025;
            }
            case 58433: {
                return 128026;
            }
            case 58661: {
                return 128027;
            }
            case 58658: {
                return 128032;
            }
            case 58659: {
                return 128036;
            }
            case 58657: {
                return 128038;
            }
            case 57429: {
                return 128039;
            }
            case 57369: {
                return 128031;
            }
            case 58656: {
                return 128044;
            }
            case 57427: {
                return 128045;
            }
            case 57424: {
                return 128047;
            }
            case 57423: {
                return 128049;
            }
            case 57428: {
                return 128051;
            }
            case 57370: {
                return 128052;
            }
            case 57609: {
                return 128053;
            }
            case 57426: {
                return 128054;
            }
            case 57611: {
                return 128055;
            }
            case 57425: {
                return 128059;
            }
            case 58660: {
                return 128057;
            }
            case 58666: {
                return 128058;
            }
            case 58667: {
                return 128046;
            }
            case 58668: {
                return 128048;
            }
            case 58673: {
                return 128056;
            }
            case 57433: {
                return 128544;
            }
            case 58384: {
                return 128562;
            }
            case 57432: {
                return 128542;
            }
            case 58383: {
                return 128560;
            }
            case 58382: {
                return 128530;
            }
            case 57606: {
                return 128525;
            }
            case 57605: {
                return 128540;
            }
            case 58377: {
                return 128541;
            }
            case 58392: {
                return 128536;
            }
            case 58391: {
                return 128538;
            }
            case 58380: {
                return 128567;
            }
            case 58381: {
                return 128563;
            }
            case 57431: {
                return 128515;
            }
            case 58372: {
                return 128513;
            }
            case 58386: {
                return 128514;
            }
            case 57430: {
                return 128522;
            }
            case 58388: {
                return 9786;
            }
            case 58389: {
                return 128516;
            }
            case 58387: {
                return 128546;
            }
            case 58385: {
                return 128557;
            }
            case 58379: {
                return 128552;
            }
            case 58374: {
                return 128547;
            }
            case 58390: {
                return 128545;
            }
            case 58378: {
                return 128524;
            }
            case 58375: {
                return 128534;
            }
            case 58371: {
                return 128532;
            }
            case 57607: {
                return 128561;
            }
            case 58376: {
                return 128554;
            }
            case 58370: {
                return 128527;
            }
            case 57608: {
                return 128531;
            }
            case 58369: {
                return 128549;
            }
            case 58373: {
                return 128521;
            }
            case 58403: {
                return 128581;
            }
            case 58404: {
                return 128582;
            }
            case 58406: {
                return 128583;
            }
            case 58407: {
                return 128588;
            }
            case 58397: {
                return 128591;
            }
            case 57398: {
                return 127968;
            }
            case 57400: {
                return 127970;
            }
            case 57683: {
                return 127971;
            }
            case 57685: {
                return 127973;
            }
            case 57677: {
                return 127974;
            }
            case 57684: {
                return 127975;
            }
            case 57688: {
                return 127976;
            }
            case 58625: {
                return 127977;
            }
            case 57686: {
                return 127978;
            }
            case 57687: {
                return 127979;
            }
            case 57399: {
                return 9962;
            }
            case 57633: {
                return 9970;
            }
            case 58628: {
                return 127980;
            }
            case 58629: {
                return 127983;
            }
            case 58630: {
                return 127984;
            }
            case 58632: {
                return 127981;
            }
            case 57403: {
                return 128507;
            }
            case 58633: {
                return 128508;
            }
            case 58653: {
                return 128509;
            }
            case 57351: {
                return 128095;
            }
            case 57662: {
                return 128096;
            }
            case 58138: {
                return 128097;
            }
            case 58139: {
                return 128098;
            }
            case 58678: {
                return 128099;
            }
            case 57350: {
                return 128085;
            }
            case 57614: {
                return 128081;
            }
            case 58114: {
                return 128084;
            }
            case 58136: {
                return 128082;
            }
            case 58137: {
                return 128087;
            }
            case 58145: {
                return 128088;
            }
            case 58146: {
                return 128089;
            }
            case 58147: {
                return 128092;
            }
            case 57647: {
                return 128176;
            }
            case 57673: {
                return 128177;
            }
            case 57674: {
                return 128185;
            }
            case 57629: {
                return 128293;
            }
            case 57622: {
                return 128296;
            }
            case 57619: {
                return 128299;
            }
            case 57918: {
                return 128303;
            }
            case 57865: {
                return 128304;
            }
            case 57393: {
                return 128305;
            }
            case 57659: {
                return 128137;
            }
            case 58127: {
                return 128138;
            }
            case 58674: {
                return 127344;
            }
            case 58675: {
                return 127345;
            }
            case 58676: {
                return 127374;
            }
            case 58677: {
                return 127358;
            }
            case 58132: {
                return 127872;
            }
            case 57618: {
                return 127873;
            }
            case 58187: {
                return 127874;
            }
            case 57395: {
                return 127876;
            }
            case 58440: {
                return 127877;
            }
            case 57667: {
                return 127884;
            }
            case 57623: {
                return 127878;
            }
            case 58128: {
                return 127880;
            }
            case 58130: {
                return 127881;
            }
            case 58422: {
                return 127885;
            }
            case 58424: {
                return 127886;
            }
            case 58425: {
                return 127891;
            }
            case 58426: {
                return 127890;
            }
            case 58427: {
                return 127887;
            }
            case 58432: {
                return 127879;
            }
            case 58434: {
                return 127888;
            }
            case 58437: {
                return 127875;
            }
            case 58438: {
                return 127889;
            }
            case 57353: {
                return 9742;
            }
            case 57354: {
                return 128241;
            }
            case 57604: {
                return 128242;
            }
            case 58113: {
                return 128221;
            }
            case 57355: {
                return 128224;
            }
            case 57603: {
                return 128233;
            }
            case 57601: {
                return 128235;
            }
            case 57602: {
                return 128238;
            }
            case 57666: {
                return 128226;
            }
            case 58135: {
                return 128227;
            }
            case 57675: {
                return 128225;
            }
            case 57631: {
                return 128186;
            }
            case 57356: {
                return 128187;
            }
            case 57630: {
                return 128188;
            }
            case 58134: {
                return 128189;
            }
            case 57638: {
                return 128191;
            }
            case 57639: {
                return 128192;
            }
            case 58131: {
                return 9986;
            }
            case 57672: {
                return 128214;
            }
            case 57366: {
                return 9918;
            }
            case 57364: {
                return 9971;
            }
            case 57365: {
                return 127934;
            }
            case 57368: {
                return 9917;
            }
            case 57363: {
                return 127935;
            }
            case 58410: {
                return 127936;
            }
            case 57650: {
                return 127937;
            }
            case 57621: {
                return 127939;
            }
            case 57367: {
                return 127940;
            }
            case 57649: {
                return 127942;
            }
            case 58411: {
                return 127944;
            }
            case 58413: {
                return 127946;
            }
            case 57374: {
                return 128643;
            }
            case 58420: {
                return 128647;
            }
            case 58421: {
                return 128644;
            }
            case 57375: {
                return 128645;
            }
            case 57371: {
                return 128663;
            }
            case 58414: {
                return 128665;
            }
            case 57689: {
                return 128652;
            }
            case 57680: {
                return 128655;
            }
            case 57858: {
                return 128674;
            }
            case 57373: {
                return 9992;
            }
            case 57372: {
                return 9973;
            }
            case 57401: {
                return 128649;
            }
            case 57613: {
                return 128640;
            }
            case 57653: {
                return 128676;
            }
            case 57690: {
                return 128661;
            }
            case 58415: {
                return 128666;
            }
            case 58416: {
                return 128658;
            }
            case 58417: {
                return 128657;
            }
            case 58418: {
                return 128659;
            }
            case 57402: {
                return 9981;
            }
            case 57679: {
                return 127359;
            }
            case 57678: {
                return 128677;
            }
            case 57655: {
                return 128679;
            }
            case 57635: {
                return 9832;
            }
            case 57634: {
                return 9978;
            }
            case 57636: {
                return 127905;
            }
            case 58419: {
                return 127906;
            }
            case 57404: {
                return 127908;
            }
            case 57405: {
                return 127909;
            }
            case 58631: {
                return 127910;
            }
            case 58122: {
                return 127911;
            }
            case 58626: {
                return 127912;
            }
            case 58627: {
                return 127913;
            }
            case 57637: {
                return 127915;
            }
            case 58148: {
                return 127916;
            }
            case 57645: {
                return 126980;
            }
            case 57648: {
                return 127919;
            }
            case 57651: {
                return 127920;
            }
            case 58412: {
                return 127921;
            }
            case 57406: {
                return 127925;
            }
            case 58150: {
                return 127926;
            }
            case 57408: {
                return 127927;
            }
            case 57409: {
                return 127928;
            }
            case 57410: {
                return 127930;
            }
            case 57644: {
                return 12349;
            }
            case 57352: {
                return 128247;
            }
            case 57642: {
                return 128250;
            }
            case 57640: {
                return 128251;
            }
            case 57641: {
                return 128252;
            }
            case 57347: {
                return 128139;
            }
            case 57396: {
                return 128141;
            }
            case 57397: {
                return 128142;
            }
            case 57617: {
                return 128143;
            }
            case 58118: {
                return 128144;
            }
            case 58405: {
                return 128145;
            }
            case 58429: {
                return 128146;
            }
            case 57863: {
                return 128286;
            }
            case 57934: {
                return 169;
            }
            case 57935: {
                return 174;
            }
            case 58679: {
                return 8482;
            }
            case 57867: {
                return 128246;
            }
            case 57936: {
                return 128243;
            }
            case 57937: {
                return 128244;
            }
            case 57632: {
                return 127828;
            }
            case 58178: {
                return 127833;
            }
            case 57414: {
                return 127856;
            }
            case 58176: {
                return 127836;
            }
            case 58169: {
                return 127838;
            }
            case 57671: {
                return 127859;
            }
            case 58170: {
                return 127846;
            }
            case 58171: {
                return 127839;
            }
            case 58172: {
                return 127841;
            }
            case 58173: {
                return 127832;
            }
            case 58174: {
                return 127834;
            }
            case 58175: {
                return 127837;
            }
            case 58177: {
                return 127835;
            }
            case 58179: {
                return 127842;
            }
            case 58180: {
                return 127843;
            }
            case 58188: {
                return 127857;
            }
            case 58189: {
                return 127858;
            }
            case 58431: {
                return 127847;
            }
            case 57411: {
                return 127860;
            }
            case 57413: {
                return 9749;
            }
            case 57412: {
                return 127864;
            }
            case 57415: {
                return 127866;
            }
            case 58168: {
                return 127861;
            }
            case 58123: {
                return 127862;
            }
            case 58124: {
                return 127867;
            }
            case 57910: {
                return 8599;
            }
            case 57912: {
                return 8600;
            }
            case 57911: {
                return 8598;
            }
            case 57913: {
                return 8601;
            }
            case 57906: {
                return 11014;
            }
            case 57907: {
                return 11015;
            }
            case 57908: {
                return 10145;
            }
            case 57909: {
                return 11013;
            }
            case 57914: {
                return 9654;
            }
            case 57915: {
                return 9664;
            }
            case 57916: {
                return 9193;
            }
            case 57917: {
                return 9194;
            }
            case 58162: {
                return 11093;
            }
            case 58163: {
                return 10060;
            }
            case 57377: {
                return 10071;
            }
            case 57376: {
                return 10067;
            }
            case 58166: {
                return 10068;
            }
            case 58167: {
                return 10069;
            }
            case 57873: {
                return 10175;
            }
            case 57378: {
                return 10084;
            }
            case 58151: {
                return 128147;
            }
            case 57379: {
                return 128148;
            }
            case 58152: {
                return 128151;
            }
            case 58153: {
                return 128152;
            }
            case 58154: {
                return 128153;
            }
            case 58155: {
                return 128154;
            }
            case 58156: {
                return 128155;
            }
            case 58157: {
                return 128156;
            }
            case 58423: {
                return 128157;
            }
            case 57860: {
                return 128159;
            }
            case 57868: {
                return 9829;
            }
            case 57870: {
                return 9824;
            }
            case 57869: {
                return 9830;
            }
            case 57871: {
                return 9827;
            }
            case 58126: {
                return 128684;
            }
            case 57864: {
                return 128685;
            }
            case 57866: {
                return 9855;
            }
            case 57938: {
                return 9888;
            }
            case 57654: {
                return 128690;
            }
            case 57857: {
                return 128694;
            }
            case 57656: {
                return 128697;
            }
            case 57657: {
                return 128698;
            }
            case 57663: {
                return 128704;
            }
            case 57681: {
                return 128699;
            }
            case 57664: {
                return 128701;
            }
            case 58121: {
                return 128702;
            }
            case 57658: {
                return 128700;
            }
            case 57876: {
                return 127378;
            }
            case 57897: {
                return 127380;
            }
            case 57874: {
                return 127381;
            }
            case 57933: {
                return 127383;
            }
            case 57875: {
                return 127385;
            }
            case 57646: {
                return 127386;
            }
            case 57859: {
                return 127489;
            }
            case 57896: {
                return 127490;
            }
            case 57899: {
                return 127539;
            }
            case 57898: {
                return 127541;
            }
            case 57877: {
                return 127542;
            }
            case 57878: {
                return 127514;
            }
            case 57879: {
                return 127543;
            }
            case 57880: {
                return 127544;
            }
            case 57895: {
                return 127545;
            }
            case 57900: {
                return 127535;
            }
            case 57901: {
                return 127546;
            }
            case 58133: {
                return 12953;
            }
            case 58125: {
                return 12951;
            }
            case 57894: {
                return 127568;
            }
            case 57615: {
                return 128161;
            }
            case 58164: {
                return 128162;
            }
            case 58129: {
                return 128163;
            }
            case 57660: {
                return 128164;
            }
            case 58161: {
                return 128166;
            }
            case 58160: {
                return 128168;
            }
            case 57434: {
                return 128169;
            }
            case 57676: {
                return 128170;
            }
            case 58158: {
                return 10024;
            }
            case 57861: {
                return 10036;
            }
            case 57862: {
                return 10035;
            }
            case 57881: {
                return 128308;
            }
            case 57882: {
                return 128306;
            }
            case 57883: {
                return 128307;
            }
            case 58159: {
                return 11088;
            }
            case 57665: {
                return 128266;
            }
            case 57620: {
                return 128269;
            }
            case 57668: {
                return 128274;
            }
            case 57669: {
                return 128275;
            }
            case 57407: {
                return 128273;
            }
            case 58149: {
                return 128276;
            }
            case 57932: {
                return 128285;
            }
            case 57360: {
                return 9994;
            }
            case 57362: {
                return 9995;
            }
            case 57361: {
                return 9996;
            }
            case 57357: {
                return 128074;
            }
            case 57358: {
                return 128077;
            }
            case 57359: {
                return 9757;
            }
            case 57902: {
                return 128070;
            }
            case 57903: {
                return 128071;
            }
            case 57904: {
                return 128072;
            }
            case 57905: {
                return 128073;
            }
            case 58398: {
                return 128075;
            }
            case 58399: {
                return 128079;
            }
            case 58400: {
                return 128076;
            }
            case 58401: {
                return 128078;
            }
            case 58402: {
                return 128080;
            }
        }
    }
    
    public static String f(final int n) {
        if (cq.c) {
            return new String(Character.toChars(0xFFFF & n));
        }
        return new String(Character.toChars(n));
    }
    
    private static int g(final int n) {
        switch (n) {
            default: {
                return n;
            }
            case 9728: {
                return 57418;
            }
            case 9729: {
                return 57417;
            }
            case 9748: {
                return 57419;
            }
            case 9924: {
                return 57416;
            }
            case 9889: {
                return 57661;
            }
            case 127744: {
                return 58435;
            }
            case 127746: {
                return 58428;
            }
            case 127747: {
                return 58443;
            }
            case 127748: {
                return 57421;
            }
            case 127749: {
                return 58441;
            }
            case 127750: {
                return 57670;
            }
            case 127751: {
                return 58442;
            }
            case 127752: {
                return 58444;
            }
            case 127754: {
                return 58430;
            }
            case 127769: {
                return 57420;
            }
            case 127775: {
                return 58165;
            }
            case 128336: {
                return 57380;
            }
            case 128337: {
                return 57381;
            }
            case 128338: {
                return 57382;
            }
            case 128339: {
                return 57383;
            }
            case 128340: {
                return 57384;
            }
            case 128341: {
                return 57385;
            }
            case 128342: {
                return 57386;
            }
            case 128343: {
                return 57387;
            }
            case 128344: {
                return 57388;
            }
            case 128345: {
                return 57389;
            }
            case 128346: {
                return 57390;
            }
            case 128347: {
                return 57391;
            }
            case 9800: {
                return 57919;
            }
            case 9801: {
                return 57920;
            }
            case 9802: {
                return 57921;
            }
            case 9803: {
                return 57922;
            }
            case 9804: {
                return 57923;
            }
            case 9805: {
                return 57924;
            }
            case 9806: {
                return 57925;
            }
            case 9807: {
                return 57926;
            }
            case 9808: {
                return 57927;
            }
            case 9809: {
                return 57928;
            }
            case 9810: {
                return 57929;
            }
            case 9811: {
                return 57930;
            }
            case 9934: {
                return 57931;
            }
            case 127808: {
                return 57616;
            }
            case 127799: {
                return 58116;
            }
            case 127809: {
                return 57624;
            }
            case 127800: {
                return 57392;
            }
            case 127801: {
                return 57394;
            }
            case 127810: {
                return 57625;
            }
            case 127811: {
                return 58439;
            }
            case 127802: {
                return 58115;
            }
            case 127803: {
                return 58117;
            }
            case 127796: {
                return 58119;
            }
            case 127797: {
                return 58120;
            }
            case 127806: {
                return 58436;
            }
            case 127822: {
                return 58181;
            }
            case 127818: {
                return 58182;
            }
            case 127827: {
                return 58183;
            }
            case 127817: {
                return 58184;
            }
            case 127813: {
                return 58185;
            }
            case 127814: {
                return 58186;
            }
            case 128064: {
                return 58393;
            }
            case 128066: {
                return 58395;
            }
            case 128067: {
                return 58394;
            }
            case 128068: {
                return 58396;
            }
            case 128132: {
                return 58140;
            }
            case 128133: {
                return 58141;
            }
            case 128134: {
                return 58142;
            }
            case 128135: {
                return 58143;
            }
            case 128136: {
                return 58144;
            }
            case 128102: {
                return 57345;
            }
            case 128103: {
                return 57346;
            }
            case 128104: {
                return 57348;
            }
            case 128105: {
                return 57349;
            }
            case 128107: {
                return 58408;
            }
            case 128110: {
                return 57682;
            }
            case 128111: {
                return 58409;
            }
            case 128113: {
                return 58645;
            }
            case 128114: {
                return 58646;
            }
            case 128115: {
                return 58647;
            }
            case 128116: {
                return 58648;
            }
            case 128117: {
                return 58649;
            }
            case 128118: {
                return 58650;
            }
            case 128119: {
                return 58651;
            }
            case 128120: {
                return 58652;
            }
            case 128123: {
                return 57627;
            }
            case 128124: {
                return 57422;
            }
            case 128125: {
                return 57612;
            }
            case 128126: {
                return 57643;
            }
            case 128127: {
                return 57626;
            }
            case 128128: {
                return 57628;
            }
            case 128129: {
                return 57939;
            }
            case 128130: {
                return 58654;
            }
            case 128131: {
                return 58655;
            }
            case 128013: {
                return 58669;
            }
            case 128014: {
                return 57652;
            }
            case 128020: {
                return 58670;
            }
            case 128023: {
                return 58671;
            }
            case 128043: {
                return 58672;
            }
            case 128024: {
                return 58662;
            }
            case 128040: {
                return 58663;
            }
            case 128018: {
                return 58664;
            }
            case 128017: {
                return 58665;
            }
            case 128025: {
                return 57610;
            }
            case 128026: {
                return 58433;
            }
            case 128027: {
                return 58661;
            }
            case 128032: {
                return 58658;
            }
            case 128036: {
                return 58659;
            }
            case 128038: {
                return 58657;
            }
            case 128039: {
                return 57429;
            }
            case 128031: {
                return 57369;
            }
            case 128044: {
                return 58656;
            }
            case 128045: {
                return 57427;
            }
            case 128047: {
                return 57424;
            }
            case 128049: {
                return 57423;
            }
            case 128051: {
                return 57428;
            }
            case 128052: {
                return 57370;
            }
            case 128053: {
                return 57609;
            }
            case 128054: {
                return 57426;
            }
            case 128055: {
                return 57611;
            }
            case 128059: {
                return 57425;
            }
            case 128057: {
                return 58660;
            }
            case 128058: {
                return 58666;
            }
            case 128046: {
                return 58667;
            }
            case 128048: {
                return 58668;
            }
            case 128056: {
                return 58673;
            }
            case 128544: {
                return 57433;
            }
            case 128562: {
                return 58384;
            }
            case 128542: {
                return 57432;
            }
            case 128560: {
                return 58383;
            }
            case 128530: {
                return 58382;
            }
            case 128525: {
                return 57606;
            }
            case 128540: {
                return 57605;
            }
            case 128541: {
                return 58377;
            }
            case 128536: {
                return 58392;
            }
            case 128538: {
                return 58391;
            }
            case 128567: {
                return 58380;
            }
            case 128563: {
                return 58381;
            }
            case 128515: {
                return 57431;
            }
            case 128513: {
                return 58372;
            }
            case 128514: {
                return 58386;
            }
            case 128522: {
                return 57430;
            }
            case 9786: {
                return 58388;
            }
            case 128516: {
                return 58389;
            }
            case 128546: {
                return 58387;
            }
            case 128557: {
                return 58385;
            }
            case 128552: {
                return 58379;
            }
            case 128547: {
                return 58374;
            }
            case 128545: {
                return 58390;
            }
            case 128524: {
                return 58378;
            }
            case 128534: {
                return 58375;
            }
            case 128532: {
                return 58371;
            }
            case 128561: {
                return 57607;
            }
            case 128554: {
                return 58376;
            }
            case 128527: {
                return 58370;
            }
            case 128531: {
                return 57608;
            }
            case 128549: {
                return 58369;
            }
            case 128521: {
                return 58373;
            }
            case 128581: {
                return 58403;
            }
            case 128582: {
                return 58404;
            }
            case 128583: {
                return 58406;
            }
            case 128588: {
                return 58407;
            }
            case 128591: {
                return 58397;
            }
            case 127968: {
                return 57398;
            }
            case 127970: {
                return 57400;
            }
            case 127971: {
                return 57683;
            }
            case 127973: {
                return 57685;
            }
            case 127974: {
                return 57677;
            }
            case 127975: {
                return 57684;
            }
            case 127976: {
                return 57688;
            }
            case 127977: {
                return 58625;
            }
            case 127978: {
                return 57686;
            }
            case 127979: {
                return 57687;
            }
            case 9962: {
                return 57399;
            }
            case 9970: {
                return 57633;
            }
            case 127980: {
                return 58628;
            }
            case 127983: {
                return 58629;
            }
            case 127984: {
                return 58630;
            }
            case 127981: {
                return 58632;
            }
            case 128507: {
                return 57403;
            }
            case 128508: {
                return 58633;
            }
            case 128509: {
                return 58653;
            }
            case 128095: {
                return 57351;
            }
            case 128096: {
                return 57662;
            }
            case 128097: {
                return 58138;
            }
            case 128098: {
                return 58139;
            }
            case 128099: {
                return 58678;
            }
            case 128085: {
                return 57350;
            }
            case 128081: {
                return 57614;
            }
            case 128084: {
                return 58114;
            }
            case 128082: {
                return 58136;
            }
            case 128087: {
                return 58137;
            }
            case 128088: {
                return 58145;
            }
            case 128089: {
                return 58146;
            }
            case 128092: {
                return 58147;
            }
            case 128176: {
                return 57647;
            }
            case 128177: {
                return 57673;
            }
            case 128185: {
                return 57674;
            }
            case 128293: {
                return 57629;
            }
            case 128296: {
                return 57622;
            }
            case 128299: {
                return 57619;
            }
            case 128303: {
                return 57918;
            }
            case 128304: {
                return 57865;
            }
            case 128305: {
                return 57393;
            }
            case 128137: {
                return 57659;
            }
            case 128138: {
                return 58127;
            }
            case 127344: {
                return 58674;
            }
            case 127345: {
                return 58675;
            }
            case 127374: {
                return 58676;
            }
            case 127358: {
                return 58677;
            }
            case 127872: {
                return 58132;
            }
            case 127873: {
                return 57618;
            }
            case 127874: {
                return 58187;
            }
            case 127876: {
                return 57395;
            }
            case 127877: {
                return 58440;
            }
            case 127884: {
                return 57667;
            }
            case 127878: {
                return 57623;
            }
            case 127880: {
                return 58128;
            }
            case 127881: {
                return 58130;
            }
            case 127885: {
                return 58422;
            }
            case 127886: {
                return 58424;
            }
            case 127891: {
                return 58425;
            }
            case 127890: {
                return 58426;
            }
            case 127887: {
                return 58427;
            }
            case 127879: {
                return 58432;
            }
            case 127888: {
                return 58434;
            }
            case 127875: {
                return 58437;
            }
            case 127889: {
                return 58438;
            }
            case 9742: {
                return 57353;
            }
            case 128241: {
                return 57354;
            }
            case 128242: {
                return 57604;
            }
            case 128221: {
                return 58113;
            }
            case 128224: {
                return 57355;
            }
            case 128233: {
                return 57603;
            }
            case 128235: {
                return 57601;
            }
            case 128238: {
                return 57602;
            }
            case 128226: {
                return 57666;
            }
            case 128227: {
                return 58135;
            }
            case 128225: {
                return 57675;
            }
            case 128186: {
                return 57631;
            }
            case 128187: {
                return 57356;
            }
            case 128188: {
                return 57630;
            }
            case 128189: {
                return 58134;
            }
            case 128191: {
                return 57638;
            }
            case 128192: {
                return 57639;
            }
            case 9986: {
                return 58131;
            }
            case 128214: {
                return 57672;
            }
            case 9918: {
                return 57366;
            }
            case 9971: {
                return 57364;
            }
            case 127934: {
                return 57365;
            }
            case 9917: {
                return 57368;
            }
            case 127935: {
                return 57363;
            }
            case 127936: {
                return 58410;
            }
            case 127937: {
                return 57650;
            }
            case 127939: {
                return 57621;
            }
            case 127940: {
                return 57367;
            }
            case 127942: {
                return 57649;
            }
            case 127944: {
                return 58411;
            }
            case 127946: {
                return 58413;
            }
            case 128643: {
                return 57374;
            }
            case 128647: {
                return 58420;
            }
            case 128644: {
                return 58421;
            }
            case 128645: {
                return 57375;
            }
            case 128663: {
                return 57371;
            }
            case 128665: {
                return 58414;
            }
            case 128652: {
                return 57689;
            }
            case 128655: {
                return 57680;
            }
            case 128674: {
                return 57858;
            }
            case 9992: {
                return 57373;
            }
            case 9973: {
                return 57372;
            }
            case 128649: {
                return 57401;
            }
            case 128640: {
                return 57613;
            }
            case 128676: {
                return 57653;
            }
            case 128661: {
                return 57690;
            }
            case 128666: {
                return 58415;
            }
            case 128658: {
                return 58416;
            }
            case 128657: {
                return 58417;
            }
            case 128659: {
                return 58418;
            }
            case 9981: {
                return 57402;
            }
            case 127359: {
                return 57679;
            }
            case 128677: {
                return 57678;
            }
            case 128679: {
                return 57655;
            }
            case 9832: {
                return 57635;
            }
            case 9978: {
                return 57634;
            }
            case 127905: {
                return 57636;
            }
            case 127906: {
                return 58419;
            }
            case 127908: {
                return 57404;
            }
            case 127909: {
                return 57405;
            }
            case 127910: {
                return 58631;
            }
            case 127911: {
                return 58122;
            }
            case 127912: {
                return 58626;
            }
            case 127913: {
                return 58627;
            }
            case 127915: {
                return 57637;
            }
            case 127916: {
                return 58148;
            }
            case 126980: {
                return 57645;
            }
            case 127919: {
                return 57648;
            }
            case 127920: {
                return 57651;
            }
            case 127921: {
                return 58412;
            }
            case 127925: {
                return 57406;
            }
            case 127926: {
                return 58150;
            }
            case 127927: {
                return 57408;
            }
            case 127928: {
                return 57409;
            }
            case 127930: {
                return 57410;
            }
            case 12349: {
                return 57644;
            }
            case 128247: {
                return 57352;
            }
            case 128250: {
                return 57642;
            }
            case 128251: {
                return 57640;
            }
            case 128252: {
                return 57641;
            }
            case 128139: {
                return 57347;
            }
            case 128141: {
                return 57396;
            }
            case 128142: {
                return 57397;
            }
            case 128143: {
                return 57617;
            }
            case 128144: {
                return 58118;
            }
            case 128145: {
                return 58405;
            }
            case 128146: {
                return 58429;
            }
            case 128286: {
                return 57863;
            }
            case 169: {
                return 57934;
            }
            case 174: {
                return 57935;
            }
            case 8482: {
                return 58679;
            }
            case 128246: {
                return 57867;
            }
            case 128243: {
                return 57936;
            }
            case 128244: {
                return 57937;
            }
            case 127828: {
                return 57632;
            }
            case 127833: {
                return 58178;
            }
            case 127856: {
                return 57414;
            }
            case 127836: {
                return 58176;
            }
            case 127838: {
                return 58169;
            }
            case 127859: {
                return 57671;
            }
            case 127846: {
                return 58170;
            }
            case 127839: {
                return 58171;
            }
            case 127841: {
                return 58172;
            }
            case 127832: {
                return 58173;
            }
            case 127834: {
                return 58174;
            }
            case 127837: {
                return 58175;
            }
            case 127835: {
                return 58177;
            }
            case 127842: {
                return 58179;
            }
            case 127843: {
                return 58180;
            }
            case 127857: {
                return 58188;
            }
            case 127858: {
                return 58189;
            }
            case 127847: {
                return 58431;
            }
            case 127860: {
                return 57411;
            }
            case 9749: {
                return 57413;
            }
            case 127864: {
                return 57412;
            }
            case 127866: {
                return 57415;
            }
            case 127861: {
                return 58168;
            }
            case 127862: {
                return 58123;
            }
            case 127867: {
                return 58124;
            }
            case 8599: {
                return 57910;
            }
            case 8600: {
                return 57912;
            }
            case 8598: {
                return 57911;
            }
            case 8601: {
                return 57913;
            }
            case 11014: {
                return 57906;
            }
            case 11015: {
                return 57907;
            }
            case 10145: {
                return 57908;
            }
            case 11013: {
                return 57909;
            }
            case 9654: {
                return 57914;
            }
            case 9664: {
                return 57915;
            }
            case 9193: {
                return 57916;
            }
            case 9194: {
                return 57917;
            }
            case 11093: {
                return 58162;
            }
            case 10060: {
                return 58163;
            }
            case 10071: {
                return 57377;
            }
            case 10067: {
                return 57376;
            }
            case 10068: {
                return 58166;
            }
            case 10069: {
                return 58167;
            }
            case 10175: {
                return 57873;
            }
            case 10084: {
                return 57378;
            }
            case 128147: {
                return 58151;
            }
            case 128148: {
                return 57379;
            }
            case 128151: {
                return 58152;
            }
            case 128152: {
                return 58153;
            }
            case 128153: {
                return 58154;
            }
            case 128154: {
                return 58155;
            }
            case 128155: {
                return 58156;
            }
            case 128156: {
                return 58157;
            }
            case 128157: {
                return 58423;
            }
            case 128159: {
                return 57860;
            }
            case 9829: {
                return 57868;
            }
            case 9824: {
                return 57870;
            }
            case 9830: {
                return 57869;
            }
            case 9827: {
                return 57871;
            }
            case 128684: {
                return 58126;
            }
            case 128685: {
                return 57864;
            }
            case 9855: {
                return 57866;
            }
            case 9888: {
                return 57938;
            }
            case 128690: {
                return 57654;
            }
            case 128694: {
                return 57857;
            }
            case 128697: {
                return 57656;
            }
            case 128698: {
                return 57657;
            }
            case 128704: {
                return 57663;
            }
            case 128699: {
                return 57681;
            }
            case 128701: {
                return 57664;
            }
            case 128702: {
                return 58121;
            }
            case 128700: {
                return 57658;
            }
            case 127378: {
                return 57876;
            }
            case 127380: {
                return 57897;
            }
            case 127381: {
                return 57874;
            }
            case 127383: {
                return 57933;
            }
            case 127385: {
                return 57875;
            }
            case 127386: {
                return 57646;
            }
            case 127489: {
                return 57859;
            }
            case 127490: {
                return 57896;
            }
            case 127539: {
                return 57899;
            }
            case 127541: {
                return 57898;
            }
            case 127542: {
                return 57877;
            }
            case 127514: {
                return 57878;
            }
            case 127543: {
                return 57879;
            }
            case 127544: {
                return 57880;
            }
            case 127545: {
                return 57895;
            }
            case 127535: {
                return 57900;
            }
            case 127546: {
                return 57901;
            }
            case 12953: {
                return 58133;
            }
            case 12951: {
                return 58125;
            }
            case 127568: {
                return 57894;
            }
            case 128161: {
                return 57615;
            }
            case 128162: {
                return 58164;
            }
            case 128163: {
                return 58129;
            }
            case 128164: {
                return 57660;
            }
            case 128166: {
                return 58161;
            }
            case 128168: {
                return 58160;
            }
            case 128169: {
                return 57434;
            }
            case 128170: {
                return 57676;
            }
            case 10024: {
                return 58158;
            }
            case 10036: {
                return 57861;
            }
            case 10035: {
                return 57862;
            }
            case 128308: {
                return 57881;
            }
            case 128306: {
                return 57882;
            }
            case 128307: {
                return 57883;
            }
            case 11088: {
                return 58159;
            }
            case 128266: {
                return 57665;
            }
            case 128269: {
                return 57620;
            }
            case 128274: {
                return 57668;
            }
            case 128275: {
                return 57669;
            }
            case 128273: {
                return 57407;
            }
            case 128276: {
                return 58149;
            }
            case 128285: {
                return 57932;
            }
            case 9994: {
                return 57360;
            }
            case 9995: {
                return 57362;
            }
            case 9996: {
                return 57361;
            }
            case 128074: {
                return 57357;
            }
            case 128077: {
                return 57358;
            }
            case 9757: {
                return 57359;
            }
            case 128070: {
                return 57902;
            }
            case 128071: {
                return 57903;
            }
            case 128072: {
                return 57904;
            }
            case 128073: {
                return 57905;
            }
            case 128075: {
                return 58398;
            }
            case 128079: {
                return 58399;
            }
            case 128076: {
                return 58400;
            }
            case 128078: {
                return 58401;
            }
            case 128080: {
                return 58402;
            }
        }
    }
    
    private static boolean h(final int n) {
        if (n < 127462 || n > 127487) {
            switch (n) {
                case 35:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57: {
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean i(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 8252:
            case 8265:
            case 8505:
            case 8596:
            case 8597:
            case 8617:
            case 8618:
            case 8986:
            case 8987:
            case 9195:
            case 9196:
            case 9200:
            case 9203:
            case 9410:
            case 9642:
            case 9643:
            case 9723:
            case 9724:
            case 9725:
            case 9726:
            case 9745:
            case 9851:
            case 9875:
            case 9898:
            case 9899:
            case 9925:
            case 9940:
            case 9989:
            case 9993:
            case 9999:
            case 10002:
            case 10004:
            case 10006:
            case 10052:
            case 10055:
            case 10062:
            case 10133:
            case 10134:
            case 10135:
            case 10160:
            case 10548:
            case 10549:
            case 11035:
            case 11036:
            case 12336:
            case 57345:
            case 57346:
            case 57347:
            case 57348:
            case 57349:
            case 57350:
            case 57351:
            case 57352:
            case 57353:
            case 57354:
            case 57355:
            case 57356:
            case 57357:
            case 57358:
            case 57359:
            case 57360:
            case 57361:
            case 57362:
            case 57363:
            case 57364:
            case 57365:
            case 57366:
            case 57367:
            case 57368:
            case 57369:
            case 57370:
            case 57371:
            case 57372:
            case 57373:
            case 57374:
            case 57375:
            case 57376:
            case 57377:
            case 57378:
            case 57379:
            case 57380:
            case 57381:
            case 57382:
            case 57383:
            case 57384:
            case 57385:
            case 57386:
            case 57387:
            case 57388:
            case 57389:
            case 57390:
            case 57391:
            case 57392:
            case 57393:
            case 57394:
            case 57395:
            case 57396:
            case 57397:
            case 57398:
            case 57399:
            case 57400:
            case 57401:
            case 57402:
            case 57403:
            case 57404:
            case 57405:
            case 57406:
            case 57407:
            case 57408:
            case 57409:
            case 57410:
            case 57411:
            case 57412:
            case 57413:
            case 57414:
            case 57415:
            case 57416:
            case 57417:
            case 57418:
            case 57419:
            case 57420:
            case 57421:
            case 57422:
            case 57423:
            case 57424:
            case 57425:
            case 57426:
            case 57427:
            case 57428:
            case 57429:
            case 57430:
            case 57431:
            case 57432:
            case 57433:
            case 57434:
            case 57601:
            case 57602:
            case 57603:
            case 57604:
            case 57605:
            case 57606:
            case 57607:
            case 57608:
            case 57609:
            case 57610:
            case 57611:
            case 57612:
            case 57613:
            case 57614:
            case 57615:
            case 57616:
            case 57617:
            case 57618:
            case 57619:
            case 57620:
            case 57621:
            case 57622:
            case 57623:
            case 57624:
            case 57625:
            case 57626:
            case 57627:
            case 57628:
            case 57629:
            case 57630:
            case 57631:
            case 57632:
            case 57633:
            case 57634:
            case 57635:
            case 57636:
            case 57637:
            case 57638:
            case 57639:
            case 57640:
            case 57641:
            case 57642:
            case 57643:
            case 57644:
            case 57645:
            case 57646:
            case 57647:
            case 57648:
            case 57649:
            case 57650:
            case 57651:
            case 57652:
            case 57653:
            case 57654:
            case 57655:
            case 57656:
            case 57657:
            case 57658:
            case 57659:
            case 57660:
            case 57661:
            case 57662:
            case 57663:
            case 57664:
            case 57665:
            case 57666:
            case 57667:
            case 57668:
            case 57669:
            case 57670:
            case 57671:
            case 57672:
            case 57673:
            case 57674:
            case 57675:
            case 57676:
            case 57677:
            case 57678:
            case 57679:
            case 57680:
            case 57681:
            case 57682:
            case 57683:
            case 57684:
            case 57685:
            case 57686:
            case 57687:
            case 57688:
            case 57689:
            case 57690:
            case 57857:
            case 57858:
            case 57859:
            case 57860:
            case 57861:
            case 57862:
            case 57863:
            case 57864:
            case 57865:
            case 57866:
            case 57867:
            case 57868:
            case 57869:
            case 57870:
            case 57871:
            case 57872:
            case 57873:
            case 57874:
            case 57875:
            case 57876:
            case 57877:
            case 57878:
            case 57879:
            case 57880:
            case 57881:
            case 57882:
            case 57883:
            case 57884:
            case 57885:
            case 57886:
            case 57887:
            case 57888:
            case 57889:
            case 57890:
            case 57891:
            case 57892:
            case 57893:
            case 57894:
            case 57895:
            case 57896:
            case 57897:
            case 57898:
            case 57899:
            case 57900:
            case 57901:
            case 57902:
            case 57903:
            case 57904:
            case 57905:
            case 57906:
            case 57907:
            case 57908:
            case 57909:
            case 57910:
            case 57911:
            case 57912:
            case 57913:
            case 57914:
            case 57915:
            case 57916:
            case 57917:
            case 57918:
            case 57919:
            case 57920:
            case 57921:
            case 57922:
            case 57923:
            case 57924:
            case 57925:
            case 57926:
            case 57927:
            case 57928:
            case 57929:
            case 57930:
            case 57931:
            case 57932:
            case 57933:
            case 57934:
            case 57935:
            case 57936:
            case 57937:
            case 57938:
            case 57939:
            case 58113:
            case 58114:
            case 58115:
            case 58116:
            case 58117:
            case 58118:
            case 58119:
            case 58120:
            case 58121:
            case 58122:
            case 58123:
            case 58124:
            case 58125:
            case 58126:
            case 58127:
            case 58128:
            case 58129:
            case 58130:
            case 58131:
            case 58132:
            case 58133:
            case 58134:
            case 58135:
            case 58136:
            case 58137:
            case 58138:
            case 58139:
            case 58140:
            case 58141:
            case 58142:
            case 58143:
            case 58144:
            case 58145:
            case 58146:
            case 58147:
            case 58148:
            case 58149:
            case 58150:
            case 58151:
            case 58152:
            case 58153:
            case 58154:
            case 58155:
            case 58156:
            case 58157:
            case 58158:
            case 58159:
            case 58160:
            case 58161:
            case 58162:
            case 58163:
            case 58164:
            case 58165:
            case 58166:
            case 58167:
            case 58168:
            case 58169:
            case 58170:
            case 58171:
            case 58172:
            case 58173:
            case 58174:
            case 58175:
            case 58176:
            case 58177:
            case 58178:
            case 58179:
            case 58180:
            case 58181:
            case 58182:
            case 58183:
            case 58184:
            case 58185:
            case 58186:
            case 58187:
            case 58188:
            case 58189:
            case 58369:
            case 58370:
            case 58371:
            case 58372:
            case 58373:
            case 58374:
            case 58375:
            case 58376:
            case 58377:
            case 58378:
            case 58379:
            case 58380:
            case 58381:
            case 58382:
            case 58383:
            case 58384:
            case 58385:
            case 58386:
            case 58387:
            case 58388:
            case 58389:
            case 58390:
            case 58391:
            case 58392:
            case 58393:
            case 58394:
            case 58395:
            case 58396:
            case 58397:
            case 58398:
            case 58399:
            case 58400:
            case 58401:
            case 58402:
            case 58403:
            case 58404:
            case 58405:
            case 58406:
            case 58407:
            case 58408:
            case 58409:
            case 58410:
            case 58411:
            case 58412:
            case 58413:
            case 58414:
            case 58415:
            case 58416:
            case 58417:
            case 58418:
            case 58419:
            case 58420:
            case 58421:
            case 58422:
            case 58423:
            case 58424:
            case 58425:
            case 58426:
            case 58427:
            case 58428:
            case 58429:
            case 58430:
            case 58431:
            case 58432:
            case 58433:
            case 58434:
            case 58435:
            case 58436:
            case 58437:
            case 58438:
            case 58439:
            case 58440:
            case 58441:
            case 58442:
            case 58443:
            case 58444:
            case 58625:
            case 58626:
            case 58627:
            case 58628:
            case 58629:
            case 58630:
            case 58631:
            case 58632:
            case 58633:
            case 58634:
            case 58635:
            case 58636:
            case 58637:
            case 58638:
            case 58639:
            case 58640:
            case 58641:
            case 58642:
            case 58643:
            case 58644:
            case 58645:
            case 58646:
            case 58647:
            case 58648:
            case 58649:
            case 58650:
            case 58651:
            case 58652:
            case 58653:
            case 58654:
            case 58655:
            case 58656:
            case 58657:
            case 58658:
            case 58659:
            case 58660:
            case 58661:
            case 58662:
            case 58663:
            case 58664:
            case 58665:
            case 58666:
            case 58667:
            case 58668:
            case 58669:
            case 58670:
            case 58671:
            case 58672:
            case 58673:
            case 58674:
            case 58675:
            case 58676:
            case 58677:
            case 58678:
            case 58679:
            case 60417:
            case 60418:
            case 60419:
            case 60420:
            case 60421:
            case 60422:
            case 60423:
            case 60424:
            case 60425:
            case 60426:
            case 60427:
            case 60428:
            case 60429:
            case 60430:
            case 60431:
            case 60432:
            case 60433:
            case 60434:
            case 60435:
            case 60436:
            case 60437:
            case 60438:
            case 60439:
            case 60440:
            case 60441:
            case 60442:
            case 60443:
            case 60444:
            case 60445:
            case 60446:
            case 60447:
            case 60448:
            case 60449:
            case 60450:
            case 60451:
            case 60452:
            case 60453:
            case 60454:
            case 60455:
            case 60456:
            case 60457:
            case 60458:
            case 60459:
            case 60460:
            case 60461:
            case 60462:
            case 127183:
            case 127377:
            case 127379:
            case 127382:
            case 127384:
            case 127538:
            case 127540:
            case 127569:
            case 127745:
            case 127753:
            case 127755:
            case 127756:
            case 127757:
            case 127758:
            case 127759:
            case 127760:
            case 127761:
            case 127762:
            case 127763:
            case 127764:
            case 127765:
            case 127766:
            case 127767:
            case 127768:
            case 127770:
            case 127771:
            case 127772:
            case 127773:
            case 127774:
            case 127776:
            case 127792:
            case 127793:
            case 127794:
            case 127795:
            case 127804:
            case 127805:
            case 127807:
            case 127812:
            case 127815:
            case 127816:
            case 127819:
            case 127820:
            case 127821:
            case 127823:
            case 127824:
            case 127825:
            case 127826:
            case 127829:
            case 127830:
            case 127831:
            case 127840:
            case 127844:
            case 127845:
            case 127848:
            case 127849:
            case 127850:
            case 127851:
            case 127852:
            case 127853:
            case 127854:
            case 127855:
            case 127863:
            case 127865:
            case 127868:
            case 127882:
            case 127883:
            case 127904:
            case 127907:
            case 127914:
            case 127917:
            case 127918:
            case 127922:
            case 127923:
            case 127924:
            case 127929:
            case 127931:
            case 127932:
            case 127933:
            case 127938:
            case 127943:
            case 127945:
            case 127969:
            case 127972:
            case 127982:
            case 128000:
            case 128001:
            case 128002:
            case 128003:
            case 128004:
            case 128005:
            case 128006:
            case 128007:
            case 128008:
            case 128009:
            case 128010:
            case 128011:
            case 128012:
            case 128015:
            case 128016:
            case 128019:
            case 128021:
            case 128022:
            case 128028:
            case 128029:
            case 128030:
            case 128033:
            case 128034:
            case 128035:
            case 128037:
            case 128041:
            case 128042:
            case 128050:
            case 128060:
            case 128061:
            case 128062:
            case 128069:
            case 128083:
            case 128086:
            case 128090:
            case 128091:
            case 128093:
            case 128094:
            case 128100:
            case 128101:
            case 128106:
            case 128108:
            case 128109:
            case 128112:
            case 128121:
            case 128122:
            case 128140:
            case 128149:
            case 128150:
            case 128158:
            case 128160:
            case 128165:
            case 128167:
            case 128171:
            case 128172:
            case 128173:
            case 128174:
            case 128175:
            case 128178:
            case 128179:
            case 128180:
            case 128181:
            case 128182:
            case 128183:
            case 128184:
            case 128190:
            case 128193:
            case 128194:
            case 128195:
            case 128196:
            case 128197:
            case 128198:
            case 128199:
            case 128200:
            case 128201:
            case 128202:
            case 128203:
            case 128204:
            case 128205:
            case 128206:
            case 128207:
            case 128208:
            case 128209:
            case 128210:
            case 128211:
            case 128212:
            case 128213:
            case 128215:
            case 128216:
            case 128217:
            case 128218:
            case 128219:
            case 128220:
            case 128222:
            case 128223:
            case 128228:
            case 128229:
            case 128230:
            case 128231:
            case 128232:
            case 128234:
            case 128236:
            case 128237:
            case 128239:
            case 128240:
            case 128245:
            case 128249:
            case 128256:
            case 128257:
            case 128258:
            case 128259:
            case 128260:
            case 128261:
            case 128262:
            case 128263:
            case 128264:
            case 128265:
            case 128267:
            case 128268:
            case 128270:
            case 128271:
            case 128272:
            case 128277:
            case 128278:
            case 128279:
            case 128280:
            case 128281:
            case 128282:
            case 128283:
            case 128284:
            case 128287:
            case 128288:
            case 128289:
            case 128290:
            case 128291:
            case 128292:
            case 128294:
            case 128295:
            case 128297:
            case 128298:
            case 128300:
            case 128301:
            case 128302:
            case 128309:
            case 128310:
            case 128311:
            case 128312:
            case 128313:
            case 128314:
            case 128315:
            case 128316:
            case 128317:
            case 128348:
            case 128349:
            case 128350:
            case 128351:
            case 128352:
            case 128353:
            case 128354:
            case 128355:
            case 128356:
            case 128357:
            case 128358:
            case 128359:
            case 128510:
            case 128511:
            case 128512:
            case 128517:
            case 128518:
            case 128519:
            case 128520:
            case 128523:
            case 128526:
            case 128528:
            case 128529:
            case 128533:
            case 128535:
            case 128537:
            case 128539:
            case 128543:
            case 128548:
            case 128550:
            case 128551:
            case 128553:
            case 128555:
            case 128556:
            case 128558:
            case 128559:
            case 128564:
            case 128565:
            case 128566:
            case 128568:
            case 128569:
            case 128570:
            case 128571:
            case 128572:
            case 128573:
            case 128574:
            case 128575:
            case 128576:
            case 128584:
            case 128585:
            case 128586:
            case 128587:
            case 128589:
            case 128590:
            case 128641:
            case 128642:
            case 128646:
            case 128648:
            case 128650:
            case 128651:
            case 128653:
            case 128654:
            case 128656:
            case 128660:
            case 128662:
            case 128664:
            case 128667:
            case 128668:
            case 128669:
            case 128670:
            case 128671:
            case 128672:
            case 128673:
            case 128675:
            case 128678:
            case 128680:
            case 128681:
            case 128682:
            case 128683:
            case 128686:
            case 128687:
            case 128688:
            case 128689:
            case 128691:
            case 128692:
            case 128693:
            case 128695:
            case 128696:
            case 128703:
            case 128705:
            case 128706:
            case 128707:
            case 128708:
            case 128709: {
                return true;
            }
        }
    }
}
