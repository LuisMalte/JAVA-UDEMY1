package aPOO.auto;

public class Auto  implements  Comparable<Auto> /*Comparable //lo cambie por una mas optimizado mas facil de usar por este ya
tiene el auto y ya no demo castearlo*/  {
     private String fabricante;
     private String modelo ;
     private Color color;
     //private double cilindraje;
//     private  int capacidadEstantanque = 40;
     private  Motor motor;
     private  Estanque estanque;
      private  Persona conductor;
      private  Rueda[] ruedas;

     ////     ID
     private int id ;

     private static  int  ultimoId;

     private  TipoAuto tipo;


     public int getId() {
          return id;
     }

     /*SE HIZO UN ID se creo dos variables un statica y otra normal donde la estatica se le iba sumando uno
     * para que se mantuviera el contador y luego se le igualba a id en otro costructor
     * se le puso esto this() lo cual llama al costructor vaci y solo es necesario ponerlo en una
     * ya que los otros ya estan conectados porque comparten variables */


     public  String acelerar(int revoluciones){
          return  "el Auto " + fabricante +" esta acelerando a " + revoluciones +" rpm";
     }
        public  String frenar (){
          return  "el Auto " + this.fabricante +" " +this.modelo +" freno";
     }

/*this significa que es el atributo de la clase o sea si exite otro fabriacante  en un metodo se usa this para
* referir a cual es de la clase*/






///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

     //SOBRE CARGA DE METODOS

     public float calcularConsumo (int km, float porcentajeBencina){
      return  km/(estanque.getCapacidad()*porcentajeBencina);
     }
     public float calcularConsumo (int km, int porcentajeBencina){
           return  km/(estanque.getCapacidad()*(porcentajeBencina/100f));
     }
     //esto es una sobre carga de metodos donde se puede crear varios metodos con el mismo nombre pero con diferente
     //atributos







///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//GETTERS Y SETTERS
     public String getFabricante() {
          return fabricante;
     }

     public void setFabricante(String fabricante) {
          this.fabricante = fabricante;
     }

     public String getModelo() {
          return modelo;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }

     public Color getColor() {
          return color;
     }

     public void setColor(Color color) {
          this.color = color;
     }

//     public double getCilindraje() {
//          return cilindraje;
//     }
//
//     public void setCilindraje(double cilindraje) {
//          this.cilindraje = cilindraje;
//     }

//     public int getCapacidadEstantanque() {
//          return capacidadEstantanque;
//     }
//
//     public void setCapacidadEstantanque(int capacidadEstantanque) {
//          this.capacidadEstantanque = capacidadEstantanque;
//     }

     public static int getUltimoId() {
          return ultimoId;
     }

     public static void setUltimoId(int ultimoId) {
          Auto.ultimoId = ultimoId;
     }

     public TipoAuto getTipo() {
          return tipo;
     }

     public void setTipo(TipoAuto tipo) {
          this.tipo = tipo;
     }
     /*get se puede traducir como leer y set como modificar */

     public Motor getMotor() {
          return motor;
     }

     public void setMotor(Motor motor) {
          this.motor = motor;
     }

     public Estanque getEstanque() {
          return estanque;
     }

     public void setEstanque(Estanque estanque) {
          this.estanque = estanque;
     }

     public Persona getConductor() {
          return conductor;
     }

     public void setConductor(Persona conductor) {
          this.conductor = conductor;
     }

     public Rueda[] getRuedas() {
          return ruedas;
     }

     public void setRuedas(Rueda[] ruedas) {
          this.ruedas = ruedas;
     }





/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 /*METODO ADD RUEDAS QUE ES MEJOR QUE SET*/

     private int indiceRuedas = 0;
     public Auto addRuedas (Rueda rueda){
          if(indiceRuedas<this.ruedas.length) { //para que no se pase de 5
               this.ruedas[indiceRuedas++] = rueda;

          }  return this;
     }
//lo que hago es agregar un reueda una por una para eso necesito que cada auto tenga inicializado su array ruedas
     /*con el fin de poder ir agregando rueda por rueda y no todas a la vez
     * el this es con el fin de que se puede ir llamando el metodo varias veces a la vez ya que this devuelve el mismo
     * metodo
     *  */





//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

     @Override
     public String toString() {
          final StringBuilder sb = new StringBuilder("Auto{");
          sb.append("id =>'").append(id).append('\'');
          sb.append("fabricante =>'").append(fabricante).append('\'');
          sb.append(", modelo =>'").append(modelo).append('\'');
          sb.append(", color =>'").append(color).append('\'');
          sb.append(", cilindraje =>").append(motor.getCilindrada()).append('\'');
          sb.append(", kilometros =>").append(kilometros).append('\'');
          sb.append(", tipo  =>' ").append(this.getTipo()).append('\'');

          /*Aca se pone un if para en caso de un null pointer es decir
          *  si no hay un conductor o unas ruedas para eso se hace este if
          * para que en caso de que sean nulas pues no sea haga nada */
          if (conductor !=null){
               sb.append("Conductor => ").append(this.getConductor()).append('\'').append('\n');
          }

          if (this.getRuedas()!= null){
               sb.append("Ruedas del auto ").append('\n');
               for (Rueda r :this.getRuedas()) {
                    sb.append("\n").append(r.getFabriacante()).append(", aro: ").append(r.getAro()).append(", ancho:").append(r.getAncho()).append('\'');
               }
          }
          sb.append('}');
          return sb.toString();
     }





//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

     //METODO CONSTRUCTOR

     public Auto(){
          this.id = ++ultimoId;
          this.ruedas = new Rueda[5];

     }
     public Auto(String fabricante, String modelo) {
          this.fabricante = fabricante;
          this.modelo = modelo;
     }


     public Auto(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
          this();
          this.fabricante = fabricante;
          this.modelo = modelo;
          this.color = color;
          this.motor = motor;
          this.estanque = estanque;

     }


     public Auto(Color color, Motor motor, Estanque estanque) {
          this.color = color;
          this.motor = motor;
          this.estanque = estanque;
     }



     /*se crea dos metodos costructor porque en caso de que solo haya uno estaria obligado a que en caso de
     * hacer un metodo costructor con atributos al crear un objeto debo crear con todos los atributos de manera idmediata
     * y en caso de que solo sea vacio entonces solo podre poner los atributos despues de crear el objeto
     * Auto auto1 = new Auto(); y luego le pongo los atrubutos que quiera y los que no les de el valor tenedran un valor
     * preterminado null o 0 y se crean dos constructores uno vacio y otro no para que se puede usar las ventajas de ambos

   * Tambien se puede crear varios costructores poniendo diferentes atributos
      */

     public Auto(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
          this(fabricante,modelo,color,motor,estanque);
          /*esto lo que hace es llamar al otro constructor que que tiene los mismo parametros y solo le agrega los
          * otros dos atributos */
          this.conductor = conductor;
          this.ruedas = ruedas;
     }







     //METODO EQUALS

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (!(o instanceof Auto)) return false;
          Auto auto = (Auto) o;
          return this.fabricante.equals(auto.fabricante) &&
                  this.motor.getCilindrada() == (auto.motor.getCilindrada()) &&
                  this.modelo.equals(auto.modelo) && this.color.equals(auto.color)
                  && this.estanque == auto.estanque;
     }
