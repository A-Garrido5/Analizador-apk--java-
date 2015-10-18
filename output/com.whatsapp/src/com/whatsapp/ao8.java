// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.concurrent.CountedCompleter;
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
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.Map;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import sun.misc.Unsafe;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Collection;
import java.util.HashSet;
import android.os.Message;
import android.os.Handler;

class ao8 extends Handler
{
    final vy a;
    
    ao8(final vy a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final boolean k = a_9.k;
        Label_0193: {
            switch (message.what) {
                case 1: {
                    vy.g(this.a).a((String)message.obj);
                    if (k) {
                        break Label_0193;
                    }
                    break;
                }
                case 2: {
                    final String s = (String)message.obj;
                    vy.f(this.a).a(s);
                    vy.g(this.a).a(s);
                    if (k) {
                        break Label_0193;
                    }
                    break;
                }
                case 8: {
                    final Enumeration<String> keys = (Enumeration<String>)vy.c(this.a).keys();
                    while (keys.hasMoreElements()) {
                        final String s2 = keys.nextElement();
                        vy.c(this.a).put(s2, new nn());
                        vy.g(this.a).a(s2);
                        if (k) {
                            break Label_0193;
                        }
                    }
                    break;
                }
                case 9: {
                    for (final String s3 : new HashSet<String>(vy.c(this.a).keySet())) {
                        Label_0305: {
                            if (!s3.contains("-")) {
                                vy.c(this.a).remove(s3);
                                vy.g(this.a).c(s3);
                                if (!k) {
                                    break Label_0305;
                                }
                            }
                            vy.c(this.a).put(s3, new nn());
                            vy.g(this.a).a(s3);
                        }
                        if (k) {
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }
}
