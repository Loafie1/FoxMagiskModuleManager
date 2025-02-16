package com.fox2code.mmm.compat;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import androidx.annotation.Dimension;
import androidx.annotation.Px;

public final class CompatDisplay {
    @Dimension @Px
    public static int dpToPixel(@Dimension(unit = Dimension.DP) float dp){
        return (int) (dp * ((float) Resources.getSystem().getDisplayMetrics()
                        .densityDpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    @Dimension(unit = Dimension.DP)
    public static float pixelsToDp(@Dimension @Px int px){
        return (px / ((float) Resources.getSystem().getDisplayMetrics()
                        .densityDpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}
