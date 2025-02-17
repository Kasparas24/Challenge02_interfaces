public enum TreeType {

    PINE(Color.RED, PolygonMarkers.DOTTED),
    BIRCH(Color.BLACK, PolygonMarkers.STRIPPED),
    OAK(Color.GREEN, PolygonMarkers.WAVY);

    private final Color markerColor;
    private final PolygonMarkers markerType;

    TreeType(Color markerColor, PolygonMarkers markerType) {
        this.markerColor = markerColor;
        this.markerType = markerType;
    }

    public Color getMarkerColor() {
        return this.markerColor;
    }

    public PolygonMarkers getMarkerType() {
        return this.markerType;
    }

}
