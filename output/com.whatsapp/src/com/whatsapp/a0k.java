// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import android.content.Context;
import android.database.AbstractCursor;

public class a0k extends AbstractCursor
{
    private static final String[] b;
    private final Context a;
    
    static {
        final String[] b2 = new String[2];
        String s = "O{l";
        int n = -1;
        String[] array = b2;
        int n2 = 0;
        String intern = null;
    Label_0177:
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
                        c2 = '%';
                        break;
                    }
                    case 1: {
                        c2 = '\u0012';
                        break;
                    }
                    case 2: {
                        c2 = '\b';
                        break;
                    }
                    case 3: {
                        c2 = '\u001b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = b2;
                    s = "Kse~";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0177;
                }
            }
        }
        array[n2] = intern;
        b = b2;
    }
    
    public a0k(final Context a) {
        this.a = a;
    }
    
    public String[] getColumnNames() {
        return a0k.b;
    }
    
    public int getCount() {
        return z8.a();
    }
    
    public double getDouble(final int n) {
        return 0.0;
    }
    
    public float getFloat(final int n) {
        return 0.0f;
    }
    
    public int getInt(final int n) {
        return 0;
    }
    
    public long getLong(final int n) {
        return 0L;
    }
    
    public short getShort(final int n) {
        return 0;
    }
    
    public String getString(final int n) {
        switch (n) {
            case 0: {
                final ArrayList j = z8.j();
                final int position = this.getPosition();
                if (j.size() > position) {
                    return j.get(position);
                }
            }
            case 1: {
                final ArrayList i = z8.j();
                final int position2 = this.getPosition();
                if (i.size() > position2) {
                    return App.S.e(i.get(position2)).a(this.a);
                }
                break;
            }
        }
        return "";
    }
    
    public boolean isNull(final int n) {
        return false;
    }
}
