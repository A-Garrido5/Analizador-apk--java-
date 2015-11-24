// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

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
import java.util.Enumeration;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import sun.misc.Unsafe;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.util.Set;
import android.util.Pair;
import com.whatsapp.aol;
import org.json.JSONException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.IOException;
import com.whatsapp.util.Log;
import com.whatsapp.App;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import java.util.HashMap;
import java.io.File;
import org.json.JSONObject;
import java.util.concurrent.ConcurrentHashMap;

final class bq
{
    private static final String[] z;
    private ConcurrentHashMap a;
    private JSONObject b;
    private File c;
    private ag d;
    private HashMap e;
    private final q f;
    private HashMap g;
    private final String h;
    
    static {
        final String[] z2 = new String[73];
        String s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0015\u0015r\u0015M\u001a\u0014n\u000f\t\\\u001c\u007f\u0013\u0004\n\u001eD\u0007\u0004\u0010\u001eD\f\f\f[y\u0014\u0019\\\bo\b\u0001\u0010[o\t\b\\\u0015n\f\u000f\u0019\t;\u000e\u000b\\\u001eu\u0015\u001f\u0015\u001ehA\u0004\u0012[|\u0005\u001f\u0015\r~'\u0004\u0010\u001eV\u0000\u001d\\\u0012hA\u0017\u0019\ttOM+\u001e;\u0016\u0004\u0010\u0017;\u0006\b\u0012\u001ei\u0000\u0019\u0019[zA\u0003\u0019\f;\f\f\f[y\u0018M\u000e\u001ez\u0005\u0004\u0012\u001c;\u0000\u0001\u0010[~\u000f\u0019\u000e\u0012~\u0012C";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1857:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'a';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = '|';
                        break;
                    }
                    case 2: {
                        c2 = '{';
                        break;
                    }
                    case 3: {
                        c2 = '\u001b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\n\u0018\tr\u0017\b#\u001dr\r\b#\u0016z\u0011";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0015\u0015r\u0015M\u001a\u001ar\r\b\u0018[o\u000eM\u000e\u001ez\u0005M\u001b\u001fi\b\u001b\u0019=r\r\b1\u001akO";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000f\u001d\u0018p\u0014\u001d/\u0012a\u0004";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0018\u0014l\u000f\u0001\u0013\u001a\u007fL\u001e\u0015\u0001~A\u0000\u0019\u000fz\u0005\f\b\u001a;\b\u001e\\\u0015n\r\u0001R";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0015\u0015r\u0015@\u0011\u001eo\u0000";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0015\u0015r\u0015@\u0011\u001eo\u0000M\u0011?i\b\u001b\u0019=r\r\b\\\u0012hA\u0003\t\u0017wO";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000e\u001ez\u0005";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "M\u000b\u0012o\tM\n\u001aw\u0014\bF[";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000e\u001ez\u0005";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000e\u001ez\u0005M\t\u0015p\u000f\u0002\u000b\u0015;\u0007\u0004\u0019\u0017\u007f[M";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000e\u001ez\u0005";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000e\u001ez\u0005M:2W$2)+W.,8$K 94$]((0?;\u0007\u0004\u0019\u0017\u007fA\u0004\u000f[v\b\u001e\u000f\u0012u\u0006A\\\u0012|\u000f\u0002\u000e\u0012u\u0006M\u0019\u0015o\u0013\u0014R";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000e\u001ez\u0005M.>H()#=R$!8[}\b\b\u0010\u001f;\b\u001e\\\u0016r\u0012\u001e\u0015\u0015|MM\u0015\u001cu\u000e\u001f\u0015\u0015|A\b\u0012\u000fi\u0018C";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000e\u001ez\u0005M1?.>+5>W%M\u001a\u0012~\r\t\\\u0012hA\u0000\u0015\bh\b\u0003\u001bW;\b\n\u0012\u0014i\b\u0003\u001b[~\u000f\u0019\u000e\u00025";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000e\u001ez\u0005M:2W$2/2A$2:2^-)\\\u001dr\u0004\u0001\u0018[r\u0012M\u0011\u0012h\u0012\u0004\u0012\u001c7A\u0004\u001b\u0015t\u0013\u0004\u0012\u001c;\u0004\u0003\b\tbO";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000e\u001ez\u0005";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u000e\u0014\u001ao\u0005\u000f/\u0012a\u0004";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u001f\u0013z\u0015@\u000f\u0012a\u0004M\u0011\u001eo\u0000\t\u001d\u000fzA\u0004\u000f[u\u0014\u0001\u0010U";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\n\u0018\tr\u0017\bS\u0018z\r\u000eQ\u001ak\u0011\u001f\u0013\u00036\u0015\u0002\b\u001awL\t\u0013\fu\r\u0002\u001d\u001f;\u0015\u0002\b\u001aw2\u0004\u0006\u001e;\b\u001e\\\u0015~\u0006\f\b\u0012m\u0004C";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "M\b\u0016k%\u000f/\u0012a\u0004W\\";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "M\u0015\u0015x\r\u0018\u0018\u001e_\u0003>\u0015\u0001~[M";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\n\u0018\tr\u0017\bS\u0018z\r\u000eQ\u001ak\u0011\u001f\u0013\u00036\u0015\u0002\b\u001awL\t\u0013\fu\r\u0002\u001d\u001f;\u0015\u0000\f?y2\u0004\u0006\u001e;\b\u001e\\\u0015~\u0006\f\b\u0012m\u0004C";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\n\u0018\tr\u0017\bS\u0018z\r\u000eQ\u001ak\u0011\u001f\u0013\u00036\u0015\u0002\b\u001awL\t\u0013\fu\r\u0002\u001d\u001f;\u0015\u0002\b\u001awA\u001e\u0015\u0001~[";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u000f\u001d\u0018p\u0014\u001d/\u0012a\u0004";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0000\u0019\u001fr\u0000>\u0015\u0001~";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u000f\u001d\u0018p\u0014\u001d:\t~\u0010\u0018\u0019\u0015x\u0018";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    s = "\u000e\u0014\u001ao\u0005\u000f/\u0012a\u0004";
                    n = 26;
                    n2 = 27;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    array = z2;
                    s = "\u0003\t\u0016T\u0007=\u0014\u0014o\u000e\u001e";
                    n = 27;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u0003\t\u0016T\u0007 \u0019\bh\u0000\n\u0019\b";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u001e\u001ax\n\u0018\f";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\n\u0018\tr\u0017\b#\u001dr\r\b#\u0016z\u0011";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u0019\u0011\u000b";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u000f\u001d\u0018p\u0014\u001d*\u001ei\u0012\u0004\u0013\u0015";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u001e\u001ax\n\u0018\f[}\u0004\u0019\u001f\u0013r\u000f\n\\\u0017r\u0012\u0019\\\u0014}A\u0019\u0011\u000b;\u0007\u0004\u0010\u001ehA\u001f\u0019\u000fn\u0013\u0003\u0019\u001f;\u000f\u0018\u0010\u00177A\u0018\u0012\u001ec\u0011\b\u001f\u000f~\u0005C";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u001e\u001ax\n\u0018\f[}\u0004\u0019\u001f\u0013r\u000f\n\\\u0017r\u0012\u0019\\\u0014}A\n\u0018\tr\u0017\b#\u001dr\r\b#\u0016z\u0011M\\\u001dr\r\b\u000f[i\u0004\u0019\t\tu\u0004\t\\\u0015n\r\u0001P[n\u000f\b\u0004\u000b~\u0002\u0019\u0019\u001f5";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\n\u0018\tr\u0017\b#\u001dr\r\b#\u0016z\u0011";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u000f\u001d\u0018p\u0014\u001d2\u001eo\u0016\u0002\u000e\u0010H\u0004\u0019\b\u0012u\u0006\u001e";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\n\u0018\tr\u0017\b#\u001dr\r\b#\u0016z\u0011";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u001e\u001ax\n\u0018\f[o\u0004\u0000\f\u0014i\u0000\u001f\u0005[|\u0005\u001f\u0015\r~>\u000b\u0015\u0017~>\u0000\u001d\u000b;\u0016\u0004\b\u0013;\u0015\u0004\b\u0017~AJ";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "J\\\u001ft\u0004\u001e\\\u0015t\u0015M\u0019\u0003r\u0012\u0019P[n\u000f\b\u0004\u000b~\u0002\u0019\u0019\u001f5";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0011\u001e\u007f\b\fQ\br\u001b\b\\\u0016~\u0015\f\u0018\u001ao\u0000M\u0015\b;\u000f\u0018\u0010\u00175";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "\u0000\u0019\u001fr\u0000>\u0015\u0001~";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "\u000f\u001d\u0018p\u0014\u001d:\t~\u0010\u0018\u0019\u0015x\u0018";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u001e\u001ax\n\u0018\fV}\u0013\b\r\u000e~\u000f\u000e\u0005[v\u0004\u0019\u001d\u001fz\u0015\f\\\u0012hA\u0003\t\u0017wO";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "M\u000e\u001eh(\t\\";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "M\u0011\u001f.A";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "\n\u0018\tr\u0017\b#\u001dr\r\b#\u0016z\u0011";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000f\u001am\u0004@\u001a\u0012w\u0004M\u0015\u001cu\u000e\u001f\u0019\u001f;\u0007\u0004\u0010\u001e;\u0007\u001f\u0013\u0016;\u0003\b\u0015\u0015|A\u0004\u0012\b~\u0013\u0019\u0019\u001f;\b\u0003\b\u0014;\u0006\t\u000e\u0012m\u0004M\u001a\u0012w\u0004M\u0011\u001ak[M\u001a\u0012w\u0004\u0003\u001d\u0016~A";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u000f\u001am\u0004@\u0011\u001akA\u0004\u001b\u0015t\u0013\u0004\u0012\u001c;\u000f\u0002\u0012V~\u0019\u0004\u000f\u000f~\u000f\u0019\\";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "M\u001a\tt\fM\u0011\u001akO";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "\u000f\u001d\u0018p\u0014\u001d2\u001eo\u0016\u0002\u000e\u0010H\u0004\u0019\b\u0012u\u0006\u001e";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0012\u001eo\u0016\u0002\u000e\u00106\u0012\b\b\u000fr\u000f\n\u000f[v\u0004\u0019\u001d\u001fz\u0015\f\\\u0012hA\u0003\t\u0017wO";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "\n\u0018\tr\u0017\b\\\u001dr\r\b\\\u0016z\u0011M\u000f\u0013t\u0014\u0001\u0018[s\u0000\u001b\u0019[y\u0004\b\u0012[r\u000f\u0004\b\u0012z\r\u0004\u0006\u001e\u007fA\u000b\u0015\th\u0015";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u001f\u0014u\u0012\u0019\u000e\u000ex\u0015";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "\n\u0018\tr\u0017\b#\u001dr\r\b#\u0016z\u0011";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "M\u000b\u0012w\rM\u001e\u001e;\u0005\b\u0010\u001eo\u0004\tR";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "B\u001a\u001ar\r\b\u0018";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0010\u0012h\u0015\u0004\u0012\u001c6\u0000\u0001\u0010V~\u000f\u0019\u000e\u0012~\u0012B\u0018\u001ew\u0004\u0019\u0015\u0015|L\t\t\u000bw\b\u000e\u001d\u000f~\u0012B";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0010\u0012h\u0015\u0004\u0012\u001c6\u0000\u0001\u0010V~\u000f\u0019\u000e\u0012~\u0012M\u0018\tr\u0017\b=\u000brO\u0001\u0015\bo'\u0004\u0010\u001ehA\u001f\u0019\u000fn\u0013\u0003\u0019\u001f;\u000f\u0018\u0010\u00175";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "B\u000f\u000ex\u0002\b\u000f\b";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0010\u0012h\u0015\u0004\u0012\u001c6\u0000\u0001\u0010V~\u000f\u0019\u000e\u0012~\u0012M\u001f\u000ei\u0013\b\u0012\u000f;\u0002\u0002\t\u0015oA\u0002\u001a[~\u000f\u0019\u000e\u0012~\u0012M\u0015\u0015;\u0006\t\u000e\u0012m\u0004+\u0015\u0017~,\f\fA;";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0010\u0012h\u0015\u0004\u0012\u001c6\u0000\u0001\u0010V~\u000f\u0019\u000e\u0012~\u0012B\u0018\u000ek\r\u0004\u001f\u001ao\u0004M";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0010\u0012h\u0015\u0004\u0012\u001c6\u0000\u0001\u0010V~\u000f\u0019\u000e\u0012~\u0012M\u000b\u001e;\t\f\n\u001e;\u0015\u001a\u0013[}\b\u0001\u0019\b;I\t\u0015\u001d}\u0004\u001f\u0019\u0015oA\u0000\u0018N2A\u001a\u0015\u000fsA\u001e\u001d\u0016~A\u0019\u0015\u000fw\u0004W\\";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "M\u0011\u001f.[M";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "M\u000e\u001eh(\tF";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0010\u0012h\u0015\u0004\u0012\u001c6\u0000\u0001\u0010V~\u000f\u0019\u000e\u0012~\u0012B\u0018\u001ew\u0004\u0019\u0015\u0015|L\t\t\u000bw\b\u000e\u001d\u000f~\u0012B";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0010\u0012h\u0015\u0004\u0012\u001c6\u0000\u0001\u0010V~\u000f\u0019\u000e\u0012~\u0012A\\\u000eu\u0004\u0015\f\u001ex\u0015\b\u0018[~\u0013\u001f\u0013\t7A\u0003\t\u0017wA\u0019\u0015\u000fw\u0004M\u001a\u0014iA\u000b\u0015\u0017~A";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "M\u001b\u001fi\b\u001b\u0019=r\r\b1\u001akO\u001e\u0015\u0001~[M";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u0010\u0012h\u0015\u0004\u0012\u001c6\u0000\u0001\u0010V~\u000f\u0019\u000e\u0012~\u0012B\u0018\u001ew\u0004\u0019\u0015\u0015|L\t\t\u000bw\b\u000e\u001d\u000f~\u0012B";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u001f\u001aw\u0002@\u001d\u000bk\u0013\u0002\u0004Vv\u0004\t\u0015\u001a6\u0005\u0002\u000b\u0015w\u000e\f\u0018[n\u000f\b\u0004\u000b~\u0002\u0019\u0019\u001f;\u0012\u0004\b\u000ez\u0015\u0004\u0013\u00157A\u0005\u0013\f;\u0002\f\u0012[o\u000e/\u0019?t\u0016\u0003\u0010\u0014z\u0005\b\u0018(z\f\u001d\u0010\u001eH\b\u0017\u0019F";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "M\u001e\u001e;\u0006\u001f\u0019\u001ao\u0004\u001f\\\u000fs\u0000\u0003\\\u000ft\u0015\f\u0010(z\f\u001d\u0010\u001eH\b\u0017\u0019F";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "\n\u0018\tr\u0017\bQ\u0016z\u0011B\u001f\u001aw\u0002@\u001d\u000bk\u0013\u0002\u0004Vv\u0004\t\u0015\u001a6\u0005\u0002\u000b\u0015w\u000e\f\u0018Vh\b\u0017\u0019[}\b\u0001\u0019[n\u0011\u0001\u0013\u001a\u007fA\u001d\u001d\u000fsA\u0004\u000f[u\u0014\u0001\u0010W;\u0014\u0003\u0019\u0003k\u0004\u000e\b\u001e\u007fO";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    break Label_1857;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public bq(@NonNull final q f, @NonNull final String h, @Nullable final ag d) {
        this.a = null;
        this.e = null;
        this.g = null;
        this.f = f;
        this.d = d;
        this.h = h;
        if (d != null) {
            this.m();
        }
        try {
            this.c = new File(App.T.a(), bq.z[55]);
        }
        catch (IOException ex) {
            Log.b(bq.z[54], ex);
        }
    }
    
    private long a(final long p0, final boolean p1, final AtomicBoolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore          5
        //     5: invokestatic    com/whatsapp/qf.d:()Ljava/io/File;
        //     8: invokevirtual   java/io/File.exists:()Z
        //    11: istore          7
        //    13: iload           7
        //    15: ifne            25
        //    18: lload_1        
        //    19: lreturn        
        //    20: astore          6
        //    22: aload           6
        //    24: athrow         
        //    25: new             Ljava/util/concurrent/atomic/AtomicLong;
        //    28: dup            
        //    29: lconst_0       
        //    30: invokespecial   java/util/concurrent/atomic/AtomicLong.<init>:(J)V
        //    33: astore          8
        //    35: new             Ljava/util/concurrent/atomic/AtomicLong;
        //    38: dup            
        //    39: lconst_0       
        //    40: invokespecial   java/util/concurrent/atomic/AtomicLong.<init>:(J)V
        //    43: astore          9
        //    45: aload_0        
        //    46: getfield        com/whatsapp/gdrive/bq.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    49: invokevirtual   java/util/concurrent/ConcurrentHashMap.keySet:()Ljava/util/Set;
        //    52: aload_0        
        //    53: getfield        com/whatsapp/gdrive/bq.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    56: invokevirtual   java/util/concurrent/ConcurrentHashMap.size:()I
        //    59: anewarray       Ljava/lang/String;
        //    62: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    67: checkcast       [Ljava/lang/String;
        //    70: astore          10
        //    72: aload_0        
        //    73: getfield        com/whatsapp/gdrive/bq.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    76: invokevirtual   java/util/concurrent/ConcurrentHashMap.size:()I
        //    79: bipush          10
        //    81: if_icmpge       636
        //    84: iconst_1       
        //    85: istore          11
        //    87: new             Ljava/util/concurrent/atomic/AtomicLong;
        //    90: dup            
        //    91: aload           10
        //    93: arraylength    
        //    94: i2l            
        //    95: invokespecial   java/util/concurrent/atomic/AtomicLong.<init>:(J)V
        //    98: astore          12
        //   100: iconst_0       
        //   101: istore          13
        //   103: iload           13
        //   105: aload           10
        //   107: arraylength    
        //   108: if_icmpge       428
        //   111: aload           10
        //   113: iload           13
        //   115: aaload         
        //   116: astore          18
        //   118: aload           18
        //   120: ifnonnull       137
        //   123: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   126: bipush          72
        //   128: aaload         
        //   129: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   132: iload           5
        //   134: ifeq            417
        //   137: aload           18
        //   139: invokestatic    com/whatsapp/gdrive/a7.c:(Ljava/lang/String;)Ljava/lang/String;
        //   142: astore          19
        //   144: aload_0        
        //   145: getfield        com/whatsapp/gdrive/bq.a:Ljava/util/concurrent/ConcurrentHashMap;
        //   148: aload           18
        //   150: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   153: checkcast       Landroid/util/Pair;
        //   156: astore          20
        //   158: aload           20
        //   160: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   163: checkcast       Ljava/lang/String;
        //   166: astore          21
        //   168: aload           20
        //   170: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   173: checkcast       Ljava/lang/String;
        //   176: astore          22
        //   178: new             Ljava/io/File;
        //   181: dup            
        //   182: aload           19
        //   184: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   187: astore          23
        //   189: aload           23
        //   191: invokestatic    com/whatsapp/qf.a:(Ljava/io/File;)Z
        //   194: ifne            211
        //   197: aload           12
        //   199: ldc2_w          -1
        //   202: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   205: pop2           
        //   206: iload           5
        //   208: ifeq            417
        //   211: aload           23
        //   213: invokevirtual   java/io/File.exists:()Z
        //   216: istore          27
        //   218: iload           27
        //   220: ifeq            237
        //   223: aload           23
        //   225: invokevirtual   java/io/File.length:()J
        //   228: lstore          55
        //   230: lload           55
        //   232: lconst_0       
        //   233: lcmp           
        //   234: ifne            292
        //   237: aload           8
        //   239: aload_0        
        //   240: aload           21
        //   242: invokevirtual   com/whatsapp/gdrive/bq.d:(Ljava/lang/String;)J
        //   245: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   248: pop2           
        //   249: aload           9
        //   251: aload_0        
        //   252: aload           21
        //   254: invokevirtual   com/whatsapp/gdrive/bq.d:(Ljava/lang/String;)J
        //   257: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   260: pop2           
        //   261: aload           4
        //   263: iconst_0       
        //   264: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   267: aload           4
        //   269: monitorenter   
        //   270: aload           4
        //   272: invokevirtual   java/lang/Object.notify:()V
        //   275: aload           4
        //   277: monitorexit    
        //   278: aload           12
        //   280: ldc2_w          -1
        //   283: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   286: pop2           
        //   287: iload           5
        //   289: ifeq            417
        //   292: aload           23
        //   294: invokevirtual   java/io/File.exists:()Z
        //   297: istore          41
        //   299: iload           41
        //   301: ifeq            334
        //   304: iload_3        
        //   305: ifne            334
        //   308: aload           8
        //   310: aload_0        
        //   311: aload           21
        //   313: invokevirtual   com/whatsapp/gdrive/bq.d:(Ljava/lang/String;)J
        //   316: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   319: pop2           
        //   320: aload           12
        //   322: ldc2_w          -1
        //   325: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   328: pop2           
        //   329: iload           5
        //   331: ifeq            417
        //   334: iload           13
        //   336: iload           11
        //   338: irem           
        //   339: ifeq            356
        //   342: aload           12
        //   344: ldc2_w          -1
        //   347: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   350: pop2           
        //   351: iload           5
        //   353: ifeq            417
        //   356: aload           8
        //   358: aload_0        
        //   359: aload           21
        //   361: invokevirtual   com/whatsapp/gdrive/bq.d:(Ljava/lang/String;)J
        //   364: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   367: pop2           
        //   368: aload_0        
        //   369: aload           19
        //   371: aload           21
        //   373: aload           22
        //   375: invokevirtual   com/whatsapp/gdrive/bq.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //   378: tableswitch {
        //                2: 554
        //                3: 408
        //                4: 408
        //                5: 559
        //          default: 408
        //        }
        //   408: aload           12
        //   410: ldc2_w          -1
        //   413: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   416: pop2           
        //   417: iload           13
        //   419: iconst_1       
        //   420: iadd           
        //   421: istore          40
        //   423: iload           5
        //   425: ifeq            629
        //   428: aload           8
        //   430: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   433: lstore          16
        //   435: lload           16
        //   437: lconst_0       
        //   438: lcmp           
        //   439: ifne            609
        //   442: aload           9
        //   444: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   447: lconst_0       
        //   448: lcmp           
        //   449: ifle            499
        //   452: new             Ljava/lang/StringBuilder;
        //   455: dup            
        //   456: invokespecial   java/lang/StringBuilder.<init>:()V
        //   459: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   462: bipush          70
        //   464: aaload         
        //   465: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   468: aload           9
        //   470: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   473: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   476: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   479: bipush          71
        //   481: aaload         
        //   482: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   485: aload           8
        //   487: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   490: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   493: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   496: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   499: lconst_0       
        //   500: lreturn        
        //   501: astore          59
        //   503: aload           59
        //   505: athrow         
        //   506: astore          24
        //   508: aload           24
        //   510: athrow         
        //   511: astore          25
        //   513: aload           25
        //   515: athrow         
        //   516: astore          26
        //   518: aload           26
        //   520: athrow         
        //   521: astore          32
        //   523: aload           4
        //   525: monitorexit    
        //   526: aload           32
        //   528: athrow         
        //   529: astore          33
        //   531: aload           33
        //   533: athrow         
        //   534: astore          34
        //   536: aload           34
        //   538: athrow         
        //   539: astore          35
        //   541: aload           35
        //   543: athrow         
        //   544: astore          36
        //   546: aload           36
        //   548: athrow         
        //   549: astore          37
        //   551: aload           37
        //   553: athrow         
        //   554: iload           5
        //   556: ifeq            408
        //   559: aload           9
        //   561: aload_0        
        //   562: aload           21
        //   564: invokevirtual   com/whatsapp/gdrive/bq.d:(Ljava/lang/String;)J
        //   567: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   570: pop2           
        //   571: aload           4
        //   573: iconst_0       
        //   574: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   577: aload           4
        //   579: monitorenter   
        //   580: aload           4
        //   582: invokevirtual   java/lang/Object.notify:()V
        //   585: aload           4
        //   587: monitorexit    
        //   588: goto            408
        //   591: astore          46
        //   593: aload           4
        //   595: monitorexit    
        //   596: aload           46
        //   598: athrow         
        //   599: astore          14
        //   601: aload           14
        //   603: athrow         
        //   604: astore          15
        //   606: aload           15
        //   608: athrow         
        //   609: dconst_1       
        //   610: aload           9
        //   612: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   615: l2d            
        //   616: dmul           
        //   617: aload           8
        //   619: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   622: l2d            
        //   623: ddiv           
        //   624: lload_1        
        //   625: l2d            
        //   626: dmul           
        //   627: d2l            
        //   628: lreturn        
        //   629: iload           40
        //   631: istore          13
        //   633: goto            103
        //   636: bipush          20
        //   638: istore          11
        //   640: goto            87
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  5      13     20     25     Ljava/lang/IllegalStateException;
        //  123    132    501    506    Ljava/lang/IllegalStateException;
        //  189    206    506    511    Ljava/lang/IllegalStateException;
        //  211    218    511    516    Ljava/lang/IllegalStateException;
        //  223    230    516    521    Ljava/lang/IllegalStateException;
        //  270    278    521    529    Any
        //  278    287    529    539    Ljava/lang/IllegalStateException;
        //  292    299    529    539    Ljava/lang/IllegalStateException;
        //  308    329    539    549    Ljava/lang/IllegalStateException;
        //  342    351    549    554    Ljava/lang/IllegalStateException;
        //  428    435    599    604    Ljava/lang/IllegalStateException;
        //  442    499    604    609    Ljava/lang/IllegalStateException;
        //  508    511    511    516    Ljava/lang/IllegalStateException;
        //  513    516    516    521    Ljava/lang/IllegalStateException;
        //  523    526    521    529    Any
        //  531    534    534    539    Ljava/lang/IllegalStateException;
        //  536    539    539    549    Ljava/lang/IllegalStateException;
        //  541    544    544    549    Ljava/lang/IllegalStateException;
        //  546    549    549    554    Ljava/lang/IllegalStateException;
        //  580    588    591    599    Any
        //  593    596    591    599    Any
        //  601    604    604    609    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 299, Size: 299
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
    
    private boolean a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_2       
        //     4: new             Lcom/google/c3;
        //     7: dup            
        //     8: new             Ljava/io/FileWriter;
        //    11: dup            
        //    12: aload_1        
        //    13: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;)V
        //    16: invokespecial   com/google/c3.<init>:(Ljava/io/Writer;)V
        //    19: astore_3       
        //    20: aload_3        
        //    21: invokevirtual   com/google/c3.e:()Lcom/google/c3;
        //    24: pop            
        //    25: aload_0        
        //    26: getfield        com/whatsapp/gdrive/bq.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    29: invokevirtual   java/util/concurrent/ConcurrentHashMap.entrySet:()Ljava/util/Set;
        //    32: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    37: astore          8
        //    39: aload           8
        //    41: invokeinterface java/util/Iterator.hasNext:()Z
        //    46: ifeq            341
        //    49: aload           8
        //    51: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    56: checkcast       Ljava/util/Map$Entry;
        //    59: astore          10
        //    61: aload           10
        //    63: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    68: checkcast       Ljava/lang/String;
        //    71: astore          11
        //    73: aload           10
        //    75: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    80: checkcast       Landroid/util/Pair;
        //    83: getfield        android/util/Pair.first:Ljava/lang/Object;
        //    86: checkcast       Ljava/lang/String;
        //    89: astore          12
        //    91: aload           10
        //    93: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    98: checkcast       Landroid/util/Pair;
        //   101: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   104: checkcast       Ljava/lang/String;
        //   107: astore          13
        //   109: aload           11
        //   111: invokestatic    com/whatsapp/gdrive/a7.c:(Ljava/lang/String;)Ljava/lang/String;
        //   114: astore          14
        //   116: aload           14
        //   118: ifnull          140
        //   121: new             Ljava/io/File;
        //   124: dup            
        //   125: aload           14
        //   127: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   130: invokevirtual   java/io/File.exists:()Z
        //   133: istore          26
        //   135: iload           26
        //   137: ifne            176
        //   140: new             Ljava/lang/StringBuilder;
        //   143: dup            
        //   144: invokespecial   java/lang/StringBuilder.<init>:()V
        //   147: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   150: bipush          49
        //   152: aaload         
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: aload           14
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   164: bipush          50
        //   166: aaload         
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   173: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   176: aload           11
        //   178: ifnull          264
        //   181: aload           12
        //   183: ifnull          264
        //   186: aload           13
        //   188: ifnull          264
        //   191: aload_3        
        //   192: invokevirtual   com/google/c3.b:()Lcom/google/c3;
        //   195: pop            
        //   196: aload_3        
        //   197: ldc_w           "f"
        //   200: invokevirtual   com/google/c3.b:(Ljava/lang/String;)Lcom/google/c3;
        //   203: aload           11
        //   205: invokevirtual   com/google/c3.a:(Ljava/lang/String;)Lcom/google/c3;
        //   208: pop            
        //   209: aload_3        
        //   210: ldc_w           "r"
        //   213: invokevirtual   com/google/c3.b:(Ljava/lang/String;)Lcom/google/c3;
        //   216: aload           12
        //   218: invokevirtual   com/google/c3.a:(Ljava/lang/String;)Lcom/google/c3;
        //   221: pop            
        //   222: aload_3        
        //   223: ldc_w           "m"
        //   226: invokevirtual   com/google/c3.b:(Ljava/lang/String;)Lcom/google/c3;
        //   229: aload           13
        //   231: invokevirtual   com/google/c3.a:(Ljava/lang/String;)Lcom/google/c3;
        //   234: pop            
        //   235: aload_3        
        //   236: ldc_w           "s"
        //   239: invokevirtual   com/google/c3.b:(Ljava/lang/String;)Lcom/google/c3;
        //   242: aload_0        
        //   243: aload           12
        //   245: invokevirtual   com/whatsapp/gdrive/bq.d:(Ljava/lang/String;)J
        //   248: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   251: invokevirtual   com/google/c3.a:(Ljava/lang/String;)Lcom/google/c3;
        //   254: pop            
        //   255: aload_3        
        //   256: invokevirtual   com/google/c3.g:()Lcom/google/c3;
        //   259: pop            
        //   260: iload_2        
        //   261: ifeq            337
        //   264: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   267: bipush          47
        //   269: aaload         
        //   270: aload           11
        //   272: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   275: istore          17
        //   277: iload           17
        //   279: ifne            337
        //   282: new             Ljava/lang/StringBuilder;
        //   285: dup            
        //   286: invokespecial   java/lang/StringBuilder.<init>:()V
        //   289: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   292: bipush          48
        //   294: aaload         
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: aload           11
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   303: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   306: bipush          45
        //   308: aaload         
        //   309: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   312: aload           12
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   320: bipush          46
        //   322: aaload         
        //   323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   326: aload           13
        //   328: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   331: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   334: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   337: iload_2        
        //   338: ifeq            39
        //   341: aload_3        
        //   342: invokevirtual   com/google/c3.c:()Lcom/google/c3;
        //   345: pop            
        //   346: aload_3        
        //   347: invokevirtual   com/google/c3.close:()V
        //   350: aload_3        
        //   351: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   354: iconst_1       
        //   355: ireturn        
        //   356: astore          25
        //   358: aload           25
        //   360: athrow         
        //   361: astore          5
        //   363: aload_3        
        //   364: astore          6
        //   366: aload           5
        //   368: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   371: aload           6
        //   373: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   376: iconst_0       
        //   377: ireturn        
        //   378: astore          18
        //   380: aload           18
        //   382: athrow         
        //   383: astore          15
        //   385: aload           15
        //   387: athrow         
        //   388: astore          16
        //   390: aload           16
        //   392: athrow         
        //   393: astore          4
        //   395: aload_3        
        //   396: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   399: aload           4
        //   401: athrow         
        //   402: astore          4
        //   404: aconst_null    
        //   405: astore_3       
        //   406: goto            395
        //   409: astore          4
        //   411: aload           6
        //   413: astore_3       
        //   414: goto            395
        //   417: astore          5
        //   419: aconst_null    
        //   420: astore          6
        //   422: goto            366
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      20     417    425    Ljava/io/IOException;
        //  4      20     402    409    Any
        //  20     39     361    366    Ljava/io/IOException;
        //  20     39     393    395    Any
        //  39     116    361    366    Ljava/io/IOException;
        //  39     116    393    395    Any
        //  121    135    356    361    Ljava/io/IOException;
        //  121    135    393    395    Any
        //  140    176    361    366    Ljava/io/IOException;
        //  140    176    393    395    Any
        //  191    260    378    383    Ljava/io/IOException;
        //  191    260    393    395    Any
        //  264    277    383    388    Ljava/io/IOException;
        //  264    277    393    395    Any
        //  282    337    388    393    Ljava/io/IOException;
        //  282    337    393    395    Any
        //  341    350    361    366    Ljava/io/IOException;
        //  341    350    393    395    Any
        //  358    361    361    366    Ljava/io/IOException;
        //  358    361    393    395    Any
        //  366    371    409    417    Any
        //  380    383    383    388    Ljava/io/IOException;
        //  380    383    393    395    Any
        //  385    388    388    393    Ljava/io/IOException;
        //  385    388    393    395    Any
        //  390    393    361    366    Ljava/io/IOException;
        //  390    393    393    395    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 190, Size: 190
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    private boolean a(final String s) {
        return this.a.containsKey(s);
    }
    
    private boolean c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //    14: bipush          61
        //    16: aaload         
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: aload_0        
        //    21: getfield        com/whatsapp/gdrive/bq.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    24: invokevirtual   java/util/concurrent/ConcurrentHashMap.size:()I
        //    27: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    30: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    33: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    36: aload_0        
        //    37: getfield        com/whatsapp/gdrive/bq.f:Lcom/whatsapp/gdrive/q;
        //    40: aload_0        
        //    41: getfield        com/whatsapp/gdrive/bq.h:Ljava/lang/String;
        //    44: invokevirtual   com/whatsapp/gdrive/q.j:(Ljava/lang/String;)Ljava/util/List;
        //    47: astore_2       
        //    48: aload_2        
        //    49: ifnonnull       68
        //    52: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //    55: bipush          59
        //    57: aaload         
        //    58: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    61: iconst_0       
        //    62: ireturn        
        //    63: astore          15
        //    65: aload           15
        //    67: athrow         
        //    68: new             Ljava/util/ArrayList;
        //    71: dup            
        //    72: bipush          100
        //    74: invokespecial   java/util/ArrayList.<init>:(I)V
        //    77: astore_3       
        //    78: aload_2        
        //    79: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    84: astore          4
        //    86: aload           4
        //    88: invokeinterface java/util/Iterator.hasNext:()Z
        //    93: ifeq            357
        //    96: aload           4
        //    98: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   103: checkcast       Lcom/whatsapp/gdrive/ag;
        //   106: astore          6
        //   108: aload           6
        //   110: invokevirtual   com/whatsapp/gdrive/ag.g:()Ljava/lang/String;
        //   113: ifnonnull       150
        //   116: new             Ljava/lang/StringBuilder;
        //   119: dup            
        //   120: invokespecial   java/lang/StringBuilder.<init>:()V
        //   123: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   126: bipush          67
        //   128: aaload         
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: aload           6
        //   134: invokevirtual   com/whatsapp/gdrive/ag.toString:()Ljava/lang/String;
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   143: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   146: iload_1        
        //   147: ifeq            86
        //   150: aload_0        
        //   151: aload           6
        //   153: invokevirtual   com/whatsapp/gdrive/ag.g:()Ljava/lang/String;
        //   156: invokespecial   com/whatsapp/gdrive/bq.a:(Ljava/lang/String;)Z
        //   159: istore          12
        //   161: iload           12
        //   163: ifeq            329
        //   166: aload           6
        //   168: invokevirtual   com/whatsapp/gdrive/ag.e:()Ljava/lang/String;
        //   171: aload_0        
        //   172: aload           6
        //   174: invokevirtual   com/whatsapp/gdrive/ag.g:()Ljava/lang/String;
        //   177: invokevirtual   com/whatsapp/gdrive/bq.c:(Ljava/lang/String;)Ljava/lang/String;
        //   180: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   183: istore          13
        //   185: iload           13
        //   187: ifeq            295
        //   190: new             Ljava/lang/StringBuilder;
        //   193: dup            
        //   194: invokespecial   java/lang/StringBuilder.<init>:()V
        //   197: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   200: bipush          62
        //   202: aaload         
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: aload           6
        //   208: invokevirtual   com/whatsapp/gdrive/ag.g:()Ljava/lang/String;
        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   217: bipush          65
        //   219: aaload         
        //   220: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   223: aload           6
        //   225: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   231: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   234: bipush          64
        //   236: aaload         
        //   237: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   240: aload           6
        //   242: invokevirtual   com/whatsapp/gdrive/ag.e:()Ljava/lang/String;
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   251: bipush          56
        //   253: aaload         
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   260: bipush          68
        //   262: aaload         
        //   263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   266: aload_0        
        //   267: getfield        com/whatsapp/gdrive/bq.a:Ljava/util/concurrent/ConcurrentHashMap;
        //   270: invokevirtual   java/util/concurrent/ConcurrentHashMap.size:()I
        //   273: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   276: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   279: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   282: aload_3        
        //   283: aload           6
        //   285: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   290: pop            
        //   291: iload_1        
        //   292: ifeq            353
        //   295: new             Ljava/lang/StringBuilder;
        //   298: dup            
        //   299: invokespecial   java/lang/StringBuilder.<init>:()V
        //   302: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   305: bipush          63
        //   307: aaload         
        //   308: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   311: aload           6
        //   313: invokevirtual   com/whatsapp/gdrive/ag.g:()Ljava/lang/String;
        //   316: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   319: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   322: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   325: iload_1        
        //   326: ifeq            353
        //   329: aload_0        
        //   330: aload           6
        //   332: invokevirtual   com/whatsapp/gdrive/ag.g:()Ljava/lang/String;
        //   335: aload           6
        //   337: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   340: aload           6
        //   342: invokevirtual   com/whatsapp/gdrive/ag.d:()J
        //   345: aload           6
        //   347: invokevirtual   com/whatsapp/gdrive/ag.e:()Ljava/lang/String;
        //   350: invokevirtual   com/whatsapp/gdrive/bq.a:(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
        //   353: iload_1        
        //   354: ifeq            86
        //   357: new             Ljava/lang/StringBuilder;
        //   360: dup            
        //   361: invokespecial   java/lang/StringBuilder.<init>:()V
        //   364: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   367: bipush          66
        //   369: aaload         
        //   370: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   373: aload_3        
        //   374: invokeinterface java/util/List.size:()I
        //   379: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   382: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   385: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   388: aload_0        
        //   389: getfield        com/whatsapp/gdrive/bq.f:Lcom/whatsapp/gdrive/q;
        //   392: aload_3        
        //   393: invokevirtual   com/whatsapp/gdrive/q.a:(Ljava/util/List;)Z
        //   396: ifeq            443
        //   399: new             Ljava/lang/StringBuilder;
        //   402: dup            
        //   403: invokespecial   java/lang/StringBuilder.<init>:()V
        //   406: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   409: bipush          69
        //   411: aaload         
        //   412: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   415: aload_3        
        //   416: invokeinterface java/util/List.size:()I
        //   421: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   424: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   427: bipush          60
        //   429: aaload         
        //   430: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   433: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   436: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   439: iload_1        
        //   440: ifeq            483
        //   443: new             Ljava/lang/StringBuilder;
        //   446: dup            
        //   447: invokespecial   java/lang/StringBuilder.<init>:()V
        //   450: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   453: bipush          58
        //   455: aaload         
        //   456: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   459: aload_3        
        //   460: invokeinterface java/util/List.size:()I
        //   465: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   468: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   471: bipush          57
        //   473: aaload         
        //   474: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   477: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   480: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   483: iconst_1       
        //   484: ireturn        
        //   485: astore          7
        //   487: aload           7
        //   489: athrow         
        //   490: astore          8
        //   492: aload           8
        //   494: athrow         
        //   495: astore          9
        //   497: aload           9
        //   499: athrow         
        //   500: astore          10
        //   502: aload           10
        //   504: athrow         
        //   505: astore          11
        //   507: aload           11
        //   509: athrow         
        //   510: astore          5
        //   512: aload           5
        //   514: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  52     61     63     68     Ljava/lang/IllegalStateException;
        //  108    146    485    490    Ljava/lang/IllegalStateException;
        //  150    161    490    495    Ljava/lang/IllegalStateException;
        //  166    185    495    500    Ljava/lang/IllegalStateException;
        //  190    291    500    505    Ljava/lang/IllegalStateException;
        //  295    325    505    510    Ljava/lang/IllegalStateException;
        //  329    353    505    510    Ljava/lang/IllegalStateException;
        //  399    439    510    515    Ljava/lang/IllegalStateException;
        //  443    483    510    515    Ljava/lang/IllegalStateException;
        //  492    495    495    500    Ljava/lang/IllegalStateException;
        //  497    500    500    505    Ljava/lang/IllegalStateException;
        //  502    505    505    510    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 222, Size: 222
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
    
    private boolean k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/gdrive/bq.c:Ljava/io/File;
        //     8: astore_2       
        //     9: new             Lcom/google/ai;
        //    12: dup            
        //    13: new             Ljava/io/InputStreamReader;
        //    16: dup            
        //    17: new             Ljava/io/FileInputStream;
        //    20: dup            
        //    21: aload_2        
        //    22: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    25: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    28: invokespecial   com/google/ai.<init>:(Ljava/io/Reader;)V
        //    31: astore_3       
        //    32: aload_3        
        //    33: invokevirtual   com/google/ai.n:()V
        //    36: aload_3        
        //    37: invokevirtual   com/google/ai.o:()Z
        //    40: istore          7
        //    42: iload           7
        //    44: ifeq            325
        //    47: aconst_null    
        //    48: astore          8
        //    50: aconst_null    
        //    51: astore          9
        //    53: aconst_null    
        //    54: astore          10
        //    56: ldc2_w          -1
        //    59: lstore          11
        //    61: aload_3        
        //    62: invokevirtual   com/google/ai.p:()V
        //    65: aload_3        
        //    66: invokevirtual   com/google/ai.o:()Z
        //    69: ifeq            211
        //    72: aload_3        
        //    73: invokevirtual   com/google/ai.b:()Ljava/lang/String;
        //    76: astore          27
        //    78: iconst_m1      
        //    79: istore          28
        //    81: aload           27
        //    83: invokevirtual   java/lang/String.hashCode:()I
        //    86: istore          30
        //    88: iload           30
        //    90: lookupswitch {
        //              102: 350
        //              109: 394
        //              114: 372
        //              115: 416
        //          default: 132
        //        }
        //   132: iload           28
        //   134: tableswitch {
        //                0: 521
        //                1: 531
        //                2: 541
        //                3: 551
        //          default: 164
        //        }
        //   164: new             Ljava/lang/StringBuilder;
        //   167: dup            
        //   168: invokespecial   java/lang/StringBuilder.<init>:()V
        //   171: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   174: bipush          10
        //   176: aaload         
        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   180: aload           27
        //   182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   185: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   188: bipush          8
        //   190: aaload         
        //   191: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   194: aload_3        
        //   195: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   204: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   207: iload_1        
        //   208: ifeq            65
        //   211: aload_3        
        //   212: invokevirtual   com/google/ai.v:()V
        //   215: aload           10
        //   217: astore          14
        //   219: lload           11
        //   221: lstore          25
        //   223: aload           9
        //   225: astore          17
        //   227: aload           8
        //   229: astore          18
        //   231: lload           25
        //   233: lstore          19
        //   235: aload           18
        //   237: ifnonnull       253
        //   240: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   243: bipush          12
        //   245: aaload         
        //   246: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   249: iload_1        
        //   250: ifeq            36
        //   253: aload           17
        //   255: ifnonnull       271
        //   258: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   261: bipush          13
        //   263: aaload         
        //   264: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   267: iload_1        
        //   268: ifeq            36
        //   271: aload           14
        //   273: ifnonnull       289
        //   276: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   279: bipush          14
        //   281: aaload         
        //   282: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   285: iload_1        
        //   286: ifeq            36
        //   289: lload           19
        //   291: lconst_0       
        //   292: lcmp           
        //   293: ifge            309
        //   296: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   299: bipush          15
        //   301: aaload         
        //   302: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   305: iload_1        
        //   306: ifeq            36
        //   309: aload_0        
        //   310: aload           18
        //   312: aload           17
        //   314: lload           19
        //   316: aload           14
        //   318: invokevirtual   com/whatsapp/gdrive/bq.a:(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
        //   321: iload_1        
        //   322: ifeq            36
        //   325: aload_3        
        //   326: invokevirtual   com/google/ai.a:()V
        //   329: aload_3        
        //   330: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   333: iconst_1       
        //   334: ireturn        
        //   335: astore          39
        //   337: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   340: bipush          9
        //   342: aaload         
        //   343: aload           39
        //   345: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   348: iconst_0       
        //   349: ireturn        
        //   350: aload           27
        //   352: ldc_w           "f"
        //   355: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   358: istore          38
        //   360: iload           38
        //   362: ifeq            132
        //   365: iconst_0       
        //   366: istore          28
        //   368: iload_1        
        //   369: ifeq            132
        //   372: aload           27
        //   374: ldc_w           "r"
        //   377: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   380: istore          37
        //   382: iload           37
        //   384: ifeq            132
        //   387: iconst_1       
        //   388: istore          28
        //   390: iload_1        
        //   391: ifeq            132
        //   394: aload           27
        //   396: ldc_w           "m"
        //   399: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   402: istore          35
        //   404: iload           35
        //   406: ifeq            132
        //   409: iconst_2       
        //   410: istore          28
        //   412: iload_1        
        //   413: ifeq            132
        //   416: aload           27
        //   418: ldc_w           "s"
        //   421: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   424: istore          32
        //   426: iload           32
        //   428: ifeq            132
        //   431: iconst_3       
        //   432: istore          28
        //   434: goto            132
        //   437: astore          29
        //   439: aload           29
        //   441: athrow         
        //   442: astore          13
        //   444: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   447: bipush          16
        //   449: aaload         
        //   450: aload           13
        //   452: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   455: aload           10
        //   457: astore          14
        //   459: lload           11
        //   461: lstore          15
        //   463: aload           9
        //   465: astore          17
        //   467: aload           8
        //   469: astore          18
        //   471: lload           15
        //   473: lstore          19
        //   475: goto            235
        //   478: astore          36
        //   480: aload           36
        //   482: athrow         
        //   483: astore          6
        //   485: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   488: bipush          11
        //   490: aaload         
        //   491: aload           6
        //   493: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   496: aload_3        
        //   497: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   500: iconst_0       
        //   501: ireturn        
        //   502: astore          34
        //   504: aload           34
        //   506: athrow         
        //   507: astore          5
        //   509: aload_3        
        //   510: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   513: aload           5
        //   515: athrow         
        //   516: astore          31
        //   518: aload           31
        //   520: athrow         
        //   521: aload_3        
        //   522: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   525: astore          8
        //   527: iload_1        
        //   528: ifeq            207
        //   531: aload_3        
        //   532: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   535: astore          9
        //   537: iload_1        
        //   538: ifeq            207
        //   541: aload_3        
        //   542: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   545: astore          10
        //   547: iload_1        
        //   548: ifeq            207
        //   551: aload_3        
        //   552: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   555: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   558: lstore          11
        //   560: iload_1        
        //   561: ifeq            207
        //   564: goto            164
        //   567: astore          33
        //   569: aload           33
        //   571: athrow         
        //   572: astore          24
        //   574: aload           24
        //   576: athrow         
        //   577: astore          4
        //   579: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   582: bipush          7
        //   584: aaload         
        //   585: aload           4
        //   587: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   590: aload_3        
        //   591: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   594: iconst_0       
        //   595: ireturn        
        //   596: astore          23
        //   598: aload           23
        //   600: athrow         
        //   601: astore          22
        //   603: aload           22
        //   605: athrow         
        //   606: astore          21
        //   608: aload           21
        //   610: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  9      32     335    350    Ljava/io/IOException;
        //  32     36     483    502    Ljava/io/IOException;
        //  32     36     577    596    Ljava/lang/IllegalStateException;
        //  32     36     507    516    Any
        //  36     42     483    502    Ljava/io/IOException;
        //  36     42     577    596    Ljava/lang/IllegalStateException;
        //  36     42     507    516    Any
        //  61     65     442    478    Ljava/lang/IllegalStateException;
        //  61     65     483    502    Ljava/io/IOException;
        //  61     65     507    516    Any
        //  65     78     442    478    Ljava/lang/IllegalStateException;
        //  65     78     483    502    Ljava/io/IOException;
        //  65     78     507    516    Any
        //  81     88     437    442    Ljava/io/IOException;
        //  81     88     442    478    Ljava/lang/IllegalStateException;
        //  81     88     507    516    Any
        //  164    207    567    572    Ljava/io/IOException;
        //  164    207    442    478    Ljava/lang/IllegalStateException;
        //  164    207    507    516    Any
        //  211    215    442    478    Ljava/lang/IllegalStateException;
        //  211    215    483    502    Ljava/io/IOException;
        //  211    215    507    516    Any
        //  240    249    572    577    Ljava/io/IOException;
        //  240    249    577    596    Ljava/lang/IllegalStateException;
        //  240    249    507    516    Any
        //  258    267    596    601    Ljava/io/IOException;
        //  258    267    577    596    Ljava/lang/IllegalStateException;
        //  258    267    507    516    Any
        //  276    285    601    606    Ljava/io/IOException;
        //  276    285    577    596    Ljava/lang/IllegalStateException;
        //  276    285    507    516    Any
        //  296    305    606    611    Ljava/io/IOException;
        //  296    305    577    596    Ljava/lang/IllegalStateException;
        //  296    305    507    516    Any
        //  309    321    483    502    Ljava/io/IOException;
        //  309    321    577    596    Ljava/lang/IllegalStateException;
        //  309    321    507    516    Any
        //  325    329    483    502    Ljava/io/IOException;
        //  325    329    577    596    Ljava/lang/IllegalStateException;
        //  325    329    507    516    Any
        //  350    360    437    442    Ljava/io/IOException;
        //  350    360    442    478    Ljava/lang/IllegalStateException;
        //  350    360    507    516    Any
        //  372    382    478    483    Ljava/io/IOException;
        //  372    382    442    478    Ljava/lang/IllegalStateException;
        //  372    382    507    516    Any
        //  394    404    502    507    Ljava/io/IOException;
        //  394    404    442    478    Ljava/lang/IllegalStateException;
        //  394    404    507    516    Any
        //  416    426    516    521    Ljava/io/IOException;
        //  416    426    442    478    Ljava/lang/IllegalStateException;
        //  416    426    507    516    Any
        //  439    442    442    478    Ljava/lang/IllegalStateException;
        //  439    442    483    502    Ljava/io/IOException;
        //  439    442    507    516    Any
        //  444    455    483    502    Ljava/io/IOException;
        //  444    455    577    596    Ljava/lang/IllegalStateException;
        //  444    455    507    516    Any
        //  480    483    442    478    Ljava/lang/IllegalStateException;
        //  480    483    483    502    Ljava/io/IOException;
        //  480    483    507    516    Any
        //  485    496    507    516    Any
        //  504    507    442    478    Ljava/lang/IllegalStateException;
        //  504    507    483    502    Ljava/io/IOException;
        //  504    507    507    516    Any
        //  518    521    442    478    Ljava/lang/IllegalStateException;
        //  518    521    483    502    Ljava/io/IOException;
        //  518    521    507    516    Any
        //  521    527    442    478    Ljava/lang/IllegalStateException;
        //  521    527    483    502    Ljava/io/IOException;
        //  521    527    507    516    Any
        //  531    537    442    478    Ljava/lang/IllegalStateException;
        //  531    537    483    502    Ljava/io/IOException;
        //  531    537    507    516    Any
        //  541    547    442    478    Ljava/lang/IllegalStateException;
        //  541    547    483    502    Ljava/io/IOException;
        //  541    547    507    516    Any
        //  551    560    442    478    Ljava/lang/IllegalStateException;
        //  551    560    483    502    Ljava/io/IOException;
        //  551    560    507    516    Any
        //  569    572    442    478    Ljava/lang/IllegalStateException;
        //  569    572    483    502    Ljava/io/IOException;
        //  569    572    507    516    Any
        //  574    577    483    502    Ljava/io/IOException;
        //  574    577    577    596    Ljava/lang/IllegalStateException;
        //  574    577    507    516    Any
        //  579    590    507    516    Any
        //  598    601    483    502    Ljava/io/IOException;
        //  598    601    577    596    Ljava/lang/IllegalStateException;
        //  598    601    507    516    Any
        //  603    606    483    502    Ljava/io/IOException;
        //  603    606    577    596    Ljava/lang/IllegalStateException;
        //  603    606    507    516    Any
        //  608    611    483    502    Ljava/io/IOException;
        //  608    611    577    596    Ljava/lang/IllegalStateException;
        //  608    611    507    516    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    private boolean m() {
        Label_0044: {
            try {
                if (this.d != null) {
                    final bq bq = this;
                    final bq bq2 = this;
                    final ag ag = bq2.d;
                    final String s = ag.c();
                    final JSONObject jsonObject = new JSONObject(s);
                    bq.b = jsonObject;
                    return true;
                }
                break Label_0044;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final bq bq = this;
                final bq bq2 = this;
                final ag ag = bq2.d;
                final String s = ag.c();
                final JSONObject jsonObject = new JSONObject(s);
                bq.b = jsonObject;
                return true;
            }
            catch (JSONException ex2) {
                Log.b(bq.z[5], (Throwable)ex2);
                return false;
            }
        }
        Log.e(bq.z[6]);
        return false;
    }
    
    public int a() {
        try {
            if (this.b != null) {
                return this.b.optInt(bq.z[51], -1);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        Log.e(bq.z[52]);
        return -1;
    }
    
    @ba
    public int a(@NonNull final String s, @NonNull final String s2) {
        aol.a(this.a, bq.z[53]);
        final String b = a7.b(s);
        if (this.a(b)) {
            final String c = this.c(b);
            if (GoogleDriveService.F == 0) {
                return this.a(s, s2, c);
            }
        }
        final String c = null;
        return this.a(s, s2, c);
    }
    
    @ba
    public int a(@NonNull final String s, @NonNull final String s2, @Nullable final String s3) {
        int n = 4;
        if (s3 == null) {
            n = 2;
        }
        else {
            final File file = new File(s);
            try {
                if (!file.exists()) {
                    return 1;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            String a;
            try {
                if (file.length() != this.d(s2)) {
                    return n;
                }
                a = a7.a(file);
                final String s4 = s3;
                final String s5 = a;
                final boolean equals = s4.equals(s5);
                final boolean equals2 = equals;
                if (equals2) {
                    return 3;
                }
                return n;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            try {
                final String s4 = s3;
                final String s5 = a;
                final boolean equals2;
                final boolean equals = equals2 = s4.equals(s5);
                if (equals2) {
                    return 3;
                }
            }
            catch (IllegalStateException ex3) {
                throw ex3;
            }
        }
        return n;
    }
    
    public long a(final boolean p0, final long p1, @NonNull final AtomicBoolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/bq.a:Ljava/util/concurrent/ConcurrentHashMap;
        //     4: ifnonnull       13
        //     7: aload_0        
        //     8: iconst_0       
        //     9: invokevirtual   com/whatsapp/gdrive/bq.a:(Z)Z
        //    12: pop            
        //    13: aload_0        
        //    14: invokevirtual   com/whatsapp/gdrive/bq.h:()J
        //    17: lstore          6
        //    19: iload_1        
        //    20: ifeq            220
        //    23: lload           6
        //    25: lstore          8
        //    27: lload           8
        //    29: lconst_0       
        //    30: lcmp           
        //    31: ifle            51
        //    34: aload           4
        //    36: iconst_0       
        //    37: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //    40: aload           4
        //    42: monitorenter   
        //    43: aload           4
        //    45: invokevirtual   java/lang/Object.notify:()V
        //    48: aload           4
        //    50: monitorexit    
        //    51: new             Ljava/lang/StringBuilder;
        //    54: dup            
        //    55: invokespecial   java/lang/StringBuilder.<init>:()V
        //    58: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //    61: bipush          23
        //    63: aaload         
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: lload_2        
        //    68: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    71: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //    74: bipush          20
        //    76: aaload         
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: lload           6
        //    82: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    85: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //    88: bipush          21
        //    90: aaload         
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: iload_1        
        //    95: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    98: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   101: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   104: lload_2        
        //   105: lconst_0       
        //   106: lcmp           
        //   107: ifge            119
        //   110: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   113: bipush          19
        //   115: aaload         
        //   116: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   119: lload           6
        //   121: lconst_0       
        //   122: lcmp           
        //   123: ifge            135
        //   126: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   129: bipush          22
        //   131: aaload         
        //   132: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   135: lload           8
        //   137: aload_0        
        //   138: lload_2        
        //   139: lload           6
        //   141: lsub           
        //   142: iload_1        
        //   143: aload           4
        //   145: invokespecial   com/whatsapp/gdrive/bq.a:(JZLjava/util/concurrent/atomic/AtomicBoolean;)J
        //   148: ladd           
        //   149: lstore          11
        //   151: lload           11
        //   153: lconst_0       
        //   154: lcmp           
        //   155: istore          13
        //   157: iconst_0       
        //   158: istore          14
        //   160: iload           13
        //   162: ifne            168
        //   165: iconst_1       
        //   166: istore          14
        //   168: aload           4
        //   170: iload           14
        //   172: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   175: aload           4
        //   177: monitorenter   
        //   178: aload           4
        //   180: invokevirtual   java/lang/Object.notify:()V
        //   183: aload           4
        //   185: monitorexit    
        //   186: lload           11
        //   188: lreturn        
        //   189: astore          5
        //   191: aload           5
        //   193: athrow         
        //   194: astore          17
        //   196: aload           4
        //   198: monitorexit    
        //   199: aload           17
        //   201: athrow         
        //   202: astore          10
        //   204: aload           10
        //   206: athrow         
        //   207: astore          16
        //   209: aload           16
        //   211: athrow         
        //   212: astore          15
        //   214: aload           4
        //   216: monitorexit    
        //   217: aload           15
        //   219: athrow         
        //   220: lconst_0       
        //   221: lstore          8
        //   223: goto            27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      13     189    194    Ljava/lang/IllegalStateException;
        //  43     51     194    202    Any
        //  51     104    202    207    Ljava/lang/IllegalStateException;
        //  110    119    202    207    Ljava/lang/IllegalStateException;
        //  126    135    207    212    Ljava/lang/IllegalStateException;
        //  178    186    212    220    Any
        //  196    199    194    202    Any
        //  214    217    212    220    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 119, Size: 119
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
    
    public void a(final String s, final String s2, final long n, final String s3) {
        this.a.put(s, new Pair((Object)s2, (Object)s3));
        this.e.put(s2, s);
        this.g.put(s2, n);
    }
    
    public boolean a(final GoogleDriveService googleDriveService, final long n, final long n2, final long n3, final long n4, final long n5, final int n6, final int n7) {
        final int f = GoogleDriveService.F;
        final File c = this.c;
        try {
            if (!this.a(c)) {
                return false;
            }
        }
        catch (JSONException ex) {
            throw ex;
        }
        final JSONObject jsonObject = new JSONObject();
        String string = null;
        String s = null;
        ag[] c2 = null;
        Label_0217: {
            while (true) {
                try {
                    jsonObject.put(bq.z[33], 1);
                    jsonObject.put(bq.z[24], n);
                    jsonObject.put(bq.z[27], n2);
                    jsonObject.put(bq.z[25], n3);
                    jsonObject.put(bq.z[28], n4);
                    jsonObject.put(bq.z[29], n5);
                    jsonObject.put(bq.z[26], n6);
                    jsonObject.put(bq.z[37], n7);
                    string = jsonObject.toString();
                    s = bq.z[32];
                    c2 = this.f.c(this.h, s);
                    if (c2 == null) {
                        final String[] array = bq.z;
                        final int n8 = 34;
                        final String s2 = array[n8];
                        Log.e(s2);
                        return false;
                    }
                    break Label_0217;
                }
                catch (JSONException ex2) {
                    Log.b(bq.z[30], (Throwable)ex2);
                    continue;
                }
                break;
            }
            try {
                final String[] array = bq.z;
                final int n8 = 34;
                final String s2 = array[n8];
                Log.e(s2);
                return false;
            }
            catch (JSONException ex3) {
                throw ex3;
            }
        }
        final int length = c2.length;
        int i = 0;
        while (i < length) {
            this.f.e(c2[i].b());
            ++i;
            if (f != 0) {
                break;
            }
        }
        boolean a = googleDriveService.a(c.getAbsolutePath(), s, null, string, false);
        Label_0373: {
            if (a) {
                final ag e = this.f.e(this.h, s);
                if (e != null) {
                    a &= this.f.d(e.b(), bq.z[36]);
                    if (f == 0) {
                        break Label_0373;
                    }
                }
                try {
                    Log.e(bq.z[39] + s + bq.z[40]);
                    return false;
                }
                catch (JSONException ex4) {
                    throw ex4;
                }
            }
        }
        if (a) {
            this.d = null;
            final ag[] c3 = this.f.c(this.h, bq.z[38]);
            if (c3 == null) {
                try {
                    Log.e(bq.z[35]);
                    return false;
                }
                catch (JSONException ex5) {
                    throw ex5;
                }
            }
            if (c3.length > 0) {
                this.d = c3[0];
                int j = 1;
                while (j < c3.length) {
                    this.f.e(c3[j].b());
                    ++j;
                    if (f != 0) {
                        break;
                    }
                }
            }
            try {
                this.d = this.f.e(this.h, bq.z[31]);
                if (this.d != null) {
                    this.m();
                    return true;
                }
            }
            catch (JSONException ex6) {
                throw ex6;
            }
            return false;
        }
        return false;
    }
    
    public boolean a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     5: istore_3       
        //     6: aload_0        
        //     7: new             Ljava/util/concurrent/ConcurrentHashMap;
        //    10: dup            
        //    11: invokespecial   java/util/concurrent/ConcurrentHashMap.<init>:()V
        //    14: putfield        com/whatsapp/gdrive/bq.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    17: aload_0        
        //    18: new             Ljava/util/HashMap;
        //    21: dup            
        //    22: invokespecial   java/util/HashMap.<init>:()V
        //    25: putfield        com/whatsapp/gdrive/bq.e:Ljava/util/HashMap;
        //    28: aload_0        
        //    29: new             Ljava/util/HashMap;
        //    32: dup            
        //    33: invokespecial   java/util/HashMap.<init>:()V
        //    36: putfield        com/whatsapp/gdrive/bq.g:Ljava/util/HashMap;
        //    39: iload_1        
        //    40: ifeq            68
        //    43: aload_0        
        //    44: invokespecial   com/whatsapp/gdrive/bq.c:()Z
        //    47: istore          5
        //    49: iload           5
        //    51: istore          6
        //    53: aload_0        
        //    54: monitorexit    
        //    55: iload           6
        //    57: ireturn        
        //    58: astore          4
        //    60: aload           4
        //    62: athrow         
        //    63: astore_2       
        //    64: aload_0        
        //    65: monitorexit    
        //    66: aload_2        
        //    67: athrow         
        //    68: aload_0        
        //    69: getfield        com/whatsapp/gdrive/bq.d:Lcom/whatsapp/gdrive/ag;
        //    72: astore          9
        //    74: aload           9
        //    76: ifnonnull       111
        //    79: aload_0        
        //    80: aload_0        
        //    81: getfield        com/whatsapp/gdrive/bq.f:Lcom/whatsapp/gdrive/q;
        //    84: aload_0        
        //    85: getfield        com/whatsapp/gdrive/bq.h:Ljava/lang/String;
        //    88: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //    91: iconst_1       
        //    92: aaload         
        //    93: invokevirtual   com/whatsapp/gdrive/q.e:(Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/gdrive/ag;
        //    96: putfield        com/whatsapp/gdrive/bq.d:Lcom/whatsapp/gdrive/ag;
        //    99: aload_0        
        //   100: getfield        com/whatsapp/gdrive/bq.d:Lcom/whatsapp/gdrive/ag;
        //   103: ifnull          111
        //   106: aload_0        
        //   107: invokespecial   com/whatsapp/gdrive/bq.m:()Z
        //   110: pop            
        //   111: aload_0        
        //   112: getfield        com/whatsapp/gdrive/bq.d:Lcom/whatsapp/gdrive/ag;
        //   115: ifnonnull       146
        //   118: aload_0        
        //   119: invokespecial   com/whatsapp/gdrive/bq.c:()Z
        //   122: istore          23
        //   124: iload           23
        //   126: istore          6
        //   128: goto            53
        //   131: astore          7
        //   133: aload           7
        //   135: athrow         
        //   136: astore          8
        //   138: aload           8
        //   140: athrow         
        //   141: astore          10
        //   143: aload           10
        //   145: athrow         
        //   146: aload_0        
        //   147: getfield        com/whatsapp/gdrive/bq.c:Ljava/io/File;
        //   150: invokestatic    com/whatsapp/gdrive/a7.a:(Ljava/io/File;)Ljava/lang/String;
        //   153: astore          11
        //   155: aload           11
        //   157: ifnull          345
        //   160: aload           11
        //   162: aload_0        
        //   163: getfield        com/whatsapp/gdrive/bq.d:Lcom/whatsapp/gdrive/ag;
        //   166: invokevirtual   com/whatsapp/gdrive/ag.e:()Ljava/lang/String;
        //   169: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   172: istore          22
        //   174: iload           22
        //   176: ifeq            345
        //   179: aload_0        
        //   180: invokespecial   com/whatsapp/gdrive/bq.k:()Z
        //   183: ifne            296
        //   186: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   189: iconst_2       
        //   190: aaload         
        //   191: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   194: aload_0        
        //   195: invokespecial   com/whatsapp/gdrive/bq.c:()Z
        //   198: istore          20
        //   200: iload           20
        //   202: istore          6
        //   204: goto            53
        //   207: astore          21
        //   209: aload           21
        //   211: athrow         
        //   212: aload_0        
        //   213: getfield        com/whatsapp/gdrive/bq.f:Lcom/whatsapp/gdrive/q;
        //   216: aload_0        
        //   217: getfield        com/whatsapp/gdrive/bq.c:Ljava/io/File;
        //   220: aload_0        
        //   221: getfield        com/whatsapp/gdrive/bq.d:Lcom/whatsapp/gdrive/ag;
        //   224: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   227: aload_0        
        //   228: getfield        com/whatsapp/gdrive/bq.d:Lcom/whatsapp/gdrive/ag;
        //   231: invokevirtual   com/whatsapp/gdrive/ag.e:()Ljava/lang/String;
        //   234: aload_0        
        //   235: getfield        com/whatsapp/gdrive/bq.d:Lcom/whatsapp/gdrive/ag;
        //   238: invokevirtual   com/whatsapp/gdrive/ag.d:()J
        //   241: aconst_null    
        //   242: invokevirtual   com/whatsapp/gdrive/q.a:(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;JLcom/whatsapp/gdrive/v;)Z
        //   245: istore          13
        //   247: iload           13
        //   249: ifeq            256
        //   252: iload_3        
        //   253: ifeq            268
        //   256: iload           12
        //   258: iconst_1       
        //   259: iadd           
        //   260: istore          14
        //   262: iload           12
        //   264: iconst_5       
        //   265: if_icmplt       338
        //   268: iload           13
        //   270: ifne            179
        //   273: aload_0        
        //   274: invokespecial   com/whatsapp/gdrive/bq.c:()Z
        //   277: istore          16
        //   279: iload           16
        //   281: istore          6
        //   283: goto            53
        //   286: astore          15
        //   288: aload           15
        //   290: athrow         
        //   291: astore          17
        //   293: aload           17
        //   295: athrow         
        //   296: aload_0        
        //   297: getfield        com/whatsapp/gdrive/bq.a:Ljava/util/concurrent/ConcurrentHashMap;
        //   300: invokevirtual   java/util/concurrent/ConcurrentHashMap.size:()I
        //   303: ifne            332
        //   306: getstatic       com/whatsapp/gdrive/bq.z:[Ljava/lang/String;
        //   309: iconst_0       
        //   310: aaload         
        //   311: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   314: aload_0        
        //   315: invokespecial   com/whatsapp/gdrive/bq.c:()Z
        //   318: istore          19
        //   320: iload           19
        //   322: istore          6
        //   324: goto            53
        //   327: astore          18
        //   329: aload           18
        //   331: athrow         
        //   332: iconst_1       
        //   333: istore          6
        //   335: goto            53
        //   338: iload           14
        //   340: istore          12
        //   342: goto            212
        //   345: iconst_0       
        //   346: istore          12
        //   348: goto            212
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      6      63     68     Any
        //  6      39     58     63     Ljava/lang/IllegalStateException;
        //  6      39     63     68     Any
        //  43     49     58     63     Ljava/lang/IllegalStateException;
        //  43     49     63     68     Any
        //  60     63     63     68     Any
        //  68     74     131    136    Ljava/lang/IllegalStateException;
        //  68     74     63     68     Any
        //  79     111    136    141    Ljava/lang/IllegalStateException;
        //  79     111    63     68     Any
        //  111    124    141    146    Ljava/lang/IllegalStateException;
        //  111    124    63     68     Any
        //  133    136    136    141    Ljava/lang/IllegalStateException;
        //  133    136    63     68     Any
        //  138    141    63     68     Any
        //  143    146    63     68     Any
        //  146    155    63     68     Any
        //  160    174    207    212    Ljava/lang/IllegalStateException;
        //  160    174    63     68     Any
        //  179    200    291    296    Ljava/lang/IllegalStateException;
        //  179    200    63     68     Any
        //  209    212    63     68     Any
        //  212    247    63     68     Any
        //  273    279    286    291    Ljava/lang/IllegalStateException;
        //  273    279    63     68     Any
        //  288    291    63     68     Any
        //  293    296    63     68     Any
        //  296    320    327    332    Ljava/lang/IllegalStateException;
        //  296    320    63     68     Any
        //  329    332    63     68     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 174, Size: 174
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
    
    public long b() {
        try {
            if (this.b != null) {
                return this.b.optLong(bq.z[3], -1L);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        Log.e(bq.z[4]);
        return -1L;
    }
    
    public String b(final String s) {
        return this.e.get(s);
    }
    
    public String c(final String s) {
        try {
            if (this.a(s)) {
                return (String)this.a.get(s).second;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return null;
    }
    
    long d(final String s) {
        final Long n = this.g.get(s);
        if (n == null) {
            return 0L;
        }
        return n;
    }
    
    public ag d() {
        return this.d;
    }
    
    public int e() {
        try {
            if (this.b != null) {
                return this.b.optInt(bq.z[43], -1);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        Log.e(bq.z[44]);
        return -1;
    }
    
    public String e(final String s) {
        try {
            if (this.a.containsKey(s)) {
                return (String)this.a.get(s).first;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return null;
    }
    
    public long f() {
        try {
            if (this.b != null) {
                return this.b.optLong(bq.z[42], -1L);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        Log.e(bq.z[41]);
        return -1L;
    }
    
    public boolean f(final String s) {
        return this.e.containsKey(s);
    }
    
    public Set g() {
        return this.e.keySet();
    }
    
    public long h() {
        try {
            if (this.b != null) {
                return this.b.optLong(bq.z[17], -1L);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        Log.e(bq.z[18]);
        return -1L;
    }
    
    public long i() {
        try {
            if (this.c.exists()) {
                return this.c.length();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return -1L;
    }
    
    public boolean j() {
        try {
            if (this.a != null) {
                return true;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return false;
    }
    
    public Set l() {
        return this.a.keySet();
    }
    
    public int n() {
        return this.a.size();
    }
}
