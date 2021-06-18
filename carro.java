
/**
 * Write a description of class carro here.
 * 
 * @author (jaquemarti) 
 * @version (1.0)
 */
public class carro
{
    // En esta parte vamos a definir 3 aributos y un valor 1 atributo que nos dira si es carro esta o no encendido
    //siempre seguiremos esta estructura private gestiona la ocultacion, el tipo de datos, nombre del articulo
    private String color;// cadena de texto
    private double galones;//por que es de tipo decimal
    private boolean encendido;

    /**
     * Constructor for objects of class carro
     */
    public carro()
    {
        // vamos a darle valor a los atributos en esta seccion (el constructor)
        this.color = "negro";  //usaremos la palabra resrvada  this que hace referencia a la propia clase 
        this.galones = 30.5;
        this.encendido = false; // por defecto lo dejaremos que no esta arrancado

    }

    public carro(String newColor, double newGalones,boolean newEncendido)
    //que tendremos que hacer con estos tributos que nos pasan aqui? pues tendriamos asignarlos a los atributosde la clase.
    {
        // vamos a darle valor a los atributos en esta seccion (el constructor)
        this.color = newColor;  //usaremos la palabra resrvada  this que hace referencia a la propia clase 
        this.galones = newGalones;
        this.encendido = newEncendido; // por defecto lo dejaremos que no esta arrancado
    }         
    //Para crear los metodos de modificacion partimos desde aca utilizamos la palabra reservada public vamos a tener que agregarvoid ya que se utiliza
    //con un modificador el atributo

    public void setColor (String newColor){    
        //Se utiliza la nomenclatura set
        this.color = newColor; 

    }

    public String getColor (){
        return this.color;
    }

    public void setGalones (double newGalones){    
        //Se utiliza la nomenclatura set
        this.galones = newGalones; 

    }

    public double getGalones (){
        return this.galones;
    }

    public void setEncendido (boolean newEncendido){    
        //Se utiliza la nomenclatura set
        this.encendido = newEncendido; 

    }

    public boolean isEncendido(){
        return this.encendido;
    }

    public String toString(){
        String cad = "";
        cad += "el carro tiene los siguientes atributos:" ; //el operador += lo que es añadir contenido 
        cad += "\t-El color es." + getColor() + "\n";
        cad += "\t-Tiene el tanque:" + getGalones() + "\n";
        cad+= "\t-El carro esta encendido:" + isEncendido();
        return cad; //Esto nos va devolver todo lo que representemos en el metodo
    }
}
