// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.io.File;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

class ar9 extends SQLiteOpenHelper
{
    private static final String[] z;
    private final Context a;
    
    static {
        final String[] z2 = new String[29];
        String s = "c~Z\u0016Me\fJ\u0019PqyZwPnhZ\u000f9B^p jE^@>}\u007fEq3|X\fP\u00199SIl$pOBl\u007f{RCh$|Rsv30\u001b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0757:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0019';
                        break;
                    }
                    case 0: {
                        c2 = ' ';
                        break;
                    }
                    case 1: {
                        c2 = ',';
                        break;
                    }
                    case 2: {
                        c2 = '\u001f';
                        break;
                    }
                    case 3: {
                        c2 = 'W';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "c~Z\u0016Me\fK\u0016[li?$|S_v8wS\f7\bpD\fV\u0019MekZ\u00059p~V\u001aXru?\u001c\\y\f^\u0002MoeQ\u0014KeaZ\u0019M\fNm8nSIm\bpD\fK\u0012At\u0000l2zRIkwMetK{mOGz99tiG\u00035O_?\u0003\\xx35kO[l2k\u007fXf'|\u0000xZ\u000fM\f@~#9ri^\u001b5LCqwKemS{xCOj%xCU?\u0005\\a`3'uAOz\bwAAzwMetK{uA_k\bxCXv!|\u0000eQ\u0003\\giM{mIAz8lT\f]\u0018Vli^\u00195ETo>kAXv8w\u0000eQ\u0003\\giM~\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "d~P\u00079tm]\u001b\\\u0000eYw\\xeL\u0003J\u0000_z$jICq$";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "WI}$|S_v8wSXp%|\u000fHz;|TI23xTM}6jE\u0003m2jU@kj<B";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "WI}$|S_v8wSXp%|\u000fHz;|TI23xTM}6jE";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "WI}$|S_v8wSXp%|\u000fHp wG^~3|\u0000Jm8t\u0000";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0000Xpw";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "WI}\bjE_l>vN_13{";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "WI}\bjE_l>vN_13{";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "a`K\u0012K\u0000x^\u0015Ue\fl2jSEp9j\u0000m[\u00139TEr2vUX?\u0015Vo`Z\u0016W";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "WI}$|S_v8wSXp%|\u000fYo0kAHzwlNGq8nN\fp;}\u0000Zz%jICq";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0000Xpw";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "WI}$|S_v8wSXp%|\u000fYo0kAHzw\u007fRCrw";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "a`K\u0012K\u0000x^\u0015Ue\fl2jSEp9j\u0000m[\u00139ETo>kAXv8w\u0000eQ\u0003\\giM";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "WI}$|S_v8wSXp%|\u000f_k6zKCi2kF@p |R^p%6CCm%lPX0%|MCi>wG";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "WI}$|S_v8wSXp%|\u000fOp%kU\\kxkEAp!pNK";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "OB\\8kRYo#pOB";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "WI}$|S_v8wSXp%|\u000f_k6zKCi2kF@p |R^p%";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "WI}$|S_v8wSXp%|\u000fIq4kY\\k2}\u000f^z:vVEq0";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "WI}$|S_v8wSXp%|\u000f_h>mCDv9~\rXpznREk6{LI";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "FEs29I_?2wC^f'mEH";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "U\\x%xDI?%|AH28wLU?3xTM}6jE";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "OB\\8kRYo#pOB";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "WI}$|S_v8wSXp%|\u000f_k6zKCi2kF@p |R^p%6CCm%lPX0%|MCi>wG";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "WI}$|S_v8wSXp%|\u000f_k6zKCi2kF@p |R^p%";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    s = "WI}$|S_v8wSXp%|\u000fOp%kU\\kxkEAp!pNK";
                    n = 24;
                    n2 = 25;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    array = z2;
                    s = "FEs29I_?2wC^f'mEH";
                    n = 25;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "WI}$|S_v8wSXp%|\u000fIq4kY\\k2}\u000f^z:vVEq0";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\rFp\"kNMs";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    break Label_0757;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ar9(final Context a) {
        super(a, ar9.z[7], (SQLiteDatabase$CursorFactory)null, 2);
        this.a = a;
    }
    
    private File a() {
        final File c = this.c();
        return new File(c.getPath(), c.getName() + ar9.z[28]);
    }
    
    private File c() {
        return this.a.getDatabasePath(ar9.z[8]);
    }
    
    boolean b() {
        synchronized (this) {
            this.close();
            Log.i(ar9.z[4]);
            final boolean delete = this.c().delete();
            this.a().delete();
            Log.c(ar9.z[3], null, new Object[] { delete });
            return delete;
        }
    }
    
    public SQLiteDatabase getReadableDatabase() {
        final boolean i = App.I;
        try {
            return super.getReadableDatabase();
        }
        catch (SQLiteDatabaseCorruptException ex5) {
            Log.w(ar9.z[15]);
            this.b();
            return super.getReadableDatabase();
        }
        catch (SQLiteException ex) {
            final String string = ex.toString();
            try {
                if (string.contains(ar9.z[20])) {
                    Log.w(ar9.z[18]);
                    this.b();
                    return super.getReadableDatabase();
                }
            }
            catch (SQLiteDatabaseCorruptException ex2) {
                throw ex2;
            }
            try {
                if (string.contains(ar9.z[21])) {
                    Log.w(ar9.z[19]);
                    return this.getWritableDatabase();
                }
            }
            catch (SQLiteDatabaseCorruptException ex3) {
                throw ex3;
            }
            throw ex;
        }
        catch (StackOverflowError stackOverflowError) {
            Log.w(ar9.z[17]);
            final StackTraceElement[] stackTrace = stackOverflowError.getStackTrace();
            final int length = stackTrace.length;
            int j = 0;
            while (j < length) {
                final StackTraceElement stackTraceElement = stackTrace[j];
                try {
                    if (stackTraceElement.getMethodName().equals(ar9.z[16])) {
                        Log.w(ar9.z[14]);
                        this.b();
                        return super.getReadableDatabase();
                    }
                }
                catch (SQLiteDatabaseCorruptException ex4) {
                    throw ex4;
                }
                ++j;
                if (i) {
                    break;
                }
            }
            throw stackOverflowError;
        }
    }
    
    public SQLiteDatabase getWritableDatabase() {
        final boolean i = App.I;
        try {
            return super.getWritableDatabase();
        }
        catch (SQLiteDatabaseCorruptException ex4) {
            Log.w(ar9.z[25]);
            this.b();
            return super.getWritableDatabase();
        }
        catch (SQLiteException ex) {
            try {
                if (ex.toString().contains(ar9.z[26])) {
                    Log.w(ar9.z[27]);
                    this.b();
                    return super.getWritableDatabase();
                }
            }
            catch (SQLiteDatabaseCorruptException ex2) {
                throw ex2;
            }
            throw ex;
        }
        catch (StackOverflowError stackOverflowError) {
            Log.w(ar9.z[24]);
            final StackTraceElement[] stackTrace = stackOverflowError.getStackTrace();
            final int length = stackTrace.length;
            int j = 0;
            while (j < length) {
                final StackTraceElement stackTraceElement = stackTrace[j];
                try {
                    if (stackTraceElement.getMethodName().equals(ar9.z[22])) {
                        Log.w(ar9.z[23]);
                        this.b();
                        return super.getWritableDatabase();
                    }
                }
                catch (SQLiteDatabaseCorruptException ex3) {
                    throw ex3;
                }
                ++j;
                if (i) {
                    break;
                }
            }
            throw stackOverflowError;
        }
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(ar9.z[2]);
        sqLiteDatabase.execSQL(ar9.z[1]);
        sqLiteDatabase.execSQL(ar9.z[0]);
    }
    
    public void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        Log.i(ar9.z[5] + n + ar9.z[6] + n2);
        this.onCreate(sqLiteDatabase);
    }
    
    public void onUpgrade(final SQLiteDatabase p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/ar9.z:[Ljava/lang/String;
        //    10: bipush          12
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: iload_2        
        //    17: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    20: getstatic       com/whatsapp/ar9.z:[Ljava/lang/String;
        //    23: bipush          11
        //    25: aaload         
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: iload_3        
        //    30: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    33: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    36: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    39: iload_2        
        //    40: tableswitch {
        //                2: 75
        //          default: 60
        //        }
        //    60: getstatic       com/whatsapp/ar9.z:[Ljava/lang/String;
        //    63: bipush          10
        //    65: aaload         
        //    66: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    69: aload_0        
        //    70: aload_1        
        //    71: invokevirtual   com/whatsapp/ar9.onCreate:(Landroid/database/sqlite/SQLiteDatabase;)V
        //    74: return         
        //    75: aload_1        
        //    76: getstatic       com/whatsapp/ar9.z:[Ljava/lang/String;
        //    79: bipush          9
        //    81: aaload         
        //    82: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    85: aload_1        
        //    86: getstatic       com/whatsapp/ar9.z:[Ljava/lang/String;
        //    89: bipush          13
        //    91: aaload         
        //    92: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    95: getstatic       com/whatsapp/App.I:Z
        //    98: ifeq            114
        //   101: goto            60
        //   104: astore          4
        //   106: aload           4
        //   108: athrow         
        //   109: astore          5
        //   111: aload           5
        //   113: athrow         
        //   114: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      39     104    109    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  60     74     109    114    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  75     101    109    114    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  106    109    109    114    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0060:
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
}
