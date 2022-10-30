package com.demo.AlumnosTable.entity;



import javax.persistence.*;

@Entity
@Table(name="alumno")

public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

   /* @Column(name="idalum")
    private long idalum;*/

    @Column(name="noma")
    private String noma;

    @Column(name="apea")
    private String apea;

    @Column(name = "edad")
    private long edad;

    @Column(name = "gene")
    private String gene;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNoma() {
        return noma;
    }

    public void setNoma(String noma) {
        this.noma = noma;
    }

    public String getApea() {
        return apea;
    }

    public void setApea(String apea) {
        this.apea = apea;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Transient
    private Integer port;



}
