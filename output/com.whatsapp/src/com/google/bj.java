// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.List;

public enum bj
{
    public static final bj ALLOWED_EAN_EXTENSIONS;
    public static final bj ALLOWED_LENGTHS;
    public static final bj ASSUME_CODE_39_CHECK_DIGIT;
    public static final bj ASSUME_GS1;
    public static final bj CHARACTER_SET;
    public static final bj NEED_RESULT_POINT_CALLBACK;
    public static final bj OTHER;
    public static final bj POSSIBLE_FORMATS;
    public static final bj PURE_BARCODE;
    public static final bj RETURN_CODABAR_START_END;
    public static final bj TRY_HARDER;
    private static final String[] z;
    private final Class b;
    
    static {
        final String[] z2 = new String[11];
        String s = ".XcM]2Xu\\N4BvFK.IyJC,QdHA+";
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
                        c2 = '\u0002';
                        break;
                    }
                    case 0: {
                        c2 = '`';
                        break;
                    }
                    case 1: {
                        c2 = '\u001d';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = '\t';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "0HtL]\"\\tJM$X";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "/InLP";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "#Ug[C#Ic[]3Xr";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "!Nu\\O%BeFF%B\u00150]#UcJI?YoNK4";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "0RuZK\"QcVD/OkHV3";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "!QjFU%YyLC.BcQV%Su@M.N";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "!QjFU%YyEG.ZrAQ";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "!Nu\\O%BaZ3";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    s = "2Xr\\P.BeFF!_g[]3Ig[V?XhM";
                    n = 8;
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    array = z2;
                    s = "4O\u007fVJ!ObLP";
                    n = 9;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        OTHER = new bj(bj.z[2], 0, Object.class);
        PURE_BARCODE = new bj(bj.z[1], 1, Void.class);
        POSSIBLE_FORMATS = new bj(bj.z[5], 2, List.class);
        TRY_HARDER = new bj(bj.z[10], 3, Void.class);
        CHARACTER_SET = new bj(bj.z[3], 4, String.class);
        ALLOWED_LENGTHS = new bj(bj.z[7], 5, int[].class);
        ASSUME_CODE_39_CHECK_DIGIT = new bj(bj.z[4], 6, Void.class);
        ASSUME_GS1 = new bj(bj.z[8], 7, Void.class);
        RETURN_CODABAR_START_END = new bj(bj.z[9], 8, Void.class);
        NEED_RESULT_POINT_CALLBACK = new bj(bj.z[0], 9, fs.class);
        ALLOWED_EAN_EXTENSIONS = new bj(bj.z[6], 10, int[].class);
    }
    
    private bj(final String s, final int n, final Class b) {
        this.b = b;
    }
    
    public Class getValueType() {
        return this.b;
    }
}
