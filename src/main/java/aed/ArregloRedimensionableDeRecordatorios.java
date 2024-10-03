package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] seq;
    public ArregloRedimensionableDeRecordatorios() {
        // Implementar
        this.seq = new Recordatorio[0]; //Cosntructor de lista de Recordatorios vacia
        // Para evitar aliasing usamos new 

    }

    public int longitud() {
        // Implementar
        return this.seq.length;
    }

    public void agregarAtras(Recordatorio i) {
        // Implementar
        Recordatorio[] nuevaLista = new Recordatorio[this.seq.length+1]; //La nueva lista tiene +1 tamanio
        for (int j=0;j<this.seq.length;j++){
            nuevaLista[j] = this.seq[j]; 
        }
        
        nuevaLista[nuevaLista.length-1] = i;

        this.seq = nuevaLista.clone();
        // Actualizo atrributo
    }

    public Recordatorio obtener(int i) {
        // Implementar
        return this.seq[i];
    }

    public void quitarAtras() {
        // Implementar
        Recordatorio[] nuevaListaConUnoMenos = new Recordatorio[this.seq.length-1];
        for (int i=0; i<this.seq.length-1;i++){
            nuevaListaConUnoMenos[i]=this.seq[i];
        }
        this.seq = nuevaListaConUnoMenos.clone();

    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        // Implementar
        this.seq[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        // Osea esto es un constructor , que de parametro acepta la misma clase, le paso la lista llena , basicamente
        this.seq = new Recordatorio[vector.longitud()];
        for (int i=0;i<vector.longitud();i++){
            this.seq[i] = vector.obtener(i);
        }
        //Osea este constructor evita que haya un aliasing entre 2 objetos??
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar
        return new ArregloRedimensionableDeRecordatorios(this); //LLegue bien hasta retornar una instancia de 
                                                                //mi constructor que recibe de parametro un vector, pero el this??????
                                                                //se lo pregunte a chatgpt, como funciona esta wea de this ??
    }
}
