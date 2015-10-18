// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.cj;
import java.util.UUID;
import java.util.TreeMap;
import java.io.Closeable;
import java.util.LinkedList;
import android.os.Environment;
import java.io.Writer;
import java.io.OutputStream;
import java.util.Date;
import java.util.Arrays;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.io.IOException;
import com.crashlytics.android.internal.bt;
import java.util.Iterator;
import com.crashlytics.android.internal.ap;
import android.content.IntentFilter;
import java.util.Locale;
import com.crashlytics.android.internal.cl;
import com.crashlytics.android.internal.bi;
import java.util.Collections;
import java.util.List;
import com.crashlytics.android.internal.bp;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.util.concurrent.ExecutorService;
import android.content.BroadcastReceiver;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.Comparator;
import java.io.FilenameFilter;
import java.util.concurrent.Callable;

final class be implements Callable
{
    private /* synthetic */ long a;
    private /* synthetic */ String b;
    private /* synthetic */ bc c;
    
    be(final bc c, final long a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
}
