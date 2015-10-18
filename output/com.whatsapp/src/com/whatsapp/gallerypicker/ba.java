// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.database.ContentObserver;
import android.content.ContentUris;
import com.whatsapp.util.Log;
import android.support.v4.util.LruCache;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.regex.Pattern;

public abstract class ba implements aa
{
    private static final Pattern a;
    private static final String[] z;
    protected String b;
    protected Uri c;
    protected Cursor d;
    protected ContentResolver e;
    protected int f;
    private final LruCache g;
    protected boolean h;
    
    static {
        final String[] z2 = new String[7];
        String s = "3\u000bQoB2\u0007Fr\f;\u0016VcS*\u0007Zh\u0003)\u0006\\jF~\nPg@*\u0007CgW7\u0000R&@+\u001cFiQ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = '^';
                        break;
                    }
                    case 1: {
                        c2 = 'n';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = '\u0006';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "3\u000bQoB2\u0007Fr\f=\u001cPgW;-@tP1\u001c\u0015tF*\u001bGhP~\u0000@jO";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "3\u000bQoB2\u0007Fr\f7\n\u0015kJ-\u0003Tr@6";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "rNjoG";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "=\u000fFc\u00037\b[sO2FQgW;\u001aTmF0B\u0005/\u0003)\u0006Ph\u0003nNAnF0NQgW;1XiG7\b\\cGt_\u00056\u0013~\u000bYuF~\nTrF*\u000f^cM~\u000b[b";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "~*pU`";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "~/fE";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        final char[] charArray2 = "v@\u001f/\f\u0002\n\u001e".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = '#';
                    break;
                }
                case 0: {
                    c4 = '^';
                    break;
                }
                case 1: {
                    c4 = 'n';
                    break;
                }
                case 2: {
                    c4 = '5';
                    break;
                }
                case 3: {
                    c4 = '\u0006';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        a = Pattern.compile(new String(charArray2).intern());
    }
    
    public ba(final ContentResolver e, final Uri c, final int f, final String b) {
        this.g = new LruCache(512);
        this.h = false;
        this.f = f;
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = this.c();
        if (this.d == null) {
            Log.w(ba.z[1]);
        }
        this.g.trimToSize(0);
    }
    
    private Cursor d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/whatsapp/gallerypicker/ba.d:Landroid/database/Cursor;
        //     6: ifnonnull       13
        //     9: aload_0        
        //    10: monitorexit    
        //    11: aconst_null    
        //    12: areturn        
        //    13: aload_0        
        //    14: getfield        com/whatsapp/gallerypicker/ba.h:Z
        //    17: ifeq            35
        //    20: aload_0        
        //    21: getfield        com/whatsapp/gallerypicker/ba.d:Landroid/database/Cursor;
        //    24: invokeinterface android/database/Cursor.requery:()Z
        //    29: pop            
        //    30: aload_0        
        //    31: iconst_0       
        //    32: putfield        com/whatsapp/gallerypicker/ba.h:Z
        //    35: aload_0        
        //    36: getfield        com/whatsapp/gallerypicker/ba.d:Landroid/database/Cursor;
        //    39: astore_3       
        //    40: aload_0        
        //    41: monitorexit    
        //    42: aload_3        
        //    43: areturn        
        //    44: astore_1       
        //    45: aload_0        
        //    46: monitorexit    
        //    47: aload_1        
        //    48: athrow         
        //    49: astore_2       
        //    50: aload_2        
        //    51: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      11     44     49     Any
        //  13     35     49     52     Ljava/lang/IllegalStateException;
        //  13     35     44     49     Any
        //  35     42     44     49     Any
        //  45     47     44     49     Any
        //  50     52     44     49     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0013:
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
    
    public Uri a(final long n) {
        try {
            Label_0024: {
                if (ContentUris.parseId(this.c) == n) {
                    break Label_0024;
                }
                try {
                    Log.e(ba.z[2]);
                    return this.c;
                }
                catch (NumberFormatException ex) {
                    try {
                        throw ex;
                    }
                    catch (NumberFormatException ex2) {
                        return ContentUris.withAppendedId(this.c, n);
                    }
                }
            }
        }
        catch (NumberFormatException ex3) {}
    }
    
    @Override
    public bj a(final int n) {
        bj a = (bj)this.g.get(n);
        if (a == null) {
            final Cursor d = this.d();
            if (d == null) {
                return null;
            }
            while (true) {
                while (true) {
                    Label_0088: {
                        synchronized (this) {
                            if (!d.moveToPosition(n)) {
                                break Label_0088;
                            }
                            a = this.a(d);
                            Label_0069: {
                                if (a == null) {
                                    break Label_0069;
                                }
                                try {
                                    this.g.put(n, a);
                                }
                                catch (IllegalStateException ex) {
                                    throw ex;
                                }
                            }
                        }
                        break;
                    }
                    a = null;
                    continue;
                }
            }
        }
        return a;
    }
    
    protected abstract bj a(final Cursor p0);
    
    protected String a() {
        while (true) {
            while (true) {
                try {
                    if (this.f == 1) {
                        final String s = ba.z[6];
                        return ba.z[4] + s + ba.z[3] + s;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final String s = ba.z[5];
                continue;
            }
        }
    }
    
    @Override
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/whatsapp/gallerypicker/ba.b:()V
        //     4: aload_0        
        //     5: aconst_null    
        //     6: putfield        com/whatsapp/gallerypicker/ba.e:Landroid/content/ContentResolver;
        //     9: aload_0        
        //    10: getfield        com/whatsapp/gallerypicker/ba.d:Landroid/database/Cursor;
        //    13: ifnull          30
        //    16: aload_0        
        //    17: getfield        com/whatsapp/gallerypicker/ba.d:Landroid/database/Cursor;
        //    20: invokeinterface android/database/Cursor.close:()V
        //    25: aload_0        
        //    26: aconst_null    
        //    27: putfield        com/whatsapp/gallerypicker/ba.d:Landroid/database/Cursor;
        //    30: return         
        //    31: astore_1       
        //    32: getstatic       com/whatsapp/gallerypicker/ba.z:[Ljava/lang/String;
        //    35: iconst_0       
        //    36: aaload         
        //    37: aload_1        
        //    38: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    41: goto            4
        //    44: astore_2       
        //    45: aload_2        
        //    46: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      4      31     44     Ljava/lang/IllegalStateException;
        //  4      30     44     47     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0004:
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
    public void a(final ContentObserver contentObserver) {
    }
    
    public void b() {
        try {
            if (this.d == null) {
                return;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        this.d.deactivate();
        this.h = true;
    }
    
    @Override
    public void b(final ContentObserver contentObserver) {
    }
    
    protected abstract Cursor c();
    
    @Override
    public void c() {
    }
    
    @Override
    public boolean d() {
        try {
            if (this.e() == 0) {
                return true;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public int e() {
        final Cursor d = this.d();
        if (d == null) {
            return 0;
        }
        synchronized (this) {
            return d.getCount();
        }
    }
}
