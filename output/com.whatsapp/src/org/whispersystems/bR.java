// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.hA;
import com.google.by;
import com.google.bl;
import com.google.ch;

public final class bR
{
    private static ch a;
    private static ch b;
    private static bl c;
    private static ch d;
    private static by e;
    private static bl f;
    private static bl g;
    public static int h;
    private static bl i;
    private static ch j;
    private static bl k;
    private static ch l;
    
    static {
        final String[] array = new String[2];
        String s = "\t$k\u0013\u001epMY\t#fEH+\u0005lIS\u0018\u0018o\u0013L\t\u0018wR.q\u0003fEH\b\u0012`HN\u001eUa72,\u001fjNL\u001e\u0005NXO\b\u0016dX.i}\tO]\u000f\u0014kXH0\u0012z%=[v+1.t}\u0004^S\u000e\u0019wXNcu#<\u0014ve\u001473\u000b\u0005fKU\u0014\u0002p~S\u000e\u0019wXNct#<\u0014ve\u001176\u0018\u001esUY\t\u0003fEHcs#<\u0014wU\u008c<6o'qXw\u001e\u000eTUU\b\u0007fOq\u001e\u0004p\\[\u001ee\u001572\t\u0012dTO\u000f\u0005bIU\u0014\u0019JY$~W\u0002\u00151ig\t5L\t\u0012HXE2\u0013\u001b<\u001cz_\u000e/*qypT[\u0015\u0012gmN\u001e<fDu\u001fo\u0005\u001d=Sz\u001126|\u0015bNY0\u0012z%>[v+1.h}\bTX\u001e\u0019wTH\u0002<fD$xW\u0002\u00150ix\t:Q\u001e\u0004p\\[\u001eo\u0007\u001d=S{!I6i<fDy\u0003\u0014k\\R\u001c\u0012NXO\b\u0016dX.q}\u0001TXcv#<\u0014ve\f7;\u0019\u0016pXw\u001e\u000e\u001b?\u001cz_\u000f/.q}q\\H\u0018\u001ffIw\u001e\u000e\u001b>\u001cz_\u000f//q|jYY\u0015\u0003jIE0\u0012z%8[v+1.c}\u0013_]\b\u0012HXE(\u001edS]\u000f\u0002qX$~W";
        int n = -1;
        String[] array2 = array;
        int n2 = 0;
        String intern = null;
    Label_0176:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'w';
                        break;
                    }
                    case 0: {
                        c2 = '\u0003';
                        break;
                    }
                    case 1: {
                        c2 = '=';
                        break;
                    }
                    case 2: {
                        c2 = '<';
                        break;
                    }
                    case 3: {
                        c2 = '{';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    n2 = 1;
                    array2 = array;
                    s = "\u0002\u00150Y2\t-o\u001e\u0019gXN0\u0012zpY\b\u0004bZYi}\t?U\u001fo\u0002\u001d=Sz\u0011,6r\u001ewXN\u001a\u0003jRRcu#<\u0014ve\u001176\u0018\u001esUY\t\u0003fEHct#<\u0014wU`7 (\u0012mYY\t<fDx\u0012\u0004wOU\u0019\u0002wTS\u0015:fNO\u001a\u0010f/6qujY$zW\u0002\u00151if\t4U\u000f\u0012q\\H\u0012\u0018m%>[v+0.k}\u000b^T\u001a\u001emvY\u0002o\u0000\u001d=S{\u0011/6q\u0004jZR\u0012\u0019dvY\u0002o\u0007\u001d=S{A\n6]\u0018qZ\u0012\f\u001fjNL\u001e\u0005pDO\u000f\u0012nN\u0012\u0017\u001ea\\D\u0014\u001blIPU\u0007qRH\u0014\u0014lQ~v kTO\u000b\u0012qmN\u0014\u0003lN";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0176;
                }
            }
        }
        array2[n2] = intern;
        by.a(array, new by[0], new U());
    }
    
    static bl a(final bl g) {
        return bR.g = g;
    }
    
    static by a(final by e) {
        return bR.e = e;
    }
    
    static ch a() {
        return bR.l;
    }
    
    static ch a(final ch l) {
        return bR.l = l;
    }
    
    static bl b(final bl k) {
        return bR.k = k;
    }
    
    static ch b() {
        return bR.a;
    }
    
    static ch b(final ch a) {
        return bR.a = a;
    }
    
    static bl c() {
        return bR.g;
    }
    
    static bl c(final bl i) {
        return bR.i = i;
    }
    
    static ch c(final ch b) {
        return bR.b = b;
    }
    
    static bl d() {
        return bR.i;
    }
    
    static bl d(final bl c) {
        return bR.c = c;
    }
    
    static ch d(final ch j) {
        return bR.j = j;
    }
    
    static bl e(final bl f) {
        return bR.f = f;
    }
    
    static ch e() {
        return bR.j;
    }
    
    static ch e(final ch d) {
        return bR.d = d;
    }
    
    static bl f() {
        return bR.c;
    }
    
    static bl g() {
        return bR.k;
    }
    
    static bl h() {
        return bR.f;
    }
    
    static ch i() {
        return bR.d;
    }
    
    public static by j() {
        return bR.e;
    }
    
    static ch k() {
        return bR.b;
    }
}
