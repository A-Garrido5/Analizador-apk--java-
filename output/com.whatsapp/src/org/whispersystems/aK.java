// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import java.security.InvalidKeyException;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class aK
{
    public static final Object a;
    private static final String[] z;
    private final V b;
    private final Q c;
    private final M d;
    private final i e;
    
    static {
        final String[] z2 = new String[9];
        String s = "\u0013\ru=G\u0006\u001a\t\\k\u0002)Bvm</";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0004';
                        break;
                    }
                    case 0: {
                        c2 = 'R';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0013\ru=G\u0010\u000b\tBO\u0011\u001b\u0013Be6,O|c";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001c'\u0006de>!B2w7;U{k<;\b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001f-Uae5-\u0006da ;O}jrmB>$0=R2w7;U{k<hPwv!!I|$w,";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0007&O|m&!G~m(-B2w7;U{k<i";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001c'\u0006aa!;O}jr.I`>r";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0000-Ewm$-B2i7;Usc7hQ{p:hI~`r+Igj&-T($";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u001d>C`$`x\u0016\"$?-Uae5-U2m<<I2p:-\u0006tq&=Tw%";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "rd\u0006";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a = new Object();
    }
    
    public aK(final i e, final M d, final a4 a4, final a5 a5, final V b) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = new Q(e, d, a4, a5, b);
    }
    
    private Cipher a(final int n, final SecretKeySpec secretKeySpec, final int n2) {
        try {
            final Cipher instance = Cipher.getInstance(aK.z[0]);
            final byte[] array = new byte[16];
            m.a(array, 0, n2);
            instance.init(n, secretKeySpec, new IvParameterSpec(array));
            return instance;
        }
        catch (InvalidAlgorithmParameterException ex) {}
        catch (NoSuchAlgorithmException ex2) {
            goto Label_0045;
        }
        catch (NoSuchPaddingException ex2) {
            goto Label_0045;
        }
        catch (InvalidKeyException ex2) {
            goto Label_0045;
        }
    }
    
    private Cipher a(final int n, final SecretKeySpec secretKeySpec, final IvParameterSpec ivParameterSpec) {
        try {
            final Cipher instance = Cipher.getInstance(aK.z[1]);
            instance.init(n, secretKeySpec, ivParameterSpec);
            return instance;
        }
        catch (InvalidAlgorithmParameterException ex) {}
        catch (NoSuchAlgorithmException ex2) {
            goto Label_0023;
        }
        catch (NoSuchPaddingException ex2) {
            goto Label_0023;
        }
        catch (InvalidKeyException ex2) {
            goto Label_0023;
        }
    }
    
    private J a(final aL al, final ak ak) {
        try {
            if (al.c(ak)) {
                return al.b(ak);
            }
            final g a = al.b().a(ak, al.m());
            final w a2 = s.a();
            final g a3 = ((ao)a.a()).a(ak, a2);
            al.a((ao)a3.a());
            al.b(ak, (J)a.b());
            al.b(Math.max(-1 + al.a().c(), 0));
            al.a(a2, (J)a3.b());
            return (J)a.b();
        }
        catch (aA aa) {
            throw new I(aa);
        }
    }
    
    private O a(final aL al, final ak ak, J a, final int n) {
        final int a2 = aA.a;
        if (a.c() > n) {
            if (al.a(ak, n)) {
                return al.b(ak, n);
            }
            throw new b(aK.z[6] + a.c() + aK.z[8] + n);
        }
        else {
            if (n - a.c() > 2000) {
                throw new I(aK.z[7]);
            }
            while (a.c() < n) {
                al.a(ak, a.d());
                a = a.a();
                if (a2 != 0) {
                    break;
                }
            }
            al.a(ak, a.a());
            return a.d();
        }
    }
    
    private byte[] a(final int n, final O o, final byte[] array) {
        Label_0026: {
            if (n < 3) {
                break Label_0026;
            }
            try {
                Cipher cipher = this.a(2, o.a(), o.c());
                if (aA.a != 0) {
                    cipher = this.a(2, o.a(), o.d());
                }
                return cipher.doFinal(array);
            }
            catch (BadPaddingException ex) {}
            catch (IllegalBlockSizeException ex2) {
                goto Label_0054;
            }
        }
    }
    
    private byte[] a(final aL al, final aH ah) {
        if (!al.j()) {
            throw new I(aK.z[4]);
        }
        if (ah.c() != al.c()) {
            throw new I(String.format(aK.z[3], ah.c(), al.c()));
        }
        final int c = ah.c();
        final ak a = ah.a();
        final O a2 = this.a(al, a, this.a(al, a), ah.d());
        ah.a(c, al.g(), al.d(), a2.b());
        final byte[] a3 = this.a(c, a2, ah.e());
        al.f();
        return a3;
    }
    
    private byte[] a(final at at, final aH ah) {
        final Object a = aK.a;
        LinkedList<I> list;
        while (true) {
            final Iterator<aL> iterator;
            synchronized (a) {
                iterator = (Iterator<aL>)at.e().iterator();
                list = new LinkedList<I>();
                try {
                    final aL al = new aL(at.b());
                    final byte[] a2 = this.a(al, ah);
                    at.b(al);
                    return a2;
                }
                catch (I i) {
                    list.add(i);
                    if (iterator.hasNext()) {
                        final Iterator<aL> iterator2 = iterator;
                        final aL al2 = iterator2.next();
                        final aL al3 = al2;
                        final aL al4 = new aL(al3);
                        final aK ak = this;
                        final aL al5 = al4;
                        final aH ah2 = ah;
                        final byte[] array = ak.a(al5, ah2);
                        final Iterator<aL> iterator3 = iterator;
                        iterator3.remove();
                        final at at2 = at;
                        final aL al6 = al4;
                        at2.a(al6);
                        return array;
                    }
                    throw new I(aK.z[2], list);
                }
            }
            try {
                final Iterator<aL> iterator2 = iterator;
                final aL al2 = iterator2.next();
                final aL al3 = al2;
                final aL al4 = new aL(al3);
                final aK ak = this;
                final aL al5 = al4;
                final aH ah2 = ah;
                final byte[] array = ak.a(al5, ah2);
                final Iterator<aL> iterator3 = iterator;
                iterator3.remove();
                final at at2 = at;
                final aL al6 = al4;
                at2.a(al6);
                return array;
            }
            catch (I j) {
                list.add(j);
                if (aA.a == 0) {
                    continue;
                }
            }
            break;
        }
        throw new I(aK.z[2], list);
    }
    
    private byte[] b(final int n, final O o, final byte[] array) {
        Label_0026: {
            if (n < 3) {
                break Label_0026;
            }
            try {
                Cipher cipher = this.a(1, o.a(), o.c());
                if (aA.a != 0) {
                    cipher = this.a(1, o.a(), o.d());
                }
                return cipher.doFinal(array);
            }
            catch (BadPaddingException ex) {}
            catch (IllegalBlockSizeException ex2) {
                goto Label_0054;
            }
        }
    }
    
    public ai a(final byte[] array) {
        final int a = aA.a;
        synchronized (aK.a) {
            final at b = this.e.b(this.b);
            final aL b2 = b.b();
            final J a2 = b2.a();
            final O d = a2.d();
            final ak h = b2.h();
            final int e = b2.e();
            final int c = b2.c();
            ai ai = new aH(c, d.b(), h, a2.c(), e, this.b(c, d, array), b2.d(), b2.g());
            if (b2.n()) {
                final c o = b2.o();
                ai = new W(c, b2.k(), o.c(), o.a(), o.b(), b2.d(), (aH)ai);
            }
            b2.a(a2.a());
            this.e.a(this.b, b);
            // monitorexit(aK.a)
            if (bO.s != 0) {
                aA.a = a + 1;
            }
            return ai;
        }
    }
    
    public byte[] a(final W w, final F f) {
        synchronized (aK.a) {
            final at b = this.e.b(this.b);
            final R b2 = this.c.b(b, w);
            final byte[] a = this.a(b, w.c());
            f.a(a);
            this.e.a(this.b, b);
            if (b2.c()) {
                this.d.c((int)b2.d());
            }
            return a;
        }
    }
    
    public byte[] a(final aH ah, final F f) {
        synchronized (aK.a) {
            if (!this.e.a(this.b)) {
                throw new y(aK.z[5] + this.b);
            }
        }
        final at b = this.e.b(this.b);
        final byte[] a = this.a(b, ah);
        f.a(a);
        this.e.a(this.b, b);
        // monitorexit(o)
        return a;
    }
}
