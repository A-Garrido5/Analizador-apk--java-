// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;

class e implements m
{
    @Override
    public EGLConfig a(final EGL10 egl10, final EGLDisplay eglDisplay) {
        final int[] array = { 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12352, 4, 12344 };
        final EGLConfig[] array2 = { null };
        egl10.eglChooseConfig(eglDisplay, array, array2, 1, new int[1]);
        return array2[0];
    }
}
