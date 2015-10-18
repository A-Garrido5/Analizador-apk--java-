// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.Iterator;
import java.util.List;

class f implements j
{
    final /* synthetic */ d a;
    
    f(final d a) {
        this.a = a;
    }
    
    @Override
    public void a(final List list) {
        for (final g g : list) {
            this.a.b(this.a.a(g.a, g.b));
        }
        this.a.i.countDown();
    }
}
