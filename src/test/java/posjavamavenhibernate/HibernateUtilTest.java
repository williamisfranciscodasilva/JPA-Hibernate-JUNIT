package posjavamavenhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class HibernateUtilTest {
	@Test
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
	}
	@Test
	public void testeBuscar() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setId(4L);
		pessoa = daoGeneric.pesquisar(pessoa);
		System.out.println(pessoa);
	}
}
