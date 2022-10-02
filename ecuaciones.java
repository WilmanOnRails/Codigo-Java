public class ecuaciones {
private int a;
private int b;
private int c;    

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return this.c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public ecuaciones(int a,int b,int c){
        setA(a);
        setB(b);
        setC(c);
    }

    public void obtenerRaices(){
        System.out.println("Solucion 1: ");
        System.out.println("solucion 2: ");
    }

    public int raizP(int a, int b, int c){
        return (int)(-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/2*a;
    }

    public int raizN(int a, int b, int c){
        return (int)(-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/2*a;
    }

    public int discriminante(int a, int b, int c){
        return (int) Math.pow(b, 2)-4*a*c;
    }
}
