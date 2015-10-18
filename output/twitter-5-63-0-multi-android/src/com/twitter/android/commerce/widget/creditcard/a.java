// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

import android.view.KeyEvent;
import android.os.SystemClock;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

class a extends InputConnectionWrapper
{
    final /* synthetic */ CardEntryBase a;
    
    public a(final CardEntryBase a, final InputConnection inputConnection, final boolean b) {
        this.a = a;
        super(inputConnection, b);
    }
    
    public boolean deleteSurroundingText(final int n, final int n2) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        this.sendKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, 67, 0, 0, -1, 0, 22));
        this.sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), uptimeMillis, 1, 67, 0, 0, -1, 0, 22));
        return true;
    }
    
    public boolean sendKeyEvent(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
            this.a.c();
        }
        return super.sendKeyEvent(keyEvent);
    }
}
