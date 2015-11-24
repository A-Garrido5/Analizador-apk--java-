// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Collections;
import java.util.Collection;
import com.google.android.gms.internal.zzpt;
import java.util.Map;
import android.view.View;
import java.util.Set;
import android.accounts.Account;

public final class zze
{
    private final Account zzMY;
    private final String zzOd;
    private final String zzOe;
    private final Set zzWv;
    private final int zzWw;
    private final View zzWx;
    private final Set zzZS;
    private final Map zzZT;
    private final zzpt zzZU;
    private Integer zzZV;
    
    public zze(final Account zzMY, final Collection collection, Map empty_MAP, final int zzWw, final View zzWx, final String zzOe, final String zzOd, final zzpt zzZU) {
        final boolean a = zzi.a;
        this.zzMY = zzMY;
        Set<Object> zzWv;
        if (collection == null) {
            zzWv = (Set<Object>)Collections.EMPTY_SET;
        }
        else {
            zzWv = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(collection));
        }
        this.zzWv = zzWv;
        if (empty_MAP == null) {
            empty_MAP = Collections.EMPTY_MAP;
        }
        this.zzZT = empty_MAP;
        this.zzWx = zzWx;
        this.zzWw = zzWw;
        this.zzOe = zzOe;
        this.zzOd = zzOd;
        this.zzZU = zzZU;
        final HashSet<Object> set = new HashSet<Object>(this.zzWv);
        final Iterator<zze$zza> iterator = this.zzZT.values().iterator();
        while (iterator.hasNext()) {
            set.addAll(iterator.next().zzWJ);
            if (a) {
                break;
            }
        }
        this.zzZS = Collections.unmodifiableSet((Set<?>)set);
    }
    
    public Account getAccount() {
        return this.zzMY;
    }
    
    @Deprecated
    public String getAccountName() {
        if (this.zzMY != null) {
            return this.zzMY.name;
        }
        return null;
    }
    
    public void zza(final Integer zzZV) {
        this.zzZV = zzZV;
    }
    
    public zzpt zznB() {
        return this.zzZU;
    }
    
    public Integer zznC() {
        return this.zzZV;
    }
    
    public Account zznt() {
        if (this.zzMY != null) {
            return this.zzMY;
        }
        return new Account("<<default account>>", "com.google");
    }
    
    public Set zznv() {
        return this.zzWv;
    }
    
    public Set zznw() {
        return this.zzZS;
    }
    
    public Map zznx() {
        return this.zzZT;
    }
    
    public String zzny() {
        return this.zzOe;
    }
    
    public String zznz() {
        return this.zzOd;
    }
}
