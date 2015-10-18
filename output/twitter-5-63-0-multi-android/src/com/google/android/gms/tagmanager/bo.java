// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executors;
import com.google.android.gms.internal.bg;
import com.google.android.gms.internal.bf;
import android.content.Context;
import java.util.concurrent.Executor;

class bo implements i
{
    private static final String a;
    private final Executor b;
    private final Context c;
    private br d;
    private bf e;
    private int f;
    
    static {
        a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", "datalayer", "ID", "key", "value", "expires");
    }
    
    public bo(final Context context) {
        this(context, bg.b(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
    }
    
    bo(final Context c, final bf e, final String s, final int f, final Executor b) {
        this.c = c;
        this.e = e;
        this.f = f;
        this.b = b;
        this.d = new br(this, this.c, s);
    }
    
    private SQLiteDatabase a(final String s) {
        try {
            return this.d.getWritableDatabase();
        }
        catch (SQLiteException ex) {
            z.b(s);
            return null;
        }
    }
    
    private Object a(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/ByteArrayInputStream;
        //     3: dup            
        //     4: aload_1        
        //     5: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //     8: astore_2       
        //     9: new             Ljava/io/ObjectInputStream;
        //    12: dup            
        //    13: aload_2        
        //    14: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    17: astore_3       
        //    18: aload_3        
        //    19: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    22: astore          10
        //    24: aload_3        
        //    25: ifnull          32
        //    28: aload_3        
        //    29: invokevirtual   java/io/ObjectInputStream.close:()V
        //    32: aload_2        
        //    33: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //    36: aload           10
        //    38: areturn        
        //    39: astore          14
        //    41: aconst_null    
        //    42: astore_3       
        //    43: aload_3        
        //    44: ifnull          51
        //    47: aload_3        
        //    48: invokevirtual   java/io/ObjectInputStream.close:()V
        //    51: aload_2        
        //    52: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //    55: aconst_null    
        //    56: areturn        
        //    57: astore          5
        //    59: aconst_null    
        //    60: areturn        
        //    61: astore          13
        //    63: aconst_null    
        //    64: astore_3       
        //    65: aload_3        
        //    66: ifnull          73
        //    69: aload_3        
        //    70: invokevirtual   java/io/ObjectInputStream.close:()V
        //    73: aload_2        
        //    74: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //    77: aconst_null    
        //    78: areturn        
        //    79: astore          7
        //    81: aconst_null    
        //    82: areturn        
        //    83: astore          12
        //    85: aconst_null    
        //    86: astore_3       
        //    87: aload           12
        //    89: astore          8
        //    91: aload_3        
        //    92: ifnull          99
        //    95: aload_3        
        //    96: invokevirtual   java/io/ObjectInputStream.close:()V
        //    99: aload_2        
        //   100: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   103: aload           8
        //   105: athrow         
        //   106: astore          9
        //   108: goto            103
        //   111: astore          8
        //   113: goto            91
        //   116: astore          6
        //   118: goto            65
        //   121: astore          4
        //   123: goto            43
        //   126: astore          11
        //   128: aload           10
        //   130: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  9      18     39     43     Ljava/io/IOException;
        //  9      18     61     65     Ljava/lang/ClassNotFoundException;
        //  9      18     83     91     Any
        //  18     24     121    126    Ljava/io/IOException;
        //  18     24     116    121    Ljava/lang/ClassNotFoundException;
        //  18     24     111    116    Any
        //  28     32     126    131    Ljava/io/IOException;
        //  32     36     126    131    Ljava/io/IOException;
        //  47     51     57     61     Ljava/io/IOException;
        //  51     55     57     61     Ljava/io/IOException;
        //  69     73     79     83     Ljava/io/IOException;
        //  73     77     79     83     Ljava/io/IOException;
        //  95     99     106    111    Ljava/io/IOException;
        //  99     103    106    111    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 73, Size: 73
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
    
    private List a(final List list) {
        final ArrayList<g> list2 = new ArrayList<g>();
        for (final bs bs : list) {
            list2.add(new g(bs.a, this.a(bs.b)));
        }
        return list2;
    }
    
    private void a(final int n) {
        final int n2 = n + (this.d() - this.f);
        if (n2 > 0) {
            final List b = this.b(n2);
            z.c("DataLayer store full, deleting " + b.size() + " entries to make room.");
            this.a(b.toArray(new String[0]));
        }
    }
    
    private void a(final long n) {
        final SQLiteDatabase a = this.a("Error opening database for deleteOlderThan.");
        if (a == null) {
            return;
        }
        try {
            z.d("Deleted " + a.delete("datalayer", "expires <= ?", new String[] { Long.toString(n) }) + " expired items");
        }
        catch (SQLiteException ex) {
            z.b("Error deleting old entries.");
        }
    }
    
    private void a(final String[] array) {
        if (array != null && array.length != 0) {
            final SQLiteDatabase a = this.a("Error opening database for deleteEntries.");
            if (a != null) {
                final String format = String.format("%s in (%s)", "ID", TextUtils.join((CharSequence)",", (Iterable)Collections.nCopies(array.length, "?")));
                try {
                    a.delete("datalayer", format, array);
                }
                catch (SQLiteException ex) {
                    z.b("Error deleting entries " + Arrays.toString(array));
                }
            }
        }
    }
    
    private byte[] a(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/ByteArrayOutputStream;
        //     3: dup            
        //     4: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //     7: astore_2       
        //     8: new             Ljava/io/ObjectOutputStream;
        //    11: dup            
        //    12: aload_2        
        //    13: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    16: astore_3       
        //    17: aload_3        
        //    18: aload_1        
        //    19: invokevirtual   java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
        //    22: aload_2        
        //    23: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //    26: astore          8
        //    28: aload_3        
        //    29: ifnull          36
        //    32: aload_3        
        //    33: invokevirtual   java/io/ObjectOutputStream.close:()V
        //    36: aload_2        
        //    37: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //    40: aload           8
        //    42: areturn        
        //    43: astore          11
        //    45: aconst_null    
        //    46: astore_3       
        //    47: aload_3        
        //    48: ifnull          55
        //    51: aload_3        
        //    52: invokevirtual   java/io/ObjectOutputStream.close:()V
        //    55: aload_2        
        //    56: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //    59: aconst_null    
        //    60: areturn        
        //    61: astore          5
        //    63: aconst_null    
        //    64: areturn        
        //    65: astore          10
        //    67: aconst_null    
        //    68: astore_3       
        //    69: aload           10
        //    71: astore          6
        //    73: aload_3        
        //    74: ifnull          81
        //    77: aload_3        
        //    78: invokevirtual   java/io/ObjectOutputStream.close:()V
        //    81: aload_2        
        //    82: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //    85: aload           6
        //    87: athrow         
        //    88: astore          7
        //    90: goto            85
        //    93: astore          6
        //    95: goto            73
        //    98: astore          4
        //   100: goto            47
        //   103: astore          9
        //   105: aload           8
        //   107: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      17     43     47     Ljava/io/IOException;
        //  8      17     65     73     Any
        //  17     28     98     103    Ljava/io/IOException;
        //  17     28     93     98     Any
        //  32     36     103    108    Ljava/io/IOException;
        //  36     40     103    108    Ljava/io/IOException;
        //  51     55     61     65     Ljava/io/IOException;
        //  55     59     61     65     Ljava/io/IOException;
        //  77     81     88     93     Ljava/io/IOException;
        //  81     85     88     93     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
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
    
    private List b() {
        try {
            this.a(this.e.a());
            return this.a(this.c());
        }
        finally {
            this.e();
        }
    }
    
    private List b(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/util/ArrayList;
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_2       
        //     8: iload_1        
        //     9: ifgt            20
        //    12: ldc_w           "Invalid maxEntries specified. Skipping."
        //    15: invokestatic    com/google/android/gms/tagmanager/z.b:(Ljava/lang/String;)V
        //    18: aload_2        
        //    19: areturn        
        //    20: aload_0        
        //    21: ldc_w           "Error opening database for peekEntryIds."
        //    24: invokespecial   com/google/android/gms/tagmanager/bo.a:(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
        //    27: astore_3       
        //    28: aload_3        
        //    29: ifnonnull       34
        //    32: aload_2        
        //    33: areturn        
        //    34: aload_3        
        //    35: ldc             "datalayer"
        //    37: iconst_1       
        //    38: anewarray       Ljava/lang/String;
        //    41: dup            
        //    42: iconst_0       
        //    43: ldc             "ID"
        //    45: aastore        
        //    46: aconst_null    
        //    47: aconst_null    
        //    48: aconst_null    
        //    49: aconst_null    
        //    50: ldc_w           "%s ASC"
        //    53: iconst_1       
        //    54: anewarray       Ljava/lang/Object;
        //    57: dup            
        //    58: iconst_0       
        //    59: ldc             "ID"
        //    61: aastore        
        //    62: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    65: iload_1        
        //    66: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    69: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    72: astore          7
        //    74: aload           7
        //    76: astore          5
        //    78: aload           5
        //    80: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    85: ifeq            120
        //    88: aload_2        
        //    89: aload           5
        //    91: iconst_0       
        //    92: invokeinterface android/database/Cursor.getLong:(I)J
        //    97: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   100: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   105: pop            
        //   106: aload           5
        //   108: invokeinterface android/database/Cursor.moveToNext:()Z
        //   113: istore          9
        //   115: iload           9
        //   117: ifne            88
        //   120: aload           5
        //   122: ifnull          132
        //   125: aload           5
        //   127: invokeinterface android/database/Cursor.close:()V
        //   132: aload_2        
        //   133: areturn        
        //   134: astore          6
        //   136: aconst_null    
        //   137: astore          5
        //   139: new             Ljava/lang/StringBuilder;
        //   142: dup            
        //   143: invokespecial   java/lang/StringBuilder.<init>:()V
        //   146: ldc_w           "Error in peekEntries fetching entryIds: "
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: aload           6
        //   154: invokevirtual   android/database/sqlite/SQLiteException.getMessage:()Ljava/lang/String;
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   160: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   163: invokestatic    com/google/android/gms/tagmanager/z.b:(Ljava/lang/String;)V
        //   166: aload           5
        //   168: ifnull          132
        //   171: aload           5
        //   173: invokeinterface android/database/Cursor.close:()V
        //   178: goto            132
        //   181: astore          4
        //   183: aconst_null    
        //   184: astore          5
        //   186: aload           5
        //   188: ifnull          198
        //   191: aload           5
        //   193: invokeinterface android/database/Cursor.close:()V
        //   198: aload           4
        //   200: athrow         
        //   201: astore          4
        //   203: goto            186
        //   206: astore          6
        //   208: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  34     74     134    139    Landroid/database/sqlite/SQLiteException;
        //  34     74     181    186    Any
        //  78     88     206    211    Landroid/database/sqlite/SQLiteException;
        //  78     88     201    206    Any
        //  88     115    206    211    Landroid/database/sqlite/SQLiteException;
        //  88     115    201    206    Any
        //  139    166    201    206    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
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
    
    private List b(final List list) {
        final ArrayList<bs> list2 = new ArrayList<bs>();
        for (final g g : list) {
            list2.add(new bs(g.a, this.a(g.b)));
        }
        return list2;
    }
    
    private void b(final List list, final long n) {
        // monitorenter(this)
        try {
            final long a = this.e.a();
            this.a(a);
            this.a(list.size());
            this.c(list, a + n);
            return;
        }
        finally {
            this.e();
        }
        try {}
        finally {
        }
        // monitorexit(this)
    }
    
    private List c() {
        final SQLiteDatabase a = this.a("Error opening database for loadSerialized.");
        final ArrayList<bs> list = new ArrayList<bs>();
        if (a == null) {
            return list;
        }
        final Cursor query = a.query("datalayer", new String[] { "key", "value" }, (String)null, (String[])null, (String)null, (String)null, "ID", (String)null);
        try {
            while (query.moveToNext()) {
                list.add(new bs(query.getString(0), query.getBlob(1)));
            }
        }
        finally {
            query.close();
        }
        query.close();
        return list;
    }
    
    private void c(final List list, final long n) {
        final SQLiteDatabase a = this.a("Error opening database for writeEntryToDatabase.");
        if (a != null) {
            for (final bs bs : list) {
                final ContentValues contentValues = new ContentValues();
                contentValues.put("expires", n);
                contentValues.put("key", bs.a);
                contentValues.put("value", bs.b);
                a.insert("datalayer", (String)null, contentValues);
            }
        }
    }
    
    private int d() {
        Cursor rawQuery = null;
        final SQLiteDatabase a = this.a("Error opening database for getNumStoredEntries.");
        int n = 0;
        if (a == null) {
            return n;
        }
        try {
            rawQuery = a.rawQuery("SELECT COUNT(*) from datalayer", (String[])null);
            final boolean moveToFirst = rawQuery.moveToFirst();
            n = 0;
            if (moveToFirst) {
                n = (int)rawQuery.getLong(0);
            }
            return n;
        }
        catch (SQLiteException ex) {
            z.b("Error getting numStoredEntries");
            n = 0;
            return 0;
        }
        finally {
            if (rawQuery != null) {
                rawQuery.close();
            }
        }
    }
    
    private void e() {
        try {
            this.d.close();
        }
        catch (SQLiteException ex) {}
    }
    
    @Override
    public void a(final j j) {
        this.b.execute(new bq(this, j));
    }
    
    @Override
    public void a(final List list, final long n) {
        this.b.execute(new bp(this, this.b(list), n));
    }
}
