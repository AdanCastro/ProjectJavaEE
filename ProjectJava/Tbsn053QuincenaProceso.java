package mx.sep.nen.model.upago;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Schema(
        name = "TBSN053 QUINCENA_PROCESO ",
        title = "Registro de quincena_proceso ",
        description = "Entidad que representa la tabla TBSN053_QUINCENA_PROCESO ",
        requiredProperties = {"idUsuario", "quincenaProceso", "fechaRegistro", "fechaCierre"})
public class Tbsn053QuincenaProceso {
    @NotNull(message = "Id de quincena proceso")
    @Max(value = 9999999999L, message = "Máximo 10 digitos del id de quincena proceso")
    @Schema(description = "Identificador del usuario", example = "1234567890")
    private Long idQuincenaProceso;

    @NotNull(message = "Id del usuario es requerido")
    @Max(value = 9999999999L, message = "Máximo 10 digitos del id del usuario")
    @Schema(description = "Identificador del usuario", example = "1234567890")
    private Long idUsuario;

    @NotNull(message = "Quincena proceso requerida")
    @Max(value = 9999999999L , message = "Máximo 10 digitos de quincena proceso")
    @Schema(description = "Identificador de la quincena", example = "202009")
    private Long quincenaProceso;

    @Max(value = 1, message = "Solo se admite 1 ó 0 en vigencia")
    @Schema(description = "Establece si el proceso es vigente", example = "1")
    private Short vigente;

    @NotNull(message = "Fecha de registro requerida")
    @Schema(description = "Fecha de registro del proceso", example = "27/04/2020")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date fechaRegistro;

    @NotNull(message = "Fecha de cierre requerida")
    @Schema(description = "Fecha de cierre del proceso", example = "27/05/2020")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date fechaCierre;

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

    public Long getQuincenaProceso() {
        return quincenaProceso;
    }

    public void setQuincenaProceso(Long quincenaProceso) {
        this.quincenaProceso = quincenaProceso;
    }

    public Short getVigente() {
        return vigente;
    }

    public void setVigente(Short vigente) {
        this.vigente = vigente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
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
        Tbsn053QuincenaProceso other = (Tbsn053QuincenaProceso) that;
        return (this.getIdQuincenaProceso() == null ? other.getIdQuincenaProceso() == null : this.getIdQuincenaProceso().equals(other.getIdQuincenaProceso()))
                && (this.getIdUsuario() == null ? other.getIdUsuario() == null : this.getIdUsuario().equals(other.getIdUsuario()))
                && (this.getQuincenaProceso() == null ? other.getQuincenaProceso() == null : this.getQuincenaProceso().equals(other.getQuincenaProceso()))
                && (this.getVigente() == null ? other.getVigente() == null : this.getVigente().equals(other.getVigente()))
                && (this.getFechaRegistro() == null ? other.getFechaRegistro() == null : this.getFechaRegistro().equals(other.getFechaRegistro()))
                && (this.getFechaCierre() == null ? other.getFechaCierre() == null : this.getFechaCierre().equals(other.getFechaCierre()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdQuincenaProceso() == null) ? 0 : getIdQuincenaProceso().hashCode());
        result = prime * result + ((getIdUsuario() == null) ? 0 : getIdUsuario().hashCode());
        result = prime * result + ((getQuincenaProceso() == null) ? 0 : getQuincenaProceso().hashCode());
        result = prime * result + ((getVigente() == null) ? 0 : getVigente().hashCode());
        result = prime * result + ((getFechaRegistro() == null) ? 0 : getFechaRegistro().hashCode());
        result = prime * result + ((getFechaCierre() == null) ? 0 : getFechaCierre().hashCode());
        return result;
    }
}
