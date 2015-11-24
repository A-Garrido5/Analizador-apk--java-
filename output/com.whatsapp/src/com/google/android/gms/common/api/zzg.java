// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.content.IntentFilter;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.Iterator;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.internal.zze$zza;
import com.google.android.gms.common.internal.zzu;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import com.google.android.gms.common.ConnectionResult;
import android.content.BroadcastReceiver;
import java.util.Queue;
import com.google.android.gms.common.internal.zzj;
import java.util.concurrent.locks.Condition;
import java.util.Map;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzj$zza;
import java.util.Set;
import android.os.Looper;
import java.util.concurrent.locks.Lock;
import android.content.Context;

final class zzg implements GoogleApiClient
{
    private final Context mContext;
    private final int zzWB;
    private final int zzWC;
    final Api$zza zzWE;
    private final Lock zzWL;
    private final Looper zzWt;
    final Set zzXA;
    private final zzg$zzc zzXB;
    private final GoogleApiClient$ConnectionCallbacks zzXC;
    private final zzj$zza zzXD;
    final zze zzXa;
    final Map zzXb;
    private final Condition zzXm;
    final zzj zzXn;
    final Queue zzXo;
    private volatile boolean zzXp;
    private long zzXq;
    private long zzXr;
    final zzg$zza zzXs;
    BroadcastReceiver zzXt;
    final Map zzXu;
    final Map zzXv;
    Set zzXw;
    private volatile zzh zzXx;
    private ConnectionResult zzXy;
    private final Set zzXz;
    
