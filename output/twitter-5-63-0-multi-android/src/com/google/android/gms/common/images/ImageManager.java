// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.images;

import java.util.Map;
import com.google.android.gms.internal.i;
import java.util.concurrent.ExecutorService;
import android.os.Handler;
import android.content.Context;
import java.util.HashSet;

public final class ImageManager
{
    private static final Object a;
    private static HashSet b;
    private final Context c;
    private final Handler d;
    private final ExecutorService e;
    private final b f;
    private final i g;
    private final Map h;
    private final Map i;
    private final Map j;
    
    static {
        a = new Object();
        ImageManager.b = new HashSet();
    }
}
