/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 */

package com.microsoft.fluentui.theming

import android.content.Context
import android.content.res.Resources
import android.support.annotation.RestrictTo
import android.support.annotation.StyleRes
import android.support.v7.view.ContextThemeWrapper
import com.microsoft.fluentui.core.R

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
class FluentUIContextThemeWrapper(base: Context, theme: Int = R.style.Base_Theme_FluentUI) : ContextThemeWrapper(base, theme) {

    override fun onApplyThemeResource(theme: Resources.Theme, resid: Int, first: Boolean) {
        // We don't want to force our styles on top of the user's. We want their styles to take precedence.
        theme.applyStyle(resid, false)
    }
}