    public zzg(final Context mContext, final Looper zzWt, final zze zzXa, final Api$zza zzWE, final Map map, final Set set, final Set set2, final int zzWB, final int zzWC) {
        final boolean a = Api.a;
        this.zzWL = new ReentrantLock();
        this.zzXo = new LinkedList();
        this.zzXq = 120000L;
        this.zzXr = 5000L;
        this.zzXu = new HashMap();
        this.zzXv = new HashMap();
        this.zzXw = new HashSet();
        this.zzXy = null;
        this.zzXz = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.zzXA = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>(16, 0.75f, 2));
        this.zzXB = new zzg$1(this);
        this.zzXC = new zzg$2(this);
        this.zzXD = new zzg$3(this);
        this.mContext = mContext;
        this.zzXn = new zzj(zzWt, this.zzXD);
        this.zzWt = zzWt;
        this.zzXs = new zzg$zza(this, zzWt);
        this.zzWB = zzWB;
        this.zzWC = zzWC;
        this.zzXb = new HashMap();
        this.zzXm = this.zzWL.newCondition();
        this.zzXx = new zzf(this);
        final Iterator<GoogleApiClient$ConnectionCallbacks> iterator = set.iterator();
        while (iterator.hasNext()) {
            this.zzXn.registerConnectionCallbacks(iterator.next());
            if (a) {
                ++zzu.a;
                break;
            }
        }
        final Iterator<GoogleApiClient$OnConnectionFailedListener> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            this.zzXn.registerConnectionFailedListener(iterator2.next());
            if (a) {
                break;
            }
        }
        final Map zznx = zzXa.zznx();
        for (final Api api : map.keySet()) {
            final V value = map.get(api);
            int n2;
            if (zznx.get(api) != null) {
                int n;
                if (zznx.get(api).zzZW) {
                    n = 1;
                }
                else {
                    n = 2;
                }
                n2 = n;
            }
            else {
                n2 = 0;
            }
            this.zzXb.put(api, n2);
            Api$Client api$Client = null;
            Label_0511: {
                if (api.zzmt()) {
                    api$Client = zza(api.zzmq(), value, mContext, zzWt, zzXa, this.zzXC, this.zza(api, n2));
                    if (!a) {
                        break Label_0511;
                    }
                }
                api$Client = zza(api.zzmp(), value, mContext, zzWt, zzXa, this.zzXC, this.zza(api, n2));
            }
            this.zzXu.put(api.zzms(), api$Client);
            if (a) {
                break;
            }
        }
        this.zzXa = zzXa;
        this.zzWE = zzWE;
    }
    
    private void resume() {
        this.zzWL.lock();
        try {
            if (this.zzmO()) {
                this.connect();
            }
        }
        finally {
            this.zzWL.unlock();
        }
    }
    
    private static Api$Client zza(final Api$zza api$zza, final Object o, final Context context, final Looper looper, final zze zze, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        return api$zza.zza(context, looper, zze, o, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
    }
    
    private final GoogleApiClient$OnConnectionFailedListener zza(final Api api, final int n) {
        return new zzg$4(this, api, n);
    }
    
    static zzh zza(final zzg zzg) {
        return zzg.zzXx;
    }
    
    private static zzz zza(final Api$zzc api$zzc, final Object o, final Context context, final Looper looper, final zze zze, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        return new zzz(context, looper, api$zzc.zzmu(), googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener, zze, api$zzc.zzl(o));
    }
    
    private void zzaY(final int n) {
        this.zzWL.lock();
        try {
            this.zzXx.zzaV(n);
        }
        finally {
            this.zzWL.unlock();
        }
    }
    
    static Lock zzb(final zzg zzg) {
        return zzg.zzWL;
    }
    
    static void zzc(final zzg zzg) {
        zzg.resume();
    }
    
    static void zzd(final zzg zzg) {
        zzg.zzmP();
    }
    
    private void zzmP() {
        this.zzWL.lock();
        try {
            if (this.zzmR()) {
                this.connect();
            }
        }
        finally {
            this.zzWL.unlock();
        }
    }
    
    @Override
    public void connect() {
        this.zzWL.lock();
        try {
            this.zzXx.connect();
        }
        finally {
            this.zzWL.unlock();
        }
    }
    
    @Override
    public void disconnect() {
        this.zzmR();
        this.zzaY(-1);
    }
    
    @Override
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final boolean a = Api.a;
        printWriter.append(s).append("mState=").append(this.zzXx.getName());
        printWriter.append(" mResuming=").print(this.zzXp);
        printWriter.append(" mWorkQueue.size()=").print(this.zzXo.size());
        printWriter.append(" mUnconsumedRunners.size()=").println(this.zzXA.size());
        final String string = s + "  ";
        for (final Api api : this.zzXb.keySet()) {
            printWriter.append(s).append(api.getName()).println(":");
            ((Api$Client)this.zzXu.get(api.zzms())).dump(string, fileDescriptor, printWriter, array);
            if (a) {
                break;
            }
        }
    }
    
    @Override
    public Looper getLooper() {
        return this.zzWt;
    }
    
    public int getSessionId() {
        return System.identityHashCode(this);
    }
    
    @Override
    public boolean isConnected() {
        return this.zzXx instanceof zzd;
    }
    
    @Override
    public boolean isConnecting() {
        return this.zzXx instanceof com.google.android.gms.common.api.zze;
    }
    
    @Override
    public void registerConnectionCallbacks(final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        this.zzXn.registerConnectionCallbacks(googleApiClient$ConnectionCallbacks);
    }
    
    @Override
    public void registerConnectionFailedListener(final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        this.zzXn.registerConnectionFailedListener(googleApiClient$OnConnectionFailedListener);
    }
    
    @Override
    public void unregisterConnectionCallbacks(final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        this.zzXn.unregisterConnectionCallbacks(googleApiClient$ConnectionCallbacks);
    }
    
    @Override
    public void unregisterConnectionFailedListener(final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        this.zzXn.unregisterConnectionFailedListener(googleApiClient$OnConnectionFailedListener);
    }
    
    @Override
    public Api$Client zza(final Api$ClientKey api$ClientKey) {
        final Api$Client api$Client = this.zzXu.get(api$ClientKey);
        zzu.zzb(api$Client, "Appropriate Api was not requested.");
        return api$Client;
    }
    
    @Override
    public zza$zza zzb(final zza$zza zza$zza) {
        final boolean a = Api.a;
        Label_0104: {
            if (zza$zza.zzms() == null) {
                break Label_0104;
            }
            boolean b = true;
            while (true) {
                zzu.zzb(b, "This task can not be executed (it's probably a Batch or malformed)");
                this.zzWL.lock();
                try {
                    if (this.zzmO()) {
                        this.zzXo.add(zza$zza);
                        while (!this.zzXo.isEmpty()) {
                            final zzg$zze zzg$zze = this.zzXo.remove();
                            this.zzb(zzg$zze);
                            zzg$zze.zzr(Status.zzXR);
                            if (a) {
                                break;
                            }
                        }
                        return zza$zza;
                    }
                    return this.zzXx.zzb(zza$zza);
                    b = false;
                }
                finally {
                    this.zzWL.unlock();
                }
            }
        }
    }
    
    void zzb(final zzg$zze zzg$zze) {
        this.zzXA.add(zzg$zze);
        zzg$zze.zza(this.zzXB);
    }
    
    void zze(final ConnectionResult zzXy) {
        this.zzWL.lock();
        try {
            this.zzXy = zzXy;
            (this.zzXx = new zzf(this)).begin();
            this.zzXm.signalAll();
        }
        finally {
            this.zzWL.unlock();
        }
    }
    
    void zzmK() {
        final boolean a = Api.a;
        for (final zzg$zze zzg$zze : this.zzXA) {
            zzg$zze.zza(null);
            zzg$zze.cancel();
            if (a) {
                break;
            }
        }
        this.zzXA.clear();
        final Iterator<zzi> iterator2 = this.zzXz.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().clear();
            if (a) {
                break;
            }
        }
        this.zzXz.clear();
        this.zzXw.clear();
    }
    
    void zzmL() {
        final boolean a = Api.a;
        final Iterator<Api$Client> iterator = this.zzXu.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().disconnect();
            if (a) {
                break;
            }
        }
    }
    
    void zzmM() {
        this.zzWL.lock();
        try {
            (this.zzXx = new com.google.android.gms.common.api.zze(this, this.zzXa, this.zzXb, this.zzWE, this.zzWL, this.mContext)).begin();
            this.zzXm.signalAll();
        }
        finally {
            this.zzWL.unlock();
        }
    }
    
    void zzmN() {
        this.zzWL.lock();
        try {
            this.zzmR();
            (this.zzXx = new zzd(this)).begin();
            this.zzXm.signalAll();
        }
        finally {
            this.zzWL.unlock();
        }
    }
    
    boolean zzmO() {
        return this.zzXp;
    }
    
    void zzmQ() {
        if (this.zzmO()) {
            return;
        }
        this.zzXp = true;
        if (this.zzXt == null) {
            this.zzXt = new zzg$zzb(this);
            final IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            this.mContext.getApplicationContext().registerReceiver(this.zzXt, intentFilter);
        }
        this.zzXs.sendMessageDelayed(this.zzXs.obtainMessage(1), this.zzXq);
        this.zzXs.sendMessageDelayed(this.zzXs.obtainMessage(2), this.zzXr);
    }
    
    boolean zzmR() {
        this.zzWL.lock();
        try {
            if (!this.zzmO()) {
                return false;
            }
            this.zzXp = false;
            this.zzXs.removeMessages(2);
            this.zzXs.removeMessages(1);
            if (this.zzXt != null) {
                this.mContext.getApplicationContext().unregisterReceiver(this.zzXt);
                this.zzXt = null;
            }
            return true;
        }
        finally {
            this.zzWL.unlock();
        }
    }
}
