// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.content.Intent;
import android.app.RemoteInput$Builder;
import android.app.RemoteInput;

class RemoteInputCompatApi20
{
    static RemoteInput[] fromCompat(final RemoteInputCompatBase$RemoteInput[] array) {
        final int a = NotificationCompatBase$Action.a;
        if (array == null) {
            return null;
        }
        final RemoteInput[] array2 = new RemoteInput[array.length];
        int i = 0;
        while (i < array.length) {
            final RemoteInputCompatBase$RemoteInput remoteInputCompatBase$RemoteInput = array[i];
            array2[i] = new RemoteInput$Builder(remoteInputCompatBase$RemoteInput.getResultKey()).setLabel(remoteInputCompatBase$RemoteInput.getLabel()).setChoices(remoteInputCompatBase$RemoteInput.getChoices()).setAllowFreeFormInput(remoteInputCompatBase$RemoteInput.getAllowFreeFormInput()).addExtras(remoteInputCompatBase$RemoteInput.getExtras()).build();
            ++i;
            if (a != 0) {
                break;
            }
        }
        return array2;
    }
    
    static Bundle getResultsFromIntent(final Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
