package Ejercicio02;

public class Alumno {

    //atributos encapsulados
    private String nombre;
    private double T1;
    private double T2;
    private double T3;
    private double examenFinal;
    private double promedioFinal;
    private String situacion;
    private double laboratorio;
    private double puntosAdicionalesOracle;

    //METODO CONSTRUCTOR
    public Alumno(String nombre, double T1, double T2, double T3, double examenFinal, double laboratorio, double puntosAdicionalesOracle) {
        this.nombre = nombre;
        this.T1 = T1;
        this.T2 = T2;
        this.T3 = T3;
        this.examenFinal = examenFinal;
        this.laboratorio = laboratorio;
        this.puntosAdicionalesOracle = puntosAdicionalesOracle;
    }

    //METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getT1() {
        return T1;
    }

    public void setT1(double T1) {
        this.T1 = T1;
    }

    public double getT2() {
        return T2;
    }

    public void setT2(double T2) {
        this.T2 = T2;
    }

    public double getT3() {
        return T3;
    }

    public void setT3(double T3) {
        this.T3 = T3;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

    public double getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public double getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(double laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPuntosAdicionalesOracle() {
        return puntosAdicionalesOracle;
    }

    public void setPuntosAdicionalesOracle(double puntosAdicionalesOracle) {
        this.puntosAdicionalesOracle = puntosAdicionalesOracle;
    }

    //metodos adicionales
    public double calcularT1() {
        return (laboratorio * 0.3) + (T1 * 0.7);
    }

    public double calcularT2() {
        return (laboratorio * 0.3) + (T2 * 0.7);
    }

    public double calcularT3() {
        return T3;
    }

    public double calcularExamenFinal() {
        return (examenFinal + puntosAdicionalesOracle) / 2;
    }

    public double calcularPromedioFinal() {
        return (calcularT1() + calcularT2() + calcularT3() + calcularExamenFinal()) / 4;
    }

    public String determinarSituacion() {
        if (calcularPromedioFinal() >= 12) {
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }
}
