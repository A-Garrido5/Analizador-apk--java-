// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile$ServiceListener;

class atg implements BluetoothProfile$ServiceListener
{
    final VoiceService a;
    
    atg(final VoiceService a) {
        this.a = a;
    }
    
    public void onServiceConnected(final int n, final BluetoothProfile bluetoothProfile) {
        if (n == 1) {
            VoiceService.a(this.a, (BluetoothHeadset)bluetoothProfile);
            final Voip$CallState currentCallState = Voip.getCurrentCallState();
            if ((currentCallState == Voip$CallState.CALLING || currentCallState == Voip$CallState.RECEIVED_CALL) && this.a.t()) {
                VoiceService.h(this.a, true);
            }
        }
    }
    
    public void onServiceDisconnected(final int n) {
        if (n == 1) {
            VoiceService.a(this.a, (BluetoothHeadset)null);
        }
    }
}
