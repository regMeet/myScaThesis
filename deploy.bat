@echo off
set tesisLast=%CD%
rem pushd %cd%
set RUN="Run"
set alumnos=alumnos\target\alumnos-1.0.jar
set datosAlumno="datos-alumno\target\datos-alumno-1.0.jar"
set guaraniBD="guaraniBD\target\guaraniBD-1.0.jar"

@echo on
copy %alumnos% %RUN%\alumnos
copy %datosAlumno% %RUN%\datos-alumno
copy %guaraniBD% %RUN%\lib

@echo off
echo Termino

echo starting services
cd %RUN%
start %RUN%\runAll.bat

chdir /d %tesisLast% &rem restore current directory
rem popd