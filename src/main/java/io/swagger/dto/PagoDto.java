package io.swagger.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Pago
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-15T04:20:31.519478174Z[GMT]")


public class PagoDto {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nombrePagador")
  private String nombrePagador = null;

  @JsonProperty("emailPagador")
  private String emailPagador = null;

  @JsonProperty("valor")
  private Double valor = null;

  @JsonProperty("referencia")
  private Long referencia = null;

  public PagoDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "79459506-9bc2-43c8-bd0c-379239de5fb5", description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PagoDto nombrePagador(String nombrePagador) {
    this.nombrePagador = nombrePagador;
    return this;
  }

  /**
   * Get nombrePagador
   * @return nombrePagador
   **/
  @Schema(example = "yoimar", description = "")
  
    public String getNombrePagador() {
    return nombrePagador;
  }

  public void setNombrePagador(String nombrePagador) {
    this.nombrePagador = nombrePagador;
  }

  public PagoDto emailPagador(String emailPagador) {
    this.emailPagador = emailPagador;
    return this;
  }

  /**
   * Get emailPagador
   * @return emailPagador
   **/
  @Schema(example = "yoimar@gmail.com", description = "")
  
    public String getEmailPagador() {
    return emailPagador;
  }

  public void setEmailPagador(String emailPagador) {
    this.emailPagador = emailPagador;
  }

  public PagoDto valor(Double valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Get valor
   * @return valor
   **/
  @Schema(example = "5000", description = "")
  
    public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public PagoDto referencia(Long referencia) {
    this.referencia = referencia;
    return this;
  }

  /**
   * Get referencia
   * @return referencia
   **/
  @Schema(example = "10", description = "")
  
    public Long getReferencia() {
    return referencia;
  }

  public void setReferencia(Long referencia) {
    this.referencia = referencia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagoDto pagoDto = (PagoDto) o;
    return Objects.equals(this.id, pagoDto.id) &&
        Objects.equals(this.nombrePagador, pagoDto.nombrePagador) &&
        Objects.equals(this.emailPagador, pagoDto.emailPagador) &&
        Objects.equals(this.valor, pagoDto.valor) &&
        Objects.equals(this.referencia, pagoDto.referencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombrePagador, emailPagador, valor, referencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pago {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombrePagador: ").append(toIndentedString(nombrePagador)).append("\n");
    sb.append("    emailPagador: ").append(toIndentedString(emailPagador)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    referencia: ").append(toIndentedString(referencia)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
