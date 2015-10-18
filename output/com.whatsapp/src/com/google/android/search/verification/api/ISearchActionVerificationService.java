// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.search.verification.api;

import android.os.Bundle;
import android.content.Intent;
import android.os.IInterface;

public interface ISearchActionVerificationService extends IInterface
{
    int getVersion();
    
    boolean isSearchAction(final Intent p0, final Bundle p1);
}
