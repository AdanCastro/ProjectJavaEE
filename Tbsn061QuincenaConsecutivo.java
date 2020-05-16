package mx.sep.nen.model.upago;

import java.util.Date;

public class Tbsn061QuincenaConsecutivo {
    private Long idQuincenaConsecutivo;

    private Long idQuincenaProceso;

    private Long idUsuario;

    private Integer idModalidadCalculo;

    private Integer idEstatusQuincena;

    private Integer consecutivo;

    private String descripcionQnaConsecutivo;

    private Date fechaInicio;

    private Date fechaFinal;

    private Date fechaPago;

    public Long getIdQuincenaConsecutivo() {
        return idQuincenaConsecutivo;
    }

    public void setIdQuincenaConsecutivo(Long idQuincenaConsecutivo) {
        this.idQuincenaConsecutivo = idQuincenaConsecutivo;
    }

    public Long getIdQuincenaProceso() {
        return idQuincenaProceso;
    }

    public void setIdQuincenaProceso(Long idQuincenaProceso) {
        this.idQuincenaProceso = idQuincenaProceso;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdModalidadCalculo() {
        return idModalidadCalculo;
    }

    public void setIdModalidadCalculo(Integer idModalidadCalculo) {
        this.idModalidadCalculo = idModalidadCalculo;
    }

    public Integer getIdEstatusQuincena() {
        return idEstatusQuincena;
    }

    public void setIdEstatusQuincena(Integer idEstatusQuincena) {
        this.idEstatusQuincena = idEstatusQuincena;
    }

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getDescripcionQnaConsecutivo() {
        return descripcionQnaConsecutivo;
    }

    public void setDescripcionQnaConsecutivo(String descripcionQnaConsecutivo) {
        this.descripcionQnaConsecutivo = descripcionQnaConsecutivo == null ? null : descripcionQnaConsecutivo.trim();
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Tbsn061QuincenaConsecutivo other = (Tbsn061QuincenaConsecutivo) that;
        return (this.getIdQuincenaConsecutivo() == null ? other.getIdQuincenaConsecutivo() == null : this.getIdQuincenaConsecutivo().equals(other.getIdQuincenaConsecutivo()))
            && (this.getIdQuincenaProceso() == null ? other.getIdQuincenaProceso() == null : this.getIdQuincenaProceso().equals(other.getIdQuincenaProceso()))
            && (this.getIdUsuario() == null ? other.getIdUsuario() == null : this.getIdUsuario().equals(other.getIdUsuario()))
            && (this.getIdModalidadCalculo() == null ? other.getIdModalidadCalculo() == null : this.getIdModalidadCalculo().equals(other.getIdModalidadCalculo()))
            && (this.getIdEstatusQuincena() == null ? other.getIdEstatusQuincena() == null : this.getIdEstatusQuincena().equals(other.getIdEstatusQuincena()))
            && (this.getConsecutivo() == null ? other.getConsecutivo() == null : this.getConsecutivo().equals(other.getConsecutivo()))
            && (this.getDescripcionQnaConsecutivo() == null ? other.getDescripcionQnaConsecutivo() == null : this.getDescripcionQnaConsecutivo().equals(other.getDescripcionQnaConsecutivo()))
            && (this.getFechaInicio() == null ? other.getFechaInicio() == null : this.getFechaInicio().equals(other.getFechaInicio()))
            && (this.getFechaFinal() == null ? other.getFechaFinal() == null : this.getFechaFinal().equals(other.getFechaFinal()))
            && (this.getFechaPago() == null ? other.getFechaPago() == null : this.getFechaPago().equals(other.getFechaPago()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdQuincenaConsecutivo() == null) ? 0 : getIdQuincenaConsecutivo().hashCode());
        result = prime * result + ((getIdQuincenaProceso() == null) ? 0 : getIdQuincenaProceso().hashCode());
        result = prime * result + ((getIdUsuario() == null) ? 0 : getIdUsuario().hashCode());
        result = prime * result + ((getIdModalidadCalculo() == null) ? 0 : getIdModalidadCalculo().hashCode());
        result = prime * result + ((getIdEstatusQuincena() == null) ? 0 : getIdEstatusQuincena().hashCode());
        result = prime * result + ((getConsecutivo() == null) ? 0 : getConsecutivo().hashCode());
        result = prime * result + ((getDescripcionQnaConsecutivo() == null) ? 0 : getDescripcionQnaConsecutivo().hashCode());
        result = prime * result + ((getFechaInicio() == null) ? 0 : getFechaInicio().hashCode());
        result = prime * result + ((getFechaFinal() == null) ? 0 : getFechaFinal().hashCode());
        result = prime * result + ((getFechaPago() == null) ? 0 : getFechaPago().hashCode());
        return result;
    }
}