import org.spongycastle.asn1.l;
import org.spongycastle.jcajce.provider.config.a;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class aae extends aad
{
    protected void a(final a a, final l l, final String s) {
        a.a("Alg.Alias.AlgorithmParameterGenerator." + l, s);
        a.a("Alg.Alias.AlgorithmParameters." + l, s);
    }
    
    protected void a(final a a, final l l, final String s, final aaf aaf) {
        a.a("Alg.Alias.KeyFactory." + l, s);
        a.a("Alg.Alias.KeyPairGenerator." + l, s);
        a.a(l, aaf);
    }
}
