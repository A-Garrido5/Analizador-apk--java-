// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Collections;
import android.content.Context;
import java.util.Hashtable;
import com.whatsapp.protocol.cq;
import android.content.SharedPreferences$Editor;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Vector;
import com.whatsapp.protocol.bi;
import com.whatsapp.protocol.cr;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import com.whatsapp.protocol.cg;

public class adc implements cg
{
    public static boolean a;
    private static final ConcurrentHashMap b;
    private static final int[] c;
    private static ConcurrentHashMap d;
    public static boolean e;
    public static Handler f;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[77];
        String s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0007d\u0004.Y:v\u000f;\u007f6Y\u00141x7eN/\u007f<s\u00069n5e\u000e)j;y\u000735";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1957:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\\';
                        break;
                    }
                    case 0: {
                        c3 = '\u001a';
                        break;
                    }
                    case 1: {
                        c3 = 'R';
                        break;
                    }
                    case 2: {
                        c3 = '\u0017';
                        break;
                    }
                    case 3: {
                        c3 = 'a';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "5={\u00056s6-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0007d\u0004.Y:v\u000f;\u007f6Y\u00141x7eN";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "5<r\u00166s6-";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "} x\u0014,w5eN3t\u0002e\u000e1u&r&.u'g1=h&~\u00025j3y\u0015/5";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0013s\u0005\ti7e\u0012s";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0013s\u0005\ti7e\u0012sh7f\u00149h+p\u00133o\"~\u000f:u";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "{6z\b2";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "} x\u0014,w5eN3t\u0016r\f3n7P\u00133o\"G\u0000.n;t\b,{<c\u0012s";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "} x\u0014,w5eN;h=b\u0011\u000fc<t'=s>r\u0005\u0013h\u0006~\f9u'c";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "5<v\f9 ";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "} x\u0014,w5eN3t\u0002v\u0013(s1~\u0011=n;y\u0006\u0010s!cN6s6-";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "5 r\u00025j;r\u000f(ih";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "|\"vL";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "j3:";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "|\"vL";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "y=zO+r3c\u0012=j\"H\u0011.\u007f4r\u00139t1r\u0012";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "} x\u0014,w5eN1s5e\u0000(\u007f4e\u000e1j r\u0007/5";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "j3:";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "} x\u0014,w5eN3t\u0013s\u0005\u001bh=b\u0011\f{ c\b?s\"v\u000f(i}";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    s = "} x\u0014,w5eN;\u007f&G\u0000.n;t\b,{<c\u0012\u000fn3c\u0014/W7d\u0012=}78";
                    n = 19;
                    n2 = 20;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    array = z2;
                    s = "Z&r\f,";
                    n = 20;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "5!b\u00036\u007f1c[";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    s = "5>x\u0002=n;x\u000ff";
                    n = 22;
                    n2 = 23;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    array = z2;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001by\u00073\\ x\f\u0010s!cN";
                    n = 23;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001by\u00073\\ x\f\u0010s!cN;p;s[";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    s = "5!b\u00036\u007f1cA3m<r\u0013f";
                    n = 25;
                    n2 = 26;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    array = z2;
                    s = "5!b\u00036\u007f1c>(s?r[";
                    n = 26;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "51e\u0004=n;x\u000ff";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "51e\u0004=n=e[";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "5&n\u00119 ";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "} x\u0014,w5eN3t\u0002v\u0013(s1~\u0011=n;y\u0006\u0010s!cN3t\u0002v\u0013(s1~\u0011=n;y\u0006\u0010s!c\u0012\u001fu?g\r9n7";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "} x\u0014,w5eN3t\u0000r\f3l7P\u00133o\"G\u0000.n;t\b,{<c\u0012s";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0016r\r9n78";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "} x\u0014,w5eN;\u007f&G\u0000.n;t\b,{<c2({&b\u0012\u0011\u007f!d\u0000;\u007f}";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "} x\u0014,w5eN5w\"x\u0013({<c\f/}}y\u00140vr";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "Z&r\f,";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "} x\u0014,w5eN3t\u001er\u0000*\u007f\u0015e\u000e)j}";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "} x\u0014,w5eN3t\"v\u0013(s1~\u0011=n;y\u0006;h=b\u0011/5";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0011e\u0004=n7sN";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0002e\u000e1u&r4/\u007f dN";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001cr\u0016\u001bh=b\u0011|u>s\u0011=h&~\u00025j3y\u0015/ ";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001cr\u0016\u001bh=b\u0011s";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = ":<b\f>\u007f t\t=t5r[";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001cr\u0016\u001bh=b\u0011s";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001cr\u0016\u001bh=b\u0011s";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = ":?r\u0002.\u007f3c\u000e. ";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001cr\u0016\u001bh=b\u0011s:<r\u0016f";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001cr\u0016\u001bh=b\u0011sy:v\u000f;\u007f6";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0016r\f3n7B\u00129h!8";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0000r\f3l7B\u00129h!8\f9:>r\u0000*s<p";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0000r\f3l7B\u00129h!8\u00139k'r\u0013%} x\u0014,s<q\u000e";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0000r\f3l7B\u00129h!8\u0012)x8r\u0002(y:v\u000f;\u007f6";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "p;s\u0012f";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u0000r\f3l7B\u00129h!8";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "5 r\f3l7s>>ch";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "y=zO+r3c\u0012=j\"H\u0011.\u007f4r\u00139t1r\u0012";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "} x\u0014,w5eN/\u007f&d\t3o>s\u00069n5e\u000e)j!7";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "} x\u0014,w5eN/\u007f&d\t3o>s\u00069n5e\u000e)j!8\u0007=s>r\u0005";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "t7r\u0005\u0003n=H\u00069n\rp\u00133o\"d";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001cr\u0016\u000fo0}\u0004?n}t\t=t5r\u0005";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001cr\u0016\u000fo0}\u0004?n}";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "Z!9\u00164{&d\u0000,j|y\u0004(";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001cr\u0016\u000fo0}\u0004?n}s\b8:<x\u0015|y:v\u000f;\u007f";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001cr\u0016\u000fo0}\u0004?n}y\u0004+:5e\u000e)j";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "51e\u0004=n;x\u000ff";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "5!b\u00036\u007f1c[";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001by\u0007355}\b8 ";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "5&n\u00119 ";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "5!b\u00036\u007f1cA3m<r\u0013f";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "} x\u0014,w5eN3t\u0015e\u000e)j\u001by\u000735";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "5!b\u00036\u007f1c>(s?r[";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "5>x\u0002=n;x\u000ff";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "51e\u0004=n=e[";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "y=zO+r3c\u0012=j\"H\u0011.\u007f4r\u00139t1r\u0012";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "t7r\u0005\u0003n=H\u00069n\rp\u00133o\"d";
                    n = 74;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "} x\u0014,w5eN3t\u0001r\u0015\u000fo0}\u0004?n}";
                    n = 75;
                    array = z2;
                    continue;
                }
                case 75: {
                    break Label_1957;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        adc.a = false;
        adc.e = false;
        b = new ConcurrentHashMap();
        adc.d = new ConcurrentHashMap();
        adc.f = new yx(Looper.getMainLooper());
        c = new int[] { -4929717, -8154166, -36820, -11617349, -2116080, -14714132, -1011271, -16605952, -8885824, -4946066, -99201, -10890392, -22150, -8544527, -3603591, -6036789, -5881812, -1752413, -6197331, -1094833 };
    }
    
    public static atf a(final String s) {
        synchronized (adc.b) {
            atf atf = adc.b.get(s);
            if (atf == null) {
                atf = new atf(s);
                atf.b();
                adc.b.put(s, atf);
            }
            return atf;
        }
    }
    
    private static bi a(final int p0, final cr p1, final String p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    10: bipush          34
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: iload_0        
        //    17: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    20: ldc             "/"
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    25: aload_1        
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    29: ldc             "/"
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: aload_2        
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    41: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    44: aload_1        
        //    45: ifnull          64
        //    48: new             Lcom/whatsapp/wb;
        //    51: dup            
        //    52: aload_1        
        //    53: invokespecial   com/whatsapp/wb.<init>:(Lcom/whatsapp/protocol/cr;)V
        //    56: astore          4
        //    58: getstatic       com/whatsapp/App.I:Z
        //    61: ifeq            79
        //    64: new             Lcom/whatsapp/protocol/bi;
        //    67: dup            
        //    68: aload_2        
        //    69: aconst_null    
        //    70: checkcast       [B
        //    73: aconst_null    
        //    74: invokespecial   com/whatsapp/protocol/bi.<init>:(Ljava/lang/String;[BLjava/lang/Object;)V
        //    77: astore          4
        //    79: aload           4
        //    81: bipush          6
        //    83: putfield        com/whatsapp/protocol/bi.c:I
        //    86: aload           4
        //    88: iload_0        
        //    89: i2l            
        //    90: putfield        com/whatsapp/protocol/bi.L:J
        //    93: aload           4
        //    95: aload_3        
        //    96: putfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //    99: aload           4
        //   101: invokestatic    com/whatsapp/App.m:()J
        //   104: putfield        com/whatsapp/protocol/bi.u:J
        //   107: iload_0        
        //   108: iconst_4       
        //   109: if_icmpne       138
        //   112: aload_3        
        //   113: ifnull          138
        //   116: aload_3        
        //   117: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   120: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //   123: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //   126: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   129: ifeq            138
        //   132: aload           4
        //   134: iconst_1       
        //   135: putfield        com/whatsapp/protocol/bi.D:I
        //   138: aload           4
        //   140: areturn        
        //   141: astore          5
        //   143: aload           5
        //   145: athrow         
        //   146: astore          6
        //   148: aload           6
        //   150: athrow         
        //   151: astore          7
        //   153: aload           7
        //   155: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  79     107    141    151    Ljava/lang/NullPointerException;
        //  116    138    151    156    Ljava/lang/NullPointerException;
        //  143    146    146    151    Ljava/lang/NullPointerException;
        //  148    151    151    156    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0138:
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
    
    private static bi a(final int n, final cr cr, final String s, final String s2, final Vector vector) {
        return a(n, cr, s, s2, vector, null);
    }
    
    private static bi a(final int p0, final cr p1, final String p2, final String p3, final Vector p4, final atf p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    10: bipush          20
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: iload_0        
        //    17: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    20: ldc             "/"
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    25: aload_1        
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    29: ldc             "/"
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: aload_2        
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: ldc             "/"
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: aload_3        
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: ldc             "/"
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: aload           4
        //    54: invokevirtual   java/util/Vector.toArray:()[Ljava/lang/Object;
        //    57: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //    60: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    63: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    66: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    69: aload_1        
        //    70: ifnull          91
        //    73: new             Lcom/whatsapp/wb;
        //    76: dup            
        //    77: aload_1        
        //    78: aload           5
        //    80: invokespecial   com/whatsapp/wb.<init>:(Lcom/whatsapp/protocol/cr;Lcom/whatsapp/atf;)V
        //    83: astore          6
        //    85: getstatic       com/whatsapp/App.I:Z
        //    88: ifeq            106
        //    91: new             Lcom/whatsapp/protocol/bi;
        //    94: dup            
        //    95: aload_2        
        //    96: aconst_null    
        //    97: checkcast       [B
        //   100: aconst_null    
        //   101: invokespecial   com/whatsapp/protocol/bi.<init>:(Ljava/lang/String;[BLjava/lang/Object;)V
        //   104: astore          6
        //   106: aload           6
        //   108: bipush          6
        //   110: putfield        com/whatsapp/protocol/bi.c:I
        //   113: aload           6
        //   115: iload_0        
        //   116: i2l            
        //   117: putfield        com/whatsapp/protocol/bi.L:J
        //   120: aload_3        
        //   121: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   124: istore          8
        //   126: aconst_null    
        //   127: astore          9
        //   129: iload           8
        //   131: ifeq            198
        //   134: aload           6
        //   136: aload           9
        //   138: putfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   141: aload           6
        //   143: aload           4
        //   145: putfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   148: aload           6
        //   150: invokestatic    com/whatsapp/App.m:()J
        //   153: putfield        com/whatsapp/protocol/bi.u:J
        //   156: iload_0        
        //   157: bipush          12
        //   159: if_icmpne       190
        //   162: aload           4
        //   164: ifnull          190
        //   167: aload           4
        //   169: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   172: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //   175: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //   178: invokevirtual   java/util/Vector.contains:(Ljava/lang/Object;)Z
        //   181: ifeq            190
        //   184: aload           6
        //   186: iconst_1       
        //   187: putfield        com/whatsapp/protocol/bi.D:I
        //   190: aload           6
        //   192: areturn        
        //   193: astore          7
        //   195: aload           7
        //   197: athrow         
        //   198: aload_3        
        //   199: astore          9
        //   201: goto            134
        //   204: astore          10
        //   206: aload           10
        //   208: athrow         
        //   209: astore          11
        //   211: aload           11
        //   213: athrow         
        //   214: astore          12
        //   216: aload           12
        //   218: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  106    126    193    198    Ljava/lang/NullPointerException;
        //  134    156    204    214    Ljava/lang/NullPointerException;
        //  167    190    214    219    Ljava/lang/NullPointerException;
        //  206    209    209    214    Ljava/lang/NullPointerException;
        //  211    214    214    219    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 101, Size: 101
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
    
    private static bi a(final cr cr, final String s, final String s2, final String t, final long u) {
        bi bi = null;
        Label_0035: {
            if (cr != null) {
                bi = new wb(cr);
                if (!App.I) {
                    break Label_0035;
                }
            }
            bi = new bi(s, (byte[])null, null);
        }
        bi.b(s2);
        bi.c = 6;
        bi.L = 1L;
        bi.t = t;
        bi.u = u;
        return bi;
    }
    
    private static bi a(final String s, final String t, final String n) {
        final bi bi = new bi(s, (byte[])null, null);
        bi.c = 6;
        bi.L = 10L;
        bi.t = t;
        bi.N = n;
        bi.u = App.m();
        return bi;
    }
    
    public static bi a(final String s, final String s2, final Vector n, final int n2) {
        final bi bi = new bi(s, s2, null);
        bi.u = App.m();
        bi.c = 6;
        bi.L = n2;
        bi.N = n;
        return bi;
    }
    
    public static String a(final ArrayList list) {
        final boolean i = App.I;
        final StringBuilder sb = new StringBuilder();
        final char a = alm.a();
        final Iterator<String> iterator = list.iterator();
        while (true) {
            Label_0075: {
                if (!iterator.hasNext()) {
                    break Label_0075;
                }
                final String s = iterator.next();
                try {
                    if (sb.length() > 0) {
                        sb.append(a);
                        sb.append(' ');
                    }
                    sb.append(s);
                    if (i) {
                        return sb.toString();
                    }
                    continue;
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
        }
    }
    
    public static String a(final Vector p0) {
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
        //    12: aload_0        
        //    13: invokevirtual   java/util/Vector.iterator:()Ljava/util/Iterator;
        //    16: astore_3       
        //    17: iconst_0       
        //    18: istore          4
        //    20: aload_3        
        //    21: invokeinterface java/util/Iterator.hasNext:()Z
        //    26: ifeq            96
        //    29: aload_3        
        //    30: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    35: checkcast       Ljava/lang/String;
        //    38: astore          18
        //    40: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    43: aload           18
        //    45: invokevirtual   com/whatsapp/wc.f:(Ljava/lang/String;)Z
        //    48: ifeq            58
        //    51: iconst_1       
        //    52: istore          4
        //    54: iload_1        
        //    55: ifeq            269
        //    58: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    61: aload           18
        //    63: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    66: astore          19
        //    68: aload_2        
        //    69: aload           19
        //    71: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //    74: ifne            269
        //    77: aload_2        
        //    78: aload           19
        //    80: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    83: pop            
        //    84: iload           4
        //    86: istore          21
        //    88: iload_1        
        //    89: ifeq            262
        //    92: iload           21
        //    94: istore          4
        //    96: new             Ljava/util/ArrayList;
        //    99: dup            
        //   100: invokespecial   java/util/ArrayList.<init>:()V
        //   103: astore          5
        //   105: new             Ljava/util/ArrayList;
        //   108: dup            
        //   109: invokespecial   java/util/ArrayList.<init>:()V
        //   112: astore          6
        //   114: aload_2        
        //   115: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   118: astore          7
        //   120: aload           7
        //   122: invokeinterface java/util/Iterator.hasNext:()Z
        //   127: ifeq            198
        //   130: aload           7
        //   132: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   137: checkcast       Lcom/whatsapp/a_9;
        //   140: astore          11
        //   142: aload           11
        //   144: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   147: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   150: astore          12
        //   152: aload           12
        //   154: ifnull          194
        //   157: aload           12
        //   159: aload           11
        //   161: invokevirtual   com/whatsapp/a_9.f:()Ljava/lang/String;
        //   164: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   167: istore          15
        //   169: iload           15
        //   171: ifeq            186
        //   174: aload           6
        //   176: aload           12
        //   178: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   181: pop            
        //   182: iload_1        
        //   183: ifeq            194
        //   186: aload           5
        //   188: aload           12
        //   190: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   193: pop            
        //   194: iload_1        
        //   195: ifeq            120
        //   198: aload           5
        //   200: invokestatic    java/util/Collections.sort:(Ljava/util/List;)V
        //   203: aload           6
        //   205: invokestatic    java/util/Collections.sort:(Ljava/util/List;)V
        //   208: aload           5
        //   210: aload           6
        //   212: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   215: pop            
        //   216: iload           4
        //   218: ifeq            236
        //   221: aload           5
        //   223: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   226: ldc_w           2131231980
        //   229: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //   232: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   235: pop            
        //   236: aload           5
        //   238: invokestatic    com/whatsapp/adc.a:(Ljava/util/ArrayList;)Ljava/lang/String;
        //   241: areturn        
        //   242: astore          20
        //   244: aload           20
        //   246: athrow         
        //   247: astore          13
        //   249: aload           13
        //   251: athrow         
        //   252: astore          14
        //   254: aload           14
        //   256: athrow         
        //   257: astore          8
        //   259: aload           8
        //   261: athrow         
        //   262: iload           21
        //   264: istore          4
        //   266: goto            20
        //   269: iload           4
        //   271: istore          21
        //   273: goto            88
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  68     84     242    247    Ljava/lang/NullPointerException;
        //  157    169    247    252    Ljava/lang/NullPointerException;
        //  174    182    252    257    Ljava/lang/NullPointerException;
        //  186    194    252    257    Ljava/lang/NullPointerException;
        //  198    216    257    262    Ljava/lang/NullPointerException;
        //  221    236    257    262    Ljava/lang/NullPointerException;
        //  249    252    252    257    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 124, Size: 124
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
    
    public static void a(final int n, final Object o) {
        adc.f.sendMessage(adc.f.obtainMessage(n, o));
    }
    
    public static void a(final String s, final String s2) {
        a(s).b(s2);
        adc.d.remove(s);
        a(1, a(7, null, s, s2));
    }
    
    public static void a(final String s, final Vector vector) {
        final boolean i = App.I;
        final atf a = a(s);
        final Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            a.a(iterator.next(), false, true);
            if (i) {
                break;
            }
        }
    }
    
    public static void a(final boolean b) {
        Log.i(adc.z[57] + b);
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(adc.z[56], 0).edit();
        try {
            edit.putBoolean(adc.z[59], b);
            if (!edit.commit()) {
                Log.e(adc.z[58]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public static boolean a() {
        return App.aq.getSharedPreferences(adc.z[74], 0).getBoolean(adc.z[75], true);
    }
    
    public static boolean a(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/protocol/bi.c:I
        //     4: bipush          6
        //     6: if_icmpne       158
        //     9: aload_0        
        //    10: getfield        com/whatsapp/protocol/bi.L:J
        //    13: lstore          9
        //    15: lload           9
        //    17: lconst_1       
        //    18: lcmp           
        //    19: ifne            39
        //    22: aload_0        
        //    23: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //    26: invokestatic    com/whatsapp/App.au:()Ljava/lang/String;
        //    29: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    32: istore          17
        //    34: iload           17
        //    36: ifeq            93
        //    39: aload_0        
        //    40: getfield        com/whatsapp/protocol/bi.L:J
        //    43: lstore          11
        //    45: lload           11
        //    47: ldc2_w          4
        //    50: lcmp           
        //    51: ifne            66
        //    54: aload_0        
        //    55: getfield        com/whatsapp/protocol/bi.D:I
        //    58: istore          16
        //    60: iload           16
        //    62: iconst_1       
        //    63: if_icmpeq       93
        //    66: aload_0        
        //    67: getfield        com/whatsapp/protocol/bi.L:J
        //    70: lstore          13
        //    72: lload           13
        //    74: ldc2_w          12
        //    77: lcmp           
        //    78: ifne            158
        //    81: aload_0        
        //    82: getfield        com/whatsapp/protocol/bi.D:I
        //    85: istore          15
        //    87: iload           15
        //    89: iconst_1       
        //    90: if_icmpne       158
        //    93: iconst_1       
        //    94: ireturn        
        //    95: astore_1       
        //    96: aload_1        
        //    97: athrow         
        //    98: astore_2       
        //    99: aload_2        
        //   100: athrow         
        //   101: astore_3       
        //   102: aload_3        
        //   103: athrow         
        //   104: astore          4
        //   106: aload           4
        //   108: athrow         
        //   109: astore          5
        //   111: aload           5
        //   113: athrow         
        //   114: astore          6
        //   116: aload           6
        //   118: athrow         
        //   119: astore          7
        //   121: aload           7
        //   123: athrow         
        //   124: astore          8
        //   126: new             Ljava/lang/StringBuilder;
        //   129: dup            
        //   130: invokespecial   java/lang/StringBuilder.<init>:()V
        //   133: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   136: bipush          35
        //   138: aaload         
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: aload_0        
        //   143: invokestatic    com/whatsapp/util/Log.a:(Lcom/whatsapp/protocol/bi;)Ljava/lang/String;
        //   146: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   149: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   152: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   155: aload           8
        //   157: athrow         
        //   158: iconst_0       
        //   159: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      15     95     98     Ljava/lang/NullPointerException;
        //  22     34     98     101    Ljava/lang/NullPointerException;
        //  39     45     101    104    Ljava/lang/NullPointerException;
        //  54     60     104    109    Ljava/lang/NullPointerException;
        //  66     72     109    114    Ljava/lang/NullPointerException;
        //  81     87     114    158    Ljava/lang/NullPointerException;
        //  96     98     98     101    Ljava/lang/NullPointerException;
        //  99     101    101    104    Ljava/lang/NullPointerException;
        //  102    104    104    109    Ljava/lang/NullPointerException;
        //  106    109    109    114    Ljava/lang/NullPointerException;
        //  111    114    114    158    Ljava/lang/NullPointerException;
        //  116    119    119    158    Ljava/lang/NullPointerException;
        //  121    124    124    158    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 84, Size: 84
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
    
    static bi b(final int n, final cr cr, final String s, final String s2, final Vector vector) {
        return a(n, cr, s, s2, vector);
    }
    
    static bi b(final int n, final cr cr, final String s, final String s2, final Vector vector, final atf atf) {
        return a(n, cr, s, s2, vector, atf);
    }
    
    private static bi b(final cr cr, final String s, final String s2, final String t, final long u) {
        bi bi = null;
        Label_0035: {
            if (cr != null) {
                bi = new wb(cr);
                if (!App.I) {
                    break Label_0035;
                }
            }
            bi = new bi(s, (byte[])null, null);
        }
        bi.b(s2);
        bi.c = 6;
        bi.L = 11L;
        bi.t = t;
        bi.u = u;
        return bi;
    }
    
    public static cq b(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/protocol/bi.c:I
        //     8: istore_3       
        //     9: iload_3        
        //    10: bipush          6
        //    12: if_icmpeq       20
        //    15: aconst_null    
        //    16: areturn        
        //    17: astore_2       
        //    18: aload_2        
        //    19: athrow         
        //    20: new             Lcom/whatsapp/protocol/cq;
        //    23: dup            
        //    24: invokespecial   com/whatsapp/protocol/cq.<init>:()V
        //    27: astore          4
        //    29: aload           4
        //    31: aload_0        
        //    32: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    35: getfield        com/whatsapp/protocol/c6.c:Ljava/lang/String;
        //    38: putfield        com/whatsapp/protocol/cq.r:Ljava/lang/String;
        //    41: aload           4
        //    43: aload_0        
        //    44: getfield        com/whatsapp/protocol/bi.u:J
        //    47: putfield        com/whatsapp/protocol/cq.f:J
        //    50: aload           4
        //    52: aload_0        
        //    53: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    56: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    59: putfield        com/whatsapp/protocol/cq.e:Ljava/lang/String;
        //    62: aload_0        
        //    63: getfield        com/whatsapp/protocol/bi.L:J
        //    66: lstore          23
        //    68: lload           23
        //    70: l2i            
        //    71: tableswitch {
        //                2: 205
        //                3: 152
        //                4: 152
        //                5: 234
        //                6: 436
        //                7: 567
        //                8: 335
        //                9: 152
        //               10: 644
        //               11: 596
        //               12: 158
        //               13: 304
        //               14: 472
        //               15: 405
        //               16: 504
        //               17: 535
        //               18: 186
        //          default: 152
        //        }
        //   152: aconst_null    
        //   153: astore          25
        //   155: aload           25
        //   157: areturn        
        //   158: aload           4
        //   160: iconst_1       
        //   161: putfield        com/whatsapp/protocol/cq.h:I
        //   164: aload           4
        //   166: aload_0        
        //   167: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   170: putfield        com/whatsapp/protocol/cq.j:Ljava/lang/String;
        //   173: aload           4
        //   175: aload_0        
        //   176: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   179: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   182: iload_1        
        //   183: ifeq            679
        //   186: aload           4
        //   188: iconst_2       
        //   189: putfield        com/whatsapp/protocol/cq.h:I
        //   192: aload           4
        //   194: aload_0        
        //   195: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   198: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   201: iload_1        
        //   202: ifeq            679
        //   205: aload           4
        //   207: bipush          10
        //   209: putfield        com/whatsapp/protocol/cq.h:I
        //   212: aload           4
        //   214: aload_0        
        //   215: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   218: putfield        com/whatsapp/protocol/cq.j:Ljava/lang/String;
        //   221: aload           4
        //   223: aload_0        
        //   224: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   227: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   230: iload_1        
        //   231: ifeq            679
        //   234: aload           4
        //   236: getfield        com/whatsapp/protocol/cq.e:Ljava/lang/String;
        //   239: invokestatic    com/whatsapp/a_9.f:(Ljava/lang/String;)Z
        //   242: istore          30
        //   244: iload           30
        //   246: ifeq            269
        //   249: aload           4
        //   251: bipush          12
        //   253: putfield        com/whatsapp/protocol/cq.h:I
        //   256: aload           4
        //   258: aload_0        
        //   259: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   262: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   265: iload_1        
        //   266: ifeq            679
        //   269: aload           4
        //   271: iconst_3       
        //   272: putfield        com/whatsapp/protocol/cq.h:I
        //   275: aload           4
        //   277: new             Ljava/util/Vector;
        //   280: dup            
        //   281: invokespecial   java/util/Vector.<init>:()V
        //   284: putfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   287: aload           4
        //   289: getfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   292: aload_0        
        //   293: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   296: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //   299: pop            
        //   300: iload_1        
        //   301: ifeq            679
        //   304: aload           4
        //   306: iconst_3       
        //   307: putfield        com/whatsapp/protocol/cq.h:I
        //   310: aload           4
        //   312: aload_0        
        //   313: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   316: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   319: aload           4
        //   321: aload_0        
        //   322: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   325: checkcast       Ljava/util/Vector;
        //   328: putfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   331: iload_1        
        //   332: ifeq            679
        //   335: aload           4
        //   337: getfield        com/whatsapp/protocol/cq.e:Ljava/lang/String;
        //   340: invokestatic    com/whatsapp/a_9.f:(Ljava/lang/String;)Z
        //   343: istore          28
        //   345: iload           28
        //   347: ifeq            370
        //   350: aload           4
        //   352: bipush          13
        //   354: putfield        com/whatsapp/protocol/cq.h:I
        //   357: aload           4
        //   359: aload_0        
        //   360: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   363: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   366: iload_1        
        //   367: ifeq            679
        //   370: aload           4
        //   372: iconst_4       
        //   373: putfield        com/whatsapp/protocol/cq.h:I
        //   376: aload           4
        //   378: new             Ljava/util/Vector;
        //   381: dup            
        //   382: invokespecial   java/util/Vector.<init>:()V
        //   385: putfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   388: aload           4
        //   390: getfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   393: aload_0        
        //   394: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   397: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //   400: pop            
        //   401: iload_1        
        //   402: ifeq            679
        //   405: aload           4
        //   407: iconst_4       
        //   408: putfield        com/whatsapp/protocol/cq.h:I
        //   411: aload           4
        //   413: aload_0        
        //   414: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   417: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   420: aload           4
        //   422: aload_0        
        //   423: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   426: checkcast       Ljava/util/Vector;
        //   429: putfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   432: iload_1        
        //   433: ifeq            679
        //   436: aload           4
        //   438: bipush          7
        //   440: putfield        com/whatsapp/protocol/cq.h:I
        //   443: aload           4
        //   445: new             Ljava/util/Vector;
        //   448: dup            
        //   449: invokespecial   java/util/Vector.<init>:()V
        //   452: putfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   455: aload           4
        //   457: getfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   460: aload_0        
        //   461: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   464: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //   467: pop            
        //   468: iload_1        
        //   469: ifeq            679
        //   472: aload           4
        //   474: bipush          7
        //   476: putfield        com/whatsapp/protocol/cq.h:I
        //   479: aload           4
        //   481: aload_0        
        //   482: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   485: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   488: aload           4
        //   490: aload_0        
        //   491: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   494: checkcast       Ljava/util/Vector;
        //   497: putfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   500: iload_1        
        //   501: ifeq            679
        //   504: aload           4
        //   506: iconst_5       
        //   507: putfield        com/whatsapp/protocol/cq.h:I
        //   510: aload           4
        //   512: aload_0        
        //   513: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   516: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   519: aload           4
        //   521: aload_0        
        //   522: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   525: checkcast       Ljava/util/Vector;
        //   528: putfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   531: iload_1        
        //   532: ifeq            679
        //   535: aload           4
        //   537: bipush          6
        //   539: putfield        com/whatsapp/protocol/cq.h:I
        //   542: aload           4
        //   544: aload_0        
        //   545: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   548: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   551: aload           4
        //   553: aload_0        
        //   554: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   557: checkcast       Ljava/util/Vector;
        //   560: putfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   563: iload_1        
        //   564: ifeq            679
        //   567: aload           4
        //   569: bipush          8
        //   571: putfield        com/whatsapp/protocol/cq.h:I
        //   574: aload           4
        //   576: aload_0        
        //   577: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   580: putfield        com/whatsapp/protocol/cq.j:Ljava/lang/String;
        //   583: aload           4
        //   585: aload_0        
        //   586: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   589: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   592: iload_1        
        //   593: ifeq            679
        //   596: aload           4
        //   598: bipush          9
        //   600: putfield        com/whatsapp/protocol/cq.h:I
        //   603: aload           4
        //   605: aload_0        
        //   606: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   609: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   612: aload           4
        //   614: new             Ljava/util/Vector;
        //   617: dup            
        //   618: invokespecial   java/util/Vector.<init>:()V
        //   621: putfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   624: aload           4
        //   626: getfield        com/whatsapp/protocol/cq.c:Ljava/util/Vector;
        //   629: aload_0        
        //   630: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   633: checkcast       Ljava/lang/String;
        //   636: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //   639: pop            
        //   640: iload_1        
        //   641: ifeq            679
        //   644: aload           4
        //   646: bipush          11
        //   648: putfield        com/whatsapp/protocol/cq.h:I
        //   651: aload           4
        //   653: aload_0        
        //   654: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   657: checkcast       Ljava/util/Vector;
        //   660: invokevirtual   java/util/Vector.size:()I
        //   663: putfield        com/whatsapp/protocol/cq.i:I
        //   666: aload           4
        //   668: aload_0        
        //   669: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   672: putfield        com/whatsapp/protocol/cq.d:Ljava/lang/String;
        //   675: iload_1        
        //   676: ifne            152
        //   679: aload           4
        //   681: astore          25
        //   683: goto            155
        //   686: astore          5
        //   688: aload           5
        //   690: athrow         
        //   691: astore          6
        //   693: aload           6
        //   695: athrow         
        //   696: astore          7
        //   698: aload           7
        //   700: athrow         
        //   701: astore          8
        //   703: aload           8
        //   705: athrow         
        //   706: astore          9
        //   708: aload           9
        //   710: athrow         
        //   711: astore          10
        //   713: aload           10
        //   715: athrow         
        //   716: astore          11
        //   718: aload           11
        //   720: athrow         
        //   721: astore          12
        //   723: aload           12
        //   725: athrow         
        //   726: astore          13
        //   728: aload           13
        //   730: athrow         
        //   731: astore          14
        //   733: aload           14
        //   735: athrow         
        //   736: astore          15
        //   738: aload           15
        //   740: athrow         
        //   741: astore          16
        //   743: aload           16
        //   745: athrow         
        //   746: astore          17
        //   748: aload           17
        //   750: athrow         
        //   751: astore          18
        //   753: aload           18
        //   755: athrow         
        //   756: astore          19
        //   758: aload           19
        //   760: athrow         
        //   761: astore          20
        //   763: aload           20
        //   765: athrow         
        //   766: astore          21
        //   768: aload           21
        //   770: athrow         
        //   771: astore          22
        //   773: aload           22
        //   775: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      17     20     Ljava/lang/NullPointerException;
        //  29     68     686    691    Ljava/lang/NullPointerException;
        //  158    182    691    696    Ljava/lang/NullPointerException;
        //  186    201    696    701    Ljava/lang/NullPointerException;
        //  205    230    701    706    Ljava/lang/NullPointerException;
        //  234    244    706    711    Ljava/lang/NullPointerException;
        //  249    265    711    716    Ljava/lang/NullPointerException;
        //  269    300    716    721    Ljava/lang/NullPointerException;
        //  304    331    721    726    Ljava/lang/NullPointerException;
        //  335    345    726    731    Ljava/lang/NullPointerException;
        //  350    366    731    736    Ljava/lang/NullPointerException;
        //  370    401    736    741    Ljava/lang/NullPointerException;
        //  405    432    741    746    Ljava/lang/NullPointerException;
        //  436    468    746    751    Ljava/lang/NullPointerException;
        //  472    500    751    756    Ljava/lang/NullPointerException;
        //  504    531    756    761    Ljava/lang/NullPointerException;
        //  535    563    761    766    Ljava/lang/NullPointerException;
        //  567    592    766    771    Ljava/lang/NullPointerException;
        //  596    640    771    776    Ljava/lang/NullPointerException;
        //  644    675    771    776    Ljava/lang/NullPointerException;
        //  688    691    691    696    Ljava/lang/NullPointerException;
        //  693    696    696    701    Ljava/lang/NullPointerException;
        //  698    701    701    706    Ljava/lang/NullPointerException;
        //  703    706    706    711    Ljava/lang/NullPointerException;
        //  708    711    711    716    Ljava/lang/NullPointerException;
        //  713    716    716    721    Ljava/lang/NullPointerException;
        //  718    721    721    726    Ljava/lang/NullPointerException;
        //  723    726    726    731    Ljava/lang/NullPointerException;
        //  728    731    731    736    Ljava/lang/NullPointerException;
        //  733    736    736    741    Ljava/lang/NullPointerException;
        //  738    741    741    746    Ljava/lang/NullPointerException;
        //  743    746    746    751    Ljava/lang/NullPointerException;
        //  748    751    751    756    Ljava/lang/NullPointerException;
        //  753    756    756    761    Ljava/lang/NullPointerException;
        //  758    761    761    766    Ljava/lang/NullPointerException;
        //  763    766    766    771    Ljava/lang/NullPointerException;
        //  768    771    771    776    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 330, Size: 330
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
    
    public static void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_0       
        //     4: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //     7: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    10: astore_1       
        //    11: aload_1        
        //    12: ifnonnull       16
        //    15: return         
        //    16: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    19: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    22: bipush          16
        //    24: aaload         
        //    25: iconst_0       
        //    26: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    29: astore_2       
        //    30: new             Ljava/util/ArrayList;
        //    33: dup            
        //    34: invokespecial   java/util/ArrayList.<init>:()V
        //    37: astore_3       
        //    38: invokestatic    com/whatsapp/z8.j:()Ljava/util/ArrayList;
        //    41: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    44: astore          4
        //    46: aload           4
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            483
        //    56: aload           4
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: checkcast       Ljava/lang/String;
        //    66: astore          7
        //    68: aload           7
        //    70: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //    73: istore          11
        //    75: iload           11
        //    77: ifne            92
        //    80: aload           7
        //    82: invokestatic    com/whatsapp/a_9.f:(Ljava/lang/String;)Z
        //    85: istore          38
        //    87: iload           38
        //    89: ifeq            479
        //    92: aload_2        
        //    93: new             Ljava/lang/StringBuilder;
        //    96: dup            
        //    97: invokespecial   java/lang/StringBuilder.<init>:()V
        //   100: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   103: bipush          14
        //   105: aaload         
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: aload           7
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   117: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //   122: ifne            162
        //   125: aload_2        
        //   126: new             Ljava/lang/StringBuilder;
        //   129: dup            
        //   130: invokespecial   java/lang/StringBuilder.<init>:()V
        //   133: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   136: bipush          13
        //   138: aaload         
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: aload           7
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   150: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //   155: istore          37
        //   157: iload           37
        //   159: ifeq            479
        //   162: aload_2        
        //   163: new             Ljava/lang/StringBuilder;
        //   166: dup            
        //   167: invokespecial   java/lang/StringBuilder.<init>:()V
        //   170: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   173: bipush          18
        //   175: aaload         
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: aload           7
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: ldc_w           ""
        //   190: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   195: astore          12
        //   197: aload_2        
        //   198: new             Ljava/lang/StringBuilder;
        //   201: dup            
        //   202: invokespecial   java/lang/StringBuilder.<init>:()V
        //   205: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   208: bipush          15
        //   210: aaload         
        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: aload           7
        //   216: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   219: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   222: ldc_w           ""
        //   225: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   230: astore          13
        //   232: new             Ljava/lang/StringBuilder;
        //   235: dup            
        //   236: invokespecial   java/lang/StringBuilder.<init>:()V
        //   239: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   242: bipush          17
        //   244: aaload         
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: aload           7
        //   250: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   253: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   256: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   259: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   262: aload           7
        //   264: invokevirtual   com/whatsapp/wc.d:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   267: astore          14
        //   269: aload           14
        //   271: ifnonnull       528
        //   274: aconst_null    
        //   275: astore          15
        //   277: aload           12
        //   279: ldc_w           ","
        //   282: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   285: astore          16
        //   287: new             Lcom/whatsapp/atf;
        //   290: dup            
        //   291: aload           7
        //   293: invokespecial   com/whatsapp/atf.<init>:(Ljava/lang/String;)V
        //   296: astore          17
        //   298: aload           16
        //   300: arraylength    
        //   301: istore          18
        //   303: iconst_0       
        //   304: istore          19
        //   306: iload           19
        //   308: iload           18
        //   310: if_icmpge       351
        //   313: aload           16
        //   315: iload           19
        //   317: aaload         
        //   318: astore          34
        //   320: aload           34
        //   322: invokevirtual   java/lang/String.length:()I
        //   325: ifle            344
        //   328: aload           17
        //   330: aload           34
        //   332: aload           34
        //   334: aload           15
        //   336: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   339: iconst_0       
        //   340: invokevirtual   com/whatsapp/atf.a:(Ljava/lang/String;ZZ)Lcom/whatsapp/wh;
        //   343: pop            
        //   344: iinc            19, 1
        //   347: iload_0        
        //   348: ifeq            306
        //   351: aload           13
        //   353: ldc_w           ","
        //   356: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   359: astore          20
        //   361: aload           20
        //   363: arraylength    
        //   364: istore          21
        //   366: iconst_0       
        //   367: istore          22
        //   369: iload           22
        //   371: iload           21
        //   373: if_icmpge       408
        //   376: aload           20
        //   378: iload           22
        //   380: aaload         
        //   381: astore          31
        //   383: aload           31
        //   385: invokevirtual   java/lang/String.length:()I
        //   388: ifle            401
        //   391: aload           17
        //   393: aload           31
        //   395: iconst_0       
        //   396: iconst_1       
        //   397: invokevirtual   com/whatsapp/atf.a:(Ljava/lang/String;ZZ)Lcom/whatsapp/wh;
        //   400: pop            
        //   401: iinc            22, 1
        //   404: iload_0        
        //   405: ifeq            369
        //   408: aload           7
        //   410: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //   413: istore          26
        //   415: iload           26
        //   417: ifeq            453
        //   420: aload           14
        //   422: ifnull          453
        //   425: aload           14
        //   427: getfield        com/whatsapp/a_9.b:Z
        //   430: ifeq            453
        //   433: aload           17
        //   435: aload_1        
        //   436: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   439: aload_1        
        //   440: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   443: aload           15
        //   445: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   448: iconst_0       
        //   449: invokevirtual   com/whatsapp/atf.a:(Ljava/lang/String;ZZ)Lcom/whatsapp/wh;
        //   452: pop            
        //   453: aload_3        
        //   454: aload           17
        //   456: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   459: pop            
        //   460: aload           17
        //   462: invokevirtual   com/whatsapp/atf.j:()I
        //   465: ifle            479
        //   468: getstatic       com/whatsapp/adc.b:Ljava/util/concurrent/ConcurrentHashMap;
        //   471: aload           7
        //   473: aload           17
        //   475: invokevirtual   java/util/concurrent/ConcurrentHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   478: pop            
        //   479: iload_0        
        //   480: ifeq            46
        //   483: aload_3        
        //   484: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   487: ifne            15
        //   490: new             Lcom/whatsapp/qb;
        //   493: dup            
        //   494: aload_3        
        //   495: aload_2        
        //   496: invokespecial   com/whatsapp/qb.<init>:(Ljava/util/ArrayList;Landroid/content/SharedPreferences;)V
        //   499: iconst_0       
        //   500: anewarray       Ljava/lang/Void;
        //   503: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   506: pop            
        //   507: return         
        //   508: astore          5
        //   510: aload           5
        //   512: athrow         
        //   513: astore          8
        //   515: aload           8
        //   517: athrow         
        //   518: astore          9
        //   520: aload           9
        //   522: athrow         
        //   523: astore          10
        //   525: aload           10
        //   527: athrow         
        //   528: aload           14
        //   530: invokevirtual   com/whatsapp/a_9.j:()Ljava/lang/String;
        //   533: astore          15
        //   535: goto            277
        //   538: astore          35
        //   540: aload           35
        //   542: athrow         
        //   543: astore          32
        //   545: aload           32
        //   547: athrow         
        //   548: astore          23
        //   550: aload           23
        //   552: athrow         
        //   553: astore          24
        //   555: aload           24
        //   557: athrow         
        //   558: astore          25
        //   560: aload           25
        //   562: athrow         
        //   563: astore          27
        //   565: aload           27
        //   567: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  68     75     513    518    Ljava/lang/NullPointerException;
        //  80     87     518    523    Ljava/lang/NullPointerException;
        //  92     157    523    528    Ljava/lang/NullPointerException;
        //  320    344    538    543    Ljava/lang/NullPointerException;
        //  383    401    543    548    Ljava/lang/NullPointerException;
        //  408    415    548    558    Ljava/lang/NullPointerException;
        //  425    453    558    563    Ljava/lang/NullPointerException;
        //  453    479    563    568    Ljava/lang/NullPointerException;
        //  483    507    508    513    Ljava/lang/NullPointerException;
        //  515    518    518    523    Ljava/lang/NullPointerException;
        //  520    523    523    528    Ljava/lang/NullPointerException;
        //  550    553    553    558    Ljava/lang/NullPointerException;
        //  555    558    558    563    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 258, Size: 258
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
    
    public static boolean b(final String s) {
        return s.contains("-");
    }
    
    public static boolean b(final String s, final String s2) {
        final wh c = c(s, s2);
        if (c != null) {
            try {
                if (c.b) {
                    return true;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    public static bi c(final String s) {
        final bi bi = new bi(s, (byte[])null, null);
        bi.u = App.m();
        bi.c = 6;
        bi.L = 8L;
        return bi;
    }
    
    public static wh c(final String s, final String s2) {
        return a(s).a(s2);
    }
    
    private void c(final String p0, final String p1, final long p2, final String p3, final long p4, final String p5, final String p6, final long p7, final Hashtable p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          13
        //     5: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //     8: aload_1        
        //     9: invokevirtual   com/whatsapp/vy.i:(Ljava/lang/String;)Z
        //    12: istore          15
        //    14: iload           15
        //    16: ifne            311
        //    19: iconst_1       
        //    20: istore          16
        //    22: iload           16
        //    24: ifeq            117
        //    27: iconst_0       
        //    28: aconst_null    
        //    29: aload_1        
        //    30: aload           5
        //    32: aload_2        
        //    33: lload           6
        //    35: invokestatic    com/whatsapp/adc.b:(Lcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/whatsapp/protocol/bi;
        //    38: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //    41: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    44: aload_2        
        //    45: invokevirtual   com/whatsapp/wc.f:(Ljava/lang/String;)Z
        //    48: istore          32
        //    50: iload           32
        //    52: ifne            127
        //    55: new             Lcom/whatsapp/protocol/bi;
        //    58: dup            
        //    59: aload_1        
        //    60: aconst_null    
        //    61: checkcast       [B
        //    64: aconst_null    
        //    65: invokespecial   com/whatsapp/protocol/bi.<init>:(Ljava/lang/String;[BLjava/lang/Object;)V
        //    68: astore          33
        //    70: aload           33
        //    72: bipush          6
        //    74: putfield        com/whatsapp/protocol/bi.c:I
        //    77: aload           33
        //    79: ldc2_w          4
        //    82: putfield        com/whatsapp/protocol/bi.L:J
        //    85: aload           33
        //    87: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    90: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    93: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //    96: putfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //    99: aload           33
        //   101: lload           6
        //   103: putfield        com/whatsapp/protocol/bi.u:J
        //   106: iconst_1       
        //   107: aload           33
        //   109: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   112: iload           13
        //   114: ifeq            127
        //   117: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   120: aload_1        
        //   121: aload           5
        //   123: lload_3        
        //   124: invokevirtual   com/whatsapp/vy.a:(Ljava/lang/String;Ljava/lang/String;J)V
        //   127: aload_1        
        //   128: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //   131: astore          18
        //   133: aload           18
        //   135: aload           12
        //   137: iconst_0       
        //   138: invokevirtual   com/whatsapp/atf.a:(Ljava/util/Hashtable;Z)Z
        //   141: ifeq            152
        //   144: getstatic       com/whatsapp/adc.d:Ljava/util/concurrent/ConcurrentHashMap;
        //   147: aload_1        
        //   148: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   151: pop            
        //   152: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   155: aload_1        
        //   156: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   159: astore          20
        //   161: aload           20
        //   163: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   166: aload           5
        //   168: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   171: istore          24
        //   173: iload           24
        //   175: ifeq            209
        //   178: aload           20
        //   180: getfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //   183: lload_3        
        //   184: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   187: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   190: istore          29
        //   192: iload           29
        //   194: ifeq            209
        //   197: aload           20
        //   199: getfield        com/whatsapp/a_9.i:Ljava/lang/String;
        //   202: aload_2        
        //   203: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   206: ifne            239
        //   209: aload           20
        //   211: aload           5
        //   213: putfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   216: aload           20
        //   218: lload_3        
        //   219: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   222: putfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //   225: aload           20
        //   227: aload_2        
        //   228: putfield        com/whatsapp/a_9.i:Ljava/lang/String;
        //   231: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   234: aload           20
        //   236: invokevirtual   com/whatsapp/wc.d:(Lcom/whatsapp/a_9;)V
        //   239: getstatic       com/whatsapp/adc.b:Ljava/util/concurrent/ConcurrentHashMap;
        //   242: aload_1        
        //   243: invokevirtual   java/util/concurrent/ConcurrentHashMap.containsKey:(Ljava/lang/Object;)Z
        //   246: ifne            255
        //   249: aload_1        
        //   250: iconst_0       
        //   251: iconst_2       
        //   252: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;II)V
        //   255: lload           10
        //   257: lconst_0       
        //   258: lcmp           
        //   259: ifne            274
        //   262: getstatic       com/whatsapp/dt.c:Lcom/whatsapp/dt;
        //   265: aload_1        
        //   266: invokevirtual   com/whatsapp/dt.c:(Ljava/lang/String;)V
        //   269: iload           13
        //   271: ifeq            305
        //   274: lload           10
        //   276: ldc2_w          -1
        //   279: lcmp           
        //   280: ifne            296
        //   283: getstatic       com/whatsapp/dt.c:Lcom/whatsapp/dt;
        //   286: aload_1        
        //   287: lconst_0       
        //   288: invokevirtual   com/whatsapp/dt.a:(Ljava/lang/String;J)V
        //   291: iload           13
        //   293: ifeq            305
        //   296: getstatic       com/whatsapp/dt.c:Lcom/whatsapp/dt;
        //   299: aload_1        
        //   300: lload           10
        //   302: invokevirtual   com/whatsapp/dt.a:(Ljava/lang/String;J)V
        //   305: return         
        //   306: astore          14
        //   308: aload           14
        //   310: athrow         
        //   311: iconst_0       
        //   312: istore          16
        //   314: goto            22
        //   317: astore          31
        //   319: aload           31
        //   321: athrow         
        //   322: astore          17
        //   324: aload           17
        //   326: athrow         
        //   327: astore          19
        //   329: aload           19
        //   331: athrow         
        //   332: astore          21
        //   334: aload           21
        //   336: athrow         
        //   337: astore          22
        //   339: aload           22
        //   341: athrow         
        //   342: astore          23
        //   344: aload           23
        //   346: athrow         
        //   347: astore          25
        //   349: aload           25
        //   351: athrow         
        //   352: astore          27
        //   354: aload           27
        //   356: athrow         
        //   357: astore          28
        //   359: aload           28
        //   361: athrow         
        //   362: astore          26
        //   364: aload           26
        //   366: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  5      14     306    311    Ljava/lang/NullPointerException;
        //  27     50     317    322    Ljava/lang/NullPointerException;
        //  70     112    322    327    Ljava/lang/NullPointerException;
        //  117    127    322    327    Ljava/lang/NullPointerException;
        //  133    152    327    332    Ljava/lang/NullPointerException;
        //  161    173    332    337    Ljava/lang/NullPointerException;
        //  178    192    337    342    Ljava/lang/NullPointerException;
        //  197    209    342    347    Ljava/lang/NullPointerException;
        //  209    239    342    347    Ljava/lang/NullPointerException;
        //  239    255    347    352    Ljava/lang/NullPointerException;
        //  262    269    352    362    Ljava/lang/NullPointerException;
        //  283    291    362    367    Ljava/lang/NullPointerException;
        //  296    305    362    367    Ljava/lang/NullPointerException;
        //  334    337    337    342    Ljava/lang/NullPointerException;
        //  339    342    342    347    Ljava/lang/NullPointerException;
        //  354    357    357    362    Ljava/lang/NullPointerException;
        //  359    362    362    367    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 175, Size: 175
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
    
    public static String d(final String s) {
        return App.au() + "-" + s + adc.z[36];
    }
    
    public static void d(final String s, final String s2) {
        a(s).a(s2, false, false);
        adc.d.remove(s);
        a(1, a(4, null, s, s2));
    }
    
    static int[] d() {
        return adc.c;
    }
    
    public static void e() {
        Log.i(adc.z[9]);
        adc.e = false;
        a(true);
    }
    
    public static boolean e(final String s) {
        return a(s).f();
    }
    
    public static boolean f(final String s) {
        return a(s).h();
    }
    
    public static boolean g(final String s) {
        final boolean i = App.I;
        for (final wh wh : a(s).i()) {
            if (!wh.a()) {
                final a_9 d = App.S.d(wh.c);
                if (d != null) {
                    try {
                        if (d.e != null) {
                            return true;
                        }
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                }
            }
            if (i) {
                break;
            }
        }
        return false;
    }
    
    public static String h(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/adc.d:Ljava/util/concurrent/ConcurrentHashMap;
        //     7: aload_0        
        //     8: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    11: checkcast       Ljava/lang/String;
        //    14: astore_2       
        //    15: aload_2        
        //    16: ifnull          21
        //    19: aload_2        
        //    20: areturn        
        //    21: new             Ljava/util/ArrayList;
        //    24: dup            
        //    25: invokespecial   java/util/ArrayList.<init>:()V
        //    28: astore_3       
        //    29: aload_0        
        //    30: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //    33: invokevirtual   com/whatsapp/atf.k:()Ljava/util/Collection;
        //    36: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    41: astore          4
        //    43: iconst_0       
        //    44: istore          5
        //    46: aload           4
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            130
        //    56: aload           4
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: checkcast       Lcom/whatsapp/wh;
        //    66: astore          21
        //    68: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    71: aload           21
        //    73: getfield        com/whatsapp/wh.c:Ljava/lang/String;
        //    76: invokevirtual   com/whatsapp/wc.f:(Ljava/lang/String;)Z
        //    79: ifeq            89
        //    82: iconst_1       
        //    83: istore          5
        //    85: iload_1        
        //    86: ifeq            314
        //    89: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    92: aload           21
        //    94: getfield        com/whatsapp/wh.c:Ljava/lang/String;
        //    97: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   100: astore          22
        //   102: aload_3        
        //   103: aload           22
        //   105: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //   108: ifne            314
        //   111: aload_3        
        //   112: aload           22
        //   114: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   117: pop            
        //   118: iload           5
        //   120: istore          24
        //   122: iload_1        
        //   123: ifeq            307
        //   126: iload           24
        //   128: istore          5
        //   130: new             Ljava/util/ArrayList;
        //   133: dup            
        //   134: invokespecial   java/util/ArrayList.<init>:()V
        //   137: astore          6
        //   139: new             Ljava/util/ArrayList;
        //   142: dup            
        //   143: invokespecial   java/util/ArrayList.<init>:()V
        //   146: astore          7
        //   148: aload_3        
        //   149: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   152: astore          8
        //   154: aload           8
        //   156: invokeinterface java/util/Iterator.hasNext:()Z
        //   161: ifeq            229
        //   164: aload           8
        //   166: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   171: checkcast       Lcom/whatsapp/a_9;
        //   174: astore          14
        //   176: aload           14
        //   178: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //   181: astore          15
        //   183: aload           15
        //   185: ifnull          225
        //   188: aload           15
        //   190: aload           14
        //   192: invokevirtual   com/whatsapp/a_9.f:()Ljava/lang/String;
        //   195: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   198: istore          18
        //   200: iload           18
        //   202: ifeq            217
        //   205: aload           7
        //   207: aload           15
        //   209: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   212: pop            
        //   213: iload_1        
        //   214: ifeq            225
        //   217: aload           6
        //   219: aload           15
        //   221: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   224: pop            
        //   225: iload_1        
        //   226: ifeq            154
        //   229: aload           6
        //   231: invokestatic    java/util/Collections.sort:(Ljava/util/List;)V
        //   234: aload           7
        //   236: invokestatic    java/util/Collections.sort:(Ljava/util/List;)V
        //   239: aload           6
        //   241: aload           7
        //   243: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   246: pop            
        //   247: iload           5
        //   249: ifeq            267
        //   252: aload           6
        //   254: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   257: ldc_w           2131231980
        //   260: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //   263: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   266: pop            
        //   267: aload           6
        //   269: invokestatic    com/whatsapp/adc.a:(Ljava/util/ArrayList;)Ljava/lang/String;
        //   272: astore          12
        //   274: getstatic       com/whatsapp/adc.d:Ljava/util/concurrent/ConcurrentHashMap;
        //   277: aload_0        
        //   278: aload           12
        //   280: invokevirtual   java/util/concurrent/ConcurrentHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   283: pop            
        //   284: aload           12
        //   286: areturn        
        //   287: astore          23
        //   289: aload           23
        //   291: athrow         
        //   292: astore          16
        //   294: aload           16
        //   296: athrow         
        //   297: astore          17
        //   299: aload           17
        //   301: athrow         
        //   302: astore          9
        //   304: aload           9
        //   306: athrow         
        //   307: iload           24
        //   309: istore          5
        //   311: goto            46
        //   314: iload           5
        //   316: istore          24
        //   318: goto            122
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  102    118    287    292    Ljava/lang/NullPointerException;
        //  188    200    292    297    Ljava/lang/NullPointerException;
        //  205    213    297    302    Ljava/lang/NullPointerException;
        //  217    225    297    302    Ljava/lang/NullPointerException;
        //  229    247    302    307    Ljava/lang/NullPointerException;
        //  252    267    302    307    Ljava/lang/NullPointerException;
        //  294    297    297    302    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 143, Size: 143
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
    
    public static boolean i(final String s) {
        return s.endsWith(adc.z[21]);
    }
    
    @Override
    public void a() {
        Log.i(adc.z[31]);
        App.c((Context)App.aq, false);
    }
    
    @Override
    public void a(final cr cr) {
    }
    
    @Override
    public void a(final cr cr, final String s) {
        final boolean i = App.I;
        Log.i(adc.z[33] + cr);
        Label_0129: {
            if (!adc.b.containsKey(cr.a)) {
                break Label_0129;
            }
            final atf a = a(cr.a);
            a.b(App.S.e().u);
            final Iterator iterator = a.k().iterator();
            while (iterator.hasNext()) {
                iterator.next().b = false;
                if (i) {
                    break;
                }
            }
            try {
                a(1, a(17, cr, cr.a, cr.d));
                if (i) {
                    App.b(cr);
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public void a(final cr p0, final String p1, final String p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    15: bipush          61
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_1        
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    25: ldc             "/"
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: aload_2        
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: ldc             "/"
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    39: aload_3        
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: ldc             "/"
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: ldc2_w          1000
        //    51: iload           4
        //    53: i2l            
        //    54: lmul           
        //    55: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    58: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    61: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    64: aload_1        
        //    65: getfield        com/whatsapp/protocol/cr.a:Ljava/lang/String;
        //    68: astore          6
        //    70: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    73: aload           6
        //    75: invokevirtual   com/whatsapp/wc.c:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    78: astore          7
        //    80: aload           7
        //    82: ifnull          165
        //    85: aload           7
        //    87: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    90: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //    93: aload_2        
        //    94: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    97: istore          14
        //    99: iload           14
        //   101: ifne            147
        //   104: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   107: bipush          60
        //   109: aaload         
        //   110: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   113: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   116: aload           6
        //   118: aload_3        
        //   119: aload_2        
        //   120: invokevirtual   com/whatsapp/wc.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   123: iconst_3       
        //   124: aload_1        
        //   125: aload           6
        //   127: aload_2        
        //   128: aload_3        
        //   129: ldc2_w          1000
        //   132: iload           4
        //   134: i2l            
        //   135: lmul           
        //   136: invokestatic    com/whatsapp/adc.a:(Lcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/whatsapp/protocol/bi;
        //   139: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   142: iload           5
        //   144: ifeq            278
        //   147: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   150: bipush          63
        //   152: aaload         
        //   153: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   156: aload_1        
        //   157: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //   160: iload           5
        //   162: ifeq            278
        //   165: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   168: bipush          64
        //   170: aaload         
        //   171: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   174: new             Lcom/whatsapp/atf;
        //   177: dup            
        //   178: aload           6
        //   180: invokespecial   com/whatsapp/atf.<init>:(Ljava/lang/String;)V
        //   183: astore          8
        //   185: aload           6
        //   187: aload_2        
        //   188: ldc2_w          1000
        //   191: iload           4
        //   193: i2l            
        //   194: lmul           
        //   195: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;Ljava/lang/String;J)Lcom/whatsapp/a_9;
        //   198: pop            
        //   199: aload           8
        //   201: new             Ljava/lang/StringBuilder;
        //   204: dup            
        //   205: invokespecial   java/lang/StringBuilder.<init>:()V
        //   208: aload           6
        //   210: iconst_0       
        //   211: aload           6
        //   213: ldc_w           "-"
        //   216: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   219: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   228: bipush          62
        //   230: aaload         
        //   231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   234: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   237: iconst_1       
        //   238: iconst_0       
        //   239: invokevirtual   com/whatsapp/atf.a:(Ljava/lang/String;ZZ)Lcom/whatsapp/wh;
        //   242: pop            
        //   243: getstatic       com/whatsapp/adc.b:Ljava/util/concurrent/ConcurrentHashMap;
        //   246: aload           6
        //   248: aload           8
        //   250: invokevirtual   java/util/concurrent/ConcurrentHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   253: pop            
        //   254: iconst_0       
        //   255: aload_1        
        //   256: aload           6
        //   258: aload_2        
        //   259: aload_3        
        //   260: ldc2_w          1000
        //   263: iload           4
        //   265: i2l            
        //   266: lmul           
        //   267: invokestatic    com/whatsapp/adc.b:(Lcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/whatsapp/protocol/bi;
        //   270: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   273: aload           6
        //   275: invokestatic    com/whatsapp/App.c:(Ljava/lang/String;)V
        //   278: return         
        //   279: astore          12
        //   281: aload           12
        //   283: athrow         
        //   284: astore          13
        //   286: aload           13
        //   288: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  85     99     279    284    Ljava/lang/NullPointerException;
        //  104    142    284    289    Ljava/lang/NullPointerException;
        //  147    160    284    289    Ljava/lang/NullPointerException;
        //  281    284    284    289    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0147:
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
    
    @Override
    public void a(final cr p0, final String p1, final String p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    10: iconst_2       
        //    11: aaload         
        //    12: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    15: aload_1        
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    19: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    22: iconst_1       
        //    23: aaload         
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: aload_2        
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    31: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    34: iconst_3       
        //    35: aaload         
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    39: aload_3        
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    46: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    49: aload_1        
        //    50: getfield        com/whatsapp/protocol/cr.a:Ljava/lang/String;
        //    53: astore          5
        //    55: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    58: aload           5
        //    60: invokevirtual   com/whatsapp/wc.c:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    63: astore          6
        //    65: aload           5
        //    67: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //    70: astore          7
        //    72: aload           7
        //    74: aload_2        
        //    75: invokevirtual   com/whatsapp/atf.a:(Ljava/lang/String;)Lcom/whatsapp/wh;
        //    78: astore          8
        //    80: aload           7
        //    82: aload_2        
        //    83: invokevirtual   com/whatsapp/atf.b:(Ljava/lang/String;)Lcom/whatsapp/wh;
        //    86: pop            
        //    87: aload           8
        //    89: ifnonnull       260
        //    92: iconst_0       
        //    93: istore          11
        //    95: aload           7
        //    97: aload_3        
        //    98: iload           11
        //   100: iconst_0       
        //   101: invokevirtual   com/whatsapp/atf.a:(Ljava/lang/String;ZZ)Lcom/whatsapp/wh;
        //   104: pop            
        //   105: aload           6
        //   107: ifnull          127
        //   110: aload           7
        //   112: invokevirtual   com/whatsapp/atf.h:()Z
        //   115: istore          28
        //   117: iload           28
        //   119: ifeq            127
        //   122: aload           8
        //   124: ifnonnull       237
        //   127: new             Ljava/lang/StringBuilder;
        //   130: dup            
        //   131: invokespecial   java/lang/StringBuilder.<init>:()V
        //   134: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   137: iconst_0       
        //   138: aaload         
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: astore          17
        //   144: aload           6
        //   146: ifnonnull       290
        //   149: iconst_1       
        //   150: istore          18
        //   152: aload           17
        //   154: iload           18
        //   156: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   159: ldc             "/"
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: astore          20
        //   166: aload           7
        //   168: invokevirtual   com/whatsapp/atf.h:()Z
        //   171: istore          21
        //   173: iload           21
        //   175: ifne            301
        //   178: iconst_1       
        //   179: istore          22
        //   181: aload           20
        //   183: iload           22
        //   185: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   188: ldc             "/"
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   193: astore          24
        //   195: aload           8
        //   197: ifnonnull       312
        //   200: iconst_1       
        //   201: istore          25
        //   203: aload           24
        //   205: iload           25
        //   207: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   210: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   213: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   216: aload           5
        //   218: invokestatic    com/whatsapp/App.c:(Ljava/lang/String;)V
        //   221: iconst_0       
        //   222: istore          27
        //   224: aload           6
        //   226: ifnonnull       323
        //   229: aload           5
        //   231: iload           27
        //   233: iconst_2       
        //   234: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;II)V
        //   237: iconst_1       
        //   238: aload_1        
        //   239: getfield        com/whatsapp/protocol/cr.a:Ljava/lang/String;
        //   242: aload_2        
        //   243: aload_3        
        //   244: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/protocol/bi;
        //   247: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   250: aload_1        
        //   251: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //   254: return         
        //   255: astore          9
        //   257: aload           9
        //   259: athrow         
        //   260: aload           8
        //   262: getfield        com/whatsapp/wh.b:Z
        //   265: istore          11
        //   267: goto            95
        //   270: astore          12
        //   272: aload           12
        //   274: athrow         
        //   275: astore          13
        //   277: aload           13
        //   279: athrow         
        //   280: astore          14
        //   282: aload           14
        //   284: athrow         
        //   285: astore          15
        //   287: aload           15
        //   289: athrow         
        //   290: iconst_0       
        //   291: istore          18
        //   293: goto            152
        //   296: astore          19
        //   298: aload           19
        //   300: athrow         
        //   301: iconst_0       
        //   302: istore          22
        //   304: goto            181
        //   307: astore          23
        //   309: aload           23
        //   311: athrow         
        //   312: iconst_0       
        //   313: istore          25
        //   315: goto            203
        //   318: astore          26
        //   320: aload           26
        //   322: athrow         
        //   323: aload           6
        //   325: getfield        com/whatsapp/a_9.q:I
        //   328: istore          27
        //   330: goto            229
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  80     87     255    260    Ljava/lang/NullPointerException;
        //  95     105    270    275    Ljava/lang/NullPointerException;
        //  110    117    275    285    Ljava/lang/NullPointerException;
        //  127    144    285    290    Ljava/lang/NullPointerException;
        //  152    173    296    301    Ljava/lang/NullPointerException;
        //  181    195    307    312    Ljava/lang/NullPointerException;
        //  203    221    318    323    Ljava/lang/NullPointerException;
        //  272    275    275    285    Ljava/lang/NullPointerException;
        //  277    280    280    285    Ljava/lang/NullPointerException;
        //  282    285    285    290    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 161, Size: 161
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
    public void a(final cr p0, final String p1, final String p2, final String p3, final String p4, final long p5, final String p6, final long p7, final String p8, final String p9, final Hashtable p10, final String p11) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          15
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    15: bipush          45
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_1        
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    25: ldc             "/"
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: aload           5
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    35: ldc             "/"
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: lload           6
        //    42: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    45: ldc             "/"
        //    47: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    50: aload           8
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: ldc             "/"
        //    57: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    60: aload           11
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: ldc             "/"
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: lload           9
        //    72: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    75: ldc             "/"
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: aload           12
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    88: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    91: new             Ljava/lang/StringBuilder;
        //    94: dup            
        //    95: invokespecial   java/lang/StringBuilder.<init>:()V
        //    98: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   101: bipush          44
        //   103: aaload         
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: aload           13
        //   109: invokevirtual   java/util/Hashtable.keys:()Ljava/util/Enumeration;
        //   112: invokestatic    java/util/Collections.list:(Ljava/util/Enumeration;)Ljava/util/ArrayList;
        //   115: invokevirtual   java/util/ArrayList.toArray:()[Ljava/lang/Object;
        //   118: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: ldc             "/"
        //   126: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   129: aload           13
        //   131: invokevirtual   java/util/Hashtable.values:()Ljava/util/Collection;
        //   134: invokeinterface java/util/Collection.toArray:()[Ljava/lang/Object;
        //   139: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   148: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   151: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   154: aload_2        
        //   155: invokevirtual   com/whatsapp/vy.i:(Ljava/lang/String;)Z
        //   158: istore          17
        //   160: iload           17
        //   162: ifne            669
        //   165: iconst_1       
        //   166: istore          18
        //   168: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   171: aload           5
        //   173: invokevirtual   com/whatsapp/wc.f:(Ljava/lang/String;)Z
        //   176: istore          21
        //   178: iload           21
        //   180: ifeq            685
        //   183: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   186: aload_1        
        //   187: getfield        com/whatsapp/protocol/cr.d:Ljava/lang/String;
        //   190: invokevirtual   com/whatsapp/wc.f:(Ljava/lang/String;)Z
        //   193: istore          50
        //   195: iload           50
        //   197: ifeq            685
        //   200: iconst_1       
        //   201: istore          22
        //   203: aload           13
        //   205: aload_1        
        //   206: getfield        com/whatsapp/protocol/cr.d:Ljava/lang/String;
        //   209: invokevirtual   java/util/Hashtable.containsKey:(Ljava/lang/Object;)Z
        //   212: istore          24
        //   214: iload           24
        //   216: ifne            696
        //   219: iconst_1       
        //   220: istore          25
        //   222: new             Ljava/lang/StringBuilder;
        //   225: dup            
        //   226: invokespecial   java/lang/StringBuilder.<init>:()V
        //   229: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   232: bipush          47
        //   234: aaload         
        //   235: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   238: iload           18
        //   240: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   243: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   246: bipush          46
        //   248: aaload         
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: iload           22
        //   254: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   257: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   260: bipush          43
        //   262: aaload         
        //   263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   266: iload           25
        //   268: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   271: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   274: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   277: iload           22
        //   279: ifeq            352
        //   282: aload           8
        //   284: invokestatic    com/whatsapp/adc.d:(Ljava/lang/String;)Ljava/lang/String;
        //   287: astore          45
        //   289: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   292: aload           45
        //   294: invokevirtual   com/whatsapp/vy.i:(Ljava/lang/String;)Z
        //   297: ifeq            347
        //   300: getstatic       com/whatsapp/adc.b:Ljava/util/concurrent/ConcurrentHashMap;
        //   303: aload           45
        //   305: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   308: pop            
        //   309: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   312: aload           45
        //   314: aload_2        
        //   315: invokevirtual   com/whatsapp/vy.a:(Ljava/lang/String;Ljava/lang/String;)Z
        //   318: pop            
        //   319: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   322: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   325: aload           45
        //   327: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   330: aload_2        
        //   331: aload           8
        //   333: lload           9
        //   335: invokevirtual   com/whatsapp/wc.a:(Lcom/whatsapp/a_9;Ljava/lang/String;Ljava/lang/String;J)Lcom/whatsapp/a_9;
        //   338: pop            
        //   339: aload           45
        //   341: aload_2        
        //   342: aload           8
        //   344: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   347: iload           15
        //   349: ifeq            435
        //   352: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   355: aload_2        
        //   356: invokevirtual   com/whatsapp/wc.d:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   359: astore          26
        //   361: aload           26
        //   363: ifnonnull       380
        //   366: aload_2        
        //   367: aload           8
        //   369: lload           9
        //   371: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;Ljava/lang/String;J)Lcom/whatsapp/a_9;
        //   374: pop            
        //   375: iload           15
        //   377: ifeq            435
        //   380: aload_2        
        //   381: aload           26
        //   383: getfield        com/whatsapp/a_9.q:I
        //   386: iconst_2       
        //   387: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;II)V
        //   390: aload           26
        //   392: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   395: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   398: aload           8
        //   400: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   403: ifne            435
        //   406: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   409: bipush          48
        //   411: aaload         
        //   412: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   415: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   418: aload_2        
        //   419: aload           11
        //   421: aload           8
        //   423: invokevirtual   com/whatsapp/wc.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   426: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   429: aload_2        
        //   430: aload           8
        //   432: invokevirtual   com/whatsapp/vy.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   435: aload_2        
        //   436: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //   439: astore          28
        //   441: new             Ljava/lang/StringBuilder;
        //   444: dup            
        //   445: invokespecial   java/lang/StringBuilder.<init>:()V
        //   448: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   451: bipush          41
        //   453: aaload         
        //   454: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   457: new             Ljava/util/ArrayList;
        //   460: dup            
        //   461: aload           28
        //   463: invokevirtual   com/whatsapp/atf.l:()Ljava/util/Set;
        //   466: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   469: invokevirtual   java/util/ArrayList.toArray:()[Ljava/lang/Object;
        //   472: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //   475: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   478: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   481: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   484: aload           28
        //   486: invokevirtual   com/whatsapp/atf.h:()Z
        //   489: istore          29
        //   491: aload           28
        //   493: aload           13
        //   495: iconst_0       
        //   496: invokevirtual   com/whatsapp/atf.a:(Ljava/util/Hashtable;Z)Z
        //   499: pop            
        //   500: getstatic       com/whatsapp/adc.d:Ljava/util/concurrent/ConcurrentHashMap;
        //   503: aload_2        
        //   504: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   507: pop            
        //   508: iload           18
        //   510: ifeq            528
        //   513: iconst_0       
        //   514: aload_1        
        //   515: aload_2        
        //   516: aload           8
        //   518: aload           5
        //   520: lload           9
        //   522: invokestatic    com/whatsapp/adc.b:(Lcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/whatsapp/protocol/bi;
        //   525: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   528: aload           13
        //   530: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   533: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //   536: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //   539: invokevirtual   java/util/Hashtable.containsKey:(Ljava/lang/Object;)Z
        //   542: istore          36
        //   544: iload           36
        //   546: ifeq            654
        //   549: iload           22
        //   551: ifne            654
        //   554: iload           29
        //   556: ifne            654
        //   559: iload           25
        //   561: ifne            654
        //   564: new             Ljava/lang/StringBuilder;
        //   567: dup            
        //   568: invokespecial   java/lang/StringBuilder.<init>:()V
        //   571: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   574: bipush          42
        //   576: aaload         
        //   577: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   580: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   583: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //   586: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //   589: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   592: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   595: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   598: new             Ljava/util/Vector;
        //   601: dup            
        //   602: iconst_1       
        //   603: invokespecial   java/util/Vector.<init>:(I)V
        //   606: astore          38
        //   608: aload           38
        //   610: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   613: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //   616: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //   619: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //   622: pop            
        //   623: iload           18
        //   625: ifeq            742
        //   628: aconst_null    
        //   629: astore          41
        //   631: iconst_1       
        //   632: bipush          12
        //   634: aload           41
        //   636: aload_2        
        //   637: aload_1        
        //   638: getfield        com/whatsapp/protocol/cr.d:Ljava/lang/String;
        //   641: aload           38
        //   643: invokestatic    com/whatsapp/adc.a:(ILcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;)Lcom/whatsapp/protocol/bi;
        //   646: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   649: iload           15
        //   651: ifeq            663
        //   654: iload           18
        //   656: ifne            663
        //   659: aload_1        
        //   660: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //   663: return         
        //   664: astore          16
        //   666: aload           16
        //   668: athrow         
        //   669: iconst_0       
        //   670: istore          18
        //   672: goto            168
        //   675: astore          19
        //   677: aload           19
        //   679: athrow         
        //   680: astore          20
        //   682: aload           20
        //   684: athrow         
        //   685: iconst_0       
        //   686: istore          22
        //   688: goto            203
        //   691: astore          23
        //   693: aload           23
        //   695: athrow         
        //   696: iconst_0       
        //   697: istore          25
        //   699: goto            222
        //   702: astore          46
        //   704: aload           46
        //   706: athrow         
        //   707: astore          43
        //   709: aload           43
        //   711: athrow         
        //   712: astore          27
        //   714: aload           27
        //   716: athrow         
        //   717: astore          30
        //   719: aload           30
        //   721: athrow         
        //   722: astore          33
        //   724: aload           33
        //   726: athrow         
        //   727: astore          34
        //   729: aload           34
        //   731: athrow         
        //   732: astore          35
        //   734: aload           35
        //   736: athrow         
        //   737: astore          39
        //   739: aload           39
        //   741: athrow         
        //   742: aload_1        
        //   743: astore          41
        //   745: goto            631
        //   748: astore          42
        //   750: aload           42
        //   752: athrow         
        //   753: astore          37
        //   755: aload           37
        //   757: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  5      160    664    669    Ljava/lang/NullPointerException;
        //  168    178    675    680    Ljava/lang/NullPointerException;
        //  183    195    680    685    Ljava/lang/NullPointerException;
        //  203    214    691    696    Ljava/lang/NullPointerException;
        //  289    347    702    707    Ljava/lang/NullPointerException;
        //  366    375    707    712    Ljava/lang/NullPointerException;
        //  380    435    712    717    Ljava/lang/NullPointerException;
        //  491    508    717    722    Ljava/lang/NullPointerException;
        //  513    528    717    722    Ljava/lang/NullPointerException;
        //  528    544    722    737    Ljava/lang/NullPointerException;
        //  608    623    737    742    Ljava/lang/NullPointerException;
        //  631    649    748    753    Ljava/lang/NullPointerException;
        //  659    663    753    758    Ljava/lang/NullPointerException;
        //  677    680    680    685    Ljava/lang/NullPointerException;
        //  709    712    712    717    Ljava/lang/NullPointerException;
        //  724    727    727    737    Ljava/lang/NullPointerException;
        //  729    732    732    737    Ljava/lang/NullPointerException;
        //  750    753    753    758    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 338, Size: 338
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
    public void a(final cr p0, final Hashtable p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    15: iconst_5       
        //    16: aaload         
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: aload_1        
        //    21: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    24: ldc             "/"
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: aload_2        
        //    30: invokevirtual   java/util/Hashtable.values:()Ljava/util/Collection;
        //    33: invokeinterface java/util/Collection.toArray:()[Ljava/lang/Object;
        //    38: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    47: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    50: aload_1        
        //    51: getfield        com/whatsapp/protocol/cr.a:Ljava/lang/String;
        //    54: astore          5
        //    56: getstatic       com/whatsapp/adc.d:Ljava/util/concurrent/ConcurrentHashMap;
        //    59: aload           5
        //    61: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    64: pop            
        //    65: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    68: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    71: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //    74: astore          7
        //    76: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    79: aload           5
        //    81: invokevirtual   com/whatsapp/wc.c:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    84: astore          8
        //    86: aload           5
        //    88: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //    91: astore          9
        //    93: aload           8
        //    95: ifnull          123
        //    98: aload           9
        //   100: invokevirtual   com/whatsapp/atf.h:()Z
        //   103: istore          24
        //   105: iload           24
        //   107: ifne            162
        //   110: aload_2        
        //   111: aload           7
        //   113: invokevirtual   java/util/Hashtable.containsKey:(Ljava/lang/Object;)Z
        //   116: istore          25
        //   118: iload           25
        //   120: ifne            162
        //   123: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   126: bipush          6
        //   128: aaload         
        //   129: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   132: aload           5
        //   134: invokestatic    com/whatsapp/App.c:(Ljava/lang/String;)V
        //   137: aload           8
        //   139: ifnonnull       339
        //   142: iconst_0       
        //   143: istore          11
        //   145: aload           5
        //   147: iload           11
        //   149: iconst_2       
        //   150: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;II)V
        //   153: aload_1        
        //   154: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //   157: iload           4
        //   159: ifeq            323
        //   162: new             Ljava/util/Vector;
        //   165: dup            
        //   166: invokespecial   java/util/Vector.<init>:()V
        //   169: astore          12
        //   171: aload_2        
        //   172: invokevirtual   java/util/Hashtable.entrySet:()Ljava/util/Set;
        //   175: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   180: astore          13
        //   182: aload           13
        //   184: invokeinterface java/util/Iterator.hasNext:()Z
        //   189: ifeq            261
        //   192: aload           13
        //   194: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   199: checkcast       Ljava/util/Map$Entry;
        //   202: astore          17
        //   204: aload           17
        //   206: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   211: checkcast       Ljava/lang/String;
        //   214: astore          18
        //   216: aload           17
        //   218: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   223: checkcast       Ljava/lang/String;
        //   226: astore          19
        //   228: aload           12
        //   230: aload           18
        //   232: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //   235: pop            
        //   236: aload           9
        //   238: aload           18
        //   240: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   243: bipush          7
        //   245: aaload         
        //   246: aload           19
        //   248: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   251: iconst_0       
        //   252: invokevirtual   com/whatsapp/atf.a:(Ljava/lang/String;ZZ)Lcom/whatsapp/wh;
        //   255: pop            
        //   256: iload           4
        //   258: ifeq            182
        //   261: aload_1        
        //   262: getfield        com/whatsapp/protocol/cr.d:Ljava/lang/String;
        //   265: astore          14
        //   267: aload           14
        //   269: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   272: ifeq            349
        //   275: aload           9
        //   277: invokevirtual   com/whatsapp/atf.i:()Ljava/util/ArrayList;
        //   280: astore          16
        //   282: aload           16
        //   284: invokevirtual   java/util/ArrayList.size:()I
        //   287: iconst_1       
        //   288: if_icmpne       349
        //   291: aload           16
        //   293: iconst_0       
        //   294: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   297: checkcast       Lcom/whatsapp/wh;
        //   300: getfield        com/whatsapp/wh.c:Ljava/lang/String;
        //   303: astore          15
        //   305: iconst_1       
        //   306: bipush          12
        //   308: aload_1        
        //   309: aload           5
        //   311: aload           15
        //   313: aload           12
        //   315: aload           9
        //   317: invokestatic    com/whatsapp/adc.a:(ILcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;Lcom/whatsapp/atf;)Lcom/whatsapp/protocol/bi;
        //   320: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   323: return         
        //   324: astore          22
        //   326: aload           22
        //   328: athrow         
        //   329: astore          23
        //   331: aload           23
        //   333: athrow         
        //   334: astore          10
        //   336: aload           10
        //   338: athrow         
        //   339: aload           8
        //   341: getfield        com/whatsapp/a_9.q:I
        //   344: istore          11
        //   346: goto            145
        //   349: aload           14
        //   351: astore          15
        //   353: goto            305
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  98     105    324    329    Ljava/lang/NullPointerException;
        //  110    118    329    334    Ljava/lang/NullPointerException;
        //  123    137    334    339    Ljava/lang/NullPointerException;
        //  326    329    329    334    Ljava/lang/NullPointerException;
        //  331    334    334    339    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 153, Size: 153
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
    public void a(final cr p0, final Vector p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    15: bipush          40
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_1        
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    25: ldc             "/"
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: aload_2        
        //    31: invokevirtual   java/util/Vector.toArray:()[Ljava/lang/Object;
        //    34: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    43: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    46: aload_1        
        //    47: getfield        com/whatsapp/protocol/cr.a:Ljava/lang/String;
        //    50: astore          5
        //    52: aload           5
        //    54: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //    57: astore          6
        //    59: aload_2        
        //    60: invokevirtual   java/util/Vector.iterator:()Ljava/util/Iterator;
        //    63: astore          7
        //    65: iconst_0       
        //    66: istore          8
        //    68: aload           7
        //    70: invokeinterface java/util/Iterator.hasNext:()Z
        //    75: ifeq            232
        //    78: aload           7
        //    80: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    85: checkcast       Ljava/lang/String;
        //    88: astore          11
        //    90: aload           6
        //    92: aload           11
        //    94: invokevirtual   com/whatsapp/atf.a:(Ljava/lang/String;)Lcom/whatsapp/wh;
        //    97: astore          12
        //    99: aload           12
        //   101: ifnonnull       225
        //   104: aload           6
        //   106: aload           11
        //   108: iconst_1       
        //   109: iconst_0       
        //   110: invokevirtual   com/whatsapp/atf.a:(Ljava/lang/String;ZZ)Lcom/whatsapp/wh;
        //   113: astore          13
        //   115: iload           4
        //   117: ifeq            218
        //   120: aload           13
        //   122: iconst_1       
        //   123: putfield        com/whatsapp/wh.b:Z
        //   126: aload           13
        //   128: astore          15
        //   130: aload           15
        //   132: invokevirtual   com/whatsapp/wh.a:()Z
        //   135: ifeq            211
        //   138: iconst_1       
        //   139: istore          9
        //   141: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   144: aload           5
        //   146: aload           15
        //   148: invokevirtual   com/whatsapp/vy.a:(Ljava/lang/String;Lcom/whatsapp/wh;)V
        //   151: iload           4
        //   153: ifeq            204
        //   156: iload           9
        //   158: ifeq            183
        //   161: iconst_1       
        //   162: bipush          15
        //   164: aload_1        
        //   165: aload           5
        //   167: aload_1        
        //   168: getfield        com/whatsapp/protocol/cr.d:Ljava/lang/String;
        //   171: aload_2        
        //   172: invokestatic    com/whatsapp/adc.a:(ILcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;)Lcom/whatsapp/protocol/bi;
        //   175: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   178: iload           4
        //   180: ifeq            193
        //   183: aload_1        
        //   184: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //   187: iconst_4       
        //   188: aload           5
        //   190: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   193: return         
        //   194: astore          14
        //   196: aload           14
        //   198: athrow         
        //   199: astore          10
        //   201: aload           10
        //   203: athrow         
        //   204: iload           9
        //   206: istore          8
        //   208: goto            68
        //   211: iload           8
        //   213: istore          9
        //   215: goto            141
        //   218: aload           13
        //   220: astore          15
        //   222: goto            130
        //   225: aload           12
        //   227: astore          13
        //   229: goto            120
        //   232: iload           8
        //   234: istore          9
        //   236: goto            156
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  120    126    194    199    Ljava/lang/NullPointerException;
        //  161    178    199    204    Ljava/lang/NullPointerException;
        //  183    193    199    204    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0183:
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
    
    @Override
    public void a(final cr p0, final Vector p1, final String p2, final String p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          6
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    15: bipush          54
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_1        
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    25: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    28: bipush          53
        //    30: aaload         
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: aload_2        
        //    35: invokevirtual   java/util/Vector.toArray:()[Ljava/lang/Object;
        //    38: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    47: bipush          55
        //    49: aaload         
        //    50: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    53: aload_3        
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    60: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    63: aload_1        
        //    64: getfield        com/whatsapp/protocol/cr.a:Ljava/lang/String;
        //    67: astore          7
        //    69: getstatic       com/whatsapp/adc.d:Ljava/util/concurrent/ConcurrentHashMap;
        //    72: aload           7
        //    74: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    77: pop            
        //    78: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    81: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    84: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //    87: astore          9
        //    89: getstatic       com/whatsapp/ha.a:Ljava/util/concurrent/ExecutorService;
        //    92: new             Lcom/whatsapp/fu;
        //    95: dup            
        //    96: aload_0        
        //    97: aload           9
        //    99: aload           7
        //   101: invokespecial   com/whatsapp/fu.<init>:(Lcom/whatsapp/adc;Ljava/lang/String;Ljava/lang/String;)V
        //   104: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
        //   109: pop            
        //   110: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   113: aload           7
        //   115: invokevirtual   com/whatsapp/wc.c:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   118: astore          11
        //   120: aload_3        
        //   121: ifnull          137
        //   124: aload_3        
        //   125: aload           9
        //   127: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   130: istore          42
        //   132: iload           42
        //   134: ifeq            184
        //   137: aload_2        
        //   138: invokevirtual   java/util/Vector.size:()I
        //   141: istore          18
        //   143: iload           18
        //   145: iconst_1       
        //   146: if_icmpne       184
        //   149: aload_2        
        //   150: iconst_0       
        //   151: invokevirtual   java/util/Vector.get:(I)Ljava/lang/Object;
        //   154: aload           9
        //   156: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   159: istore          40
        //   161: iload           40
        //   163: ifeq            184
        //   166: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   169: bipush          50
        //   171: aaload         
        //   172: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   175: aload_1        
        //   176: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //   179: iload           6
        //   181: ifeq            432
        //   184: aload           11
        //   186: ifnull          204
        //   189: aload           7
        //   191: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //   194: invokevirtual   com/whatsapp/atf.h:()Z
        //   197: istore          39
        //   199: iload           39
        //   201: ifne            243
        //   204: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   207: bipush          51
        //   209: aaload         
        //   210: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   213: aload           7
        //   215: invokestatic    com/whatsapp/App.c:(Ljava/lang/String;)V
        //   218: aload           11
        //   220: ifnonnull       526
        //   223: iconst_0       
        //   224: istore          19
        //   226: aload           7
        //   228: iload           19
        //   230: iconst_2       
        //   231: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;II)V
        //   234: aload_1        
        //   235: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //   238: iload           6
        //   240: ifeq            432
        //   243: aload           7
        //   245: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //   248: astore          23
        //   250: aload           23
        //   252: invokevirtual   com/whatsapp/atf.e:()V
        //   255: new             Ljava/util/Vector;
        //   258: dup            
        //   259: aload_2        
        //   260: invokevirtual   java/util/Vector.size:()I
        //   263: invokespecial   java/util/Vector.<init>:(I)V
        //   266: astore          24
        //   268: aload_2        
        //   269: invokevirtual   java/util/Vector.iterator:()Ljava/util/Iterator;
        //   272: astore          25
        //   274: aload           25
        //   276: invokeinterface java/util/Iterator.hasNext:()Z
        //   281: ifeq            340
        //   284: aload           25
        //   286: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   291: checkcast       Ljava/lang/String;
        //   294: astore          35
        //   296: aload           23
        //   298: aload           35
        //   300: invokevirtual   com/whatsapp/atf.b:(Ljava/lang/String;)Lcom/whatsapp/wh;
        //   303: ifnull          314
        //   306: aload           24
        //   308: aload           35
        //   310: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //   313: pop            
        //   314: aload           9
        //   316: aload           35
        //   318: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   321: ifeq            335
        //   324: getstatic       com/whatsapp/dt.c:Lcom/whatsapp/dt;
        //   327: aload           11
        //   329: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   332: invokevirtual   com/whatsapp/dt.c:(Ljava/lang/String;)V
        //   335: iload           6
        //   337: ifeq            274
        //   340: iconst_0       
        //   341: istore          26
        //   343: aload_3        
        //   344: ifnull          385
        //   347: aload           24
        //   349: aload_3        
        //   350: invokevirtual   java/util/Vector.contains:(Ljava/lang/Object;)Z
        //   353: istore          33
        //   355: iconst_0       
        //   356: istore          26
        //   358: iload           33
        //   360: ifeq            385
        //   363: aload           24
        //   365: aload_3        
        //   366: invokevirtual   java/util/Vector.remove:(Ljava/lang/Object;)Z
        //   369: pop            
        //   370: iconst_1       
        //   371: iconst_5       
        //   372: aload_1        
        //   373: aload           7
        //   375: aload_3        
        //   376: invokestatic    com/whatsapp/adc.a:(ILcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/protocol/bi;
        //   379: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   382: iconst_1       
        //   383: istore          26
        //   385: aload           24
        //   387: invokevirtual   java/util/Vector.isEmpty:()Z
        //   390: istore          29
        //   392: iload           29
        //   394: ifne            423
        //   397: aload_3        
        //   398: ifnonnull       561
        //   401: bipush          13
        //   403: istore          31
        //   405: iconst_1       
        //   406: iload           31
        //   408: aload_1        
        //   409: aload           7
        //   411: aload_3        
        //   412: aload           24
        //   414: invokestatic    com/whatsapp/adc.a:(ILcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;)Lcom/whatsapp/protocol/bi;
        //   417: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   420: iconst_1       
        //   421: istore          26
        //   423: iload           26
        //   425: ifne            432
        //   428: aload_1        
        //   429: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //   432: aload           11
        //   434: ifnull          490
        //   437: aload           4
        //   439: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   442: istore          22
        //   444: iload           22
        //   446: ifne            490
        //   449: aload           11
        //   451: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   454: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   457: ifeq            490
        //   460: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //   463: bipush          52
        //   465: aaload         
        //   466: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   469: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   472: aload           7
        //   474: aconst_null    
        //   475: aload           4
        //   477: invokevirtual   com/whatsapp/wc.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   480: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   483: aload           7
        //   485: aload           4
        //   487: invokevirtual   com/whatsapp/vy.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   490: return         
        //   491: astore          41
        //   493: aload           41
        //   495: athrow         
        //   496: astore          12
        //   498: aload           12
        //   500: athrow         
        //   501: astore          13
        //   503: aload           13
        //   505: athrow         
        //   506: astore          14
        //   508: aload           14
        //   510: athrow         
        //   511: astore          15
        //   513: aload           15
        //   515: athrow         
        //   516: astore          16
        //   518: aload           16
        //   520: athrow         
        //   521: astore          17
        //   523: aload           17
        //   525: athrow         
        //   526: aload           11
        //   528: getfield        com/whatsapp/a_9.q:I
        //   531: istore          19
        //   533: goto            226
        //   536: astore          36
        //   538: aload           36
        //   540: athrow         
        //   541: astore          37
        //   543: aload           37
        //   545: athrow         
        //   546: astore          32
        //   548: aload           32
        //   550: athrow         
        //   551: astore          27
        //   553: aload           27
        //   555: athrow         
        //   556: astore          28
        //   558: aload           28
        //   560: athrow         
        //   561: bipush          14
        //   563: istore          31
        //   565: goto            405
        //   568: astore          30
        //   570: aload           30
        //   572: athrow         
        //   573: astore          20
        //   575: aload           20
        //   577: athrow         
        //   578: astore          21
        //   580: aload           21
        //   582: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  124    132    491    496    Ljava/lang/NullPointerException;
        //  137    143    496    501    Ljava/lang/NullPointerException;
        //  149    161    501    506    Ljava/lang/NullPointerException;
        //  166    179    506    516    Ljava/lang/NullPointerException;
        //  189    199    516    521    Ljava/lang/NullPointerException;
        //  204    218    521    526    Ljava/lang/NullPointerException;
        //  296    314    536    541    Ljava/lang/NullPointerException;
        //  314    335    541    546    Ljava/lang/NullPointerException;
        //  347    355    546    551    Ljava/lang/NullPointerException;
        //  385    392    551    561    Ljava/lang/NullPointerException;
        //  428    432    568    573    Ljava/lang/NullPointerException;
        //  437    444    573    578    Ljava/lang/NullPointerException;
        //  449    490    578    583    Ljava/lang/NullPointerException;
        //  493    496    496    501    Ljava/lang/NullPointerException;
        //  498    501    501    506    Ljava/lang/NullPointerException;
        //  503    506    506    516    Ljava/lang/NullPointerException;
        //  508    511    511    516    Ljava/lang/NullPointerException;
        //  513    516    516    521    Ljava/lang/NullPointerException;
        //  518    521    521    526    Ljava/lang/NullPointerException;
        //  553    556    556    561    Ljava/lang/NullPointerException;
        //  575    578    578    583    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 271, Size: 271
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
    public void a(final String s) {
        Log.i(adc.z[76] + s);
    }
    
    @Override
    public void a(final String s, final String s2, final long n, final String s3, final long n2, final String s4, final String s5, final long n3, final Hashtable hashtable) {
        Log.i(adc.z[67] + s + adc.z[73] + s2 + adc.z[65] + n + adc.z[69] + s4 + adc.z[66] + s3 + adc.z[71] + n2 + adc.z[68] + s5 + adc.z[72] + n3);
        Log.i(adc.z[70] + Arrays.deepToString(Collections.list((Enumeration<Object>)hashtable.keys()).toArray()) + "/" + Arrays.deepToString(hashtable.values().toArray()));
        this.c(s, s2, n, s3, n2, s4, s5, n3, hashtable);
        App.a5.b(s);
    }
    
    @Override
    public void a(final String s, final String s2, final long n, final String s3, final long n2, final String s4, final String s5, final Hashtable hashtable, final Hashtable hashtable2) {
        try {
            Log.i(adc.z[39] + s + "/" + s2 + "/" + n + "/" + s3 + "/" + s4 + "/" + n2 + "/" + s5 + "/" + Arrays.deepToString(hashtable.keySet().toArray()));
            if (hashtable2 == null) {
                return;
            }
            final Hashtable hashtable3 = hashtable2;
            final int n3 = hashtable3.size();
            if (n3 > 0) {
                final int n4 = 36;
                final Hashtable hashtable4 = hashtable2;
                a(n4, hashtable4);
            }
            return;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final Hashtable hashtable3 = hashtable2;
            final int n3 = hashtable3.size();
            if (n3 > 0) {
                final int n4 = 36;
                final Hashtable hashtable4 = hashtable2;
                a(n4, hashtable4);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    @Override
    public void a(final String s, final String s2, final String[] array) {
        Log.i(adc.z[11] + s + adc.z[10] + s2 + adc.z[12] + Arrays.deepToString(array));
        if (!z8.b(s)) {
            final Vector n = new Vector(array.length);
            n.addAll(Arrays.asList(array));
            final bi bi = new bi(s, s2, null);
            bi.u = App.m();
            bi.c = 6;
            bi.L = 9L;
            bi.N = n;
            bi.t = App.S.e().u;
            App.ak.g(bi);
            a(s, n);
        }
        try {
            if (App.S.d(s) == null) {
                z8.a(s, s2, System.currentTimeMillis());
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    @Override
    public void a(final String s, final Hashtable hashtable, final Hashtable hashtable2) {
        try {
            Log.i(adc.z[32] + s + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
            if (hashtable2 == null) {
                return;
            }
            final Hashtable hashtable3 = hashtable2;
            final int n = hashtable3.size();
            if (n > 0) {
                final int n2 = 37;
                final Hashtable hashtable4 = hashtable2;
                a(n2, hashtable4);
            }
            return;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final Hashtable hashtable3 = hashtable2;
            final int n = hashtable3.size();
            if (n > 0) {
                final int n2 = 37;
                final Hashtable hashtable4 = hashtable2;
                a(n2, hashtable4);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    @Override
    public void a(final Vector p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/adc.z:[Ljava/lang/String;
        //    14: bipush          38
        //    16: aaload         
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: aload_1        
        //    21: invokevirtual   java/util/Vector.toArray:()[Ljava/lang/Object;
        //    24: invokestatic    java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    33: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    36: invokestatic    com/whatsapp/z8.j:()Ljava/util/ArrayList;
        //    39: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    42: astore_3       
        //    43: aload_3        
        //    44: invokeinterface java/util/Iterator.hasNext:()Z
        //    49: ifeq            205
        //    52: aload_3        
        //    53: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    58: checkcast       Ljava/lang/String;
        //    61: astore          6
        //    63: aload           6
        //    65: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //    68: ifeq            201
        //    71: aload_1        
        //    72: aload           6
        //    74: invokevirtual   java/util/Vector.contains:(Ljava/lang/Object;)Z
        //    77: istore          8
        //    79: iload           8
        //    81: ifne            201
        //    84: aload           6
        //    86: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //    89: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    92: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    95: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //    98: invokevirtual   com/whatsapp/atf.b:(Ljava/lang/String;)Lcom/whatsapp/wh;
        //   101: pop            
        //   102: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   105: aload           6
        //   107: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   110: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //   113: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //   116: invokevirtual   com/whatsapp/vy.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   119: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   122: aload           6
        //   124: invokevirtual   com/whatsapp/wc.c:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   127: ifnonnull       149
        //   130: new             Lcom/whatsapp/a_9;
        //   133: dup            
        //   134: aload           6
        //   136: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //   139: astore          10
        //   141: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   144: aload           10
        //   146: invokevirtual   com/whatsapp/wc.m:(Lcom/whatsapp/a_9;)V
        //   149: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   152: aload           6
        //   154: invokevirtual   com/whatsapp/vy.e:(Ljava/lang/String;)Lcom/whatsapp/asz;
        //   157: astore          11
        //   159: aload           11
        //   161: getfield        com/whatsapp/asz.a:Ljava/lang/String;
        //   164: astore          14
        //   166: aload           14
        //   168: ifnull          201
        //   171: aload           11
        //   173: getfield        com/whatsapp/asz.b:Ljava/lang/Long;
        //   176: ifnull          201
        //   179: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   182: aload           6
        //   184: aconst_null    
        //   185: aload           11
        //   187: getfield        com/whatsapp/asz.a:Ljava/lang/String;
        //   190: aload           11
        //   192: getfield        com/whatsapp/asz.b:Ljava/lang/Long;
        //   195: invokevirtual   java/lang/Long.longValue:()J
        //   198: invokevirtual   com/whatsapp/wc.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
        //   201: iload_2        
        //   202: ifeq            43
        //   205: iconst_0       
        //   206: putstatic       com/whatsapp/adc.e:Z
        //   209: iconst_0       
        //   210: invokestatic    com/whatsapp/adc.a:(Z)V
        //   213: getstatic       com/whatsapp/adc.a:Z
        //   216: ifeq            226
        //   219: iconst_0       
        //   220: putstatic       com/whatsapp/adc.a:Z
        //   223: invokestatic    com/whatsapp/App.aW:()V
        //   226: getstatic       com/whatsapp/App.av:Landroid/os/Handler;
        //   229: iconst_0       
        //   230: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   233: pop            
        //   234: return         
        //   235: astore          7
        //   237: aload           7
        //   239: athrow         
        //   240: astore          12
        //   242: aload           12
        //   244: athrow         
        //   245: astore          13
        //   247: aload           13
        //   249: athrow         
        //   250: astore          4
        //   252: aload           4
        //   254: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  63     79     235    240    Ljava/lang/NullPointerException;
        //  159    166    240    245    Ljava/lang/NullPointerException;
        //  171    201    245    250    Ljava/lang/NullPointerException;
        //  205    226    250    255    Ljava/lang/NullPointerException;
        //  242    245    245    250    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 108, Size: 108
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
    public void a(final Vector vector, final Hashtable hashtable) {
    }
    
    @Override
    public void b(final cr cr) {
    }
    
    @Override
    public void b(final cr cr, final Vector vector, final String s) {
        final boolean i = App.I;
        Log.i(adc.z[49] + cr + "/" + Arrays.deepToString(vector.toArray()));
        final String a = cr.a;
        final atf a2 = a(a);
        final Iterator<String> iterator = vector.iterator();
    Label_0117_Outer:
        while (true) {
            while (true) {
                final wh a3;
                Label_0138: {
                    if (!iterator.hasNext()) {
                        break Label_0138;
                    }
                    final String s2 = iterator.next();
                    a3 = a2.a(s2);
                    if (a3 != null) {
                        break Label_0138;
                    }
                    final wh a4 = a2.a(s2, false, false);
                    Label_0123: {
                        if (!i) {
                            break Label_0123;
                        }
                        try {
                            a4.b = false;
                            App.ak.a(a, a4);
                            if (i) {
                                App.b(cr);
                                a(4, a);
                                return;
                            }
                            continue Label_0117_Outer;
                        }
                        catch (NullPointerException ex) {
                            throw ex;
                        }
                    }
                }
                final wh a4 = a3;
                continue;
            }
        }
    }
    
    @Override
    public void b(final String s, final String s2, final long n, final String s3, final long n2, final String s4, final String s5, final long n3, final Hashtable hashtable) {
        Log.i(adc.z[25] + s + adc.z[29] + s2 + adc.z[28] + n + adc.z[26] + s4 + adc.z[22] + s3 + adc.z[27] + n2 + adc.z[30] + s5 + adc.z[23] + n3);
        Log.i(adc.z[24] + Arrays.deepToString(Collections.list((Enumeration<Object>)hashtable.keys()).toArray()) + "/" + Arrays.deepToString(hashtable.values().toArray()));
        this.c(s, s2, n, s3, n2, s4, s5, n3, hashtable);
    }
    
    @Override
    public void b(final String s, final Hashtable hashtable, final Hashtable hashtable2) {
        try {
            Log.i(adc.z[8] + s + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
            if (hashtable2 == null) {
                return;
            }
            final Hashtable hashtable3 = hashtable2;
            final int n = hashtable3.size();
            if (n > 0) {
                final int n2 = 39;
                final Hashtable hashtable4 = hashtable2;
                a(n2, hashtable4);
            }
            return;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final Hashtable hashtable3 = hashtable2;
            final int n = hashtable3.size();
            if (n > 0) {
                final int n2 = 39;
                final Hashtable hashtable4 = hashtable2;
                a(n2, hashtable4);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    @Override
    public void b(final Vector vector) {
        final boolean i = App.I;
        Log.i(adc.z[37] + Arrays.deepToString(vector.toArray()));
        final String u = App.S.e().u;
        for (final String s : vector) {
            adc.d.remove(s);
            a(s).b(u);
            dt.c.c(s);
            a(1, a(5, null, s, u));
            if (i) {
                break;
            }
        }
    }
    
    public void c() {
        adc.d.clear();
    }
    
    @Override
    public void c(final String s, final Hashtable hashtable, final Hashtable hashtable2) {
        try {
            Log.i(adc.z[4] + s + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
            if (hashtable2 == null) {
                return;
            }
            final Hashtable hashtable3 = hashtable2;
            final int n = hashtable3.size();
            if (n > 0) {
                final int n2 = 38;
                final Hashtable hashtable4 = hashtable2;
                a(n2, hashtable4);
            }
            return;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final Hashtable hashtable3 = hashtable2;
            final int n = hashtable3.size();
            if (n > 0) {
                final int n2 = 38;
                final Hashtable hashtable4 = hashtable2;
                a(n2, hashtable4);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    @Override
    public void d(final String s, final Hashtable hashtable, final Hashtable hashtable2) {
        try {
            Log.i(adc.z[19] + s + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
            if (hashtable2 == null) {
                return;
            }
            final Hashtable hashtable3 = hashtable2;
            final int n = hashtable3.size();
            if (n > 0) {
                final int n2 = 36;
                final Hashtable hashtable4 = hashtable2;
                a(n2, hashtable4);
            }
            return;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final Hashtable hashtable3 = hashtable2;
            final int n = hashtable3.size();
            if (n > 0) {
                final int n2 = 36;
                final Hashtable hashtable4 = hashtable2;
                a(n2, hashtable4);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
}
