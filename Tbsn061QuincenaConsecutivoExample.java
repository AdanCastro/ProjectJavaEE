package mx.sep.nen.model.upago;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tbsn061QuincenaConsecutivoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tbsn061QuincenaConsecutivoExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdQuincenaConsecutivoIsNull() {
            addCriterion("ID_QUINCENA_CONSECUTIVO is null");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoIsNotNull() {
            addCriterion("ID_QUINCENA_CONSECUTIVO is not null");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoEqualTo(Long value) {
            addCriterion("ID_QUINCENA_CONSECUTIVO =", value, "idQuincenaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoNotEqualTo(Long value) {
            addCriterion("ID_QUINCENA_CONSECUTIVO <>", value, "idQuincenaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoGreaterThan(Long value) {
            addCriterion("ID_QUINCENA_CONSECUTIVO >", value, "idQuincenaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_QUINCENA_CONSECUTIVO >=", value, "idQuincenaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoLessThan(Long value) {
            addCriterion("ID_QUINCENA_CONSECUTIVO <", value, "idQuincenaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoLessThanOrEqualTo(Long value) {
            addCriterion("ID_QUINCENA_CONSECUTIVO <=", value, "idQuincenaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoIn(List<Long> values) {
            addCriterion("ID_QUINCENA_CONSECUTIVO in", values, "idQuincenaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoNotIn(List<Long> values) {
            addCriterion("ID_QUINCENA_CONSECUTIVO not in", values, "idQuincenaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoBetween(Long value1, Long value2) {
            addCriterion("ID_QUINCENA_CONSECUTIVO between", value1, value2, "idQuincenaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaConsecutivoNotBetween(Long value1, Long value2) {
            addCriterion("ID_QUINCENA_CONSECUTIVO not between", value1, value2, "idQuincenaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoIsNull() {
            addCriterion("ID_QUINCENA_PROCESO is null");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoIsNotNull() {
            addCriterion("ID_QUINCENA_PROCESO is not null");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoEqualTo(Long value) {
            addCriterion("ID_QUINCENA_PROCESO =", value, "idQuincenaProceso");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoNotEqualTo(Long value) {
            addCriterion("ID_QUINCENA_PROCESO <>", value, "idQuincenaProceso");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoGreaterThan(Long value) {
            addCriterion("ID_QUINCENA_PROCESO >", value, "idQuincenaProceso");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_QUINCENA_PROCESO >=", value, "idQuincenaProceso");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoLessThan(Long value) {
            addCriterion("ID_QUINCENA_PROCESO <", value, "idQuincenaProceso");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoLessThanOrEqualTo(Long value) {
            addCriterion("ID_QUINCENA_PROCESO <=", value, "idQuincenaProceso");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoIn(List<Long> values) {
            addCriterion("ID_QUINCENA_PROCESO in", values, "idQuincenaProceso");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoNotIn(List<Long> values) {
            addCriterion("ID_QUINCENA_PROCESO not in", values, "idQuincenaProceso");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoBetween(Long value1, Long value2) {
            addCriterion("ID_QUINCENA_PROCESO between", value1, value2, "idQuincenaProceso");
            return (Criteria) this;
        }

        public Criteria andIdQuincenaProcesoNotBetween(Long value1, Long value2) {
            addCriterion("ID_QUINCENA_PROCESO not between", value1, value2, "idQuincenaProceso");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIsNull() {
            addCriterion("ID_USUARIO is null");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIsNotNull() {
            addCriterion("ID_USUARIO is not null");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioEqualTo(Long value) {
            addCriterion("ID_USUARIO =", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotEqualTo(Long value) {
            addCriterion("ID_USUARIO <>", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioGreaterThan(Long value) {
            addCriterion("ID_USUARIO >", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_USUARIO >=", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLessThan(Long value) {
            addCriterion("ID_USUARIO <", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLessThanOrEqualTo(Long value) {
            addCriterion("ID_USUARIO <=", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIn(List<Long> values) {
            addCriterion("ID_USUARIO in", values, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotIn(List<Long> values) {
            addCriterion("ID_USUARIO not in", values, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioBetween(Long value1, Long value2) {
            addCriterion("ID_USUARIO between", value1, value2, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotBetween(Long value1, Long value2) {
            addCriterion("ID_USUARIO not between", value1, value2, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoIsNull() {
            addCriterion("ID_MODALIDAD_CALCULO is null");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoIsNotNull() {
            addCriterion("ID_MODALIDAD_CALCULO is not null");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoEqualTo(Integer value) {
            addCriterion("ID_MODALIDAD_CALCULO =", value, "idModalidadCalculo");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoNotEqualTo(Integer value) {
            addCriterion("ID_MODALIDAD_CALCULO <>", value, "idModalidadCalculo");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoGreaterThan(Integer value) {
            addCriterion("ID_MODALIDAD_CALCULO >", value, "idModalidadCalculo");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_MODALIDAD_CALCULO >=", value, "idModalidadCalculo");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoLessThan(Integer value) {
            addCriterion("ID_MODALIDAD_CALCULO <", value, "idModalidadCalculo");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoLessThanOrEqualTo(Integer value) {
            addCriterion("ID_MODALIDAD_CALCULO <=", value, "idModalidadCalculo");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoIn(List<Integer> values) {
            addCriterion("ID_MODALIDAD_CALCULO in", values, "idModalidadCalculo");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoNotIn(List<Integer> values) {
            addCriterion("ID_MODALIDAD_CALCULO not in", values, "idModalidadCalculo");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoBetween(Integer value1, Integer value2) {
            addCriterion("ID_MODALIDAD_CALCULO between", value1, value2, "idModalidadCalculo");
            return (Criteria) this;
        }

        public Criteria andIdModalidadCalculoNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_MODALIDAD_CALCULO not between", value1, value2, "idModalidadCalculo");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaIsNull() {
            addCriterion("ID_ESTATUS_QUINCENA is null");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaIsNotNull() {
            addCriterion("ID_ESTATUS_QUINCENA is not null");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaEqualTo(Integer value) {
            addCriterion("ID_ESTATUS_QUINCENA =", value, "idEstatusQuincena");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaNotEqualTo(Integer value) {
            addCriterion("ID_ESTATUS_QUINCENA <>", value, "idEstatusQuincena");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaGreaterThan(Integer value) {
            addCriterion("ID_ESTATUS_QUINCENA >", value, "idEstatusQuincena");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_ESTATUS_QUINCENA >=", value, "idEstatusQuincena");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaLessThan(Integer value) {
            addCriterion("ID_ESTATUS_QUINCENA <", value, "idEstatusQuincena");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaLessThanOrEqualTo(Integer value) {
            addCriterion("ID_ESTATUS_QUINCENA <=", value, "idEstatusQuincena");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaIn(List<Integer> values) {
            addCriterion("ID_ESTATUS_QUINCENA in", values, "idEstatusQuincena");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaNotIn(List<Integer> values) {
            addCriterion("ID_ESTATUS_QUINCENA not in", values, "idEstatusQuincena");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaBetween(Integer value1, Integer value2) {
            addCriterion("ID_ESTATUS_QUINCENA between", value1, value2, "idEstatusQuincena");
            return (Criteria) this;
        }

        public Criteria andIdEstatusQuincenaNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_ESTATUS_QUINCENA not between", value1, value2, "idEstatusQuincena");
            return (Criteria) this;
        }

        public Criteria andConsecutivoIsNull() {
            addCriterion("CONSECUTIVO is null");
            return (Criteria) this;
        }

        public Criteria andConsecutivoIsNotNull() {
            addCriterion("CONSECUTIVO is not null");
            return (Criteria) this;
        }

        public Criteria andConsecutivoEqualTo(Integer value) {
            addCriterion("CONSECUTIVO =", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoNotEqualTo(Integer value) {
            addCriterion("CONSECUTIVO <>", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoGreaterThan(Integer value) {
            addCriterion("CONSECUTIVO >", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSECUTIVO >=", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoLessThan(Integer value) {
            addCriterion("CONSECUTIVO <", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoLessThanOrEqualTo(Integer value) {
            addCriterion("CONSECUTIVO <=", value, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoIn(List<Integer> values) {
            addCriterion("CONSECUTIVO in", values, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoNotIn(List<Integer> values) {
            addCriterion("CONSECUTIVO not in", values, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoBetween(Integer value1, Integer value2) {
            addCriterion("CONSECUTIVO between", value1, value2, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andConsecutivoNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSECUTIVO not between", value1, value2, "consecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoIsNull() {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoIsNotNull() {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoEqualTo(String value) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO =", value, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoNotEqualTo(String value) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO <>", value, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoGreaterThan(String value) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO >", value, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO >=", value, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoLessThan(String value) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO <", value, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO <=", value, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoLike(String value) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO like", value, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoNotLike(String value) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO not like", value, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoIn(List<String> values) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO in", values, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoNotIn(List<String> values) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO not in", values, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoBetween(String value1, String value2) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO between", value1, value2, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andDescripcionQnaConsecutivoNotBetween(String value1, String value2) {
            addCriterion("DESCRIPCION_QNA_CONSECUTIVO not between", value1, value2, "descripcionQnaConsecutivo");
            return (Criteria) this;
        }

        public Criteria andFechaInicioIsNull() {
            addCriterion("FECHA_INICIO is null");
            return (Criteria) this;
        }

        public Criteria andFechaInicioIsNotNull() {
            addCriterion("FECHA_INICIO is not null");
            return (Criteria) this;
        }

        public Criteria andFechaInicioEqualTo(Date value) {
            addCriterion("FECHA_INICIO =", value, "fechaInicio");
            return (Criteria) this;
        }

        public Criteria andFechaInicioNotEqualTo(Date value) {
            addCriterion("FECHA_INICIO <>", value, "fechaInicio");
            return (Criteria) this;
        }

        public Criteria andFechaInicioGreaterThan(Date value) {
            addCriterion("FECHA_INICIO >", value, "fechaInicio");
            return (Criteria) this;
        }

        public Criteria andFechaInicioGreaterThanOrEqualTo(Date value) {
            addCriterion("FECHA_INICIO >=", value, "fechaInicio");
            return (Criteria) this;
        }

        public Criteria andFechaInicioLessThan(Date value) {
            addCriterion("FECHA_INICIO <", value, "fechaInicio");
            return (Criteria) this;
        }

        public Criteria andFechaInicioLessThanOrEqualTo(Date value) {
            addCriterion("FECHA_INICIO <=", value, "fechaInicio");
            return (Criteria) this;
        }

        public Criteria andFechaInicioIn(List<Date> values) {
            addCriterion("FECHA_INICIO in", values, "fechaInicio");
            return (Criteria) this;
        }

        public Criteria andFechaInicioNotIn(List<Date> values) {
            addCriterion("FECHA_INICIO not in", values, "fechaInicio");
            return (Criteria) this;
        }

        public Criteria andFechaInicioBetween(Date value1, Date value2) {
            addCriterion("FECHA_INICIO between", value1, value2, "fechaInicio");
            return (Criteria) this;
        }

        public Criteria andFechaInicioNotBetween(Date value1, Date value2) {
            addCriterion("FECHA_INICIO not between", value1, value2, "fechaInicio");
            return (Criteria) this;
        }

        public Criteria andFechaFinalIsNull() {
            addCriterion("FECHA_FINAL is null");
            return (Criteria) this;
        }

        public Criteria andFechaFinalIsNotNull() {
            addCriterion("FECHA_FINAL is not null");
            return (Criteria) this;
        }

        public Criteria andFechaFinalEqualTo(Date value) {
            addCriterion("FECHA_FINAL =", value, "fechaFinal");
            return (Criteria) this;
        }

        public Criteria andFechaFinalNotEqualTo(Date value) {
            addCriterion("FECHA_FINAL <>", value, "fechaFinal");
            return (Criteria) this;
        }

        public Criteria andFechaFinalGreaterThan(Date value) {
            addCriterion("FECHA_FINAL >", value, "fechaFinal");
            return (Criteria) this;
        }

        public Criteria andFechaFinalGreaterThanOrEqualTo(Date value) {
            addCriterion("FECHA_FINAL >=", value, "fechaFinal");
            return (Criteria) this;
        }

        public Criteria andFechaFinalLessThan(Date value) {
            addCriterion("FECHA_FINAL <", value, "fechaFinal");
            return (Criteria) this;
        }

        public Criteria andFechaFinalLessThanOrEqualTo(Date value) {
            addCriterion("FECHA_FINAL <=", value, "fechaFinal");
            return (Criteria) this;
        }

        public Criteria andFechaFinalIn(List<Date> values) {
            addCriterion("FECHA_FINAL in", values, "fechaFinal");
            return (Criteria) this;
        }

        public Criteria andFechaFinalNotIn(List<Date> values) {
            addCriterion("FECHA_FINAL not in", values, "fechaFinal");
            return (Criteria) this;
        }

        public Criteria andFechaFinalBetween(Date value1, Date value2) {
            addCriterion("FECHA_FINAL between", value1, value2, "fechaFinal");
            return (Criteria) this;
        }

        public Criteria andFechaFinalNotBetween(Date value1, Date value2) {
            addCriterion("FECHA_FINAL not between", value1, value2, "fechaFinal");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIsNull() {
            addCriterion("FECHA_PAGO is null");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIsNotNull() {
            addCriterion("FECHA_PAGO is not null");
            return (Criteria) this;
        }

        public Criteria andFechaPagoEqualTo(Date value) {
            addCriterion("FECHA_PAGO =", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotEqualTo(Date value) {
            addCriterion("FECHA_PAGO <>", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoGreaterThan(Date value) {
            addCriterion("FECHA_PAGO >", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoGreaterThanOrEqualTo(Date value) {
            addCriterion("FECHA_PAGO >=", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoLessThan(Date value) {
            addCriterion("FECHA_PAGO <", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoLessThanOrEqualTo(Date value) {
            addCriterion("FECHA_PAGO <=", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIn(List<Date> values) {
            addCriterion("FECHA_PAGO in", values, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotIn(List<Date> values) {
            addCriterion("FECHA_PAGO not in", values, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoBetween(Date value1, Date value2) {
            addCriterion("FECHA_PAGO between", value1, value2, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotBetween(Date value1, Date value2) {
            addCriterion("FECHA_PAGO not between", value1, value2, "fechaPago");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}