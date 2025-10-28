### objetos clinica oftamologica

***Paciente***

**¿Qué es?**
Persona que acude a la clínica para recibir atención médica relacionada con su visión.

**Atributos (características):**

1. Nombre

2. Edad

3. Documento de identidad

4. Historial médico

5. Fecha de cita

***COMPORTAMIENTO***

**SolicitarCita()**

**ConsultarDiagnóstico()**

**ActualizarDatos()**

**PagarConsulta()**

***Médico Oftalmólogo*** 

**¿Qué es?**
Profesional especializado en el diagnóstico y tratamiento de enfermedades oculares.

**Atributos:**

1. Nombre

2. Número de licencia médica

3. Especialidad

4. Horario de atención

5. Lista de pacientes asignados

***COMPORTAMIENTO***

**DiagnosticarPaciente()**

**PrescribirTratamiento()**

**RegistrarConsulta()**

**RevisarHistorial()**

 ***Cita Médica***

**¿Qué es?**
Encuentro programado entre el paciente y el oftalmólogo para revisión o tratamiento.

**Atributos:**

1. Fecha

2. Hora

3. Estado (pendiente, realizada, cancelada)

4. Consultorio asignado

5. Paciente y médico asociados

***COMPORTAMIENTO***

1. Programar()

2. Cancelar()

3. Confirmar()

4. ActualizarEstado()

***Historia Clínica***

**¿Qué es?**
Registro médico donde se almacenan los datos de salud, diagnósticos y tratamientos del paciente.

**Atributos:**

1. ID de historia

2. Datos del paciente

3. Diagnósticos

4. Tratamientos

5. Fecha de actualización

***COMPORTAMIENTO***

1. AgregarDiagnóstico()

2. RegistrarTratamiento()

3. ConsultarHistorial()

4. ActualizarDatos()

***Equipo Oftalmológico***

**¿Qué es?**
Conjunto de instrumentos y dispositivos usados para realizar exámenes oculares.

**Atributos:**

1. Tipo de equipo (refractómetro, lámpara de hendidura, tonómetro, etc.)

2. Código de identificación

3. Estado (activo, en mantenimiento)

4. Fecha de calibracion

****COMPORTAMIENTO***

1. RealizarExamen()

2. Calibrar()

3. ReportarFalla()

4. ActualizarEstado()