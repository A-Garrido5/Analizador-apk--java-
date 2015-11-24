// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.search.verification.client;

import com.google.android.search.verification.api.ISearchActionVerificationService;
import com.google.android.search.verification.api.ISearchActionVerificationService$Stub;
import android.util.Log;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

class SearchActionVerificationClientService$SearchActionVerificationServiceConnection implements ServiceConnection
{
    final SearchActionVerificationClientService this$0;
    
    SearchActionVerificationClientService$SearchActionVerificationServiceConnection(final SearchActionVerificationClientService this$0) {
        this.this$0 = this$0;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (SearchActionVerificationClientService.access$000(this.this$0)) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        SearchActionVerificationClientService.access$102(this.this$0, ISearchActionVerificationService$Stub.asInterface(binder));
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        SearchActionVerificationClientService.access$102(this.this$0, null);
        if (SearchActionVerificationClientService.access$000(this.this$0)) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
