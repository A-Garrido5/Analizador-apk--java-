// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import java.util.Collections;
import java.util.Collection;
import org.json.JSONArray;
import com.fasterxml.jackson.core.JsonParser;
import java.io.Closeable;
import java.io.IOException;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.errorreporter.a;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.api.bh;
import java.util.List;
import java.util.Iterator;
import android.content.Context;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.LinkedList;
import android.content.SharedPreferences;

public class VineLoopAggregator
{
    private static final int[] a;
    private static final boolean b;
    private static final boolean c;
    private static VineLoopAggregator d;
    private final SharedPreferences e;
    private LinkedList f;
    
    static {
        boolean c2 = true;
        a = new int[0];
        b = (App.l() && Log.isLoggable("VineLoopAggregator", 3) && c2);
        if (!App.l() || !Log.isLoggable("VineLoopAggregator", 6)) {
            c2 = false;
        }
        c = c2;
    }
    
    private VineLoopAggregator(final Context context) {
        this.f = new LinkedList();
        this.e = context.getSharedPreferences("VineLoops", 0);
        final Iterator<String> iterator = a(this.e.getString("LoopCountRecords", "[]")).iterator();
        while (iterator.hasNext()) {
            final VineLoopAggregator$Record a = VineLoopAggregator$Record.a(iterator.next());
            if (a != null) {
                this.a(a);
            }
        }
    }
    
    public static VineLoopAggregator a(final Context context) {
        synchronized (VineLoopAggregator.a) {
            if (VineLoopAggregator.d == null) {
                VineLoopAggregator.d = new VineLoopAggregator(context);
            }
            return VineLoopAggregator.d;
        }
    }
    
    static List a(final String s) {
        final LinkedList<String> list = new LinkedList<String>();
        JsonParser a = null;
        try {
            a = bh.a.a(s);
            for (JsonToken jsonToken = a.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = a.a()) {
                if (jsonToken == JsonToken.h) {
                    list.add(a.r());
                }
            }
            return list;
        }
        catch (IOException ex) {
            if (VineLoopAggregator.c) {
                Log.e("VineLoopAggregator", "error parsing loop records JSON:\n" + s, (Throwable)ex);
            }
            else {
                ErrorReporter.a(new a(ex).a("serialized records", s));
            }
            return list;
        }
        finally {
            yh.a(a);
        }
    }
    
    private void a(final VineLoopAggregator$Record vineLoopAggregator$Record) {
        synchronized (VineLoopAggregator.a) {
            this.f.add(vineLoopAggregator$Record);
        }
    }
    
    public void a() {
        if (this.f.isEmpty()) {
            return;
        }
        final LinkedList<String> list = new LinkedList<String>();
        synchronized (VineLoopAggregator.a) {
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().a());
            }
        }
        if (VineLoopAggregator.b) {
            Log.d("VineLoopAggregator", "Committing these loop records:\n" + this.toString());
        }
        // monitorexit(array)
        this.e.edit().putString("LoopCountRecords", new JSONArray((Collection)list).toString()).apply();
    }
    
    public void a(final String s, final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("numLoops must be positive");
        }
        final VineLoopAggregator$Record vineLoopAggregator$Record = new VineLoopAggregator$Record(s);
        vineLoopAggregator$Record.a(n);
        this.a(vineLoopAggregator$Record);
        if (VineLoopAggregator.b) {
            Log.d("VineLoopAggregator", String.format("incremented %s by %d to %d", s, n, vineLoopAggregator$Record.b));
        }
    }
    
    public void a(final List list) {
        synchronized (VineLoopAggregator.a) {
            this.f.addAll(0, list);
            this.a();
        }
    }
    
    public List b() {
        if (this.f.isEmpty()) {
            return Collections.emptyList();
        }
        final LinkedList f = new LinkedList();
        synchronized (VineLoopAggregator.a) {
            final LinkedList f2 = this.f;
            this.f = f;
            return f2;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb;
        synchronized (VineLoopAggregator.a) {
            sb = new StringBuilder();
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                sb.append(iterator.next().toString()).append('\n');
            }
        }
        // monitorexit(array)
        return sb.toString();
    }
}
