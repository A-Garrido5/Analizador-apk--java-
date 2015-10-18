// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import android.content.ContentResolver;
import android.os.Handler;
import android.annotation.SuppressLint;
import android.support.v4.util.LruCache;

public class a_
{
    @SuppressLint({ "NewApi" })
    private static LruCache c;
    private static final String[] z;
    private Handler a;
    private ContentResolver b;
    private Thread d;
    private boolean e;
    private final ArrayList f;
    
    static {
        final String[] z2 = new String[2];
        String s = "pM@5\u000buO@6\u000bk\u000fB3\rqER;\u0014|\u001a";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'n';
                        break;
                    }
                    case 0: {
                        c2 = '\u0019';
                        break;
                    }
                    case 1: {
                        c2 = ' ';
                        break;
                    }
                    case 2: {
                        c2 = '!';
                        break;
                    }
                    case 3: {
                        c2 = 'R';
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
                    array = z2;
                    s = "pM@5\u000b4LN3\n|R";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a_.c = new p((int)(Runtime.getRuntime().maxMemory() / 1024L / 8L));
    }
    
    public a_(final ContentResolver b, final Handler a) {
        this.f = new ArrayList();
        this.b = b;
        this.a = a;
        this.c();
        Log.i(a_.z[0] + a_.c.maxSize());
    }
    
    public static void a() {
        a_.c.trimToSize(-1);
    }
    
    public static void a(final String s) {
        a_.c.remove(s);
    }
    
    static boolean a(final a_ a_) {
        return a_.e;
    }
    
    static Handler b(final a_ a_) {
        return a_.a;
    }
    
    static LruCache b() {
        return a_.c;
    }
    
    static ArrayList c(final a_ a_) {
        return a_.f;
    }
    
    private void c() {
        if (this.d != null) {
            return;
        }
        this.e = false;
        final Thread d = new Thread(new i(this, null));
        d.setName(a_.z[1]);
        (this.d = d).start();
    }
    
    public void a(final b8 b8, final b5 b9) {
        if (this.d == null) {
            this.c();
        }
        final String a = b8.a();
        Bitmap bitmap = null;
        if (a != null) {
            bitmap = (Bitmap)a_.c.get(b8.a());
        }
        if (bitmap != null) {
            b9.a(bitmap, true);
            if (MediaGalleryBase.v == 0) {
                return;
            }
        }
        b9.a();
        synchronized (this.f) {
            this.f.add(new z(b8, b9));
            this.f.notifyAll();
        }
    }
    
    public boolean a(final b8 b8) {
        final int v = MediaGalleryBase.v;
        if (b8 == null) {
            return false;
        }
        final ArrayList f = this.f;
        // monitorenter(f)
        int n = -1;
        int n2 = 0;
        while (true) {
            int n3 = 0;
            while (true) {
                Label_0123: {
                    Label_0116: {
                        Label_0109: {
                            Label_0102: {
                                try {
                                    if (n2 >= this.f.size()) {
                                        break Label_0116;
                                    }
                                    if (((z)this.f.get(n2)).a != b8) {
                                        break Label_0109;
                                    }
                                    if (v != 0) {
                                        n3 = n2;
                                        break Label_0123;
                                    }
                                    break Label_0102;
                                    // iftrue(Label_0091:, n3 < 0)
                                    this.f.remove(n3);
                                    return true;
                                }
                                finally {
                                }
                                // monitorexit(f)
                                break;
                            }
                            n3 = n2;
                            continue;
                        }
                        n3 = n;
                        break Label_0123;
                    }
                    n3 = n;
                    continue;
                }
                ++n2;
                if (v != 0) {
                    continue;
                }
                break;
            }
            n = n3;
        }
        Label_0091: {
            return false;
        }
    }
    // monitorexit(f)
    
    public void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gallerypicker/a_.f:Ljava/util/ArrayList;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: iconst_1       
        //     9: putfield        com/whatsapp/gallerypicker/a_.e:Z
        //    12: aload_0        
        //    13: getfield        com/whatsapp/gallerypicker/a_.f:Ljava/util/ArrayList;
        //    16: invokevirtual   java/lang/Object.notifyAll:()V
        //    19: aload_1        
        //    20: monitorexit    
        //    21: aload_0        
        //    22: getfield        com/whatsapp/gallerypicker/a_.d:Ljava/lang/Thread;
        //    25: ifnull          56
        //    28: aload_0        
        //    29: getfield        com/whatsapp/gallerypicker/a_.d:Ljava/lang/Thread;
        //    32: astore          4
        //    34: invokestatic    com/whatsapp/gallerypicker/a2.a:()Lcom/whatsapp/gallerypicker/a2;
        //    37: aload           4
        //    39: aload_0        
        //    40: getfield        com/whatsapp/gallerypicker/a_.b:Landroid/content/ContentResolver;
        //    43: invokevirtual   com/whatsapp/gallerypicker/a2.a:(Ljava/lang/Thread;Landroid/content/ContentResolver;)V
        //    46: aload           4
        //    48: invokevirtual   java/lang/Thread.join:()V
        //    51: aload_0        
        //    52: aconst_null    
        //    53: putfield        com/whatsapp/gallerypicker/a_.d:Ljava/lang/Thread;
        //    56: return         
        //    57: astore_2       
        //    58: aload_1        
        //    59: monitorexit    
        //    60: aload_2        
        //    61: athrow         
        //    62: astore_3       
        //    63: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      21     57     62     Any
        //  28     56     62     64     Ljava/lang/InterruptedException;
        //  58     60     57     62     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
