// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import java.io.File;
import android.net.Uri;
import com.whatsapp.util.Log;
import android.database.Cursor;
import android.database.AbstractCursor;

public class a8a extends AbstractCursor
{
    public static final String[] b;
    private static final String[] z;
    private String a;
    private int c;
    private Cursor d;
    
    static {
        final String[] array = new String[7];
        String s = "?Vi451F\u007f.; \u001cc8,&\u001c~6=\"\u0013";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_0470:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'T';
                        break;
                    }
                    case 0: {
                        c2 = 'R';
                        break;
                    }
                    case 1: {
                        c2 = '3';
                        break;
                    }
                    case 2: {
                        c2 = '\r';
                        break;
                    }
                    case 3: {
                        c2 = ']';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "?Vi451F\u007f.; \u001cc8,&\u001c\u007f85>Pb(:&\u0013";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "?Vi451F\u007f.; \u001c}/1$\u001cc2 4\\x30";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "?Vi451F\u007f.; \u001c}/1$\u001c~6=\"\u0013";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    s = "$Zi8;}\u0019";
                    n2 = 4;
                    array2 = array3;
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    array2 = array3;
                    s = ";^l:1}Y}83";
                    n = 4;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "3Fi4;}\u0019";
                    n = 5;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    z = array3;
                    final String[] array4 = new String[6];
                    s = "\rZi";
                    n = 6;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    s = "\rWl)5";
                    n = 7;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    s = "6Ry8 3Xh3";
                    n = 8;
                    n2 = 2;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    s = "&Zy11";
                    n = 9;
                    n2 = 3;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    s = "?Z`8\u000b&J}8";
                    n = 10;
                    n2 = 4;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "6F\u007f< ;\\c";
                    n = 11;
                    array2 = array3;
                    continue;
                }
                case 11: {
                    break Label_0470;
                }
            }
        }
        array2[n2] = intern;
        b = array3;
    }
    
    public a8a(final String a, final Cursor d) {
        this.c = -1;
        this.d = d;
        this.a = a;
        this.moveToPosition(0);
    }
    
    private boolean a() {
        int n = 0;
        final boolean i = App.I;
        boolean b = false;
        while (this.d.moveToPrevious()) {
            if (this.d()) {
                b = true;
                if (!i) {
                    break;
                }
            }
            ++n;
            if (i) {
                break;
            }
        }
        if (n > 0) {
            Log.i(a8a.z[3] + n);
        }
        if (!b) {
            this.d.moveToPosition(-1);
            Log.i(a8a.z[2]);
        }
        return b;
    }
    
    private boolean c() {
        final boolean i = App.I;
        int n = 0;
        boolean b = false;
        while (this.d.moveToNext()) {
            if (this.d()) {
                if (!i) {
                    b = true;
                    break;
                }
                b = true;
            }
            ++n;
            if (i) {
                break;
            }
        }
        if (n > 0) {
            Log.i(a8a.z[0] + n);
        }
        if (!b) {
            this.c = 1 + this.getPosition();
            this.d.moveToPosition(-1);
            Log.i(a8a.z[1] + this.c);
        }
        return b;
    }
    
    private boolean d() {
        final bi a = App.ak.a(this.e(), this.a);
        if (a.N != null) {
            final MediaData mediaData = (MediaData)a.N;
            if ((a.a.b || mediaData.transferred) && mediaData.file != null) {
                final Uri fromFile = Uri.fromFile(mediaData.file);
                if (new File(fromFile.getPath()).exists()) {
                    return true;
                }
                fromFile.getPath();
            }
        }
        return false;
    }
    
    public bi b() {
        return App.ak.a(this.e(), this.a);
    }
    
    public void close() {
        super.close();
        this.d.close();
    }
    
    public Cursor e() {
        return this.d;
    }
    
    public String[] getColumnNames() {
        return a8a.b;
    }
    
    public int getCount() {
        if (this.c < 0) {
            final int n = this.d.getCount();
            if (!App.I) {
                return n;
            }
        }
        return this.c;
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
        switch (n) {
            default: {
                return 0L;
            }
            case 0: {
                return this.e().getLong(0);
            }
            case 2: {
                return App.ak.a(this.e(), this.a).u;
            }
            case 5: {
                return App.ak.a(this.e(), this.a).D;
            }
        }
    }
    
    public short getShort(final int n) {
        return 0;
    }
    
    public String getString(final int n) {
        Label_0109: {
            switch (n) {
                case 0: {
                    return Long.toString(this.e().getLong(0));
                }
                case 1: {
                    final bi a = App.ak.a(this.e(), this.a);
                    if (a == null) {
                        break;
                    }
                    final MediaData mediaData = (MediaData)a.N;
                    if (mediaData != null && mediaData.file != null) {
                        return mediaData.file.getAbsolutePath();
                    }
                    if (App.I) {
                        break Label_0109;
                    }
                    break;
                }
                case 2: {
                    final bi a2 = App.ak.a(this.e(), this.a);
                    if (a2 != null) {
                        return Long.toString(a2.u);
                    }
                    break;
                }
                case 3: {
                    return "";
                }
                case 4: {
                    switch (App.ak.a(this.e(), this.a).I) {
                        default: {
                            break Label_0109;
                        }
                        case 1: {
                            return a8a.z[5];
                        }
                        case 2: {
                            return a8a.z[6];
                        }
                        case 3: {
                            return a8a.z[4];
                        }
                    }
                    break;
                }
            }
        }
        return "";
    }
    
    public int getType(final int n) {
        int n2 = 1;
        switch (n) {
            default: {
                n2 = 3;
                return n2;
            }
            case 0:
            case 2:
            case 5: {
                return n2;
            }
            case 1: {
                return 3;
            }
            case 3: {
                return 3;
            }
            case 4: {
                return 3;
            }
        }
    }
    
    public boolean isNull(final int n) {
        return false;
    }
    
    public boolean onMove(final int n, final int i) {
        int n2 = -1;
        final boolean j = App.I;
        if (n > i * 2) {
            this.d.moveToPosition(n2);
        }
        else {
            n2 = n;
        }
        while (i > n2) {
            if (!this.c()) {
                this.onChange(true);
                return false;
            }
            ++n2;
            if (j) {
                break;
            }
        }
        while (i < n2) {
            if (!this.a()) {
                this.onChange(true);
                return false;
            }
            --n2;
            if (j) {
                break;
            }
        }
        return true;
    }
}
