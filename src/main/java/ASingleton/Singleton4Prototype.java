package ASingleton;

import java.util.Date;

public class Singleton4Prototype implements Cloneable {
        // 2) attribute del mismo tipo, private, static
        private static Singleton4Prototype instance;

        // 1) constructor private
    private Singleton4Prototype(){
            System.out.println("*-*-* Creando mi singleton .....");
            //logic
        }

        // 3) method public static - para el acceso global
        public static Singleton4Prototype getInstance(){
            // garantiza que la instancia es unica
            if (instance== null)
                instance= new Singleton4Prototype();
            return instance;
        }

        public void time(){
            System.out.println("time: "+new Date());
        }

        public void resetSingleton(){
            instance=null;
        }

        public Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException("esto es un singleton");
        }
    }
