// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class b8 implements dg
{
    private ed a;
    private cb b;
    private G c;
    private boolean d;
    private boolean e;
    private List f;
    private List g;
    private dg h;
    
    public b8(final List g, final boolean d, final dg h, final boolean e) {
        this.g = g;
        this.d = d;
        this.h = h;
        this.e = e;
    }
    
    private dS a(final int n, final boolean b) {
        try {
            if (this.f == null) {
                return this.g.get(n);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        final aA aa = this.f.get(n);
        if (aa == null) {
            try {
                return this.g.get(n);
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        if (b) {
            try {
                return aa.a();
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
        return aa.b();
    }
    
    private void e() {
        try {
            if (!this.e) {
                return;
            }
            final b8 b8 = this;
            final dg dg = b8.h;
            if (dg != null) {
                final b8 b9 = this;
                final dg dg2 = b9.h;
                dg2.a();
                final b8 b10 = this;
                final boolean b11 = false;
                b10.e = b11;
            }
            return;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final b8 b8 = this;
            final dg dg = b8.h;
            if (dg != null) {
                final b8 b9 = this;
                final dg dg2 = b9.h;
                dg2.a();
                final b8 b10 = this;
                final boolean b11 = false;
                b10.e = b11;
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    private void g() {
        final boolean b = dt.b;
        if (this.f == null) {
            this.f = new ArrayList(this.g.size());
            int i = 0;
            while (i < this.g.size()) {
                this.f.add(null);
                ++i;
                if (b) {
                    break;
                }
            }
        }
    }
    
    private void h() {
        try {
            if (!this.d) {
                this.g = new ArrayList(this.g);
                this.d = true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/b8.b:Lcom/google/cb;
        //     4: ifnull          14
        //     7: aload_0        
        //     8: getfield        com/google/b8.b:Lcom/google/cb;
        //    11: invokevirtual   com/google/cb.a:()V
        //    14: aload_0        
        //    15: getfield        com/google/b8.c:Lcom/google/G;
        //    18: ifnull          28
        //    21: aload_0        
        //    22: getfield        com/google/b8.c:Lcom/google/G;
        //    25: invokevirtual   com/google/G.a:()V
        //    28: aload_0        
        //    29: getfield        com/google/b8.a:Lcom/google/ed;
        //    32: ifnull          42
        //    35: aload_0        
        //    36: getfield        com/google/b8.a:Lcom/google/ed;
        //    39: invokevirtual   com/google/ed.a:()V
        //    42: return         
        //    43: astore_1       
        //    44: aload_1        
        //    45: athrow         
        //    46: astore_2       
        //    47: aload_2        
        //    48: athrow         
        //    49: astore_3       
        //    50: aload_3        
        //    51: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      14     43     46     Ljava/lang/NullPointerException;
        //  14     28     46     49     Ljava/lang/NullPointerException;
        //  28     42     49     52     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 28, Size: 28
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
    
    @Override
    public int a() {
        return this.g.size();
    }
    
    public b8 a(final int n, final dS ds) {
        if (ds == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.h();
        this.g.set(n, ds);
        Label_0066: {
            if (this.f == null) {
                break Label_0066;
            }
            final aA aa = this.f.set(n, null);
            if (aa == null) {
                break Label_0066;
            }
            try {
                aa.g();
                this.e();
                this.i();
                return this;
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
    }
    
    public b8 a(final dS ds) {
        if (ds == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        try {
            this.h();
            this.g.add(ds);
            if (this.f != null) {
                this.f.add(null);
            }
            this.e();
            this.i();
            return this;
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    public b8 a(final Iterable iterable) {
        final boolean b = dt.b;
        final Iterator<dS> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == null) {
                try {
                    throw new NullPointerException();
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
            if (b) {
                break;
            }
        }
        if (iterable instanceof Collection) {
            final Collection<dS> collection = (Collection<dS>)iterable;
            try {
                if (collection.size() == 0) {
                    return this;
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
            this.h();
            final Iterator<dS> iterator2 = iterable.iterator();
            while (iterator2.hasNext()) {
                this.a(iterator2.next());
                if (b) {
                    break;
                }
            }
        }
        else {
            this.h();
            final Iterator<dS> iterator3 = iterable.iterator();
            while (iterator3.hasNext()) {
                this.a(iterator3.next());
                if (b) {
                    break;
                }
            }
        }
        this.e();
        this.i();
        return this;
    }
    
    public dS a(final int n) {
        return this.a(n, false);
    }
    
    @Override
    public void a() {
        this.e();
    }
    
    public fp b(final int n) {
        this.g();
        aA aa = this.f.get(n);
        if (aa == null) {
            final aA aa2 = new aA(this.g.get(n), this, this.e);
            this.f.set(n, aa2);
            aa = aa2;
        }
        return aa.f();
    }
    
    public List b() {
        final boolean b = dt.b;
        Label_0038: {
            try {
                this.e = true;
                if (this.d) {
                    break Label_0038;
                }
                final b8 b2 = this;
                final List list = b2.f;
                if (list == null) {
                    final b8 b3 = this;
                    return b3.g;
                }
                break Label_0038;
            }
            catch (NullPointerException ex) {
                try {
                    throw ex;
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
            }
            try {
                final b8 b2 = this;
                final List list = b2.f;
                if (list == null) {
                    final b8 b3 = this;
                    return b3.g;
                }
            }
            catch (NullPointerException ex5) {}
        }
        Label_0157: {
            if (!this.d) {
                int n = 0;
                int n2 = 1;
            Label_0133_Outer:
                while (true) {
                    while (true) {
                        Label_0242: {
                            int n3 = 0;
                            int n4 = 0;
                        Label_0133:
                            while (true) {
                                if (n >= this.g.size()) {
                                    n3 = n2;
                                    break Label_0133;
                                }
                                final fm fm = this.g.get(n);
                                final aA aa = this.f.get(n);
                                if (aa == null) {
                                    break Label_0242;
                                }
                                while (true) {
                                    Label_0236: {
                                        try {
                                            if (aa.a() == fm) {
                                                break Label_0242;
                                            }
                                            if (!b) {
                                                break Label_0236;
                                            }
                                            n3 = 0;
                                            n4 = n + 1;
                                            if (!b) {
                                                break;
                                            }
                                            if (n3 != 0) {
                                                final b8 b4 = this;
                                                final List g = b4.g;
                                                return g;
                                            }
                                            break Label_0157;
                                        }
                                        catch (NullPointerException ex3) {
                                            throw ex3;
                                        }
                                        try {
                                            final b8 b4 = this;
                                            final List g2;
                                            final List g = g2 = b4.g;
                                            return g2;
                                        }
                                        catch (NullPointerException ex4) {
                                            throw ex4;
                                        }
                                        break Label_0157;
                                    }
                                    n3 = 0;
                                    continue Label_0133;
                                }
                                break;
                            }
                            n = n4;
                            n2 = n3;
                            continue Label_0133_Outer;
                        }
                        int n3 = n2;
                        continue;
                    }
                }
            }
        }
        this.h();
        int i = 0;
        while (i < this.g.size()) {
            this.g.set(i, this.a(i, true));
            ++i;
            if (b) {
                break;
            }
        }
        this.g = Collections.unmodifiableList((List<?>)this.g);
        this.d = false;
        return this.g;
    }
    
    public cT c(final int n) {
        try {
            if (this.f == null) {
                return this.g.get(n);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        final aA aa = this.f.get(n);
        if (aa == null) {
            try {
                return this.g.get(n);
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return aa.e();
    }
    
    public void c() {
        final boolean b = dt.b;
        this.g = Collections.emptyList();
        this.d = false;
        Label_0069: {
            if (this.f == null) {
                break Label_0069;
            }
            final Iterator<aA> iterator = (Iterator<aA>)this.f.iterator();
            while (true) {
                Label_0064: {
                    if (!iterator.hasNext()) {
                        break Label_0064;
                    }
                    final aA aa = iterator.next();
                    Label_0060: {
                        if (aa == null) {
                            break Label_0060;
                        }
                        try {
                            aa.g();
                            if (b) {
                                this.f = null;
                                this.e();
                                this.i();
                                return;
                            }
                            continue;
                        }
                        catch (NullPointerException ex) {
                            throw ex;
                        }
                    }
                }
                break;
            }
        }
    }
    
    public void d(final int n) {
        this.h();
        this.g.remove(n);
        Label_0044: {
            if (this.f == null) {
                break Label_0044;
            }
            final aA aa = this.f.remove(n);
            if (aa == null) {
                break Label_0044;
            }
            try {
                aa.g();
                this.e();
                this.i();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
    }
    
    public boolean d() {
        return this.g.isEmpty();
    }
    
    public void f() {
        this.h = null;
    }
}
