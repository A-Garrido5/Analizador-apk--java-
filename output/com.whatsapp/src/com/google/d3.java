// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum d3
{
    public static final d3 AZTEC;
    public static final d3 CODABAR;
    public static final d3 CODE_128;
    public static final d3 CODE_39;
    public static final d3 CODE_93;
    public static final d3 DATA_MATRIX;
    public static final d3 EAN_13;
    public static final d3 EAN_8;
    public static final d3 ITF;
    public static final d3 MAXICODE;
    public static final d3 PDF_417;
    public static final d3 QR_CODE;
    public static final d3 RSS_14;
    public static final d3 RSS_EXPANDED;
    public static final d3 UPC_A;
    public static final d3 UPC_E;
    public static final d3 UPC_EAN_EXTENSION;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[17];
        String s = "Hk\t";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0457:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '<';
                        break;
                    }
                    case 0: {
                        c2 = '\u0001';
                        break;
                    }
                    case 1: {
                        c2 = '?';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "L~\u0017*\u007fN{\n";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Bp\u000b\"~@m";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Pm\u0010 sEz";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "E~\u001b\"cL~\u001b1uY";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "D~\u0001<\u0004";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Sl\u001c<yYo\u000e-xD{";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "To\f<}";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "To\f<y";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Bp\u000b&c0\rw";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "Q{\t<\b0\b";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "To\f<y@q\u0010&dUz\u00010uNq";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "Bp\u000b&c8\f";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "@e\u001b&\u007f";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "Bp\u000b&c2\u0006";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "D~\u0001<\r2";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "Sl\u001c<\r5";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    break Label_0457;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        AZTEC = new d3(d3.z[13], 0);
        CODABAR = new d3(d3.z[2], 1);
        CODE_39 = new d3(d3.z[14], 2);
        CODE_93 = new d3(d3.z[12], 3);
        CODE_128 = new d3(d3.z[9], 4);
        DATA_MATRIX = new d3(d3.z[4], 5);
        EAN_8 = new d3(d3.z[5], 6);
        EAN_13 = new d3(d3.z[15], 7);
        ITF = new d3(d3.z[0], 8);
        MAXICODE = new d3(d3.z[1], 9);
        PDF_417 = new d3(d3.z[10], 10);
        QR_CODE = new d3(d3.z[3], 11);
        RSS_14 = new d3(d3.z[16], 12);
        RSS_EXPANDED = new d3(d3.z[6], 13);
        UPC_A = new d3(d3.z[7], 14);
        UPC_E = new d3(d3.z[8], 15);
        UPC_EAN_EXTENSION = new d3(d3.z[11], 16);
    }
    
    private d3(final String s, final int n) {
    }
}
