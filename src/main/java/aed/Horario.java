package aed;

public class Horario {
    private int hora;
    private int minutos;

    public Horario(int hora, int minutos) {
        // Implementar
        this.hora = hora;
        this.minutos=minutos;
    }

    public int hora() {
        // Implementar
        return this.hora;
    }

    public int minutos() {
        // Implementar
        return this.minutos;
    }

    @Override
    public String toString() {
        // Implementar
        return this.hora + ":" + this.minutos;
    }

    @Override
    public boolean equals(Object otro) {
        // Implementar
        boolean otroEsNull = (otro == null);
        if (otroEsNull || otro.getClass() != this.getClass() ){
            return false;
        }
        
        Horario otra = (Horario) otro;
        return (this.hora == otra.hora)&&(this.minutos == otra.minutos);
        
    }

}
