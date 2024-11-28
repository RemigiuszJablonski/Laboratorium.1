class products implements Comparable<products> {
    private String name;
    float cost;


    public products(String name, float cost) {
        this.name = name;
        this.cost = cost;
    }
    //porownuje cene produktow
    @Override
    public int compareTo(products other) {
        return this.name.compareTo(other.name);
    }

    // wyswietlam dane w konsoli
    @Override
    public String toString() {
        return "Products{name ='" + name + "',cost =" + cost + "}";
    }

    public double getCost() {
        return cost;
    }
}
