package mx.sep.nen.model.upago;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tbsn053QuincenaProcesoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tbsn053QuincenaProcesoExample() {
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

        public Criteria andQuincenaProcesoIsNull() {
            addCriterion("QUINCENA_PROCESO is null");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoIsNotNull() {
            addCriterion("QUINCENA_PROCESO is not null");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoEqualTo(Long value) {
            addCriterion("QUINCENA_PROCESO =", value, "quincenaProceso");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoNotEqualTo(Long value) {
            addCriterion("QUINCENA_PROCESO <>", value, "quincenaProceso");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoGreaterThan(Long value) {
            addCriterion("QUINCENA_PROCESO >", value, "quincenaProceso");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoGreaterThanOrEqualTo(Long value) {
            addCriterion("QUINCENA_PROCESO >=", value, "quincenaProceso");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoLessThan(Long value) {
            addCriterion("QUINCENA_PROCESO <", value, "quincenaProceso");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoLessThanOrEqualTo(Long value) {
            addCriterion("QUINCENA_PROCESO <=", value, "quincenaProceso");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoIn(List<Long> values) {
            addCriterion("QUINCENA_PROCESO in", values, "quincenaProceso");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoNotIn(List<Long> values) {
            addCriterion("QUINCENA_PROCESO not in", values, "quincenaProceso");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoBetween(Long value1, Long value2) {
            addCriterion("QUINCENA_PROCESO between", value1, value2, "quincenaProceso");
            return (Criteria) this;
        }

        public Criteria andQuincenaProcesoNotBetween(Long value1, Long value2) {
            addCriterion("QUINCENA_PROCESO not between", value1, value2, "quincenaProceso");
            return (Criteria) this;
        }

        public Criteria andVigenteIsNull() {
            addCriterion("VIGENTE is null");
            return (Criteria) this;
        }

        public Criteria andVigenteIsNotNull() {
            addCriterion("VIGENTE is not null");
            return (Criteria) this;
        }

        public Criteria andVigenteEqualTo(Short value) {
            addCriterion("VIGENTE =", value, "vigente");
            return (Criteria) this;
        }

        public Criteria andVigenteNotEqualTo(Short value) {
            addCriterion("VIGENTE <>", value, "vigente");
            return (Criteria) this;
        }

        public Criteria andVigenteGreaterThan(Short value) {
            addCriterion("VIGENTE >", value, "vigente");
            return (Criteria) this;
        }

        public Criteria andVigenteGreaterThanOrEqualTo(Short value) {
            addCriterion("VIGENTE >=", value, "vigente");
            return (Criteria) this;
        }

        public Criteria andVigenteLessThan(Short value) {
            addCriterion("VIGENTE <", value, "vigente");
            return (Criteria) this;
        }

        public Criteria andVigenteLessThanOrEqualTo(Short value) {
            addCriterion("VIGENTE <=", value, "vigente");
            return (Criteria) this;
        }

        public Criteria andVigenteIn(List<Short> values) {
            addCriterion("VIGENTE in", values, "vigente");
            return (Criteria) this;
        }

        public Criteria andVigenteNotIn(List<Short> values) {
            addCriterion("VIGENTE not in", values, "vigente");
            return (Criteria) this;
        }

        public Criteria andVigenteBetween(Short value1, Short value2) {
            addCriterion("VIGENTE between", value1, value2, "vigente");
            return (Criteria) this;
        }

        public Criteria andVigenteNotBetween(Short value1, Short value2) {
            addCriterion("VIGENTE not between", value1, value2, "vigente");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroIsNull() {
            addCriterion("FECHA_REGISTRO is null");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroIsNotNull() {
            addCriterion("FECHA_REGISTRO is not null");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroEqualTo(Date value) {
            addCriterion("FECHA_REGISTRO =", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroNotEqualTo(Date value) {
            addCriterion("FECHA_REGISTRO <>", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroGreaterThan(Date value) {
            addCriterion("FECHA_REGISTRO >", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroGreaterThanOrEqualTo(Date value) {
            addCriterion("FECHA_REGISTRO >=", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroLessThan(Date value) {
            addCriterion("FECHA_REGISTRO <", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroLessThanOrEqualTo(Date value) {
            addCriterion("FECHA_REGISTRO <=", value, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroIn(List<Date> values) {
            addCriterion("FECHA_REGISTRO in", values, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroNotIn(List<Date> values) {
            addCriterion("FECHA_REGISTRO not in", values, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroBetween(Date value1, Date value2) {
            addCriterion("FECHA_REGISTRO between", value1, value2, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaRegistroNotBetween(Date value1, Date value2) {
            addCriterion("FECHA_REGISTRO not between", value1, value2, "fechaRegistro");
            return (Criteria) this;
        }

        public Criteria andFechaCierreIsNull() {
            addCriterion("FECHA_CIERRE is null");
            return (Criteria) this;
        }

        public Criteria andFechaCierreIsNotNull() {
            addCriterion("FECHA_CIERRE is not null");
            return (Criteria) this;
        }

        public Criteria andFechaCierreEqualTo(Date value) {
            addCriterion("FECHA_CIERRE =", value, "fechaCierre");
            return (Criteria) this;
        }

        public Criteria andFechaCierreNotEqualTo(Date value) {
            addCriterion("FECHA_CIERRE <>", value, "fechaCierre");
            return (Criteria) this;
        }

        public Criteria andFechaCierreGreaterThan(Date value) {
            addCriterion("FECHA_CIERRE >", value, "fechaCierre");
            return (Criteria) this;
        }

        public Criteria andFechaCierreGreaterThanOrEqualTo(Date value) {
            addCriterion("FECHA_CIERRE >=", value, "fechaCierre");
            return (Criteria) this;
        }

        public Criteria andFechaCierreLessThan(Date value) {
            addCriterion("FECHA_CIERRE <", value, "fechaCierre");
            return (Criteria) this;
        }

        public Criteria andFechaCierreLessThanOrEqualTo(Date value) {
            addCriterion("FECHA_CIERRE <=", value, "fechaCierre");
            return (Criteria) this;
        }

        public Criteria andFechaCierreIn(List<Date> values) {
            addCriterion("FECHA_CIERRE in", values, "fechaCierre");
            return (Criteria) this;
        }

        public Criteria andFechaCierreNotIn(List<Date> values) {
            addCriterion("FECHA_CIERRE not in", values, "fechaCierre");
            return (Criteria) this;
        }

        public Criteria andFechaCierreBetween(Date value1, Date value2) {
            addCriterion("FECHA_CIERRE between", value1, value2, "fechaCierre");
            return (Criteria) this;
        }

        public Criteria andFechaCierreNotBetween(Date value1, Date value2) {
            addCriterion("FECHA_CIERRE not between", value1, value2, "fechaCierre");
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