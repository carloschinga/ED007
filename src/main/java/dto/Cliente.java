package dto;

import java.util.Date;

public class Cliente {

    private int codiClie;
    private String appaClie;
    private String apmaClie;
    private String nombClie;
    private double pesoClie;

    public Cliente(String nombClie) {
        this.nombClie = nombClie;
    }
    private double tallClie;
    private Date fechNaciClie;

    public Cliente(int codiClie, String appaClie, String apmaClie, String nombClie, double pesoClie, double tallClie, Date fechNaciClie, Nodo sig) {
        this.codiClie = codiClie;
        this.appaClie = appaClie;
        this.apmaClie = apmaClie;
        this.nombClie = nombClie;
        this.pesoClie = pesoClie;
        this.tallClie = tallClie;
        this.fechNaciClie = fechNaciClie;
    }

    public Cliente(int codiClie, String appaClie, String apmaClie, String nombClie, double pesoClie, double tallClie, Date fechNaciClie) {
        this.codiClie = codiClie;
        this.appaClie = appaClie;
        this.apmaClie = apmaClie;
        this.nombClie = nombClie;
        this.pesoClie = pesoClie;
        this.tallClie = tallClie;
        this.fechNaciClie = fechNaciClie;
    }

    public Cliente() {
    }

    public int getCodiClie() {
        return codiClie;
    }

    public void setCodiClie(int codiClie) {
        this.codiClie = codiClie;
    }

    public String getAppaClie() {
        return appaClie;
    }

    public void setAppaClie(String appaClie) {
        this.appaClie = appaClie;
    }

    public String getApmaClie() {
        return apmaClie;
    }

    public void setApmaClie(String apmaClie) {
        this.apmaClie = apmaClie;
    }

    public String getNombClie() {
        return nombClie;
    }

    public void setNombClie(String nombClie) {
        this.nombClie = nombClie;
    }

    public double getPesoClie() {
        return pesoClie;
    }

    public void setPesoClie(double pesoClie) {
        this.pesoClie = pesoClie;
    }

    public double getTallClie() {
        return tallClie;
    }

    public void setTallClie(double tallClie) {
        this.tallClie = tallClie;
    }

    public Date getFechNaciClie() {
        return fechNaciClie;
    }

    public void setFechNaciClie(Date fechNaciClie) {
        this.fechNaciClie = fechNaciClie;
    }

     
    @Override
    public String toString() {
        return "Cliente{"
                + "codigo='" + getCodiClie() + '\''
                + ", apellido paterno='" + getAppaClie() + '\''
                + ", apellido materno='" + getApmaClie() + '\''
                + "nombre" + getNombClie() + '\''
                + "peso" + getPesoClie() + '\''
                + " "
                +'}';
    }

}
