// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.BidiFormatter$Builder;
import android.os.Build$VERSION;
import android.support.v4.text.BidiFormatter;

public class alm
{
    public static final BidiFormatter a;
    public static final boolean b;
    public static final boolean c;
    private static final String[] d;
    private static final String[] z;
    
    static {
        int c2 = 1;
        final String[] array = new String[10];
        String s = "\u204e\u206b";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
    Label_0022:
        while (true) {
            final char[] charArray = s.toCharArray();
            final int length = charArray.length;
            int n3 = 0;
            String intern = null;
            Label_0481: {
                Label_0457: {
                    Label_0433: {
                        Label_0410: {
                            Label_0388: {
                                Label_0366: {
                                    Label_0344: {
                                        Label_0322: {
                                        Label_0300:
                                            while (true) {
                                                Label_0544: {
                                                    if (length > n3) {
                                                        break Label_0544;
                                                    }
                                                    intern = new String(charArray).intern();
                                                    Label_1756: {
                                                        switch (n) {
                                                            default: {
                                                                break Label_0300;
                                                            }
                                                            case 0: {
                                                                break Label_0322;
                                                            }
                                                            case 1: {
                                                                break Label_0344;
                                                            }
                                                            case 2: {
                                                                break Label_0366;
                                                            }
                                                            case 3: {
                                                                break Label_0388;
                                                            }
                                                            case 4: {
                                                                break Label_0410;
                                                            }
                                                            case 5: {
                                                                break Label_0433;
                                                            }
                                                            case 6: {
                                                                break Label_0457;
                                                            }
                                                            case 7: {
                                                                break Label_0481;
                                                            }
                                                            case 9: {
                                                                break Label_1756;
                                                            }
                                                            case 10: {
                                                                break Label_1756;
                                                            }
                                                            case 11: {
                                                                break Label_1756;
                                                            }
                                                            case 12: {
                                                                break Label_1756;
                                                            }
                                                            case 13: {
                                                                break Label_1756;
                                                            }
                                                            case 14: {
                                                                break Label_1756;
                                                            }
                                                            case 15: {
                                                                break Label_1756;
                                                            }
                                                            case 16: {
                                                                break Label_1756;
                                                            }
                                                            case 17: {
                                                                break Label_1756;
                                                            }
                                                            case 18: {
                                                                break Label_1756;
                                                            }
                                                            case 19: {
                                                                break Label_1756;
                                                            }
                                                            case 20: {
                                                                break Label_1756;
                                                            }
                                                            case 21: {
                                                                break Label_1756;
                                                            }
                                                            case 22: {
                                                                break Label_1756;
                                                            }
                                                            case 23: {
                                                                break Label_1756;
                                                            }
                                                            case 24: {
                                                                break Label_1756;
                                                            }
                                                            case 25: {
                                                                break Label_1756;
                                                            }
                                                            case 26: {
                                                                break Label_1756;
                                                            }
                                                            case 27: {
                                                                break Label_1756;
                                                            }
                                                            case 28: {
                                                                break Label_1756;
                                                            }
                                                            case 29: {
                                                                break Label_1756;
                                                            }
                                                            case 30: {
                                                                break Label_1756;
                                                            }
                                                            case 31: {
                                                                break Label_1756;
                                                            }
                                                            case 32: {
                                                                break Label_1756;
                                                            }
                                                            case 33: {
                                                                break Label_1756;
                                                            }
                                                            case 34: {
                                                                break Label_1756;
                                                            }
                                                            case 35: {
                                                                break Label_1756;
                                                            }
                                                            case 36: {
                                                                break Label_1756;
                                                            }
                                                            case 37: {
                                                                break Label_1756;
                                                            }
                                                            case 38: {
                                                                break Label_1756;
                                                            }
                                                            case 39: {
                                                                break Label_1756;
                                                            }
                                                            case 40: {
                                                                break Label_1756;
                                                            }
                                                            case 41: {
                                                                break Label_1756;
                                                            }
                                                            case 42: {
                                                                break Label_1756;
                                                            }
                                                            case 43: {
                                                                break Label_1756;
                                                            }
                                                            case 44: {
                                                                break Label_1756;
                                                            }
                                                            case 45: {
                                                                break Label_1756;
                                                            }
                                                            case 46: {
                                                                break Label_1756;
                                                            }
                                                            case 47: {
                                                                break Label_1756;
                                                            }
                                                            case 48: {
                                                                break Label_1756;
                                                            }
                                                            case 49: {
                                                                break Label_1756;
                                                            }
                                                            case 50: {
                                                                break Label_1756;
                                                            }
                                                            case 51: {
                                                                break Label_1756;
                                                            }
                                                            case 52: {
                                                                break Label_1756;
                                                            }
                                                            case 53: {
                                                                break Label_1756;
                                                            }
                                                            case 54: {
                                                                break Label_1756;
                                                            }
                                                            case 55: {
                                                                break Label_1756;
                                                            }
                                                            case 56: {
                                                                break Label_1756;
                                                            }
                                                        }
                                                        while (true) {
                                                            array2[n2] = intern;
                                                            z = array3;
                                                            while (true) {
                                                                try {
                                                                    final String[] array4 = new String[48];
                                                                    s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u0019Ms\u0002p";
                                                                    n = 9;
                                                                    array2 = array4;
                                                                    array3 = array4;
                                                                    n2 = 0;
                                                                    continue Label_0022;
                                                                    array2[n2] = intern;
                                                                    d = array3;
                                                                    // iftrue(Label_1819:, Build$VERSION.SDK_INT < 17)
                                                                    break Label_1780;
                                                                    array2[n2] = intern;
                                                                    n2 = 33;
                                                                    s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b^t\u0010v";
                                                                    n = 42;
                                                                    array2 = array3;
                                                                    continue Label_0022;
                                                                    Label_0584: {
                                                                        final char c3 = '?';
                                                                    }
                                                                    // switch([Lcom.strobel.decompiler.ast.Label;@6f799498, n3 % 5)
                                                                    while (true) {
                                                                        break Label_0588;
                                                                        array2[n2] = intern;
                                                                        n2 = 20;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b_u\u0017x";
                                                                        n = 29;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        Label_0605:
                                                                        char c3 = 'A';
                                                                        break Label_0588;
                                                                        array2[n2] = intern;
                                                                        n2 = 47;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001bGt\u000bs";
                                                                        n = 56;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 21;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b_u\u0017\u0006";
                                                                        n = 30;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        final char c4 = charArray[n3];
                                                                        array2[n2] = intern;
                                                                        n2 = 31;
                                                                        s = "\u0007\u0013\u001eNpo\u000b\u0019]o\u0005";
                                                                        n = 40;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 42;
                                                                        s = "uoa9~os\u007f$\ty";
                                                                        n = 51;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 5;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b^t\u000bp";
                                                                        n = 14;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 9;
                                                                        s = "\u0007\b\u0003Ry\u0005\u0012\u007fA\u000eo\u0006\u0018Yx\u0004\u0013\u0013Ez\u0000\u0005\u007fOv\r\u0000c";
                                                                        n = 18;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 16;
                                                                        s = "\u0012\n\u0010E}\u000f\b\u001a7m\u000e\fq&\u0011roa";
                                                                        n = 25;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 46;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001bGs\u0002p";
                                                                        n = 55;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 37;
                                                                        s = "uoa9\ro\u0000\u007f'\u0011ws";
                                                                        n = 46;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 15;
                                                                        s = "uod9\u000elpb#`\u0005\u0007\u0001:\rrp";
                                                                        n = 24;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 17;
                                                                        s = "\u0007\u0013\u001eNpo\u000b\u0019]o\u0002";
                                                                        n = 26;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 12;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b_t\u0004u";
                                                                        n = 21;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 8;
                                                                        s = "\b\u001b\u0010Sp\u0013o\u00079\u000bo\u0007\u0018Y~\r";
                                                                        n = 17;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 34;
                                                                        s = "\u0007\b\u0003Ry\u0005\u0012\u007fA\u000eo\u0006\u0018Yx\u0004\u0013\u0013Ez\u0000\u0005\u007fOh\n\r`";
                                                                        n = 43;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 32;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\tOt\u0011\n";
                                                                        n = 41;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b_s\u0003s";
                                                                        n = 12;
                                                                        n2 = 3;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b_t\u0006s";
                                                                        n = 10;
                                                                        n2 = c2;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b_t\u000bp";
                                                                        n = 11;
                                                                        n2 = 2;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 26;
                                                                        s = "\u000b\u0013\u0015Yz\f\u001e\u0004$`sod.\u0011q";
                                                                        n = 35;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 36;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b]t\u0010t";
                                                                        n = 45;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 35;
                                                                        s = "\u000e\r\bRr\u001e\u0014eH\u000boy\u007f'";
                                                                        n = 44;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        c = (c2 != 0);
                                                                        b = b();
                                                                        a = new BidiFormatter$Builder().setTextDirectionHeuristic(new c1()).build();
                                                                        return;
                                                                        array2[n2] = intern;
                                                                        n2 = 29;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\tOs\fw";
                                                                        n = 38;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 39;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b^s\u0003r";
                                                                        n = 48;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b^t\u0006r";
                                                                        n = 13;
                                                                        n2 = 4;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 40;
                                                                        s = "\u0007\b\u0003Ry\u0005\u0012\u007fA\u000eo\u0006\u0018Yx\u0004\u0013\u0013Ez\u0000\u0005\u007fOh\n\u000bc";
                                                                        n = 49;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 14;
                                                                        s = "\u000f$)cm.,";
                                                                        n = 23;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 30;
                                                                        s = "wod9\u000elpg \u0012\u0012\u0011\u0015:v\u0013\u0005|#\u000f";
                                                                        n = 39;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        Label_0626:
                                                                        c3 = '\u0017';
                                                                        break Label_0588;
                                                                        array2[n2] = intern;
                                                                        n2 = 41;
                                                                        s = "\u0006\u0013\u001b.\u000f";
                                                                        n = 50;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 18;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b^u\u0017y";
                                                                        n = 27;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 6;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b]t\u0006p";
                                                                        n = 15;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 45;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001bGt\u0011\u0004";
                                                                        n = 54;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 22;
                                                                        s = "wod9\u000e\u001evb:l\u0011\u0005|^m\u0005lc&";
                                                                        n = 31;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 24;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b^u\u0017\u0006";
                                                                        n = 33;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        charArray[n3] = (char)(c3 ^ c4);
                                                                        ++n3;
                                                                        break;
                                                                        array2[n2] = intern;
                                                                        n2 = 28;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b_t\u0010u";
                                                                        n = 37;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 19;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b_u\u0017\u0003";
                                                                        n = 28;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 25;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\tOt\bw";
                                                                        n = 34;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 7;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b]t\u000bp";
                                                                        n = 16;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        Label_0612:
                                                                        c3 = 'A';
                                                                        continue;
                                                                        array2[n2] = intern;
                                                                        n2 = 23;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b]u\u0017\u0003";
                                                                        n = 32;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 10;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001b_s\fp";
                                                                        n = 19;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 27;
                                                                        s = "\u0007\u0013\u001eNpo\u000b\u0018]o\u0002";
                                                                        n = 36;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 38;
                                                                        s = "\t$3Zv\u0014\bqA\t";
                                                                        n = 47;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 44;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001bGt\u0011s";
                                                                        n = 53;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        array2[n2] = intern;
                                                                        n2 = 43;
                                                                        s = "\u0006\b\u001fPz\u0013\u0003\u0003R~\u0005o\u001bGs\u0000s";
                                                                        n = 52;
                                                                        array2 = array3;
                                                                        continue Label_0022;
                                                                        Label_0619:
                                                                        c3 = 'Q';
                                                                        continue;
                                                                    }
                                                                    array2[n2] = intern;
                                                                    n2 = 13;
                                                                    s = "\u0007\u0013\u0016/\f";
                                                                    n = 22;
                                                                    array2 = array3;
                                                                    continue Label_0022;
                                                                    array2[n2] = intern;
                                                                    n2 = 11;
                                                                    s = "\u0019\u0016\u001aCwo\t\u0014Um\u0004\u0016";
                                                                    n = 20;
                                                                    array2 = array3;
                                                                    continue Label_0022;
                                                                }
                                                                catch (IllegalArgumentException ex) {
                                                                    throw ex;
                                                                }
                                                                Label_1819: {
                                                                    c2 = 0;
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            array2[n2] = intern;
                                            s = "\u0015$)cz,.;~s #4{\u0010(2\u0005rG5\r\u0005E\u001f5$)c\u001f(2qrR15(7P3a?bS-";
                                            n2 = c2;
                                            array2 = array3;
                                            n = 0;
                                            continue;
                                        }
                                        array2[n2] = intern;
                                        s = ",\u0006#vI(5(";
                                        n2 = 2;
                                        array2 = array3;
                                        n = c2;
                                        continue;
                                    }
                                    array2[n2] = intern;
                                    s = ",\u0006#vI(5(";
                                    n2 = 3;
                                    array2 = array3;
                                    n = 2;
                                    continue;
                                }
                                array2[n2] = intern;
                                s = "$/5Z^3&8y";
                                n2 = 4;
                                array2 = array3;
                                n = 3;
                                continue;
                            }
                            array2[n2] = intern;
                            n2 = 5;
                            array2 = array3;
                            s = "250eK\f #pV/";
                            n = 4;
                            continue;
                        }
                        array2[n2] = intern;
                        n2 = 6;
                        s = "\")4tT35=";
                        n = 5;
                        array2 = array3;
                        continue;
                    }
                    array2[n2] = intern;
                    n2 = 7;
                    s = "' ";
                    n = 6;
                    array2 = array3;
                    continue;
                }
                array2[n2] = intern;
                n2 = 8;
                s = " 3";
                n = 7;
                array2 = array3;
                continue;
            }
            array2[n2] = intern;
            n2 = 9;
            s = "43";
            n = 8;
            array2 = array3;
        }
    }
    
    public static char a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //     3: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //     6: astore_0       
        //     7: getstatic       com/whatsapp/alm.z:[Ljava/lang/String;
        //    10: bipush          8
        //    12: aaload         
        //    13: aload_0        
        //    14: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    17: istore          4
        //    19: iload           4
        //    21: ifne            58
        //    24: getstatic       com/whatsapp/alm.z:[Ljava/lang/String;
        //    27: bipush          7
        //    29: aaload         
        //    30: aload_0        
        //    31: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    34: istore          5
        //    36: iload           5
        //    38: ifne            58
        //    41: getstatic       com/whatsapp/alm.z:[Ljava/lang/String;
        //    44: bipush          9
        //    46: aaload         
        //    47: aload_0        
        //    48: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    51: istore          6
        //    53: iload           6
        //    55: ifeq            71
        //    58: sipush          1548
        //    61: ireturn        
        //    62: astore_1       
        //    63: aload_1        
        //    64: athrow         
        //    65: astore_2       
        //    66: aload_2        
        //    67: athrow         
        //    68: astore_3       
        //    69: aload_3        
        //    70: athrow         
        //    71: bipush          44
        //    73: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  7      19     62     65     Ljava/lang/IllegalArgumentException;
        //  24     36     65     68     Ljava/lang/IllegalArgumentException;
        //  41     53     68     71     Ljava/lang/IllegalArgumentException;
        //  63     65     65     68     Ljava/lang/IllegalArgumentException;
        //  66     68     68     71     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 40, Size: 40
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
    
    public static int a(final int n) {
        if ((0x800000 & n) == 0x0) {
            if ((n & 0x7) == 0x5) {
                return 0x3 | (n & 0xFFFFFFF8);
            }
            if ((n & 0x7) == 0x3) {
                return 0x5 | (n & 0xFFFFFFF8);
            }
        }
        return n;
    }
    
    public static View a(final LayoutInflater layoutInflater, final int n, final ViewGroup viewGroup) {
        return a(layoutInflater, n, viewGroup, viewGroup != null);
    }
    
    public static View a(final LayoutInflater layoutInflater, final int n, final ViewGroup viewGroup, final boolean b) {
        return a(layoutInflater, n, viewGroup, b, null);
    }
    
    public static View a(final LayoutInflater layoutInflater, final int n, final ViewGroup viewGroup, final boolean b, final int[] array) {
        final View inflate = layoutInflater.inflate(n, viewGroup, b);
        a(inflate, array);
        return inflate;
    }
    
    public static String a(final String s) {
        try {
            if (App.ak() || s == null) {
                return s;
            }
        }
        catch (IllegalArgumentException ex) {
            try {
                throw ex;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return alm.z[0] + s + "\u202c";
    }
    
    public static void a(final View view) {
        a(view, null);
    }
    
    public static void a(final View view, final int n, final int n2) {
        a(view, n, view.getPaddingTop(), n2, view.getPaddingBottom());
    }
    
    public static void a(final View p0, final int p1, final int p2, final int p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.W:Z
        //     3: istore          6
        //     5: iload           6
        //     7: ifeq            39
        //    10: iload_3        
        //    11: istore          7
        //    13: getstatic       com/whatsapp/App.W:Z
        //    16: istore          9
        //    18: iload           9
        //    20: ifeq            50
        //    23: aload_0        
        //    24: iload           7
        //    26: iload_2        
        //    27: iload_1        
        //    28: iload           4
        //    30: invokevirtual   android/view/View.setPadding:(IIII)V
        //    33: return         
        //    34: astore          5
        //    36: aload           5
        //    38: athrow         
        //    39: iload_1        
        //    40: istore          7
        //    42: goto            13
        //    45: astore          8
        //    47: aload           8
        //    49: athrow         
        //    50: iload_3        
        //    51: istore_1       
        //    52: goto            23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      34     39     Ljava/lang/IllegalArgumentException;
        //  13     18     45     50     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0013:
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
    
    public static void a(final View p0, final int[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: invokestatic    com/whatsapp/App.ak:()Z
        //     7: istore          4
        //     9: iload           4
        //    11: ifeq            18
        //    14: return         
        //    15: astore_3       
        //    16: aload_3        
        //    17: athrow         
        //    18: aload_1        
        //    19: ifnull          58
        //    22: aload_0        
        //    23: invokevirtual   android/view/View.getId:()I
        //    26: istore          54
        //    28: aload_1        
        //    29: arraylength    
        //    30: istore          55
        //    32: iconst_0       
        //    33: istore          56
        //    35: iload           56
        //    37: iload           55
        //    39: if_icmpge       58
        //    42: aload_1        
        //    43: iload           56
        //    45: iaload         
        //    46: iload           54
        //    48: if_icmpeq       14
        //    51: iinc            56, 1
        //    54: iload_2        
        //    55: ifeq            35
        //    58: aload_0        
        //    59: aload_0        
        //    60: invokevirtual   android/view/View.getPaddingRight:()I
        //    63: aload_0        
        //    64: invokevirtual   android/view/View.getPaddingTop:()I
        //    67: aload_0        
        //    68: invokevirtual   android/view/View.getPaddingLeft:()I
        //    71: aload_0        
        //    72: invokevirtual   android/view/View.getPaddingBottom:()I
        //    75: invokevirtual   android/view/View.setPadding:(IIII)V
        //    78: aload_0        
        //    79: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    82: astore          5
        //    84: aload           5
        //    86: instanceof      Landroid/view/ViewGroup$MarginLayoutParams;
        //    89: ifeq            211
        //    92: aload           5
        //    94: checkcast       Landroid/view/ViewGroup$MarginLayoutParams;
        //    97: astore          46
        //    99: aload           46
        //   101: getfield        android/view/ViewGroup$MarginLayoutParams.leftMargin:I
        //   104: aload           46
        //   106: getfield        android/view/ViewGroup$MarginLayoutParams.rightMargin:I
        //   109: if_icmpeq       211
        //   112: aload           46
        //   114: aload           46
        //   116: getfield        android/view/ViewGroup$MarginLayoutParams.rightMargin:I
        //   119: aload           46
        //   121: getfield        android/view/ViewGroup$MarginLayoutParams.topMargin:I
        //   124: aload           46
        //   126: getfield        android/view/ViewGroup$MarginLayoutParams.leftMargin:I
        //   129: aload           46
        //   131: getfield        android/view/ViewGroup$MarginLayoutParams.bottomMargin:I
        //   134: invokevirtual   android/view/ViewGroup$MarginLayoutParams.setMargins:(IIII)V
        //   137: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   140: istore          48
        //   142: iload           48
        //   144: bipush          17
        //   146: if_icmpge       211
        //   149: ldc_w           Landroid/view/ViewGroup$MarginLayoutParams;.class
        //   152: getstatic       com/whatsapp/alm.z:[Ljava/lang/String;
        //   155: iconst_5       
        //   156: aaload         
        //   157: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   160: astore          52
        //   162: aload           52
        //   164: iconst_1       
        //   165: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   168: aload           52
        //   170: aload           46
        //   172: aload           46
        //   174: getfield        android/view/ViewGroup$MarginLayoutParams.leftMargin:I
        //   177: invokevirtual   java/lang/reflect/Field.setInt:(Ljava/lang/Object;I)V
        //   180: ldc_w           Landroid/view/ViewGroup$MarginLayoutParams;.class
        //   183: getstatic       com/whatsapp/alm.z:[Ljava/lang/String;
        //   186: iconst_4       
        //   187: aaload         
        //   188: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   191: astore          53
        //   193: aload           53
        //   195: iconst_1       
        //   196: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   199: aload           53
        //   201: aload           46
        //   203: aload           46
        //   205: getfield        android/view/ViewGroup$MarginLayoutParams.rightMargin:I
        //   208: invokevirtual   java/lang/reflect/Field.setInt:(Ljava/lang/Object;I)V
        //   211: aload           5
        //   213: instanceof      Landroid/widget/RelativeLayout$LayoutParams;
        //   216: ifeq            307
        //   219: aload           5
        //   221: checkcast       Landroid/widget/RelativeLayout$LayoutParams;
        //   224: astore          40
        //   226: aload           40
        //   228: invokevirtual   android/widget/RelativeLayout$LayoutParams.getRules:()[I
        //   231: astore          41
        //   233: aload           41
        //   235: iconst_0       
        //   236: iaload         
        //   237: istore          42
        //   239: aload           41
        //   241: iconst_1       
        //   242: iaload         
        //   243: istore          43
        //   245: aload           41
        //   247: iconst_1       
        //   248: iload           42
        //   250: iastore        
        //   251: aload           41
        //   253: iconst_0       
        //   254: iload           43
        //   256: iastore        
        //   257: aload           41
        //   259: iconst_5       
        //   260: iaload         
        //   261: istore          44
        //   263: aload           40
        //   265: iconst_5       
        //   266: aload           41
        //   268: bipush          7
        //   270: iaload         
        //   271: invokevirtual   android/widget/RelativeLayout$LayoutParams.addRule:(II)V
        //   274: aload           40
        //   276: bipush          7
        //   278: iload           44
        //   280: invokevirtual   android/widget/RelativeLayout$LayoutParams.addRule:(II)V
        //   283: aload           41
        //   285: bipush          9
        //   287: iaload         
        //   288: istore          45
        //   290: aload           41
        //   292: bipush          9
        //   294: aload           41
        //   296: bipush          11
        //   298: iaload         
        //   299: iastore        
        //   300: aload           41
        //   302: bipush          11
        //   304: iload           45
        //   306: iastore        
        //   307: aload           5
        //   309: instanceof      Landroid/widget/FrameLayout$LayoutParams;
        //   312: ifeq            335
        //   315: aload           5
        //   317: checkcast       Landroid/widget/FrameLayout$LayoutParams;
        //   320: astore          39
        //   322: aload           39
        //   324: aload           39
        //   326: getfield        android/widget/FrameLayout$LayoutParams.gravity:I
        //   329: invokestatic    com/whatsapp/alm.a:(I)I
        //   332: putfield        android/widget/FrameLayout$LayoutParams.gravity:I
        //   335: aload           5
        //   337: instanceof      Landroid/widget/LinearLayout$LayoutParams;
        //   340: ifeq            363
        //   343: aload           5
        //   345: checkcast       Landroid/widget/LinearLayout$LayoutParams;
        //   348: astore          38
        //   350: aload           38
        //   352: aload           38
        //   354: getfield        android/widget/LinearLayout$LayoutParams.gravity:I
        //   357: invokestatic    com/whatsapp/alm.a:(I)I
        //   360: putfield        android/widget/LinearLayout$LayoutParams.gravity:I
        //   363: aload_0        
        //   364: instanceof      Landroid/widget/TextView;
        //   367: ifeq            422
        //   370: aload_0        
        //   371: instanceof      Landroid/widget/EditText;
        //   374: istore          34
        //   376: iload           34
        //   378: ifne            422
        //   381: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   384: istore          35
        //   386: iload           35
        //   388: bipush          11
        //   390: if_icmpge       403
        //   393: getstatic       com/whatsapp/alm.b:Z
        //   396: istore          37
        //   398: iload           37
        //   400: ifne            422
        //   403: aload_0        
        //   404: checkcast       Landroid/widget/TextView;
        //   407: astore          36
        //   409: aload           36
        //   411: aload           36
        //   413: invokevirtual   android/widget/TextView.getGravity:()I
        //   416: invokestatic    com/whatsapp/alm.a:(I)I
        //   419: invokevirtual   android/widget/TextView.setGravity:(I)V
        //   422: aload_0        
        //   423: instanceof      Landroid/widget/RelativeLayout;
        //   426: ifeq            500
        //   429: aload_0        
        //   430: checkcast       Landroid/widget/RelativeLayout;
        //   433: astore          28
        //   435: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   438: bipush          16
        //   440: if_icmplt       460
        //   443: aload           28
        //   445: aload           28
        //   447: invokevirtual   android/widget/RelativeLayout.getGravity:()I
        //   450: invokestatic    com/whatsapp/alm.a:(I)I
        //   453: invokevirtual   android/widget/RelativeLayout.setGravity:(I)V
        //   456: iload_2        
        //   457: ifeq            500
        //   460: ldc_w           Landroid/widget/RelativeLayout;.class
        //   463: getstatic       com/whatsapp/alm.z:[Ljava/lang/String;
        //   466: iconst_3       
        //   467: aaload         
        //   468: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   471: astore          33
        //   473: aload           33
        //   475: iconst_1       
        //   476: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   479: aload           28
        //   481: aload           33
        //   483: aload           28
        //   485: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   488: checkcast       Ljava/lang/Integer;
        //   491: invokevirtual   java/lang/Integer.intValue:()I
        //   494: invokestatic    com/whatsapp/alm.a:(I)I
        //   497: invokevirtual   android/widget/RelativeLayout.setGravity:(I)V
        //   500: aload_0        
        //   501: instanceof      Landroid/widget/LinearLayout;
        //   504: ifeq            660
        //   507: aload_0        
        //   508: checkcast       Landroid/widget/LinearLayout;
        //   511: astore          15
        //   513: ldc_w           Landroid/widget/LinearLayout;.class
        //   516: getstatic       com/whatsapp/alm.z:[Ljava/lang/String;
        //   519: iconst_2       
        //   520: aaload         
        //   521: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   524: astore          27
        //   526: aload           27
        //   528: iconst_1       
        //   529: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   532: aload           15
        //   534: aload           27
        //   536: aload           15
        //   538: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   541: checkcast       Ljava/lang/Integer;
        //   544: invokevirtual   java/lang/Integer.intValue:()I
        //   547: invokestatic    com/whatsapp/alm.a:(I)I
        //   550: invokevirtual   android/widget/LinearLayout.setGravity:(I)V
        //   553: aload           15
        //   555: invokevirtual   android/widget/LinearLayout.getOrientation:()I
        //   558: ifne            660
        //   561: getstatic       com/whatsapp/alm.c:Z
        //   564: istore          18
        //   566: iload           18
        //   568: ifne            660
        //   571: aload           15
        //   573: invokevirtual   android/widget/LinearLayout.getChildCount:()I
        //   576: istore          19
        //   578: new             Ljava/util/ArrayList;
        //   581: dup            
        //   582: iload           19
        //   584: invokespecial   java/util/ArrayList.<init>:(I)V
        //   587: astore          20
        //   589: iconst_0       
        //   590: istore          21
        //   592: iload           21
        //   594: iload           19
        //   596: if_icmpge       619
        //   599: aload           20
        //   601: aload           15
        //   603: iload           21
        //   605: invokevirtual   android/widget/LinearLayout.getChildAt:(I)Landroid/view/View;
        //   608: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   611: pop            
        //   612: iinc            21, 1
        //   615: iload_2        
        //   616: ifeq            592
        //   619: aload           15
        //   621: invokevirtual   android/widget/LinearLayout.removeAllViews:()V
        //   624: iload           19
        //   626: iconst_1       
        //   627: isub           
        //   628: istore          22
        //   630: iload           22
        //   632: iflt            660
        //   635: aload           15
        //   637: aload           20
        //   639: iload           22
        //   641: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   644: checkcast       Landroid/view/View;
        //   647: invokevirtual   android/widget/LinearLayout.addView:(Landroid/view/View;)V
        //   650: iload           22
        //   652: iconst_1       
        //   653: isub           
        //   654: istore          23
        //   656: iload_2        
        //   657: ifeq            828
        //   660: aload_0        
        //   661: instanceof      Landroid/widget/ListView;
        //   664: ifeq            699
        //   667: aload_0        
        //   668: checkcast       Landroid/widget/ListView;
        //   671: astore          12
        //   673: aload           12
        //   675: invokevirtual   android/widget/ListView.getDivider:()Landroid/graphics/drawable/Drawable;
        //   678: astore          13
        //   680: aload           13
        //   682: ifnull          699
        //   685: aload           12
        //   687: new             Lcom/whatsapp/util/m;
        //   690: dup            
        //   691: aload           13
        //   693: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   696: invokevirtual   android/widget/ListView.setDivider:(Landroid/graphics/drawable/Drawable;)V
        //   699: aload_0        
        //   700: instanceof      Landroid/view/ViewGroup;
        //   703: ifeq            14
        //   706: aload_0        
        //   707: checkcast       Landroid/view/ViewGroup;
        //   710: astore          9
        //   712: aload           9
        //   714: invokevirtual   android/view/ViewGroup.getChildCount:()I
        //   717: istore          10
        //   719: iconst_0       
        //   720: istore          11
        //   722: iload           11
        //   724: iload           10
        //   726: if_icmpge       14
        //   729: aload           9
        //   731: iload           11
        //   733: invokevirtual   android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
        //   736: aload_1        
        //   737: invokestatic    com/whatsapp/alm.a:(Landroid/view/View;[I)V
        //   740: iinc            11, 1
        //   743: iload_2        
        //   744: ifeq            722
        //   747: return         
        //   748: astore          47
        //   750: aload           47
        //   752: athrow         
        //   753: astore          6
        //   755: aload           6
        //   757: athrow         
        //   758: astore          7
        //   760: aload           7
        //   762: athrow         
        //   763: astore          8
        //   765: aload           8
        //   767: athrow         
        //   768: astore          29
        //   770: aload           29
        //   772: athrow         
        //   773: astore          17
        //   775: aload           17
        //   777: athrow         
        //   778: astore          14
        //   780: aload           14
        //   782: athrow         
        //   783: astore          26
        //   785: goto            553
        //   788: astore          25
        //   790: goto            553
        //   793: astore          16
        //   795: goto            553
        //   798: astore          32
        //   800: goto            500
        //   803: astore          31
        //   805: goto            500
        //   808: astore          30
        //   810: goto            500
        //   813: astore          51
        //   815: goto            211
        //   818: astore          50
        //   820: goto            211
        //   823: astore          49
        //   825: goto            211
        //   828: iload           23
        //   830: istore          22
        //   832: goto            630
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      9      15     18     Ljava/lang/NoSuchFieldException;
        //  99     142    748    753    Ljava/lang/NoSuchFieldException;
        //  149    211    813    818    Ljava/lang/NoSuchFieldException;
        //  149    211    823    828    Ljava/lang/IllegalArgumentException;
        //  149    211    818    823    Ljava/lang/IllegalAccessException;
        //  363    376    753    758    Ljava/lang/NoSuchFieldException;
        //  381    386    758    763    Ljava/lang/NoSuchFieldException;
        //  393    398    763    768    Ljava/lang/NoSuchFieldException;
        //  435    456    768    773    Ljava/lang/NoSuchFieldException;
        //  460    500    798    803    Ljava/lang/NoSuchFieldException;
        //  460    500    808    813    Ljava/lang/IllegalArgumentException;
        //  460    500    803    808    Ljava/lang/IllegalAccessException;
        //  513    553    783    788    Ljava/lang/NoSuchFieldException;
        //  513    553    793    798    Ljava/lang/IllegalArgumentException;
        //  513    553    788    793    Ljava/lang/IllegalAccessException;
        //  553    566    773    778    Ljava/lang/NoSuchFieldException;
        //  685    699    778    783    Ljava/lang/NoSuchFieldException;
        //  755    758    758    763    Ljava/lang/NoSuchFieldException;
        //  760    763    763    768    Ljava/lang/NoSuchFieldException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 385, Size: 385
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    public static void a(final EditText p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.W:Z
        //     3: istore_3       
        //     4: iload_3        
        //     5: ifeq            40
        //     8: aload_0        
        //     9: aload_0        
        //    10: invokevirtual   android/widget/EditText.getResources:()Landroid/content/res/Resources;
        //    13: ldc_w           2131361906
        //    16: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    19: aload_0        
        //    20: invokevirtual   android/widget/EditText.getPaddingTop:()I
        //    23: aload_0        
        //    24: invokevirtual   android/widget/EditText.getPaddingRight:()I
        //    27: aload_0        
        //    28: invokevirtual   android/widget/EditText.getPaddingBottom:()I
        //    31: invokevirtual   android/widget/EditText.setPadding:(IIII)V
        //    34: getstatic       com/whatsapp/App.I:Z
        //    37: ifeq            73
        //    40: aload_0        
        //    41: aload_0        
        //    42: invokevirtual   android/widget/EditText.getPaddingLeft:()I
        //    45: aload_0        
        //    46: invokevirtual   android/widget/EditText.getPaddingTop:()I
        //    49: aload_0        
        //    50: invokevirtual   android/widget/EditText.getResources:()Landroid/content/res/Resources;
        //    53: ldc_w           2131361906
        //    56: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    59: aload_0        
        //    60: invokevirtual   android/widget/EditText.getPaddingBottom:()I
        //    63: invokevirtual   android/widget/EditText.setPadding:(IIII)V
        //    66: return         
        //    67: astore_1       
        //    68: aload_1        
        //    69: athrow         
        //    70: astore_2       
        //    71: aload_2        
        //    72: athrow         
        //    73: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      4      67     70     Ljava/lang/IllegalArgumentException;
        //  8      40     70     73     Ljava/lang/IllegalArgumentException;
        //  40     66     70     73     Ljava/lang/IllegalArgumentException;
        //  68     70     70     73     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    public static void a(final TextView textView) {
        if (textView == null) {
            return;
        }
        try {
            a(textView, textView.getText());
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public static void a(final TextView p0, final CharSequence p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/alm.b:Z
        //     7: istore          4
        //     9: iload           4
        //    11: ifeq            18
        //    14: return         
        //    15: astore_3       
        //    16: aload_3        
        //    17: athrow         
        //    18: aload_0        
        //    19: ifnull          14
        //    22: bipush          -8
        //    24: aload_0        
        //    25: invokevirtual   android/widget/TextView.getGravity:()I
        //    28: iand           
        //    29: istore          5
        //    31: aload_1        
        //    32: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    35: ifeq            68
        //    38: invokestatic    com/whatsapp/App.ak:()Z
        //    41: istore          9
        //    43: iload           9
        //    45: ifeq            58
        //    48: iload           5
        //    50: iconst_3       
        //    51: ior            
        //    52: istore          5
        //    54: iload_2        
        //    55: ifeq            95
        //    58: iload           5
        //    60: iconst_5       
        //    61: ior            
        //    62: istore          5
        //    64: iload_2        
        //    65: ifeq            95
        //    68: aload_1        
        //    69: invokestatic    com/whatsapp/alm.a:(Ljava/lang/CharSequence;)Z
        //    72: istore          8
        //    74: iload           8
        //    76: ifeq            89
        //    79: iload           5
        //    81: iconst_3       
        //    82: ior            
        //    83: istore          5
        //    85: iload_2        
        //    86: ifeq            95
        //    89: iload           5
        //    91: iconst_5       
        //    92: ior            
        //    93: istore          5
        //    95: aload_0        
        //    96: iload           5
        //    98: invokevirtual   android/widget/TextView.setGravity:(I)V
        //   101: return         
        //   102: astore          6
        //   104: aload           6
        //   106: athrow         
        //   107: astore          7
        //   109: aload           7
        //   111: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      9      15     18     Ljava/lang/IllegalArgumentException;
        //  31     43     102    107    Ljava/lang/IllegalArgumentException;
        //  68     74     107    112    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
    
    public static boolean a(final CharSequence charSequence) {
        try {
            if (TextUtils.isEmpty(charSequence)) {
                Log.w(alm.z[1]);
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final int codePoint = charSequence.toString().codePointAt(0);
        if (codePoint >= 1424) {
            final boolean b = false;
            if (codePoint <= 1791) {
                return b;
            }
        }
        return true;
    }
    
    private static boolean b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_0       
        //     2: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     5: istore_2       
        //     6: iload_2        
        //     7: bipush          11
        //     9: if_icmplt       17
        //    12: iconst_1       
        //    13: ireturn        
        //    14: astore_1       
        //    15: aload_1        
        //    16: athrow         
        //    17: getstatic       android/os/Build.DISPLAY:Ljava/lang/String;
        //    20: ifnull          39
        //    23: getstatic       com/whatsapp/alm.d:[Ljava/lang/String;
        //    26: getstatic       android/os/Build.DISPLAY:Ljava/lang/String;
        //    29: invokestatic    com/whatsapp/util/ax.a:([Ljava/lang/Object;Ljava/lang/Object;)Z
        //    32: istore          17
        //    34: iload           17
        //    36: ifne            12
        //    39: getstatic       com/whatsapp/App.W:Z
        //    42: ifeq            291
        //    45: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    48: ldc_w           2131231977
        //    51: invokevirtual   com/whatsapp/App.getText:(I)Ljava/lang/CharSequence;
        //    54: astore          16
        //    56: aload           16
        //    58: astore          9
        //    60: new             Landroid/widget/TextView;
        //    63: dup            
        //    64: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    67: invokespecial   android/widget/TextView.<init>:(Landroid/content/Context;)V
        //    70: astore          10
        //    72: aload           10
        //    74: iconst_5       
        //    75: invokevirtual   android/widget/TextView.setGravity:(I)V
        //    78: aload           10
        //    80: aload           9
        //    82: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    85: aload           10
        //    87: ldc_w           -16777216
        //    90: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //    93: aload           10
        //    95: iconst_m1      
        //    96: invokevirtual   android/widget/TextView.setBackgroundColor:(I)V
        //    99: aload           10
        //   101: iconst_3       
        //   102: aload           10
        //   104: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   107: aload           9
        //   109: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //   114: invokevirtual   android/text/TextPaint.measureText:(Ljava/lang/String;)F
        //   117: f2i            
        //   118: imul           
        //   119: ldc_w           1073741824
        //   122: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   125: iconst_0       
        //   126: iconst_0       
        //   127: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   130: invokevirtual   android/widget/TextView.measure:(II)V
        //   133: aload           10
        //   135: invokevirtual   android/widget/TextView.getMeasuredWidth:()I
        //   138: iconst_2       
        //   139: idiv           
        //   140: aload           10
        //   142: invokevirtual   android/widget/TextView.getMeasuredHeight:()I
        //   145: getstatic       android/graphics/Bitmap$Config.RGB_565:Landroid/graphics/Bitmap$Config;
        //   148: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   151: astore          11
        //   153: new             Landroid/graphics/Canvas;
        //   156: dup            
        //   157: aload           11
        //   159: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   162: astore          12
        //   164: aload           12
        //   166: iconst_m1      
        //   167: invokevirtual   android/graphics/Canvas.drawColor:(I)V
        //   170: aload           10
        //   172: invokevirtual   android/widget/TextView.getLayout:()Landroid/text/Layout;
        //   175: aload           12
        //   177: invokevirtual   android/text/Layout.draw:(Landroid/graphics/Canvas;)V
        //   180: aload           11
        //   182: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   185: aload           11
        //   187: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   190: imul           
        //   191: newarray        I
        //   193: astore          13
        //   195: aload           11
        //   197: aload           13
        //   199: iconst_0       
        //   200: aload           11
        //   202: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   205: iconst_0       
        //   206: iconst_0       
        //   207: aload           11
        //   209: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   212: aload           11
        //   214: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   217: invokevirtual   android/graphics/Bitmap.getPixels:([IIIIIII)V
        //   220: aload           13
        //   222: arraylength    
        //   223: istore          14
        //   225: iconst_0       
        //   226: istore          8
        //   228: iload_0        
        //   229: iload           14
        //   231: if_icmpge       288
        //   234: aload           13
        //   236: iload_0        
        //   237: iaload         
        //   238: istore          15
        //   240: iload           15
        //   242: iconst_m1      
        //   243: if_icmpeq       249
        //   246: iconst_1       
        //   247: istore          8
        //   249: iinc            0, 1
        //   252: goto            228
        //   255: astore_3       
        //   256: aload_3        
        //   257: athrow         
        //   258: astore          4
        //   260: aload           4
        //   262: athrow         
        //   263: astore          5
        //   265: aload           5
        //   267: athrow         
        //   268: astore          6
        //   270: aload           6
        //   272: astore          7
        //   274: iconst_0       
        //   275: istore          8
        //   277: getstatic       com/whatsapp/alm.z:[Ljava/lang/String;
        //   280: bipush          6
        //   282: aaload         
        //   283: aload           7
        //   285: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   288: iload           8
        //   290: ireturn        
        //   291: ldc_w           "\u0623"
        //   294: astore          9
        //   296: goto            60
        //   299: astore          7
        //   301: goto            277
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      6      14     17     Ljava/lang/Exception;
        //  17     34     255    263    Ljava/lang/Exception;
        //  39     56     263    268    Ljava/lang/Exception;
        //  60     225    268    277    Ljava/lang/Exception;
        //  234    240    299    304    Ljava/lang/Exception;
        //  256    258    258    263    Ljava/lang/Exception;
        //  265    268    268    277    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 145, Size: 145
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
}
