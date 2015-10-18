// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import android.content.ContentValues;
import java.util.List;
import android.content.Context;

public class n
{
    private static final String c;
    public static int d;
    private static final String[] z;
    private final d a;
    private final b b;
    private final Context e;
    private final c f;
    
    static {
        final String[] z2 = new String[14];
        String s = "o{L\t`";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0382:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\u0005';
                        break;
                    }
                    case 0: {
                        c3 = '\u001e';
                        break;
                    }
                    case 1: {
                        c3 = '\u000e';
                        break;
                    }
                    case 2: {
                        c3 = ')';
                        break;
                    }
                    case 3: {
                        c3 = '|';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "{`J\u000e|nzL\u0018";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "wzL\u0011";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "Nk[\u000flmzL\u0012qMzF\u000e`";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "o{L\t`";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "wzL\u0011";
                    n = 4;
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    array = z2;
                    s = "AgM\\DMM";
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "AgM";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "{`J\u000e|nzL\u0018";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "{`J\u000e|nzL\u0018%#.\u0019";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "{`J\u000e|nzL\u0018%#.\u0018";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "o{L\t`";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "AgM\\8>1";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "AdF\u001etkk\\\u0019(";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    break Label_0382;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        final char[] charArray2 = "]\\l=Q[.}=GRK\tYv>&\f\u000f%W@}9B[\\\t,WWCh.\\>El%)>+Z\\Q[V}\\KQZ\t2PRB\u0005\\ m.`2Q[Il.%ZKo=PRZ\tL,%".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c4 = charArray2[n4];
            char c5 = '\0';
            switch (n4 % 5) {
                default: {
                    c5 = '\u0005';
                    break;
                }
                case 0: {
                    c5 = '\u001e';
                    break;
                }
                case 1: {
                    c5 = '\u000e';
                    break;
                }
                case 2: {
                    c5 = ')';
                    break;
                }
                case 3: {
                    c5 = '|';
                    break;
                }
            }
            charArray2[n4] = (char)(c5 ^ c4);
        }
        final String intern2 = new String(charArray2).intern();
        final Object[] array2 = new Object[4];
        String s2 = "o{L\t`";
        int n5 = -1;
        Object[] array3 = array2;
        int n6 = 0;
        String intern3 = null;
    Label_0848:
        while (true) {
            final char[] charArray3 = s2.toCharArray();
            for (int k = charArray3.length, n7 = 0; k > n7; ++n7) {
                final char c6 = charArray3[n7];
                char c7 = '\0';
                switch (n7 % 5) {
                    default: {
                        c7 = '\u0005';
                        break;
                    }
                    case 0: {
                        c7 = '\u001e';
                        break;
                    }
                    case 1: {
                        c7 = '\u000e';
                        break;
                    }
                    case 2: {
                        c7 = ')';
                        break;
                    }
                    case 3: {
                        c7 = '|';
                        break;
                    }
                }
                charArray3[n7] = (char)(c7 ^ c6);
            }
            intern3 = new String(charArray3).intern();
            switch (n5) {
                default: {
                    array3[n6] = intern3;
                    s2 = "AgM";
                    n6 = 1;
                    array3 = array2;
                    n5 = 0;
                    continue;
                }
                case 0: {
                    array3[n6] = intern3;
                    s2 = "wzL\u0011";
                    n6 = 2;
                    array3 = array2;
                    n5 = 1;
                    continue;
                }
                case 1: {
                    array3[n6] = intern3;
                    n6 = 3;
                    array3 = array2;
                    s2 = "{`J\u000e|nzL\u0018";
                    n5 = 2;
                    continue;
                }
                case 2: {
                    break Label_0848;
                }
            }
        }
        array3[n6] = intern3;
        c = String.format(intern2, array2);
    }
    
    public n(final Context e, final String s, final d a, final c f) {
        final int d = n.d;
        this.b = new b(e, n.z[13] + s);
        this.e = e;
        this.a = a;
        this.f = f;
        if (org.whispersystems.jobqueue.a.a) {
            n.d = d + 1;
        }
    }
    
    static String a() {
        return n.c;
    }
    
    private List a(final o p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/jobqueue/n.d:I
        //     3: istore_3       
        //     4: new             Ljava/util/LinkedList;
        //     7: dup            
        //     8: invokespecial   java/util/LinkedList.<init>:()V
        //    11: astore          4
        //    13: aload_0        
        //    14: getfield        org/whispersystems/jobqueue/n.b:Lorg/whispersystems/jobqueue/b;
        //    17: invokevirtual   org/whispersystems/jobqueue/b.getReadableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    20: astore          5
        //    22: aload           5
        //    24: getstatic       org/whispersystems/jobqueue/n.z:[Ljava/lang/String;
        //    27: iconst_4       
        //    28: aaload         
        //    29: aconst_null    
        //    30: aload_2        
        //    31: aconst_null    
        //    32: aconst_null    
        //    33: aconst_null    
        //    34: getstatic       org/whispersystems/jobqueue/n.z:[Ljava/lang/String;
        //    37: bipush          6
        //    39: aaload         
        //    40: aconst_null    
        //    41: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    44: astore          9
        //    46: aload           9
        //    48: astore          7
        //    50: aload           7
        //    52: invokeinterface android/database/Cursor.moveToNext:()Z
        //    57: ifeq            190
        //    60: aload           7
        //    62: aload           7
        //    64: getstatic       org/whispersystems/jobqueue/n.z:[Ljava/lang/String;
        //    67: bipush          7
        //    69: aaload         
        //    70: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //    75: invokeinterface android/database/Cursor.getLong:(I)J
        //    80: lstore          11
        //    82: aload           7
        //    84: aload           7
        //    86: getstatic       org/whispersystems/jobqueue/n.z:[Ljava/lang/String;
        //    89: iconst_5       
        //    90: aaload         
        //    91: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //    96: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   101: astore          13
        //   103: aload           7
        //   105: aload           7
        //   107: getstatic       org/whispersystems/jobqueue/n.z:[Ljava/lang/String;
        //   110: bipush          8
        //   112: aaload         
        //   113: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //   118: invokeinterface android/database/Cursor.getInt:(I)I
        //   123: istore          15
        //   125: iload           15
        //   127: iconst_1       
        //   128: if_icmpne       227
        //   131: iconst_1       
        //   132: istore          16
        //   134: aload_0        
        //   135: getfield        org/whispersystems/jobqueue/n.a:Lorg/whispersystems/jobqueue/d;
        //   138: aload_1        
        //   139: iload           16
        //   141: aload           13
        //   143: invokeinterface org/whispersystems/jobqueue/d.a:(Lorg/whispersystems/jobqueue/o;ZLjava/lang/String;)Lorg/whispersystems/jobqueue/a;
        //   148: astore          19
        //   150: aload           19
        //   152: lload           11
        //   154: invokevirtual   org/whispersystems/jobqueue/a.a:(J)V
        //   157: aload           19
        //   159: aload_1        
        //   160: invokevirtual   org/whispersystems/jobqueue/a.a:(Lorg/whispersystems/jobqueue/o;)V
        //   163: aload_0        
        //   164: getfield        org/whispersystems/jobqueue/n.f:Lorg/whispersystems/jobqueue/c;
        //   167: aload_0        
        //   168: getfield        org/whispersystems/jobqueue/n.e:Landroid/content/Context;
        //   171: aload           19
        //   173: invokevirtual   org/whispersystems/jobqueue/c.a:(Landroid/content/Context;Lorg/whispersystems/jobqueue/a;)V
        //   176: aload           4
        //   178: aload           19
        //   180: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   185: pop            
        //   186: iload_3        
        //   187: ifeq            50
        //   190: aload           7
        //   192: ifnull          202
        //   195: aload           7
        //   197: invokeinterface android/database/Cursor.close:()V
        //   202: aload           4
        //   204: areturn        
        //   205: astore          14
        //   207: aload           14
        //   209: athrow         
        //   210: astore          6
        //   212: aload           7
        //   214: ifnull          224
        //   217: aload           7
        //   219: invokeinterface android/database/Cursor.close:()V
        //   224: aload           6
        //   226: athrow         
        //   227: iconst_0       
        //   228: istore          16
        //   230: goto            134
        //   233: astore          17
        //   235: getstatic       org/whispersystems/jobqueue/n.z:[Ljava/lang/String;
        //   238: iconst_3       
        //   239: aaload         
        //   240: aload           17
        //   242: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/Throwable;)I
        //   245: pop            
        //   246: aload_0        
        //   247: lload           11
        //   249: invokevirtual   org/whispersystems/jobqueue/n.a:(J)V
        //   252: goto            186
        //   255: astore          10
        //   257: aload           10
        //   259: athrow         
        //   260: astore          8
        //   262: aload           8
        //   264: athrow         
        //   265: astore          6
        //   267: aconst_null    
        //   268: astore          7
        //   270: goto            212
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  22     46     265    273    Any
        //  50     103    210    212    Any
        //  103    125    205    210    Ljava/io/IOException;
        //  103    125    210    212    Any
        //  134    186    233    255    Ljava/io/IOException;
        //  134    186    210    212    Any
        //  195    202    255    260    Ljava/io/IOException;
        //  207    210    210    212    Any
        //  217    224    260    265    Ljava/io/IOException;
        //  235    252    210    212    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 124, Size: 124
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
    
    public List a(final o o) {
        return this.a(o, n.z[10]);
    }
    
    public void a(final long n) {
        this.b.getWritableDatabase().delete(n.z[11], n.z[12], new String[] { String.valueOf(n) });
    }
    
    public void a(final a a) {
        final int d = n.d;
        final ContentValues contentValues = new ContentValues();
        contentValues.put(n.z[2], this.a.a(a));
        contentValues.put(n.z[1], a.k() != null);
        a.a(this.b.getWritableDatabase().insert(n.z[0], (String)null, contentValues));
        if (d != 0) {
            final boolean a2 = a.a;
            boolean a3 = false;
            if (!a2) {
                a3 = true;
            }
            a.a = a3;
        }
    }
    
    public List b() {
        return this.a(null, n.z[9]);
    }
}
