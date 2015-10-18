// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.experiments;

import com.twitter.library.featureswitch.d;

public final class RelatedTweetsExperimentHelper
{
    public static boolean a() {
        return e() != RelatedTweetsExperimentHelper$QualityTreatment.d;
    }
    
    public static String b() {
        return "android_related_tweets_2316:" + d.d("android_related_tweets_2316");
    }
    
    public static boolean c() {
        return d() && d.f("android_related_tweets_feedback_timeline_link");
    }
    
    public static boolean d() {
        return d.f("android_related_tweets_feedback");
    }
    
    public static RelatedTweetsExperimentHelper$QualityTreatment e() {
        final String d = com.twitter.library.featureswitch.d.d("android_related_tweets_2316");
        switch (d) {
            default: {
                return RelatedTweetsExperimentHelper$QualityTreatment.d;
            }
            case "control":
            case "exp":
            case "exp_below":
            case "exp_count": {
                return RelatedTweetsExperimentHelper$QualityTreatment.b;
            }
            case "control_at":
            case "exp_eh": {
                return RelatedTweetsExperimentHelper$QualityTreatment.c;
            }
            case "control_eh":
            case "exp_at": {
                return RelatedTweetsExperimentHelper$QualityTreatment.a;
            }
            case "control_tdv": {
                com.twitter.library.featureswitch.d.a("android_related_tweets_2316");
                return RelatedTweetsExperimentHelper$QualityTreatment.d;
            }
        }
    }
    
    public static RelatedTweetsExperimentHelper$DesignTreatment f() {
        final String a = d.a("android_related_tweets_2316");
        switch (a) {
            default: {
                return RelatedTweetsExperimentHelper$DesignTreatment.d;
            }
            case "exp":
            case "exp_eh":
            case "exp_at": {
                return RelatedTweetsExperimentHelper$DesignTreatment.a;
            }
            case "exp_count": {
                return RelatedTweetsExperimentHelper$DesignTreatment.b;
            }
            case "exp_below": {
                return RelatedTweetsExperimentHelper$DesignTreatment.c;
            }
        }
    }
}
