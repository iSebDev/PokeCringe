public class Pokemon {
    private String nombre;
    private String tipo;
    private int[] stats = new int[3];
    private String[] mov_rapido;
    private String[] mov_cargado;

    private int num(String value) {
        return Integer.valueOf(value);
    }

    // nombre:tipo:ataque:defensa:hp:mrapidonombre/daño/tipo/energia/segundos:mcargadonombre/daño/tipo/energia
    public Pokemon(String[] datos) {
        this.nombre = datos[0];
        this.tipo = datos[1];
        this.stats[0] = num(datos[2]);
        this.stats[1] = num(datos[3]);
        this.stats[2] = num(datos[4]);
        this.mov_rapido = datos[5].split("/");
        this.mov_cargado = datos[6].split("/");
    }
}
