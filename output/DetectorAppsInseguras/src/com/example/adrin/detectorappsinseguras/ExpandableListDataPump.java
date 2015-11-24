// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class ExpandableListDataPump
{
    public static HashMap<String, List<String>> getData() {
        final HashMap<String, ArrayList<String>> hashMap = (HashMap<String, ArrayList<String>>)new HashMap<String, List<String>>();
        final ArrayList<String> list = new ArrayList<String>();
        list.add("Beats sued for noise-cancelling tech");
        list.add("Wikipedia blocks US Congress edits");
        list.add("Google quizzed over deleted links");
        list.add("Nasa seeks aid with Earth-Mars links");
        list.add("The Good, the Bad and the Ugly");
        final ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Goldfinch novel set for big screen");
        list2.add("Anderson stellar in Streetcar");
        list2.add("Ronstadt receives White House honour");
        list2.add("Toronto to open with The Judge");
        list2.add("British dancer return from Russia");
        final ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Eggshell may act like sunblock");
        list3.add("Brain hub predicts negative events");
        list3.add("California hit by raging wildfires");
        list3.add("Rosetta's comet seen in close-up");
        list3.add("Secret of sandstone shapes revealed");
        hashMap.put("TECHNOLOGY NEWS", list);
        hashMap.put("ENTERTAINMENT NEWS", list2);
        hashMap.put("SCIENCE & ENVIRONMENT NEWS", list3);
        return (HashMap<String, List<String>>)hashMap;
    }
}
