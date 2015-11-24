// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import org.json.JSONException;
import org.json.JSONArray;
import java.util.ArrayList;
import org.json.JSONObject;
import java.io.Serializable;

public class FeatureSwitchesValue implements Serializable, Comparable
{
    private static final long serialVersionUID = -8885573541739858916L;
    private FeatureSwitchesValue$FeatureSwitchesImpression mImpression;
    protected String mKey;
    protected Object mValue;
    
    public FeatureSwitchesValue(final String mKey, final Object mValue) {
        this.mKey = mKey;
        this.mValue = mValue;
    }
    
    public static FeatureSwitchesValue a(final String s, final String s2) {
        final JSONObject jsonObject = new JSONObject(s2);
        final String string = jsonObject.getString("type");
        if (string.equals(ArrayList.class.toString())) {
            return new FeatureSwitchesValue(s, a(new JSONArray(jsonObject.getString("value"))));
        }
        if (string.equals(Boolean.class.toString())) {
            return new FeatureSwitchesValue(s, jsonObject.getBoolean("value"));
        }
        if (string.equals(Integer.class.toString())) {
            return new FeatureSwitchesValue(s, jsonObject.getInt("value"));
        }
        if (string.equals(Float.class.toString())) {
            return new FeatureSwitchesValue(s, (float)jsonObject.getDouble("value"));
        }
        if (string.equals(String.class.toString())) {
            return new FeatureSwitchesValue(s, jsonObject.getString("value"));
        }
        return new FeatureSwitchesValue(s, jsonObject.get("value"));
    }
    
    private static ArrayList a(final JSONArray jsonArray) {
        final ArrayList<Object> list = new ArrayList<Object>();
        int i = 0;
        try {
            while (i < jsonArray.length()) {
                list.add(jsonArray.get(i));
                ++i;
            }
        }
        catch (JSONException ex) {}
        return list;
    }
    
    public int a(final FeatureSwitchesValue featureSwitchesValue) {
        return this.mKey.compareTo(featureSwitchesValue.mKey);
    }
    
    public void a(final FeatureSwitchesValue$FeatureSwitchesImpression mImpression) {
        this.mImpression = mImpression;
    }
    
    public Object c() {
        return this.mValue;
    }
    
    public boolean d() {
        return this.mImpression != null;
    }
    
    public FeatureSwitchesValue$FeatureSwitchesImpression e() {
        return this.mImpression;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            final FeatureSwitchesValue featureSwitchesValue = (FeatureSwitchesValue)o;
            if (this.mKey == null) {
                if (featureSwitchesValue.mKey != null) {
                    return false;
                }
            }
            else if (!this.mKey.equals(featureSwitchesValue.mKey)) {
                return false;
            }
            if (this.mValue == null) {
                if (featureSwitchesValue.mValue != null) {
                    return false;
                }
            }
            else if (!this.mValue.equals(featureSwitchesValue.mValue)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.mKey != null) {
            hashCode = this.mKey.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        int hashCode2;
        if (this.mValue != null) {
            hashCode2 = this.mValue.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        final FeatureSwitchesValue$FeatureSwitchesImpression mImpression = this.mImpression;
        int hashCode3 = 0;
        if (mImpression != null) {
            hashCode3 = this.mImpression.hashCode();
        }
        return n2 + hashCode3;
    }
}
