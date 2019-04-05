package posjavamavenhibernate;

import java.util.List;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class HibernateUtilTest {
/*	@Test
	public void testeHibernateUtil() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setIdade(34);
		pessoa.setLogin("teste6");
		pessoa.setNome("Ana Paula da Silva");
		pessoa.setSobrenome("Lins");
		pessoa.setEmail("apaulaslins2@gmail.com");
		pessoa.setSenha("789");
		daoGeneric.salvar(pessoa);
	}*/
	/*@Test
	public void testeBuscar() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setId(4L);
		pessoa = daoGeneric.pesquisar(pessoa);
		System.out.println(pessoa);
	}*/
	/*@Test
	public void testeUpdate() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = daoGeneric.pesquisar2(2L, UsuarioPessoa.class);
		pessoa.setIdade(88);
		pessoa.setNome("Nome atualizado no hibernate");
		pessoa = daoGeneric.updateMerge(pessoa);
		System.out.println(pessoa);
	}*/
	/*@Test
	public void testeDelete() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = daoGeneric.pesquisar2(2L, UsuarioPessoa.class);
		daoGeneric.deletarPorId(pessoa);
	}*/
	/*@Test
	public void testeConsultar() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		List<UsuarioPessoa> list = daoGeneric.listar(UsuarioPessoa.class);
		for(UsuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
			System.out.println("------------------------------------------------");
		}
	}*/
	@Test
	public void testQueryList() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		List<UsuarioPessoa> list = daoGeneric.getEntityManager().createQuery(
				"from UsuarioPessoa").getResultList();
		for(UsuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
			System.out.println("------------------------------------------------");
		}
	}
}
