# Proyecto multimódulo para servicios REST de la aplicación Nómina Educativa Nacional 

### Java 1.8
### Spring Boot 2.2.0.RELEASE
### mybatis-spring-boot-starter 2.1.0
### ojdbc8 12.2.0.1
### Maven 3.6.2
### JasperReports 6.2.0

## Multimodulo  

|  Modulo | Descripción  |
|---|---|
|  _*Root:*_     |Proyecto Padre|
|  _*Web:*_      |Controladores REST|  
|  _*Service:*_  |Servicios de Negocio|
|  _*Data:*_     |Acceso a Datos a travez de MyBatis - Mappers|
| _*Mode:*_      |Modelo de Datos.|         

## Perfiles 

El proyecto cuenta con 3 perfiles:

|  Perfil | Descripción  | Archivo  |
|---|---|---|
|  _*default:*_ |Ambiente pensado para trabajar en local| _application.yml_ |
|  _*dev:*_     |Ambiente pensado para desplegar en un weblogic de desarrollo, requiere de un JNDI en el weblogic| _application-dev.yml_   |   
|  _*test:*_    |Ambiente pensado para desplegar en un weblogic para pruebas, requiere de un JNDI en el weblogic| _application-test.yml_   |  
|  _*prod:*_    |Ambiente pensado para desplegar en un weblogic productivo, requiere de un JNDI en el weblogic| _application-prod.yml_   |

    Todos los perfiles cuentan con una configuración distinta para los loggers.
    Además de que se carga una configuración distinta para el tipo de conexión a base de datos.
        

## ¿ Cómo deplegar Desplegar ?

Prerequisitos:

    - Maven
    - Java JDK 1.8 
    - IDE (NETBEANS,ECLIPSE,STS,INTELLIJ)
    - Conexión a Base de datos Oracle 19c
    - WebLogic 12.2.1.4 
    
Descargar proyecto: 
```
git clone git@gitlab.com:nomina-sep/nomina-sep-app.git
``` 

Entra a la carpeta
```
cd nomina-sep-nen
```

Obtener información del git.
```
git fetch --force --all -v
```

Cambiar a la rama
```
git checkout sepv2
```                                                   

Compila:
```
mvn clean install
```

```
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for sep-nen 1.0.0-SNAPSHOT:
[INFO] 
[INFO] sep-nen ............................................ SUCCESS [  0.270 s]
[INFO] sep-nen-model ...................................... SUCCESS [  1.282 s]
[INFO] sep-nen-data ....................................... SUCCESS [  0.836 s]
[INFO] sep-nen-service .................................... SUCCESS [  0.325 s]
[INFO] sep-nen-web ........................................ SUCCESS [  3.729 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.739 s
[INFO] Finished at: 2020-04-05T19:03:34-05:00
[INFO] ------------------------------------------------------------------------

```

### Despliega: entra al modulo de Web
```
cd sep-nen-web
```               

ejecuta para despliegue local:
```
 mvn clean install -DskipTests -Dcheckstyle.skip=true -Dfindbugs.skip=true -P=dev 
```

```
DEBUG [31 marzo 2020:14:16:05.018] [restartedMain] o.s.b.w.s.ServletContextInitializerBeans -> Mapping filters: filterRegistrationBean urls=[/*] order=-2147483647, characterEncodingFilter urls=[/*] order=-2147483648, formContentFilter urls=[/*] order=-9900, requestContextFilter urls=[/*] order=-105 
DEBUG [31 marzo 2020:14:16:05.018] [restartedMain] o.s.b.w.s.ServletContextInitializerBeans -> Mapping servlets: dispatcherServlet urls=[/] 
WARN  [31 marzo 2020:14:16:05.070] [restartedMain] c.z.h.HikariConfig -> HikariPool-1 - idleTimeout is less than 10000ms, setting to default 600000ms. 
INFO  [31 marzo 2020:14:16:05.070] [restartedMain] c.z.h.HikariDataSource -> HikariPool-1 - Starting... 
INFO  [31 marzo 2020:14:16:05.557] [restartedMain] c.z.h.HikariDataSource -> HikariPool-1 - Start completed. 
INFO  [31 marzo 2020:14:16:05.589] [restartedMain] o.h.j.i.u.LogHelper -> HHH000204: Processing PersistenceUnitInfo [name: default] 
INFO  [31 marzo 2020:14:16:05.635] [restartedMain] o.h.Version -> HHH000412: Hibernate Core {5.4.6.Final} 
INFO  [31 marzo 2020:14:16:05.729] [restartedMain] o.h.a.c.Version -> HCANN000001: Hibernate Commons Annotations {5.1.0.Final} 
INFO  [31 marzo 2020:14:16:05.797] [restartedMain] o.h.d.Dialect -> HHH000400: Using dialect: org.hibernate.dialect.Oracle10gDialect 
INFO  [31 marzo 2020:14:16:46.039] [restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator -> HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform] 
INFO  [31 marzo 2020:14:16:46.050] [restartedMain] o.s.o.j.LocalContainerEntityManagerFactoryBean -> Initialized JPA EntityManagerFactory for persistence unit 'default' 
INFO  [31 marzo 2020:14:16:46.329] [restartedMain] o.s.s.c.ThreadPoolTaskExecutor -> Initializing ExecutorService 'applicationTaskExecutor' 
INFO  [31 marzo 2020:14:16:46.548] [restartedMain] o.s.b.d.a.OptionalLiveReloadServer -> LiveReload server is running on port 35729 
INFO  [31 marzo 2020:14:16:46.553] [restartedMain] o.s.b.a.e.w.EndpointLinksResolver -> Exposing 2 endpoint(s) beneath base path '/actuator' 
INFO  [31 marzo 2020:14:16:46.602] [restartedMain] o.s.b.w.e.t.TomcatWebServer -> Tomcat started on port(s): 8080 (http) with context path '' 
INFO  [31 marzo 2020:14:16:46.605] [restartedMain] m.o.s.n.SepNenApplication -> Started SepNenApplication in 43.246 seconds (JVM running for 43.596) 

```

### Despliega en Weblogic

Desde el proyecto raíz ejecutar: 

```
cd /boot-sep-nen
```

```
 mvn clean install -DskipTests -Dcheckstyle.skip=true -Dfindbugs.skip=true -P=test
```

Ese comando nos genera un artefacto de tipo War dentro del *target* del proyecto *sep-nen-web*:

```
sep-nen-web/target/sep-nen-web-1.0.0-SNAPSHOT.war
```

Usar ese war para desplegar en Weblogic. 


## Configuraciones

Las configuraciones para la conexión a la base de datos  se encuentra en el modulo
web

     _*reosurces/application.yml*_ 

```
  datasource:
    type: com.zaxxer.hikari.HikariDataSource
    driver-class-name: oracle.jdbc.OracleDriver
    url: jdbc:oracle:thin:@0.0.0.0:1521:ORCLCDB
    # 172.17.0.2
    username: SYSTEM
    password: '[VW<Hk$Sna8*Bz-ryC$_KQ38'
    hikari:
      connection-timeout: 20000
      minimum-idle: 5
      maximum-pool-size: 30
      idle-timeout: 3000
      max-lifetime: 120000
      auto-commit: false
```

    _*reosurces/application-test.yml*_
    
```
spring:
  profiles:
    active: test
  datasource:
    jndi-name: sep/jdbcDS
```

  
Repositorio Nomina Educativa Nacional-DGTIC
Modificacion 17/04/2020
