import java.util.Objects;

public class PabellonCirugia {

    private int numero;
    private String especialidad;
    private Estado estado;

    public PabellonCirugia(int numero, String especialidad) {

        this.numero = numero;
        this.especialidad = especialidad;
        this.estado = Estado.DISPONIBLE;

    }

    public int getNumero() {
        return numero;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {

        String estadoString = (estado == Estado.OCUPADO) ? "ocupado" : "disponible";

        return "PabellonCirugia { " +
                "numero =" + numero +
                ", especialidad ='" + especialidad + '\'' +
                ", estado =" + estadoString +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PabellonCirugia otro = (PabellonCirugia) o;
        return this.numero == otro.numero;
    }

}
