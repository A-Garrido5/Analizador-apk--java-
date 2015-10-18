// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.ch;
import com.google.bl;
import com.google.fU;
import com.google.by;
import com.google.hA;

final class j implements hA
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[56];
        String s = ";5@J\u0013\f#";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1432:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'X';
                        break;
                    }
                    case 0: {
                        c2 = 'i';
                        break;
                    }
                    case 1: {
                        c2 = 'Z';
                        break;
                    }
                    case 2: {
                        c2 = '/';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "%5L_4;?HW+\u001d(NJ1\u00064fZ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ":?AZ=\u001b\u0017JM+\b=Ju=\u0010)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ":?AZ=\u001b\u0011JG\u000b\u001d;[[+";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "%5L_4;;[]0\f.d[!";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "(6F]=+;\\[\u0013\f#";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = " .JL9\u001d3@P";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "9/MR1\n\u0011JG";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "+;\\[\u0013\f#";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "9(FH9\u001d?d[!";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = ":?JZ";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "=3B[+\u001d;BN";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "9(Ju=\u0010\u0013K";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = ";?BQ,\f\u0013K[6\u001d3[G\b\u001c8CW;";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "*/]L=\u0007.|[+\u001a3@P";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = ":?AZ=\u001b\tFY6\u00004Hu=\u0010";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "$;Lu=\u0010";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "9/MR1\n\u0011JG";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "9(FH9\u001d?d[!";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "9?AZ1\u0007=\u007fL=\"?V";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = ":?AZ=\u001b\u0019G_1\u0007";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = ":?^K=\u00079J";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "9(FH9\u001d?";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = " 4K[ ";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "9(JH1\u0006/\\m=\u001a)FQ6\u001a";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = ";?L[1\u001f?]}0\b3AM";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = ":?\\M1\u00064y[*\u001a3@P";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = " ,";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = ":3HP9\u001d/][";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "$?\\M9\u000e?d[!\u001a";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "9(JH1\u0006/\\}7\u001c4[[*";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = ":?AZ=\u001b\bNJ;\u0001?[u=\u0010";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = " .JL9\u001d3@P";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = ":?AZ=\u001b\bNJ;\u0001?[u=\u0010\n]W.\b.J";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "'?JZ+;?IL=\u001a2";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "9(FH9\u001d?d[!";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "%5L_4 >JP,\u0000.Vu=\u0010";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "9/MR1\n\u0011JG";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = ";?BQ,\f\bJY1\u001a.]_,\u00005Aw<";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = ":3HP=\r\n][\u0013\f#fZ";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "%5L_4+;\\[\u0013\f#\u007fL1\u001f;[[";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\"?V";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = ":?AZ=\u001b\u0011JG\u0011\r";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "%5L_4;;[]0\f.d[!9(FH9\u001d?";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = ":?JZ";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "%5L_4+;\\[\u0013\f#";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = " >";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    s = "*2NW6\"?V";
                    n = 46;
                    n2 = 47;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    array = z2;
                    s = "9?AZ1\u0007=d[!,\"LV9\u0007=J";
                    n = 47;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "%5L_4 >JP,\u0000.Vu=\u0010\n]W.\b.J";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = ":?AZ=\u001b\u0019G_1\u0007\u0011JG";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "*3_V=\u001b\u0011JG";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = " >";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "%5L_4 >JP,\u0000.Vn-\u000b6F]";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = " 4K[ ";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "9/MR1\n";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    break Label_1432;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public fU assignDescriptors(final by by) {
        final boolean o = aZ.o;
        bO.a(by);
        bO.n(bO.C().e().get(0));
        bO.l(new ch(bO.x(), new String[] { j.z[26], j.z[53], j.z[13], j.z[0], j.z[30], j.z[20], j.z[25], j.z[48], j.z[19], j.z[38], j.z[1], j.z[34], j.z[5] }));
        bO.f(bO.x().g().get(0));
        bO.c(new ch(bO.a(), new String[] { j.z[31], j.z[33], j.z[47], j.z[29] }));
        bO.c(bO.a().g().get(0));
        bO.i(new ch(bO.y(), new String[] { j.z[54], j.z[41] }));
        bO.k(bO.a().g().get(1));
        bO.g(new ch(bO.E(), new String[] { j.z[23], j.z[51], j.z[16], j.z[27] }));
        bO.j(bO.x().g().get(1));
        bO.j(new ch(bO.e(), new String[] { j.z[21], j.z[45], j.z[40], j.z[4], j.z[43], j.z[36], j.z[49] }));
        bO.g(bO.x().g().get(2));
        bO.b(new ch(bO.D(), new String[] { j.z[12], j.z[39], j.z[8] }));
        bO.o(bO.C().e().get(1));
        bO.m(new ch(bO.f(), new String[] { j.z[14], j.z[24] }));
        bO.d(bO.C().e().get(2));
        bO.d(new ch(bO.c(), new String[] { j.z[52], j.z[7], j.z[35] }));
        bO.a(bO.C().e().get(3));
        bO.h(new ch(bO.j(), new String[] { j.z[46], j.z[17], j.z[9], j.z[28], j.z[11] }));
        bO.i(bO.C().e().get(4));
        bO.f(new ch(bO.n(), new String[] { j.z[37], j.z[18] }));
        bO.e(bO.C().e().get(5));
        bO.o(new ch(bO.A(), new String[] { j.z[42], j.z[50], j.z[15], j.z[2] }));
        bO.l(bO.A().g().get(0));
        bO.n(new ch(bO.b(), new String[] { j.z[6], j.z[44] }));
        bO.h(bO.A().g().get(1));
        bO.k(new ch(bO.d(), new String[] { j.z[32], j.z[10] }));
        bO.m(bO.A().g().get(2));
        bO.e(new ch(bO.u(), new String[] { j.z[55], j.z[22] }));
        bO.b(bO.C().e().get(6));
        bO.a(new ch(bO.p(), new String[] { j.z[3] }));
        if (o) {
            ++bO.s;
        }
        return null;
    }
}
