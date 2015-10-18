// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.io.InputStream;
import java.io.FileInputStream;
import com.twitter.util.f;
import java.io.OutputStream;
import java.io.IOException;
import com.twitter.errorreporter.ErrorReporter;
import java.io.File;
import com.twitter.library.util.af;
import com.twitter.util.d;
import com.twitter.library.util.ReferenceMap;
import android.content.Context;
import java.io.Closeable;

public class a implements Closeable
{
    private static final c a;
    private final Context b;
    private final String c;
    private final int d;
    private final int e;
    private final int f;
    private final ReferenceMap g;
    private yx h;
    private boolean i;
    
    static {
        a = new c(null);
    }
    
    public a(final Context b, final String c, final int d, final int e, final int f) {
        this.g = ReferenceMap.a();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private yx a(final boolean b) {
        while (true) {
            while (true) {
                Label_0213: {
                    while (true) {
                        File file = null;
                        Label_0206: {
                            synchronized (this) {
                                com.twitter.util.d.c();
                                Label_0169: {
                                    if (this.i || (this.h != null && !this.h.a())) {
                                        break Label_0169;
                                    }
                                    final File a = af.a(this.b);
                                    if (a == null) {
                                        break Label_0213;
                                    }
                                    file = new File(a, this.c);
                                    Label_0178: {
                                        if (!file.mkdirs() && !file.exists()) {
                                            break Label_0178;
                                        }
                                        int n = this.e;
                                        if (file != null) {
                                            break Label_0206;
                                        }
                                        final File cacheDir = this.b.getCacheDir();
                                        if (cacheDir == null) {
                                            break Label_0206;
                                        }
                                        final File file2 = new File(cacheDir, this.c);
                                        if (!file2.mkdirs()) {
                                            final boolean exists = file2.exists();
                                            final File file3 = null;
                                            if (!exists) {
                                                break Label_0147;
                                            }
                                        }
                                        n = this.f;
                                        final File file3 = file2;
                                        if (file3 == null) {
                                            break Label_0169;
                                        }
                                        try {
                                            this.h = yx.a(file3, this.d, 1, n);
                                            return this.h;
                                            n = 0;
                                            file = null;
                                        }
                                        catch (IOException ex) {
                                            if (!b) {
                                                ErrorReporter.a(ex);
                                                return this.h;
                                            }
                                            return this.h;
                                        }
                                    }
                                }
                            }
                        }
                        final File file3 = file;
                        continue;
                    }
                }
                int n = 0;
                File file = null;
                continue;
            }
        }
    }
    
    private void a(final yz yz, final boolean b) {
        synchronized (this) {
            com.twitter.util.d.c();
            final yx a = this.a(false);
            if (a == null) {
                return;
            }
            Label_0033: {
                if (!b) {
                    break Label_0033;
                }
                try {
                    yz.b();
                    a.b();
                    return;
                    yz.c();
                }
                catch (IOException ex) {
                    ErrorReporter.a(ex);
                }
            }
        }
    }
    
    private boolean a(final String s, final Object o, final g g, final boolean b) {
        com.twitter.util.d.c();
        final File e = this.e(s);
        boolean b2 = false;
        if (e == null) {
            return b2;
        }
        Label_0197: {
            while (true) {
            Label_0152:
                while (true) {
                    final yz f;
                    OutputStream a;
                    synchronized (e) {
                        f = this.f(s);
                        if (f == null) {
                            break Label_0197;
                        }
                        a = null;
                        try {
                            a = f.a(0);
                            final boolean a2 = g.a(o, a);
                            yh.a(a);
                            this.a(f, a2);
                            if (a2) {
                                b2 = true;
                                return b2;
                            }
                            break Label_0152;
                        }
                        catch (Exception ex) {
                            if (!f.a()) {
                                throw ex;
                            }
                        }
                        finally {
                            yh.a(a);
                            this.a(f, false);
                        }
                    }
                    if (!b) {
                        final Exception ex;
                        ErrorReporter.a(ex);
                    }
                    yh.a(a);
                    this.a(f, false);
                    final boolean a2 = false;
                    continue;
                }
                if (b) {
                    break;
                }
                break Label_0197;
            }
            while (true) {
                try {
                    try {
                        this.h.close();
                        this.a(false);
                        // monitorexit(this)
                        return this.a(s, o, g, false);
                    }
                    finally {
                    }
                    // monitorexit(this)
                    // monitorexit(e)
                    return false;
                }
                catch (IOException ex2) {
                    continue;
                }
                break;
            }
        }
    }
    // monitorenter(this)
    
    private File e(final String s) {
        com.twitter.util.d.c();
        synchronized (this.g) {
            File a = (File)this.g.a(s);
            if (a == null) {
                final yx a2 = this.a(false);
                if (a2 != null) {
                    a = a2.a(g(s), 0, false);
                    this.g.a(s, a);
                }
            }
            return a;
        }
    }
    
    private yz f(final String s) {
        synchronized (this) {
            com.twitter.util.d.c();
            final yx a = this.a(false);
            if (a == null) {
                return null;
            }
            try {
                return a.b(g(s));
            }
            catch (IOException ex) {
                ErrorReporter.a(ex);
            }
            return null;
        }
    }
    
    private static String g(final String s) {
        final String a = f.a(s);
        if (a != null) {
            return a;
        }
        final int length = s.length();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 < '\u0080' && (char1 == '_' || Character.isLetterOrDigit(char1))) {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public File a(final String s) {
        com.twitter.util.d.c();
        final File e = this.e(s);
        if (e == null || !e.exists()) {
            return null;
        }
        this.b(s);
        if (e.exists()) {
            return e;
        }
        return null;
    }
    
    public Object a(final String s, final com.twitter.library.media.manager.f f) {
        com.twitter.util.d.c();
        final File a = this.a(s);
        if (a != null) {
            synchronized (a) {
                final Object b = f.b(a);
                // monitorexit(a)
                if (b == null) {
                    this.d(s);
                }
                return b;
            }
        }
        return null;
    }
    
    public boolean a(final String s, final File file) {
        final FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return this.a(s, fileInputStream);
        }
        finally {
            yh.a((Closeable)fileInputStream);
        }
    }
    
    public boolean a(final String s, final InputStream inputStream) {
        com.twitter.util.d.c();
        return this.a(s, inputStream, com.twitter.library.media.manager.a.a, true);
    }
    
    public boolean a(final String s, final Object o) {
        return this.a(s, o, new e(null), true);
    }
    
    public boolean a(final String s, final Object o, final g g) {
        com.twitter.util.d.c();
        return this.a(s, o, g, true);
    }
    
    public boolean b(final String s) {
        synchronized (this) {
            com.twitter.util.d.c();
            final yx a = this.a(false);
            boolean a2 = false;
            if (a == null) {
                return a2;
            }
            try {
                a2 = a.a(g(s));
                return a2;
            }
            catch (IOException ex) {
                ErrorReporter.a(ex);
                a2 = false;
            }
        }
    }
    
    public Object c(final String s) {
        return this.a(s, new com.twitter.library.media.manager.d(null));
    }
    
    @Override
    public void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/twitter/library/media/manager/a.h:Lyx;
        //     6: astore_2       
        //     7: aload_2        
        //     8: ifnull          23
        //    11: aload_0        
        //    12: getfield        com/twitter/library/media/manager/a.h:Lyx;
        //    15: invokevirtual   yx.close:()V
        //    18: aload_0        
        //    19: aconst_null    
        //    20: putfield        com/twitter/library/media/manager/a.h:Lyx;
        //    23: aload_0        
        //    24: iconst_1       
        //    25: putfield        com/twitter/library/media/manager/a.i:Z
        //    28: aload_0        
        //    29: monitorexit    
        //    30: return         
        //    31: astore_1       
        //    32: aload_0        
        //    33: monitorexit    
        //    34: aload_1        
        //    35: athrow         
        //    36: astore_3       
        //    37: goto            18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      7      31     36     Any
        //  11     18     36     40     Ljava/io/IOException;
        //  11     18     31     36     Any
        //  18     23     31     36     Any
        //  23     28     31     36     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
    
    public boolean d(final String s) {
        synchronized (this) {
            com.twitter.util.d.c();
            final yx a = this.a(false);
            boolean b = false;
            if (a == null) {
                return b;
            }
            final File e = this.e(s);
            b = false;
            if (e == null) {
                return b;
            }
            synchronized (e) {
                while (true) {
                    try {
                        if (a.c(g(s))) {
                            a.b();
                            b = true;
                            return b;
                        }
                    }
                    catch (IOException ex) {
                        ErrorReporter.a(ex);
                    }
                    // monitorexit(e)
                    b = false;
                    return b;
                }
            }
        }
    }
}
