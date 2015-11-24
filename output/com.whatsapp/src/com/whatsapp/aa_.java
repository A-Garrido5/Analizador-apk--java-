// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class aa_ implements Runnable
{
    final ProfilePhotoReminder a;
    
    aa_(final ProfilePhotoReminder a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (ProfilePhotoReminder.b(this.a).q == 0 && ProfilePhotoReminder.b(this.a).v == 0) {
            ProfilePhotoReminder.d(this.a).setVisibility(4);
        }
    }
}
