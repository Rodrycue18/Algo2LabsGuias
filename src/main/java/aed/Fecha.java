package aed;

public class Fecha {
    private int dia;
    private int mes;

    public Fecha(int dia, int mes) {
        // Implementar
        this.dia = dia;
        this.mes = mes;

    }

    public Fecha(Fecha fecha) {
        // Implementar
        this.mes = fecha.mes;
        this.dia = fecha.dia;
        
    }

    public Integer dia() {
        // Implementar
        return this.dia ;
    }

    public Integer mes() {
        // Implementar
        return this.mes;
    }

    public String toString() {
        // Implementar
        return this.dia+"/"+this.mes;
    }

    @Override
    public boolean equals(Object otra) {
        // Implementar
        // Chequeamos si el otro objeto no tiene ningun valor asignado o no apunta a algo
        boolean otroEsNull = (otra == null);
        if (otroEsNull || otra.getClass() != this.getClass() ){
            return false;
        }
       //Casting 
        Fecha otro = (Fecha) otra;
        return (this.mes == otro.mes)&&(this.dia == otro.dia);
        
        // COMO MI PARAMETRO ES TIPO OBJETO java esta pensando en un objeto general
        // Con el CASTING le digo a java que asumo que es un objeto Fecha
       
    }

    public void incrementarDia() {
        // Implementar
        int ultimoDiaDelMes = this.diasEnMes(this.mes);
        if(this.dia == ultimoDiaDelMes && this.mes == 12){
            this.dia = 1;
            this.mes = 1;
        }
        else{
            if (this.dia == ultimoDiaDelMes){
                this.dia = 1;
                this.mes = this.mes+1;
            }
            else{
                this.dia = this.dia+1;
    
            }
        }
        
    }
    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
