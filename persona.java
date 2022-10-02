public class persona {

    private String nombre, dni,apellido;
    private int edad;
    private double peso,altura;
    private char sexo;
    private final static char sexo_def = 'H';

 public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public char getSexo() {
        return this.sexo;
    }

    public persona(String nombre,String dni,String apellido){
        setApellido(apellido);
        setNombre(nombre);
        setDni(dni);
    }
    public void setSexo(char sexo) {
        if(comp_sexo(sexo)){
         this.sexo = sexo;
        }else{
            this.sexo = sexo_def;
        }
        
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if(nombre!=null){ 
         this.nombre = nombre;
        }
    }

    public String getDni() {
        return this.dni;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //constructores 
    public persona(){
     this("",0, sexo_def,0,0);
    }

    public persona(String nombre, int edad, char sexo ){
     setNombre(nombre);
     setEdad(edad);
     setSexo(sexo);
    }
    
    public persona(String nombre,int edad, char sexo, double altura, double peso){
        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
        setAltura(altura);
        setPeso(peso);
    }
    //metodos
    public int clacular_imc(double peso, double altura){
        double imc = peso/(altura*altura);
        if (imc < 20) {
            return -1;
        } else if(imc>=20 && imc<=25){
            return 0;
        }else{
            return 1;
        }
    }

    public boolean es_mayor(int edad){
        if(edad<18){
            return false;
        }else{
            return true;
        }
    }

    private boolean comp_sexo(char sexo){
        Character.toUpperCase(sexo);
        if(sexo=='H' || sexo =='M'){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return " nombre: "+getNombre()+", dni: "+generar_dni()+", edad: "+getEdad()+ ", peso: "+
        getPeso()+", altura: "+getAltura()+", sexo: "+getSexo();
    }

    private String generar_dni(){
        int y = (int)((Math.random() * 10000000) * 10);
        String auxi = Integer.toString(y);
        String dni = "", help;
        String x[] = {"a" , "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" ,"n","o"
        , "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < 8; i++) {
            char ayuda = auxi.charAt(i);
            help = Character.toString(ayuda);
            y = Integer.parseInt(help);
            dni += x[y];
        }
        return dni;
    }


    /*
 System.out.print("nombre: ");
 String nombre = key.next();
 System.out.print("sexo: ");
 char sexo = key.next().charAt(0);
 System.out.print("edad: ");
 int edad = key.nextInt();
 System.out.print("peso: ");
 double peso = key.nextDouble();
 System.out.print("altura: ");
 double altura = key.nextDouble();

 persona p1 = new persona(nombre,edad,sexo,altura,peso);
 //persona p2 = new persona(nombre,edad,sexo);
 persona p3 = new persona();

 p3.setNombre("nsoe");
 p3.setEdad(22);
 p3.setAltura(1.8);
 p3.setPeso(68.6);
 p3.setSexo('M');
  
System.out.println("");
name(p1.clacular_imc(peso, altura) , p1.getNombre());
name(p3.clacular_imc(p3.getPeso(), p3.getAltura()), p3.getNombre());
System.out.println(" ");
si(p1.es_mayor(edad), nombre);
si(p3.es_mayor(p3.getEdad()), p3.getNombre());
System.out.println("");
System.out.println(p1);
System.out.println(p3);


//metodos
public static void name(int valor,String nombre) {
    if(valor==-1)
    {
        System.out.println("El objeto: "+nombre+" esta por debajo del peso ideal");
    }
    else
    {
        if(valor==0)
        {
            System.out.println("El objeto: "+nombre+" esta en su peso ideal");
        }
        else
        {
            System.out.println("El objeto: "+nombre+" esta por encima del peso ideal");
        }
    }
}
public static void si(boolean a, String nombre){
    if(a){
        System.out.println(nombre + " es mayor de edad");
    }else{
        System.out.println(nombre + " es menor de edad");
    }
}


    */



}
