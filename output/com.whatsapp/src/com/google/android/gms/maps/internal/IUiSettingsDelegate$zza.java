// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class IUiSettingsDelegate$zza extends Binder implements IUiSettingsDelegate
{
    public static IUiSettingsDelegate zzcJ(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof IUiSettingsDelegate) {
            return (IUiSettingsDelegate)queryLocalInterface;
        }
        return new IUiSettingsDelegate$zza$zza(binder);
    }
}
