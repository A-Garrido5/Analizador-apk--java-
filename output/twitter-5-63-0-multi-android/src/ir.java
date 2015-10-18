import android.annotation.TargetApi;
import android.content.SharedPreferences$Editor;
import android.os.Build$VERSION;
import java.util.Iterator;
import java.util.HashSet;
import android.content.SharedPreferences;
import java.util.Comparator;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

package java.util.concurrent;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Contended;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.ToLongBiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.ToDoubleBiFunction;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.Enumeration;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.Collection;
import java.util.Map;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import sun.misc.Unsafe;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.AbstractMap;

public class ir implements in, it
{
    private static ir a;
    private final ConcurrentHashMap b;
    private final Context c;
    private final Comparator d;
    private final SharedPreferences e;
    private final HashSet f;
    private boolean g;
    private boolean h;
    private id i;
    
    ir(final Context c) {
        this.d = new is(this);
        this.f = new HashSet();
        this.g = true;
        this.h = false;
        this.b = new ConcurrentHashMap();
        this.c = c;
        this.e = c.getSharedPreferences("metrics", 0);
        this.i = new id(this.c);
    }
    
    public static void a(final Context context) {
        synchronized (ir.class) {
            if (ir.a == null) {
                ir.a = new ir(context.getApplicationContext());
            }
        }
    }
    
    public static ir b() {
        synchronized (ir.class) {
            if (ir.a == null) {
                throw new IllegalStateException("Metrics manager must be initialized first");
            }
        }
        // monitorexit(ir.class)
        return ir.a;
    }
    
    @Override
    public SharedPreferences a() {
        return this.e;
    }
    
    public ig a(final String s) {
        return this.b.get(s);
    }
    
    @Override
    public void a(final ig ig) {
        this.a((ih)ig);
    }
    
    @Override
    public void a(final ih ih) {
        if (!this.h) {
            final Iterator<it> iterator = this.f.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(ih);
            }
            if (ih instanceof ig) {
                ((ig)ih).p();
            }
        }
    }
    
    public void a(final it it) {
        this.f.add(it);
    }
    
    public void a(final boolean g) {
        this.g = g;
        if (g) {
            this.e();
        }
    }
    
    @TargetApi(9)
    @Override
    public void b(final ig ig) {
        this.b.remove(ig.g);
        if (ig.j) {
            final SharedPreferences$Editor edit = this.e.edit();
            ig.b(edit);
            if (Build$VERSION.SDK_INT < 9) {
                edit.commit();
                return;
            }
            edit.apply();
        }
    }
    
    public void b(final boolean h) {
        synchronized (this) {
            this.h = h;
            if (h) {
                this.g();
                this.c();
            }
        }
    }
    
    @TargetApi(9)
    void c() {
        final SharedPreferences$Editor edit = this.e.edit();
        edit.clear();
        if (Build$VERSION.SDK_INT >= 9) {
            edit.apply();
            return;
        }
        edit.commit();
    }
    
    @TargetApi(9)
    @Override
    public void c(final ig ig) {
        if (ig.j && this.g && !this.h) {
            final SharedPreferences$Editor edit = this.e.edit();
            ig.a(edit);
            if (Build$VERSION.SDK_INT < 9) {
                edit.commit();
                return;
            }
            edit.apply();
        }
    }
    
    public id d() {
        return this.i;
    }
    
    public ig d(final ig ig) {
        if (!this.h) {
            final ig ig2 = this.b.putIfAbsent(ig.g, ig);
            if (ig2 != null) {
                return ig2;
            }
        }
        return ig;
    }
    
    public void e() {
        if (this.g && !this.h) {
            final Iterator iterator = this.b.keySet().iterator();
            while (iterator.hasNext()) {
                final ig ig = this.b.get(iterator.next());
                if (ig != null && ig.j) {
                    this.c(ig);
                }
            }
        }
    }
    
    public Context f() {
        return this.c;
    }
    
    public void g() {
        this.b.clear();
    }
}
