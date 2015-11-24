// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import java.io.Serializable;

public class SettingVersionDetails implements Serializable
{
    private static final long serialVersionUID = 169756360721518795L;
    public String experimentsVersion;
    public String featureSwitchesVersion;
    
    public SettingVersionDetails(final String experimentsVersion, final String featureSwitchesVersion) {
        this.experimentsVersion = experimentsVersion;
        this.featureSwitchesVersion = featureSwitchesVersion;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final SettingVersionDetails settingVersionDetails = (SettingVersionDetails)o;
            Label_0059: {
                if (this.experimentsVersion != null) {
                    if (this.experimentsVersion.equals(settingVersionDetails.experimentsVersion)) {
                        break Label_0059;
                    }
                }
                else if (settingVersionDetails.experimentsVersion == null) {
                    break Label_0059;
                }
                return false;
            }
            if (this.featureSwitchesVersion != null) {
                if (this.featureSwitchesVersion.equals(settingVersionDetails.featureSwitchesVersion)) {
                    return true;
                }
            }
            else if (settingVersionDetails.featureSwitchesVersion == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.experimentsVersion != null) {
            hashCode = this.experimentsVersion.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        final String featureSwitchesVersion = this.featureSwitchesVersion;
        int hashCode2 = 0;
        if (featureSwitchesVersion != null) {
            hashCode2 = this.featureSwitchesVersion.hashCode();
        }
        return n + hashCode2;
    }
}
