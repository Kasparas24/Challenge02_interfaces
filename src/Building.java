public class Building implements Mappable {

    private final String label;
    private final UsageType type;

    public Building(String label, UsageType type) {
        this.label = label;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return String.format("%s (%s)", label, type);
    }

    @Override
    public String getMarker() {
        return type.getMarkerColor() + " " + type.getMarkerType();
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String toJSON() {
        return String.format("%s, \"name\": \"%s\", \"usage\": \"%s\"", Mappable.super.toJSON(), label, type);
    }

}
