package com.mapzen.erasermap.controller

import com.mapzen.android.lost.api.Status
import com.mapzen.model.ValhallaLocation
import com.mapzen.pelias.SimpleFeature
import com.mapzen.pelias.gson.Feature
import com.mapzen.tangram.LngLat
import com.mapzen.valhalla.Route

interface MainViewController {
    fun showSearchResults(features: List<Feature>?)
    fun showSearchResults(features: List<Feature>?, currentIndex: Int)
    fun addSearchResultsToMap(features: List<Feature>?, activeIndex: Int)
    fun showDirectionsList()
    fun hideDirectionsList()
    fun toggleShowAllSearchResultsList(features: List<Feature>?)
    fun hideSearchResults()
    fun hideReverseGeolocateResult()
    fun showReverseGeocodeFeature(features: List<Feature>?)
    fun showPlaceSearchFeature(features: List<Feature>)
    fun showProgress()
    fun hideProgress()
    fun showActionViewAll()
    fun hideActionViewAll()
    fun collapseSearchView()
    fun expandSearchView()
    fun clearQuery()
    fun showRoutePreviewDestination(destination: SimpleFeature)
    fun route()
    fun hideRoutingMode()
    fun startRoutingMode(feature: Feature, isNew: Boolean)
    fun resumeRoutingMode(feature: Feature)
    fun resumeRoutingModeForMap()
    fun shutDown()
    fun centerMapOnLocation(lngLat: LngLat, zoom: Float)
    fun setMapTilt(radians: Float)
    fun resetMute()
    fun toggleMute()
    fun setMapRotation(radians: Float)
    fun drawRoute(route: Route)
    fun clearRoute()
    fun showCompass()
    fun rotateCompass()
    fun reverseGeolocate(screenX: Float, screenY: Float)
    fun placeSearch(gid: String)
    fun emptyPlaceSearch()
    fun overridePlaceFeature(feature: Feature)
    fun drawTappedPoiPin()
    fun hideSettingsBtn()
    fun showSettingsBtn()
    fun onBackPressed()
    fun stopSpeaker()
    fun checkPermissionAndEnableLocation()
    fun executeSearch(query: String)
    fun onCloseAllSearchResultsList()
    fun deactivateFindMeTracking()
    fun cancelRouteRequest()
    fun layoutAttributionAboveOptions()
    fun layoutFindMeAboveOptions()
    fun restoreRoutePreviewButtons()
    fun handleLocationResolutionRequired(status: Status)
    fun setMyLocationEnabled(enabled: Boolean)
    fun setOptionsMenuIconToList()
    fun onShowAllSearchResultsList(features: List<Feature>)
    fun hideActionBar()
    fun showRoutePreviewView()
    fun showRoutePreviewDistanceTimeLayout()
    fun setRoutePreviewViewRoute(route: Route)
    fun showRoutePinsOnMap(locations: Array<ValhallaLocation>)
    fun updateRoutePreviewStartNavigation()
    fun stopVoiceNavigationController()
    fun hideRouteIcon()
    fun hideRouteModeView()
    fun showActionBar()
    fun hideRoutePreviewView()
    fun resetMapPanResponder()
    fun setDefaultCamera()
    fun layoutFindMeAlignBottom()
    fun hideMapRoutePins()
    fun layoutAttributionAboveSearchResults(features: List<Feature>)
    fun layoutFindMeAboveSearchResults(features: List<Feature>)
    fun setCurrentSearchItem(position: Int)
    fun setMapPosition(lngLat: LngLat, duration: Int)
    fun setMapZoom(zoom: Float)
    fun getCurrentSearchPosition(): Int
    fun toastify(resId: Int)
    fun focusSearchView()
    fun toggleShowDebugSettings()
    fun getMapPosition(): LngLat?
    fun getMapZoom(): Float?
}
