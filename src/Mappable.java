public interface Mappable {

    String JSON_PROPERTY = "\"properties\":{%s}";

    default String toJSON() {
        return String.format(
                "\"type\": \"%s\", \"label\": \"%s\", \"marker\": \"%s\"", getShape(), getLabel(), getMarker());
    }

    String getLabel();

    String getMarker();

    Geometry getShape();

    static void mapIt(Mappable mappable) {
        System.out.printf((JSON_PROPERTY) + "%n", mappable.toJSON());
    }
}
