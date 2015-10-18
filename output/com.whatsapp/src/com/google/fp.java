// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class fp extends fx
{
    private static final String z;
    private dg a;
    private aX b;
    private ce c;
    private boolean d;
    
    static {
        final char[] charArray = "lmvv\u0013Qv?vFHupvV\\%kj\u0013Z`?jE]wmlW\\`q%QA%lpQ[i~v@]v1".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '3';
                    break;
                }
                case 0: {
                    c2 = '8';
                    break;
                }
                case 1: {
                    c2 = '\u0005';
                    break;
                }
                case 2: {
                    c2 = '\u001f';
                    break;
                }
                case 3: {
                    c2 = '\u0005';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    protected fp() {
        this(null);
    }
    
    protected fp(final dg a) {
        this.c = ce.d();
        this.a = a;
    }
    
    static Map a(final fp fp) {
        return fp.d();
    }
    
    private Map d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_1       
        //     4: new             Ljava/util/TreeMap;
        //     7: dup            
        //     8: invokespecial   java/util/TreeMap.<init>:()V
        //    11: astore_2       
        //    12: aload_0        
        //    13: invokevirtual   com/google/fp.internalGetFieldAccessorTable:()Lcom/google/ch;
        //    16: invokestatic    com/google/ch.a:(Lcom/google/ch;)Lcom/google/bl;
        //    19: invokevirtual   com/google/bl.f:()Ljava/util/List;
        //    22: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    27: astore_3       
        //    28: aload_3        
        //    29: invokeinterface java/util/Iterator.hasNext:()Z
        //    34: ifeq            116
        //    37: aload_3        
        //    38: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    43: checkcast       Lcom/google/hg;
        //    46: astore          4
        //    48: aload           4
        //    50: invokevirtual   com/google/hg.b:()Z
        //    53: ifeq            90
        //    56: aload_0        
        //    57: aload           4
        //    59: invokevirtual   com/google/fp.a:(Lcom/google/hg;)Ljava/lang/Object;
        //    62: checkcast       Ljava/util/List;
        //    65: astore          7
        //    67: aload           7
        //    69: invokeinterface java/util/List.isEmpty:()Z
        //    74: ifne            86
        //    77: aload_2        
        //    78: aload           4
        //    80: aload           7
        //    82: invokevirtual   java/util/TreeMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    85: pop            
        //    86: iload_1        
        //    87: ifeq            112
        //    90: aload_0        
        //    91: aload           4
        //    93: invokevirtual   com/google/fp.b:(Lcom/google/hg;)Z
        //    96: ifeq            112
        //    99: aload_2        
        //   100: aload           4
        //   102: aload_0        
        //   103: aload           4
        //   105: invokevirtual   com/google/fp.a:(Lcom/google/hg;)Ljava/lang/Object;
        //   108: invokevirtual   java/util/TreeMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   111: pop            
        //   112: iload_1        
        //   113: ifeq            28
        //   116: aload_2        
        //   117: areturn        
        //   118: astore          8
        //   120: aload           8
        //   122: athrow         
        //   123: astore          5
        //   125: aload           5
        //   127: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  67     86     118    123    Ljava/lang/UnsupportedOperationException;
        //  90     112    123    128    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
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
    public a8 a(final ce ce) {
        return this.a(ce);
    }
    
    @Override
    public a8 a(final hg hg) {
        return ch.a(this.internalGetFieldAccessorTable(), hg).a();
    }
    
    @Override
    public a8 a(final hg hg, final Object o) {
        return this.b(hg, o);
    }
    
    protected dg a() {
        try {
            if (this.b == null) {
                this.b = new aX(this, null);
            }
            return this.b;
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
    }
    
    @Override
    public final fp a(final ce c) {
        this.c = c;
        this.c();
        return this;
    }
    
    @Override
    public fp a(final hg hg, final Object o) {
        ch.a(this.internalGetFieldAccessorTable(), hg).b(this, o);
        return this;
    }
    
    @Override
    public fx a(final ce ce) {
        return this.b(ce);
    }
    
    @Override
    public Object a(final hg hg) {
        Object o = ch.a(this.internalGetFieldAccessorTable(), hg).b(this);
        try {
            if (hg.b()) {
                o = Collections.unmodifiableList((List<?>)o);
            }
            return o;
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
    }
    
    @Override
    public Map a() {
        return Collections.unmodifiableMap((Map<?, ?>)this.d());
    }
    
    @Override
    public a8 b(final hg hg, final Object o) {
        return this.a(hg, o);
    }
    
    public final fp b(final ce ce) {
        this.c = ce.b(this.c).a(ce).g();
        this.c();
        return this;
    }
    
    @Override
    public fp b(final hg hg, final Object o) {
        ch.a(this.internalGetFieldAccessorTable(), hg).a(this, o);
        return this;
    }
    
    protected void b() {
        try {
            if (this.a != null) {
                this.g();
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
    }
    
    @Override
    public boolean b(final hg hg) {
        return ch.a(this.internalGetFieldAccessorTable(), hg).a(this);
    }
    
    protected final void c() {
        try {
            if (!this.d) {
                return;
            }
            final fp fp = this;
            final dg dg = fp.a;
            if (dg != null) {
                final fp fp2 = this;
                final dg dg2 = fp2.a;
                dg2.a();
                final fp fp3 = this;
                final boolean b = false;
                fp3.d = b;
            }
            return;
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        try {
            final fp fp = this;
            final dg dg = fp.a;
            if (dg != null) {
                final fp fp2 = this;
                final dg dg2 = fp2.a;
                dg2.a();
                final fp fp3 = this;
                final boolean b = false;
                fp3.d = b;
            }
        }
        catch (UnsupportedOperationException ex2) {
            throw ex2;
        }
    }
    
    public fp clear() {
        this.c = ce.d();
        this.c();
        return this;
    }
    
    @Override
    public fE clone() {
        return this.clone();
    }
    
    @Override
    public fp clone() {
        throw new UnsupportedOperationException(fp.z);
    }
    
    @Override
    public fx clone() {
        return this.clone();
    }
    
    @Override
    public Object clone() {
        return this.clone();
    }
    
    void e() {
        this.a = null;
    }
    
    protected boolean f() {
        return this.d;
    }
    
    protected void g() {
        this.d = true;
    }
    
    @Override
    public bl getDescriptorForType() {
        return ch.a(this.internalGetFieldAccessorTable());
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.c;
    }
    
    protected abstract ch internalGetFieldAccessorTable();
    
    @Override
    public boolean isInitialized() {
        final boolean b = dt.b;
        for (final hg hg : this.getDescriptorForType().f()) {
            Label_0199: {
                Label_0159: {
                    Label_0067: {
                        try {
                            if (!hg.o()) {
                                break Label_0067;
                            }
                            final fp fp = this;
                            final hg hg2 = hg;
                            final boolean b2 = fp.b(hg2);
                            if (!b2) {
                                return false;
                            }
                            break Label_0067;
                        }
                        catch (UnsupportedOperationException ex) {
                            throw ex;
                        }
                        try {
                            final fp fp = this;
                            final hg hg2 = hg;
                            final boolean b2 = fp.b(hg2);
                            if (!b2) {
                                return false;
                            }
                        }
                        catch (UnsupportedOperationException ex2) {
                            throw ex2;
                        }
                        while (true) {
                            while (true) {
                                Label_0151: {
                                    fm fm;
                                    try {
                                        if (hg.n() != hD.MESSAGE) {
                                            break Label_0199;
                                        }
                                        if (!hg.b()) {
                                            break Label_0159;
                                        }
                                        final Iterator iterator2 = ((List)this.a(hg)).iterator();
                                        if (!iterator2.hasNext()) {
                                            break;
                                        }
                                        final fm fm2;
                                        fm = (fm2 = iterator2.next());
                                        final boolean initialized = fm2.isInitialized();
                                        final boolean initialized2 = initialized;
                                        if (!initialized2) {
                                            return false;
                                        }
                                        break Label_0151;
                                    }
                                    catch (UnsupportedOperationException ex3) {
                                        throw ex3;
                                    }
                                    try {
                                        final fm fm2 = fm;
                                        final boolean initialized2;
                                        final boolean initialized = initialized2 = fm2.isInitialized();
                                        if (!initialized2) {
                                            return false;
                                        }
                                    }
                                    catch (UnsupportedOperationException ex4) {
                                        throw ex4;
                                    }
                                }
                                if (b) {
                                    break;
                                }
                                continue;
                            }
                        }
                    }
                    if (!b) {
                        break Label_0199;
                    }
                    try {
                        if (!this.b(hg)) {
                            break Label_0199;
                        }
                        final fp fp2 = this;
                        final hg hg3 = hg;
                        final Object o = fp2.a(hg3);
                        final fm fm3 = (fm)o;
                        final boolean b5 = fm3.isInitialized();
                        if (!b5) {
                            return false;
                        }
                        break Label_0199;
                    }
                    catch (UnsupportedOperationException ex5) {
                        throw ex5;
                    }
                }
                try {
                    final fp fp2 = this;
                    final hg hg3 = hg;
                    final Object o = fp2.a(hg3);
                    final fm fm3 = (fm)o;
                    final boolean b5 = fm3.isInitialized();
                    if (!b5) {
                        return false;
                    }
                }
                catch (UnsupportedOperationException ex6) {
                    throw ex6;
                }
            }
            if (b) {
                break;
            }
        }
        return true;
    }
}
