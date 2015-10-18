// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class ac
{
    private static SimpleDateFormat b;
    private static final String[] z;
    private ae a;
    private ae c;
    private ae d;
    private Calendar e;
    
    static {
        final String[] z2 = new String[2];
        String s = "tb\\Q";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0015:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
            Label_0159_Outer:
                while (true) {
                    Label_0116: {
                        if (length > n3) {
                            break Label_0116;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "uc]P";
                                n2 = 1;
                                array = z2;
                                n = 0;
                                continue Label_0015;
                            }
                            case 0: {
                                break;
                            }
                        }
                        array[n2] = intern;
                        z = z2;
                        try {
                            ac.b = new SimpleDateFormat(ac.z[1], Locale.getDefault());
                            return;
                            char c = '\0';
                            Label_0176: {
                                c = '9';
                            }
                            while (true) {
                                final char c2;
                                charArray[n3] = (char)(c ^ c2);
                                ++n3;
                                continue Label_0159_Outer;
                                Label_0190:
                                c = '\u0011';
                                continue;
                                Label_0197:
                                c = '\u001c';
                                continue;
                                Label_0183:
                                c = '/';
                                continue;
                                c2 = charArray[n3];
                                Label_0156:
                                c = '\u0001';
                                continue;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@14c0dc00, n3 % 5)
                        catch (IllegalArgumentException ex) {
                            ac.b = new SimpleDateFormat(ac.z[0], Locale.getDefault());
                        }
                    }
                }
            }
            break;
        }
    }
    
    public ac() {
        (this.a = new ae(1, Calendar.getInstance())).add(6, -2);
        (this.c = new ae(2, Calendar.getInstance())).add(6, -7);
        (this.d = new ae(3, Calendar.getInstance())).add(6, -28);
        (this.e = Calendar.getInstance()).add(6, -366);
    }
    
    static SimpleDateFormat a() {
        return ac.b;
    }
    
    public ae a(final long n) {
        final Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(new Date(n));
            if (instance.after(this.a)) {
                return this.a;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (instance.after(this.c)) {
                return this.c;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            if (instance.after(this.d)) {
                return this.d;
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        try {
            if (instance.after(this.e)) {
                return new ae(4, new GregorianCalendar(instance.get(1), instance.get(2), 1));
            }
        }
        catch (IllegalArgumentException ex4) {
            throw ex4;
        }
        return new ae(5, new GregorianCalendar(instance.get(1), 1, 1));
    }
}
