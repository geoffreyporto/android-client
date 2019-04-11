package org.tokend.template.view.details

import android.graphics.drawable.Drawable

/**
 * Preference-like item to display entity details
 */
class DetailsItem(
        val text: String,
        val hint: String? = null,
        val icon: Drawable? = null,
        /**
         * Section header
         */
        val header: String? = null,
        val id: Long = 0L
) {
    val hasHeader: Boolean = header != null

    override fun equals(other: Any?): Boolean {
        return other is DetailsItem && other.id == id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}