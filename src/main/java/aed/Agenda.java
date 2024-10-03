package aed;

public class Agenda {
    private Fecha fecha;
    private Recordatorio rec;
    //private ArregloRedimensionableDeRecordatorios seq;
    public Agenda(Fecha fechaActual) {
        // Implementar
        this.fecha = new Fecha(fechaActual);// Instacio la clase Fecha donde le paso algo de tipo Fecha
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        // Implementar //"Parece constructor de Recordatorio"
        // AGREGAMOS RECORDATORIO A LA CLASE ARREGLO
        this.rec = recordatorio;
      //  this.seq.agregarAtras(this.rec);
    }

    @Override
    public String toString() {
        // Implementar
        //DEBEMOS HACER QUE TODOS LOS ELEMENTOS DEL ARREGLO SE PRINTEEN DE UNA
        //String res = this.fecha + "\n" + "=====" +"\n" + this.seq.obtener(0)
        return this.fecha + "\n" + "=====" +"\n" ;//+ this.seq.obtener(0) +"\n"+ this.seq.obtener(1);
    }

    public void incrementarDia() {
        // Implementar
    }

    public Fecha fechaActual() {
        // Implementar

        return new Fecha(this.fecha);
    }

}
