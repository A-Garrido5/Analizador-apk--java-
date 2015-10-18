// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.ch;
import com.google.bl;
import com.google.fU;
import com.google.by;
import com.google.hA;

final class U implements hA
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[22];
        String s = "\u0001,\u0018D\u001c01\rT\r";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0582:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'y';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = 'E';
                        break;
                    }
                    case 2: {
                        c2 = 'h';
                        break;
                    }
                    case 3: {
                        c2 = ',';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0010 \u000fE\n67\tX\u0010-+!H";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000b1\r^\u00186,\u0007B";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000b!";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000b!";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000b!\rB\r+1\u0011g\u001c;";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0001*\u001dB\r'7";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0000$\u001bI2'<";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u000b!\rB\r+1\u0011g\u001c;";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0001,\u0018D\u001c01\rT\r";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0000$\u001bI2'<;E\u001e,$\u001cY\u000b'";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u000b!";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0001-\tE\u0017\t \u0011";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0011,\u000fB\u001c&\u0015\u001aI2'<!H";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u000b1\r^\u00186,\u0007B";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0000$\u001bI2'<";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u000f \u001b_\u0018% ";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u00127\rg\u001c;\f\f";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0010$\u001cO\u0011'1#I\u0000";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0010$\u001cO\u0011'1#I\u0000";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0011,\u000fB\u0010,\"#I\u0000";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u00127\rZ\u0010-0\u001bo\u00167+\u001cI\u000b";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    break Label_0582;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public fU assignDescriptors(final by by) {
        final int h = bR.h;
        bR.a(by);
        bR.c(bR.j().e().get(0));
        bR.b(new ch(bR.d(), new String[] { U.z[19], U.z[6], U.z[21], U.z[0] }));
        bR.a(bR.j().e().get(1));
        bR.d(new ch(bR.c(), new String[] { U.z[1], U.z[17], U.z[13], U.z[7], U.z[8], U.z[16] }));
        bR.e(bR.j().e().get(2));
        bR.a(new ch(bR.h(), new String[] { U.z[4], U.z[15], U.z[18], U.z[5], U.z[10] }));
        bR.b(bR.j().e().get(3));
        bR.c(new ch(bR.g(), new String[] { U.z[11], U.z[14], U.z[9] }));
        bR.d(bR.j().e().get(4));
        bR.e(new ch(bR.f(), new String[] { U.z[3], U.z[2], U.z[12], U.z[20] }));
        if (h != 0) {
            ++bO.s;
        }
        return null;
    }
}
