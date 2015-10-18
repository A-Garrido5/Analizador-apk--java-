// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.config;

import java.security.Permission;
import java.util.StringTokenizer;
import java.security.BasicPermission;

public class ProviderConfigurationPermission extends BasicPermission
{
    private final String actions;
    private final int permissionMask;
    
    public ProviderConfigurationPermission(final String s, final String actions) {
        super(s, actions);
        this.actions = actions;
        this.permissionMask = this.a(actions);
    }
    
    private int a(final String s) {
        final StringTokenizer stringTokenizer = new StringTokenizer(aai.a(s), " ,");
        int n = 0;
        while (stringTokenizer.hasMoreTokens()) {
            final String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                n |= 0x1;
            }
            else if (nextToken.equals("ecimplicitlyca")) {
                n |= 0x2;
            }
            else if (nextToken.equals("threadlocaldhdefaultparams")) {
                n |= 0x4;
            }
            else if (nextToken.equals("dhdefaultparams")) {
                n |= 0x8;
            }
            else {
                if (!nextToken.equals("all")) {
                    continue;
                }
                n |= 0xF;
            }
        }
        if (n == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        return n;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (!(o instanceof ProviderConfigurationPermission)) {
                return false;
            }
            final ProviderConfigurationPermission providerConfigurationPermission = (ProviderConfigurationPermission)o;
            if (this.permissionMask != providerConfigurationPermission.permissionMask || !this.getName().equals(providerConfigurationPermission.getName())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String getActions() {
        return this.actions;
    }
    
    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.permissionMask;
    }
    
    @Override
    public boolean implies(final Permission permission) {
        if (permission instanceof ProviderConfigurationPermission && this.getName().equals(permission.getName())) {
            final ProviderConfigurationPermission providerConfigurationPermission = (ProviderConfigurationPermission)permission;
            if ((this.permissionMask & providerConfigurationPermission.permissionMask) == providerConfigurationPermission.permissionMask) {
                return true;
            }
        }
        return false;
    }
}
