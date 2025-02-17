public class Forest implements Mappable {

    private final String label;
    private final TreeType type;

    public Forest(String label, TreeType type) {
        this.label = label;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return String.format("%s of %s", label, type);
    }

    @Override
    public String getMarker() {
        return type.getMarkerColor() + " " + type.getMarkerType();
    }

    @Override
    public Geometry getShape() {
        return Geometry.POLYGON;
    }

    @Override
    public String toJSON() {
        return String.format("%s, \"name\": \"%s\", \"trees\": \"%s\"", Mappable.super.toJSON(), label, type);
    }
}
