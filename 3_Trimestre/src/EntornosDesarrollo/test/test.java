package EntornosDesarrollo.test;

public class Test {
    /**
     * @author FilipLand
     */
    static Integer plan;
    static Double idea;

    public static void main(String[] args) {
        System.out.println("test");
        funcionVieja(plan, idea);
        exepcion();

    }

    /**
     * @param idea2
     * @param plan2
     * @deprecated la funcion es vieja no deberia de utilizarse
     */

    public static void funcionVieja(Integer plan2, Double idea2) {
        System.out.println("no funciona");
    }

    /**
     * @throws excepcion metodo puede generar una excepcion si se intruduce un cero
     */

    public static void exepcion() {
        plan = 4;

    }
}