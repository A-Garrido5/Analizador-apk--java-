// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import org.whispersystems.V;
import org.whispersystems.P;
import org.whispersystems.s;
import org.whispersystems.aY;
import org.whispersystems.aA;
import java.util.Date;
import org.whispersystems.m;
import java.util.HashMap;
import java.util.ArrayList;
import com.whatsapp.protocol.b2;
import java.util.Arrays;
import org.whispersystems.o;
import android.database.sqlite.SQLiteException;
import org.whispersystems.at;
import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.whispersystems.aW;
import org.whispersystems.z;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.protocol.c6;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import org.whispersystems.i;
import org.whispersystems.M;
import org.whispersystems.a5;

public class ha implements a5, M, i
{
    public static final ExecutorService a;
    public static int c;
    private static final String[] z;
    private final it b;
    private final ni d;
    private final rt e;
    private final Context f;
    
    static {
        final String[] z2 = new String[155];
        String s = "f'My\\u\rDpL";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_3960:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = '\u0016';
                        break;
                    }
                    case 1: {
                        c2 = 'R';
                        break;
                    }
                    case 2: {
                        c2 = '/';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "w*@yZb>\u000fsZc<K5TxrFqPx&FaL67AaGorIzG6";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u007f6J{A\u007f&FpF";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "w*@yZb>\u000f|Qs<[|AorDpL64@g\u0015";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "66NaPrr";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u007f6J{A\u007f&FpF";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "b;BpFb3Be";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "66JvZr7K5TerF{Cw>Fq\u000e66JyPb;Ar";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "w*@yZb>\u000fsZc<K5[yrFqPx&FaL67AaGorIzG6";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "f J~Po!";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "w*@yZb>\u000f}TerN5Ed7\u000f~PorX|A~rFq\u0015";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "f J~Po\rFq\u0015+r\u0010";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "d7LzGr";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = ",r";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "b;BpFb3Be";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "w*@yZb>\u000ffAy Jq\u0015e7\\f\\y<\u000fsZdr";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "d7LzGr";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "w*@yZz&\u000f`Er3[|[qr\\pFe;@{\u0015p=]5";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    s = "d7L|E\u007f7Aaj\u007f6";
                    n = 20;
                    n2 = 21;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n2 = 22;
                    array = z2;
                    n = 21;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    array = z2;
                    s = "e7\\f\\y<\\";
                    n = 22;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "e7\\f\\y<\\";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "w*@yZz&\u000f|[e7]a\\x5\u000f{Par\\pFe;@{\u0015p=]5";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "63[5";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "I;K";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "e7\\f\\y<\\";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "w*@yZb>\u000fsZc<K5T6$Ny\\rr\\pFe;@{\u0015d7LzGrrIzG6";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "w*@yZb>\u000f}TerAz\u0015e7\\f\\y<\u000fgPu=]q\u0015p=]5";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "e7\\f\\y<\\";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "d7LzGr";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "-rKpYs&F{R";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "e7\\f\\y<\\";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "s ]zG6 JtQ\u007f<H5Fs!\\|Zxr]pVy K5";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "w*@yZb>\u000f}Ter";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "63Aq\u0015";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "{3[v]\u007f<H";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "6!NcPrrMtFsrDpL63Aq\u0015e7\\f\\y<\u000fsZdr";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "w*@yZb>\u000f}TerAz\u0015e3YpQ60NfP69Jl\u0015p=]5";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "r;IsPd7Aa";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "w*@yZb>\u000f}TerAz\u0015e7\\f\\y<\u000fsZdr";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "69Jl\u0015f3Fg";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "w*@yZb>\u000faGc![|[qr";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    s = "w*@yZb>\u000fqPz7[pQ6";
                    n = 46;
                    n2 = 47;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    array = z2;
                    s = "{7\\fTq7pwTe7p~Po";
                    n = 47;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "6?JfFw5J5Ww!J5^s+\u000fgZa!\u000fsZdr";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "6%Fa]6 @b\u0015\u007f6\u000f";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "{!HJ^s+psGy?pxP";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "z3\\ajw>FvPI0NfPI9Jl";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "{!HJ^s+p|Q";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "b;BpFb3Be";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "{!HJ^s+pgP{=[pj|;K";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "w*@yZb>\u000ffT`7K5T6?JfFw5J5Ww!J5^s+\u000fsZdr";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "{7\\fTq7pwTe7p~Po";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "['Ca\\f>J5Qs$FvP6!ZeEy [5[y&\u000f|Xf>JxPx&Jq";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "['Ca\\f>J5Qs$FvP6!ZeEy [5[y&\u000f|Xf>JxPx&Jq";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "z3\\ajw>FvPI0NfPI9Jl";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "{7\\fTq7pwTe7p~Po";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "s ]zG6 JtQ\u007f<H5Ed7DpL6";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "w*@yZb>\u000fgPf=]a\\x5\u000fwTu9\u000f";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "f J~Po!";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "6!Jd@s<LpQ6\"]p^s+\\";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "f J~Po\rFq";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "d7LzGr";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "f'My\\u\rDpL";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "f FcTb7p~Po";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "_<YtY\u007f6\u000fe@t>Fv\u0015}7V5Fb=]pQ6;A5\\r7Aa\\b;Jf\u0015b3MyP";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "w*@yZb>\u000fyZw6F{R6;Kp[b;[l\u0015}7V5Ew;]";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "\u007f6J{A\u007f&FpF";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "[;\\f\\x5\u000fp[b V5Sy \u000ffPz4\u000f|[6;Kp[b;[|Per[tWz7";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "[;\\f\\x5\u000fp[b V5Sy \u000ffPz4\u000f|[6;Kp[b;[|Per[tWz7";
                    n = 74;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "\u007f6J{A\u007f&FpF";
                    n = 75;
                    array = z2;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "w*@yZb>\u000fsPb1GpQ6>@vTzr]pR\u007f![gTb;@{\u0015\u007f6\u00155";
                    n = 76;
                    array = z2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 77;
                    array = z2;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "d7H|Fb Na\\y<p|Q";
                    n = 78;
                    array = z2;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "w*@yZb>\u0001qW";
                    n = 79;
                    array = z2;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    n2 = 81;
                    s = "r7CpAs6\u000f";
                    n = 80;
                    array = z2;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    s = "E\u0017cPvBrlZ`X\u0006\u0007?\u001c6\u0014}Zx6\"]p^s+\\5b^\u0017}P\u0015e7Aajb=pfPd$Jg\u0015+r\u001f";
                    n = 81;
                    array = z2;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    n2 = 83;
                    s = "C<NwYsr[z\u0015u=Z{A6'AfPx&\u000fp[b FpF6;A5Ed7DpLer[tWz7";
                    n = 82;
                    array = z2;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    s = "w*@yZb>\u000f}TerZ{Fs<[5Ed7DpLeh\u000f";
                    n = 83;
                    array = z2;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "6;Kp[\u007f&FpF64@g\u0015";
                    n = 84;
                    array = z2;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    n2 = 86;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 85;
                    array = z2;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    s = "w*@yZb>\u000fqPz7[pQ6";
                    n = 86;
                    array = z2;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "\u007f6J{A\u007f&FpF";
                    n = 87;
                    array = z2;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "w*@yZb>\u000fsPb1GpQ6;Kp[b;[l\u0015}7V5Sy \u000ffPx6F{R";
                    n = 88;
                    array = z2;
                    continue;
                }
                case 88: {
                    array[n2] = intern;
                    n2 = 90;
                    s = "['Ca\\f>J5Qs$FvP6!ZeEy [5[y&\u000f|Xf>JxPx&Jq";
                    n = 89;
                    array = z2;
                    continue;
                }
                case 89: {
                    array[n2] = intern;
                    n2 = 91;
                    s = "e7Aajb=pfPd$Jg\u0015+r\u001f";
                    n = 90;
                    array = z2;
                    continue;
                }
                case 90: {
                    array[n2] = intern;
                    n2 = 92;
                    s = "e7Aajb=pfPd$Jg";
                    n = 91;
                    array = z2;
                    continue;
                }
                case 91: {
                    array[n2] = intern;
                    n2 = 93;
                    s = "f J~Po!";
                    n = 92;
                    array = z2;
                    continue;
                }
                case 92: {
                    array[n2] = intern;
                    n2 = 94;
                    s = "w*@yZb>\u000fgPu=]qPrrNyY6\"]p^s+\\5Ter]pVs;YpQ60V5Fs YpG";
                    n = 93;
                    array = z2;
                    continue;
                }
                case 93: {
                    array[n2] = intern;
                    n2 = 95;
                    s = "e7\\f\\y<\\";
                    n = 94;
                    array = z2;
                    continue;
                }
                case 94: {
                    array[n2] = intern;
                    n2 = 96;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 95;
                    array = z2;
                    continue;
                }
                case 95: {
                    array[n2] = intern;
                    n2 = 97;
                    s = "6!JfF\u007f=Af\u0015a;[}\u0015";
                    n = 96;
                    array = z2;
                    continue;
                }
                case 96: {
                    array[n2] = intern;
                    n2 = 98;
                    s = "w*@yZb>\u000fqPz7[pQ6";
                    n = 97;
                    array = z2;
                    continue;
                }
                case 97: {
                    array[n2] = intern;
                    n2 = 99;
                    s = "['Ca\\f>J5Qs$FvP6!ZeEy [5[y&\u000f|Xf>JxPx&Jq";
                    n = 98;
                    array = z2;
                    continue;
                }
                case 98: {
                    array[n2] = intern;
                    n2 = 100;
                    s = "f J~Po!";
                    n = 99;
                    array = z2;
                    continue;
                }
                case 99: {
                    array[n2] = intern;
                    n2 = 101;
                    s = "s ]zG6 JtQ\u007f<H5Ed7DpL6";
                    n = 100;
                    array = z2;
                    continue;
                }
                case 100: {
                    array[n2] = intern;
                    n2 = 102;
                    s = "d7LzGr";
                    n = 101;
                    array = z2;
                    continue;
                }
                case 101: {
                    array[n2] = intern;
                    n2 = 103;
                    s = "w*@yZb>\u000fgPf=]a\\x5\u000fwTu9\u000f";
                    n = 102;
                    array = z2;
                    continue;
                }
                case 102: {
                    array[n2] = intern;
                    n2 = 104;
                    s = "e7Aajb=pfPd$Jg\u0015+r\u0010";
                    n = 103;
                    array = z2;
                    continue;
                }
                case 103: {
                    array[n2] = intern;
                    n2 = 105;
                    s = "f J~Po\rFq";
                    n = 104;
                    array = z2;
                    continue;
                }
                case 104: {
                    array[n2] = intern;
                    n2 = 106;
                    s = "6\"]p^s+\\5Sy \u000ffPx6F{R6&@5A~7\u000ffPd$Jg";
                    n = 105;
                    array = z2;
                    continue;
                }
                case 105: {
                    array[n2] = intern;
                    n2 = 107;
                    s = "{!HJ^s+p|Q";
                    n = 106;
                    array = z2;
                    continue;
                }
                case 106: {
                    array[n2] = intern;
                    n2 = 108;
                    s = "6s\u00125";
                    n = 107;
                    array = z2;
                    continue;
                }
                case 107: {
                    array[n2] = intern;
                    n2 = 109;
                    s = "&rn[q6";
                    n = 108;
                    array = z2;
                    continue;
                }
                case 108: {
                    array[n2] = intern;
                    n2 = 110;
                    s = "{!HJ^s+pgP{=[pj|;K5\b6m\u000fT{RrBfRI9Jljp @xj{7";
                    n = 109;
                    array = z2;
                    continue;
                }
                case 109: {
                    array[n2] = intern;
                    n2 = 111;
                    s = "6o\u000f";
                    n = 110;
                    array = z2;
                    continue;
                }
                case 110: {
                    array[n2] = intern;
                    n2 = 112;
                    s = "6o\u000f*";
                    n = 111;
                    array = z2;
                    continue;
                }
                case 111: {
                    array[n2] = intern;
                    n2 = 113;
                    s = "d7LzGr";
                    n = 112;
                    array = z2;
                    continue;
                }
                case 112: {
                    array[n2] = intern;
                    n2 = 114;
                    s = "w*@yZb>\u000fsZc<K5T6\"]p\u0015}7V5B\u007f&G5\\rr";
                    n = 113;
                    array = z2;
                    continue;
                }
                case 113: {
                    array[n2] = intern;
                    n2 = 115;
                    s = "f J~Po\rFq\u0015+r\u0010";
                    n = 114;
                    array = z2;
                    continue;
                }
                case 114: {
                    array[n2] = intern;
                    n2 = 116;
                    s = "f J~Po!";
                    n = 115;
                    array = z2;
                    continue;
                }
                case 115: {
                    array[n2] = intern;
                    n2 = 117;
                    s = "-rKpYs&F{R";
                    n = 116;
                    array = z2;
                    continue;
                }
                case 116: {
                    array[n2] = intern;
                    n2 = 118;
                    s = "f J~Po\rFq\u0015+r\u0010";
                    n = 117;
                    array = z2;
                    continue;
                }
                case 117: {
                    array[n2] = intern;
                    n2 = 119;
                    s = "X=\u000feGs9Jl\u0015p=Z{Q6%Fa]6;K5";
                    n = 118;
                    array = z2;
                    continue;
                }
                case 118: {
                    array[n2] = intern;
                    n2 = 120;
                    s = "s ]zG6 JtQ\u007f<H5Ed7DpL6";
                    n = 119;
                    array = z2;
                    continue;
                }
                case 119: {
                    array[n2] = intern;
                    n2 = 121;
                    s = "f J~Po!";
                    n = 120;
                    array = z2;
                    continue;
                }
                case 120: {
                    array[n2] = intern;
                    n2 = 122;
                    s = "6%Fa]6 Jf@z&N{A6 @b\u0015\u007f6\u000f";
                    n = 121;
                    array = z2;
                    continue;
                }
                case 121: {
                    array[n2] = intern;
                    n2 = 123;
                    s = "b;BpFb3Be";
                    n = 122;
                    array = z2;
                    continue;
                }
                case 122: {
                    array[n2] = intern;
                    n2 = 124;
                    s = "d7L|E\u007f7Aaj\u007f6";
                    n = 123;
                    array = z2;
                    continue;
                }
                case 123: {
                    array[n2] = intern;
                    n2 = 125;
                    s = "f'My\\u\rDpL";
                    n = 124;
                    array = z2;
                    continue;
                }
                case 124: {
                    array[n2] = intern;
                    n2 = 126;
                    s = "w*@yZb>\u000ffT`7K5\\r7Aa\\b+\u000fsZdr";
                    n = 125;
                    array = z2;
                    continue;
                }
                case 125: {
                    array[n2] = intern;
                    n2 = 127;
                    s = "f'My\\u\rDpL";
                    n = 126;
                    array = z2;
                    continue;
                }
                case 126: {
                    array[n2] = intern;
                    n2 = 128;
                    s = "\u007f6J{A\u007f&FpF";
                    n = 127;
                    array = z2;
                    continue;
                }
                case 127: {
                    array[n2] = intern;
                    n2 = 129;
                    s = "f J~Po!";
                    n = 128;
                    array = z2;
                    continue;
                }
                case 128: {
                    array[n2] = intern;
                    n2 = 130;
                    s = "w*@yZb>\u000fqPz7[pQ6";
                    n = 129;
                    array = z2;
                    continue;
                }
                case 129: {
                    array[n2] = intern;
                    n2 = 131;
                    s = "f J~Po\rFq\u0015+r\u0010";
                    n = 130;
                    array = z2;
                    continue;
                }
                case 130: {
                    array[n2] = intern;
                    n2 = 132;
                    s = "6\"]p\u0015}7Vf\u0015a;[}\u0015\u007f6\u000f";
                    n = 131;
                    array = z2;
                    continue;
                }
                case 131: {
                    array[n2] = intern;
                    n2 = 133;
                    s = "W>FvP60NfP69Jl\u0015{;\\f\\x5\u000fsGy?\u000ffPe!Fz[";
                    n = 132;
                    array = z2;
                    continue;
                }
                case 132: {
                    array[n2] = intern;
                    n2 = 134;
                    s = "V!\u0001b]w&\\tEf|ApA";
                    n = 133;
                    array = z2;
                    continue;
                }
                case 133: {
                    array[n2] = intern;
                    n2 = 135;
                    s = "F @c\\r7K5_\u007f6\u000fx@e&\u000f{ZbrMp\u0015x'Cy";
                    n = 134;
                    array = z2;
                    continue;
                }
                case 134: {
                    array[n2] = intern;
                    n2 = 136;
                    s = "\\;K5";
                    n = 135;
                    array = z2;
                    continue;
                }
                case 135: {
                    array[n2] = intern;
                    n2 = 137;
                    s = "V!\u0001b]w&\\tEf|ApA";
                    n = 136;
                    array = z2;
                    continue;
                }
                case 136: {
                    array[n2] = intern;
                    n2 = 138;
                    s = "V!\u0001b]w&\\tEf|ApA";
                    n = 137;
                    array = z2;
                    continue;
                }
                case 137: {
                    array[n2] = intern;
                    n2 = 139;
                    s = "6;\\5[y&\u000fs@z>V5Dc3C|S\u007f7K.\u0015e:@`YrrJ{Q6%Fa]6";
                    n = 138;
                    array = z2;
                    continue;
                }
                case 138: {
                    array[n2] = intern;
                    n2 = 140;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 139;
                    array = z2;
                    continue;
                }
                case 139: {
                    array[n2] = intern;
                    n2 = 141;
                    s = "-rKpYs&F{R";
                    n = 140;
                    array = z2;
                    continue;
                }
                case 140: {
                    array[n2] = intern;
                    n2 = 142;
                    s = "e7\\f\\y<\\";
                    n = 141;
                    array = z2;
                    continue;
                }
                case 141: {
                    array[n2] = intern;
                    n2 = 143;
                    s = "w*@yZb>\u000f}TerAz\u0015e7\\f\\y<\u000fgPu=]q\u0015p=]5";
                    n = 142;
                    array = z2;
                    continue;
                }
                case 142: {
                    array[n2] = intern;
                    n2 = 144;
                    s = "d7LzGr";
                    n = 143;
                    array = z2;
                    continue;
                }
                case 143: {
                    array[n2] = intern;
                    n2 = 145;
                    s = "e7\\f\\y<\\";
                    n = 144;
                    array = z2;
                    continue;
                }
                case 144: {
                    array[n2] = intern;
                    n2 = 146;
                    s = "d7L|E\u007f7Aaj\u007f6\u000f(\u0015)";
                    n = 145;
                    array = z2;
                    continue;
                }
                case 145: {
                    array[n2] = intern;
                    n2 = 147;
                    s = "s ]zG6 JtQ\u007f<H5Fs!\\|Zxr]pVy K5";
                    n = 146;
                    array = z2;
                    continue;
                }
                case 146: {
                    array[n2] = intern;
                    n2 = 148;
                    s = "w*@yZb>\u000fsZc<K5T6$Ny\\rr\\pFe;@{\u0015d7LzGrrIzG6";
                    n = 147;
                    array = z2;
                    continue;
                }
                case 147: {
                    array[n2] = intern;
                    n2 = 149;
                    s = "w*@yZb>\u000fgPu=]qPrrAz\u0015f J~Po!\u000ftF6 JvP\u007f$Jq\u0015t+\u000ffPd$Jg";
                    n = 148;
                    array = z2;
                    continue;
                }
                case 148: {
                    array[n2] = intern;
                    n2 = 150;
                    s = "f J~Po!";
                    n = 149;
                    array = z2;
                    continue;
                }
                case 149: {
                    array[n2] = intern;
                    n2 = 151;
                    s = "e7Aajb=pfPd$Jg\u00157o\u000f%";
                    n = 150;
                    array = z2;
                    continue;
                }
                case 150: {
                    array[n2] = intern;
                    n2 = 152;
                    s = "e7Aajb=pfPd$Jg";
                    n = 151;
                    array = z2;
                    continue;
                }
                case 151: {
                    array[n2] = intern;
                    n2 = 153;
                    s = "['Ca\\f>J5Qs$FvP6!ZeEy [5[y&\u000f|Xf>JxPx&Jq";
                    n = 152;
                    array = z2;
                    continue;
                }
                case 152: {
                    array[n2] = intern;
                    n2 = 154;
                    s = "['Ca\\f>J5Qs$FvP6!ZeEy [5[y&\u000f|Xf>JxPx&Jq";
                    n = 153;
                    array = z2;
                    continue;
                }
                case 153: {
                    break Label_3960;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a = new ThreadPoolExecutor(0, 1, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new aa4());
    }
    
    public ha(final Context f) {
        this.f = f;
        this.e = new rt(f);
        this.d = new ni(this.e);
        this.b = new it(this.e);
    }
    
    private String a(final c6 c6) {
        while (true) {
            while (true) {
                try {
                    final StringBuilder append = new StringBuilder().append(ha.z[110]);
                    if (c6.b) {
                        final String s = ha.z[108];
                        return append.append(s).append(ha.z[109]).append(ha.z[107]).append(ha.z[112]).toString();
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                final String s = ha.z[111];
                continue;
            }
        }
    }
    
    private z a(final SQLiteDatabase sqLiteDatabase, final int n) {
        final Cursor query = sqLiteDatabase.query(ha.z[116], new String[] { ha.z[113] }, ha.z[115], new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
        try {
            if (!query.moveToNext()) {
                query.close();
                throw new aW(ha.z[119] + n);
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        final byte[] blob = query.getBlob(0);
        query.close();
        try {
            Log.i(ha.z[114] + n);
            return new z(blob);
        }
        catch (IOException ex2) {
            Log.b(ha.z[120] + n + ha.z[117], ex2);
            sqLiteDatabase.delete(ha.z[121], ha.z[118], new String[] { String.valueOf(n) });
            throw new aW(ex2);
        }
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final c6 c6, final byte[] array) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put(ha.z[55], c6.a);
        contentValues.put(ha.z[51], c6.b);
        contentValues.put(ha.z[53], c6.c);
        contentValues.put(ha.z[52], array);
        contentValues.put(ha.z[54], System.currentTimeMillis() / 1000L);
        Log.i(ha.z[56] + c6 + ha.z[50] + sqLiteDatabase.replaceOrThrow(ha.z[57], (String)null, contentValues));
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final String s) {
        Log.i(ha.z[98] + (long)sqLiteDatabase.delete(ha.z[95], ha.z[96], new String[] { s }) + ha.z[97] + s);
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final String s, final at at) {
        sqLiteDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put(ha.z[21], s);
            contentValues.put(ha.z[18], at.d());
            final Cursor query = sqLiteDatabase.query(ha.z[28], new String[] { ha.z[27] }, ha.z[20], new String[] { s }, (String)null, (String)null, (String)null);
            try {
                Label_0257: {
                    if (query.moveToNext()) {
                        query.close();
                        Log.i(ha.z[19] + s);
                        sqLiteDatabase.update(ha.z[23], contentValues, ha.z[22], new String[] { s });
                        if (ha.c == 0) {
                            break Label_0257;
                        }
                    }
                    query.close();
                    final long n = System.currentTimeMillis() / 1000L;
                    contentValues.put(ha.z[16], n);
                    Log.i(ha.z[25] + s + ha.z[26] + n);
                    sqLiteDatabase.insert(ha.z[24], (String)null, contentValues);
                }
                sqLiteDatabase.setTransactionSuccessful();
                sqLiteDatabase.endTransaction();
                Log.i(ha.z[17] + s);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        finally {
            sqLiteDatabase.endTransaction();
        }
    }
    
    private void a(final at at) {
        final byte[] l = at.b().l();
        while (true) {
            if (l != null) {
                try {
                    if (l.length == 0) {
                        throw new IOException(ha.z[133]);
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                return;
            }
            continue;
        }
    }
    
    private boolean a(final SQLiteDatabase sqLiteDatabase) {
        final Cursor rawQuery = sqLiteDatabase.rawQuery(ha.z[82], (String[])null);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                throw new SQLiteException(ha.z[83]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final int int1 = rawQuery.getInt(0);
            boolean b = false;
            if (int1 != 0) {
                b = true;
            }
            rawQuery.close();
            Log.i(ha.z[84] + b);
            return b;
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    private boolean a(final SQLiteDatabase sqLiteDatabase, final String s, final o o) {
        Log.i(ha.z[46] + s + ha.z[45]);
        return true;
    }
    
    private boolean a(final String s, final c6 c6) {
        final byte[] c7 = this.c(c6);
        if (c7 == null) {
            try {
                Log.i(ha.z[42] + c6);
                return false;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        final at c8 = this.c(s);
        if (c8 == null) {
            try {
                Log.i(ha.z[44] + s);
                return false;
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        while (true) {
            final boolean equals = Arrays.equals(c7, c8.b().l());
            while (true) {
                try {
                    final StringBuilder append = new StringBuilder().append(ha.z[38]);
                    if (equals) {
                        final String s2 = ha.z[40];
                        Log.i(append.append(s2).append(ha.z[41]).append(c6).append(ha.z[39]).append(s).toString());
                        return equals;
                    }
                }
                catch (NullPointerException ex3) {
                    throw ex3;
                }
                final String s2 = ha.z[43];
                continue;
            }
        }
    }
    
    private byte[] a(final SQLiteDatabase sqLiteDatabase, final c6 c6) {
        final Cursor query = sqLiteDatabase.query(ha.z[61], new String[] { ha.z[60] }, this.a(c6), new String[] { c6.a, c6.c }, (String)null, (String)null, (String)null);
        try {
            if (!query.moveToNext()) {
                query.close();
                return null;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        final byte[] blob = query.getBlob(0);
        query.close();
        return blob;
    }
    
    private b2[] a(final SQLiteDatabase sqLiteDatabase, final int[] array) {
        final int c = ha.c;
        final ArrayList<b2> list = new ArrayList<b2>(array.length);
        final HashMap<Object, b2> hashMap = new HashMap<Object, b2>(array.length);
        final Cursor query = sqLiteDatabase.query(ha.z[64], new String[] { ha.z[66], ha.z[67] }, (String)null, (String[])null, (String)null, (String)null, (String)null);
    Label_0278:
        while (true) {
            Label_0176: {
                if (!query.moveToNext()) {
                    break Label_0176;
                }
            Label_0183_Outer:
                while (true) {
                    final int int1 = query.getInt(0);
                    while (true) {
                        int n = 0;
                        Integer value = null;
                        Label_0256: {
                            while (true) {
                                try {
                                    final byte[] a = new z(query.getBlob(1)).a().b().a();
                                    final byte[] array2 = new byte[-1 + a.length];
                                    System.arraycopy(a, 1, array2, 0, array2.length);
                                    hashMap.put(int1, new b2(m.b(int1), array2, null));
                                    if (c == 0) {
                                        break;
                                    }
                                    final int length = array.length;
                                    n = 0;
                                    if (n >= length) {
                                        break Label_0278;
                                    }
                                    value = array[n];
                                    final HashMap<Object, b2> hashMap2 = hashMap;
                                    final Integer n2 = value;
                                    final boolean containsKey = hashMap2.containsKey(n2);
                                    final boolean containsKey2 = containsKey;
                                    if (!containsKey2) {
                                        return null;
                                    }
                                    break Label_0256;
                                }
                                catch (IOException ex) {
                                    Log.b(ha.z[62] + int1, ex);
                                    continue Label_0183_Outer;
                                }
                                break;
                            }
                            try {
                                final HashMap<Object, b2> hashMap2 = hashMap;
                                final Integer n2 = value;
                                final boolean containsKey2;
                                final boolean containsKey = containsKey2 = hashMap2.containsKey(n2);
                                if (!containsKey2) {
                                    return null;
                                }
                            }
                            catch (IOException ex2) {
                                throw ex2;
                            }
                        }
                        list.add(hashMap.get(value));
                        ++n;
                        if (c != 0) {
                            break Label_0278;
                        }
                        continue;
                    }
                }
            }
        }
        query.close();
        Log.i(ha.z[63] + list.size() + ha.z[65]);
        return list.toArray(new b2[list.size()]);
    }
    
    private alk b(final SQLiteDatabase sqLiteDatabase, final String s) {
        final Cursor query = sqLiteDatabase.query(ha.z[2], new String[] { ha.z[0], ha.z[6] }, ha.z[9], new String[] { s }, (String)null, (String)null, (String)null);
        try {
            if (!query.moveToNext()) {
                query.close();
                Log.i(ha.z[10] + s);
                return new alk(null, null);
            }
        }
        catch (aA aa) {
            throw aa;
        }
        final byte[] blob = query.getBlob(0);
        final Date date = new Date(1000L * query.getLong(1));
        query.close();
        o o = null;
        Label_0181: {
            if (blob == null) {
                break Label_0181;
            }
            try {
                o = new o(blob, 0);
                Log.i(ha.z[1] + s + ha.z[4] + date);
                return new alk(o, date);
            }
            catch (aA aa2) {
                Log.b(ha.z[3] + s + ha.z[7], aa2);
                sqLiteDatabase.delete(ha.z[5], ha.z[8], new String[] { s });
                return new alk(null, null);
            }
        }
    }
    
    private void b(final SQLiteDatabase sqLiteDatabase, final int n) {
        Log.i(ha.z[130] + (long)sqLiteDatabase.delete(ha.z[129], ha.z[131], new String[] { String.valueOf(n) }) + ha.z[132] + n);
    }
    
    private void b(final SQLiteDatabase sqLiteDatabase, final c6 c6) {
        final long n = sqLiteDatabase.delete(ha.z[48], this.a(c6), new String[] { c6.a, c6.c });
        int n2;
        if (n > 0L) {
            n2 = 3;
        }
        else {
            n2 = 4;
        }
        Log.b(n2, ha.z[47] + n + ha.z[49] + c6);
    }
    
    private void b(final SQLiteDatabase p0, final String p1, final o p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/content/ContentValues;
        //     3: dup            
        //     4: invokespecial   android/content/ContentValues.<init>:()V
        //     7: astore          4
        //     9: aload           4
        //    11: getstatic       com/whatsapp/ha.z:[Ljava/lang/String;
        //    14: bipush          124
        //    16: aaload         
        //    17: aload_2        
        //    18: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //    21: aload_3        
        //    22: ifnull          51
        //    25: aload           4
        //    27: getstatic       com/whatsapp/ha.z:[Ljava/lang/String;
        //    30: bipush          127
        //    32: aaload         
        //    33: aload_3        
        //    34: invokevirtual   org/whispersystems/o.a:()Lorg/whispersystems/ak;
        //    37: invokeinterface org/whispersystems/ak.a:()[B
        //    42: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //    45: getstatic       com/whatsapp/ha.c:I
        //    48: ifeq            62
        //    51: aload           4
        //    53: getstatic       com/whatsapp/ha.z:[Ljava/lang/String;
        //    56: bipush          125
        //    58: aaload         
        //    59: invokevirtual   android/content/ContentValues.putNull:(Ljava/lang/String;)V
        //    62: aload           4
        //    64: getstatic       com/whatsapp/ha.z:[Ljava/lang/String;
        //    67: bipush          123
        //    69: aaload         
        //    70: invokestatic    java/lang/System.currentTimeMillis:()J
        //    73: ldc2_w          1000
        //    76: ldiv           
        //    77: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    80: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //    83: aload_1        
        //    84: getstatic       com/whatsapp/ha.z:[Ljava/lang/String;
        //    87: sipush          128
        //    90: aaload         
        //    91: aconst_null    
        //    92: aload           4
        //    94: invokevirtual   android/database/sqlite/SQLiteDatabase.replaceOrThrow:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //    97: lstore          7
        //    99: new             Ljava/lang/StringBuilder;
        //   102: dup            
        //   103: invokespecial   java/lang/StringBuilder.<init>:()V
        //   106: getstatic       com/whatsapp/ha.z:[Ljava/lang/String;
        //   109: bipush          126
        //   111: aaload         
        //   112: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   115: aload_2        
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: getstatic       com/whatsapp/ha.z:[Ljava/lang/String;
        //   122: bipush          122
        //   124: aaload         
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: lload           7
        //   130: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   133: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   136: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   139: return         
        //   140: astore          5
        //   142: aload           5
        //   144: athrow         
        //   145: astore          6
        //   147: aload           6
        //   149: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  9      21     140    145    Ljava/lang/NullPointerException;
        //  25     51     145    150    Ljava/lang/NullPointerException;
        //  51     62     145    150    Ljava/lang/NullPointerException;
        //  142    145    145    150    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    private b2[] b(final SQLiteDatabase sqLiteDatabase) {
        final int c = ha.c;
        final ArrayList<b2> list = new ArrayList<b2>();
        final Cursor query = sqLiteDatabase.query(ha.z[100], new String[] { ha.z[105], ha.z[102] }, ha.z[104], new String[] { String.valueOf(0) }, (String)null, (String)null, (String)null);
    Label_0174_Outer:
        while (true) {
            Label_0178: {
                if (!query.moveToNext()) {
                    break Label_0178;
                }
                final int int1 = query.getInt(0);
                while (true) {
                    try {
                        final byte[] a = new z(query.getBlob(1)).a().b().a();
                        final byte[] array = new byte[-1 + a.length];
                        System.arraycopy(a, 1, array, 0, array.length);
                        list.add(new b2(m.b(int1), array, null));
                        if (c != 0) {
                            query.close();
                            Log.i(ha.z[103] + list.size() + ha.z[106]);
                            return list.toArray(new b2[list.size()]);
                        }
                        continue Label_0174_Outer;
                    }
                    catch (IOException ex) {
                        Log.b(ha.z[101] + int1, ex);
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    private aY c(final SQLiteDatabase sqLiteDatabase) {
        final Cursor query = sqLiteDatabase.query(ha.z[72], new String[] { ha.z[68], ha.z[69] }, ha.z[74], new String[] { String.valueOf(-1) }, (String)null, (String)null, (String)null);
        try {
            if (!query.moveToNext()) {
                query.close();
                throw new SQLiteException(ha.z[73]);
            }
        }
        catch (aA aa) {
            throw aa;
        }
        final byte[] blob = query.getBlob(0);
        final byte[] blob2 = query.getBlob(1);
        query.close();
        try {
            final o o = new o(blob, 0);
            final P a = s.a(blob2);
            Log.i(ha.z[71]);
            return new aY(o, a);
        }
        catch (aA aa2) {
            throw new SQLiteException(ha.z[70]);
        }
    }
    
    private at c(final String s) {
        return this.e(this.e.getWritableDatabase(), s);
    }
    
    private void c(final SQLiteDatabase sqLiteDatabase, final String s) {
        Log.i(ha.z[87] + (long)sqLiteDatabase.delete(ha.z[88], ha.z[86], new String[] { s }) + ha.z[85] + s);
    }
    
    private boolean c(final SQLiteDatabase sqLiteDatabase, final int n) {
        final Cursor query = sqLiteDatabase.query(ha.z[11], new String[] { ha.z[14] }, ha.z[13], new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
        final boolean moveToNext = query.moveToNext();
        query.close();
        Log.i(ha.z[12] + n + ha.z[15] + moveToNext);
        return moveToNext;
    }
    
    private boolean d(final SQLiteDatabase sqLiteDatabase) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put(ha.z[92], true);
        final int update = sqLiteDatabase.update(ha.z[93], contentValues, ha.z[91], (String[])null);
        try {
            Log.i(ha.z[94]);
            if (update > 0) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    private boolean d(final SQLiteDatabase sqLiteDatabase, final String s) {
        final Cursor query = sqLiteDatabase.query(ha.z[142], new String[] { ha.z[144] }, ha.z[146], new String[] { s }, (String)null, (String)null, (String)null);
        try {
            if (!query.moveToNext()) {
                query.close();
                Log.i(ha.z[143] + s);
                return false;
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        final byte[] blob = query.getBlob(0);
        query.close();
        try {
            this.a(new at(blob));
            Log.i(ha.z[148] + s);
            return true;
        }
        catch (IOException ex2) {
            Log.b(ha.z[147] + s + ha.z[141], ex2);
            sqLiteDatabase.delete(ha.z[145], ha.z[140], new String[] { s });
            return false;
        }
    }
    
    private int e(final SQLiteDatabase sqLiteDatabase) {
        final Cursor query = sqLiteDatabase.query(ha.z[76], new String[] { ha.z[79] }, ha.z[78], new String[] { String.valueOf(-1) }, (String)null, (String)null, (String)null);
        try {
            if (!query.moveToNext()) {
                query.close();
                throw new SQLiteException(ha.z[75]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        final int int1 = query.getInt(0);
        query.close();
        Log.i(ha.z[77] + int1);
        return int1;
    }
    
    private at e(final SQLiteDatabase sqLiteDatabase, final String s) {
        final Cursor query = sqLiteDatabase.query(ha.z[34], new String[] { ha.z[32] }, ha.z[36], new String[] { s }, (String)null, (String)null, (String)null);
        try {
            if (!query.moveToNext()) {
                query.close();
                Log.i(ha.z[30] + s);
                return new at();
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        final byte[] blob = query.getBlob(0);
        query.close();
        try {
            final at at = new at(blob);
            this.a(at);
            Log.i(ha.z[29] + s);
            return at;
        }
        catch (IOException ex2) {
            Log.b(ha.z[37] + s + ha.z[33], ex2);
            sqLiteDatabase.delete(ha.z[31], ha.z[35], new String[] { s });
            return new at();
        }
    }
    
    private boolean e(final String s) {
        return this.d(this.e.getWritableDatabase(), s);
    }
    
    private boolean f(final SQLiteDatabase sqLiteDatabase) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put(ha.z[152], false);
        final int update = sqLiteDatabase.update(ha.z[150], contentValues, ha.z[151], (String[])null);
        try {
            Log.i(ha.z[149]);
            boolean b = false;
            if (update > 0) {
                b = true;
            }
            return b;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public static V g(final String s) {
        if (s == null) {
            try {
                throw new NullPointerException(ha.z[135]);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        try {
            if (!s.endsWith(ha.z[134])) {
                throw new IllegalArgumentException(ha.z[136] + s + ha.z[139] + ha.z[137]);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        return new V(s.substring(0, s.indexOf(ha.z[138])), 0);
    }
    
    @Override
    public aY a() {
        return this.c(this.e.getWritableDatabase());
    }
    
    public void a(final c6 c6, final byte[] array) {
        this.a(this.e.getWritableDatabase(), c6, array);
    }
    
    public void a(final String s) {
        this.a(this.e.getWritableDatabase(), s);
    }
    
    public void a(final String s, final at at) {
        this.a(this.e.getWritableDatabase(), s, at);
    }
    
    public void a(final V v) {
        try {
            if (v.a() != 0) {
                throw new IllegalArgumentException(ha.z[99]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        this.d(v.b());
    }
    
    @Override
    public void a(final V v, final at at) {
        try {
            if (v.a() != 0) {
                throw new IllegalArgumentException(ha.z[154]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        this.a(v.b(), at);
    }
    
    @Override
    public boolean a(final int n) {
        return this.c(this.e.getWritableDatabase(), n);
    }
    
    @Override
    public boolean a(final String s, final o o) {
        return this.a(this.e.getWritableDatabase(), s, o);
    }
    
    @Override
    public boolean a(final V v) {
        try {
            if (v.a() != 0) {
                throw new IllegalArgumentException(ha.z[153]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return this.e(v.b());
    }
    
    public boolean a(final V v, final c6 c6) {
        try {
            if (v.a() != 0) {
                throw new IllegalArgumentException(ha.z[90]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return this.a(v.b(), c6);
    }
    
    public byte[] a() {
        final byte[] b = this.a().a().b();
        final byte[] array = new byte[-1 + b.length];
        System.arraycopy(b, 1, array, 0, array.length);
        Log.i(ha.z[89]);
        return array;
    }
    
    public b2[] a(final int[] array) {
        return this.a(this.e.getWritableDatabase(), array);
    }
    
    @Override
    public int b() {
        return this.e(this.e.getWritableDatabase());
    }
    
    @Override
    public at b(final V v) {
        try {
            if (v.a() != 0) {
                throw new IllegalArgumentException(ha.z[59]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return this.c(v.b());
    }
    
    @Override
    public z b(final int n) {
        return this.a(this.e.getWritableDatabase(), n);
    }
    
    public void b(final c6 c6) {
        this.b(this.e.getWritableDatabase(), c6);
    }
    
    public void b(final String s) {
        this.a(s);
    }
    
    @Override
    public void b(final String s, final o o) {
        this.b(this.e.getWritableDatabase(), s, o);
    }
    
    public void b(final V v) {
        try {
            if (v.a() != 0) {
                throw new IllegalArgumentException(ha.z[58]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        this.a(v.b());
    }
    
    @Override
    public boolean b() {
        return this.d(this.e.getWritableDatabase());
    }
    
    public void c() {
        this.e.a(this.e.getWritableDatabase());
    }
    
    @Override
    public void c(final int n) {
        this.b(this.e.getWritableDatabase(), n);
    }
    
    public byte[] c(final c6 c6) {
        return this.a(this.e.getWritableDatabase(), c6);
    }
    
    public void d() {
        synchronized (this) {
            this.e.close();
            final File databasePath = this.f.getDatabasePath(ha.z[80]);
            databasePath.delete();
            Log.i(ha.z[81] + databasePath);
        }
    }
    
    public void d(final String s) {
        this.c(this.e.getWritableDatabase(), s);
    }
    
    public b2[] e() {
        return this.b(this.e.getWritableDatabase());
    }
    
    public alk f(final String s) {
        return this.b(this.e.getWritableDatabase(), s);
    }
    
    public boolean f() {
        return this.f(this.e.getWritableDatabase());
    }
    
    public it g() {
        return this.b;
    }
    
    public ni h() {
        return this.d;
    }
    
    public boolean i() {
        return this.a(this.e.getWritableDatabase());
    }
}
