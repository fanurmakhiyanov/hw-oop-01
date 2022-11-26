public class Headphones extends Product{
    private String typesOfHeadphonesByConnection;
    private String typesOfHeadphonesByTechnology;
    public Headphones(String name, Double cost, String typesOfHeadphonesByConnection, String typesOfHeadphonesByTechnology) {
        super(name, cost);
        this.typesOfHeadphonesByConnection = typesOfHeadphonesByConnection;
        this.typesOfHeadphonesByTechnology = typesOfHeadphonesByTechnology;
    }

    public String getTypesOfHeadphonesByConnection() {
        return typesOfHeadphonesByConnection;
    }

    public void setTypesOfHeadphonesByConnection(String typesOfHeadphonesByConnection) {
        this.typesOfHeadphonesByConnection = typesOfHeadphonesByConnection;
    }

    public String getTypesOfHeadphonesByTechnology() {
        return typesOfHeadphonesByTechnology;
    }

    public void setTypesOfHeadphonesByTechnology(String typesOfHeadphonesByTechnology) {
        this.typesOfHeadphonesByTechnology = typesOfHeadphonesByTechnology;
    }

    @Override
    public String toString() {
        return "Headphones {" +
                "name = '" + super.getName() + '\'' +
                ", cost = '" + super.getCost() + '\'' +
                ", connection = '" + this.typesOfHeadphonesByConnection + '\'' +
                ", technology = '" + this.typesOfHeadphonesByTechnology +

                '}';
    }
}
