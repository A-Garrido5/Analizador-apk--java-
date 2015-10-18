// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import android.app.Fragment;
import android.os.Bundle;
import android.annotation.TargetApi;

@TargetApi(11)
public class d extends c
{
    public d(final i i) {
        super(i);
    }
    
    protected Fragment a(final k k, final Bundle arguments) {
        final ErrorDialogFragments$Honeycomb errorDialogFragments$Honeycomb = new ErrorDialogFragments$Honeycomb();
        errorDialogFragments$Honeycomb.setArguments(arguments);
        return (Fragment)errorDialogFragments$Honeycomb;
    }
    
    @Override
    protected Object c(final k k, final Bundle bundle) {
        return this.a(k, bundle);
    }
}
