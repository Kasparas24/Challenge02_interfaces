public enum UsageType {

    BUSINESS(Color.ORANGE, PointMarkers.STAR),
    ENTERTAINMENT(Color.GREEN, PointMarkers.PIN),
    SPORT(Color.WHITE, PointMarkers.CIRCLE),
    PRIVATE(Color.YELLOW, PointMarkers.DIAMOND);

    private final Color markerColor;
    private final PointMarkers markerType;

    UsageType(Color markerColor, PointMarkers markerType) {
        this.markerColor = markerColor;
        this.markerType = markerType;
    }

    public Color getMarkerColor() {
        return this.markerColor;
    }

    public PointMarkers getMarkerType() {
        return this.markerType;
    }

}
