// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;

final class FragmentTabHost$TabInfo
{
    private final Bundle args;
    private final Class clss;
    private Fragment fragment;
    private final String tag;
    
    static Fragment access$100(final FragmentTabHost$TabInfo fragmentTabHost$TabInfo) {
        return fragmentTabHost$TabInfo.fragment;
    }
    
    static Fragment access$102(final FragmentTabHost$TabInfo fragmentTabHost$TabInfo, final Fragment fragment) {
        return fragmentTabHost$TabInfo.fragment = fragment;
    }
    
    static String access$200(final FragmentTabHost$TabInfo fragmentTabHost$TabInfo) {
        return fragmentTabHost$TabInfo.tag;
    }
    
    static Class access$300(final FragmentTabHost$TabInfo fragmentTabHost$TabInfo) {
        return fragmentTabHost$TabInfo.clss;
    }
    
    static Bundle access$400(final FragmentTabHost$TabInfo fragmentTabHost$TabInfo) {
        return fragmentTabHost$TabInfo.args;
    }
}
