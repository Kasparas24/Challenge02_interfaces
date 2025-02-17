public enum UtilityType {

    HIGH_VOLTAGE(Color.GREEN, LineMarkers.DASHED),
    LOW_VOLTAGE(Color.BLUE, LineMarkers.SOLID),
    FIBER_OPTIC(Color.ORANGE, LineMarkers.DOTTED);

    private final Color markerColor;
    private final LineMarkers markerType;

    UtilityType(Color markerColor, LineMarkers markerType) {
        this.markerColor = markerColor;
        this.markerType = markerType;
    }

    public Color getMarkerColor() {
        return this.markerColor;
    }

    public LineMarkers getMarkerType() {
        return this.markerType;
    }
}
