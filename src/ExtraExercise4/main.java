package ExtraExercise4;

import java.util.ArrayList;
import java.util.Arrays;

//Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
//la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
//tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
//información debe gestionar esta aplicación:
//• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
//identificación y su estado civil.
//• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
//incorporación a la facultad y qué número de despacho tienen asignado.
//• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
//matriculados.
//• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
//pertenecen (lenguajes, matemáticas, arquitectura, ...).
//• Sobre el personal de servicio, hay que conocer a qué sección están asignados
//(biblioteca, decanato, secretaría, ...).
//El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
//continuación, debe programar las clases definidas en las que, además de los constructores,
//hay que desarrollar los métodos correspondientes a las siguientes operaciones:
//• Cambio del estado civil de una persona.
//• Reasignación de despacho a un empleado.
//• Matriculación de un estudiante en un nuevo curso.
//• Cambio de departamento de un profesor.
//• Traslado de sección de un empleado del personal de servicio.
//• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
public class main {

	public static void main(String[] args) {
		Profesor profe1 = new Profesor("Javier","Solis","10145","soltero","10 Agosto 2023","1203","Arquitectura");
		System.out.println("El estado civil del profesor es: "+ profe1.getEstadoCivil());
		profe1.setEstadoCivil("Casado");
		System.out.println("El estado civil del profesor es: "+ profe1.getEstadoCivil());
		System.out.println("El despacho del profesor es: "+ profe1.getDespacho());
		profe1.setDespacho("1407");
		System.out.println("El despacho del profesor es: "+ profe1.getDespacho());
		ArrayList<String> cursos = new ArrayList<>();
		Estudientes estudiante1 = new Estudientes("Daniel", "Betancur", "10172", "Soltero", cursos);
		System.out.println(Arrays.toString(estudiante1.getCurso().toArray()));
		estudiante1.matricularCursos("Geografia");
		System.out.println(Arrays.toString(estudiante1.getCurso().toArray()));
		System.out.println("El departamento del profesor es: "+profe1.getDepartamento());
		profe1.setDepartamento("Lenguas");
		System.out.println("El departamento del profesor es: "+profe1.getDepartamento());
		
	}
}
