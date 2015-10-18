// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.text.style.UpdateAppearance;
import android.text.style.CharacterStyle;

public abstract class iq extends CharacterStyle implements UpdateAppearance
{
    public abstract boolean a(final View p0, final MotionEvent p1);
    
    public abstract void updateDrawState(final TextPaint p0);
}
