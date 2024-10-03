package aed;

public class Recordatorio {
    private String mensaje;
    private Fecha fecha;
    private Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        // Implementar
        this.mensaje = mensaje;
        this.fecha = new Fecha(fecha); // NO se porque pasa los tests cuando en el constructor creo una instacia
        this.horario = horario;
    }

    public Horario horario() {
        // Implementar
        return this.horario;
    }

    public Fecha fecha() {
        // Implementar
        return new Fecha(fecha.dia(),fecha.mes());// y aqui tambien hago como doble creacion de instancia
    }               // o Fecha(fecha) igual funciona

    public String mensaje() {
        // Implementar
        return this.mensaje;
    }

    @Override
    public String toString() {
        // Implementar
        return this.mensaje + " @ "+ this.fecha+" "+ this.horario;
    }

    @Override
    public boolean equals(Object otro) {
        // Implementar
        boolean otroEsNull = (otro == null);

        if (otroEsNull || otro.getClass() != this.getClass() ){
            return false;
        }

       //Casting 
        Recordatorio otra = (Recordatorio) otro;
        return (this.fecha.equals(otra.fecha))&&(this.mensaje == otra.mensaje)&&(this.horario.equals(otra.horario));
        //FALTA QUE AGREGUEN TEST PARA ESTA FUNCION EQUALS, NO PUDO VERIFICAR SI ESTA BIEN, LUEGO NO ESTOY SEGURO SI ESTA
        //BIEN USAR ESTE METODO.EQUALS O SI FUNCIONABA CON THIS.FECHA == OTRA.FECHA && ...
    }

}
