package aed;

public class Agenda {
    private Fecha fecha;
    private Recordatorio rec;
    private ArregloRedimensionableDeRecordatorios seq = new ArregloRedimensionableDeRecordatorios();
    public Agenda(Fecha fechaActual) {
        // Implementar
        this.fecha = new Fecha(fechaActual);// Instancio la clase Fecha donde le paso algo de tipo Fecha
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        // Implementar //"Parece constructor de Recordatorio"
        // AGREGAMOS RECORDATORIO A LA CLASE ARREGLO
        this.rec = recordatorio;
        this.seq.agregarAtras(this.rec);
    }

    @Override
    public String toString() {
        // Implementar
        //DEBEMOS HACER QUE TODOS LOS ELEMENTOS DEL ARREGLO SE PRINTEEN DE UNA
        // Creamos un objeto string para agregar a gusto los recordatorios

        String resultado = new String();
        resultado = this.fecha + "\n" + "=====" +"\n";
        // Reviso con fechaIndividual si cada uno de los recordatorios de la lista son iguales , si son iguales entonces solo los elementos con fecha igual se van a Printear ,e ignorara si alguna tiene fecha diferente a la actual
        for (int i = 0; i<this.seq.longitud();i++){
            Recordatorio fechaIndividual = this.seq.obtener(i);
            if (fechaIndividual.fecha().equals(this.fecha)){
                resultado = resultado + this.seq.obtener(i) + "\n";
                }
        }
        
        return resultado;
    }

    public void incrementarDia() {
        // Implementar
        this.fecha.incrementarDia();
    }

    public Fecha fechaActual() {
        // Implementar

        return new Fecha(this.fecha);
    }

}
