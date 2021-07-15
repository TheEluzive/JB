public enum Taste {


    SALTY("Соленый"),
    SWEET("Сладкий"),
    SOUR("Кислый"),
    BITTER("Горький");

    private String ruName;
    Taste(String ruName) {
        this.ruName = ruName;
    }

    public String getRuName(){
        return ruName;
    }
}
