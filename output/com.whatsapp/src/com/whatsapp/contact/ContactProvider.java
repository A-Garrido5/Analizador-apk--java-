// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

import android.database.Cursor;
import android.content.ContentValues;
import android.database.ContentObserver;
import android.content.ContentUris;
import android.text.TextUtils;
import android.content.UriMatcher;
import android.net.Uri;
import android.content.ContentProvider;

public class ContactProvider extends ContentProvider
{
    public static final String[] a;
    public static final Uri c;
    public static final Uri d;
    public static final Uri e;
    private static final UriMatcher f;
    public static int g;
    private static final String[] z;
    private c b;
    
    static {
        final String[] array = new String[30];
        int n = 0;
        String[] array2 = array;
        String[] array3 = array;
        String s = "B\u000b$\u0007U=]";
        int n2 = -1;
        String z2 = null;
    Label_0830:
        while (true) {
            z2 = z(z(s));
            switch (n2) {
                default: {
                    array2[n] = z2;
                    s = "B\u000b$\u0007U=]`f&YBh";
                    n = 1;
                    array2 = array3;
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array2[n] = z2;
                    s = "j\u0003\u001fD\u0007s\u0016!D\u001cn";
                    n = 2;
                    array2 = array3;
                    n2 = 1;
                    continue;
                }
                case 1: {
                    array2[n] = z2;
                    s = "j\u0003\u001fD\u0007s\u0016!D\u001cB\u0001!W\t\u007f\u000b,N\u001ct\u00073";
                    n = 3;
                    array2 = array3;
                    n2 = 2;
                    continue;
                }
                case 2: {
                    array2[n] = z2;
                    n = 4;
                    array2 = array3;
                    s = "B=)I\u001bx\u00104x\u0007o=2B\u0018q\u0003#B7B";
                    n2 = 3;
                    continue;
                }
                case 3: {
                    array2[n] = z2;
                    n = 5;
                    s = "j\u0003\u001fD\u0007s\u0016!D\u001cB\u0001!W\t\u007f\u000b,N\u001ct\u00073";
                    n2 = 4;
                    array2 = array3;
                    continue;
                }
                case 4: {
                    array2[n] = z2;
                    n = 6;
                    s = "B=)I\u001bx\u00104x\u0007o=2B\u0018q\u0003#B7B";
                    n2 = 5;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n] = z2;
                    n = 7;
                    s = "j\u0003\u001fD\u0007s\u0016!D\u001cn";
                    n2 = 6;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n] = z2;
                    n = 8;
                    s = "m\u00034OHt\u0011`FHo\u00071R\u0001o\u0007$\u0007\u001e|\u000e5B";
                    n2 = 7;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n] = z2;
                    n = 9;
                    s = "m\u00034O";
                    n2 = 8;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n] = z2;
                    n = 10;
                    s = "B=)I\u001bx\u00104x\u0007o=2B\u0018q\u0003#B7B";
                    n2 = 9;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n] = z2;
                    n = 11;
                    s = "m\u00034O";
                    n2 = 10;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n] = z2;
                    n = 12;
                    s = "H\f+I\u0007j\f`r:TB";
                    n2 = 11;
                    array2 = array3;
                    continue;
                }
                case 11: {
                    array2[n] = z2;
                    n = 13;
                    s = "k\f$\t\ts\u00062H\u0001yL#R\u001an\r2\t\u0001i\u0007-\b\u001es\u0006nD\u0007pL7O\ti\u0011!W\u00183\u00122H\u001et\u0006%UF~\r.S\t~\u0016";
                    n2 = 12;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    array2[n] = z2;
                    n = 14;
                    s = "k\f$\t\ts\u00062H\u0001yL#R\u001an\r2\t\u0001i\u0007-\b\u001es\u0006nD\u0007pL7O\ti\u0011!W\u00183\u00122H\u001et\u0006%UF~\r.S\t~\u0016nD\tm\u0003\"N\u0004t\u00169";
                    n2 = 13;
                    array2 = array3;
                    continue;
                }
                case 13: {
                    array2[n] = z2;
                    n = 15;
                    s = "k\f$\t\ts\u00062H\u0001yL#R\u001an\r2\t\ft\u0010oQ\u0006yL#H\u00053\u0015(F\u001cn\u00030WFm\u0010/Q\u0001y\u00072\t\u000br\f4F\u000bi";
                    n2 = 14;
                    array2 = array3;
                    continue;
                }
                case 14: {
                    array2[n] = z2;
                    n = 16;
                    s = "k\f$\t\ts\u00062H\u0001yL#R\u001an\r2\t\ft\u0010oQ\u0006yL#H\u00053\u0015(F\u001cn\u00030WFm\u0010/Q\u0001y\u00072\t\u000br\f4F\u000biL#F\u0018|\u0000)K\u0001i\u001b";
                    n2 = 15;
                    array2 = array3;
                    continue;
                }
                case 15: {
                    array2[n] = z2;
                    n = 17;
                    s = "H\f+I\u0007j\f`r:TB";
                    n2 = 16;
                    array2 = array3;
                    continue;
                }
                case 16: {
                    array2[n] = z2;
                    n = 18;
                    s = "j\u0003\u001fD\u0007s\u0016!D\u001cn";
                    n2 = 17;
                    array2 = array3;
                    continue;
                }
                case 17: {
                    array2[n] = z2;
                    n = 19;
                    s = "j\u0003\u001fD\u0007s\u0016!D\u001cB\u0001!W\t\u007f\u000b,N\u001ct\u00073";
                    n2 = 18;
                    array2 = array3;
                    continue;
                }
                case 18: {
                    array2[n] = z2;
                    n = 20;
                    s = "H\f+I\u0007j\f`r:TB";
                    n2 = 19;
                    array2 = array3;
                    continue;
                }
                case 19: {
                    array2[n] = z2;
                    n = 21;
                    s = "~\r-\t\u001fu\u00034T\tm\u0012nW\u001ar\u0014)C\roL#H\u0006i\u0003#S";
                    n2 = 20;
                    array2 = array3;
                    continue;
                }
                case 20: {
                    array2[n] = z2;
                    n = 22;
                    s = "~\r.S\rs\u0016";
                    n2 = 21;
                    array2 = array3;
                    continue;
                }
                case 21: {
                    array2[n] = z2;
                    n = 23;
                    s = "j\u0003\u001fD\u0007s\u0016!D\u001cB\u0001!W\t\u007f\u000b,N\u001ct\u00073";
                    n2 = 22;
                    array2 = array3;
                    continue;
                }
                case 22: {
                    array2[n] = z2;
                    n = 24;
                    s = "H\f+I\u0007j\f`r:TB";
                    n2 = 23;
                    array2 = array3;
                    continue;
                }
                case 23: {
                    array2[n] = z2;
                    n = 25;
                    s = "j\u0003\u001fD\u0007s\u0016!D\u001cn";
                    n2 = 24;
                    array2 = array3;
                    continue;
                }
                case 24: {
                    array2[n] = z2;
                    n = 26;
                    s = "B\u000b$\u0007U=";
                    n2 = 25;
                    array2 = array3;
                    continue;
                }
                case 25: {
                    array2[n] = z2;
                    n = 27;
                    s = "j\u0003\u001fD\u0007s\u0016!D\u001cn";
                    n2 = 26;
                    array2 = array3;
                    continue;
                }
                case 26: {
                    array2[n] = z2;
                    n = 28;
                    s = "j\u0003\u001fD\u0007s\u0016!D\u001cB\u0001!W\t\u007f\u000b,N\u001ct\u00073";
                    n2 = 27;
                    array2 = array3;
                    continue;
                }
                case 27: {
                    array2[n] = z2;
                    n = 29;
                    s = "B\u000b$\u0007U=";
                    n2 = 28;
                    array2 = array3;
                    continue;
                }
                case 28: {
                    array2[n] = z2;
                    z = array3;
                    String s2 = "~\r.S\rs\u0016z\bG~\r-\t\u001fu\u00034T\tm\u0012nW\u001ar\u0014)C\roL#H\u0006i\u0003#SG~\r.S\t~\u00163";
                    int n3 = -1;
                    String z3 = null;
                Label_0995:
                    while (true) {
                        z3 = z(z(s2));
                        switch (n3) {
                            default: {
                                c = Uri.parse(z3);
                                s2 = "~\r.S\rs\u0016z\bG~\r-\t\u001fu\u00034T\tm\u0012nW\u001ar\u0014)C\roL#H\u0006i\u0003#SG~\r.S\t~\u00163\b\f\u007f\u0004)K\r";
                                n3 = 0;
                                continue;
                            }
                            case 0: {
                                d = Uri.parse(z3);
                                s2 = "~\r.S\rs\u0016z\bG~\r-\t\u001fu\u00034T\tm\u0012nW\u001ar\u0014)C\roL#H\u0006i\u0003#SG~\r.S\t~\u00163\b\u000b|\u0012!E\u0001q\u000b4N\rn";
                                n3 = 1;
                                continue;
                            }
                            case 1: {
                                break Label_0995;
                            }
                        }
                    }
                    e = Uri.parse(z3);
                    final String[] array4 = { null };
                    s = "~\r5I\u001c5=)CA=#\u0013\u00077~\r5I\u001c";
                    n2 = 29;
                    array2 = array4;
                    array3 = array4;
                    n = 0;
                    continue;
                }
                case 29: {
                    break Label_0830;
                }
            }
        }
        array2[n] = z2;
        a = array3;
        f = new UriMatcher(-1);
        UriMatcher uriMatcher = ContactProvider.f;
        String s3 = "~\r-\t\u001fu\u00034T\tm\u0012nW\u001ar\u0014)C\roL#H\u0006i\u0003#S";
        int n4 = -1;
        String z4 = null;
        String z5 = null;
    Label_1143:
        while (true) {
            z4 = z(z(s3));
            String s4 = null;
            int n5 = 0;
            switch (n4) {
                default: {
                    s4 = "~\r.S\t~\u00163";
                    n5 = -1;
                    break;
                }
                case 0: {
                    s4 = "~\r.S\t~\u00163\bK";
                    n5 = 0;
                    break;
                }
                case 1: {
                    s4 = "~\r.S\t~\u00163\b\f\u007f\u0004)K\r";
                    n5 = 1;
                    break;
                }
                case 2: {
                    s4 = "~\r.S\t~\u00163\b\u000b|\u0012!E\u0001q\u000b4N\rn";
                    n5 = 2;
                    break;
                }
                case 3: {
                    s4 = "~\r.S\t~\u00163\b\u000b|\u0012!E\u0001q\u000b4N\rnMc";
                    n5 = 3;
                    break;
                }
            }
            z5 = z(z(s4));
            switch (n5) {
                default: {
                    uriMatcher.addURI(z4, z5, 1);
                    uriMatcher = ContactProvider.f;
                    s3 = "~\r-\t\u001fu\u00034T\tm\u0012nW\u001ar\u0014)C\roL#H\u0006i\u0003#S";
                    n4 = 0;
                    continue;
                }
                case 0: {
                    uriMatcher.addURI(z4, z5, 2);
                    uriMatcher = ContactProvider.f;
                    s3 = "~\r-\t\u001fu\u00034T\tm\u0012nW\u001ar\u0014)C\roL#H\u0006i\u0003#S";
                    n4 = 1;
                    continue;
                }
                case 1: {
                    uriMatcher.addURI(z4, z5, 3);
                    uriMatcher = ContactProvider.f;
                    s3 = "~\r-\t\u001fu\u00034T\tm\u0012nW\u001ar\u0014)C\roL#H\u0006i\u0003#S";
                    n4 = 2;
                    continue;
                }
                case 2: {
                    uriMatcher.addURI(z4, z5, 4);
                    uriMatcher = ContactProvider.f;
                    s3 = "~\r-\t\u001fu\u00034T\tm\u0012nW\u001ar\u0014)C\roL#H\u0006i\u0003#S";
                    n4 = 3;
                    continue;
                }
                case 3: {
                    break Label_1143;
                }
            }
        }
        uriMatcher.addURI(z4, z5, 5);
    }
    
    private String a(final Uri uri, final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException(ContactProvider.z[20] + uri);
            }
            case 1:
            case 2: {
                try {
                    return ContactProvider.z[18];
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            case 4:
            case 5: {
                return ContactProvider.z[19];
            }
        }
    }
    
    private String a(final String s) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                return ContactProvider.z[0];
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return ContactProvider.z[1] + s + ")";
    }
    
    public static boolean a(final Uri uri) {
        if (uri != null) {
            try {
                if (!TextUtils.equals((CharSequence)uri.getScheme(), (CharSequence)ContactProvider.z[22])) {
                    return false;
                }
                final Uri uri2 = uri;
                final String s = uri2.getAuthority();
                final String[] array = ContactProvider.z;
                final int n = 21;
                final String s2 = array[n];
                final boolean b = TextUtils.equals((CharSequence)s, (CharSequence)s2);
                if (b) {
                    return true;
                }
                return false;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final Uri uri2 = uri;
                final String s = uri2.getAuthority();
                final String[] array = ContactProvider.z;
                final int n = 21;
                final String s2 = array[n];
                final boolean b = TextUtils.equals((CharSequence)s, (CharSequence)s2);
                if (b) {
                    return true;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    private String[] a(final String[] array, final long n) {
        if (array == null) {
            try {
                return new String[] { String.valueOf(n) };
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        final String[] array2 = new String[1 + array.length];
        System.arraycopy(array, 0, array2, 1, array.length);
        array2[0] = String.valueOf(n);
        return array2;
    }
    
    private static String z(final char[] array) {
        for (int i = array.length, n = 0; i > n; ++n) {
            final char c = array[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'h';
                    break;
                }
                case 0: {
                    c2 = '\u001d';
                    break;
                }
                case 1: {
                    c2 = 'b';
                    break;
                }
                case 2: {
                    c2 = '@';
                    break;
                }
                case 3: {
                    c2 = '\'';
                    break;
                }
            }
            array[n] = (char)(c2 ^ c);
        }
        return new String(array).intern();
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length < 2) {
            charArray[0] ^= 'h';
        }
        return charArray;
    }
    
    public int delete(final Uri uri, String a, String[] a2) {
        final int match = ContactProvider.f.match(uri);
        if (match != 3) {
            final String a3 = this.a(uri, match);
            if (match == 2 || match == 5) {
                final long id = ContentUris.parseId(uri);
                a = this.a(a);
                a2 = this.a(a2, id);
            }
            final int delete = this.b.getWritableDatabase().delete(a3, a, a2);
            this.getContext().getContentResolver().notifyChange(uri, (ContentObserver)null);
            return delete;
        }
        while (true) {
            while (true) {
                try {
                    if (this.b.b()) {
                        final int n = 1;
                        this.getContext().getContentResolver().notifyChange(uri, (ContentObserver)null);
                        return n;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n = 0;
                continue;
            }
        }
    }
    
    public String getType(final Uri uri) {
        try {
            switch (ContactProvider.f.match(uri)) {
                default: {
                    throw new IllegalArgumentException(ContactProvider.z[17] + uri);
                }
                case 1: {
                    return ContactProvider.z[15];
                }
                case 2: {
                    break;
                }
                case 4: {
                    return ContactProvider.z[16];
                }
                case 5: {
                    return ContactProvider.z[14];
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return ContactProvider.z[13];
    }
    
    public Uri insert(final Uri p0, final ContentValues p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/contact/ContactProvider.g:I
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/contact/ContactProvider.f:Landroid/content/UriMatcher;
        //     7: aload_1        
        //     8: invokevirtual   android/content/UriMatcher.match:(Landroid/net/Uri;)I
        //    11: istore          4
        //    13: iload           4
        //    15: iconst_3       
        //    16: if_icmpne       77
        //    19: aload_2        
        //    20: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //    23: bipush          9
        //    25: aaload         
        //    26: invokevirtual   android/content/ContentValues.containsKey:(Ljava/lang/String;)Z
        //    29: ifne            51
        //    32: new             Ljava/lang/IllegalArgumentException;
        //    35: dup            
        //    36: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //    39: bipush          8
        //    41: aaload         
        //    42: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    45: athrow         
        //    46: astore          15
        //    48: aload           15
        //    50: athrow         
        //    51: aload_0        
        //    52: getfield        com/whatsapp/contact/ContactProvider.b:Lcom/whatsapp/contact/c;
        //    55: new             Ljava/io/File;
        //    58: dup            
        //    59: aload_2        
        //    60: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //    63: bipush          11
        //    65: aaload         
        //    66: invokevirtual   android/content/ContentValues.getAsString:(Ljava/lang/String;)Ljava/lang/String;
        //    69: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    72: invokevirtual   com/whatsapp/contact/c.a:(Ljava/io/File;)V
        //    75: aload_1        
        //    76: areturn        
        //    77: aload_2        
        //    78: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //    81: bipush          6
        //    83: aaload         
        //    84: invokevirtual   android/content/ContentValues.containsKey:(Ljava/lang/String;)Z
        //    87: ifeq            188
        //    90: aload_2        
        //    91: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //    94: bipush          10
        //    96: aaload         
        //    97: invokevirtual   android/content/ContentValues.getAsBoolean:(Ljava/lang/String;)Ljava/lang/Boolean;
        //   100: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   103: istore          14
        //   105: iload           14
        //   107: istore          6
        //   109: aload_2        
        //   110: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   113: iconst_4       
        //   114: aaload         
        //   115: invokevirtual   android/content/ContentValues.remove:(Ljava/lang/String;)V
        //   118: iload           4
        //   120: tableswitch {
        //                2: 194
        //                3: 152
        //                4: 152
        //                5: 273
        //          default: 152
        //        }
        //   152: new             Ljava/lang/IllegalArgumentException;
        //   155: dup            
        //   156: new             Ljava/lang/StringBuilder;
        //   159: dup            
        //   160: invokespecial   java/lang/StringBuilder.<init>:()V
        //   163: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   166: bipush          12
        //   168: aaload         
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: aload_1        
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   176: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   179: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   182: athrow         
        //   183: astore          5
        //   185: aload           5
        //   187: athrow         
        //   188: iconst_0       
        //   189: istore          6
        //   191: goto            109
        //   194: iload           6
        //   196: ifeq            222
        //   199: aload_0        
        //   200: getfield        com/whatsapp/contact/ContactProvider.b:Lcom/whatsapp/contact/c;
        //   203: invokevirtual   com/whatsapp/contact/c.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //   206: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   209: iconst_2       
        //   210: aaload         
        //   211: aconst_null    
        //   212: aload_2        
        //   213: invokevirtual   android/database/sqlite/SQLiteDatabase.replaceOrThrow:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   216: lstore          11
        //   218: iload_3        
        //   219: ifeq            242
        //   222: aload_0        
        //   223: getfield        com/whatsapp/contact/ContactProvider.b:Lcom/whatsapp/contact/c;
        //   226: invokevirtual   com/whatsapp/contact/c.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //   229: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   232: bipush          7
        //   234: aaload         
        //   235: aconst_null    
        //   236: aload_2        
        //   237: invokevirtual   android/database/sqlite/SQLiteDatabase.insertOrThrow:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   240: lstore          11
        //   242: getstatic       com/whatsapp/contact/ContactProvider.c:Landroid/net/Uri;
        //   245: lload           11
        //   247: invokestatic    android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   250: astore          13
        //   252: aload_0        
        //   253: invokevirtual   com/whatsapp/contact/ContactProvider.getContext:()Landroid/content/Context;
        //   256: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   259: aload           13
        //   261: aconst_null    
        //   262: invokevirtual   android/content/ContentResolver.notifyChange:(Landroid/net/Uri;Landroid/database/ContentObserver;)V
        //   265: aload           13
        //   267: areturn        
        //   268: astore          7
        //   270: aload           7
        //   272: athrow         
        //   273: iload           6
        //   275: ifeq            301
        //   278: aload_0        
        //   279: getfield        com/whatsapp/contact/ContactProvider.b:Lcom/whatsapp/contact/c;
        //   282: invokevirtual   com/whatsapp/contact/c.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //   285: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   288: iconst_3       
        //   289: aaload         
        //   290: aconst_null    
        //   291: aload_2        
        //   292: invokevirtual   android/database/sqlite/SQLiteDatabase.replaceOrThrow:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   295: lstore          8
        //   297: iload_3        
        //   298: ifeq            320
        //   301: aload_0        
        //   302: getfield        com/whatsapp/contact/ContactProvider.b:Lcom/whatsapp/contact/c;
        //   305: invokevirtual   com/whatsapp/contact/c.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //   308: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   311: iconst_5       
        //   312: aaload         
        //   313: aconst_null    
        //   314: aload_2        
        //   315: invokevirtual   android/database/sqlite/SQLiteDatabase.insertOrThrow:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   318: lstore          8
        //   320: getstatic       com/whatsapp/contact/ContactProvider.c:Landroid/net/Uri;
        //   323: lload           8
        //   325: invokestatic    android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   328: astore          10
        //   330: aload_0        
        //   331: invokevirtual   com/whatsapp/contact/ContactProvider.getContext:()Landroid/content/Context;
        //   334: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   337: aload           10
        //   339: aconst_null    
        //   340: invokevirtual   android/content/ContentResolver.notifyChange:(Landroid/net/Uri;Landroid/database/ContentObserver;)V
        //   343: aload           10
        //   345: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  19     46     46     51     Ljava/lang/IllegalArgumentException;
        //  77     105    183    188    Ljava/lang/IllegalArgumentException;
        //  109    118    268    273    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0109:
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
    
    public boolean onCreate() {
        this.b = new c(this.getContext());
        return true;
    }
    
    public Cursor query(final Uri p0, final String[] p1, final String p2, final String[] p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/contact/ContactProvider.g:I
        //     3: istore          6
        //     5: new             Landroid/database/sqlite/SQLiteQueryBuilder;
        //     8: dup            
        //     9: invokespecial   android/database/sqlite/SQLiteQueryBuilder.<init>:()V
        //    12: astore          7
        //    14: aload_0        
        //    15: getfield        com/whatsapp/contact/ContactProvider.b:Lcom/whatsapp/contact/c;
        //    18: invokevirtual   com/whatsapp/contact/c.getReadableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    21: astore          8
        //    23: getstatic       com/whatsapp/contact/ContactProvider.f:Landroid/content/UriMatcher;
        //    26: aload_1        
        //    27: invokevirtual   android/content/UriMatcher.match:(Landroid/net/Uri;)I
        //    30: istore          14
        //    32: iload           14
        //    34: tableswitch {
        //                2: 104
        //                3: 120
        //                4: 68
        //                5: 167
        //                6: 183
        //          default: 68
        //        }
        //    68: new             Ljava/lang/IllegalArgumentException;
        //    71: dup            
        //    72: new             Ljava/lang/StringBuilder;
        //    75: dup            
        //    76: invokespecial   java/lang/StringBuilder.<init>:()V
        //    79: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //    82: bipush          24
        //    84: aaload         
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: aload_1        
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    92: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    95: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    98: athrow         
        //    99: astore          13
        //   101: aload           13
        //   103: athrow         
        //   104: aload           7
        //   106: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   109: bipush          25
        //   111: aaload         
        //   112: invokevirtual   android/database/sqlite/SQLiteQueryBuilder.setTables:(Ljava/lang/String;)V
        //   115: iload           6
        //   117: ifeq            230
        //   120: aload           7
        //   122: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   125: bipush          27
        //   127: aaload         
        //   128: invokevirtual   android/database/sqlite/SQLiteQueryBuilder.setTables:(Ljava/lang/String;)V
        //   131: aload           7
        //   133: new             Ljava/lang/StringBuilder;
        //   136: dup            
        //   137: invokespecial   java/lang/StringBuilder.<init>:()V
        //   140: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   143: bipush          29
        //   145: aaload         
        //   146: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   149: aload_1        
        //   150: invokestatic    android/content/ContentUris.parseId:(Landroid/net/Uri;)J
        //   153: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   156: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   159: invokevirtual   android/database/sqlite/SQLiteQueryBuilder.appendWhere:(Ljava/lang/CharSequence;)V
        //   162: iload           6
        //   164: ifeq            230
        //   167: aload           7
        //   169: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   172: bipush          23
        //   174: aaload         
        //   175: invokevirtual   android/database/sqlite/SQLiteQueryBuilder.setTables:(Ljava/lang/String;)V
        //   178: iload           6
        //   180: ifeq            230
        //   183: aload           7
        //   185: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   188: bipush          28
        //   190: aaload         
        //   191: invokevirtual   android/database/sqlite/SQLiteQueryBuilder.setTables:(Ljava/lang/String;)V
        //   194: aload           7
        //   196: new             Ljava/lang/StringBuilder;
        //   199: dup            
        //   200: invokespecial   java/lang/StringBuilder.<init>:()V
        //   203: getstatic       com/whatsapp/contact/ContactProvider.z:[Ljava/lang/String;
        //   206: bipush          26
        //   208: aaload         
        //   209: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   212: aload_1        
        //   213: invokestatic    android/content/ContentUris.parseId:(Landroid/net/Uri;)J
        //   216: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   219: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   222: invokevirtual   android/database/sqlite/SQLiteQueryBuilder.appendWhere:(Ljava/lang/CharSequence;)V
        //   225: iload           6
        //   227: ifne            68
        //   230: aload           7
        //   232: aload           8
        //   234: aload_2        
        //   235: aload_3        
        //   236: aload           4
        //   238: aconst_null    
        //   239: aconst_null    
        //   240: aload           5
        //   242: invokevirtual   android/database/sqlite/SQLiteQueryBuilder.query:(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   245: astore          15
        //   247: aload           15
        //   249: aload_0        
        //   250: invokevirtual   com/whatsapp/contact/ContactProvider.getContext:()Landroid/content/Context;
        //   253: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   256: aload_1        
        //   257: invokeinterface android/database/Cursor.setNotificationUri:(Landroid/content/ContentResolver;Landroid/net/Uri;)V
        //   262: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   265: ifeq            275
        //   268: iload           6
        //   270: iconst_1       
        //   271: iadd           
        //   272: putstatic       com/whatsapp/contact/ContactProvider.g:I
        //   275: aload           15
        //   277: areturn        
        //   278: astore          9
        //   280: aload           9
        //   282: athrow         
        //   283: astore          10
        //   285: aload           10
        //   287: athrow         
        //   288: astore          11
        //   290: aload           11
        //   292: athrow         
        //   293: astore          12
        //   295: aload           12
        //   297: athrow         
        //   298: astore          16
        //   300: aload           16
        //   302: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  23     32     278    283    Ljava/lang/IllegalArgumentException;
        //  68     99     99     104    Ljava/lang/IllegalArgumentException;
        //  104    115    283    288    Ljava/lang/IllegalArgumentException;
        //  120    162    288    293    Ljava/lang/IllegalArgumentException;
        //  167    178    293    298    Ljava/lang/IllegalArgumentException;
        //  183    225    99     104    Ljava/lang/IllegalArgumentException;
        //  247    275    298    303    Ljava/lang/IllegalArgumentException;
        //  280    283    283    288    Ljava/lang/IllegalArgumentException;
        //  285    288    288    293    Ljava/lang/IllegalArgumentException;
        //  290    293    293    298    Ljava/lang/IllegalArgumentException;
        //  295    298    99     104    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 126, Size: 126
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
    
    public int update(final Uri uri, final ContentValues contentValues, String a, String[] a2) {
        final int match = ContactProvider.f.match(uri);
        final String a3 = this.a(uri, match);
        if (match == 2 || match == 5) {
            final long id = ContentUris.parseId(uri);
            a = this.a(a);
            a2 = this.a(a2, id);
        }
        final int update = this.b.getWritableDatabase().update(a3, contentValues, a, a2);
        this.getContext().getContentResolver().notifyChange(uri, (ContentObserver)null);
        return update;
    }
}
