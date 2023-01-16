package org.example;

public enum Participles {
    INTIME(", что было сделано вовремя, "),
    CAUSE("так как в то же мгновение"),
    THOUGHTLESS("недолго думая "),
    LOOKDOWN("Глянув вниз"),
    ENSURED(" убедившись, что "),
    BEHIND(" за "),
    NEAR(" возле "),
    THROUGH(" по "),
    MEANWHILE("Между тем "),
    JUMPDOWN("прыгать с высоты третьего этажа небезопасно, "),
    UNEXPECTED("Неожиданно"),
    BACKYARD("во двор"),
    BEATEN(" под ударами "),
    GROUND("до земли"),
    REACH("Подбежав к конторе, "),
    LEANED("Высунувшись из окна, ");

    String participle;

    Participles(String participle){this.participle = participle;}

    @Override
    public String toString() {
        return participle;
    }
}