/*este caso se sobre escribe el metodo equals ya que en caso de no sobre escribirlo equals se comporta igual que
* == o se solo buscar si estan en la misma referencia es decir guardadas igual lo cual no se va acumplir simpre
* pero al sobre escribirlo si podemos saber si son iguales en contenido o en referencia es muy usado la sobre escritura del
* metodo equals ya que podemos saber si hay un objeto copia de un objeto sin tener que buscar uno por uno los atributos
*
*
* Tambien es importante comprabar que no el objeto no se null  o que no se este comparando peras con manzanas
* y para eso se ysa instanceof lo que es es revisar si x objeto pertenece a cierta clase
* y se optimiza this ==o en caso de que sea el mismo objeto
*
* se al usar equals se puede poner los valores que quiera es decir se puede poner todos los atributos
* o no todos o se puede mirar que no se null el valor como tal sino que no sea revice que el valor a buscar no sea null
* */







//ATRIBUTO STATIC
    private static int kilometros = 0;

     public static int getKilometros() {
          return kilometros;
     }

     public static void setKilometros(int kilometros) {
          Auto.kilometros = kilometros;
     }

     /*Esto es un atributo estatico donde esto pertenece a la clase no a los objetos es decir que todos estos atributos
* estaticos todos los objetos lo van a tener y cuando el valor se cambia los valores cambian para todos
*
* y esta es la forma de crear getters y setters de un atributo debe ser tipo estatico a demas para el set
* en vez de usar this se usa Auto.kilometro o sea el nombre de la clase ya que es un atributo static
* */








     //METODO STATIC
     private static int capacidadEstantan =30;

     public static int getCapacidadEstantan() {
          return capacidadEstantan;
     }

     public static void setCapacidadEstantan(int capacidadEstantan) {
          Auto.capacidadEstantan = capacidadEstantan;
     }

     public static float calcularConsssumo (int km, int porcentajeBencina){
          return  km/(getCapacidadEstantan() *(porcentajeBencina/100f));// no se puede usar this.capacidadd
          /*ya que en los metodos estaticos no se puede atributos de objetos en un metodo static */
     }






     //// COSTANTE
     public  static final int   VELOCIDAD_MAX = 123;



     /*esta es la manaera de hacer crear un costante en java se usa final normalmente es public y se usa con
     * static ya que como nunca se va a modificar no hay necesidad de crearla como una varialbe y la variable se escribe con
     * mayus y se dividen por _ y debe darse un valor siempre*/




//METODO COMPARABLE


//     public int compareTo(Object o) {
//          Auto a = (Auto) o;
//          return this.fabricante.compareTo(a.fabricante);
//     }





/*este es el metodo compar to el cual sirve para comparar string en este caso y luego serivara para usar el metodo arraysort
* y acomode los objetos en orden
* se resive cualqueir clase de objetos
* pero nosotros lo castamos para que sea auto y tenga todos los atributos que tiene el auto y no otra cosa
* y luego le decimos que compare el fabracante  con el fabricante del objeto  ingresado*/



     @Override
     public int compareTo(Auto a) {

          return this.fabricante.compareTo(a.fabricante);
     }

     /*esta es otra forma pero con Comparable<Auto> y ya no se debe castear */


     //TAMBIEN SE PUEDE CAMBIAR EL ATRIBUTO QUE SE COMPARA SE PUEDE PONER this.modelo.compareTo(a.modelo);
}
