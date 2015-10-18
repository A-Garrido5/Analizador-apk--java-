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
import java.util.concurrent.Callable;
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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.Comparator;
import java.io.File;
import java.io.FilenameFilter;

final class n implements FilenameFilter
{
    @Override
    public final boolean accept(final File file, final String s) {
        return bc.d.matcher(s).matches();
    }
}
