// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.util.Iterator;
import android.net.wifi.ScanResult;
import com.twitter.library.platform.m;
import java.util.ArrayList;
import java.util.Collections;
import android.net.wifi.WifiManager;
import java.util.List;
import android.content.Context;

public final class bm
{
    public static List a(final Context context) {
        final List scanResults = ((WifiManager)context.getSystemService("wifi")).getScanResults();
        if (scanResults == null) {
            return Collections.emptyList();
        }
        final ArrayList list = new ArrayList<m>(scanResults.size());
        final Iterator<ScanResult> iterator = scanResults.iterator();
        while (iterator.hasNext()) {
            list.add(m.a(iterator.next()));
        }
        return list;
    }
}
