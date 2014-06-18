Url:
http://principal:8080/services/PersonalDataService?wsdl

Run in a cmd (windows console)

Run datos-alumno
java -cp ..\lib\tuscany-sca-manifest.jar;lib\ifxjdbc.jar;..\lib\guaraniBD-1.0.jar;datos-alumno\datos-alumno-1.0.jar server.DatosPersonalesServer

Run alumnos
java -cp ..\lib\tuscany-sca-manifest.jar;alumnos\alumnos-1.0.jar server.AlumnoServer
