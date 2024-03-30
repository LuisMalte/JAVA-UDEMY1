package aPOO.auto;

public enum Color {
        ROJO ("rojo"),
        AMARRILLO("amarillo"),
        AZUL("azul oscuro"),
        GRIS ("gris"),
        NEGRO ("negro mate ");

        public final String color;

        Color (String color){
            this.color= color;
        }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(color).append('\'');
        return sb.toString();
    }


    /*este es una calse enum es como crear opiciones o costantes asi que para crear un color
    * solo habra 5 opciones de las cuales no se podran pasar de ahi
    * fuera de eso se puede crear tipo metodos y variables en este caso se creo una variable color donde tiene
    * que ser final o sea costante por que asi se pide y luego se crea algo asi como un metodo costructor
    * donde al llamar cualquier color en mayus dara como resultado lo que hay en paretentesis y se para poderlo
    * ver se puede usar el metodo to string o con el get de colot  */
}
