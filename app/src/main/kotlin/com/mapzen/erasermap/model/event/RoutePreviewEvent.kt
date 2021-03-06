package com.mapzen.erasermap.model.event

import com.mapzen.pelias.gson.Feature

/**
 * Published when the user requests a route preview.
 */
data class RoutePreviewEvent(val destination: Feature)
