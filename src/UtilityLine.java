public class UtilityLine implements Mappable {

    private final String label;
    private final UtilityType type;

    public UtilityLine(String label, UtilityType type) {
        this.label = label;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return String.format("%s - %s", type, label);
    }

    @Override
    public String getMarker() {
        return type.getMarkerColor() + " " + type.getMarkerType();
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String toJSON() {
        return String.format("%s, \"name\": \"%s\", \"utility\": \"%s\"", Mappable.super.toJSON(), label, type);
    }
}
