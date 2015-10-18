// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public interface bj
{
    public static final String[] a = a2;
    
    default static {
        String[] array = new String[115];
        array[0] = null;
        array[2] = (array[1] = null);
        int n = 3;
        String s = "Z=?";
        int n2 = -1;
        final String[] a2 = array;
        String intern = null;
    Label_2810:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '$';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = '\r';
                        break;
                    }
                    case 2: {
                        c2 = '\u000f';
                        break;
                    }
                    case 3: {
                        c2 = '8';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n] = intern;
                    n = 4;
                    array = a2;
                    s = "\\=?";
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n] = intern;
                    n = 5;
                    s = "\\=;";
                    n2 = 1;
                    array = a2;
                    continue;
                }
                case 1: {
                    array[n] = intern;
                    n = 6;
                    s = "]=?";
                    n2 = 2;
                    array = a2;
                    continue;
                }
                case 2: {
                    array[n] = intern;
                    n = 7;
                    s = "]=>";
                    n2 = 3;
                    array = a2;
                    continue;
                }
                case 3: {
                    array[n] = intern;
                    n = 8;
                    s = "]==";
                    n2 = 4;
                    array = a2;
                    continue;
                }
                case 4: {
                    array[n] = intern;
                    n = 9;
                    s = "\tn{QK\u0006";
                    n2 = 5;
                    array = a2;
                    continue;
                }
                case 5: {
                    array[n] = intern;
                    n = 10;
                    s = "\tik";
                    n2 = 6;
                    array = a2;
                    continue;
                }
                case 6: {
                    array[n] = intern;
                    n = 11;
                    s = "\tk{]V";
                    n2 = 7;
                    array = a2;
                    continue;
                }
                case 7: {
                    array[n] = intern;
                    n = 12;
                    s = "\t\u007flPM\u001eh";
                    n2 = 8;
                    array = a2;
                    continue;
                }
                case 8: {
                    array[n] = intern;
                    s = "\tx{PK\u001a";
                    n2 = 9;
                    n = 13;
                    array = a2;
                    continue;
                }
                case 9: {
                    array[n] = intern;
                    n = 14;
                    s = "\t{nQH\toc]";
                    n2 = 10;
                    array = a2;
                    continue;
                }
                case 10: {
                    array[n] = intern;
                    s = "\nl{LA\u001at";
                    n2 = 11;
                    n = 15;
                    array = a2;
                    continue;
                }
                case 11: {
                    array[n] = intern;
                    n = 16;
                    s = "\nhiWV\r";
                    n2 = 12;
                    array = a2;
                    continue;
                }
                case 12: {
                    array[n] = intern;
                    n = 17;
                    array = a2;
                    s = "\nbkA";
                    n2 = 13;
                    continue;
                }
                case 13: {
                    array[n] = intern;
                    n = 18;
                    s = "\n\u007f`Y@\u000bl|L";
                    n2 = 14;
                    array = a2;
                    continue;
                }
                case 14: {
                    array[n] = intern;
                    n = 19;
                    array = a2;
                    s = "\u000benL";
                    n2 = 15;
                    continue;
                }
                case 15: {
                    array[n] = intern;
                    n = 20;
                    s = "\u000bajYV";
                    n2 = 16;
                    array = a2;
                    continue;
                }
                case 16: {
                    array[n] = intern;
                    n = 21;
                    s = "\u000bbk]";
                    n2 = 17;
                    array = a2;
                    continue;
                }
                case 17: {
                    array[n] = intern;
                    n = 22;
                    s = "\u000bbbHK\u001bda_";
                    n2 = 18;
                    array = a2;
                    continue;
                }
                case 18: {
                    array[n] = intern;
                    n = 23;
                    s = "\u000bbaLE\u000by|";
                    n2 = 19;
                    array = a2;
                    continue;
                }
                case 19: {
                    array[n] = intern;
                    n = 24;
                    s = "\u000bbzVP";
                    n2 = 20;
                    array = a2;
                    continue;
                }
                case 20: {
                    array[n] = intern;
                    n = 25;
                    s = "\u000b\u007fjYP\r";
                    n2 = 21;
                    array = a2;
                    continue;
                }
                case 21: {
                    array[n] = intern;
                    n = 26;
                    s = "\fhmMC";
                    n2 = 22;
                    array = a2;
                    continue;
                }
                case 22: {
                    array[n] = intern;
                    n = 27;
                    s = "\fhc]P\r";
                    n2 = 23;
                    array = a2;
                    continue;
                }
                case 23: {
                    array[n] = intern;
                    n = 28;
                    s = "\fhbWP\r";
                    n2 = 24;
                    array = a2;
                    continue;
                }
                case 24: {
                    array[n] = intern;
                    n = 29;
                    s = "\fx\u007fTM\u000bl{]";
                    n2 = 25;
                    array = a2;
                    continue;
                }
                case 25: {
                    array[n] = intern;
                    n = 30;
                    s = "\rclW@\u0001ch";
                    n2 = 26;
                    array = a2;
                    continue;
                }
                case 26: {
                    array[n] = intern;
                    n = 31;
                    s = "\r\u007f}WV";
                    n2 = 27;
                    array = a2;
                    continue;
                }
                case 27: {
                    array[n] = intern;
                    n = 32;
                    s = "\u000elcKA";
                    n2 = 28;
                    array = a2;
                    continue;
                }
                case 28: {
                    array[n] = intern;
                    n = 33;
                    s = "\u000edc]L\t~g";
                    n2 = 29;
                    array = a2;
                    continue;
                }
                case 29: {
                    array[n] = intern;
                    n = 34;
                    s = "\u000e\u007f`U";
                    n2 = 30;
                    array = a2;
                    continue;
                }
                case 30: {
                    array[n] = intern;
                    n = 35;
                    s = "\u000f#zK";
                    n2 = 31;
                    array = a2;
                    continue;
                }
                case 31: {
                    array[n] = intern;
                    s = "\u000f\u007f`MT";
                    n2 = 32;
                    n = 36;
                    array = a2;
                    continue;
                }
                case 32: {
                    array[n] = intern;
                    n = 37;
                    s = "\u000f\u007f`MT\u001bRy\n";
                    n2 = 33;
                    array = a2;
                    continue;
                }
                case 33: {
                    array[n] = intern;
                    n = 38;
                    s = "\u0000hf_L\u001c";
                    n2 = 34;
                    array = a2;
                    continue;
                }
                case 34: {
                    array[n] = intern;
                    n = 39;
                    s = "\u0001i";
                    n2 = 35;
                    array = a2;
                    continue;
                }
                case 35: {
                    array[n] = intern;
                    n = 40;
                    array = a2;
                    s = "\u0001`n_A";
                    n2 = 36;
                    continue;
                }
                case 36: {
                    array[n] = intern;
                    n = 41;
                    s = "\u0001c";
                    n2 = 37;
                    array = a2;
                    continue;
                }
                case 37: {
                    array[n] = intern;
                    n = 42;
                    s = "\u0001ck]\\";
                    n2 = 38;
                    array = a2;
                    continue;
                }
                case 38: {
                    array[n] = intern;
                    n = 43;
                    s = "\u0001cyQW";
                    n2 = 39;
                    array = a2;
                    continue;
                }
                case 39: {
                    array[n] = intern;
                    n = 44;
                    s = "\u0001yjU";
                    n2 = 40;
                    array = a2;
                    continue;
                }
                case 40: {
                    array[n] = intern;
                    n = 45;
                    s = "\u0002dk";
                    n2 = 41;
                    array = a2;
                    continue;
                }
                case 41: {
                    array[n] = intern;
                    n = 46;
                    s = "\u0003da\\";
                    n2 = 42;
                    array = a2;
                    continue;
                }
                case 42: {
                    array[n] = intern;
                    n = 47;
                    s = "\u0004l|L";
                    n2 = 43;
                    array = a2;
                    continue;
                }
                case 43: {
                    array[n] = intern;
                    n = 48;
                    s = "\u0004hnNA";
                    n2 = 44;
                    array = a2;
                    continue;
                }
                case 44: {
                    array[n] = intern;
                    n = 49;
                    s = "\u0004dy]";
                    n2 = 45;
                    array = a2;
                    continue;
                }
                case 45: {
                    array[n] = intern;
                    n = 50;
                    s = "\u0004bh";
                    n2 = 46;
                    array = a2;
                    continue;
                }
                case 46: {
                    array[n] = intern;
                    n = 51;
                    s = "\u0005hkQE";
                    n2 = 47;
                    array = a2;
                    continue;
                }
                case 47: {
                    array[n] = intern;
                    n = 52;
                    s = "\u0005h|KE\u000fh";
                    n2 = 48;
                    array = a2;
                    continue;
                }
                case 48: {
                    array[n] = intern;
                    n = 53;
                    s = "\u0005db]P\u0011}j";
                    n2 = 49;
                    array = a2;
                    continue;
                }
                case 49: {
                    array[n] = intern;
                    n = 54;
                    s = "\u0005d|KM\u0006j";
                    n2 = 50;
                    array = a2;
                    continue;
                }
                case 50: {
                    array[n] = intern;
                    n = 55;
                    s = "\u0005bkQB\u0011";
                    n2 = 51;
                    array = a2;
                    continue;
                }
                case 51: {
                    array[n] = intern;
                    s = "\u0006lb]";
                    n2 = 52;
                    n = 56;
                    array = a2;
                    continue;
                }
                case 52: {
                    array[n] = intern;
                    n = 57;
                    s = "\u0006b{QB\u0001nnLM\u0007c";
                    n2 = 53;
                    array = a2;
                    continue;
                }
                case 53: {
                    array[n] = intern;
                    n = 58;
                    s = "\u0006b{QB\u0011";
                    n2 = 54;
                    array = a2;
                    continue;
                }
                case 54: {
                    array[n] = intern;
                    n = 59;
                    s = "\u0007x{";
                    n2 = 55;
                    array = a2;
                    continue;
                }
                case 55: {
                    array[n] = intern;
                    n = 60;
                    array = a2;
                    s = "\u0007za]V";
                    n2 = 56;
                    continue;
                }
                case 56: {
                    array[n] = intern;
                    n = 61;
                    s = "\u0018l}LM\u000bd\u007fYJ\u001c";
                    n2 = 57;
                    array = a2;
                    continue;
                }
                case 57: {
                    array[n] = intern;
                    n = 62;
                    s = "\u0018lzKA\f";
                    n2 = 58;
                    array = a2;
                    continue;
                }
                case 58: {
                    array[n] = intern;
                    n = 63;
                    s = "\u0018dlLQ\u001ah";
                    n2 = 59;
                    array = a2;
                    continue;
                }
                case 59: {
                    array[n] = intern;
                    n = 64;
                    s = "\u0018anAA\f";
                    n2 = 60;
                    array = a2;
                    continue;
                }
                case 60: {
                    array[n] = intern;
                    n = 65;
                    s = "\u0018\u007fjKA\u0006nj";
                    n2 = 61;
                    array = a2;
                    continue;
                }
                case 61: {
                    array[n] = intern;
                    n = 66;
                    s = "\u0018\u007fjNM\rz";
                    n2 = 62;
                    array = a2;
                    continue;
                }
                case 62: {
                    array[n] = intern;
                    n = 67;
                    s = "\u0018\u007f`UK\u001ch";
                    n2 = 63;
                    array = a2;
                    continue;
                }
                case 63: {
                    array[n] = intern;
                    n = 68;
                    s = "\u0019xjJ]";
                    n2 = 64;
                    array = a2;
                    continue;
                }
                case 64: {
                    array[n] = intern;
                    n = 69;
                    s = "\u001alx";
                    n2 = 65;
                    array = a2;
                    continue;
                }
                case 65: {
                    array[n] = intern;
                    n = 70;
                    s = "\u001ahn\\";
                    n2 = 66;
                    array = a2;
                    continue;
                }
                case 66: {
                    array[n] = intern;
                    n = 71;
                    s = "\u001ahl]M\u0018y";
                    n2 = 67;
                    array = a2;
                    continue;
                }
                case 67: {
                    array[n] = intern;
                    n = 72;
                    s = "\u001ahl]M\u001ehk";
                    n2 = 68;
                    array = a2;
                    continue;
                }
                case 68: {
                    array[n] = intern;
                    n = 73;
                    s = "\u001ahlQT\u0001haL";
                    n2 = 69;
                    array = a2;
                    continue;
                }
                case 69: {
                    array[n] = intern;
                    n = 74;
                    s = "\u001ahlWV\fda_";
                    n2 = 70;
                    array = a2;
                    continue;
                }
                case 70: {
                    array[n] = intern;
                    n = 75;
                    s = "\u001ahcY]";
                    n2 = 71;
                    array = a2;
                    continue;
                }
                case 71: {
                    array[n] = intern;
                    n = 76;
                    s = "\u001ahbWR\r";
                    n2 = 72;
                    array = a2;
                    continue;
                }
                case 72: {
                    array[n] = intern;
                    n = 77;
                    s = "\u001ah|HK\u0006~j";
                    n2 = 73;
                    array = a2;
                    continue;
                }
                case 73: {
                    array[n] = intern;
                    n = 78;
                    s = "\u001ah|MI\r";
                    n2 = 74;
                    array = a2;
                    continue;
                }
                case 74: {
                    array[n] = intern;
                    n = 79;
                    s = "\u001ah{J]";
                    n2 = 75;
                    array = a2;
                    continue;
                }
                case 75: {
                    array[n] = intern;
                    n = 80;
                    s = "\u001b#xPE\u001c~nHTFcjL";
                    n2 = 76;
                    array = a2;
                    continue;
                }
                case 76: {
                    array[n] = intern;
                    n = 81;
                    s = "\u001bhlWJ\f~";
                    n2 = 77;
                    array = a2;
                    continue;
                }
                case 77: {
                    array[n] = intern;
                    n = 82;
                    s = "\u001bh{";
                    n2 = 78;
                    array = a2;
                    continue;
                }
                case 78: {
                    array[n] = intern;
                    n = 83;
                    s = "\u001bdu]";
                    n2 = 79;
                    array = a2;
                    continue;
                }
                case 79: {
                    array[n] = intern;
                    n = 84;
                    s = "\u001bynLQ\u001b";
                    n2 = 80;
                    array = a2;
                    continue;
                }
                case 80: {
                    array[n] = intern;
                    n = 85;
                    s = "\u001bxmRA\u000by";
                    n2 = 81;
                    array = a2;
                    continue;
                }
                case 81: {
                    array[n] = intern;
                    n = 86;
                    s = "\u001bxmKG\u001adm]";
                    n2 = 82;
                    array = a2;
                    continue;
                }
                case 82: {
                    array[n] = intern;
                    a2[87] = "t";
                    n = 88;
                    s = "\u001chwL";
                    n2 = 83;
                    array = a2;
                    continue;
                }
                case 83: {
                    array[n] = intern;
                    n = 89;
                    s = "\u001cb";
                    n2 = 84;
                    array = a2;
                    continue;
                }
                case 84: {
                    array[n] = intern;
                    n = 90;
                    s = "\u001c\u007fz]";
                    n2 = 85;
                    array = a2;
                    continue;
                }
                case 85: {
                    array[n] = intern;
                    n = 91;
                    s = "\u001ct\u007f]";
                    n2 = 86;
                    array = a2;
                    continue;
                }
                case 86: {
                    array[n] = intern;
                    n = 92;
                    s = "\u001dcnJG\u0000dy]";
                    n2 = 87;
                    array = a2;
                    continue;
                }
                case 87: {
                    array[n] = intern;
                    n = 93;
                    s = "\u001dcnNE\u0001anZH\r";
                    n2 = 88;
                    array = a2;
                    continue;
                }
                case 88: {
                    array[n] = intern;
                    n = 94;
                    s = "\u001d\u007fc";
                    n2 = 89;
                    array = a2;
                    continue;
                }
                case 89: {
                    array[n] = intern;
                    n = 95;
                    s = "\u001d~jJ";
                    n2 = 90;
                    array = a2;
                    continue;
                }
                case 90: {
                    array[n] = intern;
                    n = 96;
                    s = "\u001elcMA";
                    n2 = 91;
                    array = a2;
                    continue;
                }
                case 91: {
                    array[n] = intern;
                    n = 97;
                    s = "\u001fhm";
                    n2 = 92;
                    array = a2;
                    continue;
                }
                case 92: {
                    array[n] = intern;
                    n = 98;
                    s = "\u001fdkLL";
                    n2 = 93;
                    array = a2;
                    continue;
                }
                case 93: {
                    array[n] = intern;
                    n = 99;
                    s = "\u0005x{]";
                    n2 = 94;
                    array = a2;
                    continue;
                }
                case 94: {
                    array[n] = intern;
                    n = 100;
                    s = "\u001ahn\\{\u0007ccA";
                    n2 = 95;
                    array = a2;
                    continue;
                }
                case 95: {
                    array[n] = intern;
                    n = 101;
                    s = "\tibQJ";
                    n2 = 96;
                    array = a2;
                    continue;
                }
                case 96: {
                    array[n] = intern;
                    n = 102;
                    s = "\u000b\u007fjYP\u0007\u007f";
                    n2 = 97;
                    array = a2;
                    continue;
                }
                case 97: {
                    array[n] = intern;
                    n = 103;
                    s = "\u001be`JP";
                    n2 = 98;
                    array = a2;
                    continue;
                }
                case 98: {
                    array[n] = intern;
                    n = 104;
                    s = "\u001d}kYP\r";
                    n2 = 99;
                    array = a2;
                    continue;
                }
                case 99: {
                    array[n] = intern;
                    n = 105;
                    s = "\u0018bx]V\u001bly]";
                    n2 = 100;
                    array = a2;
                    continue;
                }
                case 100: {
                    array[n] = intern;
                    n = 106;
                    s = "\u000bej[O\u001bxb";
                    n2 = 101;
                    array = a2;
                    continue;
                }
                case 101: {
                    array[n] = intern;
                    n = 107;
                    s = "\r}`[L";
                    n2 = 102;
                    array = a2;
                    continue;
                }
                case 102: {
                    array[n] = intern;
                    n = 108;
                    s = "\na`[O";
                    n2 = 103;
                    array = a2;
                    continue;
                }
                case 103: {
                    array[n] = intern;
                    n = 109;
                    s = "\u0018\u007fjNM\u0007x|";
                    n2 = 104;
                    array = a2;
                    continue;
                }
                case 104: {
                    array[n] = intern;
                    n = 110;
                    s = "\\=6";
                    n2 = 105;
                    array = a2;
                    continue;
                }
                case 105: {
                    array[n] = intern;
                    n = 111;
                    s = "\u001ah\u007fTE\u000bhk";
                    n2 = 106;
                    array = a2;
                    continue;
                }
                case 106: {
                    array[n] = intern;
                    n = 112;
                    s = "\u001ahnKK\u0006";
                    n2 = 107;
                    array = a2;
                    continue;
                }
                case 107: {
                    array[n] = intern;
                    n = 113;
                    s = "\u001b}nU";
                    n2 = 108;
                    array = a2;
                    continue;
                }
                case 108: {
                    array[n] = intern;
                    n = 114;
                    s = "\u0005bkQB\u0011R{YC";
                    n2 = 109;
                    array = a2;
                    continue;
                }
                case 109: {
                    break Label_2810;
                }
            }
        }
        array[n] = intern;
    }
}
