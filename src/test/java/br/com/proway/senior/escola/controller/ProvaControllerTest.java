package br.com.proway.senior.escola.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import br.com.proway.senior.escola.model.Aluno;
import br.com.proway.senior.escola.model.Materia;
import br.com.proway.senior.escola.model.Prova;
public class ProvaControllerTest {

	static ProvaController controller;
	
	Aluno aluno = new Aluno();
	Integer periodo = 202105;
	static Materia materia = new Materia(); 
	
	@After
	public void limparArray() {
		controller.removeAll();
	}
		
	@Ignore
	public void testProvaControllerProva() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddProva() {
		Prova prova = new Prova(periodo, aluno, materia);
		controller = new ProvaController(prova);
		controller.addProva();
		assertEquals(1, controller.getAll().size());
	}

	@Test
	public void testRemoveProva() {
		Prova prova = new Prova(periodo, aluno, materia);
		controller = new ProvaController(prova);
		controller.addProva();
		controller.removeProva();
		assertEquals(0, controller.getAll().size());
	}

	@Test
	public void testGet() {
		Prova prova = new Prova(periodo, aluno, materia);
		controller = new ProvaController(prova);
	}

}
