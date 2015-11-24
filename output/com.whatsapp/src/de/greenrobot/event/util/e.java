// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class e extends c
{
    public e(final i i) {
        super(i);
    }
    
    protected Fragment a(final k k, final Bundle arguments) {
        final ErrorDialogFragments$Support errorDialogFragments$Support = new ErrorDialogFragments$Support();
        errorDialogFragments$Support.setArguments(arguments);
        return errorDialogFragments$Support;
    }
    
    @Override
    protected Object c(final k k, final Bundle bundle) {
        return this.a(k, bundle);
    }
}
