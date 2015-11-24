// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import android.content.Context;

public class DataProvider
{
    public static HashMap<String, List<String>> getInfo(final Context context) {
        final HashMap<String, ArrayList<String>> hashMap = (HashMap<String, ArrayList<String>>)new HashMap<String, List<String>>();
        final ArrayList<String> list = new ArrayList<String>();
        list.add(context.getResources().getString(2131099666));
        final ArrayList<String> list2 = new ArrayList<String>();
        list2.add(context.getResources().getString(2131099667));
        final ArrayList<String> list3 = new ArrayList<String>();
        list3.add(context.getResources().getString(2131099668));
        final ArrayList<String> list4 = new ArrayList<String>();
        list4.add(context.getResources().getString(2131099669));
        final ArrayList<String> list5 = new ArrayList<String>();
        list5.add(context.getResources().getString(2131099670));
        final ArrayList<String> list6 = new ArrayList<String>();
        list6.add(context.getResources().getString(2131099671));
        hashMap.put("Cuidados con la informaci\u00f3n", list);
        hashMap.put("Leer los permisos ", list2);
        hashMap.put("Desinstalar aplicaciones", list3);
        hashMap.put("Apagar inal\u00e1mbricos", list4);
        hashMap.put("Cerrar sesi\u00f3n", list5);
        hashMap.put("Instalaci\u00f3n de apps", list6);
        return (HashMap<String, List<String>>)hashMap;
    }
}
