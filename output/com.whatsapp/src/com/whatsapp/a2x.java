// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import android.database.sqlite.SQLiteStatement;
import android.database.Cursor;
import com.whatsapp.util.Log;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build$VERSION;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class a2x extends SQLiteOpenHelper
{
    private static final int c;
    private static final String[] z;
    private boolean a;
    private boolean b;
    private boolean d;
    private SQLiteDatabase e;
    
    static {
        final String[] z2 = new String[127];
        String s = "O4(HFHq7\\I\u001c76BH\u001c\"5ALH4\u001b@DO%!_\u0005K9!_@\u001c%=]@\u0001v-CAY)c\rDR5dCDQ4y\n";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0016:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
            Label_3292_Outer:
                while (true) {
                    Label_3245: {
                        if (length > n3) {
                            break Label_3245;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                n2 = 1;
                                array = z2;
                                s = "\u001bj";
                                n = 0;
                                continue Label_0016;
                            }
                            case 0: {
                                array[n2] = intern;
                                n2 = 2;
                                s = "Q\"#^QS#!\u0002BY%3_LH0&A@X3k@@X8%Y\\L4-CAY)d";
                                n = 1;
                                array = z2;
                                continue Label_0016;
                            }
                            case 1: {
                                array[n2] = intern;
                                n2 = 3;
                                s = "Q\"#^QS#!\u0003A^";
                                n = 2;
                                array = z2;
                                continue Label_0016;
                            }
                            case 2: {
                                array[n2] = intern;
                                n2 = 4;
                                s = "u\u001f\u0010hby\u0003";
                                n = 3;
                                array = z2;
                                continue Label_0016;
                            }
                            case 3: {
                                array[n2] = intern;
                                n2 = 5;
                                s = "N4'HLL%7";
                                n = 4;
                                array = z2;
                                continue Label_0016;
                            }
                            case 4: {
                                array[n2] = intern;
                                n2 = 6;
                                s = "u\u001f\u0010hby\u0003";
                                n = 5;
                                array = z2;
                                continue Label_0016;
                            }
                            case 5: {
                                array[n2] = intern;
                                n2 = 7;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014d_@_4-]QOqlrLXq\rcqy\u0016\u0001\u007f\u0005l\u0003\r`dn\bdf`eq\u0005xqs\u0018\nnwy\u001c\u0001cq\u0010q/H\\c#!@JH4\u001bGLXq\u0010h}hq\nbq\u001c\u001f\u0011ai\u0010q/H\\c8 \rqy\t\u0010\rks\u0005dcpp\u001dh\rWY<+Y@c#!^JI#'H\u0005h\u0014\u001cy\t\u001c#!N@U!0rAY'-N@c%-@@O%%@U\u001c\u0018\ny`{\u0014\u0016\u0001\u0005N4%IzX42DFY\u000e0DHY\"0LHLq\rcqy\u0016\u0001\u007f\t\u001c!(L\\Y5\u001bI@J8'HzH8)HVH0)]\u0005u\u001f\u0010hby\u0003m";
                                n = 6;
                                array = z2;
                                continue Label_0016;
                            }
                            case 6: {
                                array[n2] = intern;
                                n2 = 8;
                                s = "L=%T@X\u000e HSU2!rQU<!^Q]<4";
                                n = 7;
                                array = z2;
                                continue Label_0016;
                            }
                            case 7: {
                                array[n2] = intern;
                                n2 = 9;
                                s = "Q> rQ]6";
                                n = 8;
                                array = z2;
                                continue Label_0016;
                            }
                            case 8: {
                                array[n2] = intern;
                                n2 = 10;
                                s = "u\u001f\u0010hby\u0003";
                                n = 9;
                                array = z2;
                                continue Label_0016;
                            }
                            case 9: {
                                array[n2] = intern;
                                n2 = 11;
                                s = "h\u0014\u001cy";
                                n = 10;
                                array = z2;
                                continue Label_0016;
                            }
                            case 10: {
                                array[n2] = intern;
                                n2 = 12;
                                s = "Q\"#^QS#!\u0002BY%3_LH0&A@X3kH]U\"0^";
                                n = 11;
                                array = z2;
                                continue Label_0016;
                            }
                            case 11: {
                                array[n2] = intern;
                                n2 = 13;
                                s = "N4%IzX42DFY\u000e0DHY\"0LHL";
                                n = 12;
                                array = z2;
                                continue Label_0016;
                            }
                            case 12: {
                                array[n2] = intern;
                                n2 = 14;
                                s = "h\u0014\u001cy";
                                n = 13;
                                array = z2;
                                continue Label_0016;
                            }
                            case 13: {
                                array[n2] = intern;
                                n2 = 15;
                                s = "Q4 DDc%=]@c8*I@D";
                                n = 14;
                                array = z2;
                                continue Label_0016;
                            }
                            case 14: {
                                array[n2] = intern;
                                s = "O4*YzO4*I@N\u000e/H\\";
                                n = 15;
                                n2 = 16;
                                array = z2;
                                continue Label_0016;
                            }
                            case 15: {
                                array[n2] = intern;
                                n2 = 17;
                                array = z2;
                                s = "\u007f\u0003\u0001lqyq\rcay\tdJWS$4rU]#0DFU!%CQO\u000e,DVH>6TzU? H]\u001c>*\rBN>1]zL06YL_84LKH\"\u001bELO%+_\\\u001cy#GLXx";
                                n = 16;
                                continue Label_0016;
                            }
                            case 16: {
                                array[n2] = intern;
                                n2 = 18;
                                s = "u\u001f\u0010hby\u0003";
                                n = 17;
                                array = z2;
                                continue Label_0016;
                            }
                            case 17: {
                                array[n2] = intern;
                                n2 = 19;
                                s = "Q\"#^QS#!\u0002BY%3_LH0&A@X3kIJR4kALO%d";
                                n = 18;
                                array = z2;
                                continue Label_0016;
                            }
                            case 18: {
                                array[n2] = intern;
                                n2 = 20;
                                s = "Q47^D[47";
                                n = 19;
                                array = z2;
                                continue Label_0016;
                            }
                            case 19: {
                                array[n2] = intern;
                                n2 = 21;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014dJWS$4rU]#0DFU!%CQO\u000e,DVH>6T\u0005\u0014\u000e-I\u0005u\u001f\u0010hby\u0003d}wu\u001c\u0005\u007f|\u001c\u001a\u0001t\u0005}\u0004\u0010blr\u0012\u0016hhy\u001f\u0010\u0001\u0005H8)HVH0)]\u0005x\u0010\u0010hqu\u001c\u0001\rks\u0005dcpp\u001dh\rBV8 \rqy\t\u0010\rks\u0005dcpp\u001dh\rOU5dy`d\u0005dcjhq\nxip}dLFH8+C\u0005u\u001f\u0010hby\u0003dcjhq\nxip}dBIX\u000e4EDO9dy`d\u0005dcjhq\nxip}dC@K\u000e4EDO9dy`d\u0005dcjhq\nxipx";
                                n = 20;
                                array = z2;
                                continue Label_0016;
                            }
                            case 20: {
                                array[n2] = intern;
                                n2 = 22;
                                s = "~\u001d\u000bo";
                                n = 21;
                                array = z2;
                                continue Label_0016;
                            }
                            case 21: {
                                array[n2] = intern;
                                n2 = 23;
                                s = "_9%YzP87Y";
                                n = 22;
                                array = z2;
                                continue Label_0016;
                            }
                            case 22: {
                                array[n2] = intern;
                                n2 = 24;
                                s = "\u007f\u0003\u0001lqyq\u0012dwh\u0004\u0005a\u0005h\u0010\u0006a`\u001c<!^V]6!^zZ%7\rpo\u0018\nj\u0005z\u0005\u0017\u001e\r\u0015";
                                n = 23;
                                array = z2;
                                continue Label_0016;
                            }
                            case 23: {
                                array[n2] = intern;
                                n2 = 25;
                                s = "u\u001f\u0010hby\u0003";
                                n = 24;
                                array = z2;
                                continue Label_0016;
                            }
                            case 24: {
                                array[n2] = intern;
                                n2 = 26;
                                s = "_#!LQU>*";
                                n = 25;
                                array = z2;
                                continue Label_0016;
                            }
                            case 25: {
                                array[n2] = intern;
                                n2 = 27;
                                s = "N4'DUU4*Yz_>1CQ";
                                n = 26;
                                array = z2;
                                continue Label_0016;
                            }
                            case 26: {
                                array[n2] = intern;
                                n2 = 28;
                                s = "Q\"#^QS#!\u0002BY%3_LH0&A@X3kBKS!!C";
                                n = 27;
                                array = z2;
                                continue Label_0016;
                            }
                            case 27: {
                                array[n2] = intern;
                                n2 = 29;
                                s = "Q4 DDc2%]QU>*";
                                n = 28;
                                array = z2;
                                continue Label_0016;
                            }
                            case 28: {
                                array[n2] = intern;
                                n2 = 30;
                                s = "_9%YzP87Y";
                                n = 29;
                                array = z2;
                                continue Label_0016;
                            }
                            case 29: {
                                array[n2] = intern;
                                n2 = 31;
                                s = "h\u0014\u001cy";
                                n = 30;
                                array = z2;
                                continue Label_0016;
                            }
                            case 30: {
                                array[n2] = intern;
                                n2 = 32;
                                s = "S#-JLR";
                                n = 31;
                                array = z2;
                                continue Label_0016;
                            }
                            case 31: {
                                array[n2] = intern;
                                n2 = 33;
                                s = "P07YzN4%IzQ47^D[4\u001bYD^=!rLX";
                                n = 32;
                                array = z2;
                                continue Label_0016;
                            }
                            case 32: {
                                array[n2] = intern;
                                n2 = 34;
                                s = "u\u001f\u0010hby\u0003";
                                n = 33;
                                array = z2;
                                continue Label_0016;
                            }
                            case 33: {
                                array[n2] = intern;
                                n2 = 35;
                                s = "_9%YzP87Y";
                                n = 34;
                                array = z2;
                                continue Label_0016;
                            }
                            case 34: {
                                array[n2] = intern;
                                n2 = 36;
                                s = "Q47^D[47";
                                n = 35;
                                array = z2;
                                continue Label_0016;
                            }
                            case 35: {
                                array[n2] = intern;
                                s = "O$&G@_%";
                                n = 36;
                                n2 = 37;
                                array = z2;
                                continue Label_0016;
                            }
                            case 36: {
                                array[n2] = intern;
                                n2 = 38;
                                array = z2;
                                s = "]#'ELJ4 ";
                                n = 37;
                                continue Label_0016;
                            }
                            case 37: {
                                array[n2] = intern;
                                n2 = 39;
                                s = "[#+XUc!%_QU2-]DR%7";
                                n = 38;
                                array = z2;
                                continue Label_0016;
                            }
                            case 38: {
                                array[n2] = intern;
                                n2 = 40;
                                s = "u\u001f\u0010hby\u0003";
                                n = 39;
                                array = z2;
                                continue Label_0016;
                            }
                            case 39: {
                                array[n2] = intern;
                                n2 = 41;
                                s = "u\u001f\u0010hby\u0003";
                                n = 40;
                                array = z2;
                                continue Label_0016;
                            }
                            case 40: {
                                array[n2] = intern;
                                n2 = 42;
                                s = "Q4 DDc9%^Mc8*I@D";
                                n = 41;
                                array = z2;
                                continue Label_0016;
                            }
                            case 41: {
                                array[n2] = intern;
                                n2 = 43;
                                s = "u\u001f\u0010hby\u0003";
                                n = 42;
                                array = z2;
                                continue Label_0016;
                            }
                            case 42: {
                                array[n2] = intern;
                                n2 = 44;
                                s = "\u007f\u0003\u0001lqyq\u0011clm\u0004\u0001\rlr\u0015\u0001u\u0005[#+XUc!%_QU2-]DR%7rLR5!U\u0005S?dJWS$4rU]#0DFU!%CQOqlJOU5h\rOU5m";
                                n = 43;
                                array = z2;
                                continue Label_0016;
                            }
                            case 43: {
                                array[n2] = intern;
                                s = "Q47^D[47";
                                n = 44;
                                n2 = 45;
                                array = z2;
                                continue Label_0016;
                            }
                            case 44: {
                                array[n2] = intern;
                                n2 = 46;
                                array = z2;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014d@@X8%rWY77\r\rc8 \rlr\u0005\u0001j`nq\u0014\u007flq\u0010\u0016t\u0005w\u0014\u001d\rdi\u0005\u000bdk\u007f\u0003\u0001``r\u0005h\rU]%,\rqy\t\u0010\rpr\u0018\u0015x`\u0010q6HCc2+XKHq\rcqy\u0016\u0001\u007f\f";
                                n = 45;
                                continue Label_0016;
                            }
                            case 45: {
                                array[n2] = intern;
                                n2 = 47;
                                s = "h\u0014\u001cy";
                                n = 46;
                                array = z2;
                                continue Label_0016;
                            }
                            case 46: {
                                array[n2] = intern;
                                n2 = 48;
                                s = "L06YL_84LKH\u000e,LVT";
                                n = 47;
                                array = z2;
                                continue Label_0016;
                            }
                            case 47: {
                                array[n2] = intern;
                                n2 = 49;
                                s = "_9%YzP87Y";
                                n = 48;
                                array = z2;
                                continue Label_0016;
                            }
                            case 48: {
                                array[n2] = intern;
                                n2 = 50;
                                s = "[#+XUc!%_QU2-]DR%7rMU\"0BWE";
                                n = 49;
                                array = z2;
                                continue Label_0016;
                            }
                            case 49: {
                                array[n2] = intern;
                                n2 = 51;
                                s = "\u007f\u0003\u0001lqyq\u0010\u007fl{\u0016\u0001\u007f\u0005Q47^D[47rGX\u000e0_L[6!_\u0005~\u0014\u0002bwyq\u0000hiy\u0005\u0001\rjrq)HVO0#HV\u001c\u0013\u0001jlrq\u0000hiy\u0005\u0001\rcn\u001e\t\rHY\"7LBY\"\u001bKQOq\u0013e`n\u0014dIJ_8 \u0010JP5jrLXjdhkx";
                                n = 50;
                                array = z2;
                                continue Label_0016;
                            }
                            case 50: {
                                array[n2] = intern;
                                n2 = 52;
                                s = "u\u001f\u0010hby\u0003";
                                n = 51;
                                array = z2;
                                continue Label_0016;
                            }
                            case 51: {
                                array[n2] = intern;
                                n2 = 53;
                                s = "_9%YzP87Y";
                                n = 52;
                                array = z2;
                                continue Label_0016;
                            }
                            case 52: {
                                array[n2] = intern;
                                n2 = 54;
                                s = "N03rA]%%";
                                n = 53;
                                array = z2;
                                continue Label_0016;
                            }
                            case 53: {
                                array[n2] = intern;
                                n2 = 55;
                                s = "Q4 DDc9%^M";
                                n = 54;
                                array = z2;
                                continue Label_0016;
                            }
                            case 54: {
                                array[n2] = intern;
                                n2 = 56;
                                s = "Q\"#^QS#!\u0002BY%3_LH0&A@X3dDV\u001c#!LA\u001c>*A\\";
                                n = 55;
                                array = z2;
                                continue Label_0016;
                            }
                            case 55: {
                                array[n2] = intern;
                                n2 = 57;
                                s = "Q47^D[47";
                                n = 56;
                                array = z2;
                                continue Label_0016;
                            }
                            case 56: {
                                array[n2] = intern;
                                n2 = 58;
                                s = "[#+XUc!%_QU2-]DR%7";
                                n = 57;
                                array = z2;
                                continue Label_0016;
                            }
                            case 57: {
                                array[n2] = intern;
                                n2 = 59;
                                s = "Q47^D[47";
                                n = 58;
                                array = z2;
                                continue Label_0016;
                            }
                            case 58: {
                                array[n2] = intern;
                                s = "Q47^D[47";
                                n = 59;
                                n2 = 60;
                                array = z2;
                                continue Label_0016;
                            }
                            case 59: {
                                array[n2] = intern;
                                n2 = 61;
                                array = z2;
                                s = "P07YzN4%IzN4'HLL%\u001b^@R%\u001b@@O\"%J@c%%OIY\u000e-I";
                                n = 60;
                                continue Label_0016;
                            }
                            case 60: {
                                array[n2] = intern;
                                n2 = 62;
                                s = "Q47^D[47";
                                n = 61;
                                array = z2;
                                continue Label_0016;
                            }
                            case 61: {
                                array[n2] = intern;
                                n2 = 63;
                                s = "u\u001f\u0010hby\u0003";
                                n = 62;
                                array = z2;
                                continue Label_0016;
                            }
                            case 62: {
                                array[n2] = intern;
                                n2 = 64;
                                s = "Q\"#^QS#!\u0002BY%3_LH0&A@X3kALO%d";
                                n = 63;
                                array = z2;
                                continue Label_0016;
                            }
                            case 63: {
                                array[n2] = intern;
                                n2 = 65;
                                s = "Q47^D[47rCH\"";
                                n = 64;
                                array = z2;
                                continue Label_0016;
                            }
                            case 64: {
                                array[n2] = intern;
                                n2 = 66;
                                s = "u\u001f\u0010hby\u0003";
                                n = 65;
                                array = z2;
                                continue Label_0016;
                            }
                            case 65: {
                                array[n2] = intern;
                                n2 = 67;
                                s = "O>6YzH8)HVH0)]";
                                n = 66;
                                array = z2;
                                continue Label_0016;
                            }
                            case 66: {
                                array[n2] = intern;
                                n2 = 68;
                                s = "Q4 DDc#!KV";
                                n = 67;
                                array = z2;
                                continue Label_0016;
                            }
                            case 67: {
                                array[n2] = intern;
                                n2 = 69;
                                s = "_9%YzP87Y";
                                n = 68;
                                array = z2;
                                continue Label_0016;
                            }
                            case 68: {
                                array[n2] = intern;
                                n2 = 70;
                                s = "\u007f\u0003\u0001lqyq\rcay\td_@_4-]QO\u000e/H\\c8*I@Dq+C\u0005N4'HLL%7\r\rW4=rWY<+Y@c;-I\t\u001c:!TzU5m";
                                n = 69;
                                array = z2;
                                continue Label_0016;
                            }
                            case 69: {
                                array[n2] = intern;
                                n2 = 71;
                                s = "Q4 DDc51_DH8+C";
                                n = 70;
                                array = z2;
                                continue Label_0016;
                            }
                            case 70: {
                                array[n2] = intern;
                                n2 = 72;
                                s = "Q\"#^QS#!\u0002BY%3_LH0&A@X3kIJR4kALO%d";
                                n = 71;
                                array = z2;
                                continue Label_0016;
                            }
                            case 71: {
                                array[n2] = intern;
                                n2 = 73;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014dJWS$4rU]#0DFU!%CQOqlrLXq\rcqy\u0016\u0001\u007f\u0005l\u0003\r`dn\bdf`eq\u0005xqs\u0018\nnwy\u001c\u0001cq\u0010q#GLXq\u0010h}hq\nbq\u001c\u001f\u0011ai\u0010q.DA\u001c\u0005\u0001uq\u001c\u001f\u000by\u0005r\u0004\ba\t\u001c0 @LRq\rcqy\u0016\u0001\u007f\t\u001c!!CAU?#\rlr\u0005\u0001j`n}d^@R%\u001b^@R5!_zW4=\rlr\u0005\u0001j`nx";
                                n = 72;
                                array = z2;
                                continue Label_0016;
                            }
                            case 72: {
                                array[n2] = intern;
                                n2 = 74;
                                s = "L#+]V";
                                n = 73;
                                array = z2;
                                continue Label_0016;
                            }
                            case 73: {
                                array[n2] = intern;
                                n2 = 75;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014d]WS!7\r\rc8 \rlr\u0005\u0001j`nq\u0014\u007flq\u0010\u0016t\u0005w\u0014\u001d\rdi\u0005\u000bdk\u007f\u0003\u0001``r\u0005h\rNY(dy`d\u0005dxku\u0000\u0011h\t\u001c'%APYq\u0010h}hx";
                                n = 74;
                                array = z2;
                                continue Label_0016;
                            }
                            case 74: {
                                array[n2] = intern;
                                n2 = 76;
                                s = "_9%YzP87Y";
                                n = 75;
                                array = z2;
                                continue Label_0016;
                            }
                            case 75: {
                                array[n2] = intern;
                                n2 = 77;
                                s = "Q47^D[47";
                                n = 76;
                                array = z2;
                                continue Label_0016;
                            }
                            case 76: {
                                array[n2] = intern;
                                n2 = 78;
                                s = "Q47^D[47";
                                n = 77;
                                array = z2;
                                continue Label_0016;
                            }
                            case 77: {
                                array[n2] = intern;
                                n2 = 79;
                                s = "Q47^D[47";
                                n = 78;
                                array = z2;
                                continue Label_0016;
                            }
                            case 78: {
                                array[n2] = intern;
                                n2 = 80;
                                s = "Q\"#^QS#!\u0002BY%3_LH0&A@X3dIJY\"*\nQ\u001c4<DVH";
                                n = 79;
                                array = z2;
                                continue Label_0016;
                            }
                            case 79: {
                                array[n2] = intern;
                                n2 = 81;
                                s = "_9%YzP87Y";
                                n = 80;
                                array = z2;
                                continue Label_0016;
                            }
                            case 80: {
                                array[n2] = intern;
                                n2 = 82;
                                s = "Q4 DDc%=]@c;-IzU? H]";
                                n = 81;
                                array = z2;
                                continue Label_0016;
                            }
                            case 81: {
                                array[n2] = intern;
                                n2 = 83;
                                s = "\u007f\u0003\u0001lqyq\rcay\td@@X8%rM]\",rLR5!U\u0005S?d@@O\"%J@Oql@@X8%rM]\",\u0004";
                                n = 82;
                                array = z2;
                                continue Label_0016;
                            }
                            case 82: {
                                array[n2] = intern;
                                n2 = 84;
                                s = "O4(HFHq7\\I\u001c76BH\u001c\"5ALH4\u001b@DO%!_\u0005K9!_@\u001c%=]@\u0001v0LGP4c\rDR5dCDQ4y\n";
                                n = 83;
                                array = z2;
                                continue Label_0016;
                            }
                            case 83: {
                                array[n2] = intern;
                                n2 = 85;
                                s = "Q\"#^QS#!\u0002BY%3_LH0&A@X3k@@O\"%J@Oq7NMY<%\r";
                                n = 84;
                                array = z2;
                                continue Label_0016;
                            }
                            case 84: {
                                array[n2] = intern;
                                n2 = 86;
                                s = "\u001bj";
                                n = 85;
                                array = z2;
                                continue Label_0016;
                            }
                            case 85: {
                                array[n2] = intern;
                                n2 = 87;
                                s = "\u007f\u0003\u0001lqyq\rcay\td@@X8%rQE!!rLR5!U\u0005S?d@@O\"%J@Oql@@X8%rR]\u000e0TUYx";
                                n = 86;
                                array = z2;
                                continue Label_0016;
                            }
                            case 86: {
                                array[n2] = intern;
                                n2 = 88;
                                s = "\u0011;+XWR0(";
                                n = 87;
                                array = z2;
                                continue Label_0016;
                            }
                            case 87: {
                                array[n2] = intern;
                                n2 = 89;
                                s = "\u0011&%A";
                                n = 88;
                                array = z2;
                                continue Label_0016;
                            }
                            case 88: {
                                array[n2] = intern;
                                n2 = 90;
                                s = "\u0011\",@";
                                n = 89;
                                array = z2;
                                continue Label_0016;
                            }
                            case 89: {
                                array[n2] = intern;
                                n2 = 91;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014d_@_4-]QOqlrLXq\rcqy\u0016\u0001\u007f\u0005l\u0003\r`dn\bdf`eq\u0005xqs\u0018\nnwy\u001c\u0001cq\u0010q/H\\c#!@JH4\u001bGLXq\u0010h}hq\nbq\u001c\u001f\u0011ai\u0010q/H\\c8 \rqy\t\u0010\rks\u0005dcpp\u001dh\rWY<+Y@c#!^JI#'H\u0005h\u0014\u001cy\t\u001c#!N@U!0rAY'-N@c%-@@O%%@U\u001c\u0018\ny`{\u0014\u0016\u0001\u0005N4%IzX42DFY\u000e0DHY\"0LHLq\rcqy\u0016\u0001\u007f\t\u001c!(L\\Y5\u001bI@J8'HzH8)HVH0)]\u0005u\u001f\u0010hby\u0003m";
                                n = 90;
                                array = z2;
                                continue Label_0016;
                            }
                            case 90: {
                                array[n2] = intern;
                                n2 = 92;
                                s = "u\u001f\u0017hwhq\rcqsq4_JL\"lF@E}d[DP$!\u0004\u0005j\u0010\bx`oql\nCH\"\u001bYJW4*D_Y#\u001b[@N\"-BK\u001b}d\u001c\f";
                                n = 91;
                                array = z2;
                                continue Label_0016;
                            }
                            case 91: {
                                array[n2] = intern;
                                n2 = 93;
                                s = "\u007f\u0003\u0001lqyq\u0012dwh\u0004\u0005a\u0005h\u0010\u0006a`\u001c<!^V]6!^zZ%7\rpo\u0018\nj\u0005z\u0005\u0017\u001e\r\u0015";
                                n = 92;
                                array = z2;
                                continue Label_0016;
                            }
                            case 92: {
                                array[n2] = intern;
                                n2 = 94;
                                s = "x\u0003\u000b}\u0005h\u0010\u0006a`\u001c\u0018\u0002\r`d\u0018\u0017yv\u001c!6BUO";
                                n = 93;
                                array = z2;
                                continue Label_0016;
                            }
                            case 93: {
                                array[n2] = intern;
                                n2 = 95;
                                s = "u\u001f\u0017hwhq\rcqsq4_JL\"lF@E}d[DP$!\u0004\u0005j\u0010\bx`oql\nCH\"\u001b_@]5=\n\t\u001c`m";
                                n = 94;
                                array = z2;
                                continue Label_0016;
                            }
                            case 94: {
                                array[n2] = intern;
                                n2 = 96;
                                s = "\u007f\u0003\u0001lqyq\rcay\tdJWS$4rU]#0DFU!%CQO\u000e,DVH>6TzU? H]\u001c>*\rBN>1]zL06YL_84LKH\"\u001bELO%+_\\\u001cy#GLXx";
                                n = 95;
                                array = z2;
                                continue Label_0016;
                            }
                            case 95: {
                                array[n2] = intern;
                                n2 = 97;
                                s = "x\u0003\u000b}\u0005h\u0010\u0006a`\u001c\u0018\u0002\r`d\u0018\u0017yv\u001c<!^V]6!^";
                                n = 96;
                                array = z2;
                                continue Label_0016;
                            }
                            case 96: {
                                array[n2] = intern;
                                n2 = 98;
                                s = "\u007f\u0003\u0001lqyq\rcay\td@@X8%rQE!!rOU5\u001bDKX4<\rJRq)HVO0#HV\u001cy/H\\c#!@JH4\u001bGLX}d@@X8%rR]\u000e0TUYx";
                                n = 97;
                                array = z2;
                                continue Label_0016;
                            }
                            case 97: {
                                array[n2] = intern;
                                n2 = 99;
                                s = "u\u001f\u0017hwhq\rcqsq)HVO0#HV\u0014\u000e-I\t\u001c:!TzN4)BQY\u000e.DA\u0010q/H\\c76BHc<!\u0001\u0005W4=rLX}d^Q]%1^\t\u001c?!HAO\u000e4XVT}dIDH0h\rQU<!^Q]<4\u0001\u0005Q4 DDc$6A\t\u001c<!IL]\u000e)DHY\u000e0TUY}d@@X8%rR]\u000e0TUY}d@@X8%rVU+!\u0001\u0005Q4 DDc?%@@\u0010q)HAU0\u001bEDO9h\rHY5-LzX$6LQU>*\u0001\u0005S#-JLR}dADH80XAY}dAJR6-YPX4h\rQT$)OzU<%J@\u0010q6HFY82HAc%-@@O%%@U\u0010q7HKX\u000e0DHY\"0LHL}d_@_4-]Qc\"!_SY#\u001bYLQ47YDQ!h\rWY2!DUH\u000e HSU2!rQU<!^Q]<4\u0001\u0005N4%IzX42DFY\u000e0DHY\"0LHL}d]I](!IzX42DFY\u000e0DHY\"0LHLxd{dp\u0004\u0001~\u0005\u0014`h\r\u0002\u0011`c\u0001\u0005\f}d\n\b\rvh\r\b\r}d\u001d\t\u001c\u001f\u0011ai\u0010qt\u0001\u0005r\u0004\ba\t\u001c\u001f\u0011ai\u0010qi\u001c\t\u001c|u\u0001\u0005r\u0004\ba\t\u001c\u001f\u0011ai\u0010qt\u0001\u0005\f}d\u001d\t\u001cah\rki\u001d\b\u0001\u0005\u0011`h\r\b\r}d\u0000\u0014\u0010qi\u001c\t\u001c|u\u0001\u0005\u0011`m";
                                n = 98;
                                array = z2;
                                continue Label_0016;
                            }
                            case 98: {
                                array[n2] = intern;
                                n2 = 100;
                                s = "\u007f\u0003\u0001lqyq\rcay\td@@X8%rQE!!rLR5!U\u0005S?d@@O\"%J@Oql@@X8%rR]\u000e0TUYx";
                                n = 99;
                                array = z2;
                                continue Label_0016;
                            }
                            case 99: {
                                array[n2] = intern;
                                n2 = 101;
                                s = "x\u0003\u000b}\u0005h\u0010\u0006a`\u001c\u0018\u0002\r`d\u0018\u0017yv\u001c#!N@U!0^";
                                n = 100;
                                array = z2;
                                continue Label_0016;
                            }
                            case 100: {
                                array[n2] = intern;
                                n2 = 102;
                                s = "x\u0003\u000b}\u0005h\u0010\u0006a`\u001c\u0018\u0002\r`d\u0018\u0017yv\u001c66BPL\u000e4LWH8'DU]?0^zT87YJN(";
                                n = 101;
                                array = z2;
                                continue Label_0016;
                            }
                            case 101: {
                                array[n2] = intern;
                                n2 = 103;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014d]WS!7\r\rc8 \rlr\u0005\u0001j`nq\u0014\u007flq\u0010\u0016t\u0005w\u0014\u001d\rdi\u0005\u000bdk\u007f\u0003\u0001``r\u0005h\rNY(dy`d\u0005dxku\u0000\u0011h\t\u001c'%APYq\u0010h}hx";
                                n = 102;
                                array = z2;
                                continue Label_0016;
                            }
                            case 102: {
                                array[n2] = intern;
                                n2 = 104;
                                s = "\u007f\u0003\u0001lqyq\u0010\u007fl{\u0016\u0001\u007f\u0005Q47^D[47rGX\u000e0_L[6!_\u0005~\u0014\u0002bwyq\u0000hiy\u0005\u0001\rjrq)HVO0#HV\u001c\u0013\u0001jlrq\u0000hiy\u0005\u0001\rcn\u001e\t\rHY\"7LBY\"\u001bKQOq\u0013e`n\u0014dIJ_8 \u0010JP5jrLXjdhkx";
                                n = 103;
                                array = z2;
                                continue Label_0016;
                            }
                            case 103: {
                                array[n2] = intern;
                                n2 = 105;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014dJWS$4rU]#0DFU!%CQOqlrLXq\rcqy\u0016\u0001\u007f\u0005l\u0003\r`dn\bdf`eq\u0005xqs\u0018\nnwy\u001c\u0001cq\u0010q#GLXq\u0010h}hq\nbq\u001c\u001f\u0011ai\u0010q.DA\u001c\u0005\u0001uq\u001c\u001f\u000by\u0005r\u0004\ba\t\u001c0 @LRq\rcqy\u0016\u0001\u007f\t\u001c!!CAU?#\rlr\u0005\u0001j`n}d^@R%\u001b^@R5!_zW4=\rlr\u0005\u0001j`nx";
                                n = 104;
                                array = z2;
                                continue Label_0016;
                            }
                            case 104: {
                                array[n2] = intern;
                                n2 = 106;
                                s = "x\u0003\u000b}\u0005h\u0003\rjby\u0003ddc\u001c\u0014\u001cdvh\u0002d@@O\"%J@O\u000e&IzH#-JBY#";
                                n = 105;
                                array = z2;
                                continue Label_0016;
                            }
                            case 105: {
                                array[n2] = intern;
                                n2 = 107;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014d@@O\"%J@OqlrLXq\rcqy\u0016\u0001\u007f\u0005l\u0003\r`dn\bdf`eq\u0005xqs\u0018\nnwy\u001c\u0001cq\u0010q/H\\c#!@JH4\u001bGLXq\u0010h}hq\nbq\u001c\u001f\u0011ai\u0010q/H\\c76BHc<!\rlr\u0005\u0001j`n}dF@E\u000e-I\u0005h\u0014\u001cy\u0005r\u001e\u0010\rki\u001d\b\u0001\u0005O%%YPOq\rcqy\u0016\u0001\u007f\t\u001c?!HAO\u000e4XVTq\rcqy\u0016\u0001\u007f\t\u001c5%YD\u001c\u0005\u0001uq\u0010q0DHY\"0LHLq\rcqy\u0016\u0001\u007f\t\u001c<!IL]\u000e1_I\u001c\u0005\u0001uq\u0010q)HAU0\u001b@LQ4\u001bY\\L4dy`d\u0005h\rHY5-LzK0\u001bY\\L4dy`d\u0005h\rHY5-LzO8>H\u0005u\u001f\u0010hby\u0003h\rHY5-LzR0)H\u0005h\u0014\u001cy\t\u001c<!IL]\u000e'LUH8+C\u0005h\u0014\u001cy\t\u001c<!IL]\u000e,LVTq\u0010h}h}d@@X8%rAI#%YLS?ddkh\u0014\u0003hw\u0010q+_L[8*\rlr\u0005\u0001j`n}dADH80XAYq\u0016hdp}dAJR6-YPX4d\u007f`}\u001dh\rQT$)OzU<%J@\u001c\u0005\u0001uq\u0010q6HHS%!rWY\"+XW_4dy`d\u0005h\rWY2!DSY5\u001bYLQ47YDQ!ddkh\u0014\u0003hw\u0010q7HKX\u000e0DHY\"0LHLq\rcqy\u0016\u0001\u007f\t\u001c#!N@U!0rVY#2HWc%-@@O%%@U\u001c\u0018\ny`{\u0014\u0016\u0001\u0005N4'HLL%\u001bI@J8'HzH8)HVH0)]\u0005u\u001f\u0010hby\u0003h\rWY0 rAY'-N@c%-@@O%%@U\u001c\u0018\ny`{\u0014\u0016\u0001\u0005L=%T@X\u000e HSU2!rQU<!^Q]<4\rlr\u0005\u0001j`n}d_DK\u000e LQ]q\u0006aj~}d_@_84D@R%\u001bNJI?0\rlr\u0005\u0001j`n}d]DN%-NLL0*YzT07E\u0005h\u0014\u001cy\f";
                                n = 106;
                                array = z2;
                                continue Label_0016;
                            }
                            case 106: {
                                array[n2] = intern;
                                n2 = 108;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014dNM]%\u001bALO%d\u0005zU5ddkh\u0014\u0003hw\u001c\u0001\u0016dh}\u0003\u001d\rny\bdlph\u001e\rcfn\u0014\thkh}dF@E\u000e6HHS%!rOU5dy`d\u0005dxku\u0000\u0011h\t\u001c<!^V]6!rQ]3(HzU5ddkh\u0014\u0003hw\u0010q7XGV4'Y\u0005h\u0014\u001cy\t\u001c26HDH8+C\u0005u\u001f\u0010hby\u0003h\rI]\"0rWY0 rHY\"7LBY\u000e0LGP4\u001bDA\u001c\u0018\ny`{\u0014\u0016\u0001\u0005P07YzN4%IzN4'HLL%\u001b^@R%\u001b@@O\"%J@c%%OIY\u000e-I\u0005u\u001f\u0010hby\u0003h\rDN2,DSY5ddkh\u0014\u0003hw\u0010q7BWH\u000e0DHY\"0LHLq\rcqy\u0016\u0001\u007f\t\u001c<+IzH0#\rlr\u0005\u0001j`nx";
                                n = 107;
                                array = z2;
                                continue Label_0016;
                            }
                            case 107: {
                                array[n2] = intern;
                                n2 = 109;
                                s = "\u007f\u0003\u0001lqyq\rcay\td_@_4-]QO\u000e/H\\c8*I@Dq+C\u0005N4'HLL%7\r\rW4=rWY<+Y@c;-I\t\u001c:!TzU5m";
                                n = 108;
                                array = z2;
                                continue Label_0016;
                            }
                            case 108: {
                                array[n2] = intern;
                                n2 = 110;
                                s = "x\u0003\u000b}\u0005h\u0010\u0006a`\u001c\u0018\u0002\r`d\u0018\u0017yv\u001c<!IL]\u000e6HCO";
                                n = 109;
                                array = z2;
                                continue Label_0016;
                            }
                            case 109: {
                                array[n2] = intern;
                                n2 = 111;
                                s = "Q\"#^QS#!\u0002FN4%Y@\u001c";
                                n = 110;
                                array = z2;
                                continue Label_0016;
                            }
                            case 110: {
                                array[n2] = intern;
                                n2 = 112;
                                s = "x\u0003\u000b}\u0005h\u0010\u0006a`\u001c\u0018\u0002\r`d\u0018\u0017yv\u001c<!^V]6!^zZ%7";
                                n = 111;
                                array = z2;
                                continue Label_0016;
                            }
                            case 111: {
                                array[n2] = intern;
                                n2 = 113;
                                s = "\u007f\u0003\u0001lqyq\rcay\td@@X8%rM]\",rLR5!U\u0005S?d@@O\"%J@Oql@@X8%rM]\",\u0004";
                                n = 112;
                                array = z2;
                                continue Label_0016;
                            }
                            case 112: {
                                array[n2] = intern;
                                n2 = 114;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014dJWS$4rU]#0DFU!%CQO\u000e,DVH>6T\u0005\u0014\u000e-I\u0005u\u001f\u0010hby\u0003d}wu\u001c\u0005\u007f|\u001c\u001a\u0001t\u0005}\u0004\u0010blr\u0012\u0016hhy\u001f\u0010\u0001\u0005H8)HVH0)]\u0005x\u0010\u0010hqu\u001c\u0001\rks\u0005dcpp\u001dh\rBV8 \rqy\t\u0010\rks\u0005dcpp\u001dh\rOU5dy`d\u0005dcjhq\nxip}dLFH8+C\u0005u\u001f\u0010hby\u0003dcjhq\nxip}dBIX\u000e4EDO9dy`d\u0005dcjhq\nxip}dC@K\u000e4EDO9dy`d\u0005dcjhq\nxipx";
                                n = 113;
                                array = z2;
                                continue Label_0016;
                            }
                            case 113: {
                                array[n2] = intern;
                                n2 = 115;
                                s = "x\u0003\u000b}\u0005h\u0010\u0006a`\u001c\u0018\u0002\r`d\u0018\u0017yv\u001c66BPL\u000e4LWH8'DU]?0^";
                                n = 114;
                                array = z2;
                                continue Label_0016;
                            }
                            case 114: {
                                array[n2] = intern;
                                n2 = 116;
                                s = "\u007f\u0003\u0001lqyq\u0010lgp\u0014d@@X8%rWY77\r\rc8 \rlr\u0005\u0001j`nq\u0014\u007flq\u0010\u0016t\u0005w\u0014\u001d\rdi\u0005\u000bdk\u007f\u0003\u0001``r\u0005h\rU]%,\rqy\t\u0010\rpr\u0018\u0015x`\u0010q6HCc2+XKHq\rcqy\u0016\u0001\u007f\f";
                                n = 115;
                                array = z2;
                                continue Label_0016;
                            }
                            case 115: {
                                array[n2] = intern;
                                n2 = 117;
                                s = "x\u0003\u000b}\u0005h\u0010\u0006a`\u001c\u0018\u0002\r`d\u0018\u0017yv\u001c2,LQc=-^Q";
                                n = 116;
                                array = z2;
                                continue Label_0016;
                            }
                            case 116: {
                                array[n2] = intern;
                                n2 = 118;
                                s = "\u007f\u0003\u0001lqyq\u0011clm\u0004\u0001\rlr\u0015\u0001u\u0005[#+XUc!%_QU2-]DR%7rLR5!U\u0005S?dJWS$4rU]#0DFU!%CQOqlJOU5h\rOU5m";
                                n = 117;
                                array = z2;
                                continue Label_0016;
                            }
                            case 117: {
                                array[n2] = intern;
                                n2 = 119;
                                s = "\u007f\u0003\u0001lqyq\u0011clm\u0004\u0001\rlr\u0015\u0001u\u0005Q47^D[47rNY(\u001bDKX4<\rJRq)HVO0#HV\u001cy/H\\c#!@JH4\u001bGLX}dF@E\u000e\"_JQ\u000e)H\t\u001c:!TzU5m";
                                n = 118;
                                array = z2;
                                continue Label_0016;
                            }
                            case 118: {
                                array[n2] = intern;
                                n2 = 120;
                                s = "Q\"#^QS#!\u0002PL66LAYq2HWO8+C\u0005";
                                n = 119;
                                array = z2;
                                continue Label_0016;
                            }
                            case 119: {
                                array[n2] = intern;
                                n2 = 121;
                                s = "\u001c%+\r";
                                n = 120;
                                array = z2;
                                continue Label_0016;
                            }
                            case 120: {
                                array[n2] = intern;
                                n2 = 122;
                                s = "l\u0003\u0005jh}q7TK_96BKS$7\u0010ks\u0003\tli\u0007";
                                n = 121;
                                array = z2;
                                continue Label_0016;
                            }
                            case 121: {
                                array[n2] = intern;
                                n2 = 123;
                                s = "\u001c\u0010\u0000i\u0005";
                                n = 122;
                                array = z2;
                                continue Label_0016;
                            }
                            case 122: {
                                array[n2] = intern;
                                n2 = 124;
                                s = "}\u001d\u0010hw\u001c\u0005\u0005oiyq";
                                n = 123;
                                array = z2;
                                continue Label_0016;
                            }
                            case 123: {
                                array[n2] = intern;
                                n2 = 125;
                                s = "Q\"#^QS#!\u0002DP%!_zH0&A@\u001c";
                                n = 124;
                                array = z2;
                                continue Label_0016;
                            }
                            case 124: {
                                array[n2] = intern;
                                n2 = 126;
                                s = "\u007f\u0003\u0001lqyq\rcay\td@@X8%rQE!!rOU5\u001bDKX4<\rJRq)HVO0#HV\u001cy/H\\c#!@JH4\u001bGLX}d@@X8%rR]\u000e0TUYx";
                                n = 125;
                                array = z2;
                                continue Label_0016;
                            }
                            case 125: {
                                break;
                            }
                        }
                        array[n2] = intern;
                        z = z2;
                        try {
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            int n4 = 0;
                            if (sdk_INT >= 16) {
                                n4 = 536870912;
                            }
                            c = (n4 | 0x10);
                            return;
                            Label_3316: {
                                final char c2 = 'Q';
                            }
                            while (true) {
                                break Label_3292;
                                Label_3330:
                                char c2 = '-';
                                break Label_3292;
                                Label_3288:
                                c2 = '%';
                                break Label_3292;
                                Label_3323:
                                c2 = 'D';
                                break Label_3292;
                                final char c3 = charArray[n3];
                                charArray[n3] = (char)(c2 ^ c3);
                                ++n3;
                                continue Label_3292_Outer;
                                Label_3309:
                                c2 = '<';
                                continue;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@490c4b03, n3 % 5)
                        catch (SQLiteException ex) {
                            throw ex;
                        }
                    }
                }
            }
            break;
        }
    }
    
    a2x(final Context context) {
        super(context, a2x.z[3], (SQLiteDatabase$CursorFactory)null, 1);
        this.e = null;
    }
    
    private String a(final String s) {
        String string = "";
        final Cursor rawQuery = this.e.rawQuery(a2x.z[84] + s + a2x.z[86], (String[])null);
        if (rawQuery == null) {
            return string;
        }
        try {
            if (rawQuery.moveToNext()) {
                string = rawQuery.getString(0);
            }
            return string;
        }
        catch (Exception ex) {
            Log.e(a2x.z[85] + s + " " + ex.toString());
            return string;
        }
        finally {
            rawQuery.close();
        }
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a2x.d:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifne            50
        //    11: aload_0        
        //    12: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    15: astore          5
        //    17: aload           5
        //    19: ifnull          50
        //    22: aload_0        
        //    23: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    26: invokevirtual   android/database/sqlite/SQLiteDatabase.isOpen:()Z
        //    29: ifeq            50
        //    32: aload_0        
        //    33: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    36: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //    39: bipush          87
        //    41: aaload         
        //    42: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    45: aload_0        
        //    46: iconst_1       
        //    47: putfield        com/whatsapp/a2x.d:Z
        //    50: return         
        //    51: astore_1       
        //    52: aload_1        
        //    53: athrow         
        //    54: astore_2       
        //    55: aload_2        
        //    56: athrow         
        //    57: astore_3       
        //    58: aload_3        
        //    59: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      6      51     54     Landroid/database/sqlite/SQLiteException;
        //  11     17     54     57     Landroid/database/sqlite/SQLiteException;
        //  22     50     57     60     Landroid/database/sqlite/SQLiteException;
        //  52     54     54     57     Landroid/database/sqlite/SQLiteException;
        //  55     57     57     60     Landroid/database/sqlite/SQLiteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 33, Size: 33
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
    
    public static void a(final int n, final Object o, final SQLiteStatement sqLiteStatement) {
        Label_0019: {
            if (o != null) {
                break Label_0019;
            }
            try {
                sqLiteStatement.bindNull(n);
                if (a_9.k) {
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    new ObjectOutputStream(byteArrayOutputStream).writeObject(o);
                    sqLiteStatement.bindBlob(n, byteArrayOutputStream.toByteArray());
                }
            }
            catch (SQLiteException ex) {
                throw ex;
            }
        }
    }
    
    public static void a(final int n, final String s, final SQLiteStatement sqLiteStatement) {
        Label_0015: {
            if (s != null) {
                break Label_0015;
            }
            try {
                sqLiteStatement.bindNull(n);
                if (a_9.k) {
                    sqLiteStatement.bindString(n, s);
                }
            }
            catch (SQLiteException ex) {
                throw ex;
            }
        }
    }
    
    public static void a(final int n, final byte[] array, final SQLiteStatement sqLiteStatement) {
        Label_0015: {
            if (array != null) {
                break Label_0015;
            }
            try {
                sqLiteStatement.bindNull(n);
                if (a_9.k) {
                    sqLiteStatement.bindBlob(n, array);
                }
            }
            catch (SQLiteException ex) {
                throw ex;
            }
        }
    }
    
    static void a(final a2x a2x) {
        a2x.c();
    }
    
    private void a(final String s, final String s2, final String s3, final String s4) {
        if (s.contains(s3 + " " + s4)) {
            return;
        }
        try {
            this.e.execSQL(a2x.z[124] + s2 + a2x.z[123] + s3 + " " + s4);
        }
        catch (SQLiteException ex) {
            Log.e(a2x.z[125] + s3 + " " + ex.toString());
        }
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a2x.b:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifne            50
        //    11: aload_0        
        //    12: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    15: astore          5
        //    17: aload           5
        //    19: ifnull          50
        //    22: aload_0        
        //    23: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    26: invokevirtual   android/database/sqlite/SQLiteDatabase.isOpen:()Z
        //    29: ifeq            50
        //    32: aload_0        
        //    33: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    36: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //    39: bipush          126
        //    41: aaload         
        //    42: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    45: aload_0        
        //    46: iconst_1       
        //    47: putfield        com/whatsapp/a2x.b:Z
        //    50: return         
        //    51: astore_1       
        //    52: aload_1        
        //    53: athrow         
        //    54: astore_2       
        //    55: aload_2        
        //    56: athrow         
        //    57: astore_3       
        //    58: aload_3        
        //    59: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      6      51     54     Landroid/database/sqlite/SQLiteException;
        //  11     17     54     57     Landroid/database/sqlite/SQLiteException;
        //  22     50     57     60     Landroid/database/sqlite/SQLiteException;
        //  52     54     54     57     Landroid/database/sqlite/SQLiteException;
        //  55     57     57     60     Landroid/database/sqlite/SQLiteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 33, Size: 33
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
    
    static boolean b(final a2x a2x) {
        return a2x.d();
    }
    
    private boolean b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             ""
        //     2: astore_2       
        //     3: aload_0        
        //     4: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //     7: new             Ljava/lang/StringBuilder;
        //    10: dup            
        //    11: invokespecial   java/lang/StringBuilder.<init>:()V
        //    14: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //    17: iconst_0       
        //    18: aaload         
        //    19: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    22: aload_1        
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //    29: iconst_1       
        //    30: aaload         
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    37: aconst_null    
        //    38: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //    41: astore_3       
        //    42: aload_3        
        //    43: ifnull          73
        //    46: aload_3        
        //    47: invokeinterface android/database/Cursor.moveToNext:()Z
        //    52: ifeq            67
        //    55: aload_3        
        //    56: iconst_0       
        //    57: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    62: astore          8
        //    64: aload           8
        //    66: astore_2       
        //    67: aload_3        
        //    68: invokeinterface android/database/Cursor.close:()V
        //    73: aload_2        
        //    74: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    77: istore          5
        //    79: iload           5
        //    81: ifne            142
        //    84: iconst_1       
        //    85: ireturn        
        //    86: astore          7
        //    88: new             Ljava/lang/StringBuilder;
        //    91: dup            
        //    92: invokespecial   java/lang/StringBuilder.<init>:()V
        //    95: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //    98: iconst_2       
        //    99: aaload         
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: aload           7
        //   105: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   114: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   117: aload_3        
        //   118: invokeinterface android/database/Cursor.close:()V
        //   123: goto            73
        //   126: astore          6
        //   128: aload_3        
        //   129: invokeinterface android/database/Cursor.close:()V
        //   134: aload           6
        //   136: athrow         
        //   137: astore          4
        //   139: aload           4
        //   141: athrow         
        //   142: iconst_0       
        //   143: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  46     64     86     126    Ljava/lang/Exception;
        //  46     64     126    137    Any
        //  73     79     137    142    Ljava/lang/Exception;
        //  88     117    126    137    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0073:
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
    
    private void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a2x.a:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifne            50
        //    11: aload_0        
        //    12: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    15: astore          5
        //    17: aload           5
        //    19: ifnull          50
        //    22: aload_0        
        //    23: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    26: invokevirtual   android/database/sqlite/SQLiteDatabase.isOpen:()Z
        //    29: ifeq            50
        //    32: aload_0        
        //    33: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    36: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //    39: bipush          83
        //    41: aaload         
        //    42: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    45: aload_0        
        //    46: iconst_1       
        //    47: putfield        com/whatsapp/a2x.a:Z
        //    50: return         
        //    51: astore_1       
        //    52: aload_1        
        //    53: athrow         
        //    54: astore_2       
        //    55: aload_2        
        //    56: athrow         
        //    57: astore_3       
        //    58: aload_3        
        //    59: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      6      51     54     Landroid/database/sqlite/SQLiteException;
        //  11     17     54     57     Landroid/database/sqlite/SQLiteException;
        //  22     50     57     60     Landroid/database/sqlite/SQLiteException;
        //  52     54     54     57     Landroid/database/sqlite/SQLiteException;
        //  55     57     57     60     Landroid/database/sqlite/SQLiteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 33, Size: 33
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
    
    static void c(final a2x a2x) {
        a2x.b();
    }
    
    static void d(final a2x a2x) {
        a2x.a();
    }
    
    private boolean d() {
        return false | vy.J.delete() | new File(vy.J.getPath() + a2x.z[88]).delete() | new File(vy.J.getPath() + a2x.z[90]).delete() | new File(vy.J.getPath() + a2x.z[89]).delete();
    }
    
    public void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //     6: astore          4
        //     8: aload           4
        //    10: ifnull          30
        //    13: aload_0        
        //    14: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    17: invokevirtual   android/database/sqlite/SQLiteDatabase.isOpen:()Z
        //    20: ifeq            30
        //    23: aload_0        
        //    24: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    27: invokevirtual   android/database/sqlite/SQLiteDatabase.close:()V
        //    30: aload_0        
        //    31: aconst_null    
        //    32: putfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    35: aload_0        
        //    36: monitorexit    
        //    37: return         
        //    38: astore_2       
        //    39: aload_2        
        //    40: athrow         
        //    41: astore_3       
        //    42: aload_3        
        //    43: athrow         
        //    44: astore_1       
        //    45: aload_0        
        //    46: monitorexit    
        //    47: aload_1        
        //    48: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  2      8      38     41     Landroid/database/sqlite/SQLiteException;
        //  2      8      44     49     Any
        //  13     30     41     44     Landroid/database/sqlite/SQLiteException;
        //  13     30     44     49     Any
        //  30     35     44     49     Any
        //  39     41     41     44     Landroid/database/sqlite/SQLiteException;
        //  39     41     44     49     Any
        //  42     44     44     49     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    public SQLiteDatabase getReadableDatabase() {
        synchronized (this) {
            return this.getWritableDatabase();
        }
    }
    
    public SQLiteDatabase getWritableDatabase() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: getstatic       com/whatsapp/a_9.k:Z
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    10: ifnull          51
        //    13: aload_0        
        //    14: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    17: invokevirtual   android/database/sqlite/SQLiteDatabase.isOpen:()Z
        //    20: istore          34
        //    22: iload           34
        //    24: ifeq            51
        //    27: aload_0        
        //    28: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //    31: astore          22
        //    33: aload_0        
        //    34: monitorexit    
        //    35: aload           22
        //    37: areturn        
        //    38: astore_3       
        //    39: aload_3        
        //    40: athrow         
        //    41: astore          4
        //    43: aload           4
        //    45: athrow         
        //    46: astore_1       
        //    47: aload_0        
        //    48: monitorexit    
        //    49: aload_1        
        //    50: athrow         
        //    51: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //    54: invokestatic    com/whatsapp/vy.d:(Ljava/io/File;)Z
        //    57: ifne            210
        //    60: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //    63: bipush          80
        //    65: aaload         
        //    66: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    69: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //    72: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    75: invokevirtual   java/io/File.exists:()Z
        //    78: ifne            91
        //    81: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //    84: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    87: invokevirtual   java/io/File.mkdirs:()Z
        //    90: pop            
        //    91: aload_0        
        //    92: invokespecial   com/whatsapp/a2x.d:()Z
        //    95: pop            
        //    96: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //    99: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   102: bipush          64
        //   104: aaload         
        //   105: invokestatic    com/whatsapp/vy.b:(Ljava/io/File;Ljava/lang/String;)V
        //   108: aload_0        
        //   109: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   112: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   115: aconst_null    
        //   116: ldc_w           268435456
        //   119: getstatic       com/whatsapp/a2x.c:I
        //   122: ior            
        //   123: invokestatic    android/database/sqlite/SQLiteDatabase.openDatabase:(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
        //   126: putfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   129: aload_0        
        //   130: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   133: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //   136: aload_0        
        //   137: aload_0        
        //   138: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   141: invokevirtual   com/whatsapp/a2x.onCreate:(Landroid/database/sqlite/SQLiteDatabase;)V
        //   144: aload_0        
        //   145: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   148: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   151: aload_0        
        //   152: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   155: astore          31
        //   157: aload           31
        //   159: ifnull          179
        //   162: aload_0        
        //   163: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   166: invokevirtual   android/database/sqlite/SQLiteDatabase.inTransaction:()Z
        //   169: ifeq            179
        //   172: aload_0        
        //   173: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   176: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   179: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   182: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   185: bipush          72
        //   187: aaload         
        //   188: invokestatic    com/whatsapp/vy.b:(Ljava/io/File;Ljava/lang/String;)V
        //   191: aload_0        
        //   192: iconst_1       
        //   193: putfield        com/whatsapp/a2x.a:Z
        //   196: aload_0        
        //   197: iconst_1       
        //   198: putfield        com/whatsapp/a2x.d:Z
        //   201: aload_0        
        //   202: iconst_1       
        //   203: putfield        com/whatsapp/a2x.b:Z
        //   206: iload_2        
        //   207: ifeq            991
        //   210: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   213: bipush          12
        //   215: aaload         
        //   216: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   219: aload_0        
        //   220: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   223: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   226: aconst_null    
        //   227: getstatic       com/whatsapp/a2x.c:I
        //   230: invokestatic    android/database/sqlite/SQLiteDatabase.openDatabase:(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
        //   233: putfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   236: aload_0        
        //   237: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   240: invokevirtual   android/database/sqlite/SQLiteDatabase.isReadOnly:()Z
        //   243: istore          7
        //   245: iload           7
        //   247: ifeq            259
        //   250: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   253: bipush          56
        //   255: aaload         
        //   256: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   259: aload_0        
        //   260: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   263: bipush          60
        //   265: aaload         
        //   266: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;)Ljava/lang/String;
        //   269: astore          8
        //   271: aload_0        
        //   272: aload           8
        //   274: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   277: bipush          77
        //   279: aaload         
        //   280: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   283: bipush          54
        //   285: aaload         
        //   286: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   289: bipush          22
        //   291: aaload         
        //   292: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   295: aload_0        
        //   296: aload           8
        //   298: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   301: bipush          45
        //   303: aaload         
        //   304: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   307: bipush          55
        //   309: aaload         
        //   310: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   313: bipush          31
        //   315: aaload         
        //   316: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   319: aload_0        
        //   320: aload           8
        //   322: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   325: bipush          59
        //   327: aaload         
        //   328: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   331: bipush          71
        //   333: aaload         
        //   334: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   337: bipush          6
        //   339: aaload         
        //   340: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   343: aload_0        
        //   344: aload           8
        //   346: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   349: bipush          62
        //   351: aaload         
        //   352: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   355: bipush          32
        //   357: aaload         
        //   358: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   361: bipush          63
        //   363: aaload         
        //   364: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   367: aload_0        
        //   368: aload           8
        //   370: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   373: bipush          36
        //   375: aaload         
        //   376: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   379: bipush          27
        //   381: aaload         
        //   382: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   385: bipush          34
        //   387: aaload         
        //   388: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   391: aload_0        
        //   392: aload           8
        //   394: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   397: bipush          57
        //   399: aaload         
        //   400: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   403: bipush          13
        //   405: aaload         
        //   406: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   409: bipush          66
        //   411: aaload         
        //   412: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   415: aload_0        
        //   416: aload           8
        //   418: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   421: bipush          79
        //   423: aaload         
        //   424: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   427: bipush          8
        //   429: aaload         
        //   430: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   433: bipush          10
        //   435: aaload         
        //   436: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   439: aload_0        
        //   440: aload           8
        //   442: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   445: bipush          20
        //   447: aaload         
        //   448: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   451: bipush          29
        //   453: aaload         
        //   454: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   457: bipush          47
        //   459: aaload         
        //   460: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   463: aload_0        
        //   464: aload           8
        //   466: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   469: bipush          78
        //   471: aaload         
        //   472: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   475: bipush          48
        //   477: aaload         
        //   478: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   481: bipush          14
        //   483: aaload         
        //   484: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   487: aload_0        
        //   488: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   491: bipush          69
        //   493: aaload         
        //   494: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;)Ljava/lang/String;
        //   497: astore          9
        //   499: aload_0        
        //   500: aload           9
        //   502: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   505: bipush          49
        //   507: aaload         
        //   508: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   511: bipush          37
        //   513: aaload         
        //   514: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   517: bipush          11
        //   519: aaload         
        //   520: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   523: aload_0        
        //   524: aload           9
        //   526: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   529: bipush          23
        //   531: aaload         
        //   532: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   535: bipush          26
        //   537: aaload         
        //   538: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   541: bipush          40
        //   543: aaload         
        //   544: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   547: aload_0        
        //   548: aload           9
        //   550: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   553: bipush          81
        //   555: aaload         
        //   556: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   559: bipush          33
        //   561: aaload         
        //   562: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   565: bipush          52
        //   567: aaload         
        //   568: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   571: aload_0        
        //   572: aload           9
        //   574: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   577: bipush          30
        //   579: aaload         
        //   580: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   583: bipush          61
        //   585: aaload         
        //   586: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   589: iconst_4       
        //   590: aaload         
        //   591: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   594: aload_0        
        //   595: aload           9
        //   597: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   600: bipush          53
        //   602: aaload         
        //   603: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   606: bipush          38
        //   608: aaload         
        //   609: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   612: bipush          41
        //   614: aaload         
        //   615: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   618: aload_0        
        //   619: aload           9
        //   621: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   624: bipush          76
        //   626: aaload         
        //   627: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   630: bipush          67
        //   632: aaload         
        //   633: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   636: bipush          43
        //   638: aaload         
        //   639: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   642: aload_0        
        //   643: aload           9
        //   645: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   648: bipush          35
        //   650: aaload         
        //   651: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   654: bipush          9
        //   656: aaload         
        //   657: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   660: bipush          18
        //   662: aaload         
        //   663: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   666: aload_0        
        //   667: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   670: bipush          68
        //   672: aaload         
        //   673: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;)Ljava/lang/String;
        //   676: astore          10
        //   678: aload           10
        //   680: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   683: ifeq            699
        //   686: aload_0        
        //   687: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   690: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   693: bipush          46
        //   695: aaload         
        //   696: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   699: aload_0        
        //   700: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   703: iconst_5       
        //   704: aaload         
        //   705: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;)Ljava/lang/String;
        //   708: astore          12
        //   710: aload           12
        //   712: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   715: ifeq            744
        //   718: aload_0        
        //   719: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   722: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   725: bipush          7
        //   727: aaload         
        //   728: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   731: aload_0        
        //   732: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   735: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   738: bipush          70
        //   740: aaload         
        //   741: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   744: aload_0        
        //   745: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   748: bipush          58
        //   750: aaload         
        //   751: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;)Ljava/lang/String;
        //   754: astore          14
        //   756: aload           14
        //   758: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   761: ifeq            794
        //   764: aload_0        
        //   765: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   768: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   771: bipush          73
        //   773: aaload         
        //   774: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   777: aload_0        
        //   778: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   781: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   784: bipush          44
        //   786: aaload         
        //   787: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   790: iload_2        
        //   791: ifeq            818
        //   794: aload_0        
        //   795: aload           14
        //   797: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   800: bipush          39
        //   802: aaload         
        //   803: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   806: bipush          16
        //   808: aaload         
        //   809: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   812: bipush          25
        //   814: aaload         
        //   815: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   818: aload_0        
        //   819: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   822: bipush          50
        //   824: aaload         
        //   825: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;)Ljava/lang/String;
        //   828: astore          17
        //   830: aload           17
        //   832: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   835: ifeq            864
        //   838: aload_0        
        //   839: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   842: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   845: bipush          21
        //   847: aaload         
        //   848: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   851: aload_0        
        //   852: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   855: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   858: bipush          17
        //   860: aaload         
        //   861: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   864: aload_0        
        //   865: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   868: bipush          74
        //   870: aaload         
        //   871: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;)Ljava/lang/String;
        //   874: astore          19
        //   876: aload           19
        //   878: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   881: ifeq            897
        //   884: aload_0        
        //   885: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   888: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   891: bipush          75
        //   893: aaload         
        //   894: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   897: invokestatic    com/whatsapp/vy.d:()Z
        //   900: ifeq            949
        //   903: aload_0        
        //   904: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   907: bipush          65
        //   909: aaload         
        //   910: invokespecial   com/whatsapp/a2x.a:(Ljava/lang/String;)Ljava/lang/String;
        //   913: astore          24
        //   915: aload           24
        //   917: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   920: ifeq            949
        //   923: aload_0        
        //   924: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   927: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   930: bipush          24
        //   932: aaload         
        //   933: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   936: aload_0        
        //   937: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   940: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   943: bipush          51
        //   945: aaload         
        //   946: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   949: aload_0        
        //   950: aload_0        
        //   951: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   954: bipush          42
        //   956: aaload         
        //   957: invokespecial   com/whatsapp/a2x.b:(Ljava/lang/String;)Z
        //   960: putfield        com/whatsapp/a2x.a:Z
        //   963: aload_0        
        //   964: aload_0        
        //   965: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   968: bipush          15
        //   970: aaload         
        //   971: invokespecial   com/whatsapp/a2x.b:(Ljava/lang/String;)Z
        //   974: putfield        com/whatsapp/a2x.d:Z
        //   977: aload_0        
        //   978: aload_0        
        //   979: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //   982: bipush          82
        //   984: aaload         
        //   985: invokespecial   com/whatsapp/a2x.b:(Ljava/lang/String;)Z
        //   988: putfield        com/whatsapp/a2x.b:Z
        //   991: aload_0        
        //   992: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //   995: astore          21
        //   997: aload           21
        //   999: ifnull          1010
        //  1002: aload_0        
        //  1003: aload_0        
        //  1004: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //  1007: invokevirtual   com/whatsapp/a2x.onOpen:(Landroid/database/sqlite/SQLiteDatabase;)V
        //  1010: aload_0        
        //  1011: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //  1014: astore          22
        //  1016: goto            33
        //  1019: astore          32
        //  1021: aload           32
        //  1023: athrow         
        //  1024: astore          26
        //  1026: aload_0        
        //  1027: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //  1030: ifnull          1054
        //  1033: aload_0        
        //  1034: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //  1037: invokevirtual   android/database/sqlite/SQLiteDatabase.inTransaction:()Z
        //  1040: istore          29
        //  1042: iload           29
        //  1044: ifeq            1054
        //  1047: aload_0        
        //  1048: getfield        com/whatsapp/a2x.e:Landroid/database/sqlite/SQLiteDatabase;
        //  1051: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  1054: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //  1057: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //  1060: bipush          19
        //  1062: aaload         
        //  1063: invokestatic    com/whatsapp/vy.b:(Ljava/io/File;Ljava/lang/String;)V
        //  1066: aload           26
        //  1068: athrow         
        //  1069: astore          27
        //  1071: aload           27
        //  1073: athrow         
        //  1074: astore          28
        //  1076: aload           28
        //  1078: athrow         
        //  1079: astore          5
        //  1081: aload           5
        //  1083: athrow         
        //  1084: astore          6
        //  1086: aload           6
        //  1088: athrow         
        //  1089: astore          11
        //  1091: aload           11
        //  1093: athrow         
        //  1094: astore          13
        //  1096: aload           13
        //  1098: athrow         
        //  1099: astore          15
        //  1101: aload           15
        //  1103: athrow         
        //  1104: astore          16
        //  1106: aload           16
        //  1108: athrow         
        //  1109: astore          18
        //  1111: aload           18
        //  1113: athrow         
        //  1114: astore          20
        //  1116: aload           20
        //  1118: athrow         
        //  1119: astore          25
        //  1121: aload           25
        //  1123: athrow         
        //  1124: astore          23
        //  1126: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //  1129: bipush          28
        //  1131: aaload         
        //  1132: aload           23
        //  1134: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1137: goto            1010
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  2      6      46     51     Any
        //  6      22     38     41     Landroid/database/sqlite/SQLiteException;
        //  6      22     46     51     Any
        //  27     33     41     46     Landroid/database/sqlite/SQLiteException;
        //  27     33     46     51     Any
        //  39     41     41     46     Landroid/database/sqlite/SQLiteException;
        //  39     41     46     51     Any
        //  43     46     46     51     Any
        //  51     69     46     51     Any
        //  69     91     1024   1079   Any
        //  91     151    1024   1079   Any
        //  151    157    46     51     Any
        //  162    179    1019   1024   Landroid/database/sqlite/SQLiteException;
        //  162    179    46     51     Any
        //  179    191    46     51     Any
        //  191    206    1079   1084   Landroid/database/sqlite/SQLiteException;
        //  191    206    46     51     Any
        //  210    245    1079   1084   Landroid/database/sqlite/SQLiteException;
        //  210    245    46     51     Any
        //  250    259    1084   1089   Landroid/database/sqlite/SQLiteException;
        //  250    259    46     51     Any
        //  259    678    46     51     Any
        //  678    699    1089   1094   Landroid/database/sqlite/SQLiteException;
        //  678    699    46     51     Any
        //  699    710    46     51     Any
        //  710    744    1094   1099   Landroid/database/sqlite/SQLiteException;
        //  710    744    46     51     Any
        //  744    756    46     51     Any
        //  756    790    1099   1104   Landroid/database/sqlite/SQLiteException;
        //  756    790    46     51     Any
        //  794    818    1104   1109   Landroid/database/sqlite/SQLiteException;
        //  794    818    46     51     Any
        //  818    830    46     51     Any
        //  830    864    1109   1114   Landroid/database/sqlite/SQLiteException;
        //  830    864    46     51     Any
        //  864    876    46     51     Any
        //  876    897    1114   1119   Landroid/database/sqlite/SQLiteException;
        //  876    897    46     51     Any
        //  897    915    46     51     Any
        //  915    949    1119   1124   Landroid/database/sqlite/SQLiteException;
        //  915    949    46     51     Any
        //  949    991    46     51     Any
        //  991    997    46     51     Any
        //  1002   1010   1124   1140   Landroid/database/sqlite/SQLiteException;
        //  1002   1010   46     51     Any
        //  1010   1016   46     51     Any
        //  1021   1024   46     51     Any
        //  1026   1042   1069   1074   Landroid/database/sqlite/SQLiteException;
        //  1026   1042   46     51     Any
        //  1047   1054   1074   1079   Landroid/database/sqlite/SQLiteException;
        //  1047   1054   46     51     Any
        //  1054   1069   46     51     Any
        //  1071   1074   1074   1079   Landroid/database/sqlite/SQLiteException;
        //  1071   1074   46     51     Any
        //  1076   1079   46     51     Any
        //  1081   1084   1084   1089   Landroid/database/sqlite/SQLiteException;
        //  1081   1084   46     51     Any
        //  1086   1089   46     51     Any
        //  1091   1094   46     51     Any
        //  1096   1099   46     51     Any
        //  1101   1104   1104   1109   Landroid/database/sqlite/SQLiteException;
        //  1101   1104   46     51     Any
        //  1106   1109   46     51     Any
        //  1111   1114   46     51     Any
        //  1116   1119   46     51     Any
        //  1121   1124   46     51     Any
        //  1126   1137   46     51     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 553, Size: 553
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
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        Log.i(a2x.z[111]);
        sqLiteDatabase.execSQL(a2x.z[97]);
        sqLiteDatabase.execSQL(a2x.z[107]);
        sqLiteDatabase.execSQL(a2x.z[119]);
        sqLiteDatabase.execSQL(a2x.z[113]);
        sqLiteDatabase.execSQL(a2x.z[100]);
        sqLiteDatabase.execSQL(a2x.z[98]);
        sqLiteDatabase.execSQL(a2x.z[99]);
        sqLiteDatabase.execSQL(a2x.z[117]);
        final String s = a2x.z[108];
        try {
            sqLiteDatabase.execSQL(s);
            sqLiteDatabase.execSQL(a2x.z[94]);
            sqLiteDatabase.execSQL(a2x.z[103]);
            sqLiteDatabase.execSQL(a2x.z[112]);
            if (vy.d()) {
                sqLiteDatabase.execSQL(a2x.z[93]);
                sqLiteDatabase.execSQL(a2x.z[95]);
                sqLiteDatabase.execSQL(a2x.z[92]);
                sqLiteDatabase.execSQL(a2x.z[106]);
                sqLiteDatabase.execSQL(a2x.z[104]);
            }
            sqLiteDatabase.execSQL(a2x.z[101]);
            sqLiteDatabase.execSQL(a2x.z[91]);
            sqLiteDatabase.execSQL(a2x.z[109]);
            sqLiteDatabase.execSQL(a2x.z[115]);
            sqLiteDatabase.execSQL(a2x.z[105]);
            sqLiteDatabase.execSQL(a2x.z[118]);
            sqLiteDatabase.execSQL(a2x.z[102]);
            sqLiteDatabase.execSQL(a2x.z[114]);
            sqLiteDatabase.execSQL(a2x.z[96]);
            sqLiteDatabase.execSQL(a2x.z[110]);
            sqLiteDatabase.execSQL(a2x.z[116]);
            sqLiteDatabase.setVersion(1);
        }
        catch (SQLiteException ex) {
            throw ex;
        }
    }
    
    public void onOpen(final SQLiteDatabase p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getstatic       com/whatsapp/a2x.z:[Ljava/lang/String;
        //     4: bipush          122
        //     6: aaload         
        //     7: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    10: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    13: istore          5
        //    15: iload           5
        //    17: bipush          11
        //    19: if_icmplt       45
        //    22: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    25: istore          6
        //    27: iload           6
        //    29: bipush          16
        //    31: if_icmpge       45
        //    34: invokestatic    com/whatsapp/util/b9.a:()Z
        //    37: ifne            45
        //    40: aload_1        
        //    41: invokevirtual   android/database/sqlite/SQLiteDatabase.enableWriteAheadLogging:()Z
        //    44: pop            
        //    45: return         
        //    46: astore_2       
        //    47: aload_2        
        //    48: athrow         
        //    49: astore_3       
        //    50: aload_3        
        //    51: athrow         
        //    52: astore          4
        //    54: aload           4
        //    56: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      15     46     49     Landroid/database/sqlite/SQLiteException;
        //  22     27     49     52     Landroid/database/sqlite/SQLiteException;
        //  34     45     52     57     Landroid/database/sqlite/SQLiteException;
        //  47     49     49     52     Landroid/database/sqlite/SQLiteException;
        //  50     52     52     57     Landroid/database/sqlite/SQLiteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 30, Size: 30
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
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        Log.i(a2x.z[120] + n + a2x.z[121] + n2);
        this.onCreate(sqLiteDatabase);
    }
}